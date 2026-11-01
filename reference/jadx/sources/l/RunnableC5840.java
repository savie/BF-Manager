package l;

/* JADX INFO: renamed from: l.ۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5840 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f19809;

    public RunnableC5840(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161) {
        this.f19809 = layoutInflaterFactory2C9161;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f19809;
        if ((layoutInflaterFactory2C9161.f31178 & 1) != 0) {
            layoutInflaterFactory2C9161.m23535(0);
        }
        if ((layoutInflaterFactory2C9161.f31178 & 4096) != 0) {
            layoutInflaterFactory2C9161.m23535(108);
        }
        layoutInflaterFactory2C9161.f31188 = false;
        layoutInflaterFactory2C9161.f31178 = 0;
    }
}
