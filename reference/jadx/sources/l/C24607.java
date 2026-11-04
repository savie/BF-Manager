package l;

import com.alipay.sdk.m.y.l;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩺᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37C1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24607 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Set f79711;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Object f79713 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f79710 = {"-lnt:numbers,table", "-lvt"};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f79712 = Pattern.compile("^\\s*//\\s*(\\d+)#(?:.*)?$");

    static {
        Object[] objArr = {"var", "type", "endvar", "endtype", "try", "endtry", "catch", "locals_map", "stack_map"};
        HashSet hashSet = new HashSet(9);
        for (int i = 0; i < 9; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        f79711 = C4681.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54934(byte[] bArr) {
        String strM54937;
        if (bArr.length == 0) {
            throw new IllegalArgumentException("classBytes must not be empty.");
        }
        synchronized (f79713) {
            try {
                C6965 c6965 = new C6965();
                C10889 c10889 = new C10889();
                if (new C22027(c6965, c10889, new C12185(bArr), f79710).m49808() != 0) {
                    throw m54935("Jdis disassembly failed.", c10889.toString(), null);
                }
                int size = c6965.m19271().size();
                if (size != 1) {
                    throw m54935("Jdis disassembly produced " + size + " jasm outputs, but this API only supports a single output.", c10889.toString(), null);
                }
                String strM22713 = ((C8456) c6965.m19271().get(0)).m22713();
                if (strM22713 == null || strM22713.isEmpty()) {
                    throw m54935("Jdis disassembly succeeded but produced no jasm text.", c10889.toString(), null);
                }
                strM54937 = m54937(strM22713);
            } catch (RuntimeException e) {
                throw m54935("Unexpected exception while running Jdis.", null, e);
            } catch (C4469 e2) {
                throw e2;
            }
        }
        return strM54937;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m54936(String str) {
        byte[] bArrM1749;
        if (str == null) {
            throw new IllegalArgumentException("jasmSource must not be null.");
        }
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("jasmSource must not be blank.");
        }
        synchronized (f79713) {
            try {
                C7711 c7711 = new C7711();
                C10889 c10889 = new C10889();
                if (new C13405(c7711, c10889, new C14422(str.getBytes(StandardCharsets.UTF_8))).m33046() != 0) {
                    throw m54935("Jasm assembly failed.", c10889.toString(), null);
                }
                int size = c7711.m20988().size();
                if (size != 1) {
                    throw m54935("Jasm assembly produced " + size + " class outputs, but this API only supports a single output.", c10889.toString(), null);
                }
                bArrM1749 = ((C0253) c7711.m20988().get(0)).m1749();
                if (bArrM1749 == null || bArrM1749.length == 0) {
                    throw m54935("Jasm assembly succeeded but produced no class data.", c10889.toString(), null);
                }
            } catch (RuntimeException e) {
                throw m54935("Unexpected exception while running Jasm.", null, e);
            } catch (C4469 e2) {
                throw e2;
            }
        }
        return bArrM1749;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4469 m54935(String str, String str2, RuntimeException runtimeException) {
        if ((str2 == null || str2.trim().isEmpty()) && runtimeException != null) {
            str2 = C14017.m34137(runtimeException);
        }
        if (str2 != null) {
            str2.trim().isEmpty();
        }
        return new C4469(str);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m54937(String str) {
        boolean z;
        String str2 = str.contains("\r\n") ? "\r\n" : "\n";
        String[] strArrSplit = str.split("\\R", -1);
        StringBuilder sb = new StringBuilder(str.length() + 64);
        String strGroup = null;
        for (int i = 0; i < strArrSplit.length; i++) {
            String strM46451 = strArrSplit[i];
            Matcher matcher = f79712.matcher(strM46451);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
            } else {
                if (strGroup != null) {
                    String strTrim = strM46451.trim();
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
                            z = !f79711.contains(strTrim.substring(0, iIndexOf2));
                        }
                    }
                    if (z) {
                        strM46451 = C20196.m46451(strM46451, "  // line ", strGroup);
                        strGroup = null;
                    }
                }
                sb.append(strM46451);
                if (i < strArrSplit.length - 1) {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }
}
