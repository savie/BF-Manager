package org.bouncycastle.jcajce.provider.digest;

import l.C0252;
import l.C12278;
import l.C15489;
import l.C18917;
import l.C22697;
import l.C5800;
import l.C7997;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class SHA224 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA224Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA224Digest((SHA224Digest) this.digest);
            return digest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA224Digest()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA224", null);
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = SHA224.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C5800.m15969(str, "$Digest", "MessageDigest.SHA-224", sb, configurableProvider);
            StringBuilder sbM30516 = C12278.m30516("$HashMac", "Mac.PBEWITHHMACSHA224", str, C22697.m50268("SHA-224", str, C18917.m43575(configurableProvider, "Alg.Alias.MessageDigest.SHA224", "SHA-224", "Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha224, configurableProvider), configurableProvider);
            sbM30516.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA224", sbM30516.toString(), C15489.m37076(str, "$KeyGenerator"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_hmacWithSHA224;
            addHMACAlias(configurableProvider, "SHA224", aSN1ObjectIdentifier);
            C7997.m21058(C0252.m1694(str, "$KeyFactory", "SecretKeyFactory.HMACSHA224", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier, configurableProvider, "HMACSHA224");
        }
    }
}
