package l;

import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.am;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ۛ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5706 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f19449;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f19452;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17706 f19453;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f19450 = Pattern.compile("v\\d+");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f19448 = Pattern.compile("\\s([+,-])?0[x,X]([0-9a-fA-F])+|\\s([+,-])?\\d+");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f19451 = Pattern.compile("\\s([+,-])?0[x,X]([0-9a-fA-F])+([l,L])?|\\s([+,-])?\\d+([l,L])?");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f19447 = Pattern.compile("\\s|:|->");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f19446 = Pattern.compile("\\s|\\(|\\)|->");

    public C5706(C17706 c17706) {
        this.f19453 = c17706;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15741(C16516 c16516) {
        int[] iArrM32476;
        int i;
        Object[] objArr;
        Object[] objArr2;
        C17706 c17706 = this.f19453;
        if (c17706 == null) {
            return;
        }
        AbstractC4300[] abstractC4300Arr = c17706.f56222;
        int[] iArr = new int[abstractC4300Arr.length];
        Arrays.fill(iArr, -1);
        C13119 c13119 = new C13119(1);
        HashMap map = new HashMap();
        int length = abstractC4300Arr.length;
        int iMo12097 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            C11107 c11107 = abstractC4300Arr[i2];
            switch (C16995.f54339[c11107.mo4758().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    iArr[i2] = ((InterfaceC21940) c11107).mo11553() + iMo12097;
                    int i3 = C16995.f54341[c11107.f15468.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        map.put(Integer.valueOf(iArr[i2]), Integer.valueOf(iMo12097));
                    }
                    break;
                case 7:
                case 8:
                    int iIntValue = ((Integer) map.get(Integer.valueOf(iMo12097))).intValue();
                    for (int i4 : ((InterfaceC5006) c11107).mo13878()) {
                        c13119.m32474(iIntValue + i4, 0);
                    }
                    break;
            }
            iMo12097 += c11107.mo12097(iMo12097);
        }
        Arrays.sort(iArr);
        int[] iArrM32477 = {-1};
        if (c13119.m32475() > 0) {
            iArrM32477 = c13119.m32476();
        }
        Arrays.sort(iArrM32477);
        C21234[] c21234Arr = c17706.f56221;
        if (c21234Arr != null && c21234Arr.length > 0) {
            C13119 c131110 = new C13119(3);
            for (C21234 c21234 : c21234Arr) {
                int iM47708 = c21234.m47708();
                int iM47709 = c21234.m47709() + iM47708;
                c131110.m32474(iM47708, 0);
                c131110.m32474(iM47709, 0);
                C22646 c22646 = c21234.f69162;
                int iM50181 = c22646.m50181();
                if (iM50181 != -1) {
                    c131110.m32474(iM50181, 0);
                } else {
                    for (C14885 c14885 : c22646.f73782) {
                        c131110.m32474(c14885.m35582(), 0);
                    }
                }
            }
            iArrM32476 = c131110.m32476();
        } else {
            iArrM32476 = new int[]{-1};
        }
        Arrays.sort(iArrM32476);
        int length2 = abstractC4300Arr.length;
        int i5 = 0;
        int iMo12098 = 0;
        Object[] objArr3 = abstractC4300Arr;
        while (i5 < length2) {
            C11107 c11108 = objArr3[i5];
            if (Arrays.binarySearch(iArr, iMo12098) >= 0 || Arrays.binarySearch(iArrM32476, iMo12098) >= 0) {
                c16516.write("label_");
                c16516.write(String.valueOf(iMo12098));
                c16516.write(58);
                c16516.write(10);
            }
            if (Arrays.binarySearch(iArrM32477, iMo12098) >= 0) {
                c16516.write("switch_");
                c16516.m38837(iMo12098);
                c16516.write(58);
                c16516.write(10);
            }
            int[] iArr2 = C16995.f54339;
            EnumC1227 enumC1227Mo4758 = c11108.mo4758();
            EnumC0772 enumC0772 = c11108.f15468;
            switch (iArr2[enumC1227Mo4758.ordinal()]) {
                case 1:
                    objArr = objArr3;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    m15734(c16516, ((C4049) c11108).mo11553() + iMo12098);
                    c16516.write(10);
                    break;
                case 2:
                case 5:
                    objArr = objArr3;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    m15734(c16516, ((InterfaceC21940) c11108).mo11553() + iMo12098);
                    c16516.write(10);
                    break;
                case 3:
                    objArr = objArr3;
                    C17456 c17456 = (C17456) c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c17456.mo4757());
                    c16516.write(32);
                    m15734(c16516, c17456.mo11553() + iMo12098);
                    c16516.write(10);
                    break;
                case 4:
                    objArr = objArr3;
                    C11937 c11937 = (C11937) c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c11937.mo4757());
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c11937.m29732());
                    c16516.write(32);
                    m15734(c16516, c11937.mo11553() + iMo12098);
                    c16516.write(10);
                    break;
                case 6:
                    objArr = objArr3;
                    C18992 c18992 = (C18992) c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c18992.mo4757());
                    c16516.write(32);
                    m15734(c16516, c18992.mo11553() + iMo12098);
                    c16516.write(10);
                    break;
                case 7:
                    objArr = objArr3;
                    C23931 c23931 = (C23931) c11108;
                    c16516.write(".pswitch_data ");
                    int iM52751 = c23931.m52751();
                    c16516.m38837(iM52751);
                    c16516.write(10);
                    c16516.m38836();
                    int iIntValue2 = ((Integer) map.get(Integer.valueOf(iMo12098))).intValue();
                    int[] iArrMo13878 = c23931.mo13878();
                    int length3 = iArrMo13878.length;
                    int i6 = 0;
                    while (i6 < length3) {
                        int i7 = iArrMo13878[i6] + iIntValue2;
                        c16516.write(String.valueOf(iM52751));
                        c16516.write(" : switch_");
                        c16516.write(String.valueOf(i7));
                        c16516.write(10);
                        i6++;
                        iM52751++;
                    }
                    c16516.m38835();
                    c16516.write(".end pswitch_data");
                    c16516.write(10);
                    break;
                case 8:
                    objArr = objArr3;
                    c16516.write(".sswitch_data");
                    c16516.write(10);
                    int iIntValue3 = ((Integer) map.get(Integer.valueOf(iMo12098))).intValue();
                    Iterator itM24920 = ((C9820) c11108).m24920();
                    c16516.m38836();
                    while (itM24920.hasNext()) {
                        C2057 c2057 = (C2057) itM24920.next();
                        int i8 = c2057.f7635;
                        int i9 = c2057.f7636 + iIntValue3;
                        c16516.write(String.valueOf(i8));
                        c16516.write(" : switch_");
                        c16516.write(String.valueOf(i9));
                        c16516.write(10);
                    }
                    c16516.m38835();
                    c16516.write(".end sswitch_data");
                    c16516.write(10);
                    break;
                case 9:
                    objArr = objArr3;
                    if (enumC0772 != EnumC0772.f3223) {
                        c16516.write(enumC0772.f3345);
                        c16516.write(10);
                    }
                    break;
                case 10:
                    objArr = objArr3;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(((C18867) c11108).mo4757());
                    c16516.write(10);
                    break;
                case 11:
                    objArr = objArr3;
                    C21689 c21689 = (C21689) c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c21689.mo4757());
                    c16516.write(32);
                    c16516.write(String.valueOf(c21689.mo6779()));
                    c16516.write(32);
                    c16516.write(10);
                    break;
                case 12:
                    objArr = objArr3;
                    C19573 c19573 = (C19573) c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c19573.mo4757());
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c19573.m44678());
                    c16516.write(10);
                    break;
                case 13:
                case 14:
                    objArr = objArr3;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c11108.mo4757());
                    c16516.write(32);
                    m15735(c16516, c11108);
                    c16516.write(10);
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    objArr = objArr3;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c11108.mo4757());
                    c16516.write(32);
                    long jMo6779 = c11108.mo6779();
                    if (jMo6779 < 0) {
                        c16516.write("-0x");
                        c16516.m38838(-jMo6779);
                        if (jMo6779 < -2147483648L) {
                            c16516.write(76);
                        }
                    } else {
                        c16516.write("0x");
                        c16516.m38838(jMo6779);
                        if (jMo6779 > 2147483647L) {
                            c16516.write(76);
                        }
                    }
                    c16516.write(10);
                    break;
                case 19:
                    objArr = objArr3;
                    C5586 c5586 = (C5586) c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c5586.mo4757());
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c5586.m15458());
                    c16516.write(10);
                    break;
                case 20:
                    objArr = objArr3;
                    C11107 c11109 = c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c11109.mo4757());
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c11109.m28008());
                    c16516.write(32);
                    c16516.write(String.valueOf(c11109.mo6779()));
                    c16516.write(10);
                    break;
                case 21:
                    objArr = objArr3;
                    C14635 c14635 = (C14635) c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c14635.mo4757());
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c14635.m35140());
                    c16516.write(32);
                    m15735(c16516, c14635);
                    c16516.write(10);
                    break;
                case 22:
                    objArr = objArr3;
                    C4880 c4880 = (C4880) c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c4880.mo4757());
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c4880.m13589());
                    c16516.write(32);
                    c16516.write(String.valueOf(c4880.mo6779()));
                    c16516.write(10);
                    break;
                case 23:
                    objArr = objArr3;
                    C1352 c1352 = (C1352) c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c1352.mo4757());
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c1352.m4761());
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c1352.m4760());
                    c16516.write(10);
                    break;
                case 24:
                    objArr = objArr3;
                    C19698 c19698 = (C19698) c11108;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c19698.mo4757());
                    c16516.write(32);
                    c16516.write(118);
                    c16516.m38837(c19698.m44822());
                    c16516.write(10);
                    break;
                case 25:
                case 26:
                    objArr = objArr3;
                    c16516.write(enumC0772.f3345);
                    c16516.write(32);
                    InterfaceC11812 interfaceC11812 = (InterfaceC11812) c11108;
                    byte bMo26663 = interfaceC11812.mo26663();
                    c16516.write(123);
                    if (bMo26663 == 1) {
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26666());
                    } else if (bMo26663 == 2) {
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26666());
                        c16516.write(",");
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26668());
                    } else if (bMo26663 == 3) {
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26666());
                        c16516.write(",");
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26668());
                        c16516.write(",");
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26665());
                    } else if (bMo26663 == 4) {
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26666());
                        c16516.write(",");
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26668());
                        c16516.write(",");
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26665());
                        c16516.write(",");
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26667());
                    } else if (bMo26663 == 5) {
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26666());
                        c16516.write(",");
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26668());
                        c16516.write(",");
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26665());
                        c16516.write(",");
                        c16516.write(118);
                        c16516.m38837((int) interfaceC11812.mo26667());
                        c16516.write(",");
                        c16516.write(am.aE);
                        c16516.m38837((int) interfaceC11812.mo26664());
                    }
                    c16516.write(q.h);
                    c16516.write(32);
                    m15735(c16516, c11108);
                    c16516.write(10);
                    break;
                case 27:
                    objArr = objArr3;
                    C16875 c16875 = (C16875) c11108;
                    c16516.write(enumC0772.f3345);
                    short sM39536 = c16875.m39536();
                    int iM39537 = c16875.m39537();
                    c16516.write(32);
                    c16516.write(123);
                    c16516.write(118);
                    c16516.m38837(iM39537);
                    c16516.write("..");
                    c16516.write(118);
                    c16516.m38837((c16875.m39537() + sM39536) - 1);
                    c16516.write(q.h);
                    c16516.write(32);
                    m15735(c16516, c16875);
                    c16516.write(10);
                    break;
                case 28:
                    C22395 c22395 = (C22395) c11108;
                    c16516.write(".array_data");
                    c16516.write(32);
                    c16516.m38837(c22395.m49665());
                    c16516.write(10);
                    c16516.m38836();
                    Iterator itM49666 = c22395.m49666();
                    Object[] objArr4 = objArr3;
                    while (itM49666.hasNext()) {
                        C5461 c5461 = (C5461) itM49666.next();
                        int i10 = c5461.f18828;
                        Object[] objArr5 = objArr4;
                        while (true) {
                            objArr2 = objArr5;
                            if (i10 < c5461.f18827 + c5461.f18828) {
                                byte b = c5461.f18826[i10];
                                c16516.write("0x");
                                c16516.m38838(b & 255);
                                c16516.write(116);
                                c16516.write(32);
                                i10++;
                                itM49666 = itM49666;
                                objArr5 = objArr2;
                                c5461 = c5461;
                            }
                        }
                        c16516.write(10);
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    c16516.m38835();
                    c16516.write(".end array_data");
                    c16516.write(10);
                    break;
                default:
                    objArr = objArr3;
                    break;
            }
            iMo12098 += c11108.mo12097(iMo12098);
            i5++;
            objArr3 = objArr;
        }
        if (Arrays.binarySearch(iArr, iMo12098) >= 0) {
            c16516.write("label_");
            c16516.write(String.valueOf(iMo12098));
            c16516.write(58);
            i = 10;
            c16516.write(10);
        } else {
            if (Arrays.binarySearch(iArrM32476, iMo12098) >= 0) {
                c16516.write(10);
                c16516.write("label_");
                c16516.write(String.valueOf(iMo12098));
                c16516.write(58);
                c16516.write(10);
            }
            i = 10;
        }
        if (Arrays.binarySearch(iArrM32477, iMo12098) >= 0) {
            c16516.write("switch_");
            c16516.write(String.valueOf(iMo12098));
            c16516.write(58);
            c16516.write(i);
        }
        C21234[] c21234Arr2 = c17706.f56221;
        if (c21234Arr2 == null || c21234Arr2.length <= 0) {
            return;
        }
        c16516.write(i);
        c16516.write(i);
        c16516.write("#Handler Exceptions");
        c16516.write(i);
        c16516.write(i);
        int length4 = c21234Arr2.length;
        int i11 = 0;
        while (i11 < length4) {
            C21234 c21235 = c21234Arr2[i11];
            int iM477010 = c21235.m47708();
            int iM477011 = c21235.m47709() + iM477010;
            C22646 c22647 = c21235.f69162;
            int iM50182 = c22647.m50181();
            if (iM50182 != -1) {
                c16516.write(".catch ");
                c16516.write(ProviderConfigurationPermission.ALL_STR);
                c16516.write(10);
                c16516.m38836();
                c16516.write("start : ");
                c16516.write("label_");
                c16516.m38837(iM477010);
                c16516.write(10);
                c16516.write("end : ");
                c16516.write("label_");
                c16516.m38837(iM477011);
                c16516.write(10);
                c16516.write("handler : ");
                c16516.write("label_");
                c16516.m38837(iM50182);
                c16516.write(10);
                c16516.m38835();
                c16516.write(".end catch");
                c16516.write(10);
                c16516.write(10);
            } else {
                C14885[] c14885Arr = c22647.f73782;
                int length5 = c14885Arr.length;
                int i12 = 0;
                while (i12 < length5) {
                    C14885 c14886 = c14885Arr[i12];
                    c16516.write(".catch ");
                    c16516.write(c14886.f48641.m6314());
                    c16516.write(10);
                    c16516.m38836();
                    c16516.write("start : ");
                    c16516.write("label_");
                    c16516.m38837(iM477010);
                    c16516.write(10);
                    c16516.write("end : ");
                    c16516.write("label_");
                    c16516.m38837(iM477011);
                    c16516.write(10);
                    c16516.write("handler : ");
                    c16516.write("label_");
                    c16516.m38837(c14886.m35582());
                    c16516.write(10);
                    c16516.m38835();
                    c16516.write(".end catch");
                    c16516.write(10);
                    c16516.write(10);
                    i12++;
                    length4 = length4;
                }
            }
            i11++;
            length4 = length4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15734(C16516 c16516, int i) {
        c16516.write(58);
        c16516.write("label_");
        c16516.write(String.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15735(C16516 c16516, AbstractC4300 abstractC4300) {
        AbstractC11357 abstractC11357 = (AbstractC11357) abstractC4300;
        int i = C16995.f54340[abstractC4300.f15468.f3348.ordinal()];
        if (i == 1) {
            c16516.write(((C18888) abstractC11357.m28439()).m43561());
            return;
        }
        if (i == 2) {
            c16516.write(((C20299) abstractC11357.m28439()).m45810());
            return;
        }
        if (i == 3) {
            c16516.write(((C1953) abstractC11357.m28439()).m6314());
            return;
        }
        if (i != 4) {
            return;
        }
        C14655 c14655 = (C14655) abstractC11357.m28439();
        c16516.write(34);
        String strM35176 = c14655.m35176();
        for (int i2 = 0; i2 < strM35176.length(); i2++) {
            char cCharAt = strM35176.charAt(i2);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    c16516.write(92);
                }
                c16516.write(cCharAt);
            } else if (cCharAt > 127) {
                c16516.write(cCharAt);
            } else if (cCharAt == '\t') {
                c16516.write("\\t");
            } else if (cCharAt == '\n') {
                c16516.write("\\n");
            } else if (cCharAt == '\r') {
                c16516.write("\\r");
            } else {
                c16516.write(cCharAt);
            }
        }
        c16516.write(34);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x0240  */
    /* JADX WARN: Code duplicated, block: B:266:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:268:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:270:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:378:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x08f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x08ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0911 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15740(String str, C12063 c12063) {
        String str2;
        C12063 c12064;
        String[] strArr;
        EnumC0772[] enumC0772Arr;
        HashMap map;
        C5357 c5357M50859;
        C17706 c17706;
        int i;
        ArrayList arrayList;
        String str3;
        int i2;
        int i3;
        int i4;
        AbstractC9011 abstractC9011M15737;
        char c;
        char[] charArray;
        int i5;
        boolean z;
        int i6;
        int i7;
        long j;
        int i8;
        long j2;
        ArrayList arrayList2;
        String str4;
        long j3;
        int iDigit;
        String str5;
        long j4;
        int i9;
        EnumC0772 enumC0772;
        byte b;
        HashMap map2;
        String str6;
        int iMo12097;
        boolean z2;
        int i10;
        byte b2;
        int i11;
        byte b3;
        byte b4;
        String str7;
        HashMap map3;
        int i12;
        String[] strArr2;
        int i13;
        byte b5;
        int iDigit2;
        int i14;
        byte b6;
        C5706 c5706 = this;
        C12063 c12065 = c12063;
        c5706.f19452 = -1;
        C17706 c17707 = c5706.f19453;
        if (c17707 == null) {
            return;
        }
        f19449 = 0;
        String[] strArrSplit = str.split("\n");
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap(1);
        EnumC0772[] enumC0772Arr2 = new EnumC0772[strArrSplit.length];
        ArrayList arrayList3 = new ArrayList(strArrSplit.length);
        ArrayList arrayList4 = new ArrayList(1);
        int length = strArrSplit.length;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            str2 = "string is null";
            if (i15 < length) {
                c5706.f19452 = i15;
                String strTrim = strArrSplit[i15].trim();
                int i17 = length;
                if (strTrim.equals("") || strTrim.startsWith("#") || strTrim.startsWith("//")) {
                    enumC0772Arr = enumC0772Arr2;
                    enumC0772Arr[i15] = null;
                } else {
                    if (strTrim.endsWith(":")) {
                        map4.put(C20630.m46498(1, 0, strTrim), Integer.valueOf(i16));
                        enumC0772Arr2[i15] = null;
                        enumC0772Arr = enumC0772Arr2;
                    } else {
                        c17707 = c17707;
                        String str8 = " ";
                        arrayList3 = arrayList3;
                        int iIndexOf = strTrim.indexOf(" ");
                        String strSubstring = iIndexOf != -1 ? strTrim.substring(0, iIndexOf) : strTrim.trim();
                        EnumC0772 enumC0772M3314 = EnumC0772.m3314(strSubstring);
                        if (enumC0772M3314 == null) {
                            strSubstring.getClass();
                            enumC0772Arr = enumC0772Arr2;
                            switch (strSubstring) {
                                case ".pswitch_data":
                                    b = 0;
                                    break;
                                case ".sswitch_data":
                                    b = 1;
                                    break;
                                case ".catch":
                                    b = 2;
                                    break;
                                case ".array_data":
                                    b = 3;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            String str9 = strSubstring;
                            String str10 = ".end";
                            switch (b) {
                                case 0:
                                    String str11 = ".end";
                                    int i18 = i16;
                                    c12065 = c12065;
                                    strArrSplit = strArrSplit;
                                    map4 = map4;
                                    map5 = map5;
                                    String strTrim2 = strArrSplit[i15 - 1].trim();
                                    int i19 = 1;
                                    int iIntValue = ((Integer) map5.get(strTrim2.substring(0, strTrim2.length() - 1))).intValue();
                                    C13119 c13119 = new C13119();
                                    while (true) {
                                        i15 += i19;
                                        String strTrim3 = strArrSplit[i15].trim();
                                        if (strTrim3.startsWith(str11)) {
                                            C23931 c23931 = new C23931(c13119.m32473(), c13119.m32472());
                                            iMo12097 = c23931.mo12097(i18) + i18;
                                            arrayList4.add(c23931);
                                        } else {
                                            String[] strArrSplit2 = strTrim3.split(":");
                                            String str12 = str11;
                                            if (strArrSplit2.length != 2) {
                                                throw new IllegalArgumentException("packed switch data error: ".concat(strTrim3));
                                            }
                                            try {
                                                c13119.m32474(Integer.parseInt(strArrSplit2[0].trim()), ((Integer) map4.get(strArrSplit2[1].trim())).intValue() - iIntValue);
                                                i19 = 1;
                                                str11 = str12;
                                            } catch (Exception unused) {
                                                throw new IllegalArgumentException("the key is not int or label is not exists: ".concat(strTrim3));
                                            }
                                        }
                                    }
                                    i9 = iMo12097;
                                    enumC0772 = enumC0772M3314;
                                    break;
                                case 1:
                                    String str13 = ".end";
                                    ArrayList arrayList5 = arrayList4;
                                    int i20 = i16;
                                    c12065 = c12065;
                                    strArrSplit = strArrSplit;
                                    map4 = map4;
                                    int i21 = 1;
                                    String strTrim4 = strArrSplit[i15 - 1].trim();
                                    map5 = map5;
                                    int iIntValue2 = ((Integer) map5.get(strTrim4.substring(0, strTrim4.length() - 1))).intValue();
                                    C13119 c131110 = new C13119();
                                    while (true) {
                                        i15 += i21;
                                        String strTrim5 = strArrSplit[i15].trim();
                                        String str14 = str13;
                                        if (strTrim5.startsWith(str14)) {
                                            C9820 c9820 = new C9820(c131110.m32476(), c131110.m32472());
                                            arrayList4 = arrayList5;
                                            arrayList4.add(c9820);
                                            int i22 = i20;
                                            iMo12097 = c9820.mo12097(i22) + i22;
                                        } else {
                                            int i23 = i20;
                                            ArrayList arrayList6 = arrayList5;
                                            String[] strArrSplit3 = strTrim5.split(":");
                                            if (strArrSplit3.length != 2) {
                                                throw new IllegalArgumentException("packed switch data error: ".concat(strTrim5));
                                            }
                                            try {
                                                c131110.m32474(Integer.parseInt(strArrSplit3[0].trim()), ((Integer) map4.get(strArrSplit3[1].trim())).intValue() - iIntValue2);
                                                i21 = 1;
                                                str13 = str14;
                                                arrayList5 = arrayList6;
                                                i20 = i23;
                                            } catch (Exception unused2) {
                                                throw new IllegalArgumentException("the key is not int or label is not exists: ".concat(strTrim5));
                                            }
                                        }
                                    }
                                    i9 = iMo12097;
                                    enumC0772 = enumC0772M3314;
                                    break;
                                case 2:
                                    String str15 = " ";
                                    HashMap map6 = map4;
                                    ArrayList arrayList7 = arrayList4;
                                    C22997 c22997 = new C22997();
                                    strArr = strArrSplit;
                                    while (i15 < strArr.length) {
                                        String strTrim6 = strArr[i15].trim();
                                        if (strTrim6.startsWith(".catch")) {
                                            str6 = str15;
                                            String[] strArrSplit4 = strTrim6.split(str6);
                                            if (strArrSplit4.length < 2) {
                                                throw new IllegalArgumentException("no exception type : " + strArr[i15]);
                                            }
                                            String strTrim7 = strArrSplit4[1].trim();
                                            map2 = map6;
                                            int iIntValue3 = ((Integer) map2.get(strArr[i15 + 1].trim().split(":")[1].trim())).intValue();
                                            int iIntValue4 = ((Integer) map2.get(strArr[i15 + 2].trim().split(":")[1].trim())).intValue();
                                            i15 += 3;
                                            int iIntValue5 = ((Integer) map2.get(strArr[i15].trim().split(":")[1].trim())).intValue();
                                            if (strTrim7.equals(ProviderConfigurationPermission.ALL_STR)) {
                                                c22997.m50861(iIntValue3, iIntValue4, iIntValue5);
                                            } else {
                                                c22997.m50862(C1953.m6312(strTrim7, c12063), iIntValue3, iIntValue4, iIntValue5);
                                            }
                                        } else {
                                            map2 = map6;
                                            str6 = str15;
                                        }
                                        i15++;
                                        str15 = str6;
                                        map6 = map2;
                                    }
                                    c12064 = c12063;
                                    map = map6;
                                    c5357M50859 = c22997.m50859();
                                    arrayList4 = arrayList7;
                                    break;
                                case 3:
                                    String[] strArrSplit5 = strArrSplit[i15].trim().split(" ");
                                    if (strArrSplit5.length < 2) {
                                        throw new IllegalArgumentException("unknow element Width: " + strArrSplit[i15]);
                                    }
                                    int iM16202 = C5932.m16202(strArrSplit5[1]);
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (true) {
                                        i15++;
                                        String strTrim8 = strArrSplit[i15].trim();
                                        if (strTrim8.startsWith(str10)) {
                                            C22395 c22395 = new C22395(iM16202, byteArrayOutputStream.toByteArray());
                                            arrayList4.add(c22395);
                                            iMo12097 = c22395.mo12097(i16) + i16;
                                            c12065 = c12065;
                                            strArrSplit = strArrSplit;
                                            map4 = map4;
                                            map5 = map5;
                                        } else {
                                            String[] strArrSplit6 = strTrim8.split(str8);
                                            if (strArrSplit6.length != iM16202) {
                                                throw new IllegalArgumentException("encodeValues width:" + strArrSplit6.length + " does not match : " + iM16202);
                                            }
                                            int length2 = strArrSplit6.length;
                                            int i24 = 0;
                                            while (i24 < length2) {
                                                int i25 = length2;
                                                String strTrim9 = strArrSplit6[i24].trim();
                                                if (strTrim9 == null) {
                                                    throw new NumberFormatException("string is null");
                                                }
                                                if (strTrim9.length() == 0) {
                                                    throw new NumberFormatException("string is blank");
                                                }
                                                int i26 = i16;
                                                ArrayList arrayList8 = arrayList4;
                                                char[] charArray2 = strTrim9.toUpperCase().endsWith("T") ? strTrim9.substring(0, strTrim9.length() - 1).toCharArray() : strTrim9.toCharArray();
                                                String str16 = str10;
                                                if (charArray2[0] == '-') {
                                                    z2 = true;
                                                    i10 = 1;
                                                } else {
                                                    z2 = false;
                                                    i10 = 0;
                                                }
                                                HashMap map7 = map5;
                                                if (charArray2[i10] == '0') {
                                                    int i27 = i10 + 1;
                                                    if (i27 != charArray2.length) {
                                                        char c2 = charArray2[i27];
                                                        i11 = i27;
                                                        if (c2 == 'x' || c2 == 'X') {
                                                            i11 = i10 + 2;
                                                            b2 = 16;
                                                        } else if (Character.digit(c2, 8) >= 0) {
                                                            b2 = 8;
                                                        } else {
                                                            i10 = i11;
                                                            b2 = 10;
                                                            i11 = i10;
                                                        }
                                                        b3 = (byte) (127 / (b2 / 2));
                                                        b4 = 0;
                                                        str7 = str8;
                                                        map3 = map4;
                                                        i12 = i11;
                                                        while (true) {
                                                            strArr2 = strArrSplit;
                                                            if (i12 < charArray2.length) {
                                                                i13 = iM16202;
                                                                if (!z2) {
                                                                    b5 = b4;
                                                                } else {
                                                                    b5 = b4;
                                                                }
                                                            }
                                                            iDigit2 = Character.digit(charArray2[i12], (int) b2);
                                                            if (iDigit2 >= 0) {
                                                                throw new NumberFormatException("The string contains invalid an digit - '" + charArray2[i12] + "'");
                                                            }
                                                            i14 = iM16202;
                                                            b6 = (byte) (b4 * b2);
                                                            if (b4 <= b3) {
                                                                throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                            }
                                                            if (b6 >= 0) {
                                                            }
                                                            b4 = (byte) (b6 + iDigit2);
                                                            i12++;
                                                            iM16202 = i14;
                                                            strArrSplit = strArr2;
                                                        }
                                                    } else {
                                                        b5 = 0;
                                                        i13 = iM16202;
                                                        str7 = str8;
                                                        strArr2 = strArrSplit;
                                                        map3 = map4;
                                                    }
                                                } else {
                                                    b2 = 10;
                                                    i11 = i10;
                                                    b3 = (byte) (127 / (b2 / 2));
                                                    b4 = 0;
                                                    str7 = str8;
                                                    map3 = map4;
                                                    i12 = i11;
                                                    while (true) {
                                                        strArr2 = strArrSplit;
                                                        if (i12 < charArray2.length) {
                                                            i13 = iM16202;
                                                            if (!z2 && b4 != -128) {
                                                                if (b4 < 0) {
                                                                    throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                                }
                                                                b5 = (byte) (b4 * (-1));
                                                            }
                                                            b5 = b4;
                                                        }
                                                        iDigit2 = Character.digit(charArray2[i12], (int) b2);
                                                        if (iDigit2 >= 0) {
                                                            throw new NumberFormatException("The string contains invalid an digit - '" + charArray2[i12] + "'");
                                                        }
                                                        i14 = iM16202;
                                                        b6 = (byte) (b4 * b2);
                                                        if (b4 <= b3) {
                                                            throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                        }
                                                        if (b6 >= 0 && b6 >= (-iDigit2)) {
                                                            throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                        }
                                                        b4 = (byte) (b6 + iDigit2);
                                                        i12++;
                                                        iM16202 = i14;
                                                        strArrSplit = strArr2;
                                                    }
                                                }
                                                byteArrayOutputStream.write(b5);
                                                i24++;
                                                iM16202 = i13;
                                                length2 = i25;
                                                i16 = i26;
                                                arrayList4 = arrayList8;
                                                str10 = str16;
                                                map5 = map7;
                                                map4 = map3;
                                                str8 = str7;
                                                strArrSplit = strArr2;
                                                break;
                                            }
                                            i15 = i15;
                                            c12065 = c12063;
                                        }
                                    }
                                    i9 = iMo12097;
                                    enumC0772 = enumC0772M3314;
                                    break;
                                    break;
                                default:
                                    throw new IllegalArgumentException("unknow opcodeName: ".concat(str9));
                            }
                        } else {
                            enumC0772Arr = enumC0772Arr2;
                            int i28 = i16;
                            c12065 = c12065;
                            strArrSplit = strArrSplit;
                            map4 = map4;
                            map5 = map5;
                            int i29 = C16995.f54341[enumC0772M3314.ordinal()];
                            if (i29 == 1 || i29 == 2) {
                                String[] strArrSplit7 = strTrim.split(":");
                                if (strArrSplit7.length != 2) {
                                    throw new IllegalArgumentException(" opcode offset error: ".concat(strTrim));
                                }
                                map5.put(strArrSplit7[1].trim(), Integer.valueOf(i28));
                            }
                            enumC0772 = enumC0772M3314;
                            i9 = (enumC0772.f3349.f5390 / 2) + i28;
                        }
                        enumC0772Arr[i15] = enumC0772;
                    }
                    i15++;
                    c5706 = this;
                    strArrSplit = strArrSplit;
                    map5 = map5;
                    map4 = map4;
                    c12065 = c12065;
                    length = i17;
                    enumC0772Arr2 = enumC0772Arr;
                    arrayList3 = arrayList3;
                    i16 = i9;
                    c17707 = c17707;
                }
                i9 = i16;
                i15++;
                c5706 = this;
                strArrSplit = strArrSplit;
                map5 = map5;
                map4 = map4;
                c12065 = c12065;
                length = i17;
                enumC0772Arr2 = enumC0772Arr;
                arrayList3 = arrayList3;
                i16 = i9;
                c17707 = c17707;
            } else {
                c12064 = c12065;
                c17707 = c17707;
                strArr = strArrSplit;
                enumC0772Arr = enumC0772Arr2;
                arrayList3 = arrayList3;
                map = map4;
                c5357M50859 = null;
            }
        }
        int i30 = 0;
        int i31 = 0;
        for (int length3 = strArr.length; i31 < length3; length3 = length3) {
            this.f19452 = i31;
            String strTrim10 = strArr[i31].trim();
            EnumC0772 enumC0773 = enumC0772Arr[i31];
            if (enumC0773 != null) {
                int i32 = C16995.f54339[enumC0773.f3349.ordinal()];
                Pattern pattern = f19450;
                switch (i32) {
                    case 1:
                        strArr = strArr;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C4049(enumC0773, (byte) m15732(i3, strTrim10, map)));
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 2:
                        strArr = strArr;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C10401(enumC0773, (short) (m15732(i3, strTrim10, map) & 65535)));
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 3:
                        strArr = strArr;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C17456(enumC0773, (short) m15738(strTrim10), (short) (m15732(i3, strTrim10, map) & 65535)));
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 4:
                        strArr = strArr;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        Matcher matcher = pattern.matcher(strTrim10);
                        matcher.find();
                        byte b7 = (byte) Integer.parseInt(matcher.group().substring(1));
                        matcher.find();
                        arrayList.add(new C11937(enumC0773, b7, (byte) Integer.parseInt(matcher.group().substring(1)), (short) (m15732(i3, strTrim10, map) & 65535)));
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 5:
                        strArr = strArr;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C4174(enumC0773, m15732(i3, strTrim10, map)));
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 6:
                        strArr = strArr;
                        int i33 = i30;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        str3 = str2;
                        arrayList = arrayList3;
                        i3 = i33;
                        arrayList.add(new C18992(enumC0773, (short) m15738(strTrim10), m15732(i3, strTrim10, map)));
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 7:
                    case 8:
                    case 26:
                    default:
                        strArr = strArr;
                        c5357M50859 = c5357M50859;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 9:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C23101(enumC0773));
                        i3 = i4;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 10:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C18867(enumC0773, (short) m15738(strTrim10)));
                        i3 = i4;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 11:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C21689(enumC0773, (byte) m15738(strTrim10), (byte) m15733(strTrim10)));
                        i3 = i4;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 12:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        str3 = str2;
                        arrayList = arrayList3;
                        Matcher matcher2 = pattern.matcher(strTrim10);
                        matcher2.find();
                        byte b8 = (byte) Integer.parseInt(matcher2.group().substring(1));
                        matcher2.find();
                        arrayList.add(new C19573(enumC0773, b8, (byte) Integer.parseInt(matcher2.group().substring(1))));
                        i3 = i4;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 13:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        c12064 = c12064;
                        str3 = str2;
                        arrayList = arrayList3;
                        short sM15738 = (short) m15738(strTrim10);
                        int i34 = C16995.f54340[enumC0773.f3348.ordinal()];
                        if (i34 == 1) {
                            try {
                                abstractC9011M15737 = m15737(strTrim10, c12064);
                            } catch (Exception unused3) {
                                throw new Exception(C0252.m1693("FieldIdItem error: ", strTrim10));
                            }
                        } else if (i34 == 3) {
                            try {
                                abstractC9011M15737 = m15736(strTrim10, c12064);
                            } catch (Exception unused4) {
                                throw new Exception(C0252.m1693("TypeIdItem error: ", strTrim10));
                            }
                        } else if (i34 != 4) {
                            abstractC9011M15737 = null;
                        } else {
                            try {
                                abstractC9011M15737 = C14655.m35175(C16845.m39508(strTrim10.substring(strTrim10.indexOf("\"") + 1, strTrim10.lastIndexOf("\""))), c12064);
                            } catch (Exception unused5) {
                                throw new Exception(C0252.m1693("String error: ", strTrim10));
                            }
                        }
                        arrayList.add(new C20984(enumC0773, sM15738, abstractC9011M15737));
                        i3 = i4;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 14:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c5357M50859 = c5357M50859;
                        arrayList4 = arrayList4;
                        str3 = str2;
                        arrayList = arrayList3;
                        c12064 = c12063;
                        arrayList.add(new C23226(enumC0773, (short) m15738(strTrim10), C14655.m35175(C16845.m39508(strTrim10.substring(strTrim10.indexOf("\"") + 1, strTrim10.lastIndexOf("\""))), c12064)));
                        i3 = i4;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 15:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C20279(enumC0773, (short) m15738(strTrim10), (short) (m15733(strTrim10) & 65535)));
                        c12064 = c12063;
                        i3 = i4;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 16:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C16751(enumC0773, (short) m15738(strTrim10), (short) (m15733(strTrim10) & 65535)));
                        c12064 = c12063;
                        i3 = i4;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 17:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C21814(enumC0773, (byte) m15738(strTrim10), m15733(strTrim10)));
                        c12064 = c12063;
                        i3 = i4;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 18:
                        ArrayList arrayList9 = arrayList3;
                        short sM15739 = (short) m15738(strTrim10);
                        Matcher matcher3 = f19451.matcher(strTrim10);
                        if (!matcher3.find()) {
                            throw new Exception(C0252.m1693("long exception: ", strTrim10));
                        }
                        String strTrim11 = matcher3.group().trim();
                        if (strTrim11 == null) {
                            throw new NumberFormatException(str2);
                        }
                        if (strTrim11.length() == 0) {
                            throw new NumberFormatException("string is blank");
                        }
                        if (strTrim11.toUpperCase().endsWith("L")) {
                            c = 0;
                            charArray = strTrim11.substring(0, strTrim11.length() - 1).toCharArray();
                        } else {
                            c = 0;
                            charArray = strTrim11.toCharArray();
                        }
                        if (charArray[c] == '-') {
                            i5 = 1;
                            z = true;
                        } else {
                            i5 = 0;
                            z = false;
                        }
                        long j5 = 0;
                        if (charArray[i5] != '0') {
                            i6 = 10;
                            i7 = i5;
                            j = C17492.FOREVER_NS / ((long) (i6 / 2));
                            i8 = i7;
                            j2 = 0;
                            while (true) {
                                i31 = i31;
                                if (i8 < charArray.length) {
                                    iDigit = Character.digit(charArray[i8], i6);
                                    if (iDigit >= 0) {
                                        throw new NumberFormatException("The string contains an invalid digit - '" + charArray[i8] + "'");
                                    }
                                    str5 = str2;
                                    j4 = ((long) i6) * j2;
                                    if (j2 <= j) {
                                        throw new NumberFormatException(strTrim11.concat(" cannot fit into a long"));
                                    }
                                    if (j4 < 0 && j4 >= (-iDigit)) {
                                        throw new NumberFormatException(strTrim11.concat(" cannot fit into a long"));
                                    }
                                    j2 = j4 + ((long) iDigit);
                                    i8++;
                                    i31 = i31;
                                    str2 = str5;
                                    i6 = i6;
                                    i30 = i30;
                                    arrayList9 = arrayList9;
                                } else {
                                    arrayList2 = arrayList9;
                                    i4 = i30;
                                    str4 = str2;
                                    if (z || j2 == Long.MIN_VALUE) {
                                        j3 = j2;
                                    } else {
                                        if (j2 < 0) {
                                            throw new NumberFormatException(strTrim11.concat(" cannot fit into a long"));
                                        }
                                        j5 = j2 * (-1);
                                    }
                                }
                            }
                            C11231 c11231 = new C11231(enumC0773, sM15739, j3);
                            arrayList = arrayList2;
                            arrayList.add(c11231);
                            str3 = str4;
                            c12064 = c12063;
                            i3 = i4;
                            i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        } else {
                            int i35 = i5 + 1;
                            if (i35 != charArray.length) {
                                char c3 = charArray[i35];
                                i7 = i35;
                                if (c3 == 'x' || c3 == 'X') {
                                    i7 = i5 + 2;
                                    i6 = 16;
                                } else if (Character.digit(c3, 8) >= 0) {
                                    i6 = 8;
                                } else {
                                    i5 = i7;
                                    i6 = 10;
                                    i7 = i5;
                                }
                                j = C17492.FOREVER_NS / ((long) (i6 / 2));
                                i8 = i7;
                                j2 = 0;
                                while (true) {
                                    i31 = i31;
                                    if (i8 < charArray.length) {
                                        iDigit = Character.digit(charArray[i8], i6);
                                        if (iDigit >= 0) {
                                            throw new NumberFormatException("The string contains an invalid digit - '" + charArray[i8] + "'");
                                        }
                                        str5 = str2;
                                        j4 = ((long) i6) * j2;
                                        if (j2 <= j) {
                                            throw new NumberFormatException(strTrim11.concat(" cannot fit into a long"));
                                        }
                                        if (j4 < 0) {
                                            throw new NumberFormatException(strTrim11.concat(" cannot fit into a long"));
                                        }
                                        j2 = j4 + ((long) iDigit);
                                        i8++;
                                        i31 = i31;
                                        str2 = str5;
                                        i6 = i6;
                                        i30 = i30;
                                        arrayList9 = arrayList9;
                                    } else {
                                        arrayList2 = arrayList9;
                                        i4 = i30;
                                        str4 = str2;
                                        if (z) {
                                        }
                                        j3 = j2;
                                    }
                                }
                                C11231 c11232 = new C11231(enumC0773, sM15739, j3);
                                arrayList = arrayList2;
                                arrayList.add(c11232);
                                str3 = str4;
                                c12064 = c12063;
                                i3 = i4;
                                i2 = (enumC0773.f3349.f5390 / 2) + i3;
                            } else {
                                arrayList2 = arrayList9;
                                i4 = i30;
                                i31 = i31;
                                str4 = str2;
                            }
                        }
                        j3 = j5;
                        C11231 c11233 = new C11231(enumC0773, sM15739, j3);
                        arrayList = arrayList2;
                        arrayList.add(c11233);
                        str3 = str4;
                        c12064 = c12063;
                        i3 = i4;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                        break;
                    case 19:
                        arrayList = arrayList3;
                        Matcher matcher4 = pattern.matcher(strTrim10);
                        matcher4.find();
                        short s = (short) (Integer.parseInt(matcher4.group().substring(1)) & 65535);
                        matcher4.find();
                        arrayList.add(new C5586(enumC0773, s, Integer.parseInt(matcher4.group().substring(1)) & 65535));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 20:
                        arrayList = arrayList3;
                        Matcher matcher5 = pattern.matcher(strTrim10);
                        matcher5.find();
                        short s2 = (short) Integer.parseInt(matcher5.group().substring(1));
                        matcher5.find();
                        arrayList.add(new C11107(enumC0773, s2, (short) Integer.parseInt(matcher5.group().substring(1)), (byte) (m15733(strTrim10) & 255)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 21:
                        arrayList = arrayList3;
                        Matcher matcher6 = pattern.matcher(strTrim10);
                        matcher6.find();
                        byte b9 = (byte) Integer.parseInt(matcher6.group().substring(1));
                        matcher6.find();
                        byte b10 = (byte) Integer.parseInt(matcher6.group().substring(1));
                        int i36 = C16995.f54340[enumC0773.f3348.ordinal()];
                        arrayList.add(new C14635(enumC0773, b9, b10, i36 != 1 ? i36 != 3 ? null : m15736(strTrim10, c12064) : m15737(strTrim10, c12064)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 22:
                        arrayList = arrayList3;
                        Matcher matcher7 = pattern.matcher(strTrim10);
                        matcher7.find();
                        byte b11 = (byte) Integer.parseInt(matcher7.group().substring(1));
                        matcher7.find();
                        arrayList.add(new C4880(enumC0773, b11, (byte) Integer.parseInt(matcher7.group().substring(1)), (short) (m15733(strTrim10) & 65535)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 23:
                        arrayList = arrayList3;
                        Matcher matcher8 = pattern.matcher(strTrim10);
                        matcher8.find();
                        short s3 = (short) Integer.parseInt(matcher8.group().substring(1));
                        matcher8.find();
                        short s4 = (short) Integer.parseInt(matcher8.group().substring(1));
                        matcher8.find();
                        arrayList.add(new C1352(enumC0773, s3, s4, (short) Integer.parseInt(matcher8.group().substring(1))));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 24:
                        arrayList = arrayList3;
                        Matcher matcher9 = pattern.matcher(strTrim10);
                        matcher9.find();
                        int i37 = Integer.parseInt(matcher9.group().substring(1));
                        matcher9.find();
                        arrayList.add(new C19698(enumC0773, i37, Integer.parseInt(matcher9.group().substring(1))));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                    case 25:
                        arrayList = arrayList3;
                        byte[] bArr = new byte[5];
                        Arrays.fill(bArr, (byte) 0);
                        int i38 = 0;
                        for (Matcher matcher10 = pattern.matcher(strTrim10.substring(strTrim10.indexOf(123) + 1, strTrim10.indexOf(q.h))); matcher10.find() && i38 < 5; matcher10 = matcher10) {
                            bArr[i38] = (byte) Integer.parseInt(matcher10.group().substring(1));
                            i38++;
                        }
                        int[] iArr = {i38};
                        f19449 = Math.max(f19449, i38);
                        int i39 = C16995.f54340[enumC0773.f3348.ordinal()];
                        AbstractC9011 abstractC9011M15736 = i39 != 2 ? i39 != 3 ? null : m15736(strTrim10, c12064) : m15731(strTrim10, c12064);
                        try {
                            arrayList.add(new C10526(enumC0773, iArr[0], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], abstractC9011M15736));
                            i3 = i30;
                            str3 = str2;
                            i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        } catch (Exception unused6) {
                            throw new RuntimeException(strTrim10 + EnumC19730.f63352 + abstractC9011M15736 + EnumC19730.f63352 + iArr[0]);
                        }
                        break;
                    case 27:
                        int[] iArr2 = new int[2];
                        Matcher matcher11 = pattern.matcher(strTrim10.substring(strTrim10.indexOf(123) + 1, strTrim10.indexOf(q.h)));
                        matcher11.find();
                        iArr2[1] = Integer.parseInt(matcher11.group().substring(1));
                        int i40 = 0;
                        while (matcher11.find()) {
                            i40 = Integer.parseInt(matcher11.group().substring(1));
                        }
                        int i41 = (i40 - iArr2[1]) + 1;
                        iArr2[0] = i41;
                        f19449 = Math.max(f19449, i41);
                        int i42 = C16995.f54340[enumC0773.f3348.ordinal()];
                        arrayList = arrayList3;
                        arrayList.add(new C16875(enumC0773, (short) iArr2[0], iArr2[1], i42 != 2 ? i42 != 3 ? null : m15736(strTrim10, c12064) : m15731(strTrim10, c12064)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC0773.f3349.f5390 / 2) + i3;
                        break;
                }
            } else {
                strArr = strArr;
                i31 = i31;
                c5357M50859 = c5357M50859;
                arrayList4 = arrayList4;
                c12064 = c12064;
                arrayList = arrayList3;
                int i43 = i30;
                str3 = str2;
                i2 = i43;
            }
            i31++;
            arrayList3 = arrayList;
            str2 = str3;
            c12064 = c12064;
            arrayList4 = arrayList4;
            strArr = strArr;
            c5357M50859 = c5357M50859;
            i30 = i2;
        }
        C5357 c5357 = c5357M50859;
        ArrayList arrayList10 = arrayList3;
        this.f19452 = -1;
        arrayList10.addAll(arrayList4);
        AbstractC4300[] abstractC4300Arr = new AbstractC4300[arrayList10.size()];
        arrayList10.toArray(abstractC4300Arr);
        if (c5357 != null) {
            List list = (List) c5357.f18504;
            List list2 = (List) c5357.f18505;
            if (list.size() > 0) {
                C21234[] c21234Arr = new C21234[list.size()];
                C22646[] c22646Arr = new C22646[list2.size()];
                list.toArray(c21234Arr);
                list2.toArray(c22646Arr);
                c17706 = c17707;
                c17706.f56221 = c21234Arr;
                c17706.f56224 = c22646Arr;
            } else {
                c17706 = c17707;
            }
        } else {
            c17706 = c17707;
            c17706.f56221 = null;
            c17706.f56224 = null;
        }
        C9841 parent = c17706.getParent();
        C9716 c9716 = parent.f33621.f65772.f55610;
        if (c9716 == null) {
            i = 0;
        } else {
            int iM6313 = 0;
            for (C1953 c1953 : c9716.f32710) {
                iM6313 += c1953.m6313();
            }
            i = iM6313;
        }
        if ((parent.f33622 & EnumC3364.STATIC.getValue()) == 0) {
            i++;
        }
        c17706.f56227 = i;
        c17706.f56223 = f19449;
        c17706.f56222 = abstractC4300Arr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C18888 m15737(String str, C12063 c12063) {
        String[] strArrSplit = f19447.split(str);
        int length = strArrSplit.length;
        int i = length - 1;
        if (i < 2) {
            throw new RuntimeException(C0252.m1693("FieldIdItem error: ", str));
        }
        return C18888.m43560(c12063, C1953.m6312(strArrSplit[length - 3], c12063), C1953.m6312(strArrSplit[i], c12063), C14655.m35175(strArrSplit[length - 2], c12063));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C20299 m15731(String str, C12063 c12063) {
        String[] strArrSplit = f19446.split(str);
        int length = strArrSplit.length;
        int i = length - 1;
        if (i < 3) {
            throw new RuntimeException("MethodIdItem error: ".concat(str));
        }
        return C20299.m45809(c12063, C1953.m6312(strArrSplit[length - 4], c12063), C17476.m40671(c12063, C1953.m6312(strArrSplit[i], c12063), m15739(strArrSplit[length - 2], c12063)), C14655.m35175(strArrSplit[length - 3], c12063));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C1953 m15736(String str, C12063 c12063) {
        String strTrim = str.trim();
        return C1953.m6312(strTrim.substring(strTrim.lastIndexOf(" ") + 1), c12063);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15733(String str) throws Exception {
        Matcher matcher = f19448.matcher(str);
        if (matcher.find()) {
            return C5932.m16202(matcher.group().trim());
        }
        throw new Exception(C0252.m1693("int exception: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15732(int i, String str, HashMap map) {
        try {
            return ((Integer) map.get(str.split(":")[1].trim())).intValue() - i;
        } catch (Exception unused) {
            throw new IllegalArgumentException(C0252.m1693("unfound label offset: ", str));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m15738(String str) throws Exception {
        Matcher matcher = f19450.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group().substring(1));
        }
        throw new Exception(C0252.m1693("register exception: ", str));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9716 m15739(String str, C12063 c12063) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == 'F') {
                i = i2 + 1;
                arrayList.add(C1953.m6312(str.substring(i2, i), c12063));
            } else if (cCharAt == 'L') {
                int i3 = i2;
                while (true) {
                    int i4 = i3 + 1;
                    if (str.charAt(i4) != ';') {
                        i3 = i4;
                    } else {
                        i = i3 + 2;
                        arrayList.add(C1953.m6312(str.substring(i2, i), c12063));
                    }
                }
            } else if (cCharAt == 'S' || cCharAt == 'I' || cCharAt == 'J' || cCharAt == 'Z') {
                i = i2 + 1;
                arrayList.add(C1953.m6312(str.substring(i2, i), c12063));
            } else if (cCharAt != '[') {
                switch (cCharAt) {
                    case 'B':
                    case 'C':
                    case 'D':
                        i = i2 + 1;
                        arrayList.add(C1953.m6312(str.substring(i2, i), c12063));
                        break;
                    default:
                        throw new RuntimeException(C0242.m1616(i2, str, new StringBuilder("Invalid type ")));
                }
            } else {
                int i5 = i2;
                while (true) {
                    int i6 = i5 + 1;
                    if (str.charAt(i6) == '[') {
                        i5 = i6;
                    } else {
                        i = i5 + 2;
                        if (str.charAt(i6) == 'L') {
                            while (true) {
                                int i7 = i + 1;
                                if (str.charAt(i) != ';') {
                                    i = i7;
                                } else {
                                    i = i7;
                                }
                            }
                        }
                        arrayList.add(C1953.m6312(str.substring(i2, i), c12063));
                    }
                }
            }
            i2 = i;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return C9716.m24672(c12063, arrayList);
    }
}
