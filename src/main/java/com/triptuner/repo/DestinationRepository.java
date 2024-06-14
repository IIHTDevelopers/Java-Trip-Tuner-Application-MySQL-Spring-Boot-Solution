package com.triptuner.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triptuner.entity.Destination;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {

	// Find destinations by the itinerary ID
	List<Destination> findByItineraryId(Long itineraryId);

	// Find a destination by its ID and itinerary ID
	List<Destination> findByIdAndItineraryId(Long id, Long itineraryId);

	// Search destinations within an itinerary by name
	List<Destination> findByItineraryIdAndNameContainingIgnoreCase(Long itineraryId, String name);

	// Filter destinations within an itinerary by type
	List<Destination> findByItineraryIdAndType(Long itineraryId, String type);
}
