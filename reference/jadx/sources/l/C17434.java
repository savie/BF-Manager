package l;

import java.lang.reflect.Constructor;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeKEMExtractor;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeKeyPairGenerator;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePublicKeyParameters;

/* JADX INFO: renamed from: l.ܽ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37X7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17434 implements InterfaceC20724 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SNTRUPrimeKEMExtractor f56697;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public SNTRUPrimePublicKeyParameters f56698;

    @Override // l.InterfaceC20724
    public final void init() throws NoSuchMethodException {
        SNTRUPrimeKeyPairGenerator sNTRUPrimeKeyPairGenerator = new SNTRUPrimeKeyPairGenerator();
        SecureRandom secureRandom = new SecureRandom();
        SNTRUPrimeParameters sNTRUPrimeParameters = SNTRUPrimeParameters.sntrup761;
        if (sNTRUPrimeParameters.getSessionKeySize() != 256) {
            Class cls = Integer.TYPE;
            Constructor declaredConstructor = SNTRUPrimeParameters.class.getDeclaredConstructor(String.class, cls, cls, cls, cls, cls, cls, cls, cls);
            declaredConstructor.setAccessible(true);
            sNTRUPrimeParameters = (SNTRUPrimeParameters) declaredConstructor.newInstance("sntrup761", 761, 4591, 286, 1158, 1007, 1158, 1763, 32);
        }
        sNTRUPrimeKeyPairGenerator.init(new SNTRUPrimeKeyGenerationParameters(secureRandom, sNTRUPrimeParameters));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = sNTRUPrimeKeyPairGenerator.generateKeyPair();
        this.f56697 = new SNTRUPrimeKEMExtractor((SNTRUPrimePrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate());
        this.f56698 = (SNTRUPrimePublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
    }

    @Override // l.InterfaceC20724
    public final byte[] getPublicKey() {
        return this.f56698.getEncoded();
    }

    @Override // l.InterfaceC20724
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo6228(byte[] bArr) {
        return this.f56697.extractSecret(bArr);
    }
}
