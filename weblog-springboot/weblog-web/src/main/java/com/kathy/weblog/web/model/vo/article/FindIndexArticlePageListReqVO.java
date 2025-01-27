package com.kathy.weblog.web.model.vo.article;

import com.kathy.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@ApiModel(value = "首页查询文章分页 VO") //请求参数
public class FindIndexArticlePageListReqVO extends BasePageQuery {

}

