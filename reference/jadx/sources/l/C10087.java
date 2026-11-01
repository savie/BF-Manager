package l;

/* JADX INFO: renamed from: l.ۤۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10087 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6558[] f34440;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f34441;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9456 f34442;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5490[] f34443;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f34444;

    public C10087(C5490[] c5490Arr, InterfaceC6558[] interfaceC6558Arr, C9456 c9456, Object obj) {
        C2023.m6507(c5490Arr.length == interfaceC6558Arr.length);
        this.f34443 = c5490Arr;
        this.f34440 = (InterfaceC6558[]) interfaceC6558Arr.clone();
        this.f34442 = c9456;
        this.f34441 = obj;
        this.f34444 = c5490Arr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25496(int i) {
        return this.f34443[i] != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25497(C10087 c10087, int i) {
        return c10087 != null && C13638.equals(this.f34443[i], c10087.f34443[i]) && C13638.equals(this.f34440[i], c10087.f34440[i]);
    }
}
