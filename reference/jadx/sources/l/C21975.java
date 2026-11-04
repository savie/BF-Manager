package l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩷ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1SL */
/* JADX INFO: loaded from: classes.dex */
public final class C21975 implements InterfaceC1421 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f70916;

    @Override // l.InterfaceC1421
    public final int getBlockSize() {
        return 32;
    }

    @Override // l.InterfaceC1421
    public final String name() {
        return "SHA256";
    }

    @Override // l.InterfaceC1421
    public final void init() {
        this.f70916 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final void mo5157(int i, byte[] bArr) {
        this.f70916.update(bArr, 0, i);
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo5158() {
        return this.f70916.digest();
    }
}
