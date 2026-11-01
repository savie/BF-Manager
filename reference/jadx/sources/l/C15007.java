package l;

import java.util.HashMap;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ܶۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15007 implements InterfaceC10029 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static HashMap f48935;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Digest f48936;

    static {
        HashMap map = new HashMap();
        f48935 = map;
        map.put(XMSSKeyParameters.SHA_512, new C12890());
        map.put("SHA256", new C3716());
        map.put("MD4", new C6539());
        map.put("MD5", new C22768());
    }

    public C15007(String str) {
        InterfaceC0337 interfaceC0337 = (InterfaceC0337) f48935.get(str);
        if (interfaceC0337 == null) {
            throw new IllegalArgumentException(C16523.m38890("No MessageDigest ", str, " defined in BouncyCastle"));
        }
        this.f48936 = (Digest) interfaceC0337.create();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35984(byte[] bArr) {
        this.f48936.update(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35985(byte[] bArr, int i, int i2) {
        this.f48936.update(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m35986() {
        Digest digest = this.f48936;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35987() {
        this.f48936.reset();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m35988() {
        return this.f48936.getDigestSize();
    }
}
