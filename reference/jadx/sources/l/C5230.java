package l;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۚ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28LT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5230 implements InterfaceC6951 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f18135 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2407 f18137;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f18140;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f18141;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f18138 = -3.4028235E38f;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f18136 = -3.4028235E38f;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2460 f18139 = new C2460();

    @Override // l.InterfaceC6951
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC9753 mo11108(int i, int i2, byte[] bArr) {
        return C22474.m49977(this, bArr, i2);
    }

    public C5230(List list) {
        if (list != null && !list.isEmpty()) {
            this.f18140 = true;
            String strM41834 = C17983.m41834((byte[]) list.get(0));
            C2023.m6507(strM41834.startsWith("Format:"));
            C2407 c2407M7333 = C2407.m7333(strM41834);
            c2407M7333.getClass();
            this.f18137 = c2407M7333;
            m14422(new C2460((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f18140 = false;
        this.f18137 = null;
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
    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11109(byte[] bArr, int i, int i2, C4128 c4128, InterfaceC1008 interfaceC1008) {
        Charset charset;
        long j;
        C2460 c2460;
        int i3;
        C12992 c12992;
        float f;
        SpannableString spannableString;
        C20369 c20369;
        int i4;
        PointF pointF;
        Layout.Alignment alignment;
        int i5;
        int i6;
        int iM45993;
        float f2;
        float f3;
        int iM46005;
        C0612 c0612M45996;
        int iM14420;
        int iM14421;
        boolean z;
        Integer num;
        Integer num2;
        int i7;
        int i8;
        float f4;
        boolean z2;
        int i9;
        int i10;
        C5230 c5230 = this;
        long j2 = c4128.f15127;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C2460 c2461 = c5230.f18139;
        c2461.m7508(i + i2, bArr);
        c2461.m7510(i);
        Charset charsetM7511 = c2461.m7511();
        if (charsetM7511 == null) {
            charsetM7511 = StandardCharsets.UTF_8;
        }
        boolean z3 = c5230.f18140;
        if (!z3) {
            c5230.m14422(c2461, charsetM7511);
        }
        C2407 c2407M7333 = z3 ? c5230.f18137 : null;
        while (true) {
            String strM7523 = c2461.m7523(charsetM7511);
            if (strM7523 == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !c4128.f15126) ? null : new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    List list = (List) arrayList.get(i11);
                    if (!list.isEmpty() || i11 == 0) {
                        if (i11 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i11)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i11 + 1)).longValue();
                        C17513 c17513 = new C17513(jLongValue, jLongValue2 - jLongValue, list);
                        if (j3 == -9223372036854775807L || jLongValue2 >= j3) {
                            interfaceC1008.accept(c17513);
                        } else if (arrayList3 != null) {
                            arrayList3.add(c17513);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC1008.accept((C17513) it.next());
                    }
                    return;
                }
                return;
            }
            if (strM7523.startsWith("Format:")) {
                c2407M7333 = C2407.m7333(strM7523);
            } else {
                if (strM7523.startsWith("Dialogue:")) {
                    if (c2407M7333 == null) {
                        C0303.m1848("Skipping dialogue line before complete format: ".concat(strM7523));
                    } else {
                        int i12 = c2407M7333.f9677;
                        C2023.m6507(strM7523.startsWith("Dialogue:"));
                        String strSubstring = strM7523.substring(9);
                        int i13 = c2407M7333.f9678;
                        String[] strArrSplit = strSubstring.split(",", i12);
                        if (strArrSplit.length != i12) {
                            C0303.m1848("Skipping dialogue line with fewer columns than format: ".concat(strM7523));
                        } else {
                            if (i13 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i13].trim());
                                } catch (RuntimeException unused) {
                                    C0303.m1848("Fail to parse layer: " + strArrSplit[i13]);
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jM14421 = m14421(strArrSplit[c2407M7333.f9674]);
                            if (jM14421 == -9223372036854775807L) {
                                C0303.m1848("Skipping invalid timing: ".concat(strM7523));
                            } else {
                                charset = charsetM7511;
                                long jM14422 = m14421(strArrSplit[c2407M7333.f9675]);
                                if (jM14422 == -9223372036854775807L || jM14422 <= jM14421) {
                                    j = j2;
                                    c2460 = c2461;
                                    C0303.m1848("Skipping invalid timing: ".concat(strM7523));
                                } else {
                                    LinkedHashMap linkedHashMap = c5230.f18141;
                                    if (linkedHashMap != null) {
                                        int i14 = c2407M7333.f9676;
                                        c2460 = c2461;
                                        c12992 = i14 != -1 ? (C12992) linkedHashMap.get(strArrSplit[i14].trim()) : null;
                                        String str = strArrSplit[c2407M7333.f9679];
                                        C0996 c0996M3809 = C0996.m3809(str);
                                        String strReplace = C0996.m3810(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", EnumC6895.f23212);
                                        float f5 = c5230.f18138;
                                        f = c5230.f18136;
                                        spannableString = new SpannableString(strReplace);
                                        c20369 = new C20369();
                                        c20369.m46002(spannableString);
                                        c20369.m46004(i3);
                                        if (c12992 != null) {
                                            z = c12992.f43322;
                                            num = c12992.f43318;
                                            j = j2;
                                            num2 = c12992.f43325;
                                            if (num2 != null) {
                                                i7 = 0;
                                                i8 = 33;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                i7 = 0;
                                                i8 = 33;
                                            }
                                            if (c12992.f43324 == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i7, spannableString.length(), i8);
                                            }
                                            f4 = c12992.f43319;
                                            if (f4 != -3.4028235E38f && f != -3.4028235E38f) {
                                                c20369.m46010(f4 / f, 1);
                                            }
                                            z2 = c12992.f43326;
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
                                            if (c12992.f43323) {
                                                spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                            }
                                            if (c12992.f43320) {
                                                spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                            }
                                        } else {
                                            jM14422 = jM14422;
                                            j = j2;
                                        }
                                        i4 = c0996M3809.f4658;
                                        pointF = c0996M3809.f4659;
                                        if (i4 == -1) {
                                            if (c12992 != null) {
                                                i4 = c12992.f43321;
                                            } else {
                                                i4 = -1;
                                            }
                                        }
                                        switch (i4) {
                                            case 0:
                                            default:
                                                C7309.m19506(i4, "Unknown alignment: ");
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
                                        c20369.m46012(alignment);
                                        i5 = Integer.MIN_VALUE;
                                        switch (i4) {
                                            case 0:
                                            default:
                                                C7309.m19506(i4, "Unknown alignment: ");
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
                                        c20369.m46011(i6);
                                        switch (i4) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                C7309.m19506(i4, "Unknown alignment: ");
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
                                        c20369.m45999(i5);
                                        if (pointF != null || f == -3.4028235E38f || f5 == -3.4028235E38f) {
                                            iM45993 = c20369.m45993();
                                            f2 = 0.05f;
                                            if (iM45993 == 0) {
                                                f3 = 0.05f;
                                            } else if (iM45993 == 1) {
                                                f3 = 0.5f;
                                            } else if (iM45993 != 2) {
                                                f3 = -3.4028235E38f;
                                            } else {
                                                f3 = 0.95f;
                                            }
                                            c20369.m46009(f3);
                                            iM46005 = c20369.m46005();
                                            if (iM46005 != 0) {
                                                if (iM46005 == 1) {
                                                    f2 = 0.5f;
                                                } else if (iM46005 != 2) {
                                                    f2 = -3.4028235E38f;
                                                } else {
                                                    f2 = 0.95f;
                                                }
                                            }
                                            c20369.m45998(f2, 0);
                                        } else {
                                            c20369.m46009(pointF.x / f5);
                                            c20369.m45998(pointF.y / f, 0);
                                        }
                                        c0612M45996 = c20369.m45996();
                                        iM14421 = m14420(jM14422, arrayList2, arrayList);
                                        for (iM14420 = m14420(jM14421, arrayList2, arrayList); iM14420 < iM14421; iM14420++) {
                                            ((List) arrayList.get(iM14420)).add(c0612M45996);
                                        }
                                    } else {
                                        c2460 = c2461;
                                    }
                                    String str2 = strArrSplit[c2407M7333.f9679];
                                    C0996 c0996M38010 = C0996.m3809(str2);
                                    String strReplace2 = C0996.m3810(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", EnumC6895.f23212);
                                    float f6 = c5230.f18138;
                                    f = c5230.f18136;
                                    spannableString = new SpannableString(strReplace2);
                                    c20369 = new C20369();
                                    c20369.m46002(spannableString);
                                    c20369.m46004(i3);
                                    if (c12992 != null) {
                                        z = c12992.f43322;
                                        num = c12992.f43318;
                                        j = j2;
                                        num2 = c12992.f43325;
                                        if (num2 != null) {
                                            i7 = 0;
                                            i8 = 33;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i7 = 0;
                                            i8 = 33;
                                        }
                                        if (c12992.f43324 == 3) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i7, spannableString.length(), i8);
                                        }
                                        f4 = c12992.f43319;
                                        if (f4 != -3.4028235E38f) {
                                            c20369.m46010(f4 / f, 1);
                                        }
                                        z2 = c12992.f43326;
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
                                        if (c12992.f43323) {
                                            spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                        }
                                        if (c12992.f43320) {
                                            spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                        }
                                    } else {
                                        jM14422 = jM14422;
                                        j = j2;
                                    }
                                    i4 = c0996M38010.f4658;
                                    pointF = c0996M38010.f4659;
                                    if (i4 == -1) {
                                        if (c12992 != null) {
                                            i4 = c12992.f43321;
                                        } else {
                                            i4 = -1;
                                        }
                                    }
                                    switch (i4) {
                                        case 0:
                                        default:
                                            C7309.m19506(i4, "Unknown alignment: ");
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
                                    c20369.m46012(alignment);
                                    i5 = Integer.MIN_VALUE;
                                    switch (i4) {
                                        case 0:
                                        default:
                                            C7309.m19506(i4, "Unknown alignment: ");
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
                                    c20369.m46011(i6);
                                    switch (i4) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            C7309.m19506(i4, "Unknown alignment: ");
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
                                    c20369.m45999(i5);
                                    if (pointF != null) {
                                        iM45993 = c20369.m45993();
                                        f2 = 0.05f;
                                        if (iM45993 == 0) {
                                            f3 = 0.05f;
                                        } else if (iM45993 == 1) {
                                            f3 = 0.5f;
                                        } else if (iM45993 != 2) {
                                            f3 = -3.4028235E38f;
                                        } else {
                                            f3 = 0.95f;
                                        }
                                        c20369.m46009(f3);
                                        iM46005 = c20369.m46005();
                                        if (iM46005 != 0) {
                                            if (iM46005 == 1) {
                                                f2 = 0.5f;
                                            } else if (iM46005 != 2) {
                                                f2 = -3.4028235E38f;
                                            } else {
                                                f2 = 0.95f;
                                            }
                                        }
                                        c20369.m45998(f2, 0);
                                    } else {
                                        iM45993 = c20369.m45993();
                                        f2 = 0.05f;
                                        if (iM45993 == 0) {
                                            f3 = 0.05f;
                                        } else if (iM45993 == 1) {
                                            f3 = 0.5f;
                                        } else if (iM45993 != 2) {
                                            f3 = -3.4028235E38f;
                                        } else {
                                            f3 = 0.95f;
                                        }
                                        c20369.m46009(f3);
                                        iM46005 = c20369.m46005();
                                        if (iM46005 != 0) {
                                            if (iM46005 == 1) {
                                                f2 = 0.5f;
                                            } else if (iM46005 != 2) {
                                                f2 = -3.4028235E38f;
                                            } else {
                                                f2 = 0.95f;
                                            }
                                        }
                                        c20369.m45998(f2, 0);
                                    }
                                    c0612M45996 = c20369.m45996();
                                    iM14421 = m14420(jM14422, arrayList2, arrayList);
                                    while (iM14420 < iM14421) {
                                        ((List) arrayList.get(iM14420)).add(c0612M45996);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetM7511;
                    j = j2;
                    c2460 = c2461;
                } else {
                    charset = charsetM7511;
                    j = j2;
                    c2460 = c2461;
                }
                c5230 = this;
                c2407M7333 = c2407M7333;
                c2461 = c2460;
                charsetM7511 = charset;
                j2 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14422(C2460 c2460, Charset charset) {
        while (true) {
            String strM7523 = c2460.m7523(charset);
            if (strM7523 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strM7523)) {
                while (true) {
                    String strM7524 = c2460.m7523(charset);
                    if (strM7524 == null || (c2460.m7503() != 0 && c2460.m7504(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strM7524.split(":");
                    if (strArrSplit.length == 2) {
                        String strM46672 = C20733.m46672(strArrSplit[0].trim());
                        strM46672.getClass();
                        if (strM46672.equals("playresx")) {
                            this.f18138 = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM46672.equals("playresy")) {
                            try {
                                this.f18136 = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if (!"[V4+ Styles]".equalsIgnoreCase(strM7523)) {
                if ("[V4 Styles]".equalsIgnoreCase(strM7523)) {
                    C0303.m1851("[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strM7523)) {
                    return;
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C22164 c22164M49175 = null;
                while (true) {
                    String strM7525 = c2460.m7523(charset);
                    if (strM7525 == null || (c2460.m7503() != 0 && c2460.m7504(charset) == 91)) {
                        break;
                    }
                    if (strM7525.startsWith("Format:")) {
                        c22164M49175 = C22164.m49175(strM7525);
                    } else if (strM7525.startsWith("Style:")) {
                        if (c22164M49175 == null) {
                            C0303.m1848("Skipping 'Style:' line before 'Format:' line: ".concat(strM7525));
                        } else {
                            C12992 c12992M32119 = C12992.m32119(strM7525, c22164M49175);
                            if (c12992M32119 != null) {
                                linkedHashMap.put(c12992M32119.f43327, c12992M32119);
                            }
                        }
                    }
                }
                this.f18141 = linkedHashMap;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m14421(String str) {
        Matcher matcher = f18135.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = C17983.f57504;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14420(long j, ArrayList arrayList, ArrayList arrayList2) {
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
