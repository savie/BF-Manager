package org.bouncycastle.jcajce.provider.symmetric;

import l.C5800;
import l.C9023;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.GOST3412_2015Engine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.G3413CBCBlockCipher;
import org.bouncycastle.crypto.modes.G3413CFBBlockCipher;
import org.bouncycastle.crypto.modes.G3413CTRBlockCipher;
import org.bouncycastle.crypto.modes.G3413OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class GOST3412_2015 {

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC extends BaseBlockCipher {
        public CBC() {
            super((BlockCipher) new G3413CBCBlockCipher(new GOST3412_2015Engine()), false, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CTR extends BaseBlockCipher {
        public CTR() {
            super(new BufferedBlockCipher(new G3413CTRBlockCipher(new GOST3412_2015Engine())), true, 64);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new GOST3412_2015Engine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new BufferedBlockCipher(new G3413CFBBlockCipher(new GOST3412_2015Engine())), false, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GCFB8 extends BaseBlockCipher {
        public GCFB8() {
            super(new BufferedBlockCipher(new G3413CFBBlockCipher(new GOST3412_2015Engine(), 8)), false, 128);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("GOST3412-2015", i, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mac extends BaseMac {
        public Mac() {
            super(new CMac(new GOST3412_2015Engine()));
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = GOST3412_2015.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C5800.m15969(str, "$Mac", "Mac.GOST3412MAC", C9023.m23357(str, "$KeyGen", "KeyGenerator.GOST3412-2015", C9023.m23357(str, "$CTR", "Cipher.GOST3412-2015/CTR", C9023.m23357(str, "$CBC", "Cipher.GOST3412-2015/CBC", C9023.m23357(str, "$OFB", "Cipher.GOST3412-2015/OFB", C9023.m23357(str, "$GCFB8", "Cipher.GOST3412-2015/CFB8", C9023.m23357(str, "$GCFB", "Cipher.GOST3412-2015/CFB", C9023.m23357(str, "$ECB", "Cipher.GOST3412-2015", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST3412-2015", "GOST3412MAC");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new G3413OFBBlockCipher(new GOST3412_2015Engine())), false, 128);
        }
    }
}
