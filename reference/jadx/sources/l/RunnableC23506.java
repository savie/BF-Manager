package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩻ۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23506 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76093;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76094;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76095;

    public /* synthetic */ RunnableC23506(int i, Object obj, Object obj2) {
        this.f76094 = i;
        this.f76095 = obj;
        this.f76093 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f76094) {
            case 0:
                ((TextView) this.f76095).setText((String) this.f76093);
                break;
            case 1:
                C13710.m33418((C13710) this.f76095, this.f76093);
                break;
            default:
                C17573 c17573 = (C17573) this.f76095;
                C21825 c21825 = (C21825) this.f76093;
                c17573.getClass();
                C6171.m17176(c21825.m48596() == C17573.m40853(c21825).m48596());
                break;
        }
    }
}
