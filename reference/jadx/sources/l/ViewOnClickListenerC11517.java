package l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۨۛ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11517 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38733;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38734;

    public /* synthetic */ ViewOnClickListenerC11517(int i, Object obj) {
        this.f38733 = i;
        this.f38734 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f38733) {
            case 0:
                ActivityC10957.m27680((ActivityC10957) this.f38734);
                break;
            default:
                RadioButton[] radioButtonArr = (RadioButton[]) this.f38734;
                int length = radioButtonArr.length;
                for (int i = 0; i < length; i++) {
                    RadioButton radioButton = radioButtonArr[i];
                    radioButton.setChecked(view == radioButton);
                }
                break;
        }
    }
}
