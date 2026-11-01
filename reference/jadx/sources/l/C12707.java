package l;

import com.alipay.sdk.m.y.l;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 37C1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12707 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Set f42381;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Object f42379 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f42380 = {"-lnt:numbers,table", "-lvt"};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f42382 = Pattern.compile("^\\s*//\\s*(\\d+)#(?:.*)?$");

    static {
        Object[] objArr = {"var", "type", "endvar", "endtype", "try", "endtry", "catch", "locals_map", "stack_map"};
        HashSet hashSet = new HashSet(9);
        for (int i = 0; i < 9; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        f42381 = C0561.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31549(byte[] bArr) {
        String strM31552;
        if (bArr.length == 0) {
            throw new IllegalArgumentException("classBytes must not be empty.");
        }
        synchronized (f42379) {
            try {
                C19606 c19606 = new C19606();
                C16078 c16078 = new C16078();
                if (new C16620(c19606, c16078, new C4788(bArr), f42380).m39082() != 0) {
                    throw m31550("Jdis disassembly failed.", c16078.toString(), null);
                }
                int size = c19606.m44697().size();
                if (size != 1) {
                    throw m31550("Jdis disassembly produced " + size + " jasm outputs, but this API only supports a single output.", c16078.toString(), null);
                }
                String strM21747 = ((C8317) c19606.m44697().get(0)).m21747();
                if (strM21747 == null || strM21747.isEmpty()) {
                    throw m31550("Jdis disassembly succeeded but produced no jasm text.", c16078.toString(), null);
                }
                strM31552 = m31552(strM21747);
            } catch (RuntimeException e) {
                throw m31550("Unexpected exception while running Jdis.", null, e);
            } catch (C17645 e2) {
                throw e2;
            }
        }
        return strM31552;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m31551(String str) {
        byte[] bArrM11611;
        if (str == null) {
            throw new IllegalArgumentException("jasmSource must not be null.");
        }
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("jasmSource must not be blank.");
        }
        synchronized (f42379) {
            try {
                C6905 c6905 = new C6905();
                C16078 c16078 = new C16078();
                if (new C17406(c6905, c16078, new C5494(str.getBytes(StandardCharsets.UTF_8))).m40574() != 0) {
                    throw m31550("Jasm assembly failed.", c16078.toString(), null);
                }
                int size = c6905.m18526().size();
                if (size != 1) {
                    throw m31550("Jasm assembly produced " + size + " class outputs, but this API only supports a single output.", c16078.toString(), null);
                }
                bArrM11611 = ((C4082) c6905.m18526().get(0)).m11611();
                if (bArrM11611 == null || bArrM11611.length == 0) {
                    throw m31550("Jasm assembly succeeded but produced no class data.", c16078.toString(), null);
                }
            } catch (RuntimeException e) {
                throw m31550("Unexpected exception while running Jasm.", null, e);
            } catch (C17645 e2) {
                throw e2;
            }
        }
        return bArrM11611;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17645 m31550(String str, String str2, RuntimeException runtimeException) {
        if ((str2 == null || str2.trim().isEmpty()) && runtimeException != null) {
            str2 = C9023.m23355((Throwable) runtimeException);
        }
        if (str2 != null) {
            str2.trim().isEmpty();
        }
        return new C17645(str);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m31552(String str) {
        boolean z;
        String str2 = str.contains("\r\n") ? "\r\n" : "\n";
        String[] strArrSplit = str.split("\\R", -1);
        StringBuilder sb = new StringBuilder(str.length() + 64);
        String strGroup = null;
        for (int i = 0; i < strArrSplit.length; i++) {
            String strM5594 = strArrSplit[i];
            Matcher matcher = f42382.matcher(strM5594);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
            } else {
                if (strGroup != null) {
                    String strTrim = strM5594.trim();
                    if (strTrim.isEmpty() || strTrim.startsWith("//") || !strTrim.endsWith(l.b) || strTrim.startsWith("line ") || strTrim.startsWith("LineTable") || strTrim.startsWith("SourceFile")) {
                        z = false;
                    } else {
                        int iIndexOf = strTrim.indexOf(58);
                        if (iIndexOf > 0) {
                            String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                            if (!strTrim2.isEmpty()) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= strTrim2.length()) {
                                        strTrim = strTrim.substring(iIndexOf + 1).trim();
                                        break;
                                    }
                                    if (!Character.isLetterOrDigit((int) strTrim2.charAt(i2))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                        int iIndexOf2 = strTrim.indexOf(32);
                        if (iIndexOf2 < 0) {
                            iIndexOf2 = strTrim.indexOf(59);
                        }
                        if (iIndexOf2 < 0) {
                            z = false;
                        } else {
                            z = !f42381.contains(strTrim.substring(0, iIndexOf2));
                        }
                    }
                    if (z) {
                        strM5594 = C1679.m5594(strM5594, "  // line ", strGroup);
                        strGroup = null;
                    }
                }
                sb.append(strM5594);
                if (i < strArrSplit.length - 1) {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }
}
