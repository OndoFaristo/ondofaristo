;Language: Vietnamese (1066)
;By Clytie Siddall

!insertmacro LANGFILE "Vietnamese" "Tiếng Việt"

!ifdef MUI_WELCOMEPAGE
  ${LangFileString} MUI_TEXT_WELCOME_INFO_TITLE "Chào mừng đến với trình Thiết Lập $(^NameDA)"
  ${LangFileString} MUI_TEXT_WELCOME_INFO_TEXT "Thiết lập này sẽ hướng dẫn bạn qua tiến trình cài đặt $(^NameDA).$\r$\n$\r$\nKhuyên bạn đóng các ứng dụng khác trước khi khởi chạy chương trình Thiết Lập. Vì vậy có thể cập nhật các tập tin hệ thống liên quan mà không cần khởi động lại máy tính.$\r$\n$\r$\n$_CLICK"
!endif

!ifdef MUI_UNWELCOMEPAGE
  ${LangFileString} MUI_UNTEXT_WELCOME_INFO_TITLE "Chào mừng đến với trình Huỷ Cài Đặt $(^NameDA)"
  ${LangFileString} MUI_UNTEXT_WELCOME_INFO_TEXT "Thiết lập này sẽ hướng dẫn bạn qua tiến trình huỷ cài đặt $(^NameDA).$\r$\n$\r$\nTrước khi khởi chạy tiến trình huỷ cài đặt, kiểm tra xem $(^NameDA) không đang chạy.$\r$\n$\r$\n$_CLICK"
!endif

!ifdef MUI_LICENSEPAGE
  ${LangFileString} MUI_TEXT_LICENSE_TITLE "Thỏa Thuận Cấp Phép"
  ${LangFileString} MUI_TEXT_LICENSE_SUBTITLE "Xem lại các điều kiện cấp phép trước khi cài đặt $(^NameDA)."
  ${LangFileString} MUI_INNERTEXT_LICENSE_BOTTOM "Nếu bạn đồng ý với tất cả các điều kiện này, nhấn vào nút « Đồng ý » để tiếp tục. Để cài đặt $(^NameDA), người dùng phải đồng ý với các điều kiện này."
  ${LangFileString} MUI_INNERTEXT_LICENSE_BOTTOM_CHECKBOX "Nếu bạn đồng ý với tất cả các điều kiện này, nhấn vào hộp chọn dưới đây. Để cài đặt $(^NameDA), người dùng phải đồng ý với các điều kiện này. $_CLICK"
  ${LangFileString} MUI_INNERTEXT_LICENSE_BOTTOM_RADIOBUTTONS "Nếu bạn đồng ý với tất cả các điều kiện này, bật tùy chọn đầu tiên dưới đây. Để cài đặt $(^NameDA), người dùng phải đồng ý với các điều kiện này. $_CLICK"
!endif

!ifdef MUI_UNLICENSEPAGE
  ${LangFileString} MUI_UNTEXT_LICENSE_TITLE "Thỏa Thuận Cấp Phép"
  ${LangFileString} MUI_UNTEXT_LICENSE_SUBTITLE "Xem lại các điều kiện cấp phép trước khi huỷ cài đặt $(^NameDA)."
  ${LangFileString} MUI_UNINNERTEXT_LICENSE_BOTTOM "Nếu bạn đồng ý với tất cả các điều kiện này, nhấn vào nút « Đồng ý » để tiếp tục. Để huỷ cài đặt $(^NameDA), người dùng phải đồng ý với các điều kiện này."
  ${LangFileString} MUI_UNINNERTEXT_LICENSE_BOTTOM_CHECKBOX "Nếu bạn đồng ý với tất cả các điều kiện này, nhấn vào hộp chọn dưới đây. Để huỷ cài đặt $(^NameDA), người dùng phải đồng ý với các điều kiện này. $_CLICK"
  ${LangFileString} MUI_UNINNERTEXT_LICENSE_BOTTOM_RADIOBUTTONS "Nếu bạn đồng ý với tất cả các điều kiện này, bật tùy chọn đầu tiên dưới đây. Để huỷ cài đặt $(^NameDA), người dùng phải đồng ý với các điều kiện này. $_CLICK"
!endif

!ifdef MUI_LICENSEPAGE | MUI_UNLICENSEPAGE
  ${LangFileString} MUI_INNERTEXT_LICENSE_TOP "Bấm phím Page Down (xuống trang) để xem phần còn lại của các điều kiện cấp phép."
