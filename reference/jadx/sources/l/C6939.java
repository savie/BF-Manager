package l;

import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۜᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97G0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6939 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18688(C3073 c3073) {
        c3073.m9248("StrictHostKeyChecking", "no");
        c3073.m9248("server_host_key", m18687(c3073.m9231("server_host_key")));
        c3073.m9248("PubkeyAcceptedAlgorithms", m18687(c3073.m9231("PubkeyAcceptedAlgorithms")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18687(String str) {
        if (str == null || str.isEmpty()) {
            return OpenSSHPublicKeyUtil.RSA;
        }
        for (String str2 : str.split(",")) {
            if (OpenSSHPublicKeyUtil.RSA.equals(str2.trim())) {
                return str;
            }
        }
        return str.concat(",ssh-rsa");
    }
}
