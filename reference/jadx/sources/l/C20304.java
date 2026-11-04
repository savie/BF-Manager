package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21YS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20304 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f65173 = {".jpg", ".jpeg", ".png", ".gif", ".wav", ".mp2", ".mp3", ".ogg", ".aac", ".mpg", ".mpeg", ".mid", ".midi", ".smf", ".jet", ".rtttl", ".imy", ".xmf", ".mp4", ".m4a", ".m4v", ".3gp", ".3gpp", ".3g2", ".3gpp2", ".amr", ".awb", ".wma", ".wmv", ".apk", ".zip", ".jar", ".xz"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46644(String str, C3150 c3150) {
        boolean z;
        String lowerCase = str.toLowerCase();
        if ((c3150.f10213 && lowerCase.toLowerCase().startsWith("lib/")) || ((c3150.f10214 && lowerCase.toLowerCase().endsWith(".dex")) || lowerCase.startsWith("assets/dexopt/"))) {
            z = false;
            break;
        }
        z = true;
        if (lowerCase.equals("resources.arsc")) {
            z = true ^ c3150.f10212;
        } else {
            for (int i = 0; i < 33; i++) {
                if (lowerCase.endsWith(f65173[i])) {
                    z = false;
                    break;
                }
            }
        }
        return z ? 8 : 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m46647(C8002 c8002, C3150 c3150) {
        String name = c8002.getName();
        return ((c3150.f10213 && name.toLowerCase().startsWith("lib/")) || (c3150.f10214 && name.toLowerCase().endsWith(".dex"))) && c8002.m21826() != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46646(C22941 c22941, C25179 c25179, C8002 c8002, C3150 c3150, InterfaceC3573 interfaceC3573) {
        if (!m46647(c8002, c3150)) {
            if (interfaceC3573 == null) {
                c25179.m56126(c8002, c22941);
                return;
            } else {
                c25179.m56127(c8002, c22941, interfaceC3573);
                return;
            }
        }
        int iM56133 = c25179.m56133();
        try {
            c25179.m56135(0);
            c25179.m56125(c8002);
            InputStream inputStreamM51727 = c22941.m51727(c8002);
            try {
                byte[] bArr = new byte[8192];
                long j = 0;
                while (true) {
                    int i = inputStreamM51727.read(bArr);
                    if (i != -1) {
                        c25179.write(bArr, 0, i);
                        long j2 = i;
                        long j3 = j + j2;
                        if (interfaceC3573 != null) {
                            interfaceC3573.mo3466(j2, j3, c8002.getSize());
                            if (interfaceC3573.mo924()) {
                                inputStreamM51727.close();
                                c25179.m56135(iM56133);
                                return;
                            }
                        }
                        j = j3;
                    } else {
                        inputStreamM51727.close();
                        c25179.m56134();
                        c25179.m56135(iM56133);
                        return;
                    }
                    c25179.m56135(iM56133);
                    throw th;
                }
            } catch (Throwable th) {
                try {
                    inputStreamM51727.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            c25179.m56135(iM56133);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m46645(C8002 c8002, C3150 c3150) {
        return m46647(c8002, c3150) ? c8002.getSize() : c8002.m21838();
    }
}
