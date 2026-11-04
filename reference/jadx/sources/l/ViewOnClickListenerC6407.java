package l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۛ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC6407 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21612;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21613;

    public /* synthetic */ ViewOnClickListenerC6407(int i, Object obj) {
        this.f21612 = i;
        this.f21613 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f21612;
        Object obj = this.f21613;
        switch (i) {
            case 0:
                ((ActivityC22597) obj).m50921();
                break;
            case 1:
                C13132.m32641((C13132) obj);
                break;
            case 2:
                RadioButton[] radioButtonArr = (RadioButton[]) obj;
                int length = radioButtonArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    RadioButton radioButton = radioButtonArr[i2];
                    radioButton.setChecked(view == radioButton);
                }
                break;
            default:
                int i3 = AbstractC19594.f63171;
                ((C10043) obj).m27405();
                break;
        }
    }
}
