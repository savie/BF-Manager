package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;
import l.C18917;
import l.C7997;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class GM {
    public static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.ec.";
    public static final Map generalSm2Attributes;

    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            C7997.m21058(C18917.m43575(configurableProvider, "Signature.SHA256WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sha256WithSM2", "Alg.Alias.Signature."), GMObjectIdentifiers.sm2sign_with_sha256, configurableProvider, "SHA256WITHSM2");
            C7997.m21058(C18917.m43575(configurableProvider, "Signature.SM3WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sm3WithSM2", "Alg.Alias.Signature."), GMObjectIdentifiers.sm2sign_with_sm3, configurableProvider, "SM3WITHSM2");
            configurableProvider.addAlgorithm("KeyPairGenerator.SM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMKeyPairGeneratorSpi$SM2");
            configurableProvider.addAlgorithm("Cipher.SM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.SM2WITHSM3", "SM2");
            C7997.m21058(new StringBuilder("Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sm3, configurableProvider, "SM2");
            C7997.m21058(C18917.m43575(configurableProvider, "Cipher.SM2WITHBLAKE2B", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2b", "Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_blake2b512, configurableProvider, "SM2WITHBLAKE2B");
            C7997.m21058(C18917.m43575(configurableProvider, "Cipher.SM2WITHBLAKE2S", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2s", "Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_blake2s256, configurableProvider, "SM2WITHBLAKE2S");
            C7997.m21058(C18917.m43575(configurableProvider, "Cipher.SM2WITHWHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withWhirlpool", "Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_whirlpool, configurableProvider, "SM2WITHWHIRLPOOL");
            C7997.m21058(C18917.m43575(configurableProvider, "Cipher.SM2WITHMD5", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withMD5", "Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_md5, configurableProvider, "SM2WITHMD5");
            C7997.m21058(C18917.m43575(configurableProvider, "Cipher.SM2WITHRIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withRMD", "Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_rmd160, configurableProvider, "SM2WITHRIPEMD160");
            C7997.m21058(C18917.m43575(configurableProvider, "Cipher.SM2WITHSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha1", "Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sha1, configurableProvider, "SM2WITHSHA1");
            C7997.m21058(C18917.m43575(configurableProvider, "Cipher.SM2WITHSHA224", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha224", "Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sha224, configurableProvider, "SM2WITHSHA224");
            C7997.m21058(C18917.m43575(configurableProvider, "Cipher.SM2WITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha256", "Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sha256, configurableProvider, "SM2WITHSHA256");
            C7997.m21058(C18917.m43575(configurableProvider, "Cipher.SM2WITHSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha384", "Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sha384, configurableProvider, "SM2WITHSHA384");
            C7997.m21058(C18917.m43575(configurableProvider, "Cipher.SM2WITHSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha512", "Alg.Alias.Cipher."), GMObjectIdentifiers.sm2encrypt_with_sha512, configurableProvider, "SM2WITHSHA512");
        }
    }

    static {
        HashMap map = new HashMap();
        generalSm2Attributes = map;
        map.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
