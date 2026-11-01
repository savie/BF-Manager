package l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ܳ᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC14803 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48394;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f48395;

    public /* synthetic */ ViewOnClickListenerC14803(int i, Object obj) {
        this.f48394 = i;
        this.f48395 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f48394;
        Object obj = this.f48395;
        switch (i) {
            case 0:
                C6936.m18612((C6936) obj);
                break;
            case 1:
                ViewOnClickListenerC0744.m3228((ViewOnClickListenerC0744) obj);
                break;
            case 2:
                RadioButton[] radioButtonArr = (RadioButton[]) obj;
                int length = radioButtonArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    RadioButton radioButton = radioButtonArr[i2];
                    radioButton.setChecked(radioButton == view);
                }
                break;
            case 3:
                int i3 = ActivityC20908.f67939;
                ((ActivityC20908) obj).finish();
                break;
            default:
                ViewOnClickListenerC8374.m21960((ViewOnClickListenerC8374) obj);
                break;
        }
    }
}
