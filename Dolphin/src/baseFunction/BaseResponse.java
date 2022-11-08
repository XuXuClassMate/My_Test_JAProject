package baseFunction;

import cn.hutool.json.JSONUtil;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
class BaseResponse {
    private int code;

    private String msg;

    private String data;

    private <T> T getDataInstance(Class<?> aClass) {
        return (T) JSONUtil.toBean(data, aClass);
    }
}
