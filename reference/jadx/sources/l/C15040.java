package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6OD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15040 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f49031;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f49033;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f49034;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C18503 f49036;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f49037;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19273 f49038;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f49039;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f49040;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f49041;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f49035 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f49032 = -1;

    public C15040(C19273 c19273, C12052 c12052, C8294 c8294, boolean z, C18503 c18503) {
        String string;
        char cCharAt;
        this.f49038 = c19273;
        this.f49040 = z;
        if (c12052.m29954()) {
            string = "\t";
        } else {
            int iMax = Math.max(0, c12052.m29953());
            if (iMax < 0) {
                throw new IllegalArgumentException(C8479.m22141(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C2271.m6966(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i = 0; i < iMax; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f49041 = string;
        this.f49034 = c8294.m21729();
        String strM21731 = "\n";
        if (!z) {
            if (c8294.m21731().isEmpty()) {
                CharSequence charSequence = c19273.f62225;
                for (int i2 = 0; i2 < charSequence.length() && (cCharAt = charSequence.charAt(i2)) != '\n'; i2++) {
                    if (cCharAt == '\r') {
                        int i3 = i2 + 1;
                        if (i3 >= charSequence.length() || charSequence.charAt(i3) != '\n') {
                            strM21731 = "\r";
                            break;
                        } else {
                            strM21731 = "\r\n";
                            break;
                        }
                    }
                }
            } else {
                strM21731 = c8294.m21731();
            }
        }
        this.f49033 = strM21731;
        this.f49036 = c18503;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:127:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:251:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:336:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:379:0x0548 A[PHI: r19 r20
      0x0548: PHI (r19v2 java.lang.CharSequence) = 
      (r19v6 java.lang.CharSequence)
      (r19v6 java.lang.CharSequence)
      (r19v9 java.lang.CharSequence)
      (r19v9 java.lang.CharSequence)
     binds: [B:259:0x03d4, B:261:0x03dc, B:193:0x0306, B:195:0x030c] A[DONT_GENERATE, DONT_INLINE]
      0x0548: PHI (r20v2 int) = (r20v6 int), (r20v6 int), (r20v7 int), (r20v7 int) binds: [B:259:0x03d4, B:261:0x03dc, B:193:0x0306, B:195:0x030c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:382:0x054e A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:385:0x0555  */
    /* JADX WARN: Code duplicated, block: B:390:0x0586  */
    /* JADX WARN: Code duplicated, block: B:395:0x059d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: switch over string: strings are not added: [[switch], [if], [for], [with], [catch], [while], [function]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36028() throws Throwable {
        ArrayList arrayList;
        C19273 c19273;
        C19273 c19274;
        CharSequence charSequence;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        byte b;
        C2338 c2338;
        int i4;
        int type;
        C19273 c19275 = this.f49038;
        CharSequence charSequence2 = c19275.f62225;
        ArrayList arrayList2 = c19275.f62231;
        InterfaceC19761 interfaceC19761 = null;
        int i5 = 0;
        int iMo22510 = 0;
        boolean zM19415 = false;
        while (i5 < arrayList2.size()) {
            C18567.m42975();
            InterfaceC19761 interfaceC19762 = (InterfaceC19761) arrayList2.get(i5);
            this.f49031 += c19275.f62224[i5];
            int type2 = interfaceC19762.getType();
            if (type2 == 141) {
                arrayList = arrayList2;
                c19273 = c19275;
            } else {
                int iMo22508 = interfaceC19762.mo22508();
                String strM48081 = C21460.m48081(iMo22510, iMo22508, charSequence2);
                C18503 c18503 = this.f49036;
                if (type2 == -1) {
                    if (c19275.m44246(i5, 16)) {
                        c18503.append((CharSequence) strM48081);
                        return;
                    }
                    return;
                }
                boolean z3 = this.f49040;
                if (z3 && c19275.m44246(i5, 8)) {
                    zM19415 |= C7278.m19415(strM48081);
                    iMo22510 = interfaceC19762.mo22510() + 1;
                } else {
                    boolean z4 = type2 == 3 || type2 == 4 || type2 == 1 || type2 == 2;
                    if (z3 && z4 && !c19275.m44246(i5, 16)) {
                        String text = interfaceC19762.getText();
                        if (!text.startsWith("#!") && !text.startsWith("/*!") && !text.startsWith("///") && !text.contains("@license") && !text.contains("@preserve") && !text.contains("@copyright") && !text.contains("@ts-") && !text.contains("#__PURE__") && !text.contains("@__PURE__") && !text.contains("sourceURL=")) {
                            if (c19275.m44246(i5, 32)) {
                                m36026(this.f49031);
                            }
                            zM19415 |= C7278.m19415(strM48081) || C7278.m19415(interfaceC19762.getText());
                            iMo22510 = interfaceC19762.mo22510() + 1;
                        }
                    }
                    if (interfaceC19761 == null) {
                        if (c19275.m44246(i5, 16)) {
                            c18503.append((CharSequence) strM48081);
                        } else if (!z3) {
                            c18503.append((CharSequence) this.f49034);
                        }
                    } else if (c19275.m44246(i5, 16) || c19275.m44246(i5, 64)) {
                        c18503.append((CharSequence) strM48081);
                    } else {
                        boolean z5 = zM19415 || C7278.m19415(strM48081);
                        int type3 = interfaceC19761.getType();
                        if (type3 == 3 || type3 == 1 || type3 == 2) {
                            c19274 = c19275;
                            charSequence = charSequence2;
                            arrayList = arrayList2;
                            i = i5;
                            i2 = type2;
                            i3 = iMo22508;
                            z = z3;
                            m36026(this.f49031);
                        } else {
                            if (z3 || !z4) {
                                if (z3 || c19275.m44243(i5) != 2) {
                                    if (z3) {
                                        if (!z5 || c19275.m44246(interfaceC19761.mo22511(), 4) || interfaceC19762.getType() == 92) {
                                            i2 = type2;
                                            z = z3;
                                        } else {
                                            String text2 = interfaceC19761.getText();
                                            int iM44247 = c19275.m44247(interfaceC19761.mo22511());
                                            if (iM44247 >= 0) {
                                                i2 = type2;
                                                z = z3;
                                                boolean z6 = ((InterfaceC19761) arrayList2.get(iM44247)).getType() == 98 || ((InterfaceC19761) arrayList2.get(iM44247)).getType() == 97;
                                                if ((text2.equals("yield") || (c2338 = c19275.f62230) == null || c2338.m7096(interfaceC19761.mo22508())) && !z6 && (text2.equals("return") || text2.equals("throw") || text2.equals("yield") || text2.equals("break") || text2.equals("continue") || text2.equals("async"))) {
                                                    m36026(this.f49031);
                                                }
                                            } else {
                                                i2 = type2;
                                                z = z3;
                                            }
                                            if (text2.equals("yield")) {
                                                m36026(this.f49031);
                                            } else {
                                                m36026(this.f49031);
                                            }
                                        }
                                        if (!c19275.m44246(interfaceC19761.mo22511(), 4) && c19275.m44243(i5) != 3 && C7278.m19416(interfaceC19761, interfaceC19762)) {
                                            m36027();
                                        }
                                    } else {
                                        i2 = type2;
                                        z = z3;
                                        if (c19275.m44243(i5) == 1) {
                                            m36027();
                                        } else if (c19275.m44243(i5) != 3) {
                                            String text3 = interfaceC19761.getText();
                                            String text4 = interfaceC19762.getText();
                                            int iM44248 = c19275.m44247(interfaceC19761.mo22511());
                                            c19274 = c19275;
                                            if (iM44248 >= 0) {
                                                i = i5;
                                                charSequence = charSequence2;
                                                if ((((InterfaceC19761) arrayList2.get(iM44248)).getType() == 98 || ((InterfaceC19761) arrayList2.get(iM44248)).getType() == 97) && (text4.equals("[") || text4.equals(MotionUtils.EASING_TYPE_FORMAT_START))) {
                                                    arrayList = arrayList2;
                                                    i3 = iMo22508;
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    m36027();
                                                }
                                            } else {
                                                charSequence = charSequence2;
                                                i = i5;
                                            }
                                            if ((!text3.equals("*") || iM44248 < 0 || ((InterfaceC19761) arrayList2.get(iM44248)).getType() != 23) && !C7278.m19416(interfaceC19761, interfaceC19762) && !text3.equals("=") && !text4.equals("=")) {
                                                switch (text3.hashCode()) {
                                                    case -1458301887:
                                                        if (!text3.equals("satisfies")) {
                                                            b = -1;
                                                        } else {
                                                            b = 0;
                                                        }
                                                        break;
                                                    case -1305664359:
                                                        if (!text3.equals("extends")) {
                                                            b = -1;
                                                        } else {
                                                            b = 1;
                                                        }
                                                        break;
                                                    case -1184795739:
                                                        if (!text3.equals("import")) {
                                                            b = -1;
                                                        } else {
                                                            b = 2;
                                                        }
                                                        break;
                                                    case -1068784020:
                                                        if (!text3.equals(am.e)) {
                                                            b = -1;
                                                        } else {
                                                            b = 3;
                                                        }
                                                        break;
                                                    case 3122:
                                                        if (!text3.equals("as")) {
                                                            b = -1;
                                                        } else {
                                                            b = 4;
                                                        }
                                                        break;
                                                    case 3365:
                                                        if (!text3.equals("in")) {
                                                            b = -1;
                                                        } else {
                                                            b = 5;
                                                        }
                                                        break;
                                                    case 3543:
                                                        if (!text3.equals("of")) {
                                                            b = -1;
                                                        } else {
                                                            b = 6;
                                                        }
                                                        break;
                                                    case 3046192:
                                                        if (!text3.equals("case")) {
                                                            b = -1;
                                                        } else {
                                                            b = 7;
                                                        }
                                                        break;
                                                    case 3151786:
                                                        if (!text3.equals("from")) {
                                                            b = -1;
                                                        } else {
                                                            b = 8;
                                                        }
                                                        break;
                                                    default:
                                                        b = -1;
                                                        break;
                                                }
                                                switch (b) {
                                                    default:
                                                        if (!text3.equals(l.d) || !C7278.m19414(text4.charAt(0))) {
                                                            if (text4.equals(",") || text4.equals(l.b)) {
                                                                arrayList = arrayList2;
                                                            } else {
                                                                arrayList = arrayList2;
                                                                if (!text4.equals(MotionUtils.EASING_TYPE_FORMAT_END) && !text4.equals("]") && !text4.equals(".")) {
                                                                    i3 = iMo22508;
                                                                    if (!text4.equals("?.") && !text3.equals(".") && !text3.equals("?.") && !text3.equals(MotionUtils.EASING_TYPE_FORMAT_START) && !text3.equals("[") && !text4.equals(":") && (!text4.equals("[") || text3.equals("return") || text3.equals("throw") || text3.equals("yield"))) {
                                                                        if (!text3.equals(":") && !text3.equals(",") && !text3.equals(l.b) && !text3.equals("=>") && !text4.equals("=>")) {
                                                                            if (text4.equals(MotionUtils.EASING_TYPE_FORMAT_START)) {
                                                                                switch (text3) {
                                                                                }
                                                                            } else if (text4.equals("{")) {
                                                                                z2 = !text3.equals("${");
                                                                                break;
                                                                            } else if ((!text3.equals(l.d) || (!text4.equals("else") && !text4.equals("catch") && !text4.equals("finally"))) && !text3.equals("=") && !text4.equals("=") && !text3.equals("?") && !text4.equals("?") && !text3.equals("|") && !text4.equals("|") && !text3.equals(a.p) && !text4.equals(a.p) && !text3.equals("return") && !text3.equals("throw") && !text3.equals("yield") && !text3.equals("new")) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                z2 = false;
                                                            }
                                                            i3 = iMo22508;
                                                            z2 = false;
                                                            break;
                                                        }
                                                        z2 = true;
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                        arrayList = arrayList2;
                                                        i3 = iMo22508;
                                                        z2 = true;
                                                        break;
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                                i3 = iMo22508;
                                                z2 = true;
                                            }
                                            if (z2) {
                                                m36027();
                                            }
                                        }
                                    }
                                    c19274 = c19275;
                                    charSequence = charSequence2;
                                    arrayList = arrayList2;
                                    i = i5;
                                    i3 = iMo22508;
                                }
                            } else if (type2 == 4) {
                                if (i5 >= this.f49035) {
                                    this.f49032 = c19275.m44247(i5);
                                    this.f49035 = c19275.m44248(i5);
                                    int i6 = this.f49031;
                                    int i7 = i5 + 1;
                                    while (true) {
                                        int i8 = this.f49035;
                                        if (i7 <= i8) {
                                            i6 += c19275.f62224[i7];
                                            i7++;
                                        } else {
                                            this.f49037 = c19275.m44249(this.f49032, i8);
                                            this.f49039 = Math.max(this.f49031, i6);
                                        }
                                    }
                                }
                                if (!this.f49037 && !c19275.m44246(this.f49035, 80)) {
                                    if (!C7278.m19415(interfaceC19762.getText()) && c19275.m44243(this.f49035) != 2 && (i4 = this.f49032) >= 0 && (type = ((InterfaceC19761) arrayList2.get(i4)).getType()) != 87 && type != 89 && type != 91 && type != 99 && type != 135) {
                                        switch (type) {
                                            case 93:
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                            case 95:
                                                break;
                                            default:
                                                if (!z5) {
                                                    m36027();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    m36026(this.f49039);
                                } else if (!z5) {
                                    m36027();
                                }
                            } else if (!z5) {
                                m36027();
                            }
                            m36026(this.f49031);
                        }
                        charSequence2 = charSequence;
                        c18503.m42896(i3, interfaceC19762.mo22510() + 1, charSequence2);
                        if (z) {
                            c19273 = c19274;
                            i5 = i;
                            if (c19273.m44246(i5, 4) && i2 != 93) {
                                c18503.append(';');
                            }
                        } else {
                            c19273 = c19274;
                            i5 = i;
                        }
                        iMo22510 = interfaceC19762.mo22510() + 1;
                        interfaceC19761 = interfaceC19762;
                        zM19415 = false;
                    }
                    c19274 = c19275;
                    charSequence = charSequence2;
                    arrayList = arrayList2;
                    i = i5;
                    i2 = type2;
                    i3 = iMo22508;
                    z = z3;
                    charSequence2 = charSequence;
                    c18503.m42896(i3, interfaceC19762.mo22510() + 1, charSequence2);
                    if (z) {
                        c19273 = c19274;
                        i5 = i;
                        if (c19273.m44246(i5, 4)) {
                            c18503.append(';');
                        }
                    } else {
                        c19273 = c19274;
                        i5 = i;
                    }
                    iMo22510 = interfaceC19762.mo22510() + 1;
                    interfaceC19761 = interfaceC19762;
                    zM19415 = false;
                }
                arrayList = arrayList2;
                c19273 = c19275;
            }
            i5++;
            c19275 = c19273;
            arrayList2 = arrayList;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m36027() throws Throwable {
        char cCharAt;
        C18503 c18503 = this.f49036;
        if (c18503.length() == 0 || (cCharAt = c18503.charAt(c18503.length() - 1)) == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r') {
            return;
        }
        c18503.append(' ');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36026(int i) {
        String str = this.f49033;
        C18503 c18503 = this.f49036;
        c18503.append((CharSequence) str);
        if (this.f49040) {
            return;
        }
        c18503.append((CharSequence) this.f49034);
        int iMax = Math.max(0, i);
        if (iMax < 0) {
            throw new IllegalArgumentException(C8479.m22141(iMax, "count is negative: "));
        }
        String string = this.f49041;
        int length = string.length();
        if (iMax == 0 || length == 0) {
            string = "";
        } else if (iMax != 1) {
            if (string.length() > Integer.MAX_VALUE / iMax) {
                throw new OutOfMemoryError("Repeating " + string.length() + " bytes String " + iMax + " times will produce a String exceeding maximum size.");
            }
            StringBuilder sb = new StringBuilder(length * iMax);
            for (int i2 = 0; i2 < iMax; i2++) {
                sb.append(string);
            }
            string = sb.toString();
        }
        c18503.append((CharSequence) string);
    }
}