!endif

!ifdef MUI_COMPONENTSPAGE
  ${LangFileString} MUI_TEXT_COMPONENTS_TITLE "Chọn Thành Phần"
  ${LangFileString} MUI_TEXT_COMPONENTS_SUBTITLE "Chọn những thành phần của $(^NameDA) bạn muốn cài đặt."
  ${LangFileString} MUI_INNERTEXT_COMPONENTS_DESCRIPTION_TITLE "Mô tả"
!endif

!ifdef MUI_UNCOMPONENTSPAGE
  ${LangFileString} MUI_UNTEXT_COMPONENTS_TITLE "Chọn Thành Phần"
  ${LangFileString} MUI_UNTEXT_COMPONENTS_SUBTITLE "Chọn những thành phần của $(^NameDA) bạn muốn huỷ cài đặt."
!endif

!ifdef MUI_COMPONENTSPAGE | MUI_UNCOMPONENTSPAGE
  !ifndef NSIS_CONFIG_COMPONENTPAGE_ALTERNATIVE
    ${LangFileString} MUI_INNERTEXT_COMPONENTS_DESCRIPTION_INFO "Di chuyển con chuột ở trên một thành phần nào đó để xem mô tả về nó."
  !else
    ${LangFileString} MUI_INNERTEXT_COMPONENTS_DESCRIPTION_INFO "Di chuyển con chuột ở trên một thành phần nào đó để xem mô tả về nó."
  !endif
!endif

!ifdef MUI_DIRECTORYPAGE
  ${LangFileString} MUI_TEXT_DIRECTORY_TITLE "Chọn Vị Trí Cài Đặt"
  ${LangFileString} MUI_TEXT_DIRECTORY_SUBTITLE "Chọn thư mục vào đó cần cài đặt $(^NameDA)."
!endif

!ifdef MUI_UNDIRECTORYSPAGE
  ${LangFileString} MUI_UNTEXT_DIRECTORY_TITLE "Chọn Vị Trí Huỷ Cài Đặt"
  ${LangFileString} MUI_UNTEXT_DIRECTORY_SUBTITLE "Chọn thư mục khỏi đó cần huỷ cài đặt $(^NameDA)."
!endif

!ifdef MUI_INSTFILESPAGE
  ${LangFileString} MUI_TEXT_INSTALLING_TITLE "Đang Cài Đặt"
  ${LangFileString} MUI_TEXT_INSTALLING_SUBTITLE "Hãy đợi trong khi $(^NameDA) đang được cài đặt."
  ${LangFileString} MUI_TEXT_FINISH_TITLE "Cài Đặt Hoàn Tất"
  ${LangFileString} MUI_TEXT_FINISH_SUBTITLE "Đã hoàn tất thành công tiến trình Thiết Lập."
  ${LangFileString} MUI_TEXT_ABORT_TITLE "Cài Đặt Bị Hủy Bỏ"
  ${LangFileString} MUI_TEXT_ABORT_SUBTITLE "Đã không hoàn tất thành công tiến trình Thiết Lập."
!endif

!ifdef MUI_UNINSTFILESPAGE
  ${LangFileString} MUI_UNTEXT_UNINSTALLING_TITLE "Đang Huỷ Cài Đặt"
  ${LangFileString} MUI_UNTEXT_UNINSTALLING_SUBTITLE "Hãy đợi trong khi $(^NameDA) đang được huỷ cài đặt."
  ${LangFileString} MUI_UNTEXT_FINISH_TITLE "Huỷ Cài Đặt Hoàn Tất"
  ${LangFileString} MUI_UNTEXT_FINISH_SUBTITLE "Đã hoàn tất thành công tiến trình hủy cài đặt."
  ${LangFileString} MUI_UNTEXT_ABORT_TITLE "Huỷ Cài Đặt Bị Hủy Bỏ"
  ${LangFileString} MUI_UNTEXT_ABORT_SUBTITLE "Đã không hoàn tất thành công tiến trình hủy cài đặt."
!endif

