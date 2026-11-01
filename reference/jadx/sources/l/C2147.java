package l;

/* JADX INFO: renamed from: l.֫᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class C2147 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC22758[] f7815;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f7816;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6701() {
        m6702(0, 0, 0, false);
        m6702(1, 0, 0, false);
        m6702(2, 0, 0, false);
    }

    public C2147(C6111 c6111) {
        this.f7816 = c6111;
        this.f7815 = new ViewTreeObserverOnPreDrawListenerC22758[]{new ViewTreeObserverOnPreDrawListenerC22758(c6111.getContext(), c6111, 0), new ViewTreeObserverOnPreDrawListenerC22758(c6111.getContext(), c6111, 1), new ViewTreeObserverOnPreDrawListenerC22758(c6111.getContext(), c6111, 2)};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6702(int i, int i2, int i3, boolean z) {
        this.f7815[i].m50424(i2, i3, z);
    }
}
