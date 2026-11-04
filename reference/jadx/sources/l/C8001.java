package l;

/* JADX INFO: renamed from: l.۟ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9897 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8001 extends C24652 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC0543 f26551;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC6073 f26552;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C25398 f26553;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f26554;

    public C8001(EnumC15700 enumC15700, long j, long j2, EnumC0543 enumC0543, C25398 c25398, EnumC6073 enumC6073, byte[] bArr) {
        super(33, enumC15700, EnumC23906.SMB2_SET_INFO, j, j2);
        this.f26553 = c25398;
        this.f26551 = enumC0543;
        this.f26552 = enumC6073;
        this.f26554 = bArr;
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7006(C7453 c7453) {
        c7453.m56023(this.f79801);
        c7453.m56005((byte) this.f26551.getValue());
        EnumC6073 enumC6073 = this.f26552;
        c7453.m56005(enumC6073 == null ? (byte) 0 : (byte) enumC6073.getValue());
        byte[] bArr = this.f26554;
        c7453.m56025(bArr.length);
        c7453.m56023(96);
        c7453.m20461();
        c7453.m56025(0L);
        this.f26553.m56760(c7453);
        c7453.m56007(bArr.length, bArr);
    }
}