!ifdef MUI_FINISHPAGE
  ${LangFileString} MUI_TEXT_FINISH_INFO_TITLE "Đang Hoàn Tất Thiết Lập $(^NameDA)"
  ${LangFileString} MUI_TEXT_FINISH_INFO_TEXT "$(^NameDA) đã được cài đặt vào máy tính này.$\r$\n$\r$\nNhấn vào nút « Kết thúc » để đóng Thiết Lập."
  ${LangFileString} MUI_TEXT_FINISH_INFO_REBOOT "Máy tính này cần phải được khởi động lại để hoàn tất tiến trình cài đặt $(^NameDA). Muốn khởi động lại ngay bây giờ không?"
!endif

!ifdef MUI_UNFINISHPAGE
  ${LangFileString} MUI_UNTEXT_FINISH_INFO_TITLE "Đang Hoàn Tất Huỷ Cài Đặt $(^NameDA)"
  ${LangFileString} MUI_UNTEXT_FINISH_INFO_TEXT "$(^NameDA) đã được huỷ cài đặt khỏi máy tính này.$\r$\n$\r$\nNhấn vào nút « Kết thúc » để đóng Thiết Lập."
  ${LangFileString} MUI_UNTEXT_FINISH_INFO_REBOOT "Máy tính này cần phải được khởi động lại để hoàn tất tiến trình huỷ cài đặt $(^NameDA). Muốn khởi động lại ngay bây giờ không?"
!endif

!ifdef MUI_FINISHPAGE | MUI_UNFINISHPAGE
  ${LangFileString} MUI_TEXT_FINISH_REBOOTNOW "Khởi động lại ngay bây giờ"
  ${LangFileString} MUI_TEXT_FINISH_REBOOTLATER "Muốn khởi động lại thủ công về sau"
  ${LangFileString} MUI_TEXT_FINISH_RUN "&Chạy $(^NameDA)"
  ${LangFileString} MUI_TEXT_FINISH_SHOWREADME "&Hiện tài liệu Đọc Đi"
  ${LangFileString} MUI_BUTTONTEXT_FINISH "&Kết thúc"  
!endif

!ifdef MUI_STARTMENUPAGE
  ${LangFileString} MUI_TEXT_STARTMENU_TITLE "Chọn Thư Mục Trình Đơn Start"
  ${LangFileString} MUI_TEXT_STARTMENU_SUBTITLE "Chọn một thư mục kiểu trình đơn Start cho các liên kết nhanh của $(^NameDA)."
  ${LangFileString} MUI_INNERTEXT_STARTMENU_TOP "Hãy chọn thư mục kiểu trình đơn Start trong đó bạn muốn tạo các liên kết khởi chạy trực tiếp của chương trình này. Cũng có thể nhập tên để tạo một thư mục mới."
  ${LangFileString} MUI_INNERTEXT_STARTMENU_CHECKBOX "Không tạo liên kết nhanh"
!endif

!ifdef MUI_UNCONFIRMPAGE
  ${LangFileString} MUI_UNTEXT_CONFIRM_TITLE "Huỷ Cài Đặt $(^NameDA)"
  ${LangFileString} MUI_UNTEXT_CONFIRM_SUBTITLE "Xoá $(^NameDA) khỏi máy tính này."
!endif

!ifdef MUI_ABORTWARNING
  ${LangFileString} MUI_TEXT_ABORTWARNING "Bạn có chắc muốn thoát khỏi tiến trình Thiết Lập $(^Name) không?"
!endif

!ifdef MUI_UNABORTWARNING
  ${LangFileString} MUI_UNTEXT_ABORTWARNING "Bạn có chắc muốn thoát khỏi tiến trình huỷ cài đặt $(^Name) không?"
!endif

!ifdef MULTIUSER_INSTALLMODEPAGE
  ${LangFileString} MULTIUSER_TEXT_INSTALLMODE_TITLE "Chọn Người Dùng"
  ${LangFileString} MULTIUSER_TEXT_INSTALLMODE_SUBTITLE "Chọn những người dùng cho họ cần cài đặt $(^NameDA)."
  ${LangFileString} MULTIUSER_INNERTEXT_INSTALLMODE_TOP "Hãy chọn nếu bạn muốn cài đặt $(^NameDA) chỉ cho mình hoặc cho tất cả các người dùng trên máy tính này $(^ClickNext)"
  ${LangFileString} MULTIUSER_INNERTEXT_INSTALLMODE_ALLUSERS "Cài đặt cho mọi người"
  ${LangFileString} MULTIUSER_INNERTEXT_INSTALLMODE_CURRENTUSER "Cài đặt chỉ cho mình"
!endif
