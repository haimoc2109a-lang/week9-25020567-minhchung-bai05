# Bài 5 - JaCoCo

`jacoco-maven-plugin` chạy `prepare-agent` trước test, tạo báo cáo trong pha `verify`, rồi kiểm tra **LINE / COVEREDRATIO >= 0.80**. Dưới ngưỡng, `mvn verify` trả mã lỗi. Báo cáo: `target/site/jacoco/index.html`.

Workflow GitHub Actions thực thi `mvn -B clean verify` và lưu toàn bộ thư mục báo cáo bằng upload-artifact. Muốn kiểm chứng cơ chế fail, có thể tạm thêm các nhánh mã nguồn chưa được kiểm thử để tỷ lệ dòng được bao phủ xuống dưới 80%, chạy `mvn verify`, rồi khôi phục thay đổi. Không khai báo số coverage cụ thể nếu chưa có log chạy thực tế.
