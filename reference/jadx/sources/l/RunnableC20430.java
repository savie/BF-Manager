package l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩶᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BK7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20430 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66222;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66223;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66224;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66225;

    public /* synthetic */ RunnableC20430(Object obj, Object obj2, Object obj3, int i) {
        this.f66223 = i;
        this.f66225 = obj;
        this.f66222 = obj2;
        this.f66224 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f66223;
        Object obj = this.f66224;
        Object obj2 = this.f66222;
        Object obj3 = this.f66225;
        switch (i) {
            case 0:
                ActivityC0673.m3023((ActivityC0673) obj3, (C21111) obj2, (float[]) obj);
                break;
            case 1:
                EditText editText = (EditText) obj2;
                View view = (View) obj;
                int i2 = ActivityC19749.f63457;
                if (((EditText) obj3).getVisibility() == 0 || editText.getVisibility() == 0) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                break;
            default:
                C17573.m40856((C17573) obj3, (C4603) obj2, (AbstractC5930) obj);
                break;
        }
    }
}
