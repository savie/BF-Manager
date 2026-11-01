package org.bouncycastle.jcajce.provider.digest;

import l.C0252;
import l.C7997;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strM1693 = C0252.m1693("HMAC", str);
        configurableProvider.addAlgorithm("Mac." + strM1693, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, strM1693);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, strM1693);
        configurableProvider.addAlgorithm("KeyGenerator." + strM1693, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, strM1693);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, strM1693);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strM1693 = C0252.m1693("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, strM1693);
        C7997.m21058(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, strM1693);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strM1693 = C0252.m1693("KMAC", str);
        configurableProvider.addAlgorithm("Mac." + strM1693, str2);
        configurableProvider.addAlgorithm("KeyGenerator." + strM1693, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, strM1693);
    }
}
