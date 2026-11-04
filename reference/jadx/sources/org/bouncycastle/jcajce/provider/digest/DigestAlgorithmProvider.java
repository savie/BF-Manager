package org.bouncycastle.jcajce.provider.digest;

import l.C18011;
import l.C25272;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strM56409 = C25272.m56409("HMAC", str);
        configurableProvider.addAlgorithm("Mac." + strM56409, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, strM56409);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, strM56409);
        configurableProvider.addAlgorithm("KeyGenerator." + strM56409, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, strM56409);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, strM56409);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strM56409 = C25272.m56409("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, strM56409);
        C18011.m41992(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, strM56409);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strM56409 = C25272.m56409("KMAC", str);
        configurableProvider.addAlgorithm("Mac." + strM56409, str2);
        configurableProvider.addAlgorithm("KeyGenerator." + strM56409, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, strM56409);
    }
}
