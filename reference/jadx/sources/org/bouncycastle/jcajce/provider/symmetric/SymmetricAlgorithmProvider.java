package org.bouncycastle.jcajce.provider.symmetric;

import l.C0252;
import l.C16523;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addPoly1305Algorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac.POLY1305-" + str, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.POLY1305" + str, "POLY1305-" + str);
        configurableProvider.addAlgorithm("KeyGenerator.POLY1305-" + str, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.POLY1305" + str, "POLY1305-" + str);
    }

    public void addCMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-CMAC", str2);
        StringBuilder sbM1694 = C0252.m1694(str, "-CMAC", C16523.m38890("Alg.Alias.Mac.", str, "CMAC"), "KeyGenerator.", configurableProvider);
        sbM1694.append(str);
        sbM1694.append("-CMAC");
        configurableProvider.addAlgorithm(sbM1694.toString(), str3);
        configurableProvider.addAlgorithm(C16523.m38890("Alg.Alias.KeyGenerator.", str, "CMAC"), str + "-CMAC");
    }

    public void addGMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-GMAC", str2);
        StringBuilder sbM1694 = C0252.m1694(str, "-GMAC", C16523.m38890("Alg.Alias.Mac.", str, "GMAC"), "KeyGenerator.", configurableProvider);
        sbM1694.append(str);
        sbM1694.append("-GMAC");
        configurableProvider.addAlgorithm(sbM1694.toString(), str3);
        configurableProvider.addAlgorithm(C16523.m38890("Alg.Alias.KeyGenerator.", str, "GMAC"), str + "-GMAC");
    }
}
