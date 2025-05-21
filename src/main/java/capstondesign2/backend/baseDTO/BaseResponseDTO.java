package capstondesign2.backend.baseDTO;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponseDTO<T> {
    private boolean success;
    private String message;
    private T data;

    // 성공 응답 생성 (데이터 포함)
    public static <T> BaseResponseDTO<T> success(String message, T data) {
        return BaseResponseDTO.<T>builder()
                .success(true)
                .message(message)
                .data(data)
                .build();
    }

    // 성공 응답 생성 (데이터 없음)
    public static <T> BaseResponseDTO<T> success(String message) {
        return BaseResponseDTO.<T>builder()
                .success(true)
                .message(message)
                .build();
    }

    // 실패 응답 생성
    public static <T> BaseResponseDTO<T> fail(String message) {
        return BaseResponseDTO.<T>builder()
                .success(false)
                .message(message)
                .build();
    }


}