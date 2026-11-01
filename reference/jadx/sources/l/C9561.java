package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.cb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۢۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38GN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9561 {
    /* JADX WARN: Code duplicated, block: B:102:0x01a5 A[PHI: r5
      0x01a5: PHI (r5v10 java.lang.String) = (r5v7 java.lang.String), (r5v9 java.lang.String) binds: [B:101:0x01a3, B:107:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24417(C23028 c23028, C1154 c1154, List list) {
        String str;
        String strM37076;
        ArrayList<String> arrayList = new ArrayList();
        C17052 c17052 = new C17052(c1154.f5176);
        while (true) {
            String strM39831 = c17052.m39831();
            if (strM39831 == null) {
                break;
            }
            arrayList.add(strM39831);
        }
        ArrayList<String> arrayList2 = new ArrayList(arrayList.size());
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= arrayList.size()) {
                if (c1154.f5175.equals("<clinit>")) {
                    str = ".classInitializer";
                } else if (c1154.f5175.equals("<init>")) {
                    str = "[\"$init\"]";
                } else {
                    str = "[\"" + C11168.f37847.m35229(c1154.f5175) + "\"]";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(m24416(c23028));
                sb.append("\n");
                sb.append(m24420(c23028));
                sb.append(str);
                String str2 = c1154.f5175;
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((C1154) it.next()).f5175.equals(str2)) {
                        i2++;
                    }
                }
                if (i2 > 1) {
                    sb.append(".overload(");
                    boolean z2 = true;
                    for (String str3 : arrayList) {
                        if (z2) {
                            z2 = false;
                        } else {
                            sb.append(", ");
                        }
                        sb.append(C22697.m50267(new StringBuilder("'"), m24415(str3), "'"));
                    }
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                sb.append(".implementation = function (");
                m24419(arrayList2, sb, (C1798) null);
                C0219.m1594(sb, "", ") {\n", "    console.log(`");
                sb.append(c23028.f74837);
                sb.append(".");
                sb.append(c1154.f5175);
                sb.append(" is called");
                if (!arrayList2.isEmpty()) {
                    sb.append(": ");
                    for (String str4 : arrayList2) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(", ");
                        }
                        sb.append(str4 + "=${" + str4 + l.d);
                    }
                    sb.append("");
                }
                sb.append("`);\n");
                if (c1154.f5177.equals("V")) {
                    C0219.m1594(sb, "    this", str, MotionUtils.EASING_TYPE_FORMAT_START);
                    m24419(arrayList2, sb, (C1798) null);
                    sb.append("");
                    sb.append(");\n");
                } else {
                    C0219.m1594(sb, "    let result = this", str, MotionUtils.EASING_TYPE_FORMAT_START);
                    m24419(arrayList2, sb, (C1798) null);
                    C0219.m1594(sb, "", ");\n", "    console.log(`");
                    sb.append(c23028.f74837);
                    sb.append(".");
                    C0219.m1594(sb, c1154.f5175, " result=${result}`);\n", "    return result;\n");
                }
                sb.append("};");
                return sb.toString();
            }
            String strSubstring = (String) arrayList.get(i);
            boolean zStartsWith = strSubstring.startsWith("[");
            if (zStartsWith) {
                strSubstring = strSubstring.substring(strSubstring.lastIndexOf(91) + 1);
            }
            int i3 = 2;
            if (strSubstring.length() != 1) {
                int i4 = i + 1;
                byte b = -1;
                switch (strSubstring.hashCode()) {
                    case -1568911010:
                        if (strSubstring.equals("Ljava/util/Double;")) {
                            b = 0;
                        }
                        break;
                    case -1379929247:
                        if (strSubstring.equals("Ljava/util/Iterator;")) {
                            b = 1;
                        }
                        break;
                    case -1170786036:
                        if (strSubstring.equals("Ljava/lang/Exception;")) {
                            b = 2;
                        }
                        break;
                    case -1126271266:
                        if (strSubstring.equals("Ljava/util/Character;")) {
                            b = 3;
                        }
                        break;
                    case -745004865:
                        if (strSubstring.equals("Ljava/util/Boolean;")) {
                            b = 4;
                        }
                        break;
                    case -550491125:
                        if (strSubstring.equals("Ljava/util/Float;")) {
                            b = 5;
                        }
                        break;
                    case -328614435:
                        if (strSubstring.equals("Ljava/util/StringBuilder;")) {
                            b = 6;
                        }
                        break;
                    case -181989909:
                        if (strSubstring.equals("Ljava/util/Short;")) {
                            b = 7;
                        }
                        break;
                    case -128922053:
                        if (strSubstring.equals("Ljava/lang/Throwable;")) {
                            b = 8;
                        }
                        break;
                    case 117487623:
                        if (strSubstring.equals("Ljava/util/Byte;")) {
                            b = 9;
                        }
                        break;
                    case 126419219:
                        if (strSubstring.equals("Ljava/util/Long;")) {
                            b = 10;
                        }
                        break;
                    case 1379658506:
                        if (strSubstring.equals("Ljava/lang/String;")) {
                            b = 11;
                        }
                        break;
                    case 1518216451:
                        if (strSubstring.equals("Ljava/lang/Class;")) {
                            b = 12;
                        }
                        break;
                    case 1601768860:
                        if (strSubstring.equals("Ljava/lang/Object;")) {
                            b = cb.k;
                        }
                        break;
                    case 2113973865:
                        if (strSubstring.equals("Ljava/util/Integer;")) {
                            b = cb.f77931l;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        strM37076 = "d";
                        break;
                    case 1:
                        strM37076 = "it";
                        break;
                    case 2:
                        strM37076 = "ex";
                        break;
                    case 3:
                        strM37076 = "ch";
                        break;
                    case 4:
                        strM37076 = "bool";
                        break;
                    case 5:
                        strM37076 = "f";
                        break;
                    case 6:
                        strM37076 = "sb";
                        break;
                    case 7:
                        strM37076 = "sh";
                        break;
                    case 8:
                        strM37076 = "th";
                        break;
                    case 9:
                        strM37076 = "b";
                        break;
                    case 10:
                        strM37076 = "l";
                        break;
                    case 11:
                        strM37076 = "str";
                        break;
                    case 12:
                        strM37076 = "cls";
                        break;
                    case 13:
                        strM37076 = "obj";
                        break;
                    case 14:
                        strM37076 = "num";
                        break;
                    default:
                        String strM46498 = C20630.m46498(1, 1, strSubstring);
                        String strSubstring2 = strM46498.substring(strM46498.lastIndexOf(47) + 1);
                        String strSubstring3 = strSubstring2.substring(strSubstring2.lastIndexOf(36) + 1);
                        if (!strSubstring3.matches("[a-zA-Z]\\w*")) {
                            strM37076 = C8479.m22141(i4, "arg");
                        } else if (strSubstring3.toUpperCase().equals(strSubstring3)) {
                            strM37076 = strSubstring3.toLowerCase();
                        } else {
                            String lowerCase = Character.toLowerCase(strSubstring3.charAt(0)) + strSubstring3.substring(1);
                            if (!lowerCase.equals(strSubstring3)) {
                                strM37076 = lowerCase;
                            } else if (strSubstring3.length() < 3) {
                                strM37076 = strSubstring3.concat("Var");
                            } else {
                                lowerCase = strSubstring3.toLowerCase();
                                if (strSubstring3.equals(lowerCase)) {
                                    strM37076 = C15489.m37076(lowerCase, "Var");
                                } else {
                                    strM37076 = lowerCase;
                                }
                            }
                        }
                        break;
                }
            } else {
                strM37076 = strSubstring.toLowerCase();
            }
            if (zStartsWith) {
                strM37076 = C15489.m37076(strM37076, "Arr");
            }
            if (arrayList2.contains(strM37076)) {
                while (true) {
                    if (arrayList2.contains(strM37076 + i3)) {
                        i3++;
                    } else {
                        arrayList2.add(strM37076 + i3);
                    }
                }
            } else {
                arrayList2.add(strM37076);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24416(C23028 c23028) {
        return C0242.m1617("let ", m24420(c23028), " = Java.use(\"", m24415(c23028.f74834), "\");");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24415(String str) {
        if (str.startsWith("L")) {
            return str.substring(1, str.length() - 1).replace('/', '.');
        }
        if (str.startsWith("[")) {
            return str.replace('/', '.');
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return ClassTransform.FLOAT;
        }
        if (cCharAt == 'S') {
            return ClassTransform.SHORT;
        }
        if (cCharAt == 'V') {
            return ClassTransform.VOID;
        }
        if (cCharAt == 'Z') {
            return ClassTransform.BOOLEAN;
        }
        if (cCharAt == 'I') {
            return ClassTransform.INTEGER;
        }
        if (cCharAt == 'J') {
            return ClassTransform.LONG;
        }
        switch (cCharAt) {
            case 'B':
                return ClassTransform.BYTE;
            case 'C':
                return ClassTransform.CHARACTER;
            case 'D':
                return ClassTransform.DOUBLE;
            default:
                throw new C6642("Unknown type ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m24420(C23028 c23028) {
        String str = c23028.f74837;
        return str.matches("[a-zA-Z]\\w*") ? str : String.format("cls%X", Integer.valueOf(str.hashCode() & 65535));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24419(ArrayList arrayList, StringBuilder sb, C1798 c1798) {
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24418(C23028 c23028, C22322 c22322, List list) {
        String str = c22322.f72894;
        if (!str.matches("[a-zA-Z]\\w*")) {
            str = String.format("field%X", Integer.valueOf(str.hashCode() & 65535));
        }
        String strM1693 = c22322.f72894;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C1154) it.next()).f5175.equals(strM1693)) {
                strM1693 = C0252.m1693("_", strM1693);
                break;
            }
        }
        String strM35229 = C11168.f37847.m35229(strM1693);
        return m24416(c23028) + "\n" + str + " = " + m24420(c23028) + "." + strM35229 + ".value;";
    }
}
