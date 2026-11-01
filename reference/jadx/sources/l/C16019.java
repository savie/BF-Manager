package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.ܺܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S135 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16019 implements InterfaceC20957 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MessageDigest f51846;

    public C16019(String str) {
        try {
            this.f51846 = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC20957
    /* JADX INFO: renamed from: ۙ */
    public final void mo26267(C18840 c18840) {
        this.f51846.update(c18840.m43470(), 0, c18840.m43472());
    }

    @Override // l.InterfaceC20957
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo26268() {
        return this.f51846.digest();
    }

    public final String toString() {
        return this.f51846.getAlgorithm();
    }
}
