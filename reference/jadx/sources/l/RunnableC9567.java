package l;

/* JADX INFO: renamed from: l.ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9567 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f30964;

    public RunnableC9567(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354) {
        this.f30964 = layoutInflaterFactory2C24354;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f30964;
        if ((layoutInflaterFactory2C24354.f78972 & 1) != 0) {
            layoutInflaterFactory2C24354.m54420(0);
        }
        if ((layoutInflaterFactory2C24354.f78972 & 4096) != 0) {
            layoutInflaterFactory2C24354.m54420(108);
        }
        layoutInflaterFactory2C24354.f78987 = false;
        layoutInflaterFactory2C24354.f78972 = 0;
    }
}
