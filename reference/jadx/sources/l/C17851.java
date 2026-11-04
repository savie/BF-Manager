package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17851 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m41699(String str) throws IOException {
        C24363 c24363M49093 = C21576.m49093();
        C0496 c0496 = new C0496();
        c0496.m2397(str);
        C9444 c9444Execute = c24363M49093.m54450(c0496.m2389()).execute();
        if (c9444Execute.m24819()) {
            AbstractC8699 abstractC8699M24818 = c9444Execute.m24818();
            if (abstractC8699M24818 == null) {
                throw new IOException("Response body is null");
            }
            return abstractC8699M24818.m23393();
        }
        throw new IOException("Response code: " + c9444Execute.m24820() + "\nMessage: " + c9444Execute.m24825());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static HashMap m41700(String str) {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            String strSubstring = null;
            StringBuilder sb = null;
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String strTrim = line.trim();
                    if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
                        if (strSubstring != null) {
                            map.put(strSubstring, sb.toString());
                        }
                        strSubstring = strTrim.substring(1, strTrim.length() - 1);
                        sb = new StringBuilder();
                    } else if (strSubstring != null) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(line);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                return map;
            }
            if (strSubstring != null) {
                map.put(strSubstring, sb.toString());
            }
            bufferedReader.close();
            return map;
        } catch (IOException unused) {
            return map;
        }
    }
}
