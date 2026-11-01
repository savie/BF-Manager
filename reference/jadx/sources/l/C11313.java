package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;

/* JADX INFO: renamed from: l.ۧ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11313 extends AbstractC24013 {
    public C11313() {
        this.f77810 = MLKEMParameters.ml_kem_768;
    }

    @Override // l.InterfaceC13658
    public final byte[] getPublicKey() {
        return this.f77809.getEncoded();
    }

    @Override // l.InterfaceC13658
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo17491(byte[] bArr) {
        return this.f77808.extractSecret(bArr);
    }
}
