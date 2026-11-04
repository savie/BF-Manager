package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܿܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9FL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18442 extends C24652 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumSet f60042;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte f60043;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f60044;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC15700 f60045;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f60046;

    public C18442() {
    }

    public C18442(EnumC15700 enumC15700, EnumSet enumSet, EnumSet enumSet2) {
        super(enumC15700, EnumC23906.SMB2_SESSION_SETUP);
        this.f60045 = enumC15700;
        this.f60043 = (byte) C10961.m27791(enumSet);
        this.f60046 = C10961.m27791(enumSet2);
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7006(C7453 c7453) {
        c7453.m56023(this.f79801);
        this.f60045.m37476();
        c7453.m56005((byte) 0);
        c7453.m56005(this.f60043);
        c7453.m56025(this.f60046 & 255);
        c7453.m20460();
        c7453.m56023(88);
        byte[] bArr = this.f60044;
        c7453.m56023(bArr != null ? bArr.length : 0);
        c7453.m56014(0L);
        byte[] bArr2 = this.f60044;
        if (bArr2 != null) {
            c7453.m56007(bArr2.length, bArr2);
        }
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4684(C7453 c7453) throws C2013 {
        byte[] bArr;
        c7453.m56017();
        this.f60042 = C10961.m27792(c7453.m56017(), EnumC21426.class);
        int iM56017 = c7453.m56017();
        int iM56018 = c7453.m56017();
        if (iM56018 > 0) {
            c7453.m56027(iM56017);
            bArr = new byte[iM56018];
            c7453.m56024(iM56018, bArr);
        } else {
            bArr = new byte[0];
        }
        this.f60044 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet m42965() {
        return this.f60042;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42966(byte[] bArr) {
        this.f60044 = bArr;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m42967() {
        return this.f60044;
    }
}
