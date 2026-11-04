package l;

/* JADX INFO: renamed from: l.᩵᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 398Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C20850 extends C3674 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12119 f66752;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20850(byte[] bArr, InterfaceC12119 interfaceC12119) {
        super(bArr, 0);
        this.f66752 = interfaceC12119;
    }

    @Override // l.AbstractC2599
    /* JADX INFO: renamed from: ۚ */
    public final int mo8719(int i) {
        if ((((i - 56) | (95 - i)) >>> 31) == 0) {
            byte bMo8717 = mo8717(i);
            InterfaceC12119 interfaceC12119 = this.f66752;
            int iMo30288 = bMo8717 ^ interfaceC12119.mo30288(i);
            int i2 = i + 1;
            int i3 = i + 2;
            int i4 = i + 3;
            return ((interfaceC12119.mo30288(i4) ^ mo8717(i4)) << 24) | (iMo30288 & 255) | (((interfaceC12119.mo30288(i2) ^ mo8717(i2)) & 255) << 8) | (((interfaceC12119.mo30288(i3) ^ mo8717(i3)) & 255) << 16);
        }
        return super.mo8719(i);
    }
}
