package l;

import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.᩻ܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 97G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25198 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56177(C15723 c15723) {
        c15723.m37626("StrictHostKeyChecking", "no");
        c15723.m37626("server_host_key", m56176(c15723.m37607("server_host_key")));
        c15723.m37626("PubkeyAcceptedAlgorithms", m56176(c15723.m37607("PubkeyAcceptedAlgorithms")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56176(String str) {
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
