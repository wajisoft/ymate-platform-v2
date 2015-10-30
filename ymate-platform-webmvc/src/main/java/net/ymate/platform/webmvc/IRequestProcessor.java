/*
 * Copyright 2007-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ymate.platform.webmvc;

import java.util.Map;

/**
 * 控制器请求处理器接口
 *
 * @author 刘镇 (suninformation@163.com) on 2013年9月13日 下午6:27:57
 * @version 1.0
 */
public interface IRequestProcessor {

    /**
     * 分析请求协议内容
     *
     * @param owner            Owner
     * @param requestMeta      请求元描述
     * @param methodParamNames 方法参数名称
     * @return 返回请求的参数映射
     * @throws Exception 可能产生的异常
     */
    public Map<String, ParameterMeta> processRequestParams(IWebMvc owner, RequestMeta requestMeta, String[] methodParamNames) throws Exception;

    public class ParameterMeta {
        String paramName;

        String fieldName;

        Object value;

        public ParameterMeta(String paramName, String fieldName, Object value) {
            this.paramName = paramName;
            this.fieldName = fieldName;
            this.value = value;
        }

        public String getParamName() {
            return paramName;
        }

        public void setParamName(String paramName) {
            this.paramName = paramName;
        }

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }
}
