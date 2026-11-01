package l;

/* JADX INFO: renamed from: l.ۘ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 9897 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3636 extends C11771 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC13785 f13344;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f13345;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC12810 f13346;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6396 f13347;

    public C3636(EnumC20508 enumC20508, long j, long j2, EnumC12810 enumC12810, C6396 c6396, EnumC13785 enumC13785, byte[] bArr) {
        super(33, enumC20508, EnumC2162.SMB2_SET_INFO, j, j2);
        this.f13347 = c6396;
        this.f13346 = enumC12810;
        this.f13344 = enumC13785;
        this.f13345 = bArr;
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ۖ */
    public final void mo3384(C19240 c19240) {
        c19240.m27396(this.f39515);
        c19240.m27381((byte) this.f13346.getValue());
        EnumC13785 enumC13785 = this.f13344;
        c19240.m27381(enumC13785 == null ? (byte) 0 : (byte) enumC13785.getValue());
        byte[] bArr = this.f13345;
        c19240.m27398(bArr.length);
        c19240.m27396(96);
        c19240.m44196();
        c19240.m27398(0L);
        this.f13347.m17542(c19240);
        c19240.m27383(bArr.length, bArr);
    }
}
