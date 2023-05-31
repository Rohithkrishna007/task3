package rohith.krishna.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rohith.krishna.spring.entity.FileData;

import java.util.Optional;

public interface FileDataRepository extends JpaRepository<FileData,Integer> {
    Optional<FileData> findByName(String fileName);
}
