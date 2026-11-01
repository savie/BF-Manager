package l;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۜۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAOD */
/* JADX INFO: loaded from: classes2.dex */
public final class C6742 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18234(char c) {
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
    public static byte[] m18236(String str) throws IOException, C4811 {
        C21559 c21559 = new C21559();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c21559.setOutput(byteArrayOutputStream, "utf-8");
        c21559.startDocument("utf-8", Boolean.TRUE);
        int i = C9046.f30860;
        C3504 c3504 = new C3504();
        c3504.m10317(new StringReader(str));
        Iterator<E> it = C9046.m23372(c3504, true).iterator();
        while (it.hasNext()) {
            m18235(c21559, (C8340) it.next());
        }
        c21559.endDocument();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:160:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18235(C21559 c21559, AbstractC23157 abstractC23157) throws IOException, C4811 {
        String strSubstring;
        String strSubstring2;
        int i;
        int i2;
        if (!abstractC23157.mo21788()) {
            if (abstractC23157.mo21788()) {
                throw new UnsupportedOperationException();
            }
            c21559.text(((C10457) abstractC23157).m26418());
            return;
        }
        C8340 c8340M51156 = abstractC23157.m51156();
        c21559.startTag(null, c8340M51156.m21779());
        Iterator it = c8340M51156.m21778().iterator();
        while (it.hasNext()) {
            C18923 c18923 = (C18923) it.next();
            String strM43584 = c18923.m43584();
            int iLastIndexOf = strM43584.lastIndexOf(45);
            if (iLastIndexOf > 0) {
                strSubstring = strM43584.substring(0, iLastIndexOf);
                strSubstring2 = strM43584.substring(iLastIndexOf + 1);
            } else {
                strSubstring = strM43584;
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
                    strSubstring = strM43584;
                    strSubstring2 = "";
                    break;
            }
            C8340 c8340 = c8340M51156;
            switch (strSubstring2.hashCode()) {
                case -1396204209:
                    if (strSubstring2.equals("base64")) {
                        try {
                            c21559.m48277(strSubstring, Base64.decode(c18923.m43586(), 2));
                        } catch (Exception e) {
                            C4811 c4811 = new C4811(e.getMessage(), c18923);
                            c4811.initCause((Throwable) e);
                            throw c4811;
                        }
                    } else {
                        c21559.attribute(null, strSubstring, c18923.m43586());
                    }
                    it = it2;
                    c8340M51156 = c8340;
                    break;
                case -1325958191:
                    if (strSubstring2.equals(ClassTransform.DOUBLE)) {
                        try {
                            c21559.m48273(strSubstring, Double.parseDouble(c18923.m43586()));
                        } catch (Exception e2) {
                            C4811 c4812 = new C4811(e2.getMessage(), c18923);
                            c4812.initCause((Throwable) e2);
                            throw c4812;
                        }
                    } else {
                        c21559.attribute(null, strSubstring, c18923.m43586());
                    }
                    it = it2;
                    c8340M51156 = c8340;
                    break;
                case 103195:
                    if (strSubstring2.equals("hex")) {
                        String strM43586 = c18923.m43586();
                        int length = strM43586.length();
                        if (length % 2 != 0) {
                            throw new C4811("Invalid length for hex text", c18923);
                        }
                        byte[] bArr = new byte[length / 2];
                        for (int i3 = 0; i3 < length; i3 += 2) {
                            int iM18234 = m18234(strM43586.charAt(i3));
                            int iM18235 = m18234(strM43586.charAt(i3 + 1));
                            if (iM18234 == -1 || iM18235 == -1) {
                                throw new C4811("Invalid characters for hex text", c18923);
                            }
                            bArr[i3 / 2] = (byte) ((iM18234 * 16) + iM18235);
                        }
                        c21559.m48280(strSubstring, bArr);
                    } else {
                        c21559.attribute(null, strSubstring, c18923.m43586());
                    }
                    it = it2;
                    c8340M51156 = c8340;
                    break;
                case 104431:
                    if (strSubstring2.equals(ClassTransform.INTEGER)) {
                        String lowerCase = c18923.m43586().toLowerCase();
                        if (lowerCase.startsWith("0x") || lowerCase.startsWith("-0x")) {
                            String strM43587 = c18923.m43586();
                            try {
                                if (strM43587.startsWith("-")) {
                                    strM43587 = strM43587.substring(1);
                                    i = -1;
                                } else {
                                    i = 1;
                                }
                                c21559.m48278(Integer.parseInt(strM43587.substring(2), 16) * i, strSubstring);
                            } catch (Exception e3) {
                                C4811 c4813 = new C4811(e3.getMessage(), c18923);
                                c4813.initCause((Throwable) e3);
                                throw c4813;
                            }
                        } else {
                            try {
                                c21559.m48271(Integer.parseInt(c18923.m43586()), strSubstring);
                            } catch (Exception e4) {
                                C4811 c4814 = new C4811(e4.getMessage(), c18923);
                                c4814.initCause((Throwable) e4);
                                throw c4814;
                            }
                        }
                    } else {
                        c21559.attribute(null, strSubstring, c18923.m43586());
                    }
                    it = it2;
                    c8340M51156 = c8340;
                    break;
                case 114225:
                    strSubstring2.equals("str");
                    c21559.attribute(null, strSubstring, c18923.m43586());
                    it = it2;
                    c8340M51156 = c8340;
                    break;
                case 3029738:
                    if (strSubstring2.equals("bool")) {
                        try {
                            c21559.m48276(strSubstring, Boolean.parseBoolean(c18923.m43586()));
                        } catch (Exception e5) {
                            C4811 c4815 = new C4811(e5.getMessage(), c18923);
                            c4815.initCause((Throwable) e5);
                            throw c4815;
                        }
                    } else {
                        c21559.attribute(null, strSubstring, c18923.m43586());
                    }
                    it = it2;
                    c8340M51156 = c8340;
                    break;
                case 3327612:
                    if (strSubstring2.equals(ClassTransform.LONG)) {
                        String lowerCase2 = c18923.m43586().toLowerCase();
                        if (lowerCase2.startsWith("0x") || lowerCase2.startsWith("-0x")) {
                            String strM43588 = c18923.m43586();
                            try {
                                if (strM43588.startsWith("-")) {
                                    strM43588 = strM43588.substring(1);
                                    i2 = -1;
                                } else {
                                    i2 = 1;
                                }
                                c21559.m48279(Long.parseLong(strM43588.substring(2), 16) * ((long) i2), strSubstring);
                            } catch (Exception e6) {
                                C4811 c4816 = new C4811(e6.getMessage(), c18923);
                                c4816.initCause((Throwable) e6);
                                throw c4816;
                            }
                        } else {
                            try {
                                c21559.m48272(Long.parseLong(c18923.m43586()), strSubstring);
                            } catch (Exception e7) {
                                C4811 c4817 = new C4811(e7.getMessage(), c18923);
                                c4817.initCause((Throwable) e7);
                                throw c4817;
                            }
                        }
                    } else {
                        c21559.attribute(null, strSubstring, c18923.m43586());
                    }
                    it = it2;
                    c8340M51156 = c8340;
                    break;
                case 3392903:
                    if (strSubstring2.equals("null")) {
                        c21559.attribute(null, strSubstring, null);
                    } else {
                        c21559.attribute(null, strSubstring, c18923.m43586());
                    }
                    it = it2;
                    c8340M51156 = c8340;
                    break;
                case 97526364:
                    if (strSubstring2.equals(ClassTransform.FLOAT)) {
                        try {
                            c21559.m48274(strSubstring, Float.parseFloat(c18923.m43586()));
                        } catch (Exception e8) {
                            C4811 c4818 = new C4811(e8.getMessage(), c18923);
                            c4818.initCause((Throwable) e8);
                            throw c4818;
                        }
                    } else {
                        c21559.attribute(null, strSubstring, c18923.m43586());
                    }
                    it = it2;
                    c8340M51156 = c8340;
                    break;
                case 570410801:
                    if (strSubstring2.equals("interned")) {
                        c21559.m48275(strSubstring, c18923.m43586());
                    } else {
                        c21559.attribute(null, strSubstring, c18923.m43586());
                    }
                    it = it2;
                    c8340M51156 = c8340;
                    break;
                default:
                    c21559.attribute(null, strSubstring, c18923.m43586());
                    it = it2;
                    c8340M51156 = c8340;
                    break;
            }
        }
        C8340 c8341 = c8340M51156;
        Iterator it3 = c8341.m21785().iterator();
        while (it3.hasNext()) {
            m18235(c21559, (AbstractC23157) it3.next());
        }
        c21559.endTag(null, c8341.m21779());
    }
}
