package l;

import com.alipay.sdk.m.w.a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13613 implements InterfaceC12078 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15606[] m33291(C15606[] c15606Arr) {
        if (c15606Arr != null) {
            int length = getValue().length();
            boolean z = false;
            for (int i = 0; i < c15606Arr.length; i++) {
                if (!c15606Arr[i].m37273(length)) {
                    c15606Arr[i] = null;
                    z = true;
                }
            }
            if (!z) {
                return c15606Arr;
            }
            C15606[] c15606Arr2 = (C15606[]) C20318.stream(c15606Arr).filter(new C1534(0)).toArray(new C9297(0));
            if (c15606Arr2.length != 0) {
                return c15606Arr2;
            }
        }
        return null;
    }

    @Override // l.InterfaceC12078
    /* JADX INFO: renamed from: ۚۙ */
    public final C15606[] mo30052() {
        return C16311.m38457(mo11446());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterfaceC12078 interfaceC12078 = (InterfaceC12078) obj;
        return getValue().equals(interfaceC12078.getValue()) && Arrays.equals(getStyle(), interfaceC12078.getStyle());
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

    @Override // l.InterfaceC7138
    /* JADX INFO: renamed from: ۙ */
    public final void mo10755(InterfaceC7138 interfaceC7138) {
        InterfaceC12078 interfaceC12078 = (InterfaceC12078) interfaceC7138;
        String value = getValue();
        String value2 = interfaceC12078.getValue();
        if (C13638.equals(value, value2)) {
            String strM33289 = m33289(value, mo30052());
            String strM332810 = m33289(value2, interfaceC12078.mo30052());
            if (!C13638.equals(strM33289, strM332810)) {
                throw new RuntimeException(C1679.m5594(strM33289, " != ", strM332810));
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        C23868 c23868 = C11168.f37849;
        sb.append(c23868.m35229(value));
        sb.append(" != ");
        sb.append(c23868.m35229(value2));
        throw new RuntimeException(sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33289(String str, C15606[] c15606Arr) {
        if (c15606Arr != null && c15606Arr.length != 0) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            C15606[] c15606Arr2 = (C15606[]) C20318.stream(c15606Arr).sorted(new C2945(0)).toArray(new C4439());
            for (int i = 0; i <= length; i++) {
                for (C15606 c15606 : c15606Arr2) {
                    int i2 = c15606.f50741;
                    if (i2 == i && i2 == c15606.f50739) {
                        m33290(c15606.f50740, sb, false);
                    }
                }
                for (int length2 = c15606Arr2.length - 1; length2 >= 0; length2--) {
                    C15606 c15607 = c15606Arr2[length2];
                    if (c15607.f50739 == i) {
                        m33290(c15607.f50740, sb, true);
                    }
                }
                for (C15606 c15608 : c15606Arr2) {
                    int i3 = c15608.f50741;
                    if (i3 == i && i3 != c15608.f50739) {
                        m33290(c15608.f50740, sb, false);
                    }
                }
                if (i != length) {
                    sb.append(C6851.m18458(C6851.m18458(String.valueOf(str.charAt(i)), a.p, "&amp;"), "<", "&lt;"));
                }
            }
            return sb.toString();
        }
        return C6851.m18458(C6851.m18458(str, a.p, "&amp;"), "<", "&lt;");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33290(String str, StringBuilder sb, boolean z) {
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
                        sb.append(C6851.m18458(C6851.m18458(strSubstring, a.p, "&amp;"), "<", "&lt;"));
                        sb.append('\"');
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        sb.append('>');
    }
}
