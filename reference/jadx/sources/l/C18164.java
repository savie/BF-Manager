package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18164 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m42285(String str) throws IOException {
        C5079 c5079M39297 = C16737.m39297();
        C6490 c6490 = new C6490();
        c6490.m17686(str);
        C18485 c18485Execute = c5079M39297.m14157(c6490.m17678()).execute();
        if (c18485Execute.m42863()) {
            AbstractC19191 abstractC19191M42860 = c18485Execute.m42860();
            if (abstractC19191M42860 == null) {
                throw new IOException("Response body is null");
            }
            return abstractC19191M42860.m44052();
        }
        throw new IOException("Response code: " + c18485Execute.m42858() + "\nMessage: " + c18485Execute.m42868());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static HashMap m42286(String str) {
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
