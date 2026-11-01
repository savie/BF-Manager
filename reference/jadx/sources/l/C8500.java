package l;

import android.graphics.Paint;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: renamed from: l.۠᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4UF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8500 implements Serializable {
    public static final long serialVersionUID = 12335435;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f29464;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f29465;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f29466;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f29467;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f29468;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f29469;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29470;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f29471;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f29472;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29473;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f29474 = true;

    static {
        Paint paint = new Paint(1);
        paint.setTextSize(C13932.m33770(12.0f));
        f29464 = Math.max(30, (int) (C13932.f45877.x / paint.measureText("我")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8500 m22223(int i, int i2) {
        C8500 c8500 = new C8500(10);
        c8500.f29472 = "";
        c8500.f29468 = 0;
        c8500.f29471 = 0;
        c8500.f29470 = i;
        c8500.f29473 = i2;
        return c8500;
    }

    public C8500(int i) {
        this.f29469 = i;
    }

    public final String toString() {
        int i = this.f29469;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("TYPE_EXACT: ");
                sb.append(m22221());
                sb.append(" (");
                sb.append(this.f29470);
                sb.append(", ");
                return C12441.m30911(this.f29473, MotionUtils.EASING_TYPE_FORMAT_END, sb);
            case 1:
                return "TYPE_SOURCE_FILE: " + m22221();
            case 2:
                return "TYPE_CLASS_ANNOTATION: " + m22221() + " " + this.f29470 + " -> " + this.f29473;
            case 3:
                return "TYPE_METHOD_NAME: " + m22221();
            case 4:
                return "TYPE_METHOD_ANNOTATION: " + m22221() + " " + this.f29466 + MotionUtils.EASING_TYPE_FORMAT_START + this.f29467 + MotionUtils.EASING_TYPE_FORMAT_END + this.f29465 + " -> " + this.f29470 + " -> " + this.f29473;
            case 5:
                return "TYPE_METHOD_INSTRUCTION: " + m22221() + " " + this.f29466 + MotionUtils.EASING_TYPE_FORMAT_START + this.f29467 + MotionUtils.EASING_TYPE_FORMAT_END + this.f29465 + " -> " + this.f29470;
            case 6:
                return "TYPE_METHOD_INSTRUCTION_IN: " + m22221() + " " + this.f29466 + MotionUtils.EASING_TYPE_FORMAT_START + this.f29467 + MotionUtils.EASING_TYPE_FORMAT_END + this.f29465 + " -> " + this.f29470 + " -> " + this.f29473;
            case 7:
                return "TYPE_FIELD_NAME: " + m22221();
            case 8:
                return "TYPE_FIELD_ANNOTATION: " + m22221() + " " + this.f29466 + ":" + this.f29465 + " -> " + this.f29470 + "->" + this.f29473;
            case 9:
                return "TYPE_FIELD_VALUE: " + m22221();
            case 10:
                StringBuilder sb2 = new StringBuilder("TYPE_LINE_COL: ");
                sb2.append(m22221());
                sb2.append(" (");
                sb2.append(this.f29470);
                sb2.append(", ");
                return C12441.m30911(this.f29473, MotionUtils.EASING_TYPE_FORMAT_END, sb2);
            default:
                return C8479.m22141(i, "UNKNOWN_TYPE: ");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m22221() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29472);
        sb.insert(this.f29468, '[');
        sb.insert(this.f29471 + 1, ']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22226(int i, int i2, String str) {
        int i3 = f29464;
        if (i <= i3 - 5) {
            this.f29468 = i;
            this.f29471 = i2;
            this.f29472 = str;
            return;
        }
        int i4 = i2 - i;
        if (i4 >= i3) {
            str = str.substring(i);
            i = 0;
            i2 = i4;
        } else {
            int i5 = i - (i3 - i4);
            if (i5 > 0) {
                str = str.substring(i5);
                i -= i5;
                i2 -= i5;
            }
        }
        this.f29468 = i + 1;
        this.f29471 = i2 + 1;
        this.f29472 = C0252.m1693("…", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22228(InterfaceC6533 interfaceC6533, C6222 c6222) {
        if (interfaceC6533.getValue().mo2656() != 23) {
            String str = interfaceC6533.getName() + " = {...";
            String strGroup = c6222.group();
            m22226(str.length(), strGroup.length() + str.length(), C1679.m5594(str, strGroup, "...}"));
            return;
        }
        String value = ((InterfaceC5060) interfaceC6533.getValue()).getValue();
        String strM24217 = C9461.m24217(value);
        String str2 = interfaceC6533.getName() + " = \"";
        int iM31633 = C12733.m31633(c6222.start(), 0, 0, value);
        m22226(str2.length() + iM31633, str2.length() + C12733.m31633(c6222.end(), c6222.start(), iM31633, value), C1679.m5594(str2, strM24217, "\""));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22229(InterfaceC6533 interfaceC6533, InterfaceC10975 interfaceC10975) {
        C14795 c14795 = new C14795();
        try {
            AbstractC14387.m34621(new C12283(new C2093(c14795)), interfaceC10975);
        } catch (IOException unused) {
        }
        String str = interfaceC6533.getName() + " = ";
        int iMo2656 = interfaceC6533.getValue().mo2656();
        if (iMo2656 == 0 || iMo2656 == 6 || iMo2656 == 2 || iMo2656 == 3 || iMo2656 == 4) {
            int length = str.length();
            m22226(length, c14795.length() + length, str.concat(c14795.toString()));
            return;
        }
        String strM37076 = C15489.m37076(str, "{... ");
        int length2 = strM37076.length();
        int length3 = c14795.length() + length2;
        StringBuilder sbM23356 = C9023.m23356(strM37076);
        sbM23356.append(c14795.toString());
        sbM23356.append(" ...}");
        m22226(length2, length3, sbM23356.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22230(InterfaceC17822 interfaceC17822, C6222 c6222) {
        if (interfaceC17822.mo28399().mo2656() != 23) {
            String strM50267 = C22697.m50267(new StringBuilder(), m22222(interfaceC17822), "{...");
            String strGroup = c6222.group();
            m22226(strM50267.length(), strGroup.length() + strM50267.length(), C1679.m5594(strM50267, strGroup, "...}"));
            return;
        }
        String value = ((InterfaceC5060) interfaceC17822.mo28399()).getValue();
        String strM24217 = C9461.m24217(value);
        String str = m22222(interfaceC17822) + '\"';
        int iM31633 = C12733.m31633(c6222.start(), 0, 0, value);
        m22226(str.length() + iM31633, str.length() + C12733.m31633(c6222.end(), c6222.start(), iM31633, value), C1679.m5594(str, strM24217, "\""));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22231(InterfaceC17822 interfaceC17822, InterfaceC10975 interfaceC10975) {
        C14795 c14795 = new C14795();
        try {
            AbstractC14387.m34621(new C12283(new C2093(c14795)), interfaceC10975);
        } catch (IOException unused) {
        }
        String strM22222 = m22222(interfaceC17822);
        int iMo2656 = interfaceC17822.mo28399().mo2656();
        if (iMo2656 == 0 || iMo2656 == 6 || iMo2656 == 2 || iMo2656 == 3 || iMo2656 == 4) {
            int length = strM22222.length();
            m22226(length, c14795.length() + length, strM22222.concat(c14795.toString()));
            return;
        }
        String strM37076 = C15489.m37076(strM22222, "{... ");
        int length2 = strM37076.length();
        int length3 = c14795.length() + length2;
        StringBuilder sbM23356 = C9023.m23356(strM37076);
        sbM23356.append(c14795.toString());
        sbM23356.append(" ...}");
        m22226(length2, length3, sbM23356.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22232(InterfaceC18528 interfaceC18528, int i, int i2) {
        StringBuilder sbM23356 = C9023.m23356(".method ");
        for (EnumC15236 enumC15236 : EnumC15236.m36496(interfaceC18528.mo25750())) {
            sbM23356.append(enumC15236.toString());
            sbM23356.append(' ');
        }
        int length = sbM23356.length() + i;
        int length2 = sbM23356.length() + i2;
        sbM23356.append(interfaceC18528.getName());
        sbM23356.append(MotionUtils.EASING_TYPE_FORMAT_START);
        AbstractC16706 abstractC16706ListIterator = AbstractC22433.copyOf((Collection) interfaceC18528.getParameters()).listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            sbM23356.append(((InterfaceC19234) abstractC16706ListIterator.next()).getType());
        }
        sbM23356.append(MotionUtils.EASING_TYPE_FORMAT_END);
        sbM23356.append(interfaceC18528.mo9698());
        m22226(length, length2, sbM23356.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22222(InterfaceC17822 interfaceC17822) {
        StringBuilder sb = new StringBuilder(".field ");
        for (EnumC15236 enumC15236 : EnumC15236.m36490(interfaceC17822.mo28400())) {
            sb.append(enumC15236.toString());
            sb.append(' ');
        }
        sb.append(interfaceC17822.getName());
        sb.append(':');
        sb.append(interfaceC17822.getType());
        sb.append(" = ");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22225(int i, int i2, CharSequence charSequence) {
        int i3;
        int iMin = Math.min(i - 1, charSequence.length() - 1);
        while (true) {
            if (iMin < 0) {
                i3 = 0;
                break;
            }
            char cCharAt = charSequence.charAt(iMin);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i3 = iMin + 1;
                break;
            }
            iMin--;
        }
        int length = charSequence.length();
        for (int iMax = Math.max(i2, 0); iMax < length; iMax++) {
            char cCharAt2 = charSequence.charAt(iMax);
            if (cCharAt2 == '\n' || cCharAt2 == '\r') {
                length = iMax;
                break;
            }
        }
        while (i3 < i && charSequence.charAt(i3) == ' ') {
            i3++;
        }
        int i4 = f29464;
        if (i2 > length) {
            i2 = length;
        } else if (length - i2 > i4) {
            length = i2 + i4;
        }
        int i5 = i - i3;
        if (i5 > i4 - 5) {
            int i6 = i2 - i;
            int i7 = i6 >= i4 ? i : i - (i4 - i6);
            this.f29468 = (i + 1) - i7;
            this.f29471 = (i2 + 1) - i7;
            this.f29472 = "…" + ((Object) charSequence.subSequence(i7, length));
            return;
        }
        this.f29468 = i5;
        this.f29471 = i2 - i3;
        this.f29472 = charSequence.subSequence(i3, length).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22227(C6111 c6111) {
        C3329 c3329Mo2399 = c6111.m17000().mo2399();
        try {
            m22224(c6111, c3329Mo2399);
            c3329Mo2399.close();
        } catch (Throwable th) {
            try {
                c3329Mo2399.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01b8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22224(C6111 c6111, C3329 c3329) {
        int i;
        int i2;
        int iIndexOf;
        int iIndexOf2;
        switch (this.f29469) {
            case 0:
                int i3 = this.f29470;
                int i4 = this.f29473;
                if (i3 <= i4 && i4 <= c6111.m16842()) {
                    String strSubstring = this.f29472.substring(this.f29468, this.f29471);
                    if (!strSubstring.isEmpty() && !strSubstring.equals(c3329.subSequence(this.f29470, this.f29473))) {
                        int i5 = this.f29470;
                        int iM41456 = C17874.m41456(0, i5 + 1, c3329, strSubstring);
                        int iIndexOf3 = TextUtils.indexOf(c3329, strSubstring, i5);
                        if (iM41456 == -1 || (i = i5 - iM41456) > 50) {
                            i = -1;
                        }
                        if (iIndexOf3 == -1 || (i2 = iIndexOf3 - i5) > 50) {
                            i2 = -1;
                        }
                        if (i == -1 || i2 == -1) {
                            if (i == -1) {
                                if (i2 != -1) {
                                    iM41456 = iIndexOf3;
                                } else {
                                    iM41456 = -1;
                                }
                            }
                        } else if (i >= i2) {
                            iM41456 = iIndexOf3;
                        }
                        if (iM41456 != -1) {
                            c6111.mo16839(iM41456, strSubstring.length() + iM41456);
                        } else {
                            c6111.mo16839(this.f29470, this.f29473);
                        }
                    } else {
                        c6111.mo16839(this.f29470, this.f29473);
                    }
                    c6111.m16819();
                    c6111.m16992(false);
                    break;
                }
                break;
            case 1:
                int iIndexOf4 = TextUtils.indexOf(c3329, ".source");
                if (iIndexOf4 != -1 && (iIndexOf = c3329.indexOf('\"', iIndexOf4, c3329.length())) != -1) {
                    int i6 = (this.f29468 + iIndexOf) - 8;
                    c6111.mo16839(i6, (iIndexOf + this.f29471) - 8);
                    c6111.m16819();
                    c6111.m16988(i6, false);
                    break;
                }
                break;
            case 2:
                C0118 c0118M1165 = C0118.m1165(c3329);
                c0118M1165.m1174(c6111);
                c0118M1165.m1171(this.f29470, this.f29473);
                break;
            case 3:
                C15642 c15642M1170 = C0118.m1165(c3329).m1170(this.f29466, this.f29467, this.f29465);
                if (c15642M1170 != null) {
                    int i7 = c15642M1170.f50842;
                    int i8 = this.f29470 + i7;
                    c6111.mo16839(i8, i7 + this.f29473);
                    c6111.m16988(i8, false);
                } else {
                    c6111.mo17029(0);
                    c6111.m16890(0, false);
                }
                c6111.m16819();
                break;
            case 4:
                C0118 c0118M1166 = C0118.m1165(c3329);
                c0118M1166.m1174(c6111);
                c0118M1166.m1173(this.f29466, this.f29470, this.f29467, this.f29465, this.f29473);
                break;
            case 5:
                C0118 c0118M1167 = C0118.m1165(c3329);
                c0118M1167.m1174(c6111);
                c0118M1167.m1175(this.f29466, this.f29470, this.f29467, this.f29465, -1);
                break;
            case 6:
                C0118 c0118M1168 = C0118.m1165(c3329);
                c0118M1168.m1174(c6111);
                c0118M1168.m1175(this.f29466, this.f29470, this.f29467, this.f29465, this.f29473);
                break;
            case 7:
                C15642 c15642M1169 = C0118.m1165(c3329).m1169(this.f29466, this.f29465);
                if (c15642M1169 != null) {
                    int i9 = c15642M1169.f50842;
                    int i10 = this.f29470 + i9;
                    c6111.mo16839(i10, i9 + this.f29473);
                    c6111.m16988(i10, false);
                } else {
                    c6111.mo17029(0);
                    c6111.m16890(0, false);
                }
                c6111.m16819();
                break;
            case 8:
                C0118 c0118M1169 = C0118.m1165(c3329);
                c0118M1169.m1174(c6111);
                c0118M1169.m1172(this.f29466, this.f29470, this.f29473, this.f29465);
                break;
            case 9:
                C15642 c15642M11610 = C0118.m1165(c3329).m1169(this.f29466, this.f29465);
                if (c15642M11610 != null) {
                    int i11 = c15642M11610.f50841;
                    C10703 c10703 = new C10703(i11, c3329.length(), c3329);
                    c10703.m26933();
                    if (c10703.m26935() == '=') {
                        c10703.m26933();
                        int iM26934 = c10703.m26934();
                        int iM26928 = c10703.m26928();
                        if (iM26928 - iM26934 >= 2 && c3329.charAt(iM26934) == '\"' && c3329.charAt(iM26928 - 1) == '\"') {
                            iM26934++;
                            iM26928--;
                        }
                        c6111.mo16839(iM26934, iM26928);
                    } else {
                        c6111.mo17029(i11);
                    }
                    c6111.m16819();
                    c6111.m16988(c6111.m16916(), false);
                }
                break;
            case 10:
                int i12 = 0;
                for (int i13 = 1; i13 < this.f29470 && (iIndexOf2 = c3329.indexOf('\n', i12, c3329.length())) != -1; i13++) {
                    i12 = iIndexOf2 + 1;
                }
                int i14 = i12 + this.f29473;
                c6111.mo17029(i14);
                c6111.m16819();
                c6111.m16890(i14, false);
                break;
        }
    }
}
