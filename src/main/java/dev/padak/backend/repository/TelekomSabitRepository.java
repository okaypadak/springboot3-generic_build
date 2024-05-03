package dev.padak.backend.repository;

import dev.padak.backend.entity.TalimatEntity;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TelekomSabitRepository extends BaseRepository {

}
