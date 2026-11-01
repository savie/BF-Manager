package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X785 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12089 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f40449;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f40450;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f40451;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40453 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40452 = new ArrayList();

    public C12089(String str) {
        C2209.m6825(str);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12089 m30083(String str, String str2) {
        ArrayList arrayList;
        String strM30081;
        String strM30082;
        String strM30083;
        C12089 c12089 = new C12089(str);
        String[] strArrSplit = C7521.m20038(str2).split("\n", -1);
        int i = 0;
        C0093 c0093M1051 = null;
        C0093 c0093M1053 = null;
        while (true) {
            int length = strArrSplit.length;
            arrayList = c12089.f40452;
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            String strTrim = m30082(strArrSplit[i]).trim();
            if (c0093M1053 != null) {
                if (strTrim.equals(".end method")) {
                    c0093M1053.f1014 = i2;
                    c0093M1053 = null;
                }
            } else if (c0093M1051 == null) {
                if (m30081(strTrim, ".class") != null) {
                    c12089.f40450 = strTrim;
                } else {
                    strM30081 = m30081(strTrim, ".super");
                    if (strM30081 != null) {
                        c12089.f40451 = strM30081;
                    } else {
                        strM30082 = m30081(strTrim, ".source");
                        if (strM30082 != null) {
                            if (strM30082.length() >= 2 && strM30082.charAt(0) == '\"' && C3184.m9601(1, strM30082) == '\"') {
                                strM30082 = C11168.f37846.m35229(C20630.m46498(1, 1, strM30082));
                            }
                            c12089.f40449 = strM30082;
                        } else {
                            strM30083 = m30081(strTrim, ".implements");
                            if (strM30083 != null) {
                                c12089.f40453.add(strM30083);
                            } else if (m30081(strTrim, ".field") != null) {
                                c0093M1051 = C0093.m1051(i2, strTrim);
                                arrayList.add(c0093M1051);
                            } else if (m30081(strTrim, ".method") != null) {
                                c0093M1053 = C0093.m1053(i2, strTrim);
                                arrayList.add(c0093M1053);
                            }
                        }
                    }
                }
            } else if (strTrim.equals(".end field")) {
                c0093M1051.f1014 = i2;
                c0093M1051 = null;
            } else if (m30081(strTrim, ".class") != null || m30081(strTrim, ".super") != null || m30081(strTrim, ".source") != null || m30081(strTrim, ".implements") != null || m30081(strTrim, ".field") != null || m30081(strTrim, ".method") != null) {
                c0093M1051.f1014 = c0093M1051.f1015;
                c0093M1051 = null;
                if (m30081(strTrim, ".class") != null) {
                    c12089.f40450 = strTrim;
                } else {
                    strM30081 = m30081(strTrim, ".super");
                    if (strM30081 != null) {
                        c12089.f40451 = strM30081;
                    } else {
                        strM30082 = m30081(strTrim, ".source");
                        if (strM30082 != null) {
                            if (strM30082.length() >= 2) {
                                strM30082 = C11168.f37846.m35229(C20630.m46498(1, 1, strM30082));
                            }
                            c12089.f40449 = strM30082;
                        } else {
                            strM30083 = m30081(strTrim, ".implements");
                            if (strM30083 != null) {
                                c12089.f40453.add(strM30083);
                            } else if (m30081(strTrim, ".field") != null) {
                                c0093M1051 = C0093.m1051(i2, strTrim);
                                arrayList.add(c0093M1051);
                            } else if (m30081(strTrim, ".method") != null) {
                                c0093M1053 = C0093.m1053(i2, strTrim);
                                arrayList.add(c0093M1053);
                            }
                        }
                    }
                }
            }
            i = i2;
        }
        if (c0093M1051 != null) {
            c0093M1051.f1014 = c0093M1051.f1015;
        }
        if (c0093M1053 != null) {
            c0093M1053.f1014 = strArrSplit.length;
        }
        C23846.sort(arrayList, new C1522(2));
        return c12089;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30081(String str, String str2) {
        if (str.startsWith(str2) && str.length() != str2.length() && Character.isWhitespace(str.charAt(str2.length()))) {
            return str.substring(str2.length()).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m30082(String str) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (z) {
                z = false;
            } else if (z2 || z3) {
                if (cCharAt == '\\') {
                    z = true;
                } else if (z2 && cCharAt == '\"') {
                    z2 = false;
                } else if (z3 && cCharAt == '\'') {
                    z3 = false;
                }
            } else if (cCharAt == '\"') {
                z2 = true;
            } else if (cCharAt == '\'') {
                z3 = true;
            } else if (cCharAt == '#') {
                return str.substring(0, i);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0093 m30084(String str) {
        for (C0093 c0093 : this.f40452) {
            if (e.s.equals(c0093.f1011) && str.equals(c0093.f1010)) {
                return c0093;
            }
        }
        return null;
    }
}
