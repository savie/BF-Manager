package org.bouncycastle.jcajce.provider.util;

import java.util.Map;
import l.C1679;
import l.C7997;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        addSignatureAlgorithm(configurableProvider, str, str2, str3, null);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strM5594 = C1679.m5594(str, "WITH", str2);
        String strM5595 = C1679.m5594(str, "with", str2);
        String strM5596 = C1679.m5594(str, "With", str2);
        String strM5597 = C1679.m5594(str, "/", str2);
        configurableProvider.addAlgorithm("Signature." + strM5594, str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM5595, strM5594);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM5596, strM5594);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM5597, strM5594);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, strM5594);
            C7997.m21058(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, strM5594);
        }
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier, Map map) {
        String strM5594 = C1679.m5594(str, "WITH", str2);
        String strM5595 = C1679.m5594(str, "with", str2);
        String strM5596 = C1679.m5594(str, "With", str2);
        String strM5597 = C1679.m5594(str, "/", str2);
        configurableProvider.addAlgorithm("Signature." + strM5594, str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM5595, strM5594);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM5596, strM5594);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + strM5597, strM5594);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, strM5594);
            C7997.m21058(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, strM5594);
        }
        configurableProvider.addAttributes("Signature." + strM5594, map);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Signature." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, str);
            C7997.m21058(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier, str);
    }

    public void addCipherAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Cipher." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + aSN1ObjectIdentifier, str);
            C7997.m21058(new StringBuilder("Alg.Alias.Cipher.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addKeyFactoryAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("KeyFactory." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
            C7997.m21058(new StringBuilder("Alg.Alias.KeyFactory.OID."), aSN1ObjectIdentifier, configurableProvider, str);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    public void addKeyGeneratorAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("KeyGenerator." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + aSN1ObjectIdentifier, str);
            C7997.m21058(new StringBuilder("Alg.Alias.KeyGenerator.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addKeyPairGeneratorAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("KeyPairGenerator." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + aSN1ObjectIdentifier, str);
            C7997.m21058(new StringBuilder("Alg.Alias.KeyPairGenerator.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addSignatureAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, str);
        C7997.m21058(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void registerKeyFactoryOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
        C7997.m21058(new StringBuilder("Alg.Alias.KeyFactory.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
        C7997.m21058(new StringBuilder("Alg.Alias.KeyPairGenerator."), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, str);
        C7997.m21058(new StringBuilder("Alg.Alias.AlgorithmParameters."), aSN1ObjectIdentifier, configurableProvider, str);
    }
}
