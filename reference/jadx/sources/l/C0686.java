package l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.֡᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67V1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0686 implements InterfaceC21335 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f2867;

    @Override // l.InterfaceC21335
    public final int getBlockSize() {
        return 64;
    }

    @Override // l.InterfaceC21335
    public final String name() {
        return "SHA512";
    }

    @Override // l.InterfaceC21335
    public final void init() {
        this.f2867 = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
    }

    @Override // l.InterfaceC21335
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3065(int i, byte[] bArr) {
        this.f2867.update(bArr, 0, i);
    }

    @Override // l.InterfaceC21335
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo3066() {
        return this.f2867.digest();
    }
}
