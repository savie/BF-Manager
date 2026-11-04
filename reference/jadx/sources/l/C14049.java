package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.stream.DocumentReader;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1ES */
/* JADX INFO: loaded from: classes4.dex */
public final class C14049 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C14307 f44496;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C14307 f44499;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C10320 f44498 = new C10320();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C15409 f44497 = new C15409();

    static {
        C14307 c14307 = new C14307();
        f44496 = c14307;
        C14307 c14308 = new C14307();
        f44499 = c14308;
        c14307.put("attr", new C0626());
        c14307.put("^attr-private", new C0626());
        c14307.put("array", new C21509());
        c14307.put("style", new C5715());
        c14307.put("plurals", new C19885());
        c14308.put("bool", new C8084());
        c14308.put("dimen", new C9574());
        c14308.put("fraction", new C4969());
        c14308.put("id", new C22123());
        c14308.put("integer", new C10934());
        c14308.put("string", new C13172());
        c14308.put(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, new C19271());
        C22869 c22869 = new C22869();
        c14308.put("anim", c22869);
        c14308.put("animator", c22869);
        c14308.put("drawable", c22869);
        c14308.put("interpolator", c22869);
        c14308.put("layout", c22869);
        c14308.put("transition", c22869);
        c14308.put("menu", c22869);
        c14308.put("mipmap", c22869);
        c14308.put("raw", c22869);
        c14308.put(DocumentReader.RESERVED, c22869);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34217(InterfaceC18525 interfaceC18525, InterfaceC8697 interfaceC8697, C2863 c2863, C1372 c1372) {
        InterfaceC8829 interfaceC8829;
        String typeName = interfaceC8697.getType().getTypeName();
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
        if (interfaceC8697.mo18155()) {
            interfaceC8829 = (InterfaceC8829) f44496.getOrDefault(typeName, f44498);
        } else {
            interfaceC8829 = (InterfaceC8829) f44499.getOrDefault(typeName, f44497);
        }
        interfaceC8829.mo2774(interfaceC18525, interfaceC8697, c2863, c1372);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34212(InterfaceC5650 interfaceC5650) throws IOException {
        int iMo16635 = interfaceC5650.mo16635();
        switch (iMo16635) {
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
                switch (iMo16635) {
                    case 16:
                    case 17:
                        return "integer";
                    case 18:
                        return "bool";
                    default:
                        switch (iMo16635) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
                            default:
                                throw new IOException("Unsupported value type: " + C21246.m48420(interfaceC5650.mo16635()) + " id: " + interfaceC5650.getEntry().mo23385());
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m34210(C2863 c2863, InterfaceC5650 interfaceC5650) {
        int value = interfaceC5650.getValue();
        int iMo16635 = interfaceC5650.mo16635();
        switch (iMo16635) {
            case 0:
                return value == 1 ? "@empty" : "@null";
            case 1:
            case 7:
                return value == 0 ? "@null" : "@".concat(c2863.mo9456(interfaceC5650.mo11708().mo27607(), value));
            case 2:
            case 8:
                return value == 0 ? "?null" : "?".concat(c2863.mo9456(interfaceC5650.mo11708().mo27607(), value));
            case 3:
                return interfaceC5650.mo11710();
            case 4:
                return Float.toString(Float.intBitsToFloat(value));
            case 5:
                return C21246.m48419(value);
            case 6:
                return C21246.m48417(value);
            default:
                switch (iMo16635) {
                    case 16:
                        return Integer.toString(value);
                    case 17:
                        return C4791.m14766(new StringBuilder("0x"), value);
                    case 18:
                        return value != 0 ? "true" : "false";
                    default:
                        switch (iMo16635) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return (value & (-16777216)) == -16777216 ? m34211(16777215 & value, 6) : m34211(value, 8);
                            default:
                                throw new IOException("Unsupported value type: " + C21246.m48420(interfaceC5650.mo16635()) + " id: " + interfaceC5650.getEntry().mo23385());
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34211(int i, int i2) {
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
    public static void m34216(InterfaceC18525 interfaceC18525, InterfaceC8697 interfaceC8697, C1372 c1372) {
        if (c1372.f4895) {
            if (!interfaceC8697.mo18152()) {
                interfaceC18525.mo14233("public", "false");
            }
        } else if (interfaceC8697.mo18152()) {
            interfaceC18525.mo14233("public", "true");
        }
        if (c1372.f4894) {
            if (!interfaceC8697.mo18157()) {
                interfaceC18525.mo14233("weak", "false");
            }
        } else if (interfaceC8697.mo18157()) {
            interfaceC18525.mo14233("weak", "true");
        }
        if (c1372.f4893) {
            if (interfaceC8697.mo18151()) {
                return;
            }
            interfaceC18525.mo14233("compact", "false");
        } else if (interfaceC8697.mo18151()) {
            interfaceC18525.mo14233("compact", "true");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34213(InterfaceC18525 interfaceC18525, CharSequence charSequence) {
        if (charSequence instanceof InterfaceC16090) {
            InterfaceC16090 interfaceC16090 = (InterfaceC16090) charSequence;
            m34215(interfaceC18525, interfaceC16090.getValue(), interfaceC16090.mo26721());
        } else {
            interfaceC18525.text(charSequence.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34215(InterfaceC18525 interfaceC18525, String str, C25042[] c25042Arr) {
        if (c25042Arr == null || c25042Arr.length == 0) {
            String strReplace = str.replace("\\", "\\\\");
            if (strReplace.startsWith("@") || strReplace.startsWith("?")) {
                strReplace = "\\".concat(strReplace);
            }
            interfaceC18525.text(strReplace);
            return;
        }
        interfaceC18525.text("");
        int length = str.length();
        C25042[] c25042Arr2 = (C25042[]) C13847.stream(c25042Arr).sorted(new C10238(1)).toArray(new C7338(0));
        for (int i = 0; i <= length; i++) {
            boolean z = false;
            for (C25042 c25042 : c25042Arr2) {
                int i2 = c25042.f81016;
                if (i2 == i && i2 == c25042.f81014) {
                    m34214(interfaceC18525, c25042.f81015, false);
                    z = true;
                }
            }
            if (z) {
                interfaceC18525.text("");
            }
            for (int length2 = c25042Arr2.length - 1; length2 >= 0; length2--) {
                C25042 c25043 = c25042Arr2[length2];
                if (c25043.f81014 == i) {
                    m34214(interfaceC18525, c25043.f81015, true);
                }
            }
            for (C25042 c25044 : c25042Arr2) {
                int i3 = c25044.f81016;
                if (i3 == i && i3 != c25044.f81014) {
                    m34214(interfaceC18525, c25044.f81015, false);
                }
            }
            if (i != length) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '?' || cCharAt == '@') {
                    if (i == 0) {
                        interfaceC18525.text("\\" + cCharAt);
                    } else {
                        interfaceC18525.text(String.valueOf(cCharAt));
                    }
                } else if (cCharAt == '\\') {
                    interfaceC18525.text("\\\\");
                } else {
                    interfaceC18525.text(String.valueOf(cCharAt));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34214(InterfaceC18525 interfaceC18525, String str, boolean z) {
        String strSubstring;
        int iIndexOf = str.indexOf(59);
        if (iIndexOf == -1) {
            if (z) {
                interfaceC18525.mo14232(str);
                return;
            } else {
                interfaceC18525.mo14234(str);
                return;
            }
        }
        if (z) {
            interfaceC18525.mo14232(str.substring(0, iIndexOf));
            return;
        }
        interfaceC18525.mo14234(str.substring(0, iIndexOf));
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
                interfaceC18525.mo14233(strSubstring2, strSubstring);
                iIndexOf = iIndexOf3;
            } else {
                z2 = false;
            }
        }
    }
}
