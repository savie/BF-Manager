package l;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* JADX INFO: renamed from: l.ۛܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7XJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6144 implements InterfaceC18076 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public BigInteger f20982;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public BigInteger f20983;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BigInteger f20984;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public KeyAgreement f20985;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public BigInteger f20986;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f20987;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public KeyPairGenerator f20988;

    @Override // l.InterfaceC18076
    public final void init() {
        this.f20988 = KeyPairGenerator.getInstance("DH");
        this.f20985 = KeyAgreement.getInstance("DH");
    }

    @Override // l.InterfaceC18076
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo17131() throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (this.f20984 == null) {
            this.f20988.initialize(new DHParameterSpec(this.f20982, this.f20983));
            KeyPair keyPairGenerateKeyPair = this.f20988.generateKeyPair();
            this.f20985.init(keyPairGenerateKeyPair.getPrivate());
            BigInteger y = ((DHPublicKey) keyPairGenerateKeyPair.getPublic()).getY();
            this.f20984 = y;
            this.f20987 = y.toByteArray();
        }
        return this.f20987;
    }

    @Override // l.InterfaceC18076
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] mo17134() throws InvalidKeySpecException, InvalidKeyException {
        this.f20985.doPhase(KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(this.f20986, this.f20982, this.f20983)), true);
        return this.f20985.generateSecret();
    }

    @Override // l.InterfaceC18076
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo17132(byte[] bArr) {
        this.f20982 = new BigInteger(1, bArr);
    }

    @Override // l.InterfaceC18076
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17130(byte[] bArr) {
        this.f20983 = new BigInteger(1, bArr);
    }

    @Override // l.InterfaceC18076
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo17133(byte[] bArr) {
        this.f20986 = new BigInteger(1, bArr);
    }
}
