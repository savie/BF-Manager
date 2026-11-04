package l;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩺ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BA22 */
/* JADX INFO: loaded from: classes.dex */
public final class C24043 implements InterfaceC10110 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f77766 = C16980.m40037(C24043.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Mac f77767;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m53594(byte[] bArr, int i, int i2, InterfaceC14585 interfaceC14585, InterfaceC14585 interfaceC14586) {
        this.f77767.reset();
        int i3 = i + 48;
        for (int i4 = 0; i4 < 16; i4++) {
            bArr[i3 + i4] = 0;
        }
        int i5 = i + 16;
        C0481.m2323(C0481.m2322(i5, bArr) | 8, i5, bArr);
        this.f77767.update(bArr, i, i2);
        System.arraycopy(this.f77767.doFinal(), 0, bArr, i3, 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m53595(byte[] bArr, int i, int i2, InterfaceC14585 interfaceC14585) {
        this.f77767.reset();
        if ((C0481.m2322(i + 16, bArr) & 8) == 0) {
            f77766.mo13699("The server did not sign a message we expected to be signed");
            return true;
        }
        byte[] bArr2 = new byte[16];
        int i3 = i + 48;
        System.arraycopy(bArr, i3, bArr2, 0, 16);
        for (int i4 = 0; i4 < 16; i4++) {
            bArr[i3 + i4] = 0;
        }
        this.f77767.update(bArr, i, i2);
        byte[] bArr3 = new byte[16];
        System.arraycopy(this.f77767.doFinal(), 0, bArr3, 0, 16);
        return !MessageDigest.isEqual(bArr2, bArr3);
    }

    public C24043(byte[] bArr, int i, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac;
        if (i == 514 || i == 528) {
            mac = Mac.getInstance("HmacSHA256");
        } else if (i == 768 || i == 770) {
            bArr = C3905.m12552(i, bArr, new byte[0]);
            mac = Mac.getInstance("AESCMAC", C3049.m9906());
        } else {
            if (i != 785) {
                throw new IllegalArgumentException("Unknown dialect");
            }
            if (bArr2 == null) {
                throw new IllegalArgumentException("Missing preauthIntegrityHash for SMB 3.1");
            }
            bArr = C3905.m12552(i, bArr, bArr2);
            mac = Mac.getInstance("AESCMAC", C3049.m9906());
        }
        mac.init(new SecretKeySpec(bArr, "HMAC"));
        this.f77767 = mac;
    }
}
