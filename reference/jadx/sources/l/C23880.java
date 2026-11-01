package l;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩻ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: BA22 */
/* JADX INFO: loaded from: classes.dex */
public final class C23880 implements InterfaceC5619 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f77357 = C13488.m32997(C23880.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Mac f77358;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52629(byte[] bArr, int i, int i2, InterfaceC9666 interfaceC9666, InterfaceC9666 interfaceC9667) {
        this.f77358.reset();
        int i3 = i + 48;
        for (int i4 = 0; i4 < 16; i4++) {
            bArr[i3 + i4] = 0;
        }
        int i5 = i + 16;
        C4850.m13550(C4850.m13549(i5, bArr) | 8, i5, bArr);
        this.f77358.update(bArr, i, i2);
        System.arraycopy(this.f77358.doFinal(), 0, bArr, i3, 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52630(byte[] bArr, int i, int i2, InterfaceC9666 interfaceC9666) {
        this.f77358.reset();
        if ((C4850.m13549(i + 16, bArr) & 8) == 0) {
            f77357.mo12119("The server did not sign a message we expected to be signed");
            return true;
        }
        byte[] bArr2 = new byte[16];
        int i3 = i + 48;
        System.arraycopy(bArr, i3, bArr2, 0, 16);
        for (int i4 = 0; i4 < 16; i4++) {
            bArr[i3 + i4] = 0;
        }
        this.f77358.update(bArr, i, i2);
        byte[] bArr3 = new byte[16];
        System.arraycopy(this.f77358.doFinal(), 0, bArr3, 0, 16);
        return !MessageDigest.isEqual(bArr2, bArr3);
    }

    public C23880(byte[] bArr, int i, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac;
        if (i == 514 || i == 528) {
            mac = Mac.getInstance("HmacSHA256");
        } else if (i == 768 || i == 770) {
            bArr = C14708.m35240(i, bArr, new byte[0]);
            mac = Mac.getInstance("AESCMAC", C16577.m38991());
        } else {
            if (i != 785) {
                throw new IllegalArgumentException("Unknown dialect");
            }
            if (bArr2 == null) {
                throw new IllegalArgumentException("Missing preauthIntegrityHash for SMB 3.1");
            }
            bArr = C14708.m35240(i, bArr, bArr2);
            mac = Mac.getInstance("AESCMAC", C16577.m38991());
        }
        mac.init(new SecretKeySpec(bArr, "HMAC"));
        this.f77358 = mac;
    }
}
