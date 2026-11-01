package l;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩷ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 14GC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20801 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67627;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Mac f67628;

    public C20801() {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            this.f67628 = mac;
            this.f67627 = mac.getMacLength();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46785(byte[] bArr) {
        try {
            this.f67628.init(new SecretKeySpec(bArr, "HmacSHA1"));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }
}
