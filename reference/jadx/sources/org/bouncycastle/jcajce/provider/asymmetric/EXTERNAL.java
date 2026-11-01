package org.bouncycastle.jcajce.provider.asymmetric;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import l.C18917;
import l.C19028;
import l.C9013;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bc.ExternalValue;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.ExternalPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: loaded from: classes.dex */
public class EXTERNAL {
    public static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL";
    public static AsymmetricKeyInfoConverter baseConverter;
    public static final Map externalAttributes;

    public class ExternalKeyInfoConverter implements AsymmetricKeyInfoConverter {
        public final ConfigurableProvider provider;

        public ExternalKeyInfoConverter(ConfigurableProvider configurableProvider) {
            this.provider = configurableProvider;
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
            throw new UnsupportedOperationException("no support for private key");
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
            return new ExternalPublicKey(ExternalValue.getInstance(subjectPublicKeyInfo.parsePublicKey()));
        }
    }

    public class KeyFactory extends BaseKeyFactorySpi {
        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
            return EXTERNAL.baseConverter.generatePrivate(privateKeyInfo);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
            return EXTERNAL.baseConverter.generatePublic(subjectPublicKeyInfo);
        }

        @Override // java.security.KeyFactorySpi
        public Key engineTranslateKey(Key key) throws InvalidKeyException {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(PrivateKeyInfo.getInstance(key.getEncoded()));
                }
                if (key instanceof PublicKey) {
                    return generatePublic(SubjectPublicKeyInfo.getInstance(key.getEncoded()));
                }
                throw new InvalidKeyException("key not recognized");
            } catch (IOException e) {
                throw new InvalidKeyException(C9013.m23329(e, new StringBuilder("key could not be parsed: ")));
            }
        }
    }

    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sbM43575 = C18917.m43575(configurableProvider, "KeyFactory.EXTERNAL", "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL$KeyFactory", "KeyFactory.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.external_value;
            StringBuilder sbM43760 = C19028.m43760("org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL$KeyFactory", "KeyFactory.OID.", sbM43575, aSN1ObjectIdentifier, configurableProvider);
            sbM43760.append(aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm(sbM43760.toString(), "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL$KeyFactory");
            AsymmetricKeyInfoConverter unused = EXTERNAL.baseConverter = new ExternalKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, EXTERNAL.baseConverter);
        }
    }

    static {
        HashMap map = new HashMap();
        externalAttributes = map;
        map.put("SupportedKeyClasses", "org.bouncycastle.jcajce.ExternalPublicKey");
        map.put("SupportedKeyFormats", "X.509");
    }
}
