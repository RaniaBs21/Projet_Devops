package tn.esprit.spring.kaddem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tn.esprit.spring.kaddem.entities.Universite;
import tn.esprit.spring.kaddem.repositories.UniversiteRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class UniversiteRepositoryUnitTest {

    @Mock
    UniversiteRepository universiteRepository;

    @BeforeEach
    void setUp() {
        // Initialiser les mocks
        MockitoAnnotations.openMocks(this);

        // Créer une université à utiliser dans les tests
        Universite universite = new Universite(1, "Esprit");

        // Définir le comportement du mock pour findById
        when(universiteRepository.findById(1)).thenReturn(Optional.of(universite));
    }

    @Test // Annoter la méthode avec @Test
    void testGetUniversiteById() {
        // Appeler la méthode pour récupérer l'université par ID
        Optional<Universite> retrievedUniversite = universiteRepository.findById(1);

        // Vérifier que l'université est présente et que les valeurs sont correctes
        assertNotNull(retrievedUniversite);
        assertEquals("Esprit", retrievedUniversite.get().getNomUniv());
    }
}
