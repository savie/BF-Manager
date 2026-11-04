package l;

/* JADX INFO: renamed from: l.᩸ᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N8Q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23011 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f74673;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0273[] f74674;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12074 f74675;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f74676;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC1470[] f74677;

    public C23011(C0273[] c0273Arr, InterfaceC1470[] interfaceC1470Arr, C12074 c12074, Object obj) {
        C20782.m47565(c0273Arr.length == interfaceC1470Arr.length);
        this.f74674 = c0273Arr;
        this.f74677 = (InterfaceC1470[]) interfaceC1470Arr.clone();
        this.f74675 = c12074;
        this.f74673 = obj;
        this.f74676 = c0273Arr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51902(int i) {
        return this.f74674[i] != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51903(C23011 c23011, int i) {
        return c23011 != null && C17359.equals(this.f74674[i], c23011.f74674[i]) && C17359.equals(this.f74677[i], c23011.f74677[i]);
    }
}
