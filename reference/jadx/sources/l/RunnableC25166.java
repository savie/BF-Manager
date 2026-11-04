package l;

/* JADX INFO: renamed from: l.᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC25166 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16960 f81356;

    public RunnableC25166(C16960 c16960) {
        this.f81356 = c16960;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C16960 c16960 = this.f81356;
        C9479 c9479 = c16960.f55410;
        if (c9479 == null || !c9479.isAttachedToWindow() || c16960.f55410.getCount() <= c16960.f55410.getChildCount() || c16960.f55410.getChildCount() > c16960.f55425) {
            return;
        }
        c16960.f55402.setInputMethodMode(2);
        c16960.show();
    }
}
