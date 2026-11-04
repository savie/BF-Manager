package l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.᩻᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC25319 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81779;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81780;

    public /* synthetic */ ViewOnClickListenerC25319(int i, Object obj) {
        this.f81779 = i;
        this.f81780 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f81779) {
            case 0:
                ((ViewOnLayoutChangeListenerC6673) this.f81780).f22251.setVisibility(8);
                break;
            case 1:
                RadioButton[] radioButtonArr = (RadioButton[]) this.f81780;
                int length = radioButtonArr.length;
                for (int i = 0; i < length; i++) {
                    RadioButton radioButton = radioButtonArr[i];
                    radioButton.setChecked(radioButton == view);
                }
                break;
            case 2:
                AbstractViewOnClickListenerC20437.m46869((AbstractViewOnClickListenerC20437) this.f81780);
                break;
            case 3:
                ActivityC7135.m19685((ActivityC7135) this.f81780, view);
                break;
            default:
                ActivityC22359.m50428((ActivityC22359) this.f81780);
                break;
        }
    }
}
