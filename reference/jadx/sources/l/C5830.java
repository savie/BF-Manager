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

/* JADX INFO: renamed from: l.ۚᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7XJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5830 implements InterfaceC9425 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BigInteger f20049;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public BigInteger f20050;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public BigInteger f20051;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public KeyPairGenerator f20052;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public KeyAgreement f20053;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f20054;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BigInteger f20055;

    @Override // l.InterfaceC9425
    public final void init() {
        this.f20052 = KeyPairGenerator.getInstance("DH");
        this.f20053 = KeyAgreement.getInstance("DH");
    }

    @Override // l.InterfaceC9425
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo17015() throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (this.f20049 == null) {
            this.f20052.initialize(new DHParameterSpec(this.f20051, this.f20055));
            KeyPair keyPairGenerateKeyPair = this.f20052.generateKeyPair();
            this.f20053.init(keyPairGenerateKeyPair.getPrivate());
            BigInteger y = ((DHPublicKey) keyPairGenerateKeyPair.getPublic()).getY();
            this.f20049 = y;
            this.f20054 = y.toByteArray();
        }
        return this.f20054;
    }

    @Override // l.InterfaceC9425
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] mo17018() throws InvalidKeySpecException, InvalidKeyException {
        this.f20053.doPhase(KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(this.f20050, this.f20051, this.f20055)), true);
        return this.f20053.generateSecret();
    }

    @Override // l.InterfaceC9425
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo17016(byte[] bArr) {
        this.f20051 = new BigInteger(1, bArr);
    }

    @Override // l.InterfaceC9425
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17014(byte[] bArr) {
        this.f20055 = new BigInteger(1, bArr);
    }

    @Override // l.InterfaceC9425
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo17017(byte[] bArr) {
        this.f20050 = new BigInteger(1, bArr);
    }
}
