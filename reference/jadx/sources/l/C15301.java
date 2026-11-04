package l;

import android.graphics.Paint;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܳۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4UF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15301 implements Serializable {
    public static final long serialVersionUID = 12335435;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final int f50012;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f50013;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f50014;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f50015;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f50016;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f50017 = true;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f50018;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f50019;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f50020;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f50021;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50022;

    static {
        Paint paint = new Paint(1);
        paint.setTextSize(C6907.m19161(12.0f));
        f50012 = Math.max(30, (int) (C6907.f22902.x / paint.measureText("我")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15301 m36736(int i, int i2) {
        C15301 c15301 = new C15301(10);
        c15301.f50021 = "";
        c15301.f50016 = 0;
        c15301.f50013 = 0;
        c15301.f50019 = i;
        c15301.f50022 = i2;
        return c15301;
    }

    public C15301(int i) {
        this.f50015 = i;
    }

    public final String toString() {
        int i = this.f50015;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("TYPE_EXACT: ");
                sb.append(m36734());
                sb.append(" (");
                sb.append(this.f50019);
                sb.append(", ");
                return C12669.m31437(this.f50022, MotionUtils.EASING_TYPE_FORMAT_END, sb);
            case 1:
                return "TYPE_SOURCE_FILE: " + m36734();
            case 2:
                return "TYPE_CLASS_ANNOTATION: " + m36734() + " " + this.f50019 + " -> " + this.f50022;
            case 3:
                return "TYPE_METHOD_NAME: " + m36734();
            case 4:
                return "TYPE_METHOD_ANNOTATION: " + m36734() + " " + this.f50018 + MotionUtils.EASING_TYPE_FORMAT_START + this.f50014 + MotionUtils.EASING_TYPE_FORMAT_END + this.f50020 + " -> " + this.f50019 + " -> " + this.f50022;
            case 5:
                return "TYPE_METHOD_INSTRUCTION: " + m36734() + " " + this.f50018 + MotionUtils.EASING_TYPE_FORMAT_START + this.f50014 + MotionUtils.EASING_TYPE_FORMAT_END + this.f50020 + " -> " + this.f50019;
            case 6:
                return "TYPE_METHOD_INSTRUCTION_IN: " + m36734() + " " + this.f50018 + MotionUtils.EASING_TYPE_FORMAT_START + this.f50014 + MotionUtils.EASING_TYPE_FORMAT_END + this.f50020 + " -> " + this.f50019 + " -> " + this.f50022;
            case 7:
                return "TYPE_FIELD_NAME: " + m36734();
            case 8:
                return "TYPE_FIELD_ANNOTATION: " + m36734() + " " + this.f50018 + ":" + this.f50020 + " -> " + this.f50019 + "->" + this.f50022;
            case 9:
                return "TYPE_FIELD_VALUE: " + m36734();
            case 10:
                StringBuilder sb2 = new StringBuilder("TYPE_LINE_COL: ");
                sb2.append(m36734());
                sb2.append(" (");
                sb2.append(this.f50019);
                sb2.append(", ");
                return C12669.m31437(this.f50022, MotionUtils.EASING_TYPE_FORMAT_END, sb2);
            default:
                return C13645.m33382(i, "UNKNOWN_TYPE: ");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m36734() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f50021);
        sb.insert(this.f50016, '[');
        sb.insert(this.f50013 + 1, ']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36739(int i, int i2, String str) {
        int i3 = f50012;
        if (i <= i3 - 5) {
            this.f50016 = i;
            this.f50013 = i2;
            this.f50021 = str;
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
        this.f50016 = i + 1;
        this.f50013 = i2 + 1;
        this.f50021 = C25272.m56409("…", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36743(InterfaceC19073 interfaceC19073, C4245 c4245) {
        if (interfaceC19073.getValue().mo5414() != 23) {
            String str = interfaceC19073.getName() + " = {...";
            String strGroup = c4245.group();
            m36739(str.length(), strGroup.length() + str.length(), C20196.m46451(str, strGroup, "...}"));
            return;
        }
        String value = ((InterfaceC14553) interfaceC19073.getValue()).getValue();
        String strM11834 = C3652.m11834(value);
        String str2 = interfaceC19073.getName() + " = \"";
        int iM11065 = C3369.m11065(c4245.start(), 0, 0, value);
        m36739(str2.length() + iM11065, str2.length() + C3369.m11065(c4245.end(), c4245.start(), iM11065, value), C20196.m46451(str2, strM11834, "\""));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36744(InterfaceC19073 interfaceC19073, InterfaceC16791 interfaceC16791) {
        C18459 c18459 = new C18459();
        try {
            AbstractC3589.m11645(new C2161(new C0560(c18459)), interfaceC16791);
        } catch (IOException unused) {
        }
        String str = interfaceC19073.getName() + " = ";
        int iMo5414 = interfaceC19073.getValue().mo5414();
        if (iMo5414 == 0 || iMo5414 == 6 || iMo5414 == 2 || iMo5414 == 3 || iMo5414 == 4) {
            int length = str.length();
            m36739(length, c18459.length() + length, str.concat(c18459.toString()));
            return;
        }
        String strM34972 = C14483.m34972(str, "{... ");
        int length2 = strM34972.length();
        int length3 = c18459.length() + length2;
        StringBuilder sbM27333 = C10732.m27333(strM34972);
        sbM27333.append(c18459.toString());
        sbM27333.append(" ...}");
        m36739(length2, length3, sbM27333.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36740(InterfaceC2665 interfaceC2665, C4245 c4245) {
        if (interfaceC2665.mo8822().mo5414() != 23) {
            String strM23910 = C8947.m23910(new StringBuilder(), m36735(interfaceC2665), "{...");
            String strGroup = c4245.group();
            m36739(strM23910.length(), strGroup.length() + strM23910.length(), C20196.m46451(strM23910, strGroup, "...}"));
            return;
        }
        String value = ((InterfaceC14553) interfaceC2665.mo8822()).getValue();
        String strM11834 = C3652.m11834(value);
        String str = m36735(interfaceC2665) + '\"';
        int iM11065 = C3369.m11065(c4245.start(), 0, 0, value);
        m36739(str.length() + iM11065, str.length() + C3369.m11065(c4245.end(), c4245.start(), iM11065, value), C20196.m46451(str, strM11834, "\""));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36741(InterfaceC2665 interfaceC2665, InterfaceC16791 interfaceC16791) {
        C18459 c18459 = new C18459();
        try {
            AbstractC3589.m11645(new C2161(new C0560(c18459)), interfaceC16791);
        } catch (IOException unused) {
        }
        String strM36735 = m36735(interfaceC2665);
        int iMo5414 = interfaceC2665.mo8822().mo5414();
        if (iMo5414 == 0 || iMo5414 == 6 || iMo5414 == 2 || iMo5414 == 3 || iMo5414 == 4) {
            int length = strM36735.length();
            m36739(length, c18459.length() + length, strM36735.concat(c18459.toString()));
            return;
        }
        String strM34972 = C14483.m34972(strM36735, "{... ");
        int length2 = strM34972.length();
        int length3 = c18459.length() + length2;
        StringBuilder sbM27333 = C10732.m27333(strM34972);
        sbM27333.append(c18459.toString());
        sbM27333.append(" ...}");
        m36739(length2, length3, sbM27333.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36742(InterfaceC8631 interfaceC8631, int i, int i2) {
        StringBuilder sbM27333 = C10732.m27333(".method ");
        for (EnumC2536 enumC2536 : EnumC2536.m8452(interfaceC8631.mo13184())) {
            sbM27333.append(enumC2536.toString());
            sbM27333.append(' ');
        }
        int length = sbM27333.length() + i;
        int length2 = sbM27333.length() + i2;
        sbM27333.append(interfaceC8631.getName());
        sbM27333.append(MotionUtils.EASING_TYPE_FORMAT_START);
        AbstractC14956 abstractC14956ListIterator = AbstractC1928.copyOf((Collection) interfaceC8631.getParameters()).listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            sbM27333.append(((InterfaceC13851) abstractC14956ListIterator.next()).getType());
        }
        sbM27333.append(MotionUtils.EASING_TYPE_FORMAT_END);
        sbM27333.append(interfaceC8631.mo6802());
        m36739(length, length2, sbM27333.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36735(InterfaceC2665 interfaceC2665) {
        StringBuilder sb = new StringBuilder(".field ");
        for (EnumC2536 enumC2536 : EnumC2536.m8453(interfaceC2665.mo8823())) {
            sb.append(enumC2536.toString());
            sb.append(' ');
        }
        sb.append(interfaceC2665.getName());
        sb.append(':');
        sb.append(interfaceC2665.getType());
        sb.append(" = ");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36738(int i, int i2, CharSequence charSequence) {
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
        int i4 = f50012;
        if (i2 > length) {
            i2 = length;
        } else if (length - i2 > i4) {
            length = i2 + i4;
        }
        int i5 = i - i3;
        if (i5 > i4 - 5) {
            int i6 = i2 - i;
            int i7 = i6 >= i4 ? i : i - (i4 - i6);
            this.f50016 = (i + 1) - i7;
            this.f50013 = (i2 + 1) - i7;
            this.f50021 = "…" + ((Object) charSequence.subSequence(i7, length));
            return;
        }
        this.f50016 = i5;
        this.f50013 = i2 - i3;
        this.f50021 = charSequence.subSequence(i3, length).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36745(C24132 c24132) {
        C15508 c15508Mo15350 = c24132.m54021().mo15350();
        try {
            m36737(c24132, c15508Mo15350);
            c15508Mo15350.close();
        } catch (Throwable th) {
            try {
                c15508Mo15350.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01b8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36737(C24132 c24132, C15508 c15508) {
        int i;
        int i2;
        int iIndexOf;
        int iIndexOf2;
        switch (this.f50015) {
            case 0:
                int i3 = this.f50019;
                int i4 = this.f50022;
                if (i3 <= i4 && i4 <= c24132.m54099()) {
                    String strSubstring = this.f50021.substring(this.f50016, this.f50013);
                    if (!strSubstring.isEmpty() && !strSubstring.equals(c15508.subSequence(this.f50019, this.f50022))) {
                        int i5 = this.f50019;
                        int iM40797 = C17370.m40797(c15508, strSubstring, 0, i5 + 1);
                        int iIndexOf3 = TextUtils.indexOf(c15508, strSubstring, i5);
                        if (iM40797 == -1 || (i = i5 - iM40797) > 50) {
                            i = -1;
                        }
                        if (iIndexOf3 == -1 || (i2 = iIndexOf3 - i5) > 50) {
                            i2 = -1;
                        }
                        if (i == -1 || i2 == -1) {
                            if (i == -1) {
                                if (i2 != -1) {
                                    iM40797 = iIndexOf3;
                                } else {
                                    iM40797 = -1;
                                }
                            }
                        } else if (i >= i2) {
                            iM40797 = iIndexOf3;
                        }
                        if (iM40797 != -1) {
                            c24132.mo52316(iM40797, strSubstring.length() + iM40797);
                        } else {
                            c24132.mo52316(this.f50019, this.f50022);
                        }
                    } else {
                        c24132.mo52316(this.f50019, this.f50022);
                    }
                    c24132.m54007();
                    c24132.m54077(false);
                    break;
                }
                break;
            case 1:
                int iIndexOf4 = TextUtils.indexOf(c15508, ".source");
                if (iIndexOf4 != -1 && (iIndexOf = c15508.indexOf('\"', iIndexOf4, c15508.length())) != -1) {
                    int i6 = (this.f50016 + iIndexOf) - 8;
                    c24132.mo52316(i6, (iIndexOf + this.f50013) - 8);
                    c24132.m54007();
                    c24132.m54074(i6, false);
                    break;
                }
                break;
            case 2:
                C20545 c20545M47096 = C20545.m47096(c15508);
                c20545M47096.m47105(c24132);
                c20545M47096.m47102(this.f50019, this.f50022);
                break;
            case 3:
                C23529 c23529M47101 = C20545.m47096(c15508).m47101(this.f50018, this.f50014, this.f50020);
                if (c23529M47101 != null) {
                    int i7 = c23529M47101.f76022;
                    int i8 = this.f50019 + i7;
                    c24132.mo52316(i8, i7 + this.f50022);
                    c24132.m54074(i8, false);
                } else {
                    c24132.mo52339(0);
                    c24132.m53935(0, false);
                }
                c24132.m54007();
                break;
            case 4:
                C20545 c20545M47097 = C20545.m47096(c15508);
                c20545M47097.m47105(c24132);
                c20545M47097.m47104(this.f50018, this.f50019, this.f50014, this.f50020, this.f50022);
                break;
            case 5:
                C20545 c20545M47098 = C20545.m47096(c15508);
                c20545M47098.m47105(c24132);
                c20545M47098.m47106(this.f50018, this.f50019, this.f50014, this.f50020, -1);
                break;
            case 6:
                C20545 c20545M47099 = C20545.m47096(c15508);
                c20545M47099.m47105(c24132);
                c20545M47099.m47106(this.f50018, this.f50019, this.f50014, this.f50020, this.f50022);
                break;
            case 7:
                C23529 c23529M47100 = C20545.m47096(c15508).m47100(this.f50018, this.f50020);
                if (c23529M47100 != null) {
                    int i9 = c23529M47100.f76022;
                    int i10 = this.f50019 + i9;
                    c24132.mo52316(i10, i9 + this.f50022);
                    c24132.m54074(i10, false);
                } else {
                    c24132.mo52339(0);
                    c24132.m53935(0, false);
                }
                c24132.m54007();
                break;
            case 8:
                C20545 c20545M470910 = C20545.m47096(c15508);
                c20545M470910.m47105(c24132);
                c20545M470910.m47103(this.f50018, this.f50019, this.f50022, this.f50020);
                break;
            case 9:
                C23529 c23529M47102 = C20545.m47096(c15508).m47100(this.f50018, this.f50020);
                if (c23529M47102 != null) {
                    int i11 = c23529M47102.f76021;
                    C14577 c14577 = new C14577(i11, c15508.length(), c15508);
                    c14577.m35172();
                    if (c14577.m35176() == '=') {
                        c14577.m35172();
                        int iM35178 = c14577.m35178();
                        int iM35170 = c14577.m35170();
                        if (iM35170 - iM35178 >= 2 && c15508.charAt(iM35178) == '\"' && c15508.charAt(iM35170 - 1) == '\"') {
                            iM35178++;
                            iM35170--;
                        }
                        c24132.mo52316(iM35178, iM35170);
                    } else {
                        c24132.mo52339(i11);
                    }
                    c24132.m54007();
                    c24132.m54074(c24132.m53968(), false);
                }
                break;
            case 10:
                int i12 = 0;
                for (int i13 = 1; i13 < this.f50019 && (iIndexOf2 = c15508.indexOf('\n', i12, c15508.length())) != -1; i13++) {
                    i12 = iIndexOf2 + 1;
                }
                int i14 = i12 + this.f50022;
                c24132.mo52339(i14);
                c24132.m54007();
                c24132.m53935(i14, false);
                break;
        }
    }
}
