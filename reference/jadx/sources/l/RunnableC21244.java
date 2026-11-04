package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC21244 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67782;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67783;

    public /* synthetic */ RunnableC21244(int i, Object obj) {
        this.f67782 = i;
        this.f67783 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f67782;
        Object obj = this.f67783;
        switch (i) {
            case 0:
                C6679.m18695(((View) obj).findViewById(R.id.MT_Protector));
                break;
            case 1:
                ((C11757) obj).showDropDown();
                break;
            case 2:
                ((ActivityC24582) obj).finish();
                break;
            case 3:
                ((C25350) obj).m24163(new C1806(1));
                break;
            default:
                ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673 = (ViewOnLayoutChangeListenerC6673) obj;
                int i2 = ViewOnLayoutChangeListenerC6673.f22246;
                if (C20340.f65260) {
                    DialogInterfaceOnClickListenerC12983.m32395(viewOnLayoutChangeListenerC6673, "term_api29_limit", viewOnLayoutChangeListenerC6673.getString(R.string.MT_Protector), true);
                }
                viewOnLayoutChangeListenerC6673.runOnUiThread(new RunnableC6235(2, viewOnLayoutChangeListenerC6673, new RunnableC16899(6, viewOnLayoutChangeListenerC6673)));
                break;
        }
    }
}
