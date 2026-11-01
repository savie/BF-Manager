package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;

/* JADX INFO: renamed from: l.ۛ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7UZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6373 extends AbstractC24013 {
    public C6373() {
        this.f77810 = MLKEMParameters.ml_kem_1024;
    }

    @Override // l.InterfaceC13658
    public final byte[] getPublicKey() {
        return this.f77809.getEncoded();
    }

    @Override // l.InterfaceC13658
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo17491(byte[] bArr) {
        return this.f77808.extractSecret(bArr);
    }
}
