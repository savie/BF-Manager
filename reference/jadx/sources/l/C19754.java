package l;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩴۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAOD */
/* JADX INFO: loaded from: classes5.dex */
public final class C19754 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45507(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c < 'a' || c > 'f') {
            return -1;
        }
        return c - 'W';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m45509(String str) throws C10254, IOException {
        C5584 c5584 = new C5584();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c5584.setOutput(byteArrayOutputStream, "utf-8");
        c5584.startDocument("utf-8", Boolean.TRUE);
        int i = C25129.f81255;
        C19205 c19205 = new C19205();
        c19205.m44493(new StringReader(str));
        Iterator<E> it = C25129.m55999(c19205, true).iterator();
        while (it.hasNext()) {
            m45508(c5584, (C2008) it.next());
        }
        c5584.endDocument();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:160:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45508(C5584 c5584, AbstractC22891 abstractC22891) throws C10254, IOException {
        String strSubstring;
        String strSubstring2;
        int i;
        int i2;
        if (!abstractC22891.mo6861()) {
            if (abstractC22891.mo6861()) {
                throw new UnsupportedOperationException();
            }
            c5584.text(((C16923) abstractC22891).m39906());
            return;
        }
        C2008 c2008M51622 = abstractC22891.m51622();
        c5584.startTag(null, c2008M51622.m6853());
        Iterator it = c2008M51622.m6860().iterator();
        while (it.hasNext()) {
            C5737 c5737 = (C5737) it.next();
            String strM16796 = c5737.m16796();
            int iLastIndexOf = strM16796.lastIndexOf(45);
            if (iLastIndexOf > 0) {
                strSubstring = strM16796.substring(0, iLastIndexOf);
                strSubstring2 = strM16796.substring(iLastIndexOf + 1);
            } else {
                strSubstring = strM16796;
                strSubstring2 = "";
            }
            strSubstring2.getClass();
            Iterator it2 = it;
            switch (strSubstring2) {
                case "base64":
                case "double":
                case "hex":
                case "int":
                case "str":
                case "bool":
                case "long":
                case "null":
                case "float":
                case "interned":
                    break;
                default:
                    strSubstring = strM16796;
                    strSubstring2 = "";
                    break;
            }
            C2008 c2008 = c2008M51622;
            switch (strSubstring2.hashCode()) {
                case -1396204209:
                    if (strSubstring2.equals("base64")) {
                        try {
                            c5584.m16554(strSubstring, Base64.decode(c5737.m16798(), 2));
                        } catch (Exception e) {
                            C10254 c10254 = new C10254(e.getMessage(), c5737);
                            c10254.initCause((Throwable) e);
                            throw c10254;
                        }
                    } else {
                        c5584.attribute(null, strSubstring, c5737.m16798());
                    }
                    it = it2;
                    c2008M51622 = c2008;
                    break;
                case -1325958191:
                    if (strSubstring2.equals(ClassTransform.DOUBLE)) {
                        try {
                            c5584.m16550(strSubstring, Double.parseDouble(c5737.m16798()));
                        } catch (Exception e2) {
                            C10254 c10255 = new C10254(e2.getMessage(), c5737);
                            c10255.initCause((Throwable) e2);
                            throw c10255;
                        }
                    } else {
                        c5584.attribute(null, strSubstring, c5737.m16798());
                    }
                    it = it2;
                    c2008M51622 = c2008;
                    break;
                case 103195:
                    if (strSubstring2.equals("hex")) {
                        String strM16798 = c5737.m16798();
                        int length = strM16798.length();
                        if (length % 2 != 0) {
                            throw new C10254("Invalid length for hex text", c5737);
                        }
                        byte[] bArr = new byte[length / 2];
                        for (int i3 = 0; i3 < length; i3 += 2) {
                            int iM45507 = m45507(strM16798.charAt(i3));
                            int iM45508 = m45507(strM16798.charAt(i3 + 1));
                            if (iM45507 == -1 || iM45508 == -1) {
                                throw new C10254("Invalid characters for hex text", c5737);
                            }
                            bArr[i3 / 2] = (byte) ((iM45507 * 16) + iM45508);
                        }
                        c5584.m16557(strSubstring, bArr);
                    } else {
                        c5584.attribute(null, strSubstring, c5737.m16798());
                    }
                    it = it2;
                    c2008M51622 = c2008;
                    break;
                case 104431:
                    if (strSubstring2.equals(ClassTransform.INTEGER)) {
                        String lowerCase = c5737.m16798().toLowerCase();
                        if (lowerCase.startsWith("0x") || lowerCase.startsWith("-0x")) {
                            String strM16799 = c5737.m16798();
                            try {
                                if (strM16799.startsWith("-")) {
                                    strM16799 = strM16799.substring(1);
                                    i = -1;
                                } else {
                                    i = 1;
                                }
                                c5584.m16555(Integer.parseInt(strM16799.substring(2), 16) * i, strSubstring);
                            } catch (Exception e3) {
                                C10254 c10256 = new C10254(e3.getMessage(), c5737);
                                c10256.initCause((Throwable) e3);
                                throw c10256;
                            }
                        } else {
                            try {
                                c5584.m16548(Integer.parseInt(c5737.m16798()), strSubstring);
                            } catch (Exception e4) {
                                C10254 c10257 = new C10254(e4.getMessage(), c5737);
                                c10257.initCause((Throwable) e4);
                                throw c10257;
                            }
                        }
                    } else {
                        c5584.attribute(null, strSubstring, c5737.m16798());
                    }
                    it = it2;
                    c2008M51622 = c2008;
                    break;
                case 114225:
                    strSubstring2.equals("str");
                    c5584.attribute(null, strSubstring, c5737.m16798());
                    it = it2;
                    c2008M51622 = c2008;
                    break;
                case 3029738:
                    if (strSubstring2.equals("bool")) {
                        try {
                            c5584.m16553(strSubstring, Boolean.parseBoolean(c5737.m16798()));
                        } catch (Exception e5) {
                            C10254 c10258 = new C10254(e5.getMessage(), c5737);
                            c10258.initCause((Throwable) e5);
                            throw c10258;
                        }
                    } else {
                        c5584.attribute(null, strSubstring, c5737.m16798());
                    }
                    it = it2;
                    c2008M51622 = c2008;
                    break;
                case 3327612:
                    if (strSubstring2.equals(ClassTransform.LONG)) {
                        String lowerCase2 = c5737.m16798().toLowerCase();
                        if (lowerCase2.startsWith("0x") || lowerCase2.startsWith("-0x")) {
                            String strM167910 = c5737.m16798();
                            try {
                                if (strM167910.startsWith("-")) {
                                    strM167910 = strM167910.substring(1);
                                    i2 = -1;
                                } else {
                                    i2 = 1;
                                }
                                c5584.m16556(Long.parseLong(strM167910.substring(2), 16) * ((long) i2), strSubstring);
                            } catch (Exception e6) {
                                C10254 c10259 = new C10254(e6.getMessage(), c5737);
                                c10259.initCause((Throwable) e6);
                                throw c10259;
                            }
                        } else {
                            try {
                                c5584.m16549(Long.parseLong(c5737.m16798()), strSubstring);
                            } catch (Exception e7) {
                                C10254 c102510 = new C10254(e7.getMessage(), c5737);
                                c102510.initCause((Throwable) e7);
                                throw c102510;
                            }
                        }
                    } else {
                        c5584.attribute(null, strSubstring, c5737.m16798());
                    }
                    it = it2;
                    c2008M51622 = c2008;
                    break;
                case 3392903:
                    if (strSubstring2.equals("null")) {
                        c5584.attribute(null, strSubstring, null);
                    } else {
                        c5584.attribute(null, strSubstring, c5737.m16798());
                    }
                    it = it2;
                    c2008M51622 = c2008;
                    break;
                case 97526364:
                    if (strSubstring2.equals(ClassTransform.FLOAT)) {
                        try {
                            c5584.m16551(strSubstring, Float.parseFloat(c5737.m16798()));
                        } catch (Exception e8) {
                            C10254 c102511 = new C10254(e8.getMessage(), c5737);
                            c102511.initCause((Throwable) e8);
                            throw c102511;
                        }
                    } else {
                        c5584.attribute(null, strSubstring, c5737.m16798());
                    }
                    it = it2;
                    c2008M51622 = c2008;
                    break;
                case 570410801:
                    if (strSubstring2.equals("interned")) {
                        c5584.m16552(strSubstring, c5737.m16798());
                    } else {
                        c5584.attribute(null, strSubstring, c5737.m16798());
                    }
                    it = it2;
                    c2008M51622 = c2008;
                    break;
                default:
                    c5584.attribute(null, strSubstring, c5737.m16798());
                    it = it2;
                    c2008M51622 = c2008;
                    break;
            }
        }
        C2008 c2009 = c2008M51622;
        Iterator it3 = c2009.m6858().iterator();
        while (it3.hasNext()) {
            m45508(c5584, (AbstractC22891) it3.next());
        }
        c5584.endTag(null, c2009.m6853());
    }
}
