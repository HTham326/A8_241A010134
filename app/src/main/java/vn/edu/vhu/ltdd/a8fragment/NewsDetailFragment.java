package vn.edu.vhu.ltdd.a8fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/** Màn hình chi tiết tin, nhận dữ liệu qua arguments (Bundle). */
public class NewsDetailFragment extends Fragment {

    public static final String KEY_TIEU_DE = "key_tieu_de";
    private static final String KEY_NOI_DUNG = "key_noi_dung";
    private static final String TAG = "A8_241A010134/Detail";

    /**
     * Mẫu newInstance: KHÔNG tạo constructor có tham số cho Fragment.
     * Khi hệ thống khôi phục Fragment sau khi xoay máy, nó chỉ gọi constructor rỗng;
     * dữ liệu chỉ sống sót nếu nằm trong arguments.
     */
    public static NewsDetailFragment newInstance(String tieuDe, String noiDung) {
        NewsDetailFragment f = new NewsDetailFragment();
        Bundle args = new Bundle();
        args.putString(KEY_TIEU_DE, tieuDe);
        args.putString(KEY_NOI_DUNG, noiDung);
        f.setArguments(args);
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView – Tạo giao diện chi tiết");
        return inflater.inflate(R.layout.fragment_news_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle args = requireArguments();          // ném lỗi sớm nếu quên setArguments
        String tieuDe = args.getString(KEY_TIEU_DE, "");
        String noiDung = args.getString(KEY_NOI_DUNG, "");

        ((TextView) view.findViewById(R.id.tvTieuDe)).setText(tieuDe);
        ((TextView) view.findViewById(R.id.tvNoiDung)).setText(noiDung);

        Button btnDaDoc = view.findViewById(R.id.btnDaDoc);
        btnDaDoc.setOnClickListener(v -> {
            // Gửi kết quả về Fragment đang lắng nghe rồi tự đóng
            Bundle kq = new Bundle();
            kq.putString(KEY_TIEU_DE, tieuDe);
            getParentFragmentManager().setFragmentResult(NewsListFragment.REQUEST_KEY, kq);
            getParentFragmentManager().popBackStack();   // tương đương bấm nút Back
        });
    }
}
