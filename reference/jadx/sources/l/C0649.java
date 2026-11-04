package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.cb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֡᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38GN */
/* JADX INFO: loaded from: classes2.dex */
public final class C0649 {
    /* JADX WARN: Code duplicated, block: B:102:0x0196 A[PHI: r5
      0x0196: PHI (r5v10 java.lang.String) = (r5v7 java.lang.String), (r5v9 java.lang.String) binds: [B:101:0x0194, B:107:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2846(C14160 c14160, C9685 c9685, List list) {
        String str;
        String strM34972;
        ArrayList<String> arrayList = new ArrayList();
        C24275 c24275 = new C24275(c9685.f31265);
        while (true) {
            String strM54278 = c24275.m54278();
            if (strM54278 == null) {
                break;
            }
            arrayList.add(strM54278);
        }
        ArrayList<String> arrayList2 = new ArrayList(arrayList.size());
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= arrayList.size()) {
                if (c9685.f31271.equals("<clinit>")) {
                    str = ".classInitializer";
                } else if (c9685.f31271.equals("<init>")) {
                    str = "[\"$init\"]";
                } else {
                    str = "[\"" + C15830.f51496.m10291(c9685.f31271) + "\"]";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(m2844(c14160));
                sb.append("\n");
                sb.append(m2848(c14160));
                sb.append(str);
                String str2 = c9685.f31271;
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((C9685) it.next()).f31271.equals(str2)) {
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
                        sb.append(C8947.m23910(new StringBuilder("'"), m2843(str3), "'"));
                    }
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                sb.append(".implementation = function (");
                m2847(arrayList2, sb, (C18548) null);
                C22121.m50078(sb, "", ") {\n", "    console.log(`");
                sb.append(c14160.f44771);
                sb.append(".");
                sb.append(c9685.f31271);
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
                if (c9685.f31269.equals("V")) {
                    C22121.m50078(sb, "    this", str, MotionUtils.EASING_TYPE_FORMAT_START);
                    m2847(arrayList2, sb, (C18548) null);
                    sb.append("");
                    sb.append(");\n");
                } else {
                    C22121.m50078(sb, "    let result = this", str, MotionUtils.EASING_TYPE_FORMAT_START);
                    m2847(arrayList2, sb, (C18548) null);
                    C22121.m50078(sb, "", ");\n", "    console.log(`");
                    sb.append(c14160.f44771);
                    sb.append(".");
                    C22121.m50078(sb, c9685.f31271, " result=${result}`);\n", "    return result;\n");
                }
                sb.append("};");
                return sb.toString();
            }
            String strM42088 = (String) arrayList.get(i);
            boolean zStartsWith = strM42088.startsWith("[");
            if (zStartsWith) {
                strM42088 = C18063.m42088(91, 1, strM42088);
            }
            int i3 = 2;
            if (strM42088.length() != 1) {
                int i4 = i + 1;
                byte b = -1;
                switch (strM42088.hashCode()) {
                    case -1568911010:
                        if (strM42088.equals("Ljava/util/Double;")) {
                            b = 0;
                        }
                        break;
                    case -1379929247:
                        if (strM42088.equals("Ljava/util/Iterator;")) {
                            b = 1;
                        }
                        break;
                    case -1170786036:
                        if (strM42088.equals("Ljava/lang/Exception;")) {
                            b = 2;
                        }
                        break;
                    case -1126271266:
                        if (strM42088.equals("Ljava/util/Character;")) {
                            b = 3;
                        }
                        break;
                    case -745004865:
                        if (strM42088.equals("Ljava/util/Boolean;")) {
                            b = 4;
                        }
                        break;
                    case -550491125:
                        if (strM42088.equals("Ljava/util/Float;")) {
                            b = 5;
                        }
                        break;
                    case -328614435:
                        if (strM42088.equals("Ljava/util/StringBuilder;")) {
                            b = 6;
                        }
                        break;
                    case -181989909:
                        if (strM42088.equals("Ljava/util/Short;")) {
                            b = 7;
                        }
                        break;
                    case -128922053:
                        if (strM42088.equals("Ljava/lang/Throwable;")) {
                            b = 8;
                        }
                        break;
                    case 117487623:
                        if (strM42088.equals("Ljava/util/Byte;")) {
                            b = 9;
                        }
                        break;
                    case 126419219:
                        if (strM42088.equals("Ljava/util/Long;")) {
                            b = 10;
                        }
                        break;
                    case 1379658506:
                        if (strM42088.equals("Ljava/lang/String;")) {
                            b = 11;
                        }
                        break;
                    case 1518216451:
                        if (strM42088.equals("Ljava/lang/Class;")) {
                            b = 12;
                        }
                        break;
                    case 1601768860:
                        if (strM42088.equals("Ljava/lang/Object;")) {
                            b = cb.k;
                        }
                        break;
                    case 2113973865:
                        if (strM42088.equals("Ljava/util/Integer;")) {
                            b = cb.f82047l;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        strM34972 = "d";
                        break;
                    case 1:
                        strM34972 = "it";
                        break;
                    case 2:
                        strM34972 = "ex";
                        break;
                    case 3:
                        strM34972 = "ch";
                        break;
                    case 4:
                        strM34972 = "bool";
                        break;
                    case 5:
                        strM34972 = "f";
                        break;
                    case 6:
                        strM34972 = "sb";
                        break;
                    case 7:
                        strM34972 = "sh";
                        break;
                    case 8:
                        strM34972 = "th";
                        break;
                    case 9:
                        strM34972 = "b";
                        break;
                    case 10:
                        strM34972 = "l";
                        break;
                    case 11:
                        strM34972 = "str";
                        break;
                    case 12:
                        strM34972 = "cls";
                        break;
                    case 13:
                        strM34972 = "obj";
                        break;
                    case 14:
                        strM34972 = "num";
                        break;
                    default:
                        String strM42089 = C18063.m42088(36, 1, C18063.m42088(47, 1, C1402.m5124(1, 1, strM42088)));
                        if (!strM42089.matches("[a-zA-Z]\\w*")) {
                            strM34972 = C13645.m33382(i4, "arg");
                        } else if (strM42089.toUpperCase().equals(strM42089)) {
                            strM34972 = strM42089.toLowerCase();
                        } else {
                            String lowerCase = Character.toLowerCase(strM42089.charAt(0)) + strM42089.substring(1);
                            if (!lowerCase.equals(strM42089)) {
                                strM34972 = lowerCase;
                            } else if (strM42089.length() < 3) {
                                strM34972 = strM42089.concat("Var");
                            } else {
                                lowerCase = strM42089.toLowerCase();
                                if (strM42089.equals(lowerCase)) {
                                    strM34972 = C14483.m34972(lowerCase, "Var");
                                } else {
                                    strM34972 = lowerCase;
                                }
                            }
                        }
                        break;
                }
            } else {
                strM34972 = strM42088.toLowerCase();
            }
            if (zStartsWith) {
                strM34972 = C14483.m34972(strM34972, "Arr");
            }
            if (arrayList2.contains(strM34972)) {
                while (true) {
                    if (arrayList2.contains(strM34972 + i3)) {
                        i3++;
                    } else {
                        arrayList2.add(strM34972 + i3);
                    }
                }
            } else {
                arrayList2.add(strM34972);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2844(C14160 c14160) {
        return C3188.m10404("let ", m2848(c14160), " = Java.use(\"", m2843(c14160.f44772), "\");");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2843(String str) {
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
                throw new C15986("Unknown type ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m2848(C14160 c14160) {
        String str = c14160.f44771;
        return str.matches("[a-zA-Z]\\w*") ? str : String.format("cls%X", Integer.valueOf(str.hashCode() & 65535));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2847(ArrayList arrayList, StringBuilder sb, C18548 c18548) {
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
    public static String m2845(C14160 c14160, C1483 c1483, List list) {
        String str = c1483.f5157;
        if (!str.matches("[a-zA-Z]\\w*")) {
            str = String.format("field%X", Integer.valueOf(str.hashCode() & 65535));
        }
        String strM56409 = c1483.f5157;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C9685) it.next()).f31271.equals(strM56409)) {
                strM56409 = C25272.m56409("_", strM56409);
                break;
            }
        }
        String strM10291 = C15830.f51496.m10291(strM56409);
        return m2844(c14160) + "\n" + str + " = " + m2848(c14160) + "." + strM10291 + ".value;";
    }
}
