package cn.microboat.mapper;

import cn.microboat.pojo.entity.Student;
import cn.microboat.pojo.vo.StudentVo;
import cn.microboat.mapper.converter.StudentMapperConverter;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * componentModel = "spring" 表示以 spring 框架的方式引入 component，会在实现类上加上 @component 注解
 * uses = StudentMapperConverter.class 表示使用 StudentMapperConverter 类中的方法作为属性转换的方法
 * unmappedSourcePolicy = ReportingPolicy.IGNORE 表示对未映射到的来源属性忽略
 * unmappedTargetPolicy = ReportingPolicy.IGNORE 表示对未映射到的目标属性忽略
 *
 * @author zhouwei
 */
@Mapper(
        componentModel = "spring",
        uses = StudentMapperConverter.class,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface StudentMapper extends BasicMapper<Student, StudentVo> {
}
