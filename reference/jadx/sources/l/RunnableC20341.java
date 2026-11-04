package l;

/* JADX INFO: renamed from: l.᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC20341 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6171 f65262;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12136 f65263;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9898 f65264;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8407 f65265;

    public RunnableC20341(C12136 c12136, C6171 c6171, C8407 c8407, C9898 c9898) {
        this.f65263 = c12136;
        this.f65262 = c6171;
        this.f65265 = c8407;
        this.f65264 = c9898;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC24071 viewOnKeyListenerC24071 = this.f65263.f39031;
        C6171 c6171 = this.f65262;
        if (c6171 != null) {
            viewOnKeyListenerC24071.f77840 = true;
            c6171.f21023.close(false);
            viewOnKeyListenerC24071.f77840 = false;
        }
        C8407 c8407 = this.f65265;
        if (c8407.isEnabled() && c8407.hasSubMenu()) {
            this.f65264.performItemAction(c8407, 4);
        }
    }
}
