package l;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMExtractor;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPublicKeyParameters;

/* JADX INFO: renamed from: l.᩻᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7YC */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24013 implements InterfaceC13658 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MLKEMExtractor f77808;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public MLKEMPublicKeyParameters f77809;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public MLKEMParameters f77810;

    @Override // l.InterfaceC13658
    public void init() {
        MLKEMKeyPairGenerator mLKEMKeyPairGenerator = new MLKEMKeyPairGenerator();
        mLKEMKeyPairGenerator.init(new MLKEMKeyGenerationParameters(new SecureRandom(), this.f77810));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = mLKEMKeyPairGenerator.generateKeyPair();
        this.f77808 = new MLKEMExtractor((MLKEMPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate());
        this.f77809 = (MLKEMPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
    }
}
