package org.bouncycastle.jcajce.provider.digest;

import l.C0252;
import l.C15489;
import l.C22697;
import l.C5800;
import l.C7997;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.digests.GOST3411_2012_256Digest;
import org.bouncycastle.crypto.digests.GOST3411_2012_512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.internal.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class GOST3411 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new GOST3411Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new GOST3411Digest((GOST3411Digest) this.digest);
            return digest;
        }
    }

    public class Digest2012_256 extends BCMessageDigest implements Cloneable {
        public Digest2012_256() {
            super(new GOST3411_2012_256Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest2012_256 digest2012_256 = (Digest2012_256) super.clone();
            digest2012_256.digest = new GOST3411_2012_256Digest((GOST3411_2012_256Digest) this.digest);
            return digest2012_256;
        }
    }

    public class Digest2012_512 extends BCMessageDigest implements Cloneable {
        public Digest2012_512() {
            super(new GOST3411_2012_512Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest2012_512 digest2012_512 = (Digest2012_512) super.clone();
            digest2012_512.digest = new GOST3411_2012_512Digest((GOST3411_2012_512Digest) this.digest);
            return digest2012_512;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new GOST3411Digest()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac2012_256 extends BaseMac {
        public HashMac2012_256() {
            super(new HMac(new GOST3411_2012_256Digest()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac2012_512 extends BaseMac {
        public HashMac2012_512() {
            super(new HMac(new GOST3411_2012_512Digest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACGOST3411", 256, new CipherKeyGenerator());
        }
    }

    public class KeyGenerator2012_256 extends BaseKeyGenerator {
        public KeyGenerator2012_256() {
            super("HMACGOST3411", 256, new CipherKeyGenerator());
        }
    }

    public class KeyGenerator2012_512 extends BaseKeyGenerator {
        public KeyGenerator2012_512() {
            super("HMACGOST3411", 512, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = GOST3411.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C5800.m15969(str, "$Digest", "MessageDigest.GOST3411", sb, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST", "GOST3411");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.MessageDigest.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR3411;
            StringBuilder sbM50268 = C22697.m50268("GOST3411", str, sb2, aSN1ObjectIdentifier, configurableProvider);
            sbM50268.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "GOST3411", sbM50268.toString(), C15489.m37076(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "GOST3411", aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-256", str + "$Digest2012_256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-256", "GOST3411-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-256", "GOST3411-2012-256");
            StringBuilder sbM50269 = C22697.m50268("GOST3411-2012-256", str, new StringBuilder("Alg.Alias.MessageDigest."), RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256, configurableProvider);
            sbM50269.append("$HashMac2012_256");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-256", sbM50269.toString(), C15489.m37076(str, "$KeyGenerator2012_256"));
            addHMACAlias(configurableProvider, "GOST3411-2012-256", RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_256);
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-512", str + "$Digest2012_512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-512", "GOST3411-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-512", "GOST3411-2012-512");
            StringBuilder sbM502610 = C22697.m50268("GOST3411-2012-512", str, new StringBuilder("Alg.Alias.MessageDigest."), RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512, configurableProvider);
            sbM502610.append("$HashMac2012_512");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-512", sbM502610.toString(), C15489.m37076(str, "$KeyGenerator2012_512"));
            addHMACAlias(configurableProvider, "GOST3411-2012-512", RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_512);
            C7997.m21058(C0252.m1694(str, "$PBEWithMacKeyFactory", "SecretKeyFactory.PBEWITHHMACGOST3411", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier, configurableProvider, "PBEWITHHMACGOST3411");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacGOST3411", null, false, 2, 6, 256, 0);
        }
    }
}
