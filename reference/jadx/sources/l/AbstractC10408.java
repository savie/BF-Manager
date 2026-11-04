package l;

import com.alipay.sdk.m.w.a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10408 implements InterfaceC16090 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25042[] m26720(C25042[] c25042Arr) {
        if (c25042Arr != null) {
            int length = getValue().length();
            boolean z = false;
            for (int i = 0; i < c25042Arr.length; i++) {
                if (!c25042Arr[i].m55862(length)) {
                    c25042Arr[i] = null;
                    z = true;
                }
            }
            if (!z) {
                return c25042Arr;
            }
            C25042[] c25042Arr2 = (C25042[]) C13847.stream(c25042Arr).filter(new C20548(1)).toArray(new C0714(0));
            if (c25042Arr2.length != 0) {
                return c25042Arr2;
            }
        }
        return null;
    }

    @Override // l.InterfaceC16090
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C25042[] mo26721() {
        return C17582.m41244(mo8824());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterfaceC16090 interfaceC16090 = (InterfaceC16090) obj;
        return getValue().equals(interfaceC16090.getValue()) && Arrays.equals(getStyle(), interfaceC16090.getStyle());
    }

    public int hashCode() {
        return Arrays.hashCode(getStyle()) + (getValue().hashCode() * 31);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getValue().length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return getValue().charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return getValue().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return getValue();
    }

    @Override // l.InterfaceC1921
    /* JADX INFO: renamed from: ۙ */
    public final void mo6599(InterfaceC1921 interfaceC1921) {
        InterfaceC16090 interfaceC16090 = (InterfaceC16090) interfaceC1921;
        String value = getValue();
        String value2 = interfaceC16090.getValue();
        if (C17359.equals(value, value2)) {
            String strM26717 = m26717(value, mo26721());
            String strM26718 = m26717(value2, interfaceC16090.mo26721());
            if (!C17359.equals(strM26717, strM26718)) {
                throw new RuntimeException(C20196.m46451(strM26717, " != ", strM26718));
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        C23290 c23290 = C15830.f51498;
        sb.append(c23290.m10291(value));
        sb.append(" != ");
        sb.append(c23290.m10291(value2));
        throw new RuntimeException(sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26717(String str, C25042[] c25042Arr) {
        if (c25042Arr == null || c25042Arr.length == 0) {
            return m26719(str);
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        C25042[] c25042Arr2 = (C25042[]) C13847.stream(c25042Arr).sorted(new C8172(0)).toArray(new C19359());
        for (int i = 0; i <= length; i++) {
            for (C25042 c25042 : c25042Arr2) {
                int i2 = c25042.f81016;
                if (i2 == i && i2 == c25042.f81014) {
                    m26718(c25042.f81015, sb, false);
                }
            }
            for (int length2 = c25042Arr2.length - 1; length2 >= 0; length2--) {
                C25042 c25043 = c25042Arr2[length2];
                if (c25043.f81014 == i) {
                    m26718(c25043.f81015, sb, true);
                }
            }
            for (C25042 c25044 : c25042Arr2) {
                int i3 = c25044.f81016;
                if (i3 == i && i3 != c25044.f81014) {
                    m26718(c25044.f81015, sb, false);
                }
            }
            if (i != length) {
                sb.append(m26719(String.valueOf(str.charAt(i))));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26718(String str, StringBuilder sb, boolean z) {
        String strSubstring;
        sb.append('<');
        if (z) {
            sb.append('/');
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf == -1) {
            sb.append(str);
        } else {
            sb.append((CharSequence) str, 0, iIndexOf);
            if (!z) {
                boolean z2 = true;
                while (z2) {
                    int i = iIndexOf + 1;
                    int iIndexOf2 = str.indexOf(61, i);
                    if (iIndexOf2 != -1) {
                        sb.append(' ');
                        sb.append((CharSequence) str, i, iIndexOf2);
                        sb.append("=\"");
                        int i2 = iIndexOf2 + 1;
                        iIndexOf = str.indexOf(59, i2);
                        if (iIndexOf != -1) {
                            strSubstring = str.substring(i2, iIndexOf);
                        } else {
                            strSubstring = str.substring(i2);
                            z2 = false;
                        }
                        sb.append(m26719(strSubstring));
                        sb.append('\"');
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        sb.append('>');
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m26719(String str) {
        int i = C24276.f78588;
        AbstractC21292 abstractC21292 = AbstractC21292.f67894;
        return abstractC21292.m48531(abstractC21292.m48531(str, a.p, "&amp;"), "<", "&lt;");
    }
}
