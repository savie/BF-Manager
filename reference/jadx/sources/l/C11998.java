package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۨ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 49UX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11998 extends MessageDigest implements Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f38668;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f38669;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public MessageDigest f38670;

    public C11998(byte[] bArr) {
        super("HMACT64");
        this.f38668 = new byte[64];
        this.f38669 = new byte[64];
        int iMin = Math.min(bArr.length, 64);
        for (int i = 0; i < iMin; i++) {
            this.f38668[i] = (byte) (54 ^ bArr[i]);
            this.f38669[i] = (byte) (92 ^ bArr[i]);
        }
        while (iMin < 64) {
            this.f38668[iMin] = 54;
            this.f38669[iMin] = 92;
            iMin++;
        }
        this.f38670 = C3049.m9907();
        engineReset();
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public final Object clone() {
        try {
            C11998 c11998 = new C11998("HMACT64");
            c11998.f38668 = new byte[64];
            c11998.f38669 = new byte[64];
            c11998.f38668 = this.f38668;
            c11998.f38669 = this.f38669;
            c11998.f38670 = (MessageDigest) this.f38670.clone();
            return c11998;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.MessageDigestSpi
    public final byte[] engineDigest() {
        MessageDigest messageDigest = this.f38670;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.update(this.f38669);
        return messageDigest.digest(bArrDigest);
    }

    @Override // java.security.MessageDigestSpi
    public final int engineDigest(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest = this.f38670;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.update(this.f38669);
        messageDigest.update(bArrDigest);
        try {
            return messageDigest.digest(bArr, i, i2);
        } catch (Exception unused) {
            throw new IllegalStateException();
        }
    }

    @Override // java.security.MessageDigestSpi
    public final int engineGetDigestLength() {
        return this.f38670.getDigestLength();
    }

    @Override // java.security.MessageDigestSpi
    public final void engineReset() {
        MessageDigest messageDigest = this.f38670;
        messageDigest.reset();
        messageDigest.update(this.f38668);
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte b) {
        this.f38670.update(b);
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.f38670.update(bArr, i, i2);
    }
}
