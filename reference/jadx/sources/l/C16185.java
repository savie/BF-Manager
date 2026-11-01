package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ܺ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16185 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f52265 = {".jpg", ".jpeg", ".png", ".gif", ".wav", ".mp2", ".mp3", ".ogg", ".aac", ".mpg", ".mpeg", ".mid", ".midi", ".smf", ".jet", ".rtttl", ".imy", ".xmf", ".mp4", ".m4a", ".m4v", ".3gp", ".3gpp", ".3g2", ".3gpp2", ".amr", ".awb", ".wma", ".wmv", ".apk", ".zip", ".jar", ".xz"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38271(String str, C21123 c21123) {
        boolean z;
        String lowerCase = str.toLowerCase();
        if ((c21123.f68791 && lowerCase.toLowerCase().startsWith("lib/")) || ((c21123.f68792 && lowerCase.toLowerCase().endsWith(".dex")) || lowerCase.startsWith("assets/dexopt/"))) {
            z = false;
            break;
        }
        z = true;
        if (lowerCase.equals("resources.arsc")) {
            z = true ^ c21123.f68790;
        } else {
            for (int i = 0; i < 33; i++) {
                if (lowerCase.endsWith(f52265[i])) {
                    z = false;
                    break;
                }
            }
        }
        return z ? 8 : 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m38274(C12107 c12107, C21123 c21123) {
        String name = c12107.getName();
        return ((c21123.f68791 && name.toLowerCase().startsWith("lib/")) || (c21123.f68792 && name.toLowerCase().endsWith(".dex"))) && c12107.m30119() != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38273(C2455 c2455, C22918 c22918, C12107 c12107, C21123 c21123, InterfaceC10389 interfaceC10389) {
        if (!m38274(c12107, c21123)) {
            if (interfaceC10389 == null) {
                c22918.m50728(c12107, c2455);
                return;
            } else {
                c22918.m50729(c12107, c2455, interfaceC10389);
                return;
            }
        }
        int iM50737 = c22918.m50737();
        try {
            c22918.m50733(0);
            c22918.m50727(c12107);
            InputStream inputStreamM7471 = c2455.m7471(c12107);
            try {
                byte[] bArr = new byte[8192];
                long j = 0;
                while (true) {
                    int i = inputStreamM7471.read(bArr);
                    if (i != -1) {
                        c22918.write(bArr, 0, i);
                        long j2 = i;
                        long j3 = j + j2;
                        if (interfaceC10389 != null) {
                            interfaceC10389.mo2886(j2, j3, c12107.getSize());
                            if (interfaceC10389.mo2357()) {
                                inputStreamM7471.close();
                                c22918.m50733(iM50737);
                                return;
                            }
                        }
                        j = j3;
                    } else {
                        inputStreamM7471.close();
                        c22918.m50730();
                        c22918.m50733(iM50737);
                        return;
                    }
                    c22918.m50733(iM50737);
                    throw th;
                }
            } catch (Throwable th) {
                try {
                    inputStreamM7471.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            c22918.m50733(iM50737);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m38272(C12107 c12107, C21123 c21123) {
        return m38274(c12107, c21123) ? c12107.getSize() : c12107.m30138();
    }
}
