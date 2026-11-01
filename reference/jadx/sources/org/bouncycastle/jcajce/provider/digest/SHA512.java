package org.bouncycastle.jcajce.provider.digest;

import l.C0252;
import l.C12278;
import l.C12441;
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
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: loaded from: classes.dex */
public class SHA512 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA512Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA512Digest((SHA512Digest) this.digest);
            return digest;
        }
    }

    public class DigestT extends BCMessageDigest implements Cloneable {
        public DigestT(int i) {
            super(new SHA512tDigest(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            DigestT digestT = (DigestT) super.clone();
            digestT.digest = new SHA512tDigest((SHA512tDigest) this.digest);
            return digestT;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DigestT224 extends DigestT {
        public DigestT224() {
            super(BERTags.FLAGS);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA512Digest()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new HMac(new SHA512tDigest(BERTags.FLAGS)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new HMac(new SHA512tDigest(256)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA512", null);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory224 extends BaseSecretKeyFactory {
        public KeyFactory224() {
            super("HmacSHA512/224", null);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory256 extends BaseSecretKeyFactory {
        public KeyFactory256() {
            super("HmacSHA512/256", null);
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA512", 512, new CipherKeyGenerator());
        }
    }

    public class KeyGeneratorT224 extends BaseKeyGenerator {
        public KeyGeneratorT224() {
            super("HMACSHA512/224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public class KeyGeneratorT256 extends BaseKeyGenerator {
        public KeyGeneratorT256() {
            super("HMACSHA512/256", 256, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = SHA512.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C5800.m15969(str, "$Digest", "MessageDigest.SHA-512", sb, configurableProvider);
            C12441.m30916(C22697.m50268(XMSSKeyParameters.SHA_512, str, C18917.m43575(configurableProvider, "Alg.Alias.MessageDigest.SHA512", XMSSKeyParameters.SHA_512, "Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512, configurableProvider), "$DigestT224", configurableProvider, "MessageDigest.SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(224)", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(224)", "SHA-512/224");
            C12441.m30916(C22697.m50268("SHA-512/224", str, new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512_224, configurableProvider), "$DigestT256", configurableProvider, "MessageDigest.SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/256", SPHINCSKeyParameters.SHA512_256);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512256", SPHINCSKeyParameters.SHA512_256);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(256)", SPHINCSKeyParameters.SHA512_256);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(256)", SPHINCSKeyParameters.SHA512_256);
            StringBuilder sbM30516 = C12278.m30516("$HashMac", "Mac.PBEWITHHMACSHA512", str, C12278.m30516("$OldSHA512", "Mac.OLDHMACSHA512", str, C22697.m50268(SPHINCSKeyParameters.SHA512_256, str, new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512_256, configurableProvider), configurableProvider), configurableProvider);
            sbM30516.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA512", sbM30516.toString(), C15489.m37076(str, "$KeyGenerator"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_hmacWithSHA512;
            addHMACAlias(configurableProvider, "SHA512", aSN1ObjectIdentifier);
            addHMACAlgorithm(configurableProvider, "SHA512/224", C15489.m37076(str, "$HashMacT224"), C15489.m37076(str, "$KeyGeneratorT224"));
            addHMACAlgorithm(configurableProvider, "SHA512/256", C15489.m37076(str, "$HashMacT256"), C15489.m37076(str, "$KeyGeneratorT256"));
            C12441.m30916(C22697.m50268("HMACSHA512", str, C0252.m1694(str, "$KeyFactory", "SecretKeyFactory.HMACSHA512", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier, configurableProvider), "$KeyFactory224", configurableProvider, "SecretKeyFactory.HMACSHA512/224");
            C12441.m30916(C22697.m50268("HMACSHA512/224", str, C18917.m43575(configurableProvider, "Alg.Alias.SecretKeyFactory.HMACSHA512(224)", "HMACSHA512/224", "Alg.Alias.SecretKeyFactory."), PKCSObjectIdentifiers.id_hmacWithSHA512_224, configurableProvider), "$KeyFactory256", configurableProvider, "SecretKeyFactory.HMACSHA512/256");
            C7997.m21058(C18917.m43575(configurableProvider, "Alg.Alias.SecretKeyFactory.HMACSHA512(256)", "HMACSHA512/256", "Alg.Alias.SecretKeyFactory."), PKCSObjectIdentifiers.id_hmacWithSHA512_256, configurableProvider, "HMACSHA512/256");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OldSHA512 extends BaseMac {
        public OldSHA512() {
            super(new OldHMac(new SHA512Digest()));
        }
    }
}
