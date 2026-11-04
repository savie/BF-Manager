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
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ܿܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes4.dex */
public final class C18481 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f60148;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f60153;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7033 f60154;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f60147 = Pattern.compile("v\\d+");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f60151 = Pattern.compile("\\s([+,-])?0[x,X]([0-9a-fA-F])+|\\s([+,-])?\\d+");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f60150 = Pattern.compile("\\s([+,-])?0[x,X]([0-9a-fA-F])+([l,L])?|\\s([+,-])?\\d+([l,L])?");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f60152 = Pattern.compile("\\s|:|->");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f60149 = Pattern.compile("\\s|\\(|\\)|->");

    public C18481(C7033 c7033) {
        this.f60154 = c7033;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43068(C5890 c5890) {
        int[] iArrM43969;
        int i;
        Object[] objArr;
        Object[] objArr2;
        C7033 c7033 = this.f60154;
        if (c7033 == null) {
            return;
        }
        AbstractC24188[] abstractC24188Arr = c7033.f23208;
        int[] iArr = new int[abstractC24188Arr.length];
        Arrays.fill(iArr, -1);
        C18944 c18944 = new C18944(1);
        HashMap map = new HashMap();
        int length = abstractC24188Arr.length;
        int iMo2082 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            C9775 c9775 = abstractC24188Arr[i2];
            switch (C21465.f68566[c9775.mo2083().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    iArr[i2] = c9775.mo2015() + iMo2082;
                    int i3 = C21465.f68568[c9775.f78334.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        map.put(Integer.valueOf(iArr[i2]), Integer.valueOf(iMo2082));
                    }
                    break;
                case 7:
                case 8:
                    int iIntValue = ((Integer) map.get(Integer.valueOf(iMo2082))).intValue();
                    for (int i4 : ((InterfaceC18220) c9775).mo30629()) {
                        c18944.m43967(iIntValue + i4, 0);
                    }
                    break;
            }
            iMo2082 += c9775.mo2082(iMo2082);
        }
        Arrays.sort(iArr);
        int[] iArrM439610 = {-1};
        if (c18944.m43968() > 0) {
            iArrM439610 = c18944.m43969();
        }
        Arrays.sort(iArrM439610);
        C8524[] c8524Arr = c7033.f23206;
        if (c8524Arr != null && c8524Arr.length > 0) {
            C18944 c18945 = new C18944(3);
            for (C8524 c8524 : c8524Arr) {
                int iM22837 = c8524.m22837();
                int iM22838 = c8524.m22838() + iM22837;
                c18945.m43967(iM22837, 0);
                c18945.m43967(iM22838, 0);
                C9269 c9269 = c8524.f27851;
                int iM24459 = c9269.m24459();
                if (iM24459 != -1) {
                    c18945.m43967(iM24459, 0);
                } else {
                    for (C2558 c2558 : c9269.f30150) {
                        c18945.m43967(c2558.m8593(), 0);
                    }
                }
            }
            iArrM43969 = c18945.m43969();
        } else {
            iArrM43969 = new int[]{-1};
        }
        Arrays.sort(iArrM43969);
        int length2 = abstractC24188Arr.length;
        int i5 = 0;
        int iMo2083 = 0;
        Object[] objArr3 = abstractC24188Arr;
        while (i5 < length2) {
            C9775 c9776 = objArr3[i5];
            if (Arrays.binarySearch(iArr, iMo2083) >= 0 || Arrays.binarySearch(iArrM43969, iMo2083) >= 0) {
                c5890.write("label_");
                c5890.write(String.valueOf(iMo2083));
                c5890.write(58);
                c5890.write(10);
            }
            if (Arrays.binarySearch(iArrM439610, iMo2083) >= 0) {
                c5890.write("switch_");
                c5890.m17115(iMo2083);
                c5890.write(58);
                c5890.write(10);
            }
            int[] iArr2 = C21465.f68566;
            EnumC7801 enumC7801Mo2083 = c9776.mo2083();
            EnumC7779 enumC7779 = c9776.f78334;
            switch (iArr2[enumC7801Mo2083.ordinal()]) {
                case 1:
                    objArr = objArr3;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    m43060(c5890, ((C10037) c9776).mo2015() + iMo2083);
                    c5890.write(10);
                    break;
                case 2:
                case 5:
                    objArr = objArr3;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    m43060(c5890, c9776.mo2015() + iMo2083);
                    c5890.write(10);
                    break;
                case 3:
                    objArr = objArr3;
                    C16488 c16488 = (C16488) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c16488.mo9996());
                    c5890.write(32);
                    m43060(c5890, c16488.mo2015() + iMo2083);
                    c5890.write(10);
                    break;
                case 4:
                    objArr = objArr3;
                    C14250 c14250 = (C14250) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c14250.mo9996());
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c14250.m34591());
                    c5890.write(32);
                    m43060(c5890, c14250.mo2015() + iMo2083);
                    c5890.write(10);
                    break;
                case 6:
                    objArr = objArr3;
                    C13505 c13505 = (C13505) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c13505.mo9996());
                    c5890.write(32);
                    m43060(c5890, c13505.mo2015() + iMo2083);
                    c5890.write(10);
                    break;
                case 7:
                    objArr = objArr3;
                    C23442 c23442 = (C23442) c9776;
                    c5890.write(".pswitch_data ");
                    int iM52659 = c23442.m52659();
                    c5890.m17115(iM52659);
                    c5890.write(10);
                    c5890.m17114();
                    int iIntValue2 = ((Integer) map.get(Integer.valueOf(iMo2083))).intValue();
                    int[] iArrMo30629 = c23442.mo30629();
                    int length3 = iArrMo30629.length;
                    int i6 = 0;
                    while (i6 < length3) {
                        int i7 = iArrMo30629[i6] + iIntValue2;
                        c5890.write(String.valueOf(iM52659));
                        c5890.write(" : switch_");
                        c5890.write(String.valueOf(i7));
                        c5890.write(10);
                        i6++;
                        iM52659++;
                    }
                    c5890.m17113();
                    c5890.write(".end pswitch_data");
                    c5890.write(10);
                    break;
                case 8:
                    objArr = objArr3;
                    c5890.write(".sswitch_data");
                    c5890.write(10);
                    int iIntValue3 = ((Integer) map.get(Integer.valueOf(iMo2083))).intValue();
                    Iterator itM30630 = ((C12253) c9776).m30630();
                    c5890.m17114();
                    while (itM30630.hasNext()) {
                        C20458 c20458 = (C20458) itM30630.next();
                        int i8 = c20458.f65550;
                        int i9 = c20458.f65551 + iIntValue3;
                        c5890.write(String.valueOf(i8));
                        c5890.write(" : switch_");
                        c5890.write(String.valueOf(i9));
                        c5890.write(10);
                    }
                    c5890.m17113();
                    c5890.write(".end sswitch_data");
                    c5890.write(10);
                    break;
                case 9:
                    objArr = objArr3;
                    if (enumC7779 != EnumC7779.f25668) {
                        c5890.write(enumC7779.f25846);
                        c5890.write(10);
                    }
                    break;
                case 10:
                    objArr = objArr3;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(((C13766) c9776).mo9996());
                    c5890.write(10);
                    break;
                case 11:
                    objArr = objArr3;
                    C8546 c8546 = (C8546) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c8546.mo9996());
                    c5890.write(32);
                    c5890.write(String.valueOf(c8546.mo15898()));
                    c5890.write(32);
                    c5890.write(10);
                    break;
                case 12:
                    objArr = objArr3;
                    C21710 c21710 = (C21710) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c21710.mo9996());
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c21710.m49280());
                    c5890.write(10);
                    break;
                case 13:
                case 14:
                    objArr = objArr3;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(((InterfaceC10015) c9776).mo9996());
                    c5890.write(32);
                    m43061(c5890, c9776);
                    c5890.write(10);
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                    objArr = objArr3;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(((InterfaceC10015) c9776).mo9996());
                    c5890.write(32);
                    long jMo15898 = ((InterfaceC21204) c9776).mo15898();
                    if (jMo15898 < 0) {
                        c5890.write("-0x");
                        c5890.m17116(-jMo15898);
                        if (jMo15898 < -2147483648L) {
                            c5890.write(76);
                        }
                    } else {
                        c5890.write("0x");
                        c5890.m17116(jMo15898);
                        if (jMo15898 > 2147483647L) {
                            c5890.write(76);
                        }
                    }
                    c5890.write(10);
                    break;
                case 19:
                    objArr = objArr3;
                    C17980 c17980 = (C17980) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c17980.mo9996());
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c17980.m41956());
                    c5890.write(10);
                    break;
                case 20:
                    objArr = objArr3;
                    C15742 c15742 = (C15742) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c15742.mo9996());
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c15742.m37646());
                    c5890.write(32);
                    c5890.write(String.valueOf(c15742.mo15898()));
                    c5890.write(10);
                    break;
                case 21:
                    objArr = objArr3;
                    C3064 c3064 = (C3064) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c3064.mo9996());
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c3064.m9997());
                    c5890.write(32);
                    m43061(c5890, c3064);
                    c5890.write(10);
                    break;
                case 22:
                    objArr = objArr3;
                    C23948 c23948 = (C23948) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c23948.mo9996());
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c23948.m53475());
                    c5890.write(32);
                    c5890.write(String.valueOf(c23948.mo15898()));
                    c5890.write(10);
                    break;
                case 23:
                    objArr = objArr3;
                    C7539 c7539 = (C7539) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c7539.mo9996());
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c7539.m20603());
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c7539.m20602());
                    c5890.write(10);
                    break;
                case 24:
                    objArr = objArr3;
                    C21950 c21950 = (C21950) c9776;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c21950.mo9996());
                    c5890.write(32);
                    c5890.write(118);
                    c5890.m17115(c21950.m49674());
                    c5890.write(10);
                    break;
                case 25:
                case 26:
                    objArr = objArr3;
                    c5890.write(enumC7779.f25846);
                    c5890.write(32);
                    InterfaceC14512 interfaceC14512 = (InterfaceC14512) c9776;
                    byte bMo16451 = interfaceC14512.mo16451();
                    c5890.write(123);
                    if (bMo16451 == 1) {
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16456());
                    } else if (bMo16451 == 2) {
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16456());
                        c5890.write(",");
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16453());
                    } else if (bMo16451 == 3) {
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16456());
                        c5890.write(",");
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16453());
                        c5890.write(",");
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16454());
                    } else if (bMo16451 == 4) {
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16456());
                        c5890.write(",");
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16453());
                        c5890.write(",");
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16454());
                        c5890.write(",");
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16455());
                    } else if (bMo16451 == 5) {
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16456());
                        c5890.write(",");
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16453());
                        c5890.write(",");
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16454());
                        c5890.write(",");
                        c5890.write(118);
                        c5890.m17115((int) interfaceC14512.mo16455());
                        c5890.write(",");
                        c5890.write(am.aE);
                        c5890.m17115((int) interfaceC14512.mo16452());
                    }
                    c5890.write(q.h);
                    c5890.write(32);
                    m43061(c5890, c9776);
                    c5890.write(10);
                    break;
                case 27:
                    objArr = objArr3;
                    C11507 c11507 = (C11507) c9776;
                    c5890.write(enumC7779.f25846);
                    short sM28965 = c11507.m28965();
                    int iM28966 = c11507.m28966();
                    c5890.write(32);
                    c5890.write(123);
                    c5890.write(118);
                    c5890.m17115(iM28966);
                    c5890.write("..");
                    c5890.write(118);
                    c5890.m17115((c11507.m28966() + sM28965) - 1);
                    c5890.write(q.h);
                    c5890.write(32);
                    m43061(c5890, c11507);
                    c5890.write(10);
                    break;
                case 28:
                    C0343 c0343 = (C0343) c9776;
                    c5890.write(".array_data");
                    c5890.write(32);
                    c5890.m17115(c0343.m2084());
                    c5890.write(10);
                    c5890.m17114();
                    Iterator itM2085 = c0343.m2085();
                    Object[] objArr4 = objArr3;
                    while (itM2085.hasNext()) {
                        C18242 c18242 = (C18242) itM2085.next();
                        int i10 = c18242.f59555;
                        Object[] objArr5 = objArr4;
                        while (true) {
                            objArr2 = objArr5;
                            if (i10 < c18242.f59554 + c18242.f59555) {
                                byte b = c18242.f59553[i10];
                                c5890.write("0x");
                                c5890.m17116(b & 255);
                                c5890.write(116);
                                c5890.write(32);
                                i10++;
                                itM2085 = itM2085;
                                objArr5 = objArr2;
                                c18242 = c18242;
                            }
                        }
                        c5890.write(10);
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    c5890.m17113();
                    c5890.write(".end array_data");
                    c5890.write(10);
                    break;
                default:
                    objArr = objArr3;
                    break;
            }
            iMo2083 += c9776.mo2082(iMo2083);
            i5++;
            objArr3 = objArr;
        }
        if (Arrays.binarySearch(iArr, iMo2083) >= 0) {
            c5890.write("label_");
            c5890.write(String.valueOf(iMo2083));
            c5890.write(58);
            i = 10;
            c5890.write(10);
        } else {
            if (Arrays.binarySearch(iArrM43969, iMo2083) >= 0) {
                c5890.write(10);
                c5890.write("label_");
                c5890.write(String.valueOf(iMo2083));
                c5890.write(58);
                c5890.write(10);
            }
            i = 10;
        }
        if (Arrays.binarySearch(iArrM439610, iMo2083) >= 0) {
            c5890.write("switch_");
            c5890.write(String.valueOf(iMo2083));
            c5890.write(58);
            c5890.write(i);
        }
        C8524[] c8524Arr2 = c7033.f23206;
        if (c8524Arr2 == null || c8524Arr2.length <= 0) {
            return;
        }
        c5890.write(i);
        c5890.write(i);
        c5890.write("#Handler Exceptions");
        c5890.write(i);
        c5890.write(i);
        int length4 = c8524Arr2.length;
        int i11 = 0;
        while (i11 < length4) {
            C8524 c8525 = c8524Arr2[i11];
            int iM22839 = c8525.m22837();
            int iM228310 = c8525.m22838() + iM22839;
            C9269 c92610 = c8525.f27851;
            int iM244510 = c92610.m24459();
            if (iM244510 != -1) {
                c5890.write(".catch ");
                c5890.write(ProviderConfigurationPermission.ALL_STR);
                c5890.write(10);
                c5890.m17114();
                c5890.write("start : ");
                c5890.write("label_");
                c5890.m17115(iM22839);
                c5890.write(10);
                c5890.write("end : ");
                c5890.write("label_");
                c5890.m17115(iM228310);
                c5890.write(10);
                c5890.write("handler : ");
                c5890.write("label_");
                c5890.m17115(iM244510);
                c5890.write(10);
                c5890.m17113();
                c5890.write(".end catch");
                c5890.write(10);
                c5890.write(10);
            } else {
                C2558[] c2558Arr = c92610.f30150;
                int length5 = c2558Arr.length;
                int i12 = 0;
                while (i12 < length5) {
                    C2558 c2559 = c2558Arr[i12];
                    c5890.write(".catch ");
                    c5890.write(c2559.f8225.m46860());
                    c5890.write(10);
                    c5890.m17114();
                    c5890.write("start : ");
                    c5890.write("label_");
                    c5890.m17115(iM22839);
                    c5890.write(10);
                    c5890.write("end : ");
                    c5890.write("label_");
                    c5890.m17115(iM228310);
                    c5890.write(10);
                    c5890.write("handler : ");
                    c5890.write("label_");
                    c5890.m17115(c2559.m8593());
                    c5890.write(10);
                    c5890.m17113();
                    c5890.write(".end catch");
                    c5890.write(10);
                    c5890.write(10);
                    i12++;
                    length4 = length4;
                }
            }
            i11++;
            length4 = length4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43060(C5890 c5890, int i) {
        c5890.write(58);
        c5890.write("label_");
        c5890.write(String.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43061(C5890 c5890, AbstractC24188 abstractC24188) {
        AbstractC14490 abstractC14490 = (AbstractC14490) abstractC24188;
        int i = C21465.f68567[abstractC24188.f78334.f25843.ordinal()];
        if (i == 1) {
            c5890.write(((C13548) abstractC14490.m35002()).m33266());
            return;
        }
        if (i == 2) {
            c5890.write(((C5520) abstractC14490.m35002()).m16437());
            return;
        }
        if (i == 3) {
            c5890.write(((C20436) abstractC14490.m35002()).m46860());
            return;
        }
        if (i != 4) {
            return;
        }
        C3282 c3282 = (C3282) abstractC14490.m35002();
        c5890.write(34);
        String strM10827 = c3282.m10827();
        for (int i2 = 0; i2 < strM10827.length(); i2++) {
            char cCharAt = strM10827.charAt(i2);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    c5890.write(92);
                }
                c5890.write(cCharAt);
            } else if (cCharAt > 127) {
                c5890.write(cCharAt);
            } else if (cCharAt == '\t') {
                c5890.write("\\t");
            } else if (cCharAt == '\n') {
                c5890.write("\\n");
            } else if (cCharAt == '\r') {
                c5890.write("\\r");
            } else {
                c5890.write(cCharAt);
            }
        }
        c5890.write(34);
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
    public final void m43067(String str, C24738 c24738) {
        String str2;
        C24738 c24739;
        String[] strArr;
        EnumC7779[] enumC7779Arr;
        HashMap map;
        C18198 c18198M24431;
        C7033 c7033;
        int i;
        ArrayList arrayList;
        String str3;
        int i2;
        int i3;
        int i4;
        AbstractC10739 abstractC10739M43062;
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
        EnumC7779 enumC7779;
        byte b;
        HashMap map2;
        String str6;
        int iMo2082;
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
        C18481 c18481 = this;
        C24738 c247310 = c24738;
        c18481.f60153 = -1;
        C7033 c7034 = c18481.f60154;
        if (c7034 == null) {
            return;
        }
        f60148 = 0;
        String[] strArrSplit = str.split("\n");
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap(1);
        EnumC7779[] enumC7779Arr2 = new EnumC7779[strArrSplit.length];
        ArrayList arrayList3 = new ArrayList(strArrSplit.length);
        ArrayList arrayList4 = new ArrayList(1);
        int length = strArrSplit.length;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            str2 = "string is null";
            if (i15 < length) {
                c18481.f60153 = i15;
                String strTrim = strArrSplit[i15].trim();
                int i17 = length;
                if (strTrim.equals("") || strTrim.startsWith("#") || strTrim.startsWith("//")) {
                    enumC7779Arr = enumC7779Arr2;
                    enumC7779Arr[i15] = null;
                } else {
                    if (strTrim.endsWith(":")) {
                        map4.put(C1402.m5124(1, 0, strTrim), Integer.valueOf(i16));
                        enumC7779Arr2[i15] = null;
                        enumC7779Arr = enumC7779Arr2;
                    } else {
                        c7034 = c7034;
                        String str8 = " ";
                        arrayList3 = arrayList3;
                        int iIndexOf = strTrim.indexOf(" ");
                        String strSubstring = iIndexOf != -1 ? strTrim.substring(0, iIndexOf) : strTrim.trim();
                        EnumC7779 enumC7779M21153 = EnumC7779.m21153(strSubstring);
                        if (enumC7779M21153 == null) {
                            strSubstring.getClass();
                            enumC7779Arr = enumC7779Arr2;
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
                                    c247310 = c247310;
                                    strArrSplit = strArrSplit;
                                    map4 = map4;
                                    map5 = map5;
                                    String strTrim2 = strArrSplit[i15 - 1].trim();
                                    int i19 = 1;
                                    int iIntValue = ((Integer) map5.get(strTrim2.substring(0, strTrim2.length() - 1))).intValue();
                                    C18944 c18944 = new C18944();
                                    while (true) {
                                        i15 += i19;
                                        String strTrim3 = strArrSplit[i15].trim();
                                        if (strTrim3.startsWith(str11)) {
                                            C23442 c23442 = new C23442(c18944.m43966(), c18944.m43970());
                                            iMo2082 = c23442.mo2082(i18) + i18;
                                            arrayList4.add(c23442);
                                        } else {
                                            String[] strArrSplit2 = strTrim3.split(":");
                                            String str12 = str11;
                                            if (strArrSplit2.length != 2) {
                                                throw new IllegalArgumentException("packed switch data error: ".concat(strTrim3));
                                            }
                                            try {
                                                c18944.m43967(Integer.parseInt(strArrSplit2[0].trim()), ((Integer) map4.get(strArrSplit2[1].trim())).intValue() - iIntValue);
                                                i19 = 1;
                                                str11 = str12;
                                            } catch (Exception unused) {
                                                throw new IllegalArgumentException("the key is not int or label is not exists: ".concat(strTrim3));
                                            }
                                        }
                                    }
                                    i9 = iMo2082;
                                    enumC7779 = enumC7779M21153;
                                    break;
                                case 1:
                                    String str13 = ".end";
                                    ArrayList arrayList5 = arrayList4;
                                    int i20 = i16;
                                    c247310 = c247310;
                                    strArrSplit = strArrSplit;
                                    map4 = map4;
                                    int i21 = 1;
                                    String strTrim4 = strArrSplit[i15 - 1].trim();
                                    map5 = map5;
                                    int iIntValue2 = ((Integer) map5.get(strTrim4.substring(0, strTrim4.length() - 1))).intValue();
                                    C18944 c18945 = new C18944();
                                    while (true) {
                                        i15 += i21;
                                        String strTrim5 = strArrSplit[i15].trim();
                                        String str14 = str13;
                                        if (strTrim5.startsWith(str14)) {
                                            C12253 c12253 = new C12253(c18945.m43969(), c18945.m43970());
                                            arrayList4 = arrayList5;
                                            arrayList4.add(c12253);
                                            int i22 = i20;
                                            iMo2082 = c12253.mo2082(i22) + i22;
                                        } else {
                                            int i23 = i20;
                                            ArrayList arrayList6 = arrayList5;
                                            String[] strArrSplit3 = strTrim5.split(":");
                                            if (strArrSplit3.length != 2) {
                                                throw new IllegalArgumentException("packed switch data error: ".concat(strTrim5));
                                            }
                                            try {
                                                c18945.m43967(Integer.parseInt(strArrSplit3[0].trim()), ((Integer) map4.get(strArrSplit3[1].trim())).intValue() - iIntValue2);
                                                i21 = 1;
                                                str13 = str14;
                                                arrayList5 = arrayList6;
                                                i20 = i23;
                                            } catch (Exception unused2) {
                                                throw new IllegalArgumentException("the key is not int or label is not exists: ".concat(strTrim5));
                                            }
                                        }
                                    }
                                    i9 = iMo2082;
                                    enumC7779 = enumC7779M21153;
                                    break;
                                case 2:
                                    String str15 = " ";
                                    HashMap map6 = map4;
                                    ArrayList arrayList7 = arrayList4;
                                    C9247 c9247 = new C9247();
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
                                                c9247.m24433(iIntValue3, iIntValue4, iIntValue5);
                                            } else {
                                                c9247.m24434(C20436.m46859(strTrim7, c24738), iIntValue3, iIntValue4, iIntValue5);
                                            }
                                        } else {
                                            map2 = map6;
                                            str6 = str15;
                                        }
                                        i15++;
                                        str15 = str6;
                                        map6 = map2;
                                    }
                                    c24739 = c24738;
                                    map = map6;
                                    c18198M24431 = c9247.m24431();
                                    arrayList4 = arrayList7;
                                    break;
                                case 3:
                                    String[] strArrSplit5 = strArrSplit[i15].trim().split(" ");
                                    if (strArrSplit5.length < 2) {
                                        throw new IllegalArgumentException("unknow element Width: " + strArrSplit[i15]);
                                    }
                                    int iM56463 = C25282.m56463(strArrSplit5[1]);
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (true) {
                                        i15++;
                                        String strTrim8 = strArrSplit[i15].trim();
                                        if (strTrim8.startsWith(str10)) {
                                            C0343 c0343 = new C0343(iM56463, byteArrayOutputStream.toByteArray());
                                            arrayList4.add(c0343);
                                            iMo2082 = c0343.mo2082(i16) + i16;
                                            c247310 = c247310;
                                            strArrSplit = strArrSplit;
                                            map4 = map4;
                                            map5 = map5;
                                        } else {
                                            String[] strArrSplit6 = strTrim8.split(str8);
                                            if (strArrSplit6.length != iM56463) {
                                                throw new IllegalArgumentException("encodeValues width:" + strArrSplit6.length + " does not match : " + iM56463);
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
                                                                i13 = iM56463;
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
                                                            i14 = iM56463;
                                                            b6 = (byte) (b4 * b2);
                                                            if (b4 <= b3) {
                                                                throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                            }
                                                            if (b6 >= 0) {
                                                            }
                                                            b4 = (byte) (b6 + iDigit2);
                                                            i12++;
                                                            iM56463 = i14;
                                                            strArrSplit = strArr2;
                                                        }
                                                    } else {
                                                        b5 = 0;
                                                        i13 = iM56463;
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
                                                            i13 = iM56463;
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
                                                        i14 = iM56463;
                                                        b6 = (byte) (b4 * b2);
                                                        if (b4 <= b3) {
                                                            throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                        }
                                                        if (b6 >= 0 && b6 >= (-iDigit2)) {
                                                            throw new NumberFormatException(strTrim9.concat(" cannot fit into a byte"));
                                                        }
                                                        b4 = (byte) (b6 + iDigit2);
                                                        i12++;
                                                        iM56463 = i14;
                                                        strArrSplit = strArr2;
                                                    }
                                                }
                                                byteArrayOutputStream.write(b5);
                                                i24++;
                                                iM56463 = i13;
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
                                            c247310 = c24738;
                                        }
                                    }
                                    i9 = iMo2082;
                                    enumC7779 = enumC7779M21153;
                                    break;
                                    break;
                                default:
                                    throw new IllegalArgumentException("unknow opcodeName: ".concat(str9));
                            }
                        } else {
                            enumC7779Arr = enumC7779Arr2;
                            int i28 = i16;
                            c247310 = c247310;
                            strArrSplit = strArrSplit;
                            map4 = map4;
                            map5 = map5;
                            int i29 = C21465.f68568[enumC7779M21153.ordinal()];
                            if (i29 == 1 || i29 == 2) {
                                String[] strArrSplit7 = strTrim.split(":");
                                if (strArrSplit7.length != 2) {
                                    throw new IllegalArgumentException(" opcode offset error: ".concat(strTrim));
                                }
                                map5.put(strArrSplit7[1].trim(), Integer.valueOf(i28));
                            }
                            enumC7779 = enumC7779M21153;
                            i9 = (enumC7779.f25847.f25944 / 2) + i28;
                        }
                        enumC7779Arr[i15] = enumC7779;
                    }
                    i15++;
                    c18481 = this;
                    strArrSplit = strArrSplit;
                    map5 = map5;
                    map4 = map4;
                    c247310 = c247310;
                    length = i17;
                    enumC7779Arr2 = enumC7779Arr;
                    arrayList3 = arrayList3;
                    i16 = i9;
                    c7034 = c7034;
                }
                i9 = i16;
                i15++;
                c18481 = this;
                strArrSplit = strArrSplit;
                map5 = map5;
                map4 = map4;
                c247310 = c247310;
                length = i17;
                enumC7779Arr2 = enumC7779Arr;
                arrayList3 = arrayList3;
                i16 = i9;
                c7034 = c7034;
            } else {
                c24739 = c247310;
                c7034 = c7034;
                strArr = strArrSplit;
                enumC7779Arr = enumC7779Arr2;
                arrayList3 = arrayList3;
                map = map4;
                c18198M24431 = null;
            }
        }
        int i30 = 0;
        int i31 = 0;
        for (int length3 = strArr.length; i31 < length3; length3 = length3) {
            this.f60153 = i31;
            String strTrim10 = strArr[i31].trim();
            EnumC7779 enumC77710 = enumC7779Arr[i31];
            if (enumC77710 != null) {
                int i32 = C21465.f68566[enumC77710.f25847.ordinal()];
                Pattern pattern = f60147;
                switch (i32) {
                    case 1:
                        strArr = strArr;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C10037(enumC77710, (byte) m43058(i3, strTrim10, map)));
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 2:
                        strArr = strArr;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C22456(enumC77710, (short) (m43058(i3, strTrim10, map) & 65535)));
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 3:
                        strArr = strArr;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C16488(enumC77710, (short) m43064(strTrim10), (short) (m43058(i3, strTrim10, map) & 65535)));
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 4:
                        strArr = strArr;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        Matcher matcher = pattern.matcher(strTrim10);
                        matcher.find();
                        byte b7 = (byte) Integer.parseInt(matcher.group().substring(1));
                        matcher.find();
                        arrayList.add(new C14250(enumC77710, b7, (byte) Integer.parseInt(matcher.group().substring(1)), (short) (m43058(i3, strTrim10, map) & 65535)));
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 5:
                        strArr = strArr;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        arrayList.add(new C9775(enumC77710, m43058(i3, strTrim10, map)));
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 6:
                        strArr = strArr;
                        int i33 = i30;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        str3 = str2;
                        arrayList = arrayList3;
                        i3 = i33;
                        arrayList.add(new C13505(enumC77710, (short) m43064(strTrim10), m43058(i3, strTrim10, map)));
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 7:
                    case 8:
                    case 26:
                    default:
                        strArr = strArr;
                        c18198M24431 = c18198M24431;
                        arrayList = arrayList3;
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 9:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C9291(enumC77710));
                        i3 = i4;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 10:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C13766(enumC77710, (short) m43064(strTrim10)));
                        i3 = i4;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 11:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C8546(enumC77710, (byte) m43064(strTrim10), (byte) m43059(strTrim10)));
                        i3 = i4;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 12:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        str3 = str2;
                        arrayList = arrayList3;
                        Matcher matcher2 = pattern.matcher(strTrim10);
                        matcher2.find();
                        byte b8 = (byte) Integer.parseInt(matcher2.group().substring(1));
                        matcher2.find();
                        arrayList.add(new C21710(enumC77710, b8, (byte) Integer.parseInt(matcher2.group().substring(1))));
                        i3 = i4;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 13:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        c24739 = c24739;
                        str3 = str2;
                        arrayList = arrayList3;
                        short sM43064 = (short) m43064(strTrim10);
                        int i34 = C21465.f68567[enumC77710.f25843.ordinal()];
                        if (i34 == 1) {
                            try {
                                abstractC10739M43062 = m43062(strTrim10, c24739);
                            } catch (Exception unused3) {
                                throw new Exception(C25272.m56409("FieldIdItem error: ", strTrim10));
                            }
                        } else if (i34 == 3) {
                            try {
                                abstractC10739M43062 = m43063(strTrim10, c24739);
                            } catch (Exception unused4) {
                                throw new Exception(C25272.m56409("TypeIdItem error: ", strTrim10));
                            }
                        } else if (i34 != 4) {
                            abstractC10739M43062 = null;
                        } else {
                            try {
                                abstractC10739M43062 = C3282.m10820(C8398.m22561(strTrim10.substring(strTrim10.indexOf("\"") + 1, strTrim10.lastIndexOf("\""))), c24739);
                            } catch (Exception unused5) {
                                throw new Exception(C25272.m56409("String error: ", strTrim10));
                            }
                        }
                        arrayList.add(new C14996(enumC77710, sM43064, abstractC10739M43062));
                        i3 = i4;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 14:
                        strArr = strArr;
                        i4 = i30;
                        i31 = i31;
                        c18198M24431 = c18198M24431;
                        arrayList4 = arrayList4;
                        str3 = str2;
                        arrayList = arrayList3;
                        c24739 = c24738;
                        arrayList.add(new C9030(enumC77710, (short) m43064(strTrim10), C3282.m10820(C8398.m22561(strTrim10.substring(strTrim10.indexOf("\"") + 1, strTrim10.lastIndexOf("\""))), c24739)));
                        i3 = i4;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 15:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C5302(enumC77710, (short) m43064(strTrim10), (short) (m43059(strTrim10) & 65535)));
                        c24739 = c24738;
                        i3 = i4;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 16:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C11267(enumC77710, (short) m43064(strTrim10), (short) (m43059(strTrim10) & 65535)));
                        c24739 = c24738;
                        i3 = i4;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 17:
                        i4 = i30;
                        i31 = i31;
                        str3 = str2;
                        arrayList = arrayList3;
                        arrayList.add(new C8285(enumC77710, (byte) m43064(strTrim10), m43059(strTrim10)));
                        c24739 = c24738;
                        i3 = i4;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 18:
                        ArrayList arrayList9 = arrayList3;
                        short sM43065 = (short) m43064(strTrim10);
                        Matcher matcher3 = f60150.matcher(strTrim10);
                        if (!matcher3.find()) {
                            throw new Exception(C25272.m56409("long exception: ", strTrim10));
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
                            j = C25227.FOREVER_NS / ((long) (i6 / 2));
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
                            C15982 c15982 = new C15982(enumC77710, sM43065, j3);
                            arrayList = arrayList2;
                            arrayList.add(c15982);
                            str3 = str4;
                            c24739 = c24738;
                            i3 = i4;
                            i2 = (enumC77710.f25847.f25944 / 2) + i3;
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
                                j = C25227.FOREVER_NS / ((long) (i6 / 2));
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
                                C15982 c15983 = new C15982(enumC77710, sM43065, j3);
                                arrayList = arrayList2;
                                arrayList.add(c15983);
                                str3 = str4;
                                c24739 = c24738;
                                i3 = i4;
                                i2 = (enumC77710.f25847.f25944 / 2) + i3;
                            } else {
                                arrayList2 = arrayList9;
                                i4 = i30;
                                i31 = i31;
                                str4 = str2;
                            }
                        }
                        j3 = j5;
                        C15982 c15984 = new C15982(enumC77710, sM43065, j3);
                        arrayList = arrayList2;
                        arrayList.add(c15984);
                        str3 = str4;
                        c24739 = c24738;
                        i3 = i4;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                        break;
                    case 19:
                        arrayList = arrayList3;
                        Matcher matcher4 = pattern.matcher(strTrim10);
                        matcher4.find();
                        short s = (short) (Integer.parseInt(matcher4.group().substring(1)) & 65535);
                        matcher4.find();
                        arrayList.add(new C17980(enumC77710, s, Integer.parseInt(matcher4.group().substring(1)) & 65535));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 20:
                        arrayList = arrayList3;
                        Matcher matcher5 = pattern.matcher(strTrim10);
                        matcher5.find();
                        short s2 = (short) Integer.parseInt(matcher5.group().substring(1));
                        matcher5.find();
                        arrayList.add(new C15742(enumC77710, s2, (short) Integer.parseInt(matcher5.group().substring(1)), (byte) (m43059(strTrim10) & 255)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 21:
                        arrayList = arrayList3;
                        Matcher matcher6 = pattern.matcher(strTrim10);
                        matcher6.find();
                        byte b9 = (byte) Integer.parseInt(matcher6.group().substring(1));
                        matcher6.find();
                        byte b10 = (byte) Integer.parseInt(matcher6.group().substring(1));
                        int i36 = C21465.f68567[enumC77710.f25843.ordinal()];
                        arrayList.add(new C3064(enumC77710, b9, b10, i36 != 1 ? i36 != 3 ? null : m43063(strTrim10, c24739) : m43062(strTrim10, c24739)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 22:
                        arrayList = arrayList3;
                        Matcher matcher7 = pattern.matcher(strTrim10);
                        matcher7.find();
                        byte b11 = (byte) Integer.parseInt(matcher7.group().substring(1));
                        matcher7.find();
                        arrayList.add(new C23948(enumC77710, b11, (byte) Integer.parseInt(matcher7.group().substring(1)), (short) (m43059(strTrim10) & 65535)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 23:
                        arrayList = arrayList3;
                        Matcher matcher8 = pattern.matcher(strTrim10);
                        matcher8.find();
                        short s3 = (short) Integer.parseInt(matcher8.group().substring(1));
                        matcher8.find();
                        short s4 = (short) Integer.parseInt(matcher8.group().substring(1));
                        matcher8.find();
                        arrayList.add(new C7539(enumC77710, s3, s4, (short) Integer.parseInt(matcher8.group().substring(1))));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                    case 24:
                        arrayList = arrayList3;
                        Matcher matcher9 = pattern.matcher(strTrim10);
                        matcher9.find();
                        int i37 = Integer.parseInt(matcher9.group().substring(1));
                        matcher9.find();
                        arrayList.add(new C21950(enumC77710, i37, Integer.parseInt(matcher9.group().substring(1))));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
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
                        f60148 = Math.max(f60148, i38);
                        int i39 = C21465.f68567[enumC77710.f25843.ordinal()];
                        AbstractC10739 abstractC10739M43063 = i39 != 2 ? i39 != 3 ? null : m43063(strTrim10, c24739) : m43066(strTrim10, c24739);
                        try {
                            arrayList.add(new C22696(enumC77710, iArr[0], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], abstractC10739M43063));
                            i3 = i30;
                            str3 = str2;
                            i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        } catch (Exception unused6) {
                            throw new RuntimeException(strTrim10 + EnumC7687.f25319 + abstractC10739M43063 + EnumC7687.f25319 + iArr[0]);
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
                        f60148 = Math.max(f60148, i41);
                        int i42 = C21465.f68567[enumC77710.f25843.ordinal()];
                        arrayList = arrayList3;
                        arrayList.add(new C11507(enumC77710, (short) iArr2[0], iArr2[1], i42 != 2 ? i42 != 3 ? null : m43063(strTrim10, c24739) : m43066(strTrim10, c24739)));
                        i3 = i30;
                        str3 = str2;
                        i2 = (enumC77710.f25847.f25944 / 2) + i3;
                        break;
                }
            } else {
                strArr = strArr;
                i31 = i31;
                c18198M24431 = c18198M24431;
                arrayList4 = arrayList4;
                c24739 = c24739;
                arrayList = arrayList3;
                int i43 = i30;
                str3 = str2;
                i2 = i43;
            }
            i31++;
            arrayList3 = arrayList;
            str2 = str3;
            c24739 = c24739;
            arrayList4 = arrayList4;
            strArr = strArr;
            c18198M24431 = c18198M24431;
            i30 = i2;
        }
        C18198 c18198 = c18198M24431;
        ArrayList arrayList10 = arrayList3;
        this.f60153 = -1;
        arrayList10.addAll(arrayList4);
        AbstractC24188[] abstractC24188Arr = new AbstractC24188[arrayList10.size()];
        arrayList10.toArray(abstractC24188Arr);
        if (c18198 != null) {
            List list = (List) c18198.f59440;
            List list2 = (List) c18198.f59441;
            if (list.size() > 0) {
                C8524[] c8524Arr = new C8524[list.size()];
                C9269[] c9269Arr = new C9269[list2.size()];
                list.toArray(c8524Arr);
                list2.toArray(c9269Arr);
                c7033 = c7034;
                c7033.f23206 = c8524Arr;
                c7033.f23205 = c9269Arr;
            } else {
                c7033 = c7034;
            }
        } else {
            c7033 = c7034;
            c7033.f23206 = null;
            c7033.f23205 = null;
        }
        C12275 parent = c7033.getParent();
        C12231 c12231 = parent.f39463.f19208.f53973;
        if (c12231 == null) {
            i = 0;
        } else {
            int iM46864 = 0;
            for (C20436 c20436 : c12231.f39367) {
                iM46864 += c20436.m46864();
            }
            i = iM46864;
        }
        if ((parent.f39462 & EnumC6266.STATIC.getValue()) == 0) {
            i++;
        }
        c7033.f23209 = i;
        c7033.f23203 = f60148;
        c7033.f23208 = abstractC24188Arr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C13548 m43062(String str, C24738 c24738) {
        String[] strArrSplit = f60152.split(str);
        int length = strArrSplit.length;
        int i = length - 1;
        if (i < 2) {
            throw new RuntimeException(C25272.m56409("FieldIdItem error: ", str));
        }
        return C13548.m33264(c24738, C20436.m46859(strArrSplit[length - 3], c24738), C20436.m46859(strArrSplit[i], c24738), C3282.m10820(strArrSplit[length - 2], c24738));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C5520 m43066(String str, C24738 c24738) {
        String[] strArrSplit = f60149.split(str);
        int length = strArrSplit.length;
        int i = length - 1;
        if (i < 3) {
            throw new RuntimeException("MethodIdItem error: ".concat(str));
        }
        return C5520.m16434(c24738, C20436.m46859(strArrSplit[length - 4], c24738), C16706.m39473(c24738, C20436.m46859(strArrSplit[i], c24738), m43065(strArrSplit[length - 2], c24738)), C3282.m10820(strArrSplit[length - 3], c24738));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C20436 m43063(String str, C24738 c24738) {
        String strTrim = str.trim();
        return C20436.m46859(strTrim.substring(strTrim.lastIndexOf(" ") + 1), c24738);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43059(String str) throws Exception {
        Matcher matcher = f60151.matcher(str);
        if (matcher.find()) {
            return C25282.m56463(matcher.group().trim());
        }
        throw new Exception(C25272.m56409("int exception: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43058(int i, String str, HashMap map) {
        try {
            return ((Integer) map.get(str.split(":")[1].trim())).intValue() - i;
        } catch (Exception unused) {
            throw new IllegalArgumentException(C25272.m56409("unfound label offset: ", str));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m43064(String str) throws Exception {
        Matcher matcher = f60147.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group().substring(1));
        }
        throw new Exception(C25272.m56409("register exception: ", str));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C12231 m43065(String str, C24738 c24738) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == 'F') {
                i = i2 + 1;
                arrayList.add(C20436.m46859(str.substring(i2, i), c24738));
            } else if (cCharAt == 'L') {
                int i3 = i2;
                while (true) {
                    int i4 = i3 + 1;
                    if (str.charAt(i4) != ';') {
                        i3 = i4;
                    } else {
                        i = i3 + 2;
                        arrayList.add(C20436.m46859(str.substring(i2, i), c24738));
                    }
                }
            } else if (cCharAt == 'S' || cCharAt == 'I' || cCharAt == 'J' || cCharAt == 'Z') {
                i = i2 + 1;
                arrayList.add(C20436.m46859(str.substring(i2, i), c24738));
            } else if (cCharAt != '[') {
                switch (cCharAt) {
                    case 'B':
                    case 'C':
                    case 'D':
                        i = i2 + 1;
                        arrayList.add(C20436.m46859(str.substring(i2, i), c24738));
                        break;
                    default:
                        throw new RuntimeException(ExternalValue$$ExternalSyntheticOutline0.m(i2, str, new StringBuilder("Invalid type ")));
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
                        arrayList.add(C20436.m46859(str.substring(i2, i), c24738));
                    }
                }
            }
            i2 = i;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return C12231.m30516(c24738, arrayList);
    }
}
