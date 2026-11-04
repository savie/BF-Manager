package l;

import java.util.HashMap;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.֨᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9IW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1487 implements InterfaceC22370 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static HashMap f5183;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Digest f5184;

    static {
        HashMap map = new HashMap();
        f5183 = map;
        map.put(XMSSKeyParameters.SHA_512, new C0741());
        map.put("SHA256", new C8199());
        map.put("MD4", new C19386());
        map.put("MD5", new C10435());
    }

    public C1487(String str) {
        InterfaceC15436 interfaceC15436 = (InterfaceC15436) f5183.get(str);
        if (interfaceC15436 == null) {
            throw new IllegalArgumentException(C14442.m34865("No MessageDigest ", str, " defined in BouncyCastle"));
        }
        this.f5184 = (Digest) interfaceC15436.create();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5309(byte[] bArr) {
        this.f5184.update(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5310(byte[] bArr, int i, int i2) {
        this.f5184.update(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m5311() {
        Digest digest = this.f5184;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m5312() {
        this.f5184.reset();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m5313() {
        return this.f5184.getDigestSize();
    }
}
