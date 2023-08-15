package barbosa.carlos.galeriapublica;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import kotlin.contracts.Returns;

public class MainViewModel extends AndroidViewModel {
    int navigationOpSelected = R.id.gridViewOP;

    public MainViewModel(@NonNull Application application){
        super(application);
    }
    public int getNavigationOpSelected(){
        return navigationOpSelected;
    }
    public void setNavigationOpSelected(int navigationOpSelected){
        this.navigationOpSelected = navigationOpSelected;
    }
}
