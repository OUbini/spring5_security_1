package edu.kosmo.ex.mapper;

import java.sql.Timestamp;
import javax.inject.Inject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import edu.kosmo.ex.vo.EmpVO;

@Mapper
public interface EmpMapper {

	@Select("select * from emp where ename = #{ename}")
	public EmpVO readUser(String name);

}