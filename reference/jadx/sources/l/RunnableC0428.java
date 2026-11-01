package l;

import android.graphics.Typeface;

/* JADX INFO: renamed from: l.֡۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0428 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1946;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1947;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1948;

    public /* synthetic */ RunnableC0428(int i, Object obj, Object obj2) {
        this.f1947 = i;
        this.f1948 = obj;
        this.f1946 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1947) {
            case 0:
                C22032.m48928((C22032) this.f1948, (C11381) this.f1946);
                break;
            case 1:
                ((AbstractC20864) this.f1948).m46900((Typeface) this.f1946);
                break;
            default:
                C11779.m29419((C11779) this.f1948, (C16947) this.f1946);
                break;
        }
    }
}
