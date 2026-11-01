package l;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩻ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAEU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23784 implements InterfaceC10130 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Mac f76910;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f76911;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f76912 = new byte[4];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f76913;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f76914;

    @Override // l.InterfaceC10130
    public void init(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        int length = bArr.length;
        int i = this.f76914;
        if (length > i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, this.f76911);
        Mac mac = Mac.getInstance(this.f76911);
        this.f76910 = mac;
        mac.init(secretKeySpec);
    }

    @Override // l.InterfaceC10130
    /* JADX INFO: renamed from: ۙ */
    public void mo3161(int i) {
        byte[] bArr = this.f76912;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        mo3162(4, bArr);
    }

    @Override // l.InterfaceC10130
    /* JADX INFO: renamed from: ۙ */
    public void mo3162(int i, byte[] bArr) {
        this.f76910.update(bArr, 0, i);
    }

    @Override // l.InterfaceC10130
    /* JADX INFO: renamed from: ܰ */
    public void mo3164(int i, byte[] bArr) {
        try {
            this.f76910.doFinal(bArr, i);
        } catch (ShortBufferException unused) {
            C0168.m1326().getClass();
        }
    }
}
