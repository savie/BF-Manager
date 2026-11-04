package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X785 */
/* JADX INFO: loaded from: classes.dex */
public final class C22474 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f72712;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f72714;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f72716;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f72715 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72713 = new ArrayList();

    public C22474(String str) {
        C15870.m37841(str);
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C22474 m50676(String str, String str2) {
        ArrayList arrayList;
        String strM50674;
        String strM50675;
        String strM50676;
        C22474 c22474 = new C22474(str);
        String[] strArrSplit = C1173.m4319(str2).split("\n", -1);
        int i = 0;
        C4574 c4574M14369 = null;
        C4574 c4574M14371 = null;
        while (true) {
            int length = strArrSplit.length;
            arrayList = c22474.f72713;
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            String strTrim = m50675(strArrSplit[i]).trim();
            if (c4574M14371 != null) {
                if (strTrim.equals(".end method")) {
                    c4574M14371.f16279 = i2;
                    c4574M14371 = null;
                }
            } else if (c4574M14369 == null) {
                if (m50674(strTrim, ".class") != null) {
                    c22474.f72712 = strTrim;
                } else {
                    strM50674 = m50674(strTrim, ".super");
                    if (strM50674 != null) {
                        c22474.f72714 = strM50674;
                    } else {
                        strM50675 = m50674(strTrim, ".source");
                        if (strM50675 != null) {
                            if (strM50675.length() >= 2 && strM50675.charAt(0) == '\"' && C22313.m50373(1, strM50675) == '\"') {
                                strM50675 = C15830.f51499.m10291(C1402.m5124(1, 1, strM50675));
                            }
                            c22474.f72716 = strM50675;
                        } else {
                            strM50676 = m50674(strTrim, ".implements");
                            if (strM50676 != null) {
                                c22474.f72715.add(strM50676);
                            } else if (m50674(strTrim, ".field") != null) {
                                c4574M14369 = C4574.m14369(i2, strTrim);
                                arrayList.add(c4574M14369);
                            } else if (m50674(strTrim, ".method") != null) {
                                c4574M14371 = C4574.m14371(i2, strTrim);
                                arrayList.add(c4574M14371);
                            }
                        }
                    }
                }
            } else if (strTrim.equals(".end field")) {
                c4574M14369.f16279 = i2;
                c4574M14369 = null;
            } else if (m50674(strTrim, ".class") != null || m50674(strTrim, ".super") != null || m50674(strTrim, ".source") != null || m50674(strTrim, ".implements") != null || m50674(strTrim, ".field") != null || m50674(strTrim, ".method") != null) {
                c4574M14369.f16279 = c4574M14369.f16278;
                c4574M14369 = null;
                if (m50674(strTrim, ".class") != null) {
                    c22474.f72712 = strTrim;
                } else {
                    strM50674 = m50674(strTrim, ".super");
                    if (strM50674 != null) {
                        c22474.f72714 = strM50674;
                    } else {
                        strM50675 = m50674(strTrim, ".source");
                        if (strM50675 != null) {
                            if (strM50675.length() >= 2) {
                                strM50675 = C15830.f51499.m10291(C1402.m5124(1, 1, strM50675));
                            }
                            c22474.f72716 = strM50675;
                        } else {
                            strM50676 = m50674(strTrim, ".implements");
                            if (strM50676 != null) {
                                c22474.f72715.add(strM50676);
                            } else if (m50674(strTrim, ".field") != null) {
                                c4574M14369 = C4574.m14369(i2, strTrim);
                                arrayList.add(c4574M14369);
                            } else if (m50674(strTrim, ".method") != null) {
                                c4574M14371 = C4574.m14371(i2, strTrim);
                                arrayList.add(c4574M14371);
                            }
                        }
                    }
                }
            }
            i = i2;
        }
        if (c4574M14369 != null) {
            c4574M14369.f16279 = c4574M14369.f16278;
        }
        if (c4574M14371 != null) {
            c4574M14371.f16279 = strArrSplit.length;
        }
        C12884.sort(arrayList, new C10539(0));
        return c22474;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50674(String str, String str2) {
        if (str.startsWith(str2) && str.length() != str2.length() && Character.isWhitespace(str.charAt(str2.length()))) {
            return str.substring(str2.length()).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m50675(String str) {
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
    public final C4574 m50677(String str) {
        for (C4574 c4574 : this.f72713) {
            if (e.s.equals(c4574.f16284) && str.equals(c4574.f16280)) {
                return c4574;
            }
        }
        return null;
    }
}
