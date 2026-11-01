package l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ܺ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1SL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16210 implements InterfaceC21335 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f52321;

    @Override // l.InterfaceC21335
    public final int getBlockSize() {
        return 32;
    }

    @Override // l.InterfaceC21335
    public final String name() {
        return "SHA256";
    }

    @Override // l.InterfaceC21335
    public final void init() {
        this.f52321 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
    }

    @Override // l.InterfaceC21335
    /* JADX INFO: renamed from: ۙ */
    public final void mo3065(int i, byte[] bArr) {
        this.f52321.update(bArr, 0, i);
    }

    @Override // l.InterfaceC21335
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo3066() {
        return this.f52321.digest();
    }
}
