package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.GymModel;

import jakarta.transaction.Transactional;

public interface GymRepository extends JpaRepository<GymModel, Integer> {
	@Query(value="select * from GymModel ",nativeQuery=true)
	public List<GymModel> getAllData();

	@Query(value="select * from GymModel where custnum=:id",nativeQuery=true)
	public List<GymModel> bycustnum (@Param("id")int id);

	@Query(value="select * from GymModel where custnum between :start and :end",nativeQuery=true)
	public List<GymModel> startEnd(@Param("start") int start,@Param("end")int end);

	@Modifying
	@Transactional
	@Query(value="delete from GymModel where custnum=?1 and custname=?2",nativeQuery = true)
	Integer deleteD(@Param("id") int pid,@Param ("name") String pname);

	@Modifying
	@Transactional
	@Query(value="update GymModel set custnum=:pid where custnum=:pname",nativeQuery=true)
	public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);
	@Query(value="select c from GymModel c")
    List<GymModel> jpqlQ();
    
    @Query(value="select c from GymModel c where c.custnum=?1")
    public List<GymModel> jqBYCon(@Param ("id")int sid);
}
