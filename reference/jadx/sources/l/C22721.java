package l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩸ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67V1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22721 implements InterfaceC1421 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f73754;

    @Override // l.InterfaceC1421
    public final int getBlockSize() {
        return 64;
    }

    @Override // l.InterfaceC1421
    public final String name() {
        return "SHA512";
    }

    @Override // l.InterfaceC1421
    public final void init() {
        this.f73754 = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final void mo5157(int i, byte[] bArr) {
        this.f73754.update(bArr, 0, i);
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo5158() {
        return this.f73754.digest();
    }
}
