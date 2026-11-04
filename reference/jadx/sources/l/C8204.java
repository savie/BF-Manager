package l;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۟᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28LT */
/* JADX INFO: loaded from: classes4.dex */
public final class C8204 implements InterfaceC2763 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f27023 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0746 f27024;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f27026;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f27028;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f27027 = -3.4028235E38f;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f27029 = -3.4028235E38f;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21287 f27025 = new C21287();

    @Override // l.InterfaceC2763
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC24393 mo5929(int i, int i2, byte[] bArr) {
        return C19171.m44438(this, bArr, i2);
    }

    public C8204(List list) {
        if (list != null && !list.isEmpty()) {
            this.f27028 = true;
            String strM19481 = C7116.m19481((byte[]) list.get(0));
            C20782.m47565(strM19481.startsWith("Format:"));
            C0746 c0746M3079 = C0746.m3079(strM19481);
            c0746M3079.getClass();
            this.f27024 = c0746M3079;
            m22108(new C21287((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f27028 = false;
        this.f27024 = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0217  */
    /* JADX WARN: Code duplicated, block: B:101:0x0219  */
    /* JADX WARN: Code duplicated, block: B:109:0x0238  */
    /* JADX WARN: Code duplicated, block: B:111:0x0243 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0247  */
    /* JADX WARN: Code duplicated, block: B:114:0x024b  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0252  */
    /* JADX WARN: Code duplicated, block: B:119:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0260 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0262  */
    /* JADX WARN: Code duplicated, block: B:122:0x0266  */
    /* JADX WARN: Code duplicated, block: B:123:0x026a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0280 A[LOOP:1: B:126:0x027e->B:127:0x0280, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x012a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0134  */
    /* JADX WARN: Code duplicated, block: B:50:0x014a  */
    /* JADX WARN: Code duplicated, block: B:64:0x018f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0194  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0203  */
    /* JADX WARN: Code duplicated, block: B:93:0x0205  */
    /* JADX WARN: Code duplicated, block: B:94:0x0207  */
    /* JADX WARN: Code duplicated, block: B:95:0x0209 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:98:0x0211  */
    /* JADX WARN: Code duplicated, block: B:99:0x0215  */
    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final void mo5930(byte[] bArr, int i, int i2, C9474 c9474, InterfaceC8103 interfaceC8103) {
        Charset charset;
        long j;
        C21287 c21287;
        int i3;
        C1492 c1492;
        float f;
        SpannableString spannableString;
        C5866 c5866;
        int i4;
        PointF pointF;
        Layout.Alignment alignment;
        int i5;
        int i6;
        int iM17090;
        float f2;
        float f3;
        int iM17080;
        C2137 c2137M17073;
        int iM22106;
        int iM22107;
        boolean z;
        Integer num;
        Integer num2;
        int i7;
        int i8;
        float f4;
        boolean z2;
        int i9;
        int i10;
        C8204 c8204 = this;
        long j2 = c9474.f30699;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C21287 c21288 = c8204.f27025;
        c21288.m48491(i + i2, bArr);
        c21288.m48510(i);
        Charset charsetM48495 = c21288.m48495();
        if (charsetM48495 == null) {
            charsetM48495 = StandardCharsets.UTF_8;
        }
        boolean z3 = c8204.f27028;
        if (!z3) {
            c8204.m22108(c21288, charsetM48495);
        }
        C0746 c0746M3079 = z3 ? c8204.f27024 : null;
        while (true) {
            String strM48515 = c21288.m48515(charsetM48495);
            if (strM48515 == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !c9474.f30698) ? null : new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    List list = (List) arrayList.get(i11);
                    if (!list.isEmpty() || i11 == 0) {
                        if (i11 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i11)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i11 + 1)).longValue();
                        C16187 c16187 = new C16187(jLongValue, jLongValue2 - jLongValue, list);
                        if (j3 == -9223372036854775807L || jLongValue2 >= j3) {
                            interfaceC8103.accept(c16187);
                        } else if (arrayList3 != null) {
                            arrayList3.add(c16187);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC8103.accept((C16187) it.next());
                    }
                    return;
                }
                return;
            }
            if (strM48515.startsWith("Format:")) {
                c0746M3079 = C0746.m3079(strM48515);
            } else {
                if (strM48515.startsWith("Dialogue:")) {
                    if (c0746M3079 == null) {
                        C1896.m6517("Skipping dialogue line before complete format: ".concat(strM48515));
                    } else {
                        int i12 = c0746M3079.f2720;
                        C20782.m47565(strM48515.startsWith("Dialogue:"));
                        String strSubstring = strM48515.substring(9);
                        int i13 = c0746M3079.f2723;
                        String[] strArrSplit = strSubstring.split(",", i12);
                        if (strArrSplit.length != i12) {
                            C1896.m6517("Skipping dialogue line with fewer columns than format: ".concat(strM48515));
                        } else {
                            if (i13 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i13].trim());
                                } catch (RuntimeException unused) {
                                    C1896.m6517("Fail to parse layer: " + strArrSplit[i13]);
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jM22107 = m22107(strArrSplit[c0746M3079.f2724]);
                            if (jM22107 == -9223372036854775807L) {
                                C1896.m6517("Skipping invalid timing: ".concat(strM48515));
                            } else {
                                charset = charsetM48495;
                                long jM22108 = m22107(strArrSplit[c0746M3079.f2719]);
                                if (jM22108 == -9223372036854775807L || jM22108 <= jM22107) {
                                    j = j2;
                                    c21287 = c21288;
                                    C1896.m6517("Skipping invalid timing: ".concat(strM48515));
                                } else {
                                    LinkedHashMap linkedHashMap = c8204.f27026;
                                    if (linkedHashMap != null) {
                                        int i14 = c0746M3079.f2722;
                                        c21287 = c21288;
                                        c1492 = i14 != -1 ? (C1492) linkedHashMap.get(strArrSplit[i14].trim()) : null;
                                        String str = strArrSplit[c0746M3079.f2721];
                                        C10440 c10440M26794 = C10440.m26794(str);
                                        String strReplace = C10440.m26795(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", EnumC25067.f81077);
                                        float f5 = c8204.f27027;
                                        f = c8204.f27029;
                                        spannableString = new SpannableString(strReplace);
                                        c5866 = new C5866();
                                        c5866.m17079(spannableString);
                                        c5866.m17084(i3);
                                        if (c1492 != null) {
                                            z = c1492.f5197;
                                            num = c1492.f5195;
                                            j = j2;
                                            num2 = c1492.f5192;
                                            if (num2 != null) {
                                                i7 = 0;
                                                i8 = 33;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                i7 = 0;
                                                i8 = 33;
                                            }
                                            if (c1492.f5193 == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i7, spannableString.length(), i8);
                                            }
                                            f4 = c1492.f5199;
                                            if (f4 != -3.4028235E38f && f != -3.4028235E38f) {
                                                c5866.m17087(f4 / f, 1);
                                            }
                                            z2 = c1492.f5198;
                                            if (z2 || !z) {
                                                i9 = 0;
                                                i10 = 33;
                                                if (z2) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            } else {
                                                i9 = 0;
                                                i10 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            }
                                            if (c1492.f5194) {
                                                spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                            }
                                            if (c1492.f5190) {
                                                spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                            }
                                        } else {
                                            jM22108 = jM22108;
                                            j = j2;
                                        }
                                        i4 = c10440M26794.f33176;
                                        pointF = c10440M26794.f33177;
                                        if (i4 == -1) {
                                            if (c1492 != null) {
                                                i4 = c1492.f5191;
                                            } else {
                                                i4 = -1;
                                            }
                                        }
                                        switch (i4) {
                                            case 0:
                                            default:
                                                j$$ExternalSyntheticOutline0.m(i4, "Unknown alignment: ");
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        c5866.m17089(alignment);
                                        i5 = Integer.MIN_VALUE;
                                        switch (i4) {
                                            case 0:
                                            default:
                                                j$$ExternalSyntheticOutline0.m(i4, "Unknown alignment: ");
                                            case -1:
                                                i6 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i6 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i6 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i6 = 2;
                                                break;
                                        }
                                        c5866.m17088(i6);
                                        switch (i4) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                j$$ExternalSyntheticOutline0.m(i4, "Unknown alignment: ");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i5 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i5 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i5 = 0;
                                                break;
                                        }
                                        c5866.m17076(i5);
                                        if (pointF != null || f == -3.4028235E38f || f5 == -3.4028235E38f) {
                                            iM17090 = c5866.m17090();
                                            f2 = 0.05f;
                                            if (iM17090 == 0) {
                                                f3 = 0.05f;
                                            } else if (iM17090 == 1) {
                                                f3 = 0.5f;
                                            } else if (iM17090 != 2) {
                                                f3 = -3.4028235E38f;
                                            } else {
                                                f3 = 0.95f;
                                            }
                                            c5866.m17086(f3);
                                            iM17080 = c5866.m17080();
                                            if (iM17080 != 0) {
                                                if (iM17080 == 1) {
                                                    f2 = 0.5f;
                                                } else if (iM17080 != 2) {
                                                    f2 = -3.4028235E38f;
                                                } else {
                                                    f2 = 0.95f;
                                                }
                                            }
                                            c5866.m17075(f2, 0);
                                        } else {
                                            c5866.m17086(pointF.x / f5);
                                            c5866.m17075(pointF.y / f, 0);
                                        }
                                        c2137M17073 = c5866.m17073();
                                        iM22107 = m22106(jM22108, arrayList2, arrayList);
                                        for (iM22106 = m22106(jM22107, arrayList2, arrayList); iM22106 < iM22107; iM22106++) {
                                            ((List) arrayList.get(iM22106)).add(c2137M17073);
                                        }
                                    } else {
                                        c21287 = c21288;
                                    }
                                    String str2 = strArrSplit[c0746M3079.f2721];
                                    C10440 c10440M26795 = C10440.m26794(str2);
                                    String strReplace2 = C10440.m26795(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", EnumC25067.f81077);
                                    float f6 = c8204.f27027;
                                    f = c8204.f27029;
                                    spannableString = new SpannableString(strReplace2);
                                    c5866 = new C5866();
                                    c5866.m17079(spannableString);
                                    c5866.m17084(i3);
                                    if (c1492 != null) {
                                        z = c1492.f5197;
                                        num = c1492.f5195;
                                        j = j2;
                                        num2 = c1492.f5192;
                                        if (num2 != null) {
                                            i7 = 0;
                                            i8 = 33;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i7 = 0;
                                            i8 = 33;
                                        }
                                        if (c1492.f5193 == 3) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i7, spannableString.length(), i8);
                                        }
                                        f4 = c1492.f5199;
                                        if (f4 != -3.4028235E38f) {
                                            c5866.m17087(f4 / f, 1);
                                        }
                                        z2 = c1492.f5198;
                                        if (z2) {
                                            i9 = 0;
                                            i10 = 33;
                                            if (z2) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else {
                                            i9 = 0;
                                            i10 = 33;
                                            if (z2) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c1492.f5194) {
                                            spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                        }
                                        if (c1492.f5190) {
                                            spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                        }
                                    } else {
                                        jM22108 = jM22108;
                                        j = j2;
                                    }
                                    i4 = c10440M26795.f33176;
                                    pointF = c10440M26795.f33177;
                                    if (i4 == -1) {
                                        if (c1492 != null) {
                                            i4 = c1492.f5191;
                                        } else {
                                            i4 = -1;
                                        }
                                    }
                                    switch (i4) {
                                        case 0:
                                        default:
                                            j$$ExternalSyntheticOutline0.m(i4, "Unknown alignment: ");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    c5866.m17089(alignment);
                                    i5 = Integer.MIN_VALUE;
                                    switch (i4) {
                                        case 0:
                                        default:
                                            j$$ExternalSyntheticOutline0.m(i4, "Unknown alignment: ");
                                        case -1:
                                            i6 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i6 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i6 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i6 = 2;
                                            break;
                                    }
                                    c5866.m17088(i6);
                                    switch (i4) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            j$$ExternalSyntheticOutline0.m(i4, "Unknown alignment: ");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i5 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i5 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i5 = 0;
                                            break;
                                    }
                                    c5866.m17076(i5);
                                    if (pointF != null) {
                                        iM17090 = c5866.m17090();
                                        f2 = 0.05f;
                                        if (iM17090 == 0) {
                                            f3 = 0.05f;
                                        } else if (iM17090 == 1) {
                                            f3 = 0.5f;
                                        } else if (iM17090 != 2) {
                                            f3 = -3.4028235E38f;
                                        } else {
                                            f3 = 0.95f;
                                        }
                                        c5866.m17086(f3);
                                        iM17080 = c5866.m17080();
                                        if (iM17080 != 0) {
                                            if (iM17080 == 1) {
                                                f2 = 0.5f;
                                            } else if (iM17080 != 2) {
                                                f2 = -3.4028235E38f;
                                            } else {
                                                f2 = 0.95f;
                                            }
                                        }
                                        c5866.m17075(f2, 0);
                                    } else {
                                        iM17090 = c5866.m17090();
                                        f2 = 0.05f;
                                        if (iM17090 == 0) {
                                            f3 = 0.05f;
                                        } else if (iM17090 == 1) {
                                            f3 = 0.5f;
                                        } else if (iM17090 != 2) {
                                            f3 = -3.4028235E38f;
                                        } else {
                                            f3 = 0.95f;
                                        }
                                        c5866.m17086(f3);
                                        iM17080 = c5866.m17080();
                                        if (iM17080 != 0) {
                                            if (iM17080 == 1) {
                                                f2 = 0.5f;
                                            } else if (iM17080 != 2) {
                                                f2 = -3.4028235E38f;
                                            } else {
                                                f2 = 0.95f;
                                            }
                                        }
                                        c5866.m17075(f2, 0);
                                    }
                                    c2137M17073 = c5866.m17073();
                                    iM22107 = m22106(jM22108, arrayList2, arrayList);
                                    while (iM22106 < iM22107) {
                                        ((List) arrayList.get(iM22106)).add(c2137M17073);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetM48495;
                    j = j2;
                    c21287 = c21288;
                } else {
                    charset = charsetM48495;
                    j = j2;
                    c21287 = c21288;
                }
                c8204 = this;
                c0746M3079 = c0746M3079;
                c21288 = c21287;
                charsetM48495 = charset;
                j2 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22108(C21287 c21287, Charset charset) {
        while (true) {
            String strM48515 = c21287.m48515(charset);
            if (strM48515 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strM48515)) {
                while (true) {
                    String strM48516 = c21287.m48515(charset);
                    if (strM48516 == null || (c21287.m48486() != 0 && c21287.m48487(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strM48516.split(":");
                    if (strArrSplit.length == 2) {
                        String strM21453 = C7914.m21453(strArrSplit[0].trim());
                        strM21453.getClass();
                        if (strM21453.equals("playresx")) {
                            this.f27027 = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM21453.equals("playresy")) {
                            try {
                                this.f27029 = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if (!"[V4+ Styles]".equalsIgnoreCase(strM48515)) {
                if ("[V4 Styles]".equalsIgnoreCase(strM48515)) {
                    C1896.m6513("[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strM48515)) {
                    return;
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C19391 c19391M44848 = null;
                while (true) {
                    String strM48517 = c21287.m48515(charset);
                    if (strM48517 == null || (c21287.m48486() != 0 && c21287.m48487(charset) == 91)) {
                        break;
                    }
                    if (strM48517.startsWith("Format:")) {
                        c19391M44848 = C19391.m44848(strM48517);
                    } else if (strM48517.startsWith("Style:")) {
                        if (c19391M44848 == null) {
                            C1896.m6517("Skipping 'Style:' line before 'Format:' line: ".concat(strM48517));
                        } else {
                            C1492 c1492M5316 = C1492.m5316(strM48517, c19391M44848);
                            if (c1492M5316 != null) {
                                linkedHashMap.put(c1492M5316.f5196, c1492M5316);
                            }
                        }
                    }
                }
                this.f27026 = linkedHashMap;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m22107(String str) {
        Matcher matcher = f27023.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = C7116.f23455;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22106(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }
}
