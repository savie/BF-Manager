package l;

/* JADX INFO: renamed from: l.ۗܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 398Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C3302 extends C1788 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21570 f12209;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3302(byte[] bArr, InterfaceC21570 interfaceC21570) {
        super(bArr, 0);
        this.f12209 = interfaceC21570;
    }

    @Override // l.AbstractC18119
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int mo9809(int i) {
        if ((((i - 56) | (95 - i)) >>> 31) == 0) {
            byte bMo5855 = mo5855(i);
            InterfaceC21570 interfaceC21570 = this.f12209;
            int iMo14692 = bMo5855 ^ interfaceC21570.mo14692(i);
            int i2 = i + 1;
            int i3 = i + 2;
            int i4 = i + 3;
            return ((interfaceC21570.mo14692(i4) ^ mo5855(i4)) << 24) | (iMo14692 & 255) | (((interfaceC21570.mo14692(i2) ^ mo5855(i2)) & 255) << 8) | (((interfaceC21570.mo14692(i3) ^ mo5855(i3)) & 255) << 16);
        }
        return super.mo9809(i);
    }
}
