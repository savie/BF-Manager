package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import l.C12278;
import l.C12441;
import l.C13958;
import l.C15489;
import l.C17214;
import l.C17922;
import l.C22697;
import l.C5800;
import l.C9023;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.CamelliaWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.internal.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* JADX INFO: loaded from: classes.dex */
public final class Camellia {

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("Camellia");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Camellia IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(128, new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC192 extends BaseBlockCipher {
        public CBC192() {
            super(192, new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(256, new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Camellia.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new CamelliaEngine();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(GCMBlockCipher.newInstance(new CamelliaEngine())));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("Camellia", null);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("Camellia", i, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends SymmetricAlgorithmProvider {
        public static final String PREFIX = Camellia.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C5800.m15969(str, "$AlgParams", "AlgorithmParameters.CAMELLIA", sb, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier, "CAMELLIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NTTObjectIdentifiers.id_camellia192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier2, "CAMELLIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NTTObjectIdentifiers.id_camellia256_cbc;
            C12441.m30916(C17214.m40154(configurableProvider, "Alg.Alias.AlgorithmParameters", "CAMELLIA", str, aSN1ObjectIdentifier3), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier2, "CAMELLIA");
            C5800.m15969(str, "$Wrap", "Cipher.CAMELLIAWRAP", C9023.m23357(str, "$RFC3211Wrap", "Cipher.CAMELLIARFC3211WRAP", C17922.m41616("$CBC256", "Cipher", C17214.m40154(configurableProvider, "Cipher", C22697.m50267(C17922.m41616("$CBC128", "Cipher", C12278.m30516("$ECB", "Cipher.CAMELLIA", str, C17214.m40154(configurableProvider, "Alg.Alias.AlgorithmParameterGenerator", "CAMELLIA", str, aSN1ObjectIdentifier3), configurableProvider), aSN1ObjectIdentifier, configurableProvider), str, "$CBC192"), str, aSN1ObjectIdentifier2), aSN1ObjectIdentifier3, configurableProvider), configurableProvider), configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NTTObjectIdentifiers.id_camellia128_wrap;
            C13958.m33814(configurableProvider, str, "$Wrap128", "Cipher", aSN1ObjectIdentifier4);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NTTObjectIdentifiers.id_camellia192_wrap;
            C13958.m33814(configurableProvider, str, "$Wrap192", "Cipher", aSN1ObjectIdentifier5);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia256_wrap;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, str + "$Wrap256");
            C5800.m15969(str, "$KeyFactory", "SecretKeyFactory.CAMELLIA", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier2, "CAMELLIA");
            StringBuilder sbM40154 = C17214.m40154(configurableProvider, "KeyGenerator", C22697.m50267(C17922.m41616("$KeyGen192", "KeyGenerator", C17214.m40154(configurableProvider, "KeyGenerator", C22697.m50267(C17922.m41616("$KeyGen256", "KeyGenerator", C17214.m40154(configurableProvider, "KeyGenerator", C22697.m50267(C17922.m41616("$KeyGen128", "KeyGenerator", C12278.m30516("$KeyGen", "KeyGenerator.CAMELLIA", str, C17214.m40154(configurableProvider, "Alg.Alias.SecretKeyFactory", "CAMELLIA", str, aSN1ObjectIdentifier3), configurableProvider), aSN1ObjectIdentifier4, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier5), aSN1ObjectIdentifier6, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier), aSN1ObjectIdentifier2, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier3);
            sbM40154.append("$GMAC");
            addGMacAlgorithm(configurableProvider, "CAMELLIA", sbM40154.toString(), C15489.m37076(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "CAMELLIA", C15489.m37076(str, "$Poly1305"), C15489.m37076(str, "$Poly1305KeyGen"));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new CamelliaEngine()));
        }
    }

    public class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Camellia", 256, new Poly1305KeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new CamelliaEngine()), 16);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new CamelliaWrapEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(128, new CamelliaWrapEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap192 extends BaseWrapCipher {
        public Wrap192() {
            super(192, new CamelliaWrapEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(256, new CamelliaWrapEngine());
        }
    }
}
