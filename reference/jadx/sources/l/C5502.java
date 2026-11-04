package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;

/* JADX INFO: renamed from: l.ۚ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7UZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5502 extends AbstractC11467 {
    public C5502() {
        this.f36056 = MLKEMParameters.ml_kem_1024;
    }

    @Override // l.InterfaceC20724
    public final byte[] getPublicKey() {
        return this.f36055.getEncoded();
    }

    @Override // l.InterfaceC20724
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo6228(byte[] bArr) {
        return this.f36054.extractSecret(bArr);
    }
}
