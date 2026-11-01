package l;

import android.text.method.TextKeyListener;

/* JADX INFO: renamed from: l.֨᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1442 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5908;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5909;

    public /* synthetic */ RunnableC1442(int i, Object obj) {
        this.f5908 = i;
        this.f5909 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5908;
        Object obj = this.f5909;
        switch (i) {
            case 0:
                C6111 c6111 = (C6111) obj;
                TextKeyListener textKeyListener = C6111.f20699;
                if (c6111.isFocused() && !c6111.m17004()) {
                    c6111.m17017();
                    break;
                }
                break;
            case 1:
                int i2 = C3040.f11359;
                ((C3040) obj).m9119(false);
                break;
            default:
                RunnableC13793.m33548((RunnableC13793) obj, null);
                break;
        }
    }
}
