package l;

import android.os.Build;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.text.Normalizer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.pqc.crypto.newhope.Params;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۘᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4126 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f15100;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f15101;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f15102;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f15103;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8778[] f15104;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f15105;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3399 f15106;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f15107;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC13717 f15108;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23595 f15109;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f15110;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f15111;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f15112 = 1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public BitSet f15113;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f15114;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile HashMap f15115;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f15116;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f15117;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f15118;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23595 f15119;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f15120;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f15121;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m11734(int i, int i2) {
        if ((i2 & 1) != 0) {
            return i == 10;
        }
        return i == 10 || i == 13 || (i | 1) == 8233 || i == 133;
    }

    public C4126(String str, int i) {
        this.f15107 = str;
        this.f15101 = i;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0214  */
    /* JADX WARN: Code duplicated, block: B:130:0x0222  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:330:0x05f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:331:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:332:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:393:0x0706  */
    /* JADX WARN: Code duplicated, block: B:401:0x0725 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:402:0x0727  */
    /* JADX WARN: Code duplicated, block: B:484:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:487:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:489:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:494:0x08d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:495:0x08db  */
    /* JADX WARN: Code duplicated, block: B:496:0x08df  */
    /* JADX WARN: Code duplicated, block: B:498:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:501:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:503:0x0901  */
    /* JADX WARN: Code duplicated, block: B:504:0x0905  */
    /* JADX WARN: Code duplicated, block: B:506:0x0910  */
    /* JADX WARN: Code duplicated, block: B:507:0x0917  */
    /* JADX WARN: Code duplicated, block: B:509:0x0922  */
    /* JADX WARN: Code duplicated, block: B:511:0x0926  */
    /* JADX WARN: Code duplicated, block: B:513:0x0931  */
    /* JADX WARN: Code duplicated, block: B:514:0x0934  */
    /* JADX WARN: Code duplicated, block: B:516:0x093f  */
    /* JADX WARN: Code duplicated, block: B:517:0x0956  */
    /* JADX WARN: Code duplicated, block: B:519:0x095f  */
    /* JADX WARN: Code duplicated, block: B:521:0x096b  */
    /* JADX WARN: Code duplicated, block: B:522:0x0971  */
    /* JADX WARN: Code duplicated, block: B:526:0x099b  */
    /* JADX WARN: Code duplicated, block: B:527:0x099e  */
    /* JADX WARN: Code duplicated, block: B:536:0x09be  */
    /* JADX WARN: Code duplicated, block: B:537:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:566:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x09a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0314 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4853 m11718(int i, String str) {
        C4126 c4126;
        EnumC1304 enumC1304;
        C8778 c8778;
        C23595 c9484;
        C23595 c23595;
        int iM11731;
        C23595 c23595M11723;
        C3837 c3837;
        int i2;
        EnumC4584 enumC4584;
        int i3;
        C17244 c15834;
        EnumC4584 enumC4585;
        C2030 c2030;
        C14732 c14732;
        C13300 c13300;
        boolean z;
        C23595 c23595M11738;
        C23595 c23595M11724;
        boolean z2;
        C23595 c23596;
        C4126 c4127;
        StringBuilder sb;
        int i4;
        BitSet bitSet;
        StringBuilder sb2;
        int iM8273;
        int i5;
        int iM8274;
        int i6;
        char c;
        int i7;
        int i8;
        C4126 c4128;
        C4126 c4129 = new C4126(str, i);
        int i9 = 0;
        if (str.isEmpty()) {
            C20772 c20772 = C22141.f71667;
            c4129.f15109 = new C19402(c20772);
            c4129.f15119 = c20772;
            c4129.f15106 = C22141.m49100(c20772);
            c4128 = c4129;
        } else {
            c4129.f15111 = false;
            c4129.f15120 = false;
            c4129.f15113 = null;
            c4129.f15106 = null;
            c4129.f15116 = str;
            c4129.m11743();
            char c2 = '-';
            char c3 = '\\';
            if (c4129.m11741(128) && !c4129.m11741(16)) {
                c4126 = c4129;
                c4126 = c4129;
                int[] iArr = new int[c4129.f15118.length];
                int iCharCount = 0;
                int i10 = 0;
                while (iCharCount < c4129.f15107.length()) {
                    iArr[i10] = iCharCount;
                    iCharCount += Character.charCount(c4129.f15107.codePointAt(iCharCount));
                    i10++;
                }
                int length = c4129.f15107.length();
                iArr[i10 + 1] = length;
                iArr[i10] = length;
                int[] iArrM11728 = c4129.m11728(iArr);
                String str2 = new String(c4129.f15118, 0, c4129.f15117);
                int[] iArr2 = new int[str2.length()];
                int i11 = 0;
                while (i11 < c4129.f15117) {
                    int iCharCount2 = Character.charCount(c4129.f15118[i11]) + i9;
                    Arrays.fill(iArr2, i9, iCharCount2, iArrM11728[i11]);
                    i11++;
                    i9 = iCharCount2;
                }
                String str3 = c4129.f15107;
                int i12 = c4129.f15101;
                int length2 = str2.length();
                StringBuilder sb3 = new StringBuilder(str3.length());
                C11889 c11889 = new C11889(sb3, str3);
                BitSet bitSet2 = c11889.f39885;
                C2715 c2715 = new C2715(str2, i12);
                ArrayDeque arrayDeque = new ArrayDeque();
                int iM8275 = 0;
                boolean z3 = false;
                int i13 = 0;
                int i14 = 0;
                C4126 c41210 = c4129;
                loop2: while (true) {
                    boolean z4 = false;
                    C4126 c41211 = c41210;
                    while (true) {
                        boolean z5 = false;
                        C4126 c41212 = c41211;
                        while (true) {
                            c4127 = c41212;
                            if (iM8275 >= length2) {
                                break loop2;
                            }
                            int iM8276 = c2715.m8273(iM8275);
                            if (iM8276 != iM8275) {
                                if (iM8276 == length2) {
                                    break loop2;
                                }
                                z5 = false;
                                iM8275 = iM8276;
                            }
                            char cCharAt = str2.charAt(iM8275);
                            if (cCharAt == c3) {
                                c = c3;
                                i7 = iM8275 + 1;
                                if (i7 < length2) {
                                    break;
                                }
                            }
                            if (i14 > 0 && cCharAt == c2 && z4 && (i6 = iM8275 + 1) < length2) {
                                sb = sb3;
                                if (str2.charAt(i6) != '[' && str2.charAt(i6) != ']') {
                                    int iM8277 = c2715.m8273(i6);
                                    if (iM8277 < length2) {
                                        iM8277 = str2.charAt(iM8277) == '\\' ? c2715.m8274(iM8277, bitSet2, iArr2) : iM8277 + Character.charCount(str2.codePointAt(iM8277));
                                    }
                                    iM8275 = iM8277;
                                    c2 = '-';
                                    c3 = '\\';
                                    z3 = false;
                                    break;
                                }
                            } else {
                                sb = sb3;
                            }
                            if (i14 > 0 && cCharAt == '&' && (iM8274 = c2715.m8273(iM8275 + 1)) < length2 && str2.charAt(iM8274) == '&') {
                                iM8275 = iM8274 + 1;
                                c2 = '-';
                                c3 = '\\';
                                break;
                            }
                            if (i14 == 0 && cCharAt == '(') {
                                int i15 = c2715.f10451;
                                iM8275++;
                                int iM8278 = c2715.m8273(iM8275);
                                String str4 = c2715.f10452;
                                int length3 = str4.length();
                                if (iM8278 != length3) {
                                    i4 = length2;
                                    bitSet = bitSet2;
                                    if (str4.charAt(iM8278) == '?') {
                                        int i16 = iM8278 + 1;
                                        int i17 = c2715.f10451;
                                        boolean z6 = false;
                                        while (true) {
                                            iM8273 = c2715.m8273(i16);
                                            if (iM8273 < length3) {
                                                int i18 = length3;
                                                char cCharAt2 = str4.charAt(iM8273);
                                                String str5 = str4;
                                                if (cCharAt2 != ':' && cCharAt2 != ')') {
                                                    if (cCharAt2 != '-' || z6) {
                                                        if (cCharAt2 == 'U') {
                                                            i5 = 320;
                                                        } else if (cCharAt2 == 'i') {
                                                            i5 = 2;
                                                        } else if (cCharAt2 == 'm') {
                                                            i5 = 8;
                                                        } else if (cCharAt2 == 's') {
                                                            i5 = 32;
                                                        } else if (cCharAt2 == 'u') {
                                                            i5 = 64;
                                                        } else if (cCharAt2 == 'x') {
                                                            i5 = 4;
                                                        } else if (cCharAt2 != 'c') {
                                                            i5 = cCharAt2 != 'd' ? 0 : 1;
                                                        } else {
                                                            i5 = 128;
                                                        }
                                                        if (i5 != 0) {
                                                            int i19 = c2715.f10451;
                                                            c2715.f10451 = z6 ? (~i5) & i19 : i5 | i19;
                                                        }
                                                    } else {
                                                        z6 = true;
                                                    }
                                                    i16 = iM8273 + 1;
                                                    length3 = i18;
                                                    str4 = str5;
                                                }
                                            }
                                            c2715.f10451 = i17;
                                        }
                                    }
                                    if (iM8273 >= 0) {
                                        if (str2.charAt(iM8273) == ':') {
                                            arrayDeque.push(Integer.valueOf(i15));
                                        }
                                        sb2 = sb;
                                        iM8275 = iM8273 + 1;
                                    } else {
                                        arrayDeque.push(Integer.valueOf(i15));
                                        sb2 = sb;
                                    }
                                } else {
                                    i4 = length2;
                                    bitSet = bitSet2;
                                }
                                iM8273 = -1;
                                if (iM8273 >= 0) {
                                    if (str2.charAt(iM8273) == ':') {
                                        arrayDeque.push(Integer.valueOf(i15));
                                    }
                                    sb2 = sb;
                                    iM8275 = iM8273 + 1;
                                } else {
                                    arrayDeque.push(Integer.valueOf(i15));
                                    sb2 = sb;
                                }
                            } else {
                                i4 = length2;
                                bitSet = bitSet2;
                                if (i14 == 0 && cCharAt == ')' && !arrayDeque.isEmpty()) {
                                    c2715.f10451 = ((Integer) arrayDeque.pop()).intValue();
                                }
                                if (cCharAt == '[') {
                                    if (i14 == 0) {
                                        int i20 = iArr2[iM8275];
                                        if (i13 < i20) {
                                            c11889.m29648(i13, i20);
                                        }
                                        i13 = i20;
                                    }
                                    i14++;
                                    z3 = true;
                                    z4 = false;
                                    z5 = true;
                                    sb2 = sb;
                                } else {
                                    if (cCharAt != ']' || i14 <= 0 || z3) {
                                        sb2 = sb;
                                        if (i14 > 0) {
                                            boolean z7 = (cCharAt == '^' && z5) ? false : true;
                                            if (z7) {
                                                z3 = false;
                                            }
                                            z4 = z7;
                                        }
                                    } else {
                                        i14--;
                                        if (i14 == 0) {
                                            int i21 = iArr2[iM8275] + 1;
                                            sb2 = sb;
                                            sb2.append(Normalizer.normalize(str3.substring(i13, i21), Normalizer.Form.NFC));
                                            i13 = i21;
                                        } else {
                                            sb2 = sb;
                                        }
                                        z3 = false;
                                        z4 = false;
                                    }
                                    z5 = false;
                                }
                                iM8275++;
                            }
                            c2 = '-';
                            length2 = i4;
                            sb3 = sb2;
                            c41212 = c4127;
                            bitSet2 = bitSet;
                            c3 = '\\';
                        }
                        char cCharAt3 = str2.charAt(i7);
                        z4 = "dDsSwWhHVpP".indexOf(cCharAt3) < 0 && (cCharAt3 != 'v' || ((i8 = iM8275 + 2) < length2 && str2.charAt(i8) == c2));
                        iM8275 = c2715.m8274(iM8275, bitSet2, iArr2);
                        z3 = false;
                        c3 = c;
                        c41211 = c4127;
                    }
                    sb3 = sb;
                    c41210 = c4127;
                }
                StringBuilder sb4 = sb3;
                if (i13 < str3.length()) {
                    c11889.m29648(i13, str3.length());
                }
                C4126 c41213 = c4127;
                c41213.f15116 = sb4.toString();
                c41213.m11743();
                c4126 = c41213;
            }
            c4126 = c4129;
            c4126 = c4129;
            c4126 = c4129;
            if (!c4126.m11741(16)) {
                c4126.m11728((int[]) null);
            }
            c4126.f15103 = new int[32];
            c4126.f15104 = new C8778[10];
            c4126.f15115 = null;
            c4126.f15114 = new ArrayList(10);
            if (c4126.m11741(16)) {
                C21518 c21518M11722 = c4126.m11722(c4126.f15117, c4126.f15102, c4126.f15118);
                c4126.f15119 = c21518M11722;
                c21518M11722.f76439 = C22141.f71667;
            } else {
                C20772 c20773 = C22141.f71667;
                ArrayDeque arrayDeque2 = new ArrayDeque();
                arrayDeque2.push(new C13300(c20773, null));
                while (true) {
                    C13300 c13301 = (C13300) arrayDeque2.peek();
                    C23595 c23597 = c13301.f44163;
                    C23595 c23598 = c13301.f44168;
                    while (true) {
                        int iM11729 = c4126.m11729();
                        if (iM11729 != 0) {
                            if (iM11729 == 36) {
                                c4126.m11711();
                                c23595M11738 = c4126.m11741(1) ? new C4501(c4126.m11741(8)) : new C6660(c4126.m11741(8));
                            } else {
                                if (iM11729 != 46) {
                                    if (iM11729 != 63) {
                                        if (iM11729 != 124) {
                                            if (iM11729 != 125) {
                                                switch (iM11729) {
                                                    case 40:
                                                    case 41:
                                                        break;
                                                    case 42:
                                                    case 43:
                                                        break;
                                                    default:
                                                        switch (iM11729) {
                                                            case 91:
                                                                c23595M11738 = (!c4126.m11741(128) || c4126.m11741(16)) ? c4126.m11717(c4126.m11732()) : new C5955(c4126.m11732());
                                                                break;
                                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                                int[] iArr3 = c4126.f15118;
                                                                int i22 = c4126.f15110 + 1;
                                                                c4126.f15110 = i22;
                                                                int i23 = iArr3[i22];
                                                                if (i23 == 112 || i23 == 80) {
                                                                    boolean z8 = i23 == 80;
                                                                    if (c4126.m11711() != 123) {
                                                                        c4126.m11730();
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    c23595M11738 = (!c4126.m11741(128) || c4126.m11741(16)) ? c4126.m11717(c4126.m11720(z2, z8)) : new C5955(c4126.m11720(z2, z8));
                                                                } else {
                                                                    c4126.m11730();
                                                                    c23595M11738 = c4126.m11738();
                                                                }
                                                                break;
                                                            case 93:
                                                                c23595M11738 = c4126.m11738();
                                                                break;
                                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                                c4126.m11711();
                                                                if (!c4126.m11741(8)) {
                                                                    c23595M11738 = new C9088();
                                                                } else if (c4126.m11741(1)) {
                                                                    c23595M11738 = new C3173();
                                                                } else {
                                                                    c23595M11738 = new C3441();
                                                                }
                                                                break;
                                                            default:
                                                                c23595M11738 = c4126.m11738();
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                c23595M11738 = c4126.m11738();
                                            }
                                        }
                                    }
                                    c4126.m11711();
                                    throw c4126.m11733("Dangling meta character '" + ((char) iM11729) + "'");
                                }
                                c4126.m11711();
                                c23595M11738 = c4126.m11741(32) ? new C21787() : c4126.m11741(1) ? new C13675() : new C22889();
                            }
                            c23595M11724 = c4126.m11723(c23595M11738);
                            if (c23597 == null) {
                                c23597 = c23595M11724;
                            } else {
                                c23598.f76439 = c23595M11724;
                            }
                            c23598 = c23595M11724;
                        } else {
                            if (c4126.f15110 >= c4126.f15117) {
                            }
                            c23595M11738 = c4126.m11738();
                            c23595M11724 = c4126.m11723(c23595M11738);
                            if (c23597 == null) {
                                c23597 = c23595M11724;
                            } else {
                                c23598.f76439 = c23595M11724;
                            }
                            c23598 = c23595M11724;
                        }
                    }
                    c13301.f44163 = c23597;
                    c13301.f44168 = c23598;
                    if (c4126.m11729() == 40) {
                        C22472 c22472 = new C22472(c4126.f15101, c4126.f15114.size());
                        c4126.f15109 = null;
                        if (c4126.m11711() == 63) {
                            int iM11713 = c4126.m11713();
                            if (iM11713 != 33) {
                                if (iM11713 != 36) {
                                    if (iM11713 == 58) {
                                        c22472.f73364 = c4126.m11719(true);
                                    } else if (iM11713 != 64) {
                                        switch (iM11713) {
                                            case 60:
                                                int iM11735 = c4126.m11735();
                                                if (iM11735 == 61 || iM11735 == 33) {
                                                    c22472.f73366 = iM11735 == 61 ? EnumC1304.POSITIVE_LOOKBEHIND : EnumC1304.NEGATIVE_LOOKBEHIND;
                                                    c22472.f73368 = c4126.f15110;
                                                    c22472.f73365 = c4126.f15112;
                                                    c22472.f73364 = c4126.m11719(true);
                                                } else {
                                                    String strM11716 = c4126.m11716(iM11735);
                                                    if (((HashMap) c4126.m11745()).containsKey(strM11716)) {
                                                        throw c4126.m11733(C16523.m38890("Named capturing group <", strM11716, "> is already defined"));
                                                    }
                                                    c22472.f73363 = true;
                                                    c22472.f73364 = c4126.m11719(false);
                                                    ((HashMap) c4126.m11745()).put(strM11716, Integer.valueOf(c4126.f15112 - 1));
                                                }
                                                break;
                                            case 61:
                                                if (iM11713 == 61) {
                                                    enumC1304 = EnumC1304.POSITIVE_LOOKAHEAD;
                                                } else {
                                                    enumC1304 = EnumC1304.NEGATIVE_LOOKAHEAD;
                                                }
                                                c22472.f73366 = enumC1304;
                                                c22472.f73364 = c4126.m11719(true);
                                                break;
                                            case 62:
                                                c22472.f73366 = EnumC1304.INDEPENDENT;
                                                c22472.f73364 = c4126.m11719(true);
                                                break;
                                            default:
                                                c4126.m11730();
                                                int iM117210 = c4126.m11729();
                                                while (true) {
                                                    if (iM117210 != 45) {
                                                        if (iM117210 == 85) {
                                                            c4126.f15101 |= 320;
                                                        } else if (iM117210 == 105) {
                                                            c4126.f15101 |= 2;
                                                        } else if (iM117210 == 109) {
                                                            c4126.f15101 |= 8;
                                                        } else if (iM117210 == 115) {
                                                            c4126.f15101 |= 32;
                                                        } else if (iM117210 == 117) {
                                                            c4126.f15101 |= 64;
                                                        } else if (iM117210 == 120) {
                                                            c4126.f15101 |= 4;
                                                        } else if (iM117210 == 99) {
                                                            c4126.f15101 |= 128;
                                                        } else if (iM117210 == 100) {
                                                            c4126.f15101 |= 1;
                                                        }
                                                        iM117210 = c4126.m11711();
                                                    } else {
                                                        c4126.m11711();
                                                        int iM117211 = c4126.m11729();
                                                        while (true) {
                                                            if (iM117211 == 85) {
                                                                c4126.f15101 &= -321;
                                                            } else if (iM117211 == 105) {
                                                                c4126.f15101 &= -3;
                                                            } else if (iM117211 == 109) {
                                                                c4126.f15101 &= -9;
                                                            } else if (iM117211 == 115) {
                                                                c4126.f15101 &= -33;
                                                            } else if (iM117211 == 117) {
                                                                c4126.f15101 &= -65;
                                                            } else if (iM117211 == 120) {
                                                                c4126.f15101 &= -5;
                                                            } else if (iM117211 == 99) {
                                                                c4126.f15101 &= -129;
                                                            } else if (iM117211 == 100) {
                                                                c4126.f15101 &= -2;
                                                            }
                                                            iM117211 = c4126.m11711();
                                                        }
                                                    }
                                                }
                                                int iM11736 = c4126.m11735();
                                                if (iM11736 != 41) {
                                                    if (iM11736 != 58) {
                                                        throw c4126.m11733("Unknown inline modifier");
                                                    }
                                                    c22472.f73364 = c4126.m11719(true);
                                                } else {
                                                    c22472 = null;
                                                }
                                                break;
                                        }
                                    }
                                }
                                throw c4126.m11733("Unknown group type");
                            }
                            if (iM11713 == 61) {
                                enumC1304 = EnumC1304.POSITIVE_LOOKAHEAD;
                            } else {
                                enumC1304 = EnumC1304.NEGATIVE_LOOKAHEAD;
                            }
                            c22472.f73366 = enumC1304;
                            c22472.f73364 = c4126.m11719(true);
                            if (c22472 != null) {
                                arrayDeque2.push(new C13300(c22472.f73361, c22472));
                            }
                        } else {
                            c22472.f73363 = true;
                            c22472.f73364 = c4126.m11719(false);
                        }
                        c22472.f73361 = c4126.f15109;
                        if (c22472 != null) {
                            arrayDeque2.push(new C13300(c22472.f73361, c22472));
                        }
                    } else {
                        C23595 c23599 = c13301.f44163;
                        C23595 c235910 = c13301.f44167;
                        if (c23599 == null) {
                            c23599 = c235910;
                        } else {
                            C23595 c235911 = c13301.f44168;
                            c235911.f76439 = c235910;
                            c4126.f15109 = c235911;
                        }
                        C23595 c235912 = c4126.f15109;
                        if (c13301.f44164 == null) {
                            c13301.f44164 = c23599;
                            c13301.f44166 = c235912;
                        } else {
                            if (c13301.f44169 == null) {
                                C2030 c2031 = new C2030();
                                c13301.f44169 = c2031;
                                c2031.f76439 = c235910;
                            }
                            if (c23599 == c235910) {
                                c23599 = null;
                            } else {
                                c235912.f76439 = c13301.f44169;
                            }
                            C23595 c235913 = c13301.f44164;
                            C14732 c14733 = c13301.f44165;
                            if (c235913 == c14733) {
                                int i24 = c14733.f48160;
                                C23595[] c23595Arr = c14733.f48161;
                                if (i24 >= c23595Arr.length) {
                                    C23595[] c23595Arr2 = new C23595[c23595Arr.length * 2];
                                    System.arraycopy(c23595Arr, 0, c23595Arr2, 0, c23595Arr.length);
                                    c14733.f48161 = c23595Arr2;
                                }
                                C23595[] c23595Arr3 = c14733.f48161;
                                int i25 = c14733.f48160;
                                c14733.f48160 = i25 + 1;
                                c23595Arr3[i25] = c23599;
                            } else {
                                if (c235913 == c235910) {
                                    c13301.f44164 = null;
                                } else {
                                    c13301.f44166.f76439 = c13301.f44169;
                                }
                                C14732 c14734 = new C14732(c13301.f44164, c23599, c13301.f44169);
                                c13301.f44165 = c14734;
                                c13301.f44164 = c14734;
                            }
                        }
                        c13301.f44168 = null;
                        c13301.f44163 = null;
                        if (c4126.m11729() == 124) {
                            c4126.m11711();
                        } else {
                            arrayDeque2.pop();
                            C14732 c14735 = c13301.f44165;
                            if (c14735 != null) {
                                c14735.m35295();
                            }
                            C22472 c22473 = c13301.f44170;
                            if (c22473 == null) {
                                c4126.f15119 = c13301.f44164;
                                if (c4126.f15117 != c4126.f15110) {
                                    if (c4126.m11729() == 41) {
                                        throw c4126.m11733("Unmatched closing ')'");
                                    }
                                    int i26 = c4126.f15110;
                                    int i27 = c4126.f15117;
                                    if (i26 == i27 + 1 && c4126.f15118[i27 - 1] == 92) {
                                        throw c4126.m11733("Unescaped trailing backslash");
                                    }
                                    throw c4126.m11733("Unexpected internal error");
                                }
                            } else {
                                C23595 c235914 = c13301.f44164;
                                C8778 c8779 = c22473.f73364;
                                C23595 c7676 = c22473.f73361;
                                int i28 = c22473.f73367;
                                boolean z9 = c22473.f73363;
                                c8779.f76439 = c235914;
                                if (c22473.f73366 == EnumC1304.NORMAL && z9) {
                                    c8778 = c8779;
                                    if (c235914 instanceof C0619) {
                                        C17553 c17553 = new C17553(c8779.f30197);
                                        c17553.f76439 = c8779.f76439;
                                        c17553.f30195 = c8779.f30195;
                                        c22473.f73364 = c17553;
                                        int i29 = ((C10189) c7676).f34815 / 2;
                                        C8778[] c8778Arr = c4126.f15104;
                                        if (i29 < c8778Arr.length) {
                                            c8778Arr[i29] = c17553;
                                        }
                                        c8778 = c17553;
                                    }
                                }
                                c8778 = c8779;
                                c8778 = c8779;
                                int iOrdinal = c22473.f73366.ordinal();
                                if (iOrdinal == 1) {
                                    c9484 = new C9484(c8778);
                                } else if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        c9484 = new C13758(c8778, EnumC4584.INDEPENDENT);
                                    } else if (iOrdinal == 4 || iOrdinal == 5) {
                                        c23595 = c8778;
                                        if (c22473.f73365 < c4126.f15112) {
                                            if (c4126.f15113 == null) {
                                                c4126.f15113 = new BitSet();
                                            }
                                            c4126.f15113.set(c22473.f73365, c4126.f15112);
                                        }
                                        c7676.f76439 = C0310.f1660;
                                        C17285 c17285 = new C17285();
                                        c8778.m52022(c17285);
                                        if (!c17285.f55043) {
                                            throw c4126.m11733("Look-behind group does not have an obvious maximum length");
                                        }
                                        int i30 = c22473.f73368;
                                        int i31 = c4126.f15117;
                                        while (true) {
                                            if (i30 >= i31) {
                                                z = false;
                                            } else if (C22141.m49109(c4126.f15118[i30])) {
                                                z = true;
                                            } else {
                                                i30++;
                                            }
                                        }
                                        c7676 = c22473.f73366 == EnumC1304.POSITIVE_LOOKBEHIND ? z ? new C7676(c17285.f55044, c17285.f55041, c8778) : new C10499(c17285.f55044, c17285.f55041, c8778) : z ? new C1721(c17285.f55044, c17285.f55041, c8778) : new C14423(c17285.f55044, c17285.f55041, c8778);
                                        if (i28 < c4126.f15114.size()) {
                                            ArrayList arrayList = c4126.f15114;
                                            arrayList.subList(i28, arrayList.size()).clear();
                                        }
                                        c23595 = c7676;
                                    }
                                    c23595 = c8778;
                                    int[] iArr4 = c4126.f15118;
                                    int i32 = c4126.f15110;
                                    c4126.f15110 = i32 + 1;
                                    iM11731 = iArr4[i32];
                                    if (c4126.m11741(4)) {
                                        iM11731 = c4126.m11731(iM11731);
                                    }
                                    if (41 == iM11731) {
                                        throw c4126.m11733("Unclosed group");
                                    }
                                    c4126.f15101 = c22473.f73362;
                                    c23595M11723 = c4126.m11723(c23595);
                                    if (c23595M11723 == c23595) {
                                        if (c22473.f73366 == EnumC1304.NORMAL && !z9) {
                                            ((C8778) c23595).f30196 = false;
                                            ((C10189) c7676).f34813 = false;
                                        }
                                        c4126.f15109 = c7676;
                                    } else if (c23595 == c7676) {
                                        c4126.f15109 = c23595M11723;
                                    } else {
                                        if (i28 < c4126.f15114.size()) {
                                            ArrayList arrayList2 = c4126.f15114;
                                            arrayList2.subList(i28, arrayList2.size()).clear();
                                        }
                                        if (c23595M11723 instanceof C13758) {
                                            enumC4585 = ((C13758) c23595M11723).f45370;
                                            if (enumC4585 == EnumC4584.POSSESSIVE) {
                                                c4126.f15109 = c23595M11723;
                                            } else {
                                                c2030 = new C2030();
                                                c7676.f76439 = c2030;
                                                if (enumC4585 == EnumC4584.GREEDY) {
                                                    c14732 = new C14732(c23595, null, c2030);
                                                } else {
                                                    c14732 = new C14732(null, c23595, c2030);
                                                }
                                                c4126.f15109 = c2030;
                                                c23595M11723 = c14732;
                                            }
                                        } else {
                                            if (c23595M11723 instanceof C3837) {
                                                throw c4126.m11733("Internal logic error");
                                            }
                                            c3837 = (C3837) c23595M11723;
                                            i2 = c3837.f14307;
                                            enumC4584 = c3837.f14306;
                                            if (enumC4584 == EnumC4584.POSSESSIVE) {
                                                c4126.f15109 = c23595M11723;
                                            } else if (c23595.m52022(new C17285())) {
                                                C10189 c10189 = (C10189) c7676;
                                                c23595M11723 = new C19361(c23595.f76439, c3837.f14305, c3837.f14307, c3837.f14306, c10189.f34814, c10189.f34815, z9);
                                                c4126.f15109 = c23595M11723;
                                            } else {
                                                i3 = ((C8778) c23595).f30197;
                                                if (enumC4584 == EnumC4584.GREEDY) {
                                                    c15834 = new C17244(c4126.f15105, i3);
                                                    if (i2 == Integer.MAX_VALUE) {
                                                        c4126.f15114.add(c15834);
                                                    }
                                                } else {
                                                    c15834 = new C15834(c4126.f15105, i3);
                                                }
                                                c23595M11723 = new C3132(c15834);
                                                c4126.f15105++;
                                                c15834.f54942 = c3837.f14305;
                                                c15834.f54941 = i2;
                                                c15834.f54943 = c23595;
                                                c7676.f76439 = c15834;
                                                c4126.f15109 = c15834;
                                            }
                                        }
                                    }
                                    c13300 = (C13300) arrayDeque2.peek();
                                    C23595 c235915 = c4126.f15109;
                                    if (c13300.f44163 == null) {
                                        c13300.f44163 = c23595M11723;
                                    } else {
                                        c13300.f44168.f76439 = c23595M11723;
                                    }
                                    c13300.f44168 = c235915;
                                } else {
                                    c9484 = new C10895(c8778);
                                }
                                c7676 = c9484;
                                c23595 = c7676;
                                c23595 = c8778;
                                int[] iArr5 = c4126.f15118;
                                int i33 = c4126.f15110;
                                c4126.f15110 = i33 + 1;
                                iM11731 = iArr5[i33];
                                if (c4126.m11741(4)) {
                                    iM11731 = c4126.m11731(iM11731);
                                }
                                if (41 == iM11731) {
                                    throw c4126.m11733("Unclosed group");
                                }
                                c4126.f15101 = c22473.f73362;
                                c23595M11723 = c4126.m11723(c23595);
                                if (c23595M11723 == c23595) {
                                    if (c22473.f73366 == EnumC1304.NORMAL) {
                                        ((C8778) c23595).f30196 = false;
                                        ((C10189) c7676).f34813 = false;
                                    }
                                    c4126.f15109 = c7676;
                                } else if (c23595 == c7676) {
                                    c4126.f15109 = c23595M11723;
                                } else {
                                    if (i28 < c4126.f15114.size()) {
                                        ArrayList arrayList3 = c4126.f15114;
                                        arrayList3.subList(i28, arrayList3.size()).clear();
                                    }
                                    if (c23595M11723 instanceof C13758) {
                                        enumC4585 = ((C13758) c23595M11723).f45370;
                                        if (enumC4585 == EnumC4584.POSSESSIVE) {
                                            c4126.f15109 = c23595M11723;
                                        } else {
                                            c2030 = new C2030();
                                            c7676.f76439 = c2030;
                                            if (enumC4585 == EnumC4584.GREEDY) {
                                                c14732 = new C14732(c23595, null, c2030);
                                            } else {
                                                c14732 = new C14732(null, c23595, c2030);
                                            }
                                            c4126.f15109 = c2030;
                                            c23595M11723 = c14732;
                                        }
                                    } else {
                                        if (c23595M11723 instanceof C3837) {
                                            throw c4126.m11733("Internal logic error");
                                        }
                                        c3837 = (C3837) c23595M11723;
                                        i2 = c3837.f14307;
                                        enumC4584 = c3837.f14306;
                                        if (enumC4584 == EnumC4584.POSSESSIVE) {
                                            c4126.f15109 = c23595M11723;
                                        } else if (c23595.m52022(new C17285())) {
                                            C10189 c101810 = (C10189) c7676;
                                            c23595M11723 = new C19361(c23595.f76439, c3837.f14305, c3837.f14307, c3837.f14306, c101810.f34814, c101810.f34815, z9);
                                            c4126.f15109 = c23595M11723;
                                        } else {
                                            i3 = ((C8778) c23595).f30197;
                                            if (enumC4584 == EnumC4584.GREEDY) {
                                                c15834 = new C17244(c4126.f15105, i3);
                                                if (i2 == Integer.MAX_VALUE) {
                                                    c4126.f15114.add(c15834);
                                                }
                                            } else {
                                                c15834 = new C15834(c4126.f15105, i3);
                                            }
                                            c23595M11723 = new C3132(c15834);
                                            c4126.f15105++;
                                            c15834.f54942 = c3837.f14305;
                                            c15834.f54941 = i2;
                                            c15834.f54943 = c23595;
                                            c7676.f76439 = c15834;
                                            c4126.f15109 = c15834;
                                        }
                                    }
                                }
                                c13300 = (C13300) arrayDeque2.peek();
                                C23595 c235916 = c4126.f15109;
                                if (c13300.f44163 == null) {
                                    c13300.f44163 = c23595M11723;
                                } else {
                                    c13300.f44168.f76439 = c23595M11723;
                                }
                                c13300.f44168 = c235916;
                            }
                        }
                    }
                }
            }
            boolean z10 = (c4126.f15101 & 512) != 0;
            if (z10) {
                c23596 = c4126.f15119;
                if (c23596 instanceof C9088) {
                    if (z10) {
                        c4126.f15119 = new C2384(c23596);
                    }
                    c4126.f15109 = c4126.f15119;
                } else {
                    if (z10) {
                        c4126.f15119 = new C2384(c23596);
                    }
                    c4126.f15109 = c4126.f15119;
                }
            } else {
                C23595 c235917 = c4126.f15119;
                if (c235917 instanceof C6701) {
                    C23595 c23595M17333 = C6264.m17333(c235917);
                    c4126.f15109 = c23595M17333;
                    C23595 c235918 = c4126.f15119;
                    if (c23595M17333 == c235918) {
                        c4126.f15109 = m11721(c235918, c4126.f15102);
                    }
                } else {
                    c23596 = c4126.f15119;
                    if ((c23596 instanceof C9088) || (c23596 instanceof C17949)) {
                        if (z10) {
                            c4126.f15119 = new C2384(c23596);
                        }
                        c4126.f15109 = c4126.f15119;
                    } else {
                        if (z10) {
                            c4126.f15119 = new C2384(c23596);
                        }
                        c4126.f15109 = m11721(c4126.f15119, c4126.f15102);
                    }
                }
            }
            c4126.f15106 = (c4126.f15111 || c4126.f15120) ? C3399.f12541 : C22141.m49100(c4126.f15119);
            c4126.f15119 = C12306.m30565(c4126.f15119);
            if (!c4126.f15100) {
                for (C23595 c235919 : c4126.f15114) {
                    if (c235919 instanceof C17244) {
                        int i34 = c4126.f15121;
                        c4126.f15121 = i34 + 1;
                        ((C17244) c235919).f54940 = i34;
                    }
                }
            }
            c4126.f15118 = null;
            c4126.f15103 = null;
            c4126.f15104 = null;
            c4126.f15117 = 0;
            c4126.f15114 = null;
            c4128 = c4126;
        }
        return new C4853(c4128.f15109, c4128.f15119, c4128.f15101, c4128.f15112, c4128.f15105, c4128.f15121, c4128.f15106, c4128.f15111 || c4128.f15120, c4128.f15113, c4128.m11745(), new C7497(1));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m11712(int i) {
        while (true) {
            if (!C20025.m45352(i, 2048) && i != 35) {
                return i;
            }
            while (C20025.m45352(i, 2048)) {
                int[] iArr = this.f15118;
                int i2 = this.f15110 + 1;
                this.f15110 = i2;
                i = iArr[i2];
            }
            if (i == 35) {
                int[] iArr2 = this.f15118;
                int i3 = this.f15110 + 1;
                this.f15110 = i3;
                i = iArr2[i3];
                while (i != 0 && !m11734(i, this.f15101)) {
                    int[] iArr3 = this.f15118;
                    int i4 = this.f15110 + 1;
                    this.f15110 = i4;
                    i = iArr3[i4];
                }
                if (i == 0) {
                    int i5 = this.f15110;
                    int i6 = this.f15117;
                    if (i5 > i6) {
                        this.f15110 = i6;
                        i = this.f15118[i6];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m11731(int i) {
        while (true) {
            if (!C20025.m45352(i, 2048) && i != 35) {
                return i;
            }
            while (C20025.m45352(i, 2048)) {
                int[] iArr = this.f15118;
                int i2 = this.f15110;
                this.f15110 = i2 + 1;
                i = iArr[i2];
            }
            if (i == 35) {
                int[] iArr2 = this.f15118;
                int i3 = this.f15110;
                this.f15110 = i3 + 1;
                i = iArr2[i3];
                while (i != 0 && !m11734(i, this.f15101)) {
                    int[] iArr3 = this.f15118;
                    int i4 = this.f15110;
                    this.f15110 = i4 + 1;
                    i = iArr3[i4];
                }
                if (i == 0) {
                    int i5 = this.f15110;
                    int i6 = this.f15117;
                    if (i5 > i6) {
                        int[] iArr4 = this.f15118;
                        this.f15110 = i6 + 1;
                        i = iArr4[i6];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11725(int i, int i2, String str, StringBuilder sb) {
        m11726(str, i, i2, sb, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11726(String str, int i, int i2, final StringBuilder sb, final boolean z) {
        int i3 = i;
        while (i3 < i2 && C20025.m45351(str.charAt(i3))) {
            i3++;
        }
        if (i3 == i2) {
            if (z) {
                sb.append(C14690.m35220(str.substring(i, i2)));
                return;
            } else {
                sb.append((CharSequence) str, i, i2);
                return;
            }
        }
        int i4 = -1;
        int i5 = i3 - 1;
        if (i5 >= i) {
            if (z) {
                sb.append(C14690.m35220(str.substring(i, i5)));
            } else {
                sb.append((CharSequence) str, i, i5);
            }
            i = i5;
        }
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (z || ".$|()[]{}^?*+\\".indexOf(iCodePointAt) == i4) {
                int iM30479 = C12264.m30479(str, i, i2, null);
                String strSubstring = str.substring(i, iM30479);
                String strNormalize = Normalizer.normalize(strSubstring, Normalizer.Form.NFD);
                if (strNormalize.codePointCount(0, strNormalize.length()) <= 1 || C4312.m12113(strNormalize.codePointAt(Character.charCount(strNormalize.codePointAt(0)))) != 6) {
                    String strNormalize2 = Normalizer.normalize(strSubstring, Normalizer.Form.NFC);
                    if (z) {
                        strSubstring = C14690.m35220(strSubstring);
                        strNormalize = C14690.m35220(strNormalize);
                        strNormalize2 = C14690.m35220(strNormalize2);
                    }
                    if (!strSubstring.equals(strNormalize2) && !strNormalize.equals(strNormalize2)) {
                        StringBuilder sbM30515 = C12278.m30515("(?:", strSubstring, "|", strNormalize, "|");
                        sbM30515.append(strNormalize2);
                        sbM30515.append(MotionUtils.EASING_TYPE_FORMAT_END);
                        sb.append(sbM30515.toString());
                    } else if (strSubstring.equals(strNormalize)) {
                        sb.append(strSubstring);
                    } else {
                        sb.append(C0242.m1617("(?:", strSubstring, "|", strNormalize, MotionUtils.EASING_TYPE_FORMAT_END));
                    }
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(strSubstring);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C14006(strNormalize));
                    while (!arrayList.isEmpty()) {
                        C14006 c14006 = (C14006) C19084.m43861(arrayList, 1);
                        String[] strArr = c14006.f46023;
                        String str2 = c14006.f46022;
                        if (strArr == null) {
                            linkedHashSet.add(str2);
                            arrayList.remove(arrayList.size() - 1);
                        } else if (c14006.f46024 == strArr.length) {
                            C19028.m43762(arrayList, 1);
                        } else {
                            StringBuilder sbM23356 = C9023.m23356(str2);
                            String[] strArr2 = c14006.f46023;
                            int i6 = c14006.f46024;
                            c14006.f46024 = i6 + 1;
                            sbM23356.append(strArr2[i6]);
                            String string = sbM23356.toString();
                            linkedHashSet.add(string);
                            int iM11736 = m11736(2, string);
                            String strSubstring2 = string.substring(0, iM11736);
                            String strNormalize3 = Normalizer.normalize(strSubstring2, Normalizer.Form.NFC);
                            String strM37076 = strNormalize3.equals(strSubstring2) ? null : C15489.m37076(strNormalize3, string.substring(iM11736));
                            if (strM37076 != null) {
                                arrayList.add(new C14006(strM37076));
                            }
                        }
                    }
                    sb.append("(?:");
                    C0356.forEach(linkedHashSet, new Consumer() { // from class: l.ۙᩴۨ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C1455.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            String strM35220 = (String) obj;
                            if (z) {
                                strM35220 = C14690.m35220(strM35220);
                            }
                            StringBuilder sb2 = sb;
                            sb2.append(strM35220);
                            sb2.append('|');
                        }
                    });
                    sb.delete(sb.length() - 1, sb.length());
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                i4 = -1;
                i = iM30479;
            } else {
                sb.append((char) iCodePointAt);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String[] m11742(String str) {
        if (str.length() == m11736(1, str)) {
            return new String[]{str};
        }
        if (str.length() == m11736(2, str)) {
            int iCodePointAt = Character.codePointAt(str, 0);
            int iCodePointAt2 = Character.codePointAt(str, Character.charCount(iCodePointAt));
            if (C0268.m1770(iCodePointAt2) == C0268.m1770(iCodePointAt)) {
                return new String[]{str};
            }
            StringBuilder sb = new StringBuilder(2);
            sb.appendCodePoint(iCodePointAt2);
            sb.appendCodePoint(iCodePointAt);
            return new String[]{str, sb.toString()};
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i2++;
            int i3 = i + 1;
            i = (Character.isHighSurrogate(str.charAt(i)) && i3 < length && Character.isLowSurrogate(str.charAt(i3))) ? i + 2 : i3;
        }
        if (i2 > 12) {
            throw new OutOfMemoryError("Pattern too complex");
        }
        int i4 = 1;
        for (int i5 = 2; i5 <= i2; i5++) {
            i4 *= i5;
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int iCharCount = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int iCodePointAt3 = Character.codePointAt(str, iCharCount);
            iArr[i6] = iCodePointAt3;
            iArr2[i6] = C0268.m1770(iCodePointAt3);
            iCharCount += Character.charCount(iCodePointAt3);
        }
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i2];
        boolean[] zArr = new boolean[i2];
        int i7 = 0;
        int i8 = 0;
        while (i7 >= 0) {
            int i9 = iArr4[i7];
            iArr4[i7] = i9 + 1;
            if (i9 == i2) {
                iArr4[i7] = 0;
                i7--;
                if (i7 >= 0) {
                    zArr[iArr3[i7]] = false;
                }
            } else if (!zArr[i9]) {
                int i10 = 0;
                while (true) {
                    if (i10 < i9) {
                        if (!zArr[i10] && iArr2[i10] == iArr2[i9]) {
                            break;
                        }
                        i10++;
                    } else {
                        iArr3[i7] = i9;
                        if (i7 == i2 - 1) {
                            StringBuilder sb2 = new StringBuilder(str.length());
                            for (int i11 = 0; i11 < i2; i11++) {
                                sb2.appendCodePoint(iArr[iArr3[i11]]);
                            }
                            strArr[i8] = sb2.toString();
                            i8++;
                            break;
                        }
                        zArr[i9] = true;
                        i7++;
                        break;
                    }
                }
            }
        }
        String[] strArr2 = new String[i8];
        System.arraycopy(strArr, 0, strArr2, 0, i8);
        return strArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int[] m11728(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f15117;
        int i6 = 0;
        while (true) {
            i = i5 - 1;
            if (i6 >= i) {
                break;
            }
            int[] iArr2 = this.f15118;
            if (iArr2[i6] == 92) {
                if (iArr2[i6 + 1] == 81) {
                    break;
                }
                i6 += 2;
            } else {
                i6++;
            }
        }
        if (i6 >= i) {
            return iArr;
        }
        int i7 = i6 + 2;
        long j = ((long) 3) * ((long) (i5 - i7));
        long j2 = (int) j;
        try {
            if (j != j2) {
                throw new ArithmeticException();
            }
            long j3 = ((long) i7) + j2;
            int i8 = (int) j3;
            if (j3 != i8) {
                throw new ArithmeticException();
            }
            int[] iArr3 = new int[i8];
            System.arraycopy(this.f15118, 0, iArr3, 0, i6);
            int[] iArr4 = iArr == null ? null : new int[i8];
            if (iArr4 != null) {
                System.arraycopy(iArr, 0, iArr4, 0, i6);
            }
            loop1: while (true) {
                boolean z = true;
                boolean z2 = true;
                while (true) {
                    if (i7 >= i5) {
                        break loop1;
                    }
                    int i9 = i7 + 1;
                    int i10 = this.f15118[i7];
                    int i11 = -1;
                    if (!C20025.m45351(i10) || C20025.m45352(i10, 768)) {
                        i2 = i6 + 1;
                        iArr3[i6] = i10;
                    } else if (C20025.m45354(i10)) {
                        if (z) {
                            iArr3[i6] = 92;
                            iArr3[i6 + 1] = 120;
                            i4 = i6 + 3;
                            iArr3[i6 + 2] = 51;
                        } else {
                            i4 = i6;
                        }
                        i2 = i4 + 1;
                        iArr3[i4] = i10;
                    } else if (i10 != 92) {
                        if (z2) {
                            i3 = i6 + 1;
                            iArr3[i6] = 92;
                        } else {
                            i3 = i6;
                        }
                        i2 = i3 + 1;
                        iArr3[i3] = i10;
                    } else if (!z2) {
                        int[] iArr5 = this.f15118;
                        if (iArr5[i9] == 81) {
                            break;
                        }
                        i2 = i6 + 1;
                        iArr3[i6] = i10;
                        if (i9 != i5) {
                            iArr3[i2] = iArr5[i9];
                            i2 = i6 + 2;
                            i11 = i9;
                            i9 = i7 + 2;
                        }
                    } else if (this.f15118[i9] == 69) {
                        z2 = false;
                        i9 = i7 + 2;
                        i2 = i6;
                    } else {
                        iArr3[i6] = 92;
                        i2 = i6 + 2;
                        iArr3[i6 + 1] = 92;
                    }
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, i6, i2, iArr[i7]);
                        if (i11 >= 0) {
                            iArr4[i2 - 1] = iArr[i11];
                        }
                    }
                    z = false;
                    i7 = i9;
                    i6 = i2;
                }
                i7 += 2;
            }
            this.f15117 = i6;
            int i12 = i6 + 2;
            this.f15118 = Arrays.copyOf(iArr3, i12);
            if (iArr4 == null) {
                return null;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr4, i12);
            iArrCopyOf[i6] = iArr[i5];
            iArrCopyOf[i6 + 1] = iArr[i5 + 1];
            return iArrCopyOf;
        } catch (ArithmeticException unused) {
            throw new OutOfMemoryError("Required pattern length too large");
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m11743() {
        int length = this.f15116.length();
        this.f15118 = new int[length + 2];
        int iCharCount = 0;
        this.f15102 = false;
        int i = 0;
        while (iCharCount < length) {
            int iCodePointAt = this.f15116.codePointAt(iCharCount);
            if (C22141.m49109(iCodePointAt)) {
                this.f15102 = true;
            }
            this.f15118[i] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
            i++;
        }
        this.f15117 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19402 m11721(C23595 c23595, boolean z) {
        C19402 c8819;
        if (!z) {
            C10230 c10230M26021 = C10230.m26021(c23595);
            if (c10230M26021 != null) {
                return c10230M26021;
            }
            C20813 c20813M46803 = C20813.m46803(c23595);
            if (c20813M46803 != null) {
                return c20813M46803;
            }
            if (c23595 instanceof C6701) {
                c8819 = new C0351((C6701) c23595);
            } else {
                c8819 = c23595 instanceof C0619 ? new C8819((C0619) c23595) : null;
            }
            C7407 c7407M19754 = C7407.m19754(c23595);
            if (c7407M19754 != null) {
                return c7407M19754;
            }
            C15875 c15875M37748 = C15875.m37748(c23595, c8819);
            if (c15875M37748 != null) {
                return c15875M37748;
            }
            if (c8819 != null) {
                return c8819;
            }
        }
        if (z) {
            return new C20108(c23595);
        }
        return new C19402(c23595);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m11745() {
        HashMap map = this.f15115;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap(2);
        this.f15115 = map2;
        return map2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m11741(int i) {
        return (i & this.f15101) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m11729() {
        int i = this.f15118[this.f15110];
        return m11741(4) ? m11712(i) : i;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private int m11735() {
        int[] iArr = this.f15118;
        int i = this.f15110;
        this.f15110 = i + 1;
        int i2 = iArr[i];
        return m11741(4) ? m11731(i2) : i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m11711() {
        int[] iArr = this.f15118;
        int i = this.f15110 + 1;
        this.f15110 = i;
        int i2 = iArr[i];
        return m11741(4) ? m11712(i2) : i2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private int m11713() {
        int i = this.f15110;
        int i2 = this.f15118[i + 1];
        this.f15110 = i + 2;
        return i2;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m11730() {
        this.f15110--;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C17511 m11733(String str) {
        return new C17511(str, this.f15116, this.f15110 - 1);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0121  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C23595 m11738() {
        final int i;
        InterfaceC13717 interfaceC13717M49104;
        final int iM45350;
        final int i2;
        int upperCase;
        final int lowerCase;
        int iM11729 = m11729();
        boolean z = false;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            if (iM11729 != 0) {
                if (iM11729 != 36 && iM11729 != 46) {
                    if (iM11729 != 63) {
                        if (iM11729 != 94 && iM11729 != 91) {
                            if (iM11729 == 92) {
                                int[] iArr = this.f15118;
                                int i5 = this.f15110 + 1;
                                this.f15110 = i5;
                                int i6 = iArr[i5];
                                if (i6 != 112 && i6 != 80) {
                                    m11730();
                                    i3 = this.f15110;
                                    int iM11715 = m11715(false, i4 == 0, false);
                                    if (iM11715 >= 0) {
                                        m11739(iM11715, i4);
                                        i4++;
                                        if (C22141.m49109(iM11715)) {
                                            z2 = true;
                                        }
                                        iM11729 = m11729();
                                    } else {
                                        if (i4 == 0) {
                                            return this.f15109;
                                        }
                                        this.f15110 = i3;
                                    }
                                } else if (i4 > 0) {
                                    m11730();
                                } else {
                                    boolean z3 = i6 == 80;
                                    if (m11711() != 123) {
                                        m11730();
                                        z = true;
                                    }
                                    if (m11741(128) && !m11741(16)) {
                                        return new C5955(m11720(z, z3));
                                    }
                                    return m11717(m11720(z, z3));
                                }
                            } else if (iM11729 != 123) {
                                if (iM11729 != 124) {
                                    switch (iM11729) {
                                        case 40:
                                        case 41:
                                            break;
                                        case 42:
                                        case 43:
                                            break;
                                        default:
                                            i3 = this.f15110;
                                            m11739(iM11729, i4);
                                            i4++;
                                            if (C22141.m49109(iM11729)) {
                                                z2 = true;
                                            }
                                            iM11729 = m11711();
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    if (i4 > 1) {
                        this.f15110 = i3;
                        i4--;
                    }
                }
                if (i4 == 1) {
                    i = this.f15103[0];
                    if (!m11741(2)) {
                        if (m11741(64)) {
                            upperCase = Character.toUpperCase(i);
                            lowerCase = Character.toLowerCase(upperCase);
                            if (upperCase != lowerCase) {
                                C23595 c23595 = C22141.f71668;
                                interfaceC13717M49104 = new InterfaceC13717() { // from class: l.ۚ᩵ۨ
                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12682(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ܰ */
                                    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12683(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    public final C3111 negate() {
                                        C23595 c23596 = C22141.f71668;
                                        return C3111.m9336(this);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1813(int i7) {
                                        int i8 = lowerCase;
                                        return i8 == i7 || i8 == C12123.m30171(i7);
                                    }
                                };
                            } else if (C22141.m49109(i)) {
                                interfaceC13717M49104 = C22141.m49104(i);
                            } else {
                                interfaceC13717M49104 = new InterfaceC13717() { // from class: l.֨᩵ۨ
                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12682(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1813(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ܰ */
                                    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12683(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    public final C3111 negate() {
                                        C23595 c23596 = C22141.f71668;
                                        return C3111.m9336(this);
                                    }
                                };
                            }
                        } else if (C20025.m45351(i)) {
                            iM45350 = C20025.m45350(i);
                            if (((i - 97) | (122 - i)) >= 0) {
                                i2 = i - 32;
                            } else {
                                i2 = i;
                            }
                            if (iM45350 != i2) {
                                C23595 c23596 = C22141.f71668;
                                interfaceC13717M49104 = new InterfaceC20376() { // from class: l.ۜ᩵ۨ
                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                        return C16143.m38214(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ܰ */
                                    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                        return C16143.m38215(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    public final C3111 negate() {
                                        C23595 c23597 = C22141.f71668;
                                        return C3111.m9336(this);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1813(int i7) {
                                        return i7 == iM45350 || i7 == i2;
                                    }
                                };
                            } else if (C22141.m49109(i)) {
                                interfaceC13717M49104 = C22141.m49104(i);
                            } else {
                                interfaceC13717M49104 = new InterfaceC13717() { // from class: l.֨᩵ۨ
                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12682(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1813(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ܰ */
                                    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12683(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    public final C3111 negate() {
                                        C23595 c23597 = C22141.f71668;
                                        return C3111.m9336(this);
                                    }
                                };
                            }
                        } else if (C22141.m49109(i)) {
                            interfaceC13717M49104 = C22141.m49104(i);
                        } else {
                            interfaceC13717M49104 = new InterfaceC13717() { // from class: l.֨᩵ۨ
                                @Override // l.InterfaceC13717
                                /* JADX INFO: renamed from: ۙ */
                                public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                    return C4543.m12682(this, interfaceC13717);
                                }

                                @Override // l.InterfaceC13717
                                /* JADX INFO: renamed from: ۙ */
                                public final boolean mo1813(int i7) {
                                    return i7 == i;
                                }

                                @Override // l.InterfaceC13717
                                /* JADX INFO: renamed from: ܰ */
                                public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                    return C4543.m12683(this, interfaceC13717);
                                }

                                @Override // l.InterfaceC13717
                                public final C3111 negate() {
                                    C23595 c23597 = C22141.f71668;
                                    return C3111.m9336(this);
                                }
                            };
                        }
                    } else if (C22141.m49109(i)) {
                        interfaceC13717M49104 = C22141.m49104(i);
                    } else {
                        interfaceC13717M49104 = new InterfaceC13717() { // from class: l.֨᩵ۨ
                            @Override // l.InterfaceC13717
                            /* JADX INFO: renamed from: ۙ */
                            public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                return C4543.m12682(this, interfaceC13717);
                            }

                            @Override // l.InterfaceC13717
                            /* JADX INFO: renamed from: ۙ */
                            public final boolean mo1813(int i7) {
                                return i7 == i;
                            }

                            @Override // l.InterfaceC13717
                            /* JADX INFO: renamed from: ܰ */
                            public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                return C4543.m12683(this, interfaceC13717);
                            }

                            @Override // l.InterfaceC13717
                            public final C3111 negate() {
                                C23595 c23597 = C22141.f71668;
                                return C3111.m9336(this);
                            }
                        };
                    }
                    return m11717(interfaceC13717M49104);
                }
                return m11722(i4, z2, this.f15103);
            }
            if (this.f15110 >= this.f15117) {
                if (i4 == 1) {
                    i = this.f15103[0];
                    if (!m11741(2)) {
                        if (m11741(64)) {
                            upperCase = Character.toUpperCase(i);
                            lowerCase = Character.toLowerCase(upperCase);
                            if (upperCase != lowerCase) {
                                C23595 c23597 = C22141.f71668;
                                interfaceC13717M49104 = new InterfaceC13717() { // from class: l.ۚ᩵ۨ
                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12682(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ܰ */
                                    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12683(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    public final C3111 negate() {
                                        C23595 c23598 = C22141.f71668;
                                        return C3111.m9336(this);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1813(int i7) {
                                        int i8 = lowerCase;
                                        return i8 == i7 || i8 == C12123.m30171(i7);
                                    }
                                };
                            } else if (C22141.m49109(i)) {
                                interfaceC13717M49104 = C22141.m49104(i);
                            } else {
                                interfaceC13717M49104 = new InterfaceC13717() { // from class: l.֨᩵ۨ
                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12682(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1813(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ܰ */
                                    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12683(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    public final C3111 negate() {
                                        C23595 c23598 = C22141.f71668;
                                        return C3111.m9336(this);
                                    }
                                };
                            }
                        } else if (C20025.m45351(i)) {
                            iM45350 = C20025.m45350(i);
                            if (((i - 97) | (122 - i)) >= 0) {
                                i2 = i - 32;
                            } else {
                                i2 = i;
                            }
                            if (iM45350 != i2) {
                                C23595 c23598 = C22141.f71668;
                                interfaceC13717M49104 = new InterfaceC20376() { // from class: l.ۜ᩵ۨ
                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                        return C16143.m38214(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ܰ */
                                    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                        return C16143.m38215(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    public final C3111 negate() {
                                        C23595 c23599 = C22141.f71668;
                                        return C3111.m9336(this);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1813(int i7) {
                                        return i7 == iM45350 || i7 == i2;
                                    }
                                };
                            } else if (C22141.m49109(i)) {
                                interfaceC13717M49104 = C22141.m49104(i);
                            } else {
                                interfaceC13717M49104 = new InterfaceC13717() { // from class: l.֨᩵ۨ
                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12682(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1813(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC13717
                                    /* JADX INFO: renamed from: ܰ */
                                    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                        return C4543.m12683(this, interfaceC13717);
                                    }

                                    @Override // l.InterfaceC13717
                                    public final C3111 negate() {
                                        C23595 c23599 = C22141.f71668;
                                        return C3111.m9336(this);
                                    }
                                };
                            }
                        } else if (C22141.m49109(i)) {
                            interfaceC13717M49104 = C22141.m49104(i);
                        } else {
                            interfaceC13717M49104 = new InterfaceC13717() { // from class: l.֨᩵ۨ
                                @Override // l.InterfaceC13717
                                /* JADX INFO: renamed from: ۙ */
                                public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                    return C4543.m12682(this, interfaceC13717);
                                }

                                @Override // l.InterfaceC13717
                                /* JADX INFO: renamed from: ۙ */
                                public final boolean mo1813(int i7) {
                                    return i7 == i;
                                }

                                @Override // l.InterfaceC13717
                                /* JADX INFO: renamed from: ܰ */
                                public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                    return C4543.m12683(this, interfaceC13717);
                                }

                                @Override // l.InterfaceC13717
                                public final C3111 negate() {
                                    C23595 c23599 = C22141.f71668;
                                    return C3111.m9336(this);
                                }
                            };
                        }
                    } else if (C22141.m49109(i)) {
                        interfaceC13717M49104 = C22141.m49104(i);
                    } else {
                        interfaceC13717M49104 = new InterfaceC13717() { // from class: l.֨᩵ۨ
                            @Override // l.InterfaceC13717
                            /* JADX INFO: renamed from: ۙ */
                            public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                return C4543.m12682(this, interfaceC13717);
                            }

                            @Override // l.InterfaceC13717
                            /* JADX INFO: renamed from: ۙ */
                            public final boolean mo1813(int i7) {
                                return i7 == i;
                            }

                            @Override // l.InterfaceC13717
                            /* JADX INFO: renamed from: ܰ */
                            public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                return C4543.m12683(this, interfaceC13717);
                            }

                            @Override // l.InterfaceC13717
                            public final C3111 negate() {
                                C23595 c23599 = C22141.f71668;
                                return C3111.m9336(this);
                            }
                        };
                    }
                    return m11717(interfaceC13717M49104);
                }
                return m11722(i4, z2, this.f15103);
            }
            i3 = this.f15110;
            m11739(iM11729, i4);
            i4++;
            if (C22141.m49109(iM11729)) {
                z2 = true;
            }
            iM11729 = m11711();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m11739(int i, int i2) {
        int length = this.f15103.length;
        if (i2 - length >= 0) {
            int i3 = (i2 + 1) - length;
            int iMax = Math.max(i3, length) + length;
            if (iMax <= 0 || iMax > 2147483639) {
                iMax = length + i3;
                if (iMax < 0) {
                    throw new OutOfMemoryError(C8015.m21119("Required array length ", length, " + ", " is too large", i3));
                }
                if (iMax <= 2147483639) {
                    iMax = 2147483639;
                }
            }
            this.f15103 = Arrays.copyOf(this.f15103, iMax);
        }
        this.f15103[i2] = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:248:0x03aa  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m11715(boolean z, boolean z2, boolean z3) {
        InterfaceC13717 interfaceC13717M38843;
        InterfaceC13717 interfaceC13717M38849;
        InterfaceC13717 interfaceC13717M38844;
        InterfaceC13717 interfaceC13717M388410;
        int iM11713 = m11713();
        int iM45353 = 0;
        switch (iM11713) {
            case 48:
                int iM11735 = m11735();
                int i = iM11735 - 48;
                if (((55 - iM11735) | i) < 0) {
                    throw m11733("Illegal octal escape sequence");
                }
                int iM11736 = m11735();
                int i2 = iM11736 - 48;
                if (((55 - iM11736) | i2) < 0) {
                    m11730();
                    return i;
                }
                int iM11737 = m11735();
                int i3 = iM11737 - 48;
                if (((55 - iM11737) | i3) >= 0 && ((51 - iM11735) | i) >= 0) {
                    return C1694.m5620(i2, 8, i * 64, i3);
                }
                m11730();
                return (i * 8) + i2;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
            case 57:
                if (!z) {
                    if (z2) {
                        int i4 = iM11713 - 48;
                        while (iM45353 == 0) {
                            int iM11729 = m11729();
                            switch (iM11729) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case 56:
                                case 57:
                                    int i5 = (iM11729 - 48) + (i4 * 10);
                                    if (this.f15112 - 1 >= i5) {
                                        m11735();
                                        i4 = i5;
                                    } else {
                                        iM45353 = 1;
                                    }
                                    break;
                                default:
                                    iM45353 = 1;
                                    break;
                            }
                        }
                        this.f15100 = true;
                        this.f15109 = m11741(2) ? new C9793(i4, m11741(64)) : new C19671(i4);
                    }
                    return -1;
                }
                throw m11733("Illegal/unsupported escape sequence");
            default:
                switch (iM11713) {
                    case 65:
                        if (!z) {
                            if (z2) {
                                this.f15109 = new C9088();
                                return -1;
                            }
                            return -1;
                        }
                        throw m11733("Illegal/unsupported escape sequence");
                    case 66:
                        if (!z) {
                            if (z2) {
                                this.f15109 = new C23904(4, m11741(256));
                                return -1;
                            }
                            return -1;
                        }
                        throw m11733("Illegal/unsupported escape sequence");
                    case 67:
                    case 69:
                    case 70:
                    case 73:
                    case 74:
                    case 75:
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    case 77:
                    case 79:
                    case 80:
                    case 81:
                    case 84:
                    case 85:
                    case 89:
                        throw m11733("Illegal/unsupported escape sequence");
                    case 68:
                        if (z2) {
                            if (m11741(256)) {
                                int i6 = C16518.f53060;
                                interfaceC13717M38843 = new C0598();
                            } else {
                                interfaceC13717M38843 = C16518.m38843();
                            }
                            this.f15108 = interfaceC13717M38843;
                            C3111 c3111Negate = interfaceC13717M38843.negate();
                            this.f15108 = c3111Negate;
                            if (!z) {
                                this.f15109 = m11717(c3111Negate);
                                return -1;
                            }
                        }
                        return -1;
                    case 71:
                        if (!z) {
                            if (z2) {
                                this.f15111 = true;
                                this.f15109 = new C7366();
                                return -1;
                            }
                            return -1;
                        }
                        throw m11733("Illegal/unsupported escape sequence");
                    case 72:
                        if (z2) {
                            C23595 c23595 = C22141.f71668;
                            C3111 c3111Negate2 = new C4147().negate();
                            this.f15108 = c3111Negate2;
                            if (!z) {
                                this.f15109 = m11717(c3111Negate2);
                                return -1;
                            }
                        }
                        return -1;
                    case 78:
                        if (Build.VERSION.SDK_INT >= 35) {
                            if (m11735() != 123) {
                                throw m11733("Illegal character name escape sequence");
                            }
                            int i7 = this.f15110;
                            while (m11735() != 125) {
                                if (this.f15110 >= this.f15117) {
                                    throw m11733("Unclosed character name escape sequence");
                                }
                            }
                            String str = new String(this.f15118, i7, (this.f15110 - i7) - 1);
                            try {
                                return Character.codePointOf(str);
                            } catch (IllegalArgumentException unused) {
                                throw m11733(C16523.m38890("Unknown character name [", str, "]"));
                            }
                        }
                        throw m11733("Illegal/unsupported escape sequence");
                    case 82:
                        if (!z) {
                            if (z2) {
                                this.f15109 = new C20067();
                                return -1;
                            }
                            return -1;
                        }
                        throw m11733("Illegal/unsupported escape sequence");
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        if (z2) {
                            if (m11741(256)) {
                                int i8 = C16518.f53060;
                                interfaceC13717M38849 = new C22162();
                            } else {
                                interfaceC13717M38849 = C16518.m38849();
                            }
                            this.f15108 = interfaceC13717M38849;
                            C3111 c3111Negate3 = interfaceC13717M38849.negate();
                            this.f15108 = c3111Negate3;
                            if (!z) {
                                this.f15109 = m11717(c3111Negate3);
                                return -1;
                            }
                        }
                        return -1;
                    case HRSS1373Polynomial.K /* 86 */:
                        if (z2) {
                            C23595 c23596 = C22141.f71668;
                            C3111 c3111Negate4 = new C23199().negate();
                            this.f15108 = c3111Negate4;
                            if (!z) {
                                this.f15109 = m11717(c3111Negate4);
                                return -1;
                            }
                        }
                        return -1;
                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                        if (z2) {
                            InterfaceC13717 interfaceC13717M38839 = m11741(256) ? C16518.m38839() : C16518.m38847();
                            this.f15108 = interfaceC13717M38839;
                            C3111 c3111Negate5 = interfaceC13717M38839.negate();
                            this.f15108 = c3111Negate5;
                            if (!z) {
                                this.f15109 = m11717(c3111Negate5);
                                return -1;
                            }
                        }
                        return -1;
                    case 88:
                        if (!z) {
                            if (z2) {
                                this.f15109 = new C5207();
                                return -1;
                            }
                            return -1;
                        }
                        throw m11733("Illegal/unsupported escape sequence");
                    case 90:
                        if (!z) {
                            if (z2) {
                                if (m11741(1)) {
                                    this.f15109 = new C4501(false);
                                    return -1;
                                }
                                this.f15109 = new C6660(false);
                                return -1;
                            }
                            return -1;
                        }
                        throw m11733("Illegal/unsupported escape sequence");
                    default:
                        switch (iM11713) {
                            case 97:
                                return 7;
                            case 98:
                                if (!z) {
                                    if (z2) {
                                        if (m11729() == 123) {
                                            if (m11713() != 103) {
                                                m11730();
                                                m11730();
                                            } else if (m11735() == 125) {
                                                this.f15120 = true;
                                                this.f15109 = new C8072();
                                                return -1;
                                            }
                                        }
                                        this.f15109 = new C23904(3, m11741(256));
                                    }
                                    return -1;
                                }
                                throw m11733("Illegal/unsupported escape sequence");
                            case q.f /* 99 */:
                                if (this.f15110 < this.f15117) {
                                    return m11735() ^ 64;
                                }
                                throw m11733("Illegal control escape sequence");
                            case 100:
                                if (z2) {
                                    if (m11741(256)) {
                                        int i9 = C16518.f53060;
                                        interfaceC13717M38844 = new C0598();
                                    } else {
                                        interfaceC13717M38844 = C16518.m38843();
                                    }
                                    this.f15108 = interfaceC13717M38844;
                                    if (!z) {
                                        this.f15109 = m11717(interfaceC13717M38844);
                                        return -1;
                                    }
                                }
                                return -1;
                            case 101:
                                return 27;
                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                return 12;
                            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                            case 108:
                            case 109:
                            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                throw m11733("Illegal/unsupported escape sequence");
                            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                if (z2) {
                                    C23595 c23597 = C22141.f71668;
                                    C4147 c4147 = new C4147();
                                    this.f15108 = c4147;
                                    if (!z) {
                                        this.f15109 = m11717(c4147);
                                        return -1;
                                    }
                                }
                                return -1;
                            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                if (!z) {
                                    if (m11735() != 60) {
                                        throw m11733("\\k is not followed by '<' for named capturing group");
                                    }
                                    String strM11716 = m11716(m11735());
                                    Integer num = (Integer) ((HashMap) m11745()).get(strM11716);
                                    if (num == null) {
                                        throw m11733(C16523.m38890("named capturing group <", strM11716, "> does not exist"));
                                    }
                                    if (z2) {
                                        this.f15100 = true;
                                        if (m11741(2)) {
                                            this.f15109 = new C9793(num.intValue(), m11741(64));
                                            return -1;
                                        }
                                        this.f15109 = new C19671(num.intValue());
                                        return -1;
                                    }
                                    return -1;
                                }
                                throw m11733("Illegal/unsupported escape sequence");
                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                return 10;
                            case 114:
                                return 13;
                            case 115:
                                if (z2) {
                                    if (m11741(256)) {
                                        int i10 = C16518.f53060;
                                        interfaceC13717M388410 = new C22162();
                                    } else {
                                        interfaceC13717M388410 = C16518.m38849();
                                    }
                                    this.f15108 = interfaceC13717M388410;
                                    if (!z) {
                                        this.f15109 = m11717(interfaceC13717M388410);
                                        return -1;
                                    }
                                }
                                return -1;
                            case 116:
                                return 9;
                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                int iM11744 = m11744();
                                char c = (char) iM11744;
                                if (Character.isHighSurrogate(c)) {
                                    int i11 = this.f15110;
                                    if (m11735() == 92 && m11735() == 117) {
                                        char cM11744 = (char) m11744();
                                        if (Character.isLowSurrogate(cM11744)) {
                                            return Character.toCodePoint(c, cM11744);
                                        }
                                    }
                                    this.f15110 = i11;
                                }
                                return iM11744;
                            case 118:
                                if (z3) {
                                    return 11;
                                }
                                if (z2) {
                                    C23595 c23598 = C22141.f71668;
                                    C23199 c23199 = new C23199();
                                    this.f15108 = c23199;
                                    if (!z) {
                                        this.f15109 = m11717(c23199);
                                        return -1;
                                    }
                                }
                                return -1;
                            case 119:
                                if (z2) {
                                    InterfaceC13717 interfaceC13717M388310 = m11741(256) ? C16518.m38839() : C16518.m38847();
                                    this.f15108 = interfaceC13717M388310;
                                    if (!z) {
                                        this.f15109 = m11717(interfaceC13717M388310);
                                        return -1;
                                    }
                                }
                                return -1;
                            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                int iM11738 = m11735();
                                if (C20025.m45352(iM11738, 32768)) {
                                    int iM11739 = m11735();
                                    if (C20025.m45352(iM11739, 32768)) {
                                        return C20025.m45353(iM11739) + (C20025.m45353(iM11738) * 16);
                                    }
                                } else if (iM11738 == 123 && C20025.m45352(m11729(), 32768)) {
                                    do {
                                        int iM117310 = m11735();
                                        if (!C20025.m45352(iM117310, 32768)) {
                                            if (iM117310 == 125) {
                                                return iM45353;
                                            }
                                            throw m11733("Unclosed hexadecimal escape sequence");
                                        }
                                        iM45353 = C20025.m45353(iM117310) + (iM45353 << 4);
                                    } while (iM45353 <= 1114111);
                                    throw m11733("Hexadecimal codepoint is too big");
                                }
                                throw m11733("Illegal hexadecimal escape sequence");
                            case 122:
                                if (!z) {
                                    if (z2) {
                                        this.f15109 = new C21477();
                                        return -1;
                                    }
                                    return -1;
                                }
                                throw m11733("Illegal/unsupported escape sequence");
                            default:
                                return iM11713;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private InterfaceC13717 m11732() {
        int i;
        InterfaceC13717 interfaceC13717M49202;
        InterfaceC13717 interfaceC13717M49203;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m11737(true));
        while (true) {
            C5538 c5538 = (C5538) C19084.m43861(arrayList, 1);
            int i2 = c5538.f18995;
            boolean z = false;
            if (!c5538.f18992) {
                if (i2 != 0) {
                    if (i2 != 38) {
                        if (i2 == 91) {
                            arrayList.add(m11737(true));
                        } else if (i2 == 93 && (!c5538.f18991.m49208() || c5538.f18989)) {
                            if (c5538.f18993) {
                                m11711();
                            }
                            if (c5538.f18989) {
                                interfaceC13717M49202 = c5538.f18991.m49208() ? c5538.f18994 : c5538.f18994.mo1812(c5538.f18991.m49202());
                                if (c5538.f18988) {
                                    interfaceC13717M49202 = interfaceC13717M49202.negate();
                                }
                            } else {
                                c5538.f18991.m49206(c5538.f18988);
                                interfaceC13717M49202 = c5538.f18991.m49202();
                            }
                            arrayList.remove(arrayList.size() - 1);
                            if (arrayList.isEmpty()) {
                                return interfaceC13717M49202;
                            }
                            C5538 c5539 = (C5538) C19084.m43861(arrayList, 1);
                            if (c5539.f18992) {
                                InterfaceC13717 interfaceC13717 = c5539.f18990;
                                if (interfaceC13717 != null) {
                                    interfaceC13717M49202 = interfaceC13717.mo1814(interfaceC13717M49202);
                                }
                                c5539.f18990 = interfaceC13717M49202;
                            } else {
                                c5539.f18991.m49205(interfaceC13717M49202);
                            }
                            c5539.f18995 = m11729();
                        }
                    } else if (m11711() == 38) {
                        c5538.f18995 = m11711();
                        if (c5538.f18989) {
                            interfaceC13717M49203 = c5538.f18991.m49208() ? c5538.f18994 : c5538.f18994.mo1812(c5538.f18991.m49202());
                        } else {
                            interfaceC13717M49203 = c5538.f18991.m49202();
                        }
                        c5538.f18996 = interfaceC13717M49203;
                        c5538.f18990 = null;
                        c5538.f18992 = true;
                    } else {
                        m11730();
                    }
                } else if (this.f15110 >= this.f15117) {
                    throw m11733("Unclosed character class");
                }
                C22183 c22183 = c5538.f18991;
                int iM11729 = m11729();
                if (iM11729 == 92) {
                    int[] iArr = this.f15118;
                    int i3 = this.f15110;
                    int i4 = i3 + 1;
                    this.f15110 = i4;
                    int i5 = iArr[i4];
                    if (i5 == 112 || i5 == 80) {
                        boolean z2 = i5 == 80;
                        if (m11711() != 123) {
                            m11730();
                            z = true;
                        }
                        c22183.m49205(m11720(z, z2));
                    } else {
                        boolean z3 = iArr[i3 + 2] == 45;
                        m11730();
                        iM11729 = m11715(true, true, z3);
                        if (iM11729 == -1) {
                            c22183.m49205(this.f15108);
                        }
                    }
                    c5538.f18995 = m11729();
                } else {
                    m11711();
                }
                if (iM11729 < 0) {
                    throw m11733("Unexpected character '" + ((char) iM11729) + "'");
                }
                if (m11729() != 45 || (i = this.f15118[this.f15110 + 1]) == 91 || i == 93) {
                    c22183.m49203(iM11729);
                } else {
                    m11711();
                    int iM117210 = m11729();
                    if (iM117210 == 92) {
                        iM117210 = m11715(true, false, true);
                    } else {
                        m11711();
                    }
                    if (iM117210 < iM11729) {
                        throw m11733("Illegal character range");
                    }
                    c22183.m49207(iM11729, iM117210);
                }
                c5538.f18995 = m11729();
            } else if (i2 == 93 || i2 == 38) {
                InterfaceC13717 interfaceC13718 = c5538.f18990;
                if (interfaceC13718 == null) {
                    throw m11733("Bad intersection syntax");
                }
                c5538.f18994 = c5538.f18996.mo1812(interfaceC13718);
                c5538.f18989 = true;
                c5538.f18992 = false;
                c5538.f18991 = new C22183(this.f15101);
            } else {
                if (i2 != 91) {
                    m11730();
                }
                arrayList.add(m11737(i2 == 91));
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C5538 m11737(boolean z) {
        C5538 c5538 = new C5538(this.f15101, z);
        int iM11711 = m11711();
        c5538.f18995 = iM11711;
        if (iM11711 == 94 && this.f15118[this.f15110 - 1] == 91) {
            c5538.f18995 = m11711();
            c5538.f18988 = true;
        }
        return c5538;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC13717 m11720(boolean z, boolean z2) {
        String str;
        InterfaceC13717 interfaceC13717M38846;
        m11711();
        if (z) {
            int i = this.f15118[this.f15110];
            str = !Character.isSupplementaryCodePoint(i) ? String.valueOf((char) i) : new String(this.f15118, this.f15110, 1);
            m11735();
        } else {
            int i2 = this.f15110;
            this.f15118[this.f15117] = 125;
            while (m11735() != 125) {
            }
            int[] iArr = this.f15118;
            int i3 = this.f15117;
            iArr[i3] = 0;
            int i4 = this.f15110;
            if (i4 > i3) {
                throw m11733("Unclosed character family");
            }
            if (i2 + 1 >= i4) {
                throw m11733("Empty character family");
            }
            str = new String(iArr, i2, (i4 - i2) - 1);
        }
        int iIndexOf = str.indexOf(61);
        InterfaceC13717 interfaceC13717M38842 = null;
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            String lowerCase = str.substring(0, iIndexOf).toLowerCase(Locale.ENGLISH);
            lowerCase.getClass();
            switch (lowerCase) {
                case "script":
                case "sc":
                    interfaceC13717M38842 = C16518.m38841(strSubstring);
                    break;
                case "gc":
                case "general_category":
                    interfaceC13717M38842 = C16518.m38848(strSubstring, m11741(2));
                    break;
                case "blk":
                case "block":
                    int i5 = C16518.f53060;
                    try {
                        final Character.UnicodeBlock unicodeBlockForName = Character.UnicodeBlock.forName(strSubstring);
                        interfaceC13717M38842 = new InterfaceC13717() { // from class: l.᩵ᩴۨ
                            @Override // l.InterfaceC13717
                            /* JADX INFO: renamed from: ۙ */
                            public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                                return C4543.m12682(this, interfaceC13717);
                            }

                            @Override // l.InterfaceC13717
                            /* JADX INFO: renamed from: ܰ */
                            public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                                return C4543.m12683(this, interfaceC13717);
                            }

                            @Override // l.InterfaceC13717
                            /* JADX INFO: renamed from: ۙ */
                            public final boolean mo1813(int i6) {
                                return unicodeBlockForName == Character.UnicodeBlock.of(i6);
                            }

                            @Override // l.InterfaceC13717
                            public final C3111 negate() {
                                C23595 c23595 = C22141.f71668;
                                return C3111.m9336(this);
                            }
                        };
                        break;
                    } catch (IllegalArgumentException unused) {
                        break;
                    }
                    break;
            }
            if (interfaceC13717M38842 == null) {
                throw m11733(C0242.m1617("Unknown Unicode property {name=<", lowerCase, ">, value=<", strSubstring, ">}"));
            }
        } else {
            if (str.startsWith("In")) {
                String strSubstring2 = str.substring(2);
                int i6 = C16518.f53060;
                try {
                    final Character.UnicodeBlock unicodeBlockForName2 = Character.UnicodeBlock.forName(strSubstring2);
                    interfaceC13717M38846 = new InterfaceC13717() { // from class: l.᩵ᩴۨ
                        @Override // l.InterfaceC13717
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
                            return C4543.m12682(this, interfaceC13717);
                        }

                        @Override // l.InterfaceC13717
                        /* JADX INFO: renamed from: ܰ */
                        public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
                            return C4543.m12683(this, interfaceC13717);
                        }

                        @Override // l.InterfaceC13717
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo1813(int i7) {
                            return unicodeBlockForName2 == Character.UnicodeBlock.of(i7);
                        }

                        @Override // l.InterfaceC13717
                        public final C3111 negate() {
                            C23595 c23595 = C22141.f71668;
                            return C3111.m9336(this);
                        }
                    };
                } catch (IllegalArgumentException unused2) {
                }
            } else if (str.startsWith("Is")) {
                String strSubstring3 = str.substring(2);
                interfaceC13717M38846 = C16518.m38846(strSubstring3, m11741(2));
                if (interfaceC13717M38846 == null) {
                    interfaceC13717M38846 = C16518.m38848(strSubstring3, m11741(2));
                }
                interfaceC13717M38842 = interfaceC13717M38846 == null ? C16518.m38841(strSubstring3) : interfaceC13717M38846;
            } else {
                interfaceC13717M38842 = m11741(256) ? C16518.m38842(str, m11741(2)) : null;
                if (interfaceC13717M38842 == null) {
                    interfaceC13717M38842 = C16518.m38848(str, m11741(2));
                }
            }
            if (interfaceC13717M38842 == null) {
                throw m11733(C16523.m38890("Unknown character property name {", str, l.d));
            }
        }
        if (!z2) {
            return interfaceC13717M38842;
        }
        this.f15102 = true;
        return interfaceC13717M38842.negate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1015 m11717(InterfaceC13717 interfaceC13717) {
        if (interfaceC13717 == null) {
            return null;
        }
        if (interfaceC13717 instanceof InterfaceC20376) {
            return new C0619((InterfaceC20376) interfaceC13717);
        }
        this.f15102 = true;
        return new C1015(interfaceC13717);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m11716(int i) {
        StringBuilder sb = new StringBuilder();
        if (C20025.m45352(i, 768)) {
            do {
                sb.append((char) i);
                i = m11735();
            } while (C20025.m45352(i, Params.POLY_BYTES));
            if (i != 62) {
                throw m11733("named capturing group is missing trailing '>'");
            }
            return sb.toString();
        }
        throw m11733("capturing group name does not start with a Latin letter");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8778 m11719(boolean z) {
        int i;
        int i2 = this.f15105;
        this.f15105 = i2 + 1;
        if (z) {
            i = 0;
        } else {
            i = this.f15112;
            this.f15112 = i + 1;
        }
        C8778 c8778 = new C8778(i2);
        C10189 c10189 = new C10189(i2, i);
        this.f15109 = c10189;
        c8778.f30195 = c10189;
        if (!z && i < 10) {
            this.f15104[i] = c8778;
        }
        return c8778;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private EnumC4584 m11710() {
        int iM11711 = m11711();
        if (iM11711 == 63) {
            m11711();
            return EnumC4584.LAZY;
        }
        if (iM11711 == 43) {
            m11711();
            return EnumC4584.POSSESSIVE;
        }
        return EnumC4584.GREEDY;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23595 m11724(C23595 c23595, int i) {
        EnumC4584 enumC4584M11710 = m11710();
        if (enumC4584M11710 == EnumC4584.GREEDY) {
            if (c23595 instanceof C0619) {
                return new C16848((C0619) c23595, i);
            }
            if (c23595 instanceof C21787) {
                return new C18259(i);
            }
            if (c23595 instanceof C13675) {
                return new C11558(i);
            }
            if (c23595 instanceof C22889) {
                return new C15128(i);
            }
            if (c23595 instanceof C1015) {
                return new C13011((C1015) c23595, i);
            }
        }
        return new C3837(c23595, i, Integer.MAX_VALUE, enumC4584M11710);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23595 m11723(C23595 c23595) {
        int iM11729 = m11729();
        int i = 0;
        if (iM11729 == 42) {
            return m11724(c23595, 0);
        }
        if (iM11729 == 43) {
            return m11724(c23595, 1);
        }
        if (iM11729 == 63) {
            return new C13758(c23595, m11710());
        }
        if (iM11729 != 123) {
            return c23595;
        }
        int iM11713 = m11713();
        if (!C20025.m45354(iM11713)) {
            throw m11733("Illegal repetition");
        }
        int i2 = 0;
        while (true) {
            long j = 10;
            long j2 = ((long) i2) * j;
            long j3 = (int) j2;
            if (j2 != j3) {
                throw new ArithmeticException();
            }
            long j4 = j3 + ((long) (iM11713 - 48));
            int i3 = (int) j4;
            if (j4 != i3) {
                throw new ArithmeticException();
            }
            try {
                int iM11735 = m11735();
                if (!C20025.m45354(iM11735)) {
                    if (iM11735 == 44) {
                        iM11735 = m11735();
                        if (iM11735 == 125) {
                            m11730();
                            return m11724(c23595, i3);
                        }
                        while (C20025.m45354(iM11735)) {
                            long j5 = ((long) i) * j;
                            long j6 = (int) j5;
                            if (j5 != j6) {
                                throw new ArithmeticException();
                            }
                            long j7 = j6 + ((long) (iM11735 - 48));
                            i = (int) j7;
                            if (j7 != i) {
                                throw new ArithmeticException();
                            }
                            iM11735 = m11735();
                        }
                    } else {
                        i = i3;
                    }
                    if (iM11735 != 125) {
                        throw m11733("Unclosed counted closure");
                    }
                    if (i < i3) {
                        throw m11733("Illegal repetition range");
                    }
                    m11730();
                    return (i3 == 0 && i == 1) ? new C13758(c23595, m11710()) : new C3837(c23595, i3, i, m11710());
                }
                i2 = i3;
                iM11713 = iM11735;
            } catch (ArithmeticException unused) {
                throw m11733("Illegal repetition range");
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private int m11744() {
        int iM45353 = 0;
        for (int i = 0; i < 4; i++) {
            int iM11735 = m11735();
            if (!C20025.m45352(iM11735, 32768)) {
                throw m11733("Illegal Unicode escape sequence");
            }
            iM45353 = (iM45353 * 16) + C20025.m45353(iM11735);
        }
        return iM45353;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m11736(int i, String str) {
        int i2 = 0;
        if (i == 1 && str.length() > 0 && !Character.isHighSurrogate(str.charAt(0))) {
            return 1;
        }
        int length = str.length();
        if (i >= 0) {
            for (int i3 = 0; i2 < length && i3 < i; i3++) {
                int i4 = i2 + 1;
                i2 = (Character.isHighSurrogate(str.charAt(i2)) && i4 < length && Character.isLowSurrogate(str.charAt(i4))) ? i2 + 2 : i4;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21518 m11722(int i, boolean z, int[] iArr) {
        int[] iArr2 = new int[i];
        int i2 = 0;
        if (!m11741(2)) {
            while (i2 < i) {
                iArr2[i2] = iArr[i2];
                i2++;
            }
            return z ? new C17990(iArr2) : new C6701(iArr2);
        }
        if (m11741(64)) {
            while (i2 < i) {
                iArr2[i2] = C12123.m30171(iArr[i2]);
                i2++;
            }
            return z ? new C8113(iArr2) : new C18696(iArr2);
        }
        while (i2 < i) {
            iArr2[i2] = C20025.m45350(iArr[i2]);
            i2++;
        }
        return z ? new C15169(iArr2) : new C22930(iArr2);
    }
}
