package l;

/* JADX INFO: renamed from: l.۠ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RX */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8018 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7312 f26273;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f26274;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26275;

    public RunnableC8018(C7312 c7312) {
        this.f26273 = c7312;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f26274;
        C7312 c7312 = this.f26273;
        if (z == c7312.isPressed() && c7312.getParent() != null && this.f26275 == c7312.getWindowAttachCount()) {
            c7312.performLongClick();
            c7312.f24286 = true;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21121() {
        this.f26275 = this.f26273.getWindowAttachCount();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21120() {
        this.f26274 = this.f26273.isPressed();
    }
}
