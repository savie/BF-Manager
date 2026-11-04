package l;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۧᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAEU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11795 implements InterfaceC7299 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f38097;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f38098;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f38099 = new byte[4];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f38100;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Mac f38101;

    @Override // l.InterfaceC7299
    public void init(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        int length = bArr.length;
        int i = this.f38100;
        if (length > i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, this.f38097);
        Mac mac = Mac.getInstance(this.f38097);
        this.f38101 = mac;
        mac.init(secretKeySpec);
    }

    @Override // l.InterfaceC7299
    /* JADX INFO: renamed from: ۙ */
    public void mo19965(int i) {
        byte[] bArr = this.f38099;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        mo19966(4, bArr);
    }

    @Override // l.InterfaceC7299
    /* JADX INFO: renamed from: ۙ */
    public void mo19966(int i, byte[] bArr) {
        this.f38101.update(bArr, 0, i);
    }

    @Override // l.InterfaceC7299
    /* JADX INFO: renamed from: ᩷ */
    public void mo19967(int i, byte[] bArr) {
        try {
            this.f38101.doFinal(bArr, i);
        } catch (ShortBufferException unused) {
            C19978.m45893().getClass();
        }
    }
}
