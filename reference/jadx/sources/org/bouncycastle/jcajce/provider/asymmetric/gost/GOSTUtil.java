package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
import l.C4794;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class GOSTUtil {
    public static String generateKeyFingerprint(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        return new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), gOST3410Parameters.getP().toByteArray(), gOST3410Parameters.getA().toByteArray())).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuilder sb = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        BigInteger bigIntegerModPow = gOST3410Parameters.getA().modPow(bigInteger, gOST3410Parameters.getP());
        sb.append(str);
        sb.append(" Private Key [");
        C4794.m14774(sb, generateKeyFingerprint(bigIntegerModPow, gOST3410Parameters), "]", strLineSeparator, "                  Y: ");
        sb.append(bigIntegerModPow.toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuilder sb = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        sb.append(str);
        sb.append(" Public Key [");
        C4794.m14774(sb, generateKeyFingerprint(bigInteger, gOST3410Parameters), "]", strLineSeparator, "                 Y: ");
        sb.append(bigInteger.toString(16));
        sb.append(strLineSeparator);
        return sb.toString();
    }
}
