package vn.edu.vhu.ltdd.a8fragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class SharedViewModel extends ViewModel {

    private final MutableLiveData<String> tinDaDoc = new MutableLiveData<>("");
    public LiveData<String> getTinDaDoc() {
        return tinDaDoc;
    }

    public void setTinDaDoc(String tieuDe) {
        tinDaDoc.setValue(tieuDe);
    }
}
