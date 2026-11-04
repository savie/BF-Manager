package l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۖܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M1SL */
/* JADX INFO: loaded from: classes3.dex */
public final class C2766 extends AbstractC1275 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final MessageDigest f9141;

    public C2766() {
        this.f4589 = 32;
        this.f4588 = XMSSKeyParameters.SHA_256;
        this.f9141 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
    }

    @Override // l.AbstractC1275
    /* JADX INFO: renamed from: ۙ */
    public final void mo4663(byte[] bArr, int i, int i2) {
        this.f9141.update(bArr, i, i2);
    }

    @Override // l.AbstractC1275
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo4664() {
        MessageDigest messageDigest = this.f9141;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.reset();
        return bArrDigest;
    }
}
