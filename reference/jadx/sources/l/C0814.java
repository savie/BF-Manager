package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.֨֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C9FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C0814 extends C11771 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f3436;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumSet f3437;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f3438;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f3439;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC20508 f3440;

    public C0814() {
    }

    public C0814(EnumC20508 enumC20508, EnumSet enumSet, EnumSet enumSet2) {
        super(enumC20508, EnumC2162.SMB2_SESSION_SETUP);
        this.f3440 = enumC20508;
        this.f3439 = (byte) C20799.m46781(enumSet);
        this.f3438 = C20799.m46781(enumSet2);
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo3384(C19240 c19240) {
        c19240.m27396(this.f39515);
        this.f3440.m46306();
        c19240.m27381((byte) 0);
        c19240.m27381(this.f3439);
        c19240.m27398(this.f3438 & 255);
        c19240.m44195();
        c19240.m27396(88);
        byte[] bArr = this.f3436;
        c19240.m27396(bArr != null ? bArr.length : 0);
        c19240.m27392(0L);
        byte[] bArr2 = this.f3436;
        if (bArr2 != null) {
            c19240.m27383(bArr2.length, bArr2);
        }
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ܰ */
    public final void mo2356(C19240 c19240) throws C17271 {
        byte[] bArr;
        c19240.m27375();
        this.f3437 = C20799.m46782(c19240.m27375(), EnumC21982.class);
        int iM27375 = c19240.m27375();
        int iM27376 = c19240.m27375();
        if (iM27376 > 0) {
            c19240.m27376(iM27375);
            bArr = new byte[iM27376];
            c19240.m27397(iM27376, bArr);
        } else {
            bArr = new byte[0];
        }
        this.f3436 = bArr;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumSet m3385() {
        return this.f3437;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3386(byte[] bArr) {
        this.f3436 = bArr;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] m3387() {
        return this.f3436;
    }
}
