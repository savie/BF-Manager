package l;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۘܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14GC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15574;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Mac f15575;

    public C4295() {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            this.f15575 = mac;
            this.f15574 = mac.getMacLength();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13671(byte[] bArr) {
        try {
            this.f15575.init(new SecretKeySpec(bArr, "HmacSHA1"));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }
}
