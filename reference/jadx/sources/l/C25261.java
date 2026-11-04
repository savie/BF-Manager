package l;

/* JADX INFO: renamed from: l.᩻᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes.dex */
public final class C25261 implements InterfaceC2885 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f81590;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f81591;

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
        return C9596.m25073(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
        return C9596.m25074(this, interfaceC2885);
    }

    public C25261(long[] jArr, boolean z) {
        this.f81590 = jArr;
        this.f81591 = z;
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1303(int i) {
        if (C12690.m31484(i)) {
            i = C12690.m31488(i);
        }
        long[] jArr = this.f81590;
        if (i < (jArr.length << 6)) {
            return (jArr[i >>> 6] & (1 << i)) != 0;
        }
        return this.f81591;
    }

    @Override // l.InterfaceC2885
    public final C0891 negate() {
        C0407 c0407 = C5233.f18438;
        return C0891.m3623(this);
    }
}
