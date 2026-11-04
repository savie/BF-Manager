package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.᩸᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23087 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74872;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74873;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f74874;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74875;

    public /* synthetic */ ViewOnClickListenerC23087(Object obj, KeyEvent.Callback callback, Object obj2, int i) {
        this.f74873 = i;
        this.f74875 = obj;
        this.f74874 = callback;
        this.f74872 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74873) {
            case 0:
                C24720 c24720 = (C24720) this.f74875;
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) this.f74874;
                DialogInterfaceC8327[] dialogInterfaceC8327Arr = (DialogInterfaceC8327[]) this.f74872;
                if (c24720.m55199()) {
                    C23065.m51972(abstractActivityC17204, new RunnableC1107(0, dialogInterfaceC8327Arr));
                }
                break;
            default:
                RadioButton radioButton = (RadioButton) this.f74875;
                RadioButton radioButton2 = (RadioButton) this.f74874;
                C23255 c23255 = (C23255) this.f74872;
                radioButton.setChecked(view == radioButton);
                radioButton2.setChecked(view == radioButton2);
                c23255.setEnabled(view == radioButton2);
                break;
        }
    }
}
