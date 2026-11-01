package org.bouncycastle.jcajce.provider.digest;

import l.C0252;
import l.C12278;
import l.C15489;
import l.C18917;
import l.C22697;
import l.C5800;
import l.C7997;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes.dex */
public class SHA384 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA384Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA384Digest((SHA384Digest) this.digest);
            return digest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA384Digest()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA384", null);
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = SHA384.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C5800.m15969(str, "$Digest", "MessageDigest.SHA-384", sb, configurableProvider);
            StringBuilder sbM30516 = C12278.m30516("$HashMac", "Mac.PBEWITHHMACSHA384", str, C12278.m30516("$OldSHA384", "Mac.OLDHMACSHA384", str, C22697.m50268("SHA-384", str, C18917.m43575(configurableProvider, "Alg.Alias.MessageDigest.SHA384", "SHA-384", "Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha384, configurableProvider), configurableProvider), configurableProvider);
            sbM30516.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA384", sbM30516.toString(), C15489.m37076(str, "$KeyGenerator"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_hmacWithSHA384;
            addHMACAlias(configurableProvider, "SHA384", aSN1ObjectIdentifier);
            C7997.m21058(C0252.m1694(str, "$KeyFactory", "SecretKeyFactory.HMACSHA384", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier, configurableProvider, "HMACSHA384");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OldSHA384 extends BaseMac {
        public OldSHA384() {
            super(new OldHMac(new SHA384Digest()));
        }
    }
}
