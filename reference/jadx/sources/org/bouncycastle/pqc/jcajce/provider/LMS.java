package org.bouncycastle.pqc.jcajce.provider;

import l.C16236;
import l.C18917;
import l.C7997;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes2.dex */
public class LMS {
    public static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.lms.";

    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sbM43575 = C18917.m43575(configurableProvider, "KeyFactory.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi", "Alg.Alias.KeyFactory.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_hss_lms_hashsig;
            C7997.m21058(sbM43575, aSN1ObjectIdentifier, configurableProvider, "LMS");
            configurableProvider.addAlgorithm(C16236.m38349(configurableProvider, "KeyPairGenerator.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyPairGeneratorSpi", "Alg.Alias.KeyPairGenerator.", aSN1ObjectIdentifier), "LMS");
            configurableProvider.addAlgorithm("Signature.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi$generic");
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, "LMS");
        }
    }
}
