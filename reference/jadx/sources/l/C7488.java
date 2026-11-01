package l;

import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.۟۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1SL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7488 extends AbstractC8900 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final MessageDigest f24940;

    public C7488() {
        this.f30540 = 32;
        this.f30539 = XMSSKeyParameters.SHA_256;
        this.f24940 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
    }

    @Override // l.AbstractC8900
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19985(byte[] bArr, int i, int i2) {
        this.f24940.update(bArr, i, i2);
    }

    @Override // l.AbstractC8900
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo19986() {
        MessageDigest messageDigest = this.f24940;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.reset();
        return bArrDigest;
    }
}
