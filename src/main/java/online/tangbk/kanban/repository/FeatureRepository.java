package online.tangbk.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.tangbk.kanban.entity.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {

}
