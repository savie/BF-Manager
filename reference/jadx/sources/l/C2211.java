package l;

import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2211 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7542(List list) {
        if (list.size() >= 4) {
            InterfaceC8670 interfaceC8670 = (InterfaceC8670) ((C15580) list.get(0)).m37318();
            if (interfaceC8670.getType() == EnumC22294.INVOKE_STATIC) {
                InterfaceC13890 interfaceC13890Mo5148 = interfaceC8670.mo5148();
                if (interfaceC13890Mo5148.getName().equals("makeConcatWithConstants") && interfaceC13890Mo5148.mo33836().equals("Ljava/lang/invoke/StringConcatFactory;") && C17359.equals(((C15580) list.get(1)).m37318(), "makeConcatWithConstants") && ((C15580) list.get(3)).m37317() == EnumC23040.ENCODED_STRING) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m7540(InterfaceC7377 interfaceC7377, List list) {
        try {
            C18959 c18959 = new C18959(EnumC24203.STR_CONCAT, (list.size() - 3) + interfaceC7377.mo20258());
            m7541((String) ((C15580) list.get(3)).m37318(), c18959, list, interfaceC7377);
            return c18959;
        } catch (Exception e) {
            C18959 c189510 = new C18959(EnumC24203.NOP, 0);
            c189510.mo17866(EnumC1763.SYNTHETIC);
            c189510.mo17863(C11457.f36007, new C15514(C16076.m38224(e, new StringBuilder("Failed to process dynamic string concat: ")), e));
            return c189510;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7541(String str, C18959 c18959, List list, InterfaceC7377 interfaceC7377) {
        AbstractC16481 abstractC16481M39112;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 4;
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            boolean z = iCodePointAt == 1;
            boolean z2 = iCodePointAt == 2;
            if (z || z2) {
                if (sb.length() != 0) {
                    c18959.mo44014((AbstractC16481) AbstractC16481.m39112(new C5557(sb.toString())));
                    sb.setLength(0);
                }
                if (z) {
                    c18959.mo44014((AbstractC16481) AbstractC16481.m39109(interfaceC7377, i2, AbstractC1566.f5420));
                    i2++;
                } else {
                    int i3 = i + 1;
                    C15580 c15580 = (C15580) list.get(i);
                    Object objM17589 = C6077.m17589(c15580);
                    if (objM17589 == null) {
                        AbstractC1566 abstractC1566 = AbstractC1566.f5420;
                        int i4 = AbstractC16481.f53441;
                        abstractC16481M39112 = C23195.m52120(0L, abstractC1566);
                    } else if (objM17589 instanceof C23195) {
                        abstractC16481M39112 = (C23195) objM17589;
                    } else if (objM17589 instanceof AbstractC1566) {
                        abstractC16481M39112 = AbstractC16481.m39112(new C13014((AbstractC1566) objM17589));
                    } else if (objM17589 instanceof String) {
                        abstractC16481M39112 = AbstractC16481.m39112(new C5557((String) objM17589));
                    } else {
                        throw new C8597("Can't build insn arg from encoded value: " + c15580);
                    }
                    c18959.mo44014(abstractC16481M39112);
                    i = i3;
                }
            } else {
                sb.appendCodePoint(iCodePointAt);
            }
        }
        if (sb.length() != 0) {
            c18959.mo44014((AbstractC16481) AbstractC16481.m39112(new C5557(sb.toString())));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7539(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return ClassTransform.FLOAT;
        }
        int i = 1;
        if (cCharAt == 'L') {
            int iLastIndexOf = str.lastIndexOf(47);
            return C1402.m5124(1, iLastIndexOf < 0 ? 1 : iLastIndexOf + 1, str);
        }
        if (cCharAt == 'S') {
            return ClassTransform.SHORT;
        }
        if (cCharAt == 'V') {
            return ClassTransform.VOID;
        }
        if (cCharAt == 'I') {
            return ClassTransform.INTEGER;
        }
        if (cCharAt == 'J') {
            return ClassTransform.LONG;
        }
        if (cCharAt == 'Z') {
            return ClassTransform.BOOLEAN;
        }
        if (cCharAt != '[') {
            switch (cCharAt) {
                case 'B':
                    return ClassTransform.BYTE;
                case 'C':
                    return ClassTransform.CHARACTER;
                case 'D':
                    return ClassTransform.DOUBLE;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        while (i < str.length() && str.charAt(i) == '[') {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m7539(str.substring(i)));
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("[]");
        }
        return sb.toString();
    }
}
