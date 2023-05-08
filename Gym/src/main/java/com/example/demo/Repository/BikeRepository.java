package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.BikeModel;

import jakarta.transaction.Transactional;

public interface BikeRepository extends JpaRepository<BikeModel, Integer> {
	@Query(value="select * from bike_model ",nativeQuery=true)
	public List<BikeModel> getAllData();

	@Query(value="select * from bike_model where bikenum=:id",nativeQuery=true)
	public List<BikeModel> bybikenum (@Param("id")int id);

	@Query(value="select * from bike_model where bikenum between :start and :end",nativeQuery=true)
	public List<BikeModel> startEnd(@Param("start") int start,@Param("end")int end);

	@Modifying
	@Transactional
	@Query(value="delete from bike_model where bikenum=?1 and bikename=?2",nativeQuery = true)
	Integer deleteD(@Param("id") int pid,@Param ("name") String pname);

	@Modifying
	@Transactional
	@Query(value="update bike_model set bikenum=:pid where bikename=:pname",nativeQuery=true)
	public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);
	@Query(value="select c from BikeModel c")
    List<BikeModel> jpqlQ();
    
    @Query(value="select c from BikeModel c where c.bikenum=?1")
    public List<BikeModel> jqBYCon(@Param ("id")int sid);
}
