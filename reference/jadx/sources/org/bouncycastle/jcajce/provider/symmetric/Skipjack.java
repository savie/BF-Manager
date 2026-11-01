package org.bouncycastle.jcajce.provider.symmetric;

import l.C23234;
import l.C5800;
import l.C9023;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SkipjackEngine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class Skipjack {

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Skipjack IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new SkipjackEngine());
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Skipjack", 80, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mac extends BaseMac {
        public Mac() {
            super(new CBCBlockCipherMac(new SkipjackEngine()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class MacCFB8 extends BaseMac {
        public MacCFB8() {
            super(new CFBBlockCipherMac(new SkipjackEngine()));
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = Skipjack.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C5800.m15969(str, "$Mac", "Mac.SKIPJACKMAC", C9023.m23357(str, "$AlgParams", "AlgorithmParameters.SKIPJACK", C9023.m23357(str, "$KeyGen", "KeyGenerator.SKIPJACK", C9023.m23357(str, "$ECB", "Cipher.SKIPJACK", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Mac.SKIPJACKMAC/CFB8", C23234.m51270("Alg.Alias.Mac.SKIPJACK", "SKIPJACKMAC", str, "$MacCFB8", configurableProvider));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.SKIPJACK/CFB8", "SKIPJACKMAC/CFB8");
        }
    }
}
