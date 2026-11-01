package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.stream.DocumentReader;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۜ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1ES */
/* JADX INFO: loaded from: classes2.dex */
public final class C7054 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C21445 f23693;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C21445 f23694;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C11994 f23696 = new C11994();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C8466 f23695 = new C8466();

    static {
        C21445 c21445 = new C21445();
        f23694 = c21445;
        C21445 c21446 = new C21445();
        f23693 = c21446;
        c21445.put("attr", new C3028());
        c21445.put("^attr-private", new C3028());
        c21445.put("array", new C1617());
        c21445.put("style", new C9172());
        c21445.put("plurals", new C19049());
        c21446.put("bool", new C4937());
        c21446.put("dimen", new C5643());
        c21446.put("fraction", new C23283());
        c21446.put("id", new C15522());
        c21446.put("integer", new C21871());
        c21446.put("string", new C19755());
        c21446.put(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, new C14111());
        C18343 c18343 = new C18343();
        c21446.put("anim", c18343);
        c21446.put("animator", c18343);
        c21446.put("drawable", c18343);
        c21446.put("interpolator", c18343);
        c21446.put("layout", c18343);
        c21446.put("transition", c18343);
        c21446.put("menu", c18343);
        c21446.put("mipmap", c18343);
        c21446.put("raw", c18343);
        c21446.put(DocumentReader.RESERVED, c18343);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18907(InterfaceC9380 interfaceC9380, InterfaceC3609 interfaceC3609, C22577 c22577, C2820 c2820) {
        InterfaceC1409 interfaceC1409;
        String typeName = interfaceC3609.getType().getTypeName();
        int length = typeName.length();
        while (length > 0) {
            char cCharAt = typeName.charAt(length - 1);
            if ('0' > cCharAt || cCharAt > '9') {
                break;
            } else {
                length--;
            }
        }
        if (length > 0 && length != typeName.length()) {
            typeName = typeName.substring(0, length);
        }
        if (interfaceC3609.mo7644()) {
            interfaceC1409 = (InterfaceC1409) f23694.getOrDefault(typeName, f23696);
        } else {
            interfaceC1409 = (InterfaceC1409) f23693.getOrDefault(typeName, f23695);
        }
        interfaceC1409.mo4924(interfaceC9380, interfaceC3609, c22577, c2820);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18902(InterfaceC9961 interfaceC9961) throws IOException {
        int iMo25192 = interfaceC9961.mo25192();
        switch (iMo25192) {
            case 0:
            case 1:
                return Name.REFER;
            case 2:
                return AnnotationHandler.ATTRIBUTE;
            case 3:
                return "string";
            case 4:
                return ClassTransform.FLOAT;
            case 5:
                return "dimen";
            case 6:
                return "fraction";
            case 7:
                return "dynamic-reference";
            case 8:
                return "dynamic-attribute";
            default:
                switch (iMo25192) {
                    case 16:
                    case 17:
                        return "integer";
                    case 18:
                        return "bool";
                    default:
                        switch (iMo25192) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
                            default:
                                throw new IOException("Unsupported value type: " + C6037.m16364(interfaceC9961.mo25192()) + " id: " + interfaceC9961.getEntry().mo10694());
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m18900(C22577 c22577, InterfaceC9961 interfaceC9961) {
        int value = interfaceC9961.getValue();
        int iMo25192 = interfaceC9961.mo25192();
        switch (iMo25192) {
            case 0:
                return value == 1 ? "@empty" : "@null";
            case 1:
            case 7:
                return value == 0 ? "@null" : "@".concat(c22577.mo39837(interfaceC9961.mo25190().mo19106(), value));
            case 2:
            case 8:
                return value == 0 ? "?null" : "?".concat(c22577.mo39837(interfaceC9961.mo25190().mo19106(), value));
            case 3:
                return interfaceC9961.mo25187();
            case 4:
                return Float.toString(Float.intBitsToFloat(value));
            case 5:
                return C6037.m16354(value);
            case 6:
                return C6037.m16363(value);
            default:
                switch (iMo25192) {
                    case 16:
                        return Integer.toString(value);
                    case 17:
                        return C9576.m24440(new StringBuilder("0x"), value);
                    case 18:
                        return value != 0 ? "true" : "false";
                    default:
                        switch (iMo25192) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return (value & (-16777216)) == -16777216 ? m18901(16777215 & value, 6) : m18901(value, 8);
                            default:
                                throw new IOException("Unsupported value type: " + C6037.m16364(interfaceC9961.mo25192()) + " id: " + interfaceC9961.getEntry().mo10694());
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18901(int i, int i2) {
        StringBuilder sb = new StringBuilder("#");
        String hexString = Long.toHexString(((long) i) & 4294967295L);
        int length = i2 - hexString.length();
        for (int i3 = 0; i3 < length; i3++) {
            sb.append('0');
        }
        sb.append(hexString);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18906(InterfaceC9380 interfaceC9380, InterfaceC3609 interfaceC3609, C2820 c2820) {
        if (c2820.f10704) {
            if (!interfaceC3609.mo7649()) {
                interfaceC9380.mo24061("public", "false");
            }
        } else if (interfaceC3609.mo7649()) {
            interfaceC9380.mo24061("public", "true");
        }
        if (c2820.f10703) {
            if (!interfaceC3609.mo7648()) {
                interfaceC9380.mo24061("weak", "false");
            }
        } else if (interfaceC3609.mo7648()) {
            interfaceC9380.mo24061("weak", "true");
        }
        if (c2820.f10702) {
            if (interfaceC3609.mo7646()) {
                return;
            }
            interfaceC9380.mo24061("compact", "false");
        } else if (interfaceC3609.mo7646()) {
            interfaceC9380.mo24061("compact", "true");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18903(InterfaceC9380 interfaceC9380, CharSequence charSequence) {
        if (charSequence instanceof InterfaceC12078) {
            InterfaceC12078 interfaceC12078 = (InterfaceC12078) charSequence;
            m18905(interfaceC9380, interfaceC12078.getValue(), interfaceC12078.mo30052());
        } else {
            interfaceC9380.text(charSequence.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18905(InterfaceC9380 interfaceC9380, String str, C15606[] c15606Arr) {
        if (c15606Arr == null || c15606Arr.length == 0) {
            String strReplace = str.replace("\\", "\\\\");
            if (strReplace.startsWith("@") || strReplace.startsWith("?")) {
                strReplace = "\\".concat(strReplace);
            }
            interfaceC9380.text(strReplace);
            return;
        }
        interfaceC9380.text("");
        int length = str.length();
        C15606[] c15606Arr2 = (C15606[]) C20318.stream(c15606Arr).sorted(new C13405()).toArray(new C4231());
        for (int i = 0; i <= length; i++) {
            boolean z = false;
            for (C15606 c15606 : c15606Arr2) {
                int i2 = c15606.f50741;
                if (i2 == i && i2 == c15606.f50739) {
                    m18904(interfaceC9380, c15606.f50740, false);
                    z = true;
                }
            }
            if (z) {
                interfaceC9380.text("");
            }
            for (int length2 = c15606Arr2.length - 1; length2 >= 0; length2--) {
                C15606 c15607 = c15606Arr2[length2];
                if (c15607.f50739 == i) {
                    m18904(interfaceC9380, c15607.f50740, true);
                }
            }
            for (C15606 c15608 : c15606Arr2) {
                int i3 = c15608.f50741;
                if (i3 == i && i3 != c15608.f50739) {
                    m18904(interfaceC9380, c15608.f50740, false);
                }
            }
            if (i != length) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '?' || cCharAt == '@') {
                    if (i == 0) {
                        interfaceC9380.text("\\" + cCharAt);
                    } else {
                        interfaceC9380.text(String.valueOf(cCharAt));
                    }
                } else if (cCharAt == '\\') {
                    interfaceC9380.text("\\\\");
                } else {
                    interfaceC9380.text(String.valueOf(cCharAt));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18904(InterfaceC9380 interfaceC9380, String str, boolean z) {
        String strSubstring;
        int iIndexOf = str.indexOf(59);
        if (iIndexOf == -1) {
            if (z) {
                interfaceC9380.mo24060(str);
                return;
            } else {
                interfaceC9380.mo24062(str);
                return;
            }
        }
        if (z) {
            interfaceC9380.mo24060(str.substring(0, iIndexOf));
            return;
        }
        interfaceC9380.mo24062(str.substring(0, iIndexOf));
        boolean z2 = true;
        while (z2) {
            int i = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 != -1) {
                String strSubstring2 = str.substring(i, iIndexOf2);
                int i2 = iIndexOf2 + 1;
                int iIndexOf3 = str.indexOf(59, i2);
                if (iIndexOf3 != -1) {
                    strSubstring = str.substring(i2, iIndexOf3);
                } else {
                    strSubstring = str.substring(i2);
                    z2 = false;
                }
                interfaceC9380.mo24061(strSubstring2, strSubstring);
                iIndexOf = iIndexOf3;
            } else {
                z2 = false;
            }
        }
    }
}
