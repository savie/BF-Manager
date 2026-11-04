package l;

import com.google.android.material.badge.BadgeDrawable;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6JU */
/* JADX INFO: loaded from: classes2.dex */
public final class C4935 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f17209 = Pattern.compile("\\s*(\\S+?) # Group 1: parameter name\n\\s*=\\s* # Match equals sign\n(?: # non-capturing group of options\n   '( (?: [^'\\\\] | \\\\. )* )' # Group 2: single-quoted\n | \"( (?: [^\"\\\\] | \\\\. )*  )\" # Group 3: double-quoted\n | ( [^'\"][^;\\s]* ) # Group 4: un-quoted parameter\n)\\s*;? # Optional end semicolon", 4);

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[PHI: r9
      0x004f: PHI (r9v7 java.lang.String) = (r9v4 java.lang.String), (r9v9 java.lang.String) binds: [B:22:0x005e, B:16:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d8, code lost:
    
        if (r14.equalsIgnoreCase(r15) == false) goto L62;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m15144(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4935.m15144(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15143(String str, String str2) {
        Charset charsetForName = Charset.forName(str2);
        StringBuilder sb = new StringBuilder();
        for (byte b : charsetForName.encode(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX).array()) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return str.replaceAll("\\+", sb.toString());
    }
}
