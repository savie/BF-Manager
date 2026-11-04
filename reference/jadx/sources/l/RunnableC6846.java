package l;

import android.text.method.TextKeyListener;

/* JADX INFO: renamed from: l.ۜۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6846 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22755;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22756;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22757;

    public /* synthetic */ RunnableC6846(int i, Object obj, Object obj2) {
        this.f22755 = i;
        this.f22757 = obj;
        this.f22756 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22755;
        Object obj = this.f22756;
        Object obj2 = this.f22757;
        switch (i) {
            case 0:
                TextKeyListener textKeyListener = C24132.f77977;
                ((C24132) obj2).m53920((C16361) obj);
                break;
            default:
                C2937.m9588((C2937) obj2, (C10394) obj);
                break;
        }
    }
}
