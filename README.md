# BÀI THỰC HÀNH A8 – FRAGMENT

## 1. Thông tin sinh viên

| Thông tin | Nội dung |
|---|---|
| Họ và tên | Nguyễn Thị Hồng Thắm |
| MSSV | 241A010134 |
| Lớp | CNTT – LTDD |
| Trường | Đại học Văn Hiến |
| Bài thực hành | A8 – Fragment |

## 2. Giới thiệu

Ứng dụng được xây dựng nhằm thực hành cách sử dụng Fragment trong Android. Ứng dụng tổ chức giao diện thành nhiều màn hình độc lập, hỗ trợ chuyển đổi giữa các Fragment và quản lý vòng đời của chúng.

## 3. Chức năng chính

- **Home:** Hiển thị màn hình trang chủ.
- **News:** Hiển thị danh sách tin tức và mở màn hình chi tiết.
- **Profile:** Hiển thị thông tin hồ sơ.

Ứng dụng sử dụng `BottomNavigationView` để chuyển đổi giữa ba mục Home, News và Profile.

## 4. Kiến thức áp dụng

- Tạo và sử dụng Fragment.
- Quản lý Fragment bằng `FragmentManager` và `FragmentTransaction`.
- Truyền dữ liệu giữa các Fragment bằng `Bundle`.
- Sử dụng Fragment Result API để gửi kết quả.
- Quản lý Back Stack khi chuyển màn hình.
- Theo dõi vòng đời Fragment.

## 5. Bài nâng cao

### NC2 – Chia sẻ dữ liệu bằng ViewModel

Sử dụng `SharedViewModel` kế thừa từ `ViewModel` để chia sẻ dữ liệu giữa các Fragment thông qua Activity.

- Sử dụng `MutableLiveData` để lưu tiêu đề tin đã đọc.
- Sử dụng `LiveData` để quan sát sự thay đổi dữ liệu.
- Sử dụng `ViewModelProvider(requireActivity())` để lấy ViewModel dùng chung.
- Khi người dùng đánh dấu tin đã đọc, danh sách tin cập nhật tiêu đề tương ứng.

### NC4 – Hiệu ứng chuyển cảnh Fragment

Sử dụng `setCustomAnimations()` trong `FragmentTransaction` để tạo hiệu ứng chuyển đổi màn hình.

Các hiệu ứng được sử dụng:

- `slide_in.xml`: Trượt vào.
- `fade_out.xml`: Mờ dần ra.
- `fade_in.xml`: Mờ dần vào.
- `slide_out.xml`: Trượt ra.

## 6. Cấu trúc dự án

```text
A8/
├── app/
│   └── src/
│       ├── main/
│       │   ├── java/vn/edu/vhu/ltdd/a8fragment/
│       │   │   ├── MainActivity.java
│       │   │   ├── HomeFragment.java
│       │   │   ├── NewsListFragment.java
│       │   │   ├── NewsDetailFragment.java
│       │   │   ├── ProfileFragment.java
│       │   │   └── SharedViewModel.java
│       │   └── res/
│       │       ├── anim/
│       │       ├── layout/
│       │       ├── menu/
│       │       └── values/
│       └── test/
├── gradle/
├── .gitignore
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 7. Hướng dẫn chạy ứng dụng

1. Mở Android Studio.
2. Chọn Open và mở thư mục dự án A8.
3. Chờ Gradle Sync hoàn tất.
4. Khởi động Android Emulator hoặc kết nối thiết bị Android.
5. Nhấn Run để chạy ứng dụng.

## 8. Kiểm thử

- Kiểm tra chuyển đổi giữa Home, News và Profile.
- Mở một tin tức và kiểm tra màn hình chi tiết.
- Nhấn nút đánh dấu đã đọc và kiểm tra dữ liệu được cập nhật.
- Kiểm tra nút Back và Back Stack.
- Kiểm tra hiệu ứng chuyển cảnh khi mở và đóng màn hình chi tiết.
- Xoay thiết bị để quan sát vòng đời Fragment.

## 9. Công nghệ sử dụng

- Java
- XML
- Android Studio
- AndroidX Fragment
- AndroidX Lifecycle ViewModel và LiveData
- Material Components

## 10. Lịch sử Git

| Commit | Nội dung |
|---|---|
| A8: Khoi tao | Khởi tạo bài thực hành |
| A8: NC2 | Giữ trạng thái bằng ViewModel |
| A8: NC4 | Thêm hiệu ứng chuyển cảnh Fragment |
| docs: README | Bổ sung tài liệu dự án |
