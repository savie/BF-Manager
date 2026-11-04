package l;

import android.view.View;
import android.widget.RadioButton;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۘ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4425 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15879;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15880;

    public /* synthetic */ ViewOnClickListenerC4425(int i, Object obj) {
        this.f15879 = i;
        this.f15880 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f15879;
        Object obj = this.f15880;
        switch (i) {
            case 0:
                int i2 = ViewOnClickListenerC19341.f62462;
                ((ViewOnClickListenerC19341) obj).finish();
                break;
            case 1:
                RadioButton[] radioButtonArr = (RadioButton[]) obj;
                int length = radioButtonArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    RadioButton radioButton = radioButtonArr[i3];
                    radioButton.setChecked(view == radioButton);
                }
                break;
            case 2:
                C0938.m3742((AbstractActivityC17204) obj, view).mo21878();
                break;
            case 3:
                int i4 = ActivityC15974.f51857;
                ((ActivityC15974) obj).finish();
                break;
            case 4:
                C0107 c0107 = ActivityC21369.f68056;
                ((ActivityC21369) obj).finish();
                break;
            default:
                ((SearchView) obj).lambda$setUpBackButton$1(view);
                break;
        }
    }
}
