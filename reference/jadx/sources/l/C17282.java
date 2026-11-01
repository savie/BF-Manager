package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܿۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 49UX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17282 extends MessageDigest implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f55033;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f55034;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public MessageDigest f55035;

    public C17282(byte[] bArr) {
        super("HMACT64");
        this.f55034 = new byte[64];
        this.f55033 = new byte[64];
        int iMin = Math.min(bArr.length, 64);
        for (int i = 0; i < iMin; i++) {
            this.f55034[i] = (byte) (54 ^ bArr[i]);
            this.f55033[i] = (byte) (92 ^ bArr[i]);
        }
        while (iMin < 64) {
            this.f55034[iMin] = 54;
            this.f55033[iMin] = 92;
            iMin++;
        }
        this.f55035 = C16577.m38992();
        engineReset();
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public final Object clone() {
        try {
            C17282 c17282 = new C17282("HMACT64");
            c17282.f55034 = new byte[64];
            c17282.f55033 = new byte[64];
            c17282.f55034 = this.f55034;
            c17282.f55033 = this.f55033;
            c17282.f55035 = (MessageDigest) this.f55035.clone();
            return c17282;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.MessageDigestSpi
    public final byte[] engineDigest() {
        MessageDigest messageDigest = this.f55035;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.update(this.f55033);
        return messageDigest.digest(bArrDigest);
    }

    @Override // java.security.MessageDigestSpi
    public final int engineDigest(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest = this.f55035;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.update(this.f55033);
        messageDigest.update(bArrDigest);
        try {
            return messageDigest.digest(bArr, i, i2);
        } catch (Exception unused) {
            throw new IllegalStateException();
        }
    }

    @Override // java.security.MessageDigestSpi
    public final int engineGetDigestLength() {
        return this.f55035.getDigestLength();
    }

    @Override // java.security.MessageDigestSpi
    public final void engineReset() {
        MessageDigest messageDigest = this.f55035;
        messageDigest.reset();
        messageDigest.update(this.f55034);
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte b) {
        this.f55035.update(b);
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.f55035.update(bArr, i, i2);
    }
}
