package l;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMExtractor;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPublicKeyParameters;

/* JADX INFO: renamed from: l.ۧ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7YC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11467 implements InterfaceC20724 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MLKEMExtractor f36054;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public MLKEMPublicKeyParameters f36055;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public MLKEMParameters f36056;

    @Override // l.InterfaceC20724
    public void init() {
        MLKEMKeyPairGenerator mLKEMKeyPairGenerator = new MLKEMKeyPairGenerator();
        mLKEMKeyPairGenerator.init(new MLKEMKeyGenerationParameters(new SecureRandom(), this.f36056));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = mLKEMKeyPairGenerator.generateKeyPair();
        this.f36054 = new MLKEMExtractor((MLKEMPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate());
        this.f36055 = (MLKEMPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
    }
}
