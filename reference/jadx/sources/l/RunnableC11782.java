package l;

/* JADX INFO: renamed from: l.ۧܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RX */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11782 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f38074;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16257 f38075;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38076;

    public RunnableC11782(C16257 c16257) {
        this.f38075 = c16257;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f38074;
        C16257 c16257 = this.f38075;
        if (z == c16257.isPressed() && c16257.getParent() != null && this.f38076 == c16257.getWindowAttachCount()) {
            c16257.performLongClick();
            c16257.f52821 = true;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29604() {
        this.f38076 = this.f38075.getWindowAttachCount();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29603() {
        this.f38074 = this.f38075.isPressed();
    }
}
