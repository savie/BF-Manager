package l;

import android.os.Build;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
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

/* JADX INFO: renamed from: l.ۤ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11176 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f35220;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f35221;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f35222;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f35223;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f35224;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C0407 f35225;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f35226;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f35227;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC2885 f35228;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f35229;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f35230;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f35231;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public volatile HashMap f35232;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public BitSet f35233;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0407 f35234;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17560[] f35235;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f35236;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35237 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35238;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f35239;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C19161 f35240;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f35241;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m28165(int i, int i2) {
        if ((i2 & 1) != 0) {
            return i == 10;
        }
        return i == 10 || i == 13 || (i | 1) == 8233 || i == 133;
    }

    public C11176(String str, int i) {
        this.f35221 = str;
        this.f35238 = i;
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
    public static C9093 m28153(int i, String str) {
        C11176 c11176;
        EnumC5211 enumC5211;
        C17560 c17560;
        C0407 c10101;
        C0407 c0407;
        int iM28162;
        C0407 c0407M28149;
        C22782 c22782;
        int i2;
        EnumC9355 enumC9355;
        int i3;
        C14576 c20544;
        EnumC9355 enumC9356;
        C19293 c19293;
        C8106 c8106;
        C22365 c22365;
        boolean z;
        C0407 c0407M28171;
        C0407 c0407M281410;
        boolean z2;
        C0407 c0408;
        C11176 c11177;
        StringBuilder sb;
        int i4;
        BitSet bitSet;
        StringBuilder sb2;
        int iM23407;
        int i5;
        int iM23408;
        int i6;
        char c;
        int i7;
        int i8;
        C11176 c11178;
        C11176 c11179 = new C11176(str, i);
        int i9 = 0;
        if (str.isEmpty()) {
            C3390 c3390 = C5233.f18437;
            c11179.f35225 = new C16640(c3390);
            c11179.f35234 = c3390;
            c11179.f35240 = C5233.m15737(c3390);
            c11178 = c11179;
        } else {
            c11179.f35224 = false;
            c11179.f35231 = false;
            c11179.f35233 = null;
            c11179.f35240 = null;
            c11179.f35239 = str;
            c11179.m28168();
            char c2 = '-';
            char c3 = '\\';
            if (c11179.m28175(128) && !c11179.m28175(16)) {
                c11176 = c11179;
                c11176 = c11179;
                int[] iArr = new int[c11179.f35222.length];
                int iCharCount = 0;
                int i10 = 0;
                while (iCharCount < c11179.f35221.length()) {
                    iArr[i10] = iCharCount;
                    iCharCount += Character.charCount(c11179.f35221.codePointAt(iCharCount));
                    i10++;
                }
                int length = c11179.f35221.length();
                iArr[i10 + 1] = length;
                iArr[i10] = length;
                int[] iArrM28160 = c11179.m28160(iArr);
                String str2 = new String(c11179.f35222, 0, c11179.f35236);
                int[] iArr2 = new int[str2.length()];
                int i11 = 0;
                while (i11 < c11179.f35236) {
                    int iCharCount2 = Character.charCount(c11179.f35222[i11]) + i9;
                    Arrays.fill(iArr2, i9, iCharCount2, iArrM28160[i11]);
                    i11++;
                    i9 = iCharCount2;
                }
                String str3 = c11179.f35221;
                int i12 = c11179.f35238;
                int length2 = str2.length();
                StringBuilder sb3 = new StringBuilder(str3.length());
                C2753 c2753 = new C2753(sb3, str3);
                BitSet bitSet2 = c2753.f9112;
                C8719 c8719 = new C8719(str2, i12);
                ArrayDeque arrayDeque = new ArrayDeque();
                int iM23409 = 0;
                boolean z3 = false;
                int i13 = 0;
                int i14 = 0;
                C11176 c111710 = c11179;
                loop2: while (true) {
                    boolean z4 = false;
                    C11176 c111711 = c111710;
                    while (true) {
                        boolean z5 = false;
                        C11176 c111712 = c111711;
                        while (true) {
                            c11177 = c111712;
                            if (iM23409 >= length2) {
                                break loop2;
                            }
                            int iM234010 = c8719.m23407(iM23409);
                            if (iM234010 != iM23409) {
                                if (iM234010 == length2) {
                                    break loop2;
                                }
                                z5 = false;
                                iM23409 = iM234010;
                            }
                            char cCharAt = str2.charAt(iM23409);
                            if (cCharAt == c3) {
                                c = c3;
                                i7 = iM23409 + 1;
                                if (i7 < length2) {
                                    break;
                                }
                            }
                            if (i14 > 0 && cCharAt == c2 && z4 && (i6 = iM23409 + 1) < length2) {
                                sb = sb3;
                                if (str2.charAt(i6) != '[' && str2.charAt(i6) != ']') {
                                    int iM234011 = c8719.m23407(i6);
                                    if (iM234011 < length2) {
                                        iM234011 = str2.charAt(iM234011) == '\\' ? c8719.m23408(iM234011, bitSet2, iArr2) : iM234011 + Character.charCount(str2.codePointAt(iM234011));
                                    }
                                    iM23409 = iM234011;
                                    c2 = '-';
                                    c3 = '\\';
                                    z3 = false;
                                    break;
                                }
                            } else {
                                sb = sb3;
                            }
                            if (i14 > 0 && cCharAt == '&' && (iM23408 = c8719.m23407(iM23409 + 1)) < length2 && str2.charAt(iM23408) == '&') {
                                iM23409 = iM23408 + 1;
                                c2 = '-';
                                c3 = '\\';
                                break;
                            }
                            if (i14 == 0 && cCharAt == '(') {
                                int i15 = c8719.f28388;
                                iM23409++;
                                int iM234012 = c8719.m23407(iM23409);
                                String str4 = c8719.f28389;
                                int length3 = str4.length();
                                if (iM234012 != length3) {
                                    i4 = length2;
                                    bitSet = bitSet2;
                                    if (str4.charAt(iM234012) == '?') {
                                        int i16 = iM234012 + 1;
                                        int i17 = c8719.f28388;
                                        boolean z6 = false;
                                        while (true) {
                                            iM23407 = c8719.m23407(i16);
                                            if (iM23407 < length3) {
                                                int i18 = length3;
                                                char cCharAt2 = str4.charAt(iM23407);
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
                                                            int i19 = c8719.f28388;
                                                            c8719.f28388 = z6 ? (~i5) & i19 : i5 | i19;
                                                        }
                                                    } else {
                                                        z6 = true;
                                                    }
                                                    i16 = iM23407 + 1;
                                                    length3 = i18;
                                                    str4 = str5;
                                                }
                                            }
                                            c8719.f28388 = i17;
                                        }
                                    }
                                    if (iM23407 >= 0) {
                                        if (str2.charAt(iM23407) == ':') {
                                            arrayDeque.push(Integer.valueOf(i15));
                                        }
                                        sb2 = sb;
                                        iM23409 = iM23407 + 1;
                                    } else {
                                        arrayDeque.push(Integer.valueOf(i15));
                                        sb2 = sb;
                                    }
                                } else {
                                    i4 = length2;
                                    bitSet = bitSet2;
                                }
                                iM23407 = -1;
                                if (iM23407 >= 0) {
                                    if (str2.charAt(iM23407) == ':') {
                                        arrayDeque.push(Integer.valueOf(i15));
                                    }
                                    sb2 = sb;
                                    iM23409 = iM23407 + 1;
                                } else {
                                    arrayDeque.push(Integer.valueOf(i15));
                                    sb2 = sb;
                                }
                            } else {
                                i4 = length2;
                                bitSet = bitSet2;
                                if (i14 == 0 && cCharAt == ')' && !arrayDeque.isEmpty()) {
                                    c8719.f28388 = ((Integer) arrayDeque.pop()).intValue();
                                }
                                if (cCharAt == '[') {
                                    if (i14 == 0) {
                                        int i20 = iArr2[iM23409];
                                        if (i13 < i20) {
                                            c2753.m9102(i13, i20);
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
                                            int i21 = iArr2[iM23409] + 1;
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
                                iM23409++;
                            }
                            c2 = '-';
                            length2 = i4;
                            sb3 = sb2;
                            c111712 = c11177;
                            bitSet2 = bitSet;
                            c3 = '\\';
                        }
                        char cCharAt3 = str2.charAt(i7);
                        z4 = "dDsSwWhHVpP".indexOf(cCharAt3) < 0 && (cCharAt3 != 'v' || ((i8 = iM23409 + 2) < length2 && str2.charAt(i8) == c2));
                        iM23409 = c8719.m23408(iM23409, bitSet2, iArr2);
                        z3 = false;
                        c3 = c;
                        c111711 = c11177;
                    }
                    sb3 = sb;
                    c111710 = c11177;
                }
                StringBuilder sb4 = sb3;
                if (i13 < str3.length()) {
                    c2753.m9102(i13, str3.length());
                }
                C11176 c111713 = c11177;
                c111713.f35239 = sb4.toString();
                c111713.m28168();
                c11176 = c111713;
            }
            c11176 = c11179;
            c11176 = c11179;
            c11176 = c11179;
            if (!c11176.m28175(16)) {
                c11176.m28160((int[]) null);
            }
            c11176.f35223 = new int[32];
            c11176.f35235 = new C17560[10];
            c11176.f35232 = null;
            c11176.f35230 = new ArrayList(10);
            if (c11176.m28175(16)) {
                C5454 c5454M28152 = c11176.m28152(c11176.f35236, c11176.f35220, c11176.f35222);
                c11176.f35234 = c5454M28152;
                c5454M28152.f1952 = C5233.f18437;
            } else {
                C3390 c3391 = C5233.f18437;
                ArrayDeque arrayDeque2 = new ArrayDeque();
                arrayDeque2.push(new C22365(c3391, null));
                while (true) {
                    C22365 c22366 = (C22365) arrayDeque2.peek();
                    C0407 c0409 = c22366.f72402;
                    C0407 c04010 = c22366.f72400;
                    while (true) {
                        int iM28169 = c11176.m28169();
                        if (iM28169 != 0) {
                            if (iM28169 == 36) {
                                c11176.m28177();
                                c0407M28171 = c11176.m28175(1) ? new C9181(c11176.m28175(8)) : new C19798(c11176.m28175(8));
                            } else {
                                if (iM28169 != 46) {
                                    if (iM28169 != 63) {
                                        if (iM28169 != 124) {
                                            if (iM28169 != 125) {
                                                switch (iM28169) {
                                                    case 40:
                                                    case 41:
                                                        break;
                                                    case 42:
                                                    case 43:
                                                        break;
                                                    default:
                                                        switch (iM28169) {
                                                            case 91:
                                                                c0407M28171 = (!c11176.m28175(128) || c11176.m28175(16)) ? c11176.m28156(c11176.m28163()) : new C21290(c11176.m28163());
                                                                break;
                                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                                int[] iArr3 = c11176.f35222;
                                                                int i22 = c11176.f35226 + 1;
                                                                c11176.f35226 = i22;
                                                                int i23 = iArr3[i22];
                                                                if (i23 == 112 || i23 == 80) {
                                                                    boolean z8 = i23 == 80;
                                                                    if (c11176.m28177() != 123) {
                                                                        c11176.m28166();
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    c0407M28171 = (!c11176.m28175(128) || c11176.m28175(16)) ? c11176.m28156(c11176.m28151(z2, z8)) : new C21290(c11176.m28151(z2, z8));
                                                                } else {
                                                                    c11176.m28166();
                                                                    c0407M28171 = c11176.m28171();
                                                                }
                                                                break;
                                                            case 93:
                                                                c0407M28171 = c11176.m28171();
                                                                break;
                                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                                c11176.m28177();
                                                                if (!c11176.m28175(8)) {
                                                                    c0407M28171 = new C17801();
                                                                } else if (c11176.m28175(1)) {
                                                                    c0407M28171 = new C0979();
                                                                } else {
                                                                    c0407M28171 = new C1394();
                                                                }
                                                                break;
                                                            default:
                                                                c0407M28171 = c11176.m28171();
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                c0407M28171 = c11176.m28171();
                                            }
                                        }
                                    }
                                    c11176.m28177();
                                    throw c11176.m28164("Dangling meta character '" + ((char) iM28169) + "'");
                                }
                                c11176.m28177();
                                c0407M28171 = c11176.m28175(32) ? new C5869() : c11176.m28175(1) ? new C2470() : new C15322();
                            }
                            c0407M281410 = c11176.m28149(c0407M28171);
                            if (c0409 == null) {
                                c0409 = c0407M281410;
                            } else {
                                c04010.f1952 = c0407M281410;
                            }
                            c04010 = c0407M281410;
                        } else {
                            if (c11176.f35226 >= c11176.f35236) {
                            }
                            c0407M28171 = c11176.m28171();
                            c0407M281410 = c11176.m28149(c0407M28171);
                            if (c0409 == null) {
                                c0409 = c0407M281410;
                            } else {
                                c04010.f1952 = c0407M281410;
                            }
                            c04010 = c0407M281410;
                        }
                    }
                    c22366.f72402 = c0409;
                    c22366.f72400 = c04010;
                    if (c11176.m28169() == 40) {
                        C13939 c13939 = new C13939(c11176.f35238, c11176.f35230.size());
                        c11176.f35225 = null;
                        if (c11176.m28177() == 63) {
                            int iM28145 = c11176.m28145();
                            if (iM28145 != 33) {
                                if (iM28145 != 36) {
                                    if (iM28145 == 58) {
                                        c13939.f44189 = c11176.m28155(true);
                                    } else if (iM28145 != 64) {
                                        switch (iM28145) {
                                            case 60:
                                                int iM28161 = c11176.m28161();
                                                if (iM28161 == 61 || iM28161 == 33) {
                                                    c13939.f44185 = iM28161 == 61 ? EnumC5211.POSITIVE_LOOKBEHIND : EnumC5211.NEGATIVE_LOOKBEHIND;
                                                    c13939.f44188 = c11176.f35226;
                                                    c13939.f44186 = c11176.f35237;
                                                    c13939.f44189 = c11176.m28155(true);
                                                } else {
                                                    String strM28148 = c11176.m28148(iM28161);
                                                    if (((HashMap) c11176.m28180()).containsKey(strM28148)) {
                                                        throw c11176.m28164(C14442.m34865("Named capturing group <", strM28148, "> is already defined"));
                                                    }
                                                    c13939.f44184 = true;
                                                    c13939.f44189 = c11176.m28155(false);
                                                    ((HashMap) c11176.m28180()).put(strM28148, Integer.valueOf(c11176.f35237 - 1));
                                                }
                                                break;
                                            case 61:
                                                if (iM28145 == 61) {
                                                    enumC5211 = EnumC5211.POSITIVE_LOOKAHEAD;
                                                } else {
                                                    enumC5211 = EnumC5211.NEGATIVE_LOOKAHEAD;
                                                }
                                                c13939.f44185 = enumC5211;
                                                c13939.f44189 = c11176.m28155(true);
                                                break;
                                            case 62:
                                                c13939.f44185 = EnumC5211.INDEPENDENT;
                                                c13939.f44189 = c11176.m28155(true);
                                                break;
                                            default:
                                                c11176.m28166();
                                                int iM281610 = c11176.m28169();
                                                while (true) {
                                                    if (iM281610 != 45) {
                                                        if (iM281610 == 85) {
                                                            c11176.f35238 |= 320;
                                                        } else if (iM281610 == 105) {
                                                            c11176.f35238 |= 2;
                                                        } else if (iM281610 == 109) {
                                                            c11176.f35238 |= 8;
                                                        } else if (iM281610 == 115) {
                                                            c11176.f35238 |= 32;
                                                        } else if (iM281610 == 117) {
                                                            c11176.f35238 |= 64;
                                                        } else if (iM281610 == 120) {
                                                            c11176.f35238 |= 4;
                                                        } else if (iM281610 == 99) {
                                                            c11176.f35238 |= 128;
                                                        } else if (iM281610 == 100) {
                                                            c11176.f35238 |= 1;
                                                        }
                                                        iM281610 = c11176.m28177();
                                                    } else {
                                                        c11176.m28177();
                                                        int iM281611 = c11176.m28169();
                                                        while (true) {
                                                            if (iM281611 == 85) {
                                                                c11176.f35238 &= -321;
                                                            } else if (iM281611 == 105) {
                                                                c11176.f35238 &= -3;
                                                            } else if (iM281611 == 109) {
                                                                c11176.f35238 &= -9;
                                                            } else if (iM281611 == 115) {
                                                                c11176.f35238 &= -33;
                                                            } else if (iM281611 == 117) {
                                                                c11176.f35238 &= -65;
                                                            } else if (iM281611 == 120) {
                                                                c11176.f35238 &= -5;
                                                            } else if (iM281611 == 99) {
                                                                c11176.f35238 &= -129;
                                                            } else if (iM281611 == 100) {
                                                                c11176.f35238 &= -2;
                                                            }
                                                            iM281611 = c11176.m28177();
                                                        }
                                                    }
                                                }
                                                int iM28163 = c11176.m28161();
                                                if (iM28163 != 41) {
                                                    if (iM28163 != 58) {
                                                        throw c11176.m28164("Unknown inline modifier");
                                                    }
                                                    c13939.f44189 = c11176.m28155(true);
                                                } else {
                                                    c13939 = null;
                                                }
                                                break;
                                        }
                                    }
                                }
                                throw c11176.m28164("Unknown group type");
                            }
                            if (iM28145 == 61) {
                                enumC5211 = EnumC5211.POSITIVE_LOOKAHEAD;
                            } else {
                                enumC5211 = EnumC5211.NEGATIVE_LOOKAHEAD;
                            }
                            c13939.f44185 = enumC5211;
                            c13939.f44189 = c11176.m28155(true);
                            if (c13939 != null) {
                                arrayDeque2.push(new C22365(c13939.f44187, c13939));
                            }
                        } else {
                            c13939.f44184 = true;
                            c13939.f44189 = c11176.m28155(false);
                        }
                        c13939.f44187 = c11176.f35225;
                        if (c13939 != null) {
                            arrayDeque2.push(new C22365(c13939.f44187, c13939));
                        }
                    } else {
                        C0407 c04011 = c22366.f72402;
                        C0407 c04012 = c22366.f72401;
                        if (c04011 == null) {
                            c04011 = c04012;
                        } else {
                            C0407 c04013 = c22366.f72400;
                            c04013.f1952 = c04012;
                            c11176.f35225 = c04013;
                        }
                        C0407 c04014 = c11176.f35225;
                        if (c22366.f72406 == null) {
                            c22366.f72406 = c04011;
                            c22366.f72404 = c04014;
                        } else {
                            if (c22366.f72405 == null) {
                                C19293 c19294 = new C19293();
                                c22366.f72405 = c19294;
                                c19294.f1952 = c04012;
                            }
                            if (c04011 == c04012) {
                                c04011 = null;
                            } else {
                                c04014.f1952 = c22366.f72405;
                            }
                            C0407 c04015 = c22366.f72406;
                            C8106 c8107 = c22366.f72399;
                            if (c04015 == c8107) {
                                int i24 = c8107.f26769;
                                C0407[] c0407Arr = c8107.f26768;
                                if (i24 >= c0407Arr.length) {
                                    C0407[] c0407Arr2 = new C0407[c0407Arr.length * 2];
                                    System.arraycopy(c0407Arr, 0, c0407Arr2, 0, c0407Arr.length);
                                    c8107.f26768 = c0407Arr2;
                                }
                                C0407[] c0407Arr3 = c8107.f26768;
                                int i25 = c8107.f26769;
                                c8107.f26769 = i25 + 1;
                                c0407Arr3[i25] = c04011;
                            } else {
                                if (c04015 == c04012) {
                                    c22366.f72406 = null;
                                } else {
                                    c22366.f72404.f1952 = c22366.f72405;
                                }
                                C8106 c8108 = new C8106(c22366.f72406, c04011, c22366.f72405);
                                c22366.f72399 = c8108;
                                c22366.f72406 = c8108;
                            }
                        }
                        c22366.f72400 = null;
                        c22366.f72402 = null;
                        if (c11176.m28169() == 124) {
                            c11176.m28177();
                        } else {
                            arrayDeque2.pop();
                            C8106 c8109 = c22366.f72399;
                            if (c8109 != null) {
                                c8109.m21987();
                            }
                            C13939 c139310 = c22366.f72403;
                            if (c139310 == null) {
                                c11176.f35234 = c22366.f72406;
                                if (c11176.f35236 != c11176.f35226) {
                                    if (c11176.m28169() == 41) {
                                        throw c11176.m28164("Unmatched closing ')'");
                                    }
                                    int i26 = c11176.f35226;
                                    int i27 = c11176.f35236;
                                    if (i26 == i27 + 1 && c11176.f35222[i27 - 1] == 92) {
                                        throw c11176.m28164("Unescaped trailing backslash");
                                    }
                                    throw c11176.m28164("Unexpected internal error");
                                }
                            } else {
                                C0407 c04016 = c22366.f72406;
                                C17560 c17561 = c139310.f44189;
                                C0407 c23769 = c139310.f44187;
                                int i28 = c139310.f44190;
                                boolean z9 = c139310.f44184;
                                c17561.f1952 = c04016;
                                if (c139310.f44185 == EnumC5211.NORMAL && z9) {
                                    c17560 = c17561;
                                    if (c04016 instanceof C6615) {
                                        C14817 c14817 = new C14817(c17561.f57062);
                                        c14817.f1952 = c17561.f1952;
                                        c14817.f57063 = c17561.f57063;
                                        c139310.f44189 = c14817;
                                        int i29 = ((C16068) c23769).f52069 / 2;
                                        C17560[] c17560Arr = c11176.f35235;
                                        if (i29 < c17560Arr.length) {
                                            c17560Arr[i29] = c14817;
                                        }
                                        c17560 = c14817;
                                    }
                                }
                                c17560 = c17561;
                                c17560 = c17561;
                                int iOrdinal = c139310.f44185.ordinal();
                                if (iOrdinal == 1) {
                                    c10101 = new C10101(c17560);
                                } else if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        c10101 = new C2644(c17560, EnumC9355.INDEPENDENT);
                                    } else if (iOrdinal == 4 || iOrdinal == 5) {
                                        c0407 = c17560;
                                        if (c139310.f44186 < c11176.f35237) {
                                            if (c11176.f35233 == null) {
                                                c11176.f35233 = new BitSet();
                                            }
                                            c11176.f35233.set(c139310.f44186, c11176.f35237);
                                        }
                                        c23769.f1952 = C6374.f21528;
                                        C14402 c14402 = new C14402();
                                        c17560.m2213(c14402);
                                        if (!c14402.f45392) {
                                            throw c11176.m28164("Look-behind group does not have an obvious maximum length");
                                        }
                                        int i30 = c139310.f44188;
                                        int i31 = c11176.f35236;
                                        while (true) {
                                            if (i30 >= i31) {
                                                z = false;
                                            } else if (C5233.m15736(c11176.f35222[i30])) {
                                                z = true;
                                            } else {
                                                i30++;
                                            }
                                        }
                                        c23769 = c139310.f44185 == EnumC5211.POSITIVE_LOOKBEHIND ? z ? new C23769(c14402.f45393, c14402.f45394, c17560) : new C16309(c14402.f45393, c14402.f45394, c17560) : z ? new C19052(c14402.f45393, c14402.f45394, c17560) : new C7865(c14402.f45393, c14402.f45394, c17560);
                                        if (i28 < c11176.f35230.size()) {
                                            ArrayList arrayList = c11176.f35230;
                                            arrayList.subList(i28, arrayList.size()).clear();
                                        }
                                        c0407 = c23769;
                                    }
                                    c0407 = c17560;
                                    int[] iArr4 = c11176.f35222;
                                    int i32 = c11176.f35226;
                                    c11176.f35226 = i32 + 1;
                                    iM28162 = iArr4[i32];
                                    if (c11176.m28175(4)) {
                                        iM28162 = c11176.m28162(iM28162);
                                    }
                                    if (41 == iM28162) {
                                        throw c11176.m28164("Unclosed group");
                                    }
                                    c11176.f35238 = c139310.f44191;
                                    c0407M28149 = c11176.m28149(c0407);
                                    if (c0407M28149 == c0407) {
                                        if (c139310.f44185 == EnumC5211.NORMAL && !z9) {
                                            ((C17560) c0407).f57061 = false;
                                            ((C16068) c23769).f52070 = false;
                                        }
                                        c11176.f35225 = c23769;
                                    } else if (c0407 == c23769) {
                                        c11176.f35225 = c0407M28149;
                                    } else {
                                        if (i28 < c11176.f35230.size()) {
                                            ArrayList arrayList2 = c11176.f35230;
                                            arrayList2.subList(i28, arrayList2.size()).clear();
                                        }
                                        if (c0407M28149 instanceof C2644) {
                                            enumC9356 = ((C2644) c0407M28149).f8451;
                                            if (enumC9356 == EnumC9355.POSSESSIVE) {
                                                c11176.f35225 = c0407M28149;
                                            } else {
                                                c19293 = new C19293();
                                                c23769.f1952 = c19293;
                                                if (enumC9356 == EnumC9355.GREEDY) {
                                                    c8106 = new C8106(c0407, null, c19293);
                                                } else {
                                                    c8106 = new C8106(null, c0407, c19293);
                                                }
                                                c11176.f35225 = c19293;
                                                c0407M28149 = c8106;
                                            }
                                        } else {
                                            if (c0407M28149 instanceof C22782) {
                                                throw c11176.m28164("Internal logic error");
                                            }
                                            c22782 = (C22782) c0407M28149;
                                            i2 = c22782.f73899;
                                            enumC9355 = c22782.f73900;
                                            if (enumC9355 == EnumC9355.POSSESSIVE) {
                                                c11176.f35225 = c0407M28149;
                                            } else if (c0407.m2213(new C14402())) {
                                                C16068 c16068 = (C16068) c23769;
                                                c0407M28149 = new C16814(c0407.f1952, c22782.f73902, c22782.f73899, c22782.f73900, c16068.f52068, c16068.f52069, z9);
                                                c11176.f35225 = c0407M28149;
                                            } else {
                                                i3 = ((C17560) c0407).f57062;
                                                if (enumC9355 == EnumC9355.GREEDY) {
                                                    c20544 = new C14576(c11176.f35227, i3);
                                                    if (i2 == Integer.MAX_VALUE) {
                                                        c11176.f35230.add(c20544);
                                                    }
                                                } else {
                                                    c20544 = new C20544(c11176.f35227, i3);
                                                }
                                                c0407M28149 = new C1153(c20544);
                                                c11176.f35227++;
                                                c20544.f45932 = c22782.f73902;
                                                c20544.f45934 = i2;
                                                c20544.f45929 = c0407;
                                                c23769.f1952 = c20544;
                                                c11176.f35225 = c20544;
                                            }
                                        }
                                    }
                                    c22365 = (C22365) arrayDeque2.peek();
                                    C0407 c04017 = c11176.f35225;
                                    if (c22365.f72402 == null) {
                                        c22365.f72402 = c0407M28149;
                                    } else {
                                        c22365.f72400.f1952 = c0407M28149;
                                    }
                                    c22365.f72400 = c04017;
                                } else {
                                    c10101 = new C18306(c17560);
                                }
                                c23769 = c10101;
                                c0407 = c23769;
                                c0407 = c17560;
                                int[] iArr5 = c11176.f35222;
                                int i33 = c11176.f35226;
                                c11176.f35226 = i33 + 1;
                                iM28162 = iArr5[i33];
                                if (c11176.m28175(4)) {
                                    iM28162 = c11176.m28162(iM28162);
                                }
                                if (41 == iM28162) {
                                    throw c11176.m28164("Unclosed group");
                                }
                                c11176.f35238 = c139310.f44191;
                                c0407M28149 = c11176.m28149(c0407);
                                if (c0407M28149 == c0407) {
                                    if (c139310.f44185 == EnumC5211.NORMAL) {
                                        ((C17560) c0407).f57061 = false;
                                        ((C16068) c23769).f52070 = false;
                                    }
                                    c11176.f35225 = c23769;
                                } else if (c0407 == c23769) {
                                    c11176.f35225 = c0407M28149;
                                } else {
                                    if (i28 < c11176.f35230.size()) {
                                        ArrayList arrayList3 = c11176.f35230;
                                        arrayList3.subList(i28, arrayList3.size()).clear();
                                    }
                                    if (c0407M28149 instanceof C2644) {
                                        enumC9356 = ((C2644) c0407M28149).f8451;
                                        if (enumC9356 == EnumC9355.POSSESSIVE) {
                                            c11176.f35225 = c0407M28149;
                                        } else {
                                            c19293 = new C19293();
                                            c23769.f1952 = c19293;
                                            if (enumC9356 == EnumC9355.GREEDY) {
                                                c8106 = new C8106(c0407, null, c19293);
                                            } else {
                                                c8106 = new C8106(null, c0407, c19293);
                                            }
                                            c11176.f35225 = c19293;
                                            c0407M28149 = c8106;
                                        }
                                    } else {
                                        if (c0407M28149 instanceof C22782) {
                                            throw c11176.m28164("Internal logic error");
                                        }
                                        c22782 = (C22782) c0407M28149;
                                        i2 = c22782.f73899;
                                        enumC9355 = c22782.f73900;
                                        if (enumC9355 == EnumC9355.POSSESSIVE) {
                                            c11176.f35225 = c0407M28149;
                                        } else if (c0407.m2213(new C14402())) {
                                            C16068 c16069 = (C16068) c23769;
                                            c0407M28149 = new C16814(c0407.f1952, c22782.f73902, c22782.f73899, c22782.f73900, c16069.f52068, c16069.f52069, z9);
                                            c11176.f35225 = c0407M28149;
                                        } else {
                                            i3 = ((C17560) c0407).f57062;
                                            if (enumC9355 == EnumC9355.GREEDY) {
                                                c20544 = new C14576(c11176.f35227, i3);
                                                if (i2 == Integer.MAX_VALUE) {
                                                    c11176.f35230.add(c20544);
                                                }
                                            } else {
                                                c20544 = new C20544(c11176.f35227, i3);
                                            }
                                            c0407M28149 = new C1153(c20544);
                                            c11176.f35227++;
                                            c20544.f45932 = c22782.f73902;
                                            c20544.f45934 = i2;
                                            c20544.f45929 = c0407;
                                            c23769.f1952 = c20544;
                                            c11176.f35225 = c20544;
                                        }
                                    }
                                }
                                c22365 = (C22365) arrayDeque2.peek();
                                C0407 c04018 = c11176.f35225;
                                if (c22365.f72402 == null) {
                                    c22365.f72402 = c0407M28149;
                                } else {
                                    c22365.f72400.f1952 = c0407M28149;
                                }
                                c22365.f72400 = c04018;
                            }
                        }
                    }
                }
            }
            boolean z10 = (c11176.f35238 & 512) != 0;
            if (z10) {
                c0408 = c11176.f35234;
                if (c0408 instanceof C17801) {
                    if (z10) {
                        c11176.f35234 = new C6945(c0408);
                    }
                    c11176.f35225 = c11176.f35234;
                } else {
                    if (z10) {
                        c11176.f35234 = new C6945(c0408);
                    }
                    c11176.f35225 = c11176.f35234;
                }
            } else {
                C0407 c04019 = c11176.f35234;
                if (c04019 instanceof C19624) {
                    C0407 c0407M48974 = C21531.m48974(c04019);
                    c11176.f35225 = c0407M48974;
                    C0407 c04020 = c11176.f35234;
                    if (c0407M48974 == c04020) {
                        c11176.f35225 = m28154(c04020, c11176.f35220);
                    }
                } else {
                    c0408 = c11176.f35234;
                    if ((c0408 instanceof C17801) || (c0408 instanceof C1899)) {
                        if (z10) {
                            c11176.f35234 = new C6945(c0408);
                        }
                        c11176.f35225 = c11176.f35234;
                    } else {
                        if (z10) {
                            c11176.f35234 = new C6945(c0408);
                        }
                        c11176.f35225 = m28154(c11176.f35234, c11176.f35220);
                    }
                }
            }
            c11176.f35240 = (c11176.f35224 || c11176.f35231) ? C19161.f61997 : C5233.m15737(c11176.f35234);
            c11176.f35234 = C4136.m13263(c11176.f35234);
            if (!c11176.f35229) {
                for (C0407 c04021 : c11176.f35230) {
                    if (c04021 instanceof C14576) {
                        int i34 = c11176.f35241;
                        c11176.f35241 = i34 + 1;
                        ((C14576) c04021).f45930 = i34;
                    }
                }
            }
            c11176.f35222 = null;
            c11176.f35223 = null;
            c11176.f35235 = null;
            c11176.f35236 = 0;
            c11176.f35230 = null;
            c11178 = c11176;
        }
        return new C9093(c11178.f35225, c11178.f35234, c11178.f35238, c11178.f35237, c11178.f35227, c11178.f35241, c11178.f35240, c11178.f35224 || c11178.f35231, c11178.f35233, c11178.m28180(), new C10210(0));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m28162(int i) {
        while (true) {
            if (!C12690.m31485(i, 2048) && i != 35) {
                return i;
            }
            while (C12690.m31485(i, 2048)) {
                int[] iArr = this.f35222;
                int i2 = this.f35226;
                this.f35226 = i2 + 1;
                i = iArr[i2];
            }
            if (i == 35) {
                int[] iArr2 = this.f35222;
                int i3 = this.f35226;
                this.f35226 = i3 + 1;
                i = iArr2[i3];
                while (i != 0 && !m28165(i, this.f35238)) {
                    int[] iArr3 = this.f35222;
                    int i4 = this.f35226;
                    this.f35226 = i4 + 1;
                    i = iArr3[i4];
                }
                if (i == 0) {
                    int i5 = this.f35226;
                    int i6 = this.f35236;
                    if (i5 > i6) {
                        int[] iArr4 = this.f35222;
                        this.f35226 = i6 + 1;
                        i = iArr4[i6];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m28178(int i) {
        while (true) {
            if (!C12690.m31485(i, 2048) && i != 35) {
                return i;
            }
            while (C12690.m31485(i, 2048)) {
                int[] iArr = this.f35222;
                int i2 = this.f35226 + 1;
                this.f35226 = i2;
                i = iArr[i2];
            }
            if (i == 35) {
                int[] iArr2 = this.f35222;
                int i3 = this.f35226 + 1;
                this.f35226 = i3;
                i = iArr2[i3];
                while (i != 0 && !m28165(i, this.f35238)) {
                    int[] iArr3 = this.f35222;
                    int i4 = this.f35226 + 1;
                    this.f35226 = i4;
                    i = iArr3[i4];
                }
                if (i == 0) {
                    int i5 = this.f35226;
                    int i6 = this.f35236;
                    if (i5 > i6) {
                        this.f35226 = i6;
                        i = this.f35222[i6];
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28157(int i, int i2, String str, StringBuilder sb) {
        m28158(str, i, i2, sb, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28158(String str, int i, int i2, final StringBuilder sb, final boolean z) {
        int i3 = i;
        while (i3 < i2 && C12690.m31484(str.charAt(i3))) {
            i3++;
        }
        if (i3 == i2) {
            if (z) {
                sb.append(C18415.m42926(str.substring(i, i2)));
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
                sb.append(C18415.m42926(str.substring(i, i5)));
            } else {
                sb.append((CharSequence) str, i, i5);
            }
            i = i5;
        }
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (z || ".$|()[]{}^?*+\\".indexOf(iCodePointAt) == i4) {
                int iM14198 = C4487.m14198(str, i, i2, null);
                String strSubstring = str.substring(i, iM14198);
                String strNormalize = Normalizer.normalize(strSubstring, Normalizer.Form.NFD);
                if (strNormalize.codePointCount(0, strNormalize.length()) <= 1 || C18446.m42976(strNormalize.codePointAt(Character.charCount(strNormalize.codePointAt(0)))) != 6) {
                    String strNormalize2 = Normalizer.normalize(strSubstring, Normalizer.Form.NFC);
                    if (z) {
                        strSubstring = C18415.m42926(strSubstring);
                        strNormalize = C18415.m42926(strNormalize);
                        strNormalize2 = C18415.m42926(strNormalize2);
                    }
                    if (!strSubstring.equals(strNormalize2) && !strNormalize.equals(strNormalize2)) {
                        StringBuilder sbM10406 = C3188.m10406("(?:", strSubstring, "|", strNormalize, "|");
                        sbM10406.append(strNormalize2);
                        sbM10406.append(MotionUtils.EASING_TYPE_FORMAT_END);
                        sb.append(sbM10406.toString());
                    } else if (strSubstring.equals(strNormalize)) {
                        sb.append(strSubstring);
                    } else {
                        sb.append(C3188.m10404("(?:", strSubstring, "|", strNormalize, MotionUtils.EASING_TYPE_FORMAT_END));
                    }
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(strSubstring);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C9464(strNormalize));
                    while (!arrayList.isEmpty()) {
                        C9464 c9464 = (C9464) j$$ExternalSyntheticOutline0.m(arrayList, 1);
                        String[] strArr = c9464.f30678;
                        String str2 = c9464.f30677;
                        if (strArr == null) {
                            linkedHashSet.add(str2);
                            arrayList.remove(arrayList.size() - 1);
                        } else if (c9464.f30679 == strArr.length) {
                            C2764.m9138(arrayList, 1);
                        } else {
                            StringBuilder sbM27333 = C10732.m27333(str2);
                            String[] strArr2 = c9464.f30678;
                            int i6 = c9464.f30679;
                            c9464.f30679 = i6 + 1;
                            sbM27333.append(strArr2[i6]);
                            String string = sbM27333.toString();
                            linkedHashSet.add(string);
                            int iM28170 = m28170(2, string);
                            String strSubstring2 = string.substring(0, iM28170);
                            String strNormalize3 = Normalizer.normalize(strSubstring2, Normalizer.Form.NFC);
                            String strM34972 = strNormalize3.equals(strSubstring2) ? null : C14483.m34972(strNormalize3, string.substring(iM28170));
                            if (strM34972 != null) {
                                arrayList.add(new C9464(strM34972));
                            }
                        }
                    }
                    sb.append("(?:");
                    C4937.forEach(linkedHashSet, new Consumer() { // from class: l.֨ܶۤ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C12312.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            String strM42926 = (String) obj;
                            if (z) {
                                strM42926 = C18415.m42926(strM42926);
                            }
                            StringBuilder sb2 = sb;
                            sb2.append(strM42926);
                            sb2.append('|');
                        }
                    });
                    sb.delete(sb.length() - 1, sb.length());
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                i4 = -1;
                i = iM14198;
            } else {
                sb.append((char) iCodePointAt);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String[] m28176(String str) {
        if (str.length() == m28170(1, str)) {
            return new String[]{str};
        }
        if (str.length() == m28170(2, str)) {
            int iCodePointAt = Character.codePointAt(str, 0);
            int iCodePointAt2 = Character.codePointAt(str, Character.charCount(iCodePointAt));
            if (C6725.m18767(iCodePointAt2) == C6725.m18767(iCodePointAt)) {
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
            iArr2[i6] = C6725.m18767(iCodePointAt3);
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
    private int[] m28160(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f35236;
        int i6 = 0;
        while (true) {
            i = i5 - 1;
            if (i6 >= i) {
                break;
            }
            int[] iArr2 = this.f35222;
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
            System.arraycopy(this.f35222, 0, iArr3, 0, i6);
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
                    int i10 = this.f35222[i7];
                    int i11 = -1;
                    if (!C12690.m31484(i10) || C12690.m31485(i10, 768)) {
                        i2 = i6 + 1;
                        iArr3[i6] = i10;
                    } else if (C12690.m31487(i10)) {
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
                        int[] iArr5 = this.f35222;
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
                    } else if (this.f35222[i9] == 69) {
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
            this.f35236 = i6;
            int i12 = i6 + 2;
            this.f35222 = Arrays.copyOf(iArr3, i12);
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

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m28168() {
        int length = this.f35239.length();
        this.f35222 = new int[length + 2];
        int iCharCount = 0;
        this.f35220 = false;
        int i = 0;
        while (iCharCount < length) {
            int iCodePointAt = this.f35239.codePointAt(iCharCount);
            if (C5233.m15736(iCodePointAt)) {
                this.f35220 = true;
            }
            this.f35222[i] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
            i++;
        }
        this.f35236 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16640 m28154(C0407 c0407, boolean z) {
        C16640 c17386;
        if (!z) {
            C15894 c15894M37871 = C15894.m37871(c0407);
            if (c15894M37871 != null) {
                return c15894M37871;
            }
            C3216 c3216M10554 = C3216.m10554(c0407);
            if (c3216M10554 != null) {
                return c3216M10554;
            }
            if (c0407 instanceof C19624) {
                c17386 = new C6200((C19624) c0407);
            } else {
                c17386 = c0407 instanceof C6615 ? new C17386((C6615) c0407) : null;
            }
            C23354 c23354M52515 = C23354.m52515(c0407);
            if (c23354M52515 != null) {
                return c23354M52515;
            }
            C20370 c20370M46783 = C20370.m46783(c0407, c17386);
            if (c20370M46783 != null) {
                return c20370M46783;
            }
            if (c17386 != null) {
                return c17386;
            }
        }
        if (z) {
            return new C12165(c0407);
        }
        return new C16640(c0407);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m28180() {
        HashMap map = this.f35232;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap(2);
        this.f35232 = map2;
        return map2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m28175(int i) {
        return (i & this.f35238) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m28169() {
        int i = this.f35222[this.f35226];
        return m28175(4) ? m28178(i) : i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m28161() {
        int[] iArr = this.f35222;
        int i = this.f35226;
        this.f35226 = i + 1;
        int i2 = iArr[i];
        return m28175(4) ? m28162(i2) : i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m28177() {
        int[] iArr = this.f35222;
        int i = this.f35226 + 1;
        this.f35226 = i;
        int i2 = iArr[i];
        return m28175(4) ? m28178(i2) : i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m28145() {
        int i = this.f35226;
        int i2 = this.f35222[i + 1];
        this.f35226 = i + 2;
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28166() {
        this.f35226--;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C24383 m28164(String str) {
        return new C24383(str, this.f35239, this.f35226 - 1);
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C0407 m28171() {
        final int i;
        InterfaceC2885 interfaceC2885M15730;
        final int iM31488;
        final int i2;
        int upperCase;
        final int lowerCase;
        int iM28169 = m28169();
        boolean z = false;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            if (iM28169 != 0) {
                if (iM28169 != 36 && iM28169 != 46) {
                    if (iM28169 != 63) {
                        if (iM28169 != 94 && iM28169 != 91) {
                            if (iM28169 == 92) {
                                int[] iArr = this.f35222;
                                int i5 = this.f35226 + 1;
                                this.f35226 = i5;
                                int i6 = iArr[i5];
                                if (i6 != 112 && i6 != 80) {
                                    m28166();
                                    i3 = this.f35226;
                                    int iM28147 = m28147(false, i4 == 0, false);
                                    if (iM28147 >= 0) {
                                        m28173(iM28147, i4);
                                        i4++;
                                        if (C5233.m15736(iM28147)) {
                                            z2 = true;
                                        }
                                        iM28169 = m28169();
                                    } else {
                                        if (i4 == 0) {
                                            return this.f35225;
                                        }
                                        this.f35226 = i3;
                                    }
                                } else if (i4 > 0) {
                                    m28166();
                                } else {
                                    boolean z3 = i6 == 80;
                                    if (m28177() != 123) {
                                        m28166();
                                        z = true;
                                    }
                                    if (m28175(128) && !m28175(16)) {
                                        return new C21290(m28151(z, z3));
                                    }
                                    return m28156(m28151(z, z3));
                                }
                            } else if (iM28169 != 123) {
                                if (iM28169 != 124) {
                                    switch (iM28169) {
                                        case 40:
                                        case 41:
                                            break;
                                        case 42:
                                        case 43:
                                            break;
                                        default:
                                            i3 = this.f35226;
                                            m28173(iM28169, i4);
                                            i4++;
                                            if (C5233.m15736(iM28169)) {
                                                z2 = true;
                                            }
                                            iM28169 = m28177();
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    if (i4 > 1) {
                        this.f35226 = i3;
                        i4--;
                    }
                }
                if (i4 == 1) {
                    i = this.f35223[0];
                    if (!m28175(2)) {
                        if (m28175(64)) {
                            upperCase = Character.toUpperCase(i);
                            lowerCase = Character.toLowerCase(upperCase);
                            if (upperCase != lowerCase) {
                                C0407 c0407 = C5233.f18438;
                                interfaceC2885M15730 = new InterfaceC2885() { // from class: l.۬ۗۤ
                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25073(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ᩷ */
                                    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25074(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    public final C0891 negate() {
                                        C0407 c0408 = C5233.f18438;
                                        return C0891.m3623(this);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1303(int i7) {
                                        int i8 = lowerCase;
                                        return i8 == i7 || i8 == C17933.m41869(i7);
                                    }
                                };
                            } else if (C5233.m15736(i)) {
                                interfaceC2885M15730 = C5233.m15730(i);
                            } else {
                                interfaceC2885M15730 = new InterfaceC2885() { // from class: l.᩷᩵ۤ
                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25073(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1303(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ᩷ */
                                    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25074(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    public final C0891 negate() {
                                        C0407 c0408 = C5233.f18438;
                                        return C0891.m3623(this);
                                    }
                                };
                            }
                        } else if (C12690.m31484(i)) {
                            iM31488 = C12690.m31488(i);
                            if (((i - 97) | (122 - i)) >= 0) {
                                i2 = i - 32;
                            } else {
                                i2 = i;
                            }
                            if (iM31488 != i2) {
                                C0407 c0408 = C5233.f18438;
                                interfaceC2885M15730 = new InterfaceC12580() { // from class: l.ᩴ᩵ۤ
                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                        return C20785.m47569(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ᩷ */
                                    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                        return C20785.m47570(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    public final C0891 negate() {
                                        C0407 c0409 = C5233.f18438;
                                        return C0891.m3623(this);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1303(int i7) {
                                        return i7 == iM31488 || i7 == i2;
                                    }
                                };
                            } else if (C5233.m15736(i)) {
                                interfaceC2885M15730 = C5233.m15730(i);
                            } else {
                                interfaceC2885M15730 = new InterfaceC2885() { // from class: l.᩷᩵ۤ
                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25073(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1303(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ᩷ */
                                    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25074(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    public final C0891 negate() {
                                        C0407 c0409 = C5233.f18438;
                                        return C0891.m3623(this);
                                    }
                                };
                            }
                        } else if (C5233.m15736(i)) {
                            interfaceC2885M15730 = C5233.m15730(i);
                        } else {
                            interfaceC2885M15730 = new InterfaceC2885() { // from class: l.᩷᩵ۤ
                                @Override // l.InterfaceC2885
                                /* JADX INFO: renamed from: ۙ */
                                public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                    return C9596.m25073(this, interfaceC2885);
                                }

                                @Override // l.InterfaceC2885
                                /* JADX INFO: renamed from: ۙ */
                                public final boolean mo1303(int i7) {
                                    return i7 == i;
                                }

                                @Override // l.InterfaceC2885
                                /* JADX INFO: renamed from: ᩷ */
                                public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                    return C9596.m25074(this, interfaceC2885);
                                }

                                @Override // l.InterfaceC2885
                                public final C0891 negate() {
                                    C0407 c0409 = C5233.f18438;
                                    return C0891.m3623(this);
                                }
                            };
                        }
                    } else if (C5233.m15736(i)) {
                        interfaceC2885M15730 = C5233.m15730(i);
                    } else {
                        interfaceC2885M15730 = new InterfaceC2885() { // from class: l.᩷᩵ۤ
                            @Override // l.InterfaceC2885
                            /* JADX INFO: renamed from: ۙ */
                            public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                return C9596.m25073(this, interfaceC2885);
                            }

                            @Override // l.InterfaceC2885
                            /* JADX INFO: renamed from: ۙ */
                            public final boolean mo1303(int i7) {
                                return i7 == i;
                            }

                            @Override // l.InterfaceC2885
                            /* JADX INFO: renamed from: ᩷ */
                            public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                return C9596.m25074(this, interfaceC2885);
                            }

                            @Override // l.InterfaceC2885
                            public final C0891 negate() {
                                C0407 c0409 = C5233.f18438;
                                return C0891.m3623(this);
                            }
                        };
                    }
                    return m28156(interfaceC2885M15730);
                }
                return m28152(i4, z2, this.f35223);
            }
            if (this.f35226 >= this.f35236) {
                if (i4 == 1) {
                    i = this.f35223[0];
                    if (!m28175(2)) {
                        if (m28175(64)) {
                            upperCase = Character.toUpperCase(i);
                            lowerCase = Character.toLowerCase(upperCase);
                            if (upperCase != lowerCase) {
                                C0407 c0409 = C5233.f18438;
                                interfaceC2885M15730 = new InterfaceC2885() { // from class: l.۬ۗۤ
                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25073(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ᩷ */
                                    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25074(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    public final C0891 negate() {
                                        C0407 c04010 = C5233.f18438;
                                        return C0891.m3623(this);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1303(int i7) {
                                        int i8 = lowerCase;
                                        return i8 == i7 || i8 == C17933.m41869(i7);
                                    }
                                };
                            } else if (C5233.m15736(i)) {
                                interfaceC2885M15730 = C5233.m15730(i);
                            } else {
                                interfaceC2885M15730 = new InterfaceC2885() { // from class: l.᩷᩵ۤ
                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25073(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1303(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ᩷ */
                                    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25074(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    public final C0891 negate() {
                                        C0407 c04010 = C5233.f18438;
                                        return C0891.m3623(this);
                                    }
                                };
                            }
                        } else if (C12690.m31484(i)) {
                            iM31488 = C12690.m31488(i);
                            if (((i - 97) | (122 - i)) >= 0) {
                                i2 = i - 32;
                            } else {
                                i2 = i;
                            }
                            if (iM31488 != i2) {
                                C0407 c04010 = C5233.f18438;
                                interfaceC2885M15730 = new InterfaceC12580() { // from class: l.ᩴ᩵ۤ
                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                        return C20785.m47569(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ᩷ */
                                    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                        return C20785.m47570(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    public final C0891 negate() {
                                        C0407 c04011 = C5233.f18438;
                                        return C0891.m3623(this);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1303(int i7) {
                                        return i7 == iM31488 || i7 == i2;
                                    }
                                };
                            } else if (C5233.m15736(i)) {
                                interfaceC2885M15730 = C5233.m15730(i);
                            } else {
                                interfaceC2885M15730 = new InterfaceC2885() { // from class: l.᩷᩵ۤ
                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25073(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ۙ */
                                    public final boolean mo1303(int i7) {
                                        return i7 == i;
                                    }

                                    @Override // l.InterfaceC2885
                                    /* JADX INFO: renamed from: ᩷ */
                                    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                        return C9596.m25074(this, interfaceC2885);
                                    }

                                    @Override // l.InterfaceC2885
                                    public final C0891 negate() {
                                        C0407 c04011 = C5233.f18438;
                                        return C0891.m3623(this);
                                    }
                                };
                            }
                        } else if (C5233.m15736(i)) {
                            interfaceC2885M15730 = C5233.m15730(i);
                        } else {
                            interfaceC2885M15730 = new InterfaceC2885() { // from class: l.᩷᩵ۤ
                                @Override // l.InterfaceC2885
                                /* JADX INFO: renamed from: ۙ */
                                public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                    return C9596.m25073(this, interfaceC2885);
                                }

                                @Override // l.InterfaceC2885
                                /* JADX INFO: renamed from: ۙ */
                                public final boolean mo1303(int i7) {
                                    return i7 == i;
                                }

                                @Override // l.InterfaceC2885
                                /* JADX INFO: renamed from: ᩷ */
                                public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                    return C9596.m25074(this, interfaceC2885);
                                }

                                @Override // l.InterfaceC2885
                                public final C0891 negate() {
                                    C0407 c04011 = C5233.f18438;
                                    return C0891.m3623(this);
                                }
                            };
                        }
                    } else if (C5233.m15736(i)) {
                        interfaceC2885M15730 = C5233.m15730(i);
                    } else {
                        interfaceC2885M15730 = new InterfaceC2885() { // from class: l.᩷᩵ۤ
                            @Override // l.InterfaceC2885
                            /* JADX INFO: renamed from: ۙ */
                            public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                return C9596.m25073(this, interfaceC2885);
                            }

                            @Override // l.InterfaceC2885
                            /* JADX INFO: renamed from: ۙ */
                            public final boolean mo1303(int i7) {
                                return i7 == i;
                            }

                            @Override // l.InterfaceC2885
                            /* JADX INFO: renamed from: ᩷ */
                            public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                return C9596.m25074(this, interfaceC2885);
                            }

                            @Override // l.InterfaceC2885
                            public final C0891 negate() {
                                C0407 c04011 = C5233.f18438;
                                return C0891.m3623(this);
                            }
                        };
                    }
                    return m28156(interfaceC2885M15730);
                }
                return m28152(i4, z2, this.f35223);
            }
            i3 = this.f35226;
            m28173(iM28169, i4);
            i4++;
            if (C5233.m15736(iM28169)) {
                z2 = true;
            }
            iM28169 = m28177();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m28173(int i, int i2) {
        int length = this.f35223.length;
        if (i2 - length >= 0) {
            int i3 = (i2 + 1) - length;
            int iMax = Math.max(i3, length) + length;
            if (iMax <= 0 || iMax > 2147483639) {
                iMax = length + i3;
                if (iMax < 0) {
                    throw new OutOfMemoryError(C0703.m3016("Required array length ", length, " + ", " is too large", i3));
                }
                if (iMax <= 2147483639) {
                    iMax = 2147483639;
                }
            }
            this.f35223 = Arrays.copyOf(this.f35223, iMax);
        }
        this.f35223[i2] = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:248:0x03aa  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m28147(boolean z, boolean z2, boolean z3) {
        InterfaceC2885 interfaceC2885M53556;
        InterfaceC2885 interfaceC2885M53562;
        InterfaceC2885 interfaceC2885M53557;
        InterfaceC2885 interfaceC2885M53563;
        int iM28145 = m28145();
        int iM31486 = 0;
        switch (iM28145) {
            case 48:
                int iM28161 = m28161();
                int i = iM28161 - 48;
                if (((55 - iM28161) | i) < 0) {
                    throw m28164("Illegal octal escape sequence");
                }
                int iM28162 = m28161();
                int i2 = iM28162 - 48;
                if (((55 - iM28162) | i2) < 0) {
                    m28166();
                    return i;
                }
                int iM28163 = m28161();
                int i3 = iM28163 - 48;
                if (((55 - iM28163) | i3) >= 0 && ((51 - iM28161) | i) >= 0) {
                    return C12669.m31436(i2, 8, i * 64, i3);
                }
                m28166();
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
                        int i4 = iM28145 - 48;
                        while (iM31486 == 0) {
                            int iM28169 = m28169();
                            switch (iM28169) {
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
                                    int i5 = (iM28169 - 48) + (i4 * 10);
                                    if (this.f35237 - 1 >= i5) {
                                        m28161();
                                        i4 = i5;
                                    } else {
                                        iM31486 = 1;
                                    }
                                    break;
                                default:
                                    iM31486 = 1;
                                    break;
                            }
                        }
                        this.f35229 = true;
                        this.f35225 = m28175(2) ? new C10342(i4, m28175(64)) : new C17055(i4);
                    }
                    return -1;
                }
                throw m28164("Illegal/unsupported escape sequence");
            default:
                switch (iM28145) {
                    case 65:
                        if (!z) {
                            if (z2) {
                                this.f35225 = new C17801();
                                return -1;
                            }
                            return -1;
                        }
                        throw m28164("Illegal/unsupported escape sequence");
                    case 66:
                        if (!z) {
                            if (z2) {
                                this.f35225 = new C0648(4, m28175(256));
                                return -1;
                            }
                            return -1;
                        }
                        throw m28164("Illegal/unsupported escape sequence");
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
                        throw m28164("Illegal/unsupported escape sequence");
                    case 68:
                        if (z2) {
                            if (m28175(256)) {
                                int i6 = C24012.f77663;
                                interfaceC2885M53556 = new C6703();
                            } else {
                                interfaceC2885M53556 = C24012.m53556();
                            }
                            this.f35228 = interfaceC2885M53556;
                            C0891 c0891Negate = interfaceC2885M53556.negate();
                            this.f35228 = c0891Negate;
                            if (!z) {
                                this.f35225 = m28156(c0891Negate);
                                return -1;
                            }
                        }
                        return -1;
                    case 71:
                        if (!z) {
                            if (z2) {
                                this.f35224 = true;
                                this.f35225 = new C23528();
                                return -1;
                            }
                            return -1;
                        }
                        throw m28164("Illegal/unsupported escape sequence");
                    case 72:
                        if (z2) {
                            C0407 c0407 = C5233.f18438;
                            C0891 c0891Negate2 = new C23023().negate();
                            this.f35228 = c0891Negate2;
                            if (!z) {
                                this.f35225 = m28156(c0891Negate2);
                                return -1;
                            }
                        }
                        return -1;
                    case 78:
                        if (Build.VERSION.SDK_INT >= 35) {
                            if (m28161() != 123) {
                                throw m28164("Illegal character name escape sequence");
                            }
                            int i7 = this.f35226;
                            while (m28161() != 125) {
                                if (this.f35226 >= this.f35236) {
                                    throw m28164("Unclosed character name escape sequence");
                                }
                            }
                            String str = new String(this.f35222, i7, (this.f35226 - i7) - 1);
                            try {
                                return Character.codePointOf(str);
                            } catch (IllegalArgumentException unused) {
                                throw m28164(C14442.m34865("Unknown character name [", str, "]"));
                            }
                        }
                        throw m28164("Illegal/unsupported escape sequence");
                    case 82:
                        if (!z) {
                            if (z2) {
                                this.f35225 = new C12339();
                                return -1;
                            }
                            return -1;
                        }
                        throw m28164("Illegal/unsupported escape sequence");
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        if (z2) {
                            if (m28175(256)) {
                                int i8 = C24012.f77663;
                                interfaceC2885M53562 = new C4620();
                            } else {
                                interfaceC2885M53562 = C24012.m53562();
                            }
                            this.f35228 = interfaceC2885M53562;
                            C0891 c0891Negate3 = interfaceC2885M53562.negate();
                            this.f35228 = c0891Negate3;
                            if (!z) {
                                this.f35225 = m28156(c0891Negate3);
                                return -1;
                            }
                        }
                        return -1;
                    case HRSS1373Polynomial.K /* 86 */:
                        if (z2) {
                            C0407 c0408 = C5233.f18438;
                            C0891 c0891Negate4 = new C15563().negate();
                            this.f35228 = c0891Negate4;
                            if (!z) {
                                this.f35225 = m28156(c0891Negate4);
                                return -1;
                            }
                        }
                        return -1;
                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                        if (z2) {
                            InterfaceC2885 interfaceC2885M53564 = m28175(256) ? C24012.m53563() : C24012.m53560();
                            this.f35228 = interfaceC2885M53564;
                            C0891 c0891Negate5 = interfaceC2885M53564.negate();
                            this.f35228 = c0891Negate5;
                            if (!z) {
                                this.f35225 = m28156(c0891Negate5);
                                return -1;
                            }
                        }
                        return -1;
                    case 88:
                        if (!z) {
                            if (z2) {
                                this.f35225 = new C13656();
                                return -1;
                            }
                            return -1;
                        }
                        throw m28164("Illegal/unsupported escape sequence");
                    case 90:
                        if (!z) {
                            if (z2) {
                                if (m28175(1)) {
                                    this.f35225 = new C9181(false);
                                    return -1;
                                }
                                this.f35225 = new C19798(false);
                                return -1;
                            }
                            return -1;
                        }
                        throw m28164("Illegal/unsupported escape sequence");
                    default:
                        switch (iM28145) {
                            case 97:
                                return 7;
                            case 98:
                                if (!z) {
                                    if (z2) {
                                        if (m28169() == 123) {
                                            if (m28145() != 103) {
                                                m28166();
                                                m28166();
                                            } else if (m28161() == 125) {
                                                this.f35231 = true;
                                                this.f35225 = new C25020();
                                                return -1;
                                            }
                                        }
                                        this.f35225 = new C0648(3, m28175(256));
                                    }
                                    return -1;
                                }
                                throw m28164("Illegal/unsupported escape sequence");
                            case q.f /* 99 */:
                                if (this.f35226 < this.f35236) {
                                    return m28161() ^ 64;
                                }
                                throw m28164("Illegal control escape sequence");
                            case 100:
                                if (z2) {
                                    if (m28175(256)) {
                                        int i9 = C24012.f77663;
                                        interfaceC2885M53557 = new C6703();
                                    } else {
                                        interfaceC2885M53557 = C24012.m53556();
                                    }
                                    this.f35228 = interfaceC2885M53557;
                                    if (!z) {
                                        this.f35225 = m28156(interfaceC2885M53557);
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
                                throw m28164("Illegal/unsupported escape sequence");
                            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                if (z2) {
                                    C0407 c0409 = C5233.f18438;
                                    C23023 c23023 = new C23023();
                                    this.f35228 = c23023;
                                    if (!z) {
                                        this.f35225 = m28156(c23023);
                                        return -1;
                                    }
                                }
                                return -1;
                            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                if (!z) {
                                    if (m28161() != 60) {
                                        throw m28164("\\k is not followed by '<' for named capturing group");
                                    }
                                    String strM28148 = m28148(m28161());
                                    Integer num = (Integer) ((HashMap) m28180()).get(strM28148);
                                    if (num == null) {
                                        throw m28164(C14442.m34865("named capturing group <", strM28148, "> does not exist"));
                                    }
                                    if (z2) {
                                        this.f35229 = true;
                                        if (m28175(2)) {
                                            this.f35225 = new C10342(num.intValue(), m28175(64));
                                            return -1;
                                        }
                                        this.f35225 = new C17055(num.intValue());
                                        return -1;
                                    }
                                    return -1;
                                }
                                throw m28164("Illegal/unsupported escape sequence");
                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                return 10;
                            case 114:
                                return 13;
                            case 115:
                                if (z2) {
                                    if (m28175(256)) {
                                        int i10 = C24012.f77663;
                                        interfaceC2885M53563 = new C4620();
                                    } else {
                                        interfaceC2885M53563 = C24012.m53562();
                                    }
                                    this.f35228 = interfaceC2885M53563;
                                    if (!z) {
                                        this.f35225 = m28156(interfaceC2885M53563);
                                        return -1;
                                    }
                                }
                                return -1;
                            case 116:
                                return 9;
                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                int iM28179 = m28179();
                                char c = (char) iM28179;
                                if (Character.isHighSurrogate(c)) {
                                    int i11 = this.f35226;
                                    if (m28161() == 92 && m28161() == 117) {
                                        char cM28179 = (char) m28179();
                                        if (Character.isLowSurrogate(cM28179)) {
                                            return Character.toCodePoint(c, cM28179);
                                        }
                                    }
                                    this.f35226 = i11;
                                }
                                return iM28179;
                            case 118:
                                if (z3) {
                                    return 11;
                                }
                                if (z2) {
                                    C0407 c04010 = C5233.f18438;
                                    C15563 c15563 = new C15563();
                                    this.f35228 = c15563;
                                    if (!z) {
                                        this.f35225 = m28156(c15563);
                                        return -1;
                                    }
                                }
                                return -1;
                            case 119:
                                if (z2) {
                                    InterfaceC2885 interfaceC2885M53565 = m28175(256) ? C24012.m53563() : C24012.m53560();
                                    this.f35228 = interfaceC2885M53565;
                                    if (!z) {
                                        this.f35225 = m28156(interfaceC2885M53565);
                                        return -1;
                                    }
                                }
                                return -1;
                            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                int iM28164 = m28161();
                                if (C12690.m31485(iM28164, 32768)) {
                                    int iM28165 = m28161();
                                    if (C12690.m31485(iM28165, 32768)) {
                                        return C12690.m31486(iM28165) + (C12690.m31486(iM28164) * 16);
                                    }
                                } else if (iM28164 == 123 && C12690.m31485(m28169(), 32768)) {
                                    do {
                                        int iM28166 = m28161();
                                        if (!C12690.m31485(iM28166, 32768)) {
                                            if (iM28166 == 125) {
                                                return iM31486;
                                            }
                                            throw m28164("Unclosed hexadecimal escape sequence");
                                        }
                                        iM31486 = C12690.m31486(iM28166) + (iM31486 << 4);
                                    } while (iM31486 <= 1114111);
                                    throw m28164("Hexadecimal codepoint is too big");
                                }
                                throw m28164("Illegal hexadecimal escape sequence");
                            case 122:
                                if (!z) {
                                    if (z2) {
                                        this.f35225 = new C5628();
                                        return -1;
                                    }
                                    return -1;
                                }
                                throw m28164("Illegal/unsupported escape sequence");
                            default:
                                return iM28145;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private InterfaceC2885 m28163() {
        int i;
        InterfaceC2885 interfaceC2885M14975;
        InterfaceC2885 interfaceC2885M14976;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m28172(true));
        while (true) {
            C7228 c7228 = (C7228) j$$ExternalSyntheticOutline0.m(arrayList, 1);
            int i2 = c7228.f23835;
            boolean z = false;
            if (!c7228.f23834) {
                if (i2 != 0) {
                    if (i2 != 38) {
                        if (i2 == 91) {
                            arrayList.add(m28172(true));
                        } else if (i2 == 93 && (!c7228.f23829.m14981() || c7228.f23836)) {
                            if (c7228.f23831) {
                                m28177();
                            }
                            if (c7228.f23836) {
                                interfaceC2885M14975 = c7228.f23829.m14981() ? c7228.f23830 : c7228.f23830.mo1302(c7228.f23829.m14975());
                                if (c7228.f23832) {
                                    interfaceC2885M14975 = interfaceC2885M14975.negate();
                                }
                            } else {
                                c7228.f23829.m14979(c7228.f23832);
                                interfaceC2885M14975 = c7228.f23829.m14975();
                            }
                            arrayList.remove(arrayList.size() - 1);
                            if (arrayList.isEmpty()) {
                                return interfaceC2885M14975;
                            }
                            C7228 c7229 = (C7228) j$$ExternalSyntheticOutline0.m(arrayList, 1);
                            if (c7229.f23834) {
                                InterfaceC2885 interfaceC2885 = c7229.f23828;
                                if (interfaceC2885 != null) {
                                    interfaceC2885M14975 = interfaceC2885.mo1304(interfaceC2885M14975);
                                }
                                c7229.f23828 = interfaceC2885M14975;
                            } else {
                                c7229.f23829.m14978(interfaceC2885M14975);
                            }
                            c7229.f23835 = m28169();
                        }
                    } else if (m28177() == 38) {
                        c7228.f23835 = m28177();
                        if (c7228.f23836) {
                            interfaceC2885M14976 = c7228.f23829.m14981() ? c7228.f23830 : c7228.f23830.mo1302(c7228.f23829.m14975());
                        } else {
                            interfaceC2885M14976 = c7228.f23829.m14975();
                        }
                        c7228.f23833 = interfaceC2885M14976;
                        c7228.f23828 = null;
                        c7228.f23834 = true;
                    } else {
                        m28166();
                    }
                } else if (this.f35226 >= this.f35236) {
                    throw m28164("Unclosed character class");
                }
                C4882 c4882 = c7228.f23829;
                int iM28169 = m28169();
                if (iM28169 == 92) {
                    int[] iArr = this.f35222;
                    int i3 = this.f35226;
                    int i4 = i3 + 1;
                    this.f35226 = i4;
                    int i5 = iArr[i4];
                    if (i5 == 112 || i5 == 80) {
                        boolean z2 = i5 == 80;
                        if (m28177() != 123) {
                            m28166();
                            z = true;
                        }
                        c4882.m14978(m28151(z, z2));
                    } else {
                        boolean z3 = iArr[i3 + 2] == 45;
                        m28166();
                        iM28169 = m28147(true, true, z3);
                        if (iM28169 == -1) {
                            c4882.m14978(this.f35228);
                        }
                    }
                    c7228.f23835 = m28169();
                } else {
                    m28177();
                }
                if (iM28169 < 0) {
                    throw m28164("Unexpected character '" + ((char) iM28169) + "'");
                }
                if (m28169() != 45 || (i = this.f35222[this.f35226 + 1]) == 91 || i == 93) {
                    c4882.m14976(iM28169);
                } else {
                    m28177();
                    int iM281610 = m28169();
                    if (iM281610 == 92) {
                        iM281610 = m28147(true, false, true);
                    } else {
                        m28177();
                    }
                    if (iM281610 < iM28169) {
                        throw m28164("Illegal character range");
                    }
                    c4882.m14980(iM28169, iM281610);
                }
                c7228.f23835 = m28169();
            } else if (i2 == 93 || i2 == 38) {
                InterfaceC2885 interfaceC2886 = c7228.f23828;
                if (interfaceC2886 == null) {
                    throw m28164("Bad intersection syntax");
                }
                c7228.f23830 = c7228.f23833.mo1302(interfaceC2886);
                c7228.f23836 = true;
                c7228.f23834 = false;
                c7228.f23829 = new C4882(this.f35238);
            } else {
                if (i2 != 91) {
                    m28166();
                }
                arrayList.add(m28172(i2 == 91));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C7228 m28172(boolean z) {
        C7228 c7228 = new C7228(this.f35238, z);
        int iM28177 = m28177();
        c7228.f23835 = iM28177;
        if (iM28177 == 94 && this.f35222[this.f35226 - 1] == 91) {
            c7228.f23835 = m28177();
            c7228.f23832 = true;
        }
        return c7228;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC2885 m28151(boolean z, boolean z2) {
        String str;
        InterfaceC2885 interfaceC2885M53559;
        m28177();
        if (z) {
            int i = this.f35222[this.f35226];
            str = !Character.isSupplementaryCodePoint(i) ? String.valueOf((char) i) : new String(this.f35222, this.f35226, 1);
            m28161();
        } else {
            int i2 = this.f35226;
            this.f35222[this.f35236] = 125;
            while (m28161() != 125) {
            }
            int[] iArr = this.f35222;
            int i3 = this.f35236;
            iArr[i3] = 0;
            int i4 = this.f35226;
            if (i4 > i3) {
                throw m28164("Unclosed character family");
            }
            if (i2 + 1 >= i4) {
                throw m28164("Empty character family");
            }
            str = new String(iArr, i2, (i4 - i2) - 1);
        }
        int iIndexOf = str.indexOf(61);
        InterfaceC2885 interfaceC2885M53555 = null;
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            String lowerCase = str.substring(0, iIndexOf).toLowerCase(Locale.ENGLISH);
            lowerCase.getClass();
            switch (lowerCase) {
                case "script":
                case "sc":
                    interfaceC2885M53555 = C24012.m53554(strSubstring);
                    break;
                case "gc":
                case "general_category":
                    interfaceC2885M53555 = C24012.m53561(strSubstring, m28175(2));
                    break;
                case "blk":
                case "block":
                    int i5 = C24012.f77663;
                    try {
                        final Character.UnicodeBlock unicodeBlockForName = Character.UnicodeBlock.forName(strSubstring);
                        interfaceC2885M53555 = new InterfaceC2885() { // from class: l.᩻᩹ۤ
                            @Override // l.InterfaceC2885
                            /* JADX INFO: renamed from: ۙ */
                            public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                                return C9596.m25073(this, interfaceC2885);
                            }

                            @Override // l.InterfaceC2885
                            /* JADX INFO: renamed from: ᩷ */
                            public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                                return C9596.m25074(this, interfaceC2885);
                            }

                            @Override // l.InterfaceC2885
                            /* JADX INFO: renamed from: ۙ */
                            public final boolean mo1303(int i6) {
                                return unicodeBlockForName == Character.UnicodeBlock.of(i6);
                            }

                            @Override // l.InterfaceC2885
                            public final C0891 negate() {
                                C0407 c0407 = C5233.f18438;
                                return C0891.m3623(this);
                            }
                        };
                        break;
                    } catch (IllegalArgumentException unused) {
                        break;
                    }
                    break;
            }
            if (interfaceC2885M53555 == null) {
                throw m28164(C3188.m10404("Unknown Unicode property {name=<", lowerCase, ">, value=<", strSubstring, ">}"));
            }
        } else {
            if (str.startsWith("In")) {
                String strSubstring2 = str.substring(2);
                int i6 = C24012.f77663;
                try {
                    final Character.UnicodeBlock unicodeBlockForName2 = Character.UnicodeBlock.forName(strSubstring2);
                    interfaceC2885M53559 = new InterfaceC2885() { // from class: l.᩻᩹ۤ
                        @Override // l.InterfaceC2885
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
                            return C9596.m25073(this, interfaceC2885);
                        }

                        @Override // l.InterfaceC2885
                        /* JADX INFO: renamed from: ᩷ */
                        public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
                            return C9596.m25074(this, interfaceC2885);
                        }

                        @Override // l.InterfaceC2885
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo1303(int i7) {
                            return unicodeBlockForName2 == Character.UnicodeBlock.of(i7);
                        }

                        @Override // l.InterfaceC2885
                        public final C0891 negate() {
                            C0407 c0407 = C5233.f18438;
                            return C0891.m3623(this);
                        }
                    };
                } catch (IllegalArgumentException unused2) {
                }
            } else if (str.startsWith("Is")) {
                String strSubstring3 = str.substring(2);
                interfaceC2885M53559 = C24012.m53559(strSubstring3, m28175(2));
                if (interfaceC2885M53559 == null) {
                    interfaceC2885M53559 = C24012.m53561(strSubstring3, m28175(2));
                }
                interfaceC2885M53555 = interfaceC2885M53559 == null ? C24012.m53554(strSubstring3) : interfaceC2885M53559;
            } else {
                interfaceC2885M53555 = m28175(256) ? C24012.m53555(str, m28175(2)) : null;
                if (interfaceC2885M53555 == null) {
                    interfaceC2885M53555 = C24012.m53561(str, m28175(2));
                }
            }
            if (interfaceC2885M53555 == null) {
                throw m28164(C14442.m34865("Unknown character property name {", str, l.d));
            }
        }
        if (!z2) {
            return interfaceC2885M53555;
        }
        this.f35220 = true;
        return interfaceC2885M53555.negate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22036 m28156(InterfaceC2885 interfaceC2885) {
        if (interfaceC2885 == null) {
            return null;
        }
        if (interfaceC2885 instanceof InterfaceC12580) {
            return new C6615((InterfaceC12580) interfaceC2885);
        }
        this.f35220 = true;
        return new C22036(interfaceC2885);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m28148(int i) {
        StringBuilder sb = new StringBuilder();
        if (C12690.m31485(i, 768)) {
            do {
                sb.append((char) i);
                i = m28161();
            } while (C12690.m31485(i, Params.POLY_BYTES));
            if (i != 62) {
                throw m28164("named capturing group is missing trailing '>'");
            }
            return sb.toString();
        }
        throw m28164("capturing group name does not start with a Latin letter");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17560 m28155(boolean z) {
        int i;
        int i2 = this.f35227;
        this.f35227 = i2 + 1;
        if (z) {
            i = 0;
        } else {
            i = this.f35237;
            this.f35237 = i + 1;
        }
        C17560 c17560 = new C17560(i2);
        C16068 c16068 = new C16068(i2, i);
        this.f35225 = c16068;
        c17560.f57063 = c16068;
        if (!z && i < 10) {
            this.f35235[i] = c17560;
        }
        return c17560;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private EnumC9355 m28167() {
        int iM28177 = m28177();
        if (iM28177 == 63) {
            m28177();
            return EnumC9355.LAZY;
        }
        if (iM28177 == 43) {
            m28177();
            return EnumC9355.POSSESSIVE;
        }
        return EnumC9355.GREEDY;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0407 m28150(C0407 c0407, int i) {
        EnumC9355 enumC9355M28167 = m28167();
        if (enumC9355M28167 == EnumC9355.GREEDY) {
            if (c0407 instanceof C6615) {
                return new C24515((C6615) c0407, i);
            }
            if (c0407 instanceof C5869) {
                return new C2140(i);
            }
            if (c0407 instanceof C2470) {
                return new C8436(i);
            }
            if (c0407 instanceof C15322) {
                return new C13085(i);
            }
            if (c0407 instanceof C22036) {
                return new C10847((C22036) c0407, i);
            }
        }
        return new C22782(c0407, i, Integer.MAX_VALUE, enumC9355M28167);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0407 m28149(C0407 c0407) {
        int iM28169 = m28169();
        int i = 0;
        if (iM28169 == 42) {
            return m28150(c0407, 0);
        }
        if (iM28169 == 43) {
            return m28150(c0407, 1);
        }
        if (iM28169 == 63) {
            return new C2644(c0407, m28167());
        }
        if (iM28169 != 123) {
            return c0407;
        }
        int iM28145 = m28145();
        if (!C12690.m31487(iM28145)) {
            throw m28164("Illegal repetition");
        }
        int i2 = 0;
        while (true) {
            long j = 10;
            long j2 = ((long) i2) * j;
            long j3 = (int) j2;
            if (j2 != j3) {
                throw new ArithmeticException();
            }
            long j4 = j3 + ((long) (iM28145 - 48));
            int i3 = (int) j4;
            if (j4 != i3) {
                throw new ArithmeticException();
            }
            try {
                int iM28161 = m28161();
                if (!C12690.m31487(iM28161)) {
                    if (iM28161 == 44) {
                        iM28161 = m28161();
                        if (iM28161 == 125) {
                            m28166();
                            return m28150(c0407, i3);
                        }
                        while (C12690.m31487(iM28161)) {
                            long j5 = ((long) i) * j;
                            long j6 = (int) j5;
                            if (j5 != j6) {
                                throw new ArithmeticException();
                            }
                            long j7 = j6 + ((long) (iM28161 - 48));
                            i = (int) j7;
                            if (j7 != i) {
                                throw new ArithmeticException();
                            }
                            iM28161 = m28161();
                        }
                    } else {
                        i = i3;
                    }
                    if (iM28161 != 125) {
                        throw m28164("Unclosed counted closure");
                    }
                    if (i < i3) {
                        throw m28164("Illegal repetition range");
                    }
                    m28166();
                    return (i3 == 0 && i == 1) ? new C2644(c0407, m28167()) : new C22782(c0407, i3, i, m28167());
                }
                i2 = i3;
                iM28145 = iM28161;
            } catch (ArithmeticException unused) {
                throw m28164("Illegal repetition range");
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m28179() {
        int iM31486 = 0;
        for (int i = 0; i < 4; i++) {
            int iM28161 = m28161();
            if (!C12690.m31485(iM28161, 32768)) {
                throw m28164("Illegal Unicode escape sequence");
            }
            iM31486 = (iM31486 * 16) + C12690.m31486(iM28161);
        }
        return iM31486;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m28170(int i, String str) {
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
    private C5454 m28152(int i, boolean z, int[] iArr) {
        int[] iArr2 = new int[i];
        int i2 = 0;
        if (!m28175(2)) {
            while (i2 < i) {
                iArr2[i2] = iArr[i2];
                i2++;
            }
            return z ? new C1725(iArr2) : new C19624(iArr2);
        }
        if (m28175(64)) {
            while (i2 < i) {
                iArr2[i2] = C17933.m41869(iArr[i2]);
                i2++;
            }
            return z ? new C24846(iArr2) : new C11419(iArr2);
        }
        while (i2 < i) {
            iArr2[i2] = C12690.m31488(iArr[i2]);
            i2++;
        }
        return z ? new C12911(iArr2) : new C15148(iArr2);
    }
}
