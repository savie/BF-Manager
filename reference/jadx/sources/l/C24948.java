package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP224K1Field;

/* JADX INFO: renamed from: l.᩻ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24948 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f80768;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7793 f80769;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f80770;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f80771;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15945 f80772;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80773;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f80774;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80775;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80776;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C15945 c15945 = null;
        int i = 578985839;
        int i2 = C1783.f6087;
        int i3 = C2288.f7433;
        int iM2761 = (C0619.m2761("֫ᩳ") ^ i2) * 81;
        int i4 = ((iM2761 ^ i3) * (-22175)) ^ (-1410937784);
        int i5 = -1695524030;
        while (true) {
            i = ((((i ^ i3) * (-17587)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2048985475:
                case -297294741:
                    c15945 = this.f80772;
                    if (c15945 != null) {
                        iM2761 = (C0773.m3169("ۨܶ") ^ i3) * (-17);
                        i4 = ((iM2761 ^ i2) * (-4489)) ^ 1123728537;
                        i5 = -2115718161;
                    } else {
                        iM2761 = (C0619.m2761("ܰۤ") ^ i2) * (-39);
                        i4 = ((iM2761 ^ i3) * 20747) ^ 470303345;
                        i5 = 973047934;
                    }
                    break;
                case -2040099818:
                case -107358382:
                    C20932.m47849(c15945);
                    iM2761 = (C0619.m2761("ܰۤ") ^ i2) * (-39);
                    i4 = ((iM2761 ^ i3) * 20747) ^ 470303345;
                    i5 = 973047934;
                    break;
                case -2013189748:
                case 990790520:
                    break;
                case -1890644023:
                case -1573749390:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("֫ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24239)) ^ (-542876302);
                        i5 = 1533016505;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܰܰ")) * 49;
                        i4 = ((iM2761 ^ i2) * (-1279)) ^ (-225229755);
                        i5 = 1846685482;
                    }
                    break;
                case -1871646537:
                case -531135876:
                    if (C1343.m4943()) {
                        iM2761 = C0619.m2761("ᩳᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23381)) ^ (-1283882600);
                        i5 = -1845659245;
                    } else {
                        iM2761 = C0619.m2761("֫ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24239)) ^ (-542876302);
                        i5 = 1533016505;
                    }
                    break;
                case -1701854204:
                case 818621858:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("᩶ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16451) ^ 1714003441;
                        i5 = -1904293937;
                    } else {
                        iM2761 = (i3 - C0773.m3169("֡ܰ")) * 9;
                        i4 = ((iM2761 ^ i2) * (-3201)) ^ (-1456442318);
                        i5 = -277353218;
                    }
                    break;
                case -1683287072:
                case 1461875402:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("᩶ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16451) ^ 1714003441;
                        i5 = -1904293937;
                    } else {
                        iM2761 = (C0773.m3169("ۤۗ") + i2) * 67;
                        i4 = ((iM2761 ^ i3) * 6013) ^ 1260935653;
                        i5 = 1346093790;
                    }
                    break;
                case -1260895468:
                case 909437144:
                    if (C13473.f42873 != 0) {
                        iM2761 = (i3 - C0619.m2761("ܰܰ")) * 49;
                        i4 = ((iM2761 ^ i2) * (-1279)) ^ (-225229755);
                        i5 = 1846685482;
                    } else {
                        iM2761 = C0773.m3169("ۘ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15777) ^ (-1023658951);
                        i5 = 1447090411;
                    }
                    break;
                case -1221775975:
                case -1080054297:
                    C23916.m53419();
                    break;
                case -1033003501:
                case 1167603110:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("֫ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24239)) ^ (-542876302);
                        i5 = 1533016505;
                    } else {
                        iM2761 = C0619.m2761("֫֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24107)) ^ (-455900885);
                        i5 = 2080388174;
                    }
                    break;
                case -945999502:
                case -607494652:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("᩶ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16451) ^ 1714003441;
                        i5 = -1904293937;
                    } else {
                        iM2761 = C0619.m2761("ܺ۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18117) ^ (-2092121884);
                        i5 = 1385819150;
                    }
                    break;
                case -332419540:
                case 1483896482:
                    C2288.m7767();
                    if (C2966.m9664()) {
                        iM2761 = (C0773.m3169("᩵ܿ") ^ i3) * 13;
                        i4 = ((iM2761 ^ i2) * 24481) ^ (-899464474);
                        i5 = 1546392505;
                    } else {
                        iM2761 = C0619.m2761("֫ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24239)) ^ (-542876302);
                        i5 = 1533016505;
                    }
                    break;
                case 115272903:
                case 933110936:
                    if (C2354.m7983()) {
                        iM2761 = C0619.m2761("᩶ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22455)) ^ (-820189336);
                        i5 = -409998843;
                    } else {
                        iM2761 = C0773.m3169("᩶ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16451) ^ 1714003441;
                        i5 = -1904293937;
                    }
                    break;
                case 277244110:
                case 1003138981:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0619.m2761("᩸ܶ") ^ i2) * (-21);
                        i4 = ((iM2761 ^ i3) * (-51)) ^ 932546509;
                        i5 = -1899749779;
                    } else {
                        iM2761 = C0773.m3169("ۢۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2469)) ^ (-582354956);
                        i5 = -1606457994;
                    }
                    break;
                case 292234968:
                case 1555643734:
                    C2310.m7813();
                    if (C0950.f3488 < 0) {
                        iM2761 = (C0619.m2761("᩸ܶ") ^ i2) * (-21);
                        i4 = ((iM2761 ^ i3) * (-51)) ^ 932546509;
                        i5 = -1899749779;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܰܰ")) * 49;
                        i4 = ((iM2761 ^ i2) * (-1279)) ^ (-225229755);
                        i5 = 1846685482;
                    }
                    break;
                case 709058756:
                case 873599254:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("֫ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24239)) ^ (-542876302);
                        i5 = 1533016505;
                    } else {
                        iM2761 = C0619.m2761("۠ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13511) ^ 2073518433;
                        i5 = 981448850;
                    }
                    break;
                case 911882584:
                case 1883966822:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("֫ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24239)) ^ (-542876302);
                        i5 = 1533016505;
                    } else {
                        iM2761 = C0619.m2761("ۖ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3413)) ^ 1359047221;
                        i5 = 2108331259;
                    }
                    break;
                default:
                    C3033.m9845();
                    iM2761 = (i3 - C0619.m2761("ܰܰ")) * 49;
                    i4 = ((iM2761 ^ i2) * (-1279)) ^ (-225229755);
                    i5 = 1846685482;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ee A[PHI: r8 r9
      0x00ee: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:39:0x00ec, B:35:0x00d2, B:17:0x004f, B:15:0x004b, B:12:0x0042, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r9v3 java.util.List<android.content.pm.PackageInfo>) = 
      (r9v1 java.util.List<android.content.pm.PackageInfo>)
      (r9v2 java.util.List<android.content.pm.PackageInfo>)
      (r9v1 java.util.List<android.content.pm.PackageInfo>)
      (r9v1 java.util.List<android.content.pm.PackageInfo>)
      (r9v1 java.util.List<android.content.pm.PackageInfo>)
      (r9v1 java.util.List<android.content.pm.PackageInfo>)
     binds: [B:39:0x00ec, B:35:0x00d2, B:17:0x004f, B:15:0x004b, B:12:0x0042, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0185 A[PHI: r5 r6
      0x0185: PHI (r5v3 l.۟ۢ֫) = (r5v2 l.۟ۢ֫), (r5v1 l.۟ۢ֫) binds: [B:52:0x0183, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r6v3 java.util.concurrent.atomic.AtomicInteger) = (r6v2 java.util.concurrent.atomic.AtomicInteger), (r6v1 java.util.concurrent.atomic.AtomicInteger) binds: [B:52:0x0183, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e3 A[PHI: r10 r11
      0x01e3: PHI (r10v3 l.᩹۟ᩴ) = (r10v1 l.᩹۟ᩴ), (r10v2 l.᩹۟ᩴ), (r10v1 l.᩹۟ᩴ), (r10v1 l.᩹۟ᩴ) binds: [B:60:0x01e1, B:31:0x00b2, B:27:0x0092, B:23:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v3 boolean) binds: [B:60:0x01e1, B:31:0x00b2, B:27:0x0092, B:23:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x020f A[PHI: r7
      0x020f: PHI (r7v3 android.content.pm.PackageManager) = 
      (r7v1 android.content.pm.PackageManager)
      (r7v2 android.content.pm.PackageManager)
      (r7v1 android.content.pm.PackageManager)
     binds: [B:64:0x020d, B:43:0x0125, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0235 A[PHI: r16
      0x0235: PHI (r16v2 long) = (r16v1 long), (r16v4 long) binds: [B:9:0x003c, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        int iM2761;
        int i;
        int i2;
        long j = 0;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        AtomicInteger atomicInteger = null;
        PackageManager packageManager = null;
        int i3 = 0;
        List<PackageInfo> installedPackages = null;
        InterfaceC23405 interfaceC23405M12986 = null;
        boolean zM21111 = false;
        int i4 = -1573436354;
        int i5 = C3690.f12684;
        int i6 = C2702.f8586;
        int iM2762 = C0619.m2761("ܽۖ") ^ i6;
        int i7 = ((iM2762 ^ i5) * (-16953)) ^ 574846303;
        int i8 = 1194801099 ^ iM2762;
        long j2 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i5) * 30569) >> 31));
            switch (i4) {
                case -2073624547:
                case 909312751:
                    if (C1080.f3865 < 0) {
                        iM2761 = (C0619.m2761("ۛ᩸") + i5) * (-57);
                        i = ((iM2761 ^ i6) * (-11051)) ^ (-1449033426);
                        i2 = 1768422501;
                    } else {
                        iM2761 = C0773.m3169("ܺ᩹") ^ i6;
                        i = ((iM2761 ^ i5) * (-14159)) ^ (-1298488964);
                        i2 = 197013057;
                    }
                    int i9 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i9;
                    break;
                case -2014398356:
                case -352693647:
                    if (this.f80773 != C1519.m5400(atomicInteger)) {
                        iM2761 = (C0619.m2761("۠ۙ") ^ i6) * 57;
                        i = ((iM2761 ^ i5) * (-14459)) ^ 952364364;
                        i2 = -1677360998;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ۖ᩵")) * (-63);
                        i = ((iM2761 ^ i5) * 26993) ^ 1388500282;
                        i2 = 1435383806;
                    }
                    int i10 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i10;
                    break;
                case -1987626476:
                case 1447413977:
                    C3492.m11488();
                    C3077.m10041();
                    iM2761 = (C0619.m2761("ۛ᩸") + i5) * (-57);
                    i = ((iM2761 ^ i6) * (-11051)) ^ (-1449033426);
                    i2 = 1768422501;
                    int i11 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i11;
                    break;
                case -1892010703:
                case -1886472976:
                    this.f80771 = installedPackages;
                    interfaceC23405M12986 = C4013.m12986();
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("ܿܰ") ^ i6;
                        i = ((iM2761 ^ i5) * (-22513)) ^ 1452168497;
                        i2 = 2120024706;
                    } else {
                        iM2761 = C0619.m2761("ۧ֫") ^ i5;
                        i = ((iM2761 ^ i6) * (-25111)) ^ 610432700;
                        i2 = 604959382;
                    }
                    int i12 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i12;
                    break;
                case -1832466642:
                case -627104893:
                    C17202.m40372();
                    C1826.m6301();
                    break;
                case -1756669382:
                case -1131484217:
                    break;
                case -1618257069:
                case -1047639459:
                    AbstractC0116.m1243();
                    if (C1519.f5300 < 0) {
                        iM2761 = (C0619.m2761("ۛ᩸") + i5) * (-57);
                        i = ((iM2761 ^ i6) * (-11051)) ^ (-1449033426);
                        i2 = 1768422501;
                    } else {
                        iM2761 = C0773.m3169("᩺֫") ^ i6;
                        i = ((iM2761 ^ i5) * (-22149)) ^ (-919302446);
                        i2 = -1041569831;
                    }
                    int i13 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i13;
                    break;
                case -862881379:
                case 782171744:
                    i3 = 0;
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0619.m2761("ۛ᩸") + i5) * (-57);
                        i = ((iM2761 ^ i6) * (-11051)) ^ (-1449033426);
                        i2 = 1768422501;
                    } else {
                        iM2761 = (C0773.m3169("ܶۡ") ^ i5) * (-37);
                        i = ((iM2761 ^ i6) * (-28751)) ^ 1316926514;
                        i2 = -699689136;
                    }
                    int i14 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i14;
                    break;
                case -853484562:
                case 12115514:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("ܿܰ") ^ i6;
                        i = ((iM2761 ^ i5) * (-22513)) ^ 1452168497;
                        i2 = 2120024706;
                    } else {
                        iM2761 = (C0619.m2761("֡᩷") + i6) * 115;
                        i = ((iM2761 ^ i5) * (-4659)) ^ (-995148661);
                        i2 = 1443654141;
                    }
                    int i15 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i15;
                    break;
                case -676384716:
                case -425853869:
                    SystemClock.sleep(j);
                    iM2761 = C0619.m2761("ܳܶ") ^ i5;
                    i = ((iM2761 ^ i6) * 20631) ^ 487674703;
                    i2 = 948115203;
                    int i16 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i16;
                    break;
                case -601868789:
                case 1609127582:
                    j = this.f80768;
                    if (j > j2) {
                        iM2761 = (C0619.m2761("۟ۡ") + i5) * (-71);
                        i = ((iM2761 ^ i6) * 21725) ^ (-1901119119);
                        i2 = 1575277190;
                    } else {
                        iM2761 = C0619.m2761("ܳܶ") ^ i5;
                        i = ((iM2761 ^ i6) * 20631) ^ 487674703;
                        i2 = 948115203;
                    }
                    int i17 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i17;
                    break;
                case -551866353:
                case 8524452:
                    zM21111 = C7756.m21111();
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0773.m3169("ܿܰ") ^ i6;
                        i = ((iM2761 ^ i5) * (-22513)) ^ 1452168497;
                        i2 = 2120024706;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۙ۬")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i6) * 14791) ^ (-392562857);
                        i2 = 1384378780;
                    }
                    int i18 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i18;
                    break;
                case -206704652:
                case 2036438499:
                    C7756.m21122();
                    packageManager = viewOnClickListenerC7793.getPackageManager();
                    if (C20932.m47848() != 0) {
                        iM2761 = C0773.m3169("᩺֫") ^ i6;
                        i = ((iM2761 ^ i5) * (-22149)) ^ (-919302446);
                        i2 = -1041569831;
                    } else {
                        iM2761 = (C0619.m2761("ܰ᩸") ^ i5) * 23;
                        i = ((iM2761 ^ i6) * 25031) ^ (-346737663);
                        i2 = 1802826245;
                    }
                    int i19 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i19;
                    break;
                case 27067366:
                case 108048384:
                    viewOnClickListenerC7793 = this.f80769;
                    atomicInteger = viewOnClickListenerC7793.f25887;
                    if (C11235.m28309() != 0) {
                        iM2761 = (C0619.m2761("ۡܺ") + i5) * (-89);
                        i = ((iM2761 ^ i6) * (-18461)) ^ (-1573643465);
                        i2 = -2102737700;
                    } else {
                        iM2761 = C0773.m3169("ۨ᩶") ^ i6;
                        i = ((iM2761 ^ i5) * 23493) ^ 1507227911;
                        i2 = -1567341245;
                    }
                    int i110 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i110;
                    break;
                case 452814930:
                case 860804310:
                    C17202.m40369((C11762) interfaceC23405M12986);
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0773.m3169("ܿܰ") ^ i6;
                        i = ((iM2761 ^ i5) * (-22513)) ^ 1452168497;
                        i2 = 2120024706;
                    } else {
                        iM2761 = C0619.m2761("᩻᩻") ^ i6;
                        i = ((iM2761 ^ i5) * (-31955)) ^ (-1638438745);
                        i2 = 1223670392;
                    }
                    int i111 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i111;
                    break;
                case 500385107:
                case 2001587041:
                    this.f80772 = C7742.m21081(zM21111);
                    break;
                case 518779470:
                case 813911097:
                    installedPackages = packageManager.getInstalledPackages(i3);
                    if (C11235.m28309() != 0) {
                        iM2761 = (C0619.m2761("ۛ᩸") + i5) * (-57);
                        i = ((iM2761 ^ i6) * (-11051)) ^ (-1449033426);
                        i2 = 1768422501;
                    } else {
                        iM2761 = C0773.m3169("᩹֨") ^ i6;
                        i = ((iM2761 ^ i5) * 24297) ^ 862910986;
                        i2 = -941397757;
                    }
                    int i112 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i112;
                    break;
                case 824771470:
                case 1728186722:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("᩺֫") ^ i6;
                        i = ((iM2761 ^ i5) * (-22149)) ^ (-919302446);
                        i2 = -1041569831;
                    } else {
                        iM2761 = C0619.m2761("ۜܽ") ^ i6;
                        i = ((iM2761 ^ i5) * (-28689)) ^ (-181929177);
                        i2 = -2058426445;
                    }
                    int i113 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i113;
                    break;
                case 1137718146:
                case 1740895821:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("ۛ᩸") + i5) * (-57);
                        i = ((iM2761 ^ i6) * (-11051)) ^ (-1449033426);
                        i2 = 1768422501;
                    } else {
                        iM2761 = (C0619.m2761("ۡܺ") + i5) * (-89);
                        i = ((iM2761 ^ i6) * (-18461)) ^ (-1573643465);
                        i2 = -2102737700;
                    }
                    int i114 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i114;
                    break;
                default:
                    j2 = 0;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ܺ᩹") ^ i6;
                        i = ((iM2761 ^ i5) * (-14159)) ^ (-1298488964);
                        i2 = 197013057;
                    } else {
                        iM2761 = C0773.m3169("ۨۡ") ^ i5;
                        i = ((iM2761 ^ i6) * (-18649)) ^ 2080506959;
                        i2 = 1509004539;
                    }
                    int i115 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i115;
                    break;
            }
            return;
        }
    }

    public C24948(ViewOnClickListenerC7793 viewOnClickListenerC7793, long j, int i, int i2, int i3, String str, String str2) {
        int i4 = 2079286837;
        int i5 = RunnableC0334.f1808;
        int i6 = C2310.f7472;
        this.f80769 = viewOnClickListenerC7793;
        this.f80768 = j;
        this.f80773 = i;
        this.f80775 = i2;
        this.f80776 = i3;
        this.f80774 = str;
        this.f80770 = str2;
        int iM2761 = C0619.m2761("ܰ۬") ^ i5;
        int i7 = ((iM2761 ^ i6) * (-5887)) ^ (-1241070558);
        int i8 = 1278349832;
        while (true) {
            i4 = (iM2761 ^ i8) ^ (i7 & (((i4 ^ i6) * 32721) >> 31));
            switch (i4) {
                case -1490920851:
                case 1533350240:
                    C2287.m7745();
                    iM2761 = C0773.m3169("᩵᩶") ^ i5;
                    i7 = ((iM2761 ^ i6) * 31179) ^ 874818573;
                    i8 = -701439412;
                    break;
                case -1320796612:
                case 2124787163:
                    return;
                case -559654464:
                case 379134441:
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("ᩴۧ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM2761 ^ i6) * (-17443)) ^ 1718122004;
                        i8 = -126227456;
                    } else {
                        iM2761 = C0619.m2761("֨ۤ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 13891) ^ (-1501963661);
                        i8 = -1923634171;
                    }
                    break;
                case -477343198:
                case 1057197490:
                    C1542.m5459();
                    C3734.m12152();
                    throw new RuntimeException();
                case -233467748:
                case 1396222617:
                    if (!C17202.m40372()) {
                        iM2761 = C0773.m3169("᩵᩶") ^ i5;
                        i7 = ((iM2761 ^ i6) * 31179) ^ 874818573;
                        i8 = -701439412;
                    } else {
                        iM2761 = C0619.m2761("֨ۤ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 13891) ^ (-1501963661);
                        i8 = -1923634171;
                    }
                    break;
                case 90829721:
                case 2089440914:
                    RunnableC3646.m11813();
                    if (C20932.f66974 > 0) {
                        iM2761 = C0773.m3169("᩵᩶") ^ i5;
                        i7 = ((iM2761 ^ i6) * 31179) ^ 874818573;
                        i8 = -701439412;
                    } else {
                        iM2761 = C0619.m2761("ܶܶ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 16235) ^ 461653723;
                        i8 = -350535217;
                    }
                    break;
                default:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i6 - C0773.m3169("ۛܶ")) * 13;
                        i7 = ((iM2761 ^ i5) * 30705) ^ (-972106702);
                        i8 = -1661649516;
                    } else {
                        iM2761 = (C0773.m3169("ܰۨ") + i6) * 61;
                        i7 = ((iM2761 ^ i5) * 13781) ^ (-1729800819);
                        i8 = 1954995414;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0553 A[PHI: r11 r12 r13 r14 r21 r25 r26 r27 r28 r29
      0x0553: PHI (r11v15 java.util.ArrayList) = 
      (r11v3 java.util.ArrayList)
      (r11v4 java.util.ArrayList)
      (r11v5 java.util.ArrayList)
      (r11v14 java.util.ArrayList)
      (r11v17 java.util.ArrayList)
     binds: [B:116:0x053d, B:113:0x0529, B:99:0x044f, B:62:0x0214, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0553: PHI (r12v20 l.ܶ۟ᩴ) = (r12v5 l.ܶ۟ᩴ), (r12v6 l.ܶ۟ᩴ), (r12v7 l.ܶ۟ᩴ), (r12v17 l.ܶ۟ᩴ), (r12v23 l.ܶ۟ᩴ) binds: [B:116:0x053d, B:113:0x0529, B:99:0x044f, B:62:0x0214, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0553: PHI (r13v20 l.ۨۢ֫) = (r13v4 l.ۨۢ֫), (r13v5 l.ۨۢ֫), (r13v6 l.ۨۢ֫), (r13v15 l.ۨۢ֫), (r13v23 l.ۨۢ֫) binds: [B:116:0x053d, B:113:0x0529, B:99:0x044f, B:62:0x0214, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0553: PHI (r14v24 l.ܰۢ֫) = (r14v7 l.ܰۢ֫), (r14v8 l.ܰۢ֫), (r14v9 l.ܰۢ֫), (r14v22 l.ܰۢ֫), (r14v30 l.ܰۢ֫) binds: [B:116:0x053d, B:113:0x0529, B:99:0x044f, B:62:0x0214, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0553: PHI (r21v5 l.۟ۢ֫) = (r21v1 l.۟ۢ֫), (r21v2 l.۟ۢ֫), (r21v1 l.۟ۢ֫), (r21v1 l.۟ۢ֫), (r21v1 l.۟ۢ֫) binds: [B:116:0x053d, B:113:0x0529, B:99:0x044f, B:62:0x0214, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0553: PHI (r25v24 java.lang.String) = 
      (r25v3 java.lang.String)
      (r25v4 java.lang.String)
      (r25v5 java.lang.String)
      (r25v16 java.lang.String)
      (r25v28 java.lang.String)
     binds: [B:116:0x053d, B:113:0x0529, B:99:0x044f, B:62:0x0214, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0553: PHI (r26v21 l.᩵ۢ֫) = (r26v3 l.᩵ۢ֫), (r26v4 l.᩵ۢ֫), (r26v5 l.᩵ۢ֫), (r26v16 l.᩵ۢ֫), (r26v25 l.᩵ۢ֫) binds: [B:116:0x053d, B:113:0x0529, B:99:0x044f, B:62:0x0214, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0553: PHI (r27v17 android.content.pm.ApplicationInfo) = 
      (r27v3 android.content.pm.ApplicationInfo)
      (r27v4 android.content.pm.ApplicationInfo)
      (r27v5 android.content.pm.ApplicationInfo)
      (r27v16 android.content.pm.ApplicationInfo)
      (r27v21 android.content.pm.ApplicationInfo)
     binds: [B:116:0x053d, B:113:0x0529, B:99:0x044f, B:62:0x0214, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0553: PHI (r28v17 android.content.pm.PackageInfo) = 
      (r28v3 android.content.pm.PackageInfo)
      (r28v4 android.content.pm.PackageInfo)
      (r28v5 android.content.pm.PackageInfo)
      (r28v16 android.content.pm.PackageInfo)
      (r28v21 android.content.pm.PackageInfo)
     binds: [B:116:0x053d, B:113:0x0529, B:99:0x044f, B:62:0x0214, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0553: PHI (r29v21 java.lang.String) = 
      (r29v3 java.lang.String)
      (r29v4 java.lang.String)
      (r29v5 java.lang.String)
      (r29v16 java.lang.String)
      (r29v26 java.lang.String)
     binds: [B:116:0x053d, B:113:0x0529, B:99:0x044f, B:62:0x0214, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x017a A[PHI: r4 r25
      0x017a: PHI (r4v16 l.᩵ۢ֫) = (r4v15 l.᩵ۢ֫), (r4v2 l.᩵ۢ֫), (r4v2 l.᩵ۢ֫) binds: [B:43:0x0164, B:39:0x0132, B:36:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r25v31 java.lang.String) = (r25v29 java.lang.String), (r25v30 java.lang.String), (r25v32 java.lang.String) binds: [B:43:0x0164, B:39:0x0132, B:36:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ArrayList arrayList;
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo;
        String str;
        C15945 c15945;
        C12267 c12267;
        C14504 c14504;
        int iM2761;
        int i;
        int i2;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C15945 c15946;
        int i3;
        int i4;
        int i5;
        int iM3169;
        int iM31610;
        int i6;
        int i7;
        int i8 = C2354.f7599;
        int i9 = C1826.f6190;
        int iM2762 = (C0619.m2761("ܽۚ") ^ i8) * 87;
        int i10 = ((iM2762 ^ i9) * 15961) ^ (-874834156);
        C9829 c9829M30645 = null;
        C15945 c15947 = null;
        PackageInfo packageInfo2 = null;
        ArrayList arrayList4 = null;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        Runnable runnable = null;
        String str3 = null;
        final C14504 c14505 = null;
        C20472 c20472 = null;
        int i11 = iM2762 ^ (-1900186556);
        Iterator itM7968 = null;
        C9829 c9829M30646 = null;
        ApplicationInfo applicationInfo2 = null;
        int i12 = 0;
        C12267 c12268 = null;
        C15945 c15948 = null;
        String str4 = null;
        int i13 = 1250114576;
        while (true) {
            i13 = i11 ^ (i10 & (((i13 ^ i9) * (-27379)) >> 31));
            switch (i13) {
                case -2091276557:
                case 1813472084:
                    C1519.m5406(arrayList4, c20472);
                    str = str3;
                    c15945 = c15948;
                    int iM31611 = (C0773.m3169("᩻᩷") + i8) * 77;
                    i11 = 261381018 ^ iM31611;
                    i10 = ((iM31611 ^ i9) * (-5949)) ^ (-584148482);
                    c15948 = c15945;
                    c12268 = c12268;
                    str3 = str;
                    c20472 = c20472;
                    str4 = str4;
                    break;
                case -2067351801:
                case 471457265:
                    str = str3;
                    packageInfo2 = (PackageInfo) C4238.m13529(itM7968);
                    applicationInfo2 = packageInfo2.applicationInfo;
                    if (applicationInfo2 == null) {
                        c15945 = c15948;
                        int iM31612 = (C0773.m3169("᩻᩷") + i8) * 77;
                        i11 = 261381018 ^ iM31612;
                        i10 = ((iM31612 ^ i9) * (-5949)) ^ (-584148482);
                        c15948 = c15945;
                        c12268 = c12268;
                        str3 = str;
                        c20472 = c20472;
                        str4 = str4;
                    } else {
                        iM31610 = C0773.m3169("᩷᩷") ^ i9;
                        i6 = ((iM31610 ^ i8) * 6505) ^ 326752916;
                        i7 = 2144726282;
                        i11 = i7 ^ iM31610;
                        i10 = i6;
                        i13 = i13;
                        str3 = str;
                    }
                    break;
                case -2065709559:
                case -1780709305:
                    str = str3;
                    if (C3492.m11490(c20472.f65589, packageInfo2.packageName)) {
                        iM31610 = (C0619.m2761("ۚ۬") ^ i9) * 81;
                        i6 = ((iM31610 ^ i8) * (-9883)) ^ 124460820;
                        i7 = -507676361;
                    } else {
                        iM31610 = C0619.m2761("ܶ᩷") ^ i9;
                        i6 = ((iM31610 ^ i8) * 10203) ^ 697457178;
                        i7 = -1262636962;
                    }
                    i11 = i7 ^ iM31610;
                    i10 = i6;
                    i13 = i13;
                    str3 = str;
                    break;
                case -2063708194:
                case 1558464855:
                    C2023.m6964();
                    if (C1321.f4751 < 0) {
                        c20472 = c20472;
                        applicationInfo = applicationInfo2;
                        packageInfo = packageInfo2;
                        c12268 = c12268;
                        str4 = str4;
                        str = str3;
                        c15945 = c15948;
                        int iM31613 = (i9 - C0773.m3169("ܰܰ")) * (-55);
                        i11 = 1810456567 ^ iM31613;
                        i10 = ((iM31613 ^ i8) * 14895) ^ 409652437;
                        c15948 = c15945;
                        c12268 = c12268;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        arrayList4 = null;
                        runnable = null;
                    } else {
                        str = str3;
                        iM31610 = C0619.m2761("۫᩵") ^ i9;
                        i6 = ((iM31610 ^ i8) * 31447) ^ 75245542;
                        i7 = -1898585365;
                        i11 = i7 ^ iM31610;
                        i10 = i6;
                        i13 = i13;
                        str3 = str;
                    }
                    break;
                case -2003894085:
                case 1982945372:
                    str = str3;
                    c20472 = (C20472) C2310.m7814(c14505.f45628, packageInfo2.packageName);
                    if (c20472 != null) {
                        iM31610 = C0619.m2761("ۙۤ") ^ i8;
                        i6 = ((iM31610 ^ i9) * (-8179)) ^ (-1079787550);
                        i7 = 96230140;
                    } else {
                        iM31610 = C0619.m2761("ܶ᩷") ^ i9;
                        i6 = ((iM31610 ^ i8) * 10203) ^ 697457178;
                        i7 = -1262636962;
                    }
                    i11 = i7 ^ iM31610;
                    i10 = i6;
                    i13 = i13;
                    str3 = str;
                    break;
                case -1992165624:
                case -1783708072:
                    if (C3734.f12817 >= 0) {
                        str = str3;
                        iM31610 = C0619.m2761("ۘۜ") ^ i8;
                        i6 = ((iM31610 ^ i9) * (-27)) ^ (-302301610);
                        i7 = -863724605;
                        i11 = i7 ^ iM31610;
                        i10 = i6;
                        i13 = i13;
                        str3 = str;
                    } else {
                        arrayList = arrayList4;
                        c20472 = c20472;
                        applicationInfo = applicationInfo2;
                        packageInfo = packageInfo2;
                        c12267 = c12268;
                        str4 = str4;
                        str2 = str3;
                        c15945 = c15948;
                        c14504 = c14505;
                        int iM2763 = C0619.m2761("ۧۨ") ^ i8;
                        arrayList4 = arrayList;
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        str3 = str2;
                        i13 = i13;
                        i11 = iM2763 ^ (-1166801862);
                        i10 = ((iM2763 ^ i9) * (-16167)) ^ (-390024616);
                    }
                    break;
                case -1776417524:
                case -427237081:
                    break;
                case -1639159665:
                case 1810264535:
                    arrayList = arrayList4;
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    c12267 = c12268;
                    str4 = str4;
                    str = str3;
                    c15945 = c15948;
                    c14504 = c14505;
                    if (this.f80771 != null) {
                        iM2761 = C0773.m3169("ۡ۟") ^ i8;
                        i = ((iM2761 ^ i9) * 16677) ^ 741116573;
                        i2 = -2136290411;
                    } else {
                        iM2761 = C0773.m3169("֫ۘ") ^ i9;
                        i = ((iM2761 ^ i8) * 23741) ^ (-170653511);
                        i2 = -2106760115;
                    }
                    i11 = i2 ^ iM2761;
                    i10 = i;
                    arrayList4 = arrayList;
                    c15948 = c15945;
                    c12268 = c12267;
                    c14505 = c14504;
                    str3 = str;
                    c20472 = c20472;
                    applicationInfo2 = applicationInfo;
                    packageInfo2 = packageInfo;
                    str4 = str4;
                    break;
                case -1349816889:
                case 2013988758:
                    arrayList3 = arrayList4;
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    str4 = str4;
                    str = str3;
                    c15946 = c15948;
                    c14504 = c14505;
                    c9829M30645 = viewOnClickListenerC7793.f25880.m30645(arrayList3);
                    c12268 = viewOnClickListenerC7793.f25872;
                    if (C0619.m2763()) {
                        iM3169 = C0773.m3169("ᩳ۬") ^ i8;
                        i5 = ((iM3169 ^ i9) * (-14347)) ^ 303330028;
                        i4 = 1187741208;
                    } else {
                        iM3169 = C0619.m2761("ۖܳ") ^ i9;
                        i5 = ((iM3169 ^ i8) * (-15651)) ^ (-1147959844);
                        i4 = 761082204;
                    }
                    i11 = i4 ^ iM3169;
                    i10 = i5;
                    arrayList4 = arrayList3;
                    c15948 = c15946;
                    c14505 = c14504;
                    str3 = str;
                    c20472 = c20472;
                    applicationInfo2 = applicationInfo;
                    packageInfo2 = packageInfo;
                    str4 = str4;
                    break;
                case -1226611093:
                case 1301852835:
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    c12268 = c12268;
                    str4 = str4;
                    str = str3;
                    c15945 = c15948;
                    C14504 c14504M21231 = ViewOnClickListenerC7793.m21231(viewOnClickListenerC7793);
                    List list = this.f80771;
                    if (C2966.f9654 < 0) {
                        arrayList4 = new ArrayList(C3448.m11247(list));
                        c14505 = c14504M21231;
                        itM7968 = C2354.m7968(list);
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        int iM31614 = (C0773.m3169("᩻᩷") + i8) * 77;
                        i11 = 261381018 ^ iM31614;
                        i10 = ((iM31614 ^ i9) * (-5949)) ^ (-584148482);
                        c15948 = c15945;
                        c12268 = c12268;
                        str3 = str;
                        c20472 = c20472;
                        str4 = str4;
                    } else {
                        c14505 = c14504M21231;
                        int iM31615 = (i9 - C0773.m3169("ܰܰ")) * (-55);
                        i11 = 1810456567 ^ iM31615;
                        i10 = ((iM31615 ^ i8) * 14895) ^ 409652437;
                        c15948 = c15945;
                        c12268 = c12268;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        arrayList4 = null;
                        runnable = null;
                    }
                    break;
                case -1031093568:
                case -331663042:
                    arrayList = arrayList4;
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    c12267 = c12268;
                    str4 = str4;
                    str = str3;
                    c15945 = c15948;
                    c14504 = c14505;
                    if (ViewOnClickListenerC7793.m21210(viewOnClickListenerC7793, i12, this.f80775, this.f80776, str4, str)) {
                        iM2761 = C0773.m3169("֫ۘ") ^ i9;
                        i = ((iM2761 ^ i8) * 23741) ^ (-170653511);
                        i2 = -2106760115;
                    } else {
                        iM2761 = (i8 - C0773.m3169("ۨܿ")) * (-69);
                        i = ((iM2761 ^ i9) * (-5959)) ^ (-1120807700);
                        i2 = -1598393656;
                    }
                    i11 = i2 ^ iM2761;
                    i10 = i;
                    arrayList4 = arrayList;
                    c15948 = c15945;
                    c12268 = c12267;
                    c14505 = c14504;
                    str3 = str;
                    c20472 = c20472;
                    applicationInfo2 = applicationInfo;
                    packageInfo2 = packageInfo;
                    str4 = str4;
                    break;
                case -949347920:
                case -812133161:
                    arrayList = arrayList4;
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    c15945 = c15948;
                    c12267 = c12268;
                    c14504 = c14505;
                    String str5 = this.f80774;
                    str2 = this.f80770;
                    i12 = this.f80773;
                    if (C1542.f5343 > 0) {
                        int iM2764 = C0619.m2761("ܰ۫") ^ i9;
                        int i14 = ((iM2764 ^ i8) * (-16971)) ^ (-140170046);
                        i11 = iM2764 ^ (-1998655646);
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str5;
                        str3 = str2;
                        i10 = i14;
                        arrayList4 = arrayList;
                        i13 = i13;
                    } else {
                        str4 = str5;
                        int iM2765 = C0619.m2761("ۧۨ") ^ i8;
                        arrayList4 = arrayList;
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        str3 = str2;
                        i13 = i13;
                        i11 = iM2765 ^ (-1166801862);
                        i10 = ((iM2765 ^ i9) * (-16167)) ^ (-390024616);
                    }
                    break;
                case -832073975:
                case 1651893606:
                    arrayList = arrayList4;
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    c12267 = c12268;
                    str4 = str4;
                    str = str3;
                    c15945 = c15948;
                    c14504 = c14505;
                    if (C1826.m6317(itM7968)) {
                        iM2761 = C0773.m3169("۫᩷") ^ i8;
                        i = ((iM2761 ^ i9) * 17155) ^ 2034801191;
                        i2 = -1938217843;
                    } else {
                        iM2761 = C0773.m3169("ۙ᩹") ^ i9;
                        i = ((iM2761 ^ i8) * 27407) ^ (-1807771160);
                        i2 = -881938208;
                    }
                    i11 = i2 ^ iM2761;
                    i10 = i;
                    arrayList4 = arrayList;
                    c15948 = c15945;
                    c12268 = c12267;
                    c14505 = c14504;
                    str3 = str;
                    c20472 = c20472;
                    applicationInfo2 = applicationInfo;
                    packageInfo2 = packageInfo;
                    str4 = str4;
                    break;
                case -799508040:
                case 2004335952:
                    str = str3;
                    RunnableC0334.m2054(arrayList4, new C20472(packageInfo2));
                    c15945 = c15948;
                    int iM31616 = (C0773.m3169("᩻᩷") + i8) * 77;
                    i11 = 261381018 ^ iM31616;
                    i10 = ((iM31616 ^ i9) * (-5949)) ^ (-584148482);
                    c15948 = c15945;
                    c12268 = c12268;
                    str3 = str;
                    c20472 = c20472;
                    str4 = str4;
                    break;
                case -693613231:
                case -357836997:
                    C0950.m3785();
                    if (AbstractC3624.f12429 <= 0) {
                        int iM31617 = C0773.m3169("ᩳۨ") ^ i9;
                        i11 = 1630565631 ^ iM31617;
                        i10 = ((iM31617 ^ i8) * 30299) ^ (-1995949588);
                        i13 = i13;
                    } else {
                        arrayList = arrayList4;
                        c20472 = c20472;
                        applicationInfo = applicationInfo2;
                        packageInfo = packageInfo2;
                        c12267 = c12268;
                        str4 = str4;
                        str2 = str3;
                        c15945 = c15948;
                        c14504 = c14505;
                        int iM2766 = C0619.m2761("ۧۨ") ^ i8;
                        arrayList4 = arrayList;
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        str3 = str2;
                        i13 = i13;
                        i11 = iM2766 ^ (-1166801862);
                        i10 = ((iM2766 ^ i9) * (-16167)) ^ (-390024616);
                    }
                    break;
                case -365944346:
                case -257425957:
                    C1783.m6232();
                    break;
                case 63860131:
                case 821357992:
                    arrayList = arrayList4;
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    C12267 c12269 = c12268;
                    str4 = str4;
                    str = str3;
                    c15945 = c15948;
                    this.f80772 = c15945;
                    final int i15 = this.f80773;
                    if (AbstractC0641.f2496 < 0) {
                        final int i16 = this.f80775;
                        final int i17 = this.f80776;
                        if (RunnableC0334.f1808 > 0) {
                            final String str6 = this.f80774;
                            final String str7 = this.f80770;
                            c12267 = c12269;
                            final C9829 c9829 = c9829M30645;
                            final C9829 c98210 = c9829M30646;
                            c14504 = c14505;
                            runnable = new Runnable(this) { // from class: l.֫ۢ֫

                                /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                                public final /* synthetic */ C24948 f6196;

                                {
                                    int i18 = 935267651;
                                    int i19 = AbstractC3624.f12429;
                                    int i20 = C2834.f9334;
                                    int iM31618 = (i19 - C0773.m3169("᩻۠")) * (-83);
                                    int i21 = ((iM31618 ^ i20) * 3427) ^ (-1390718097);
                                    int i22 = -922860585;
                                    while (true) {
                                        i18 = ((((i18 ^ i20) * 24791) >> 31) & i21) ^ (iM31618 ^ i22);
                                        switch (i18) {
                                            case -1777583580:
                                            case 620577080:
                                                if (C3734.f12817 >= 0) {
                                                    iM31618 = (C0773.m3169("ۜ᩺") ^ i20) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                    i21 = ((iM31618 ^ i19) * 4585) ^ 34738644;
                                                    i22 = -914184451;
                                                } else {
                                                    iM31618 = C0773.m3169("ܶۗ") ^ i20;
                                                    i21 = ((iM31618 ^ i19) * 12851) ^ (-460463830);
                                                    i22 = -675733480;
                                                }
                                                break;
                                            case -1759021053:
                                            case 920891923:
                                                if (C2485.f7950 != 0) {
                                                    iM31618 = (C0773.m3169("۟ۧ") + i19) * 71;
                                                    i21 = ((iM31618 ^ i20) * (-2463)) ^ (-253913795);
                                                    i22 = 838562418;
                                                } else {
                                                    iM31618 = C0619.m2761("۬ᩴ") ^ i20;
                                                    i21 = ((iM31618 ^ i19) * (-17797)) ^ 1620593362;
                                                    i22 = -1613461769;
                                                }
                                                break;
                                            case -1754772558:
                                            case -61292465:
                                                if (C20932.m47848() != 0) {
                                                    iM31618 = (C0773.m3169("ۜ᩺") ^ i20) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                    i21 = ((iM31618 ^ i19) * 4585) ^ 34738644;
                                                    i22 = -914184451;
                                                } else {
                                                    iM31618 = C0619.m2761("ۖ᩹") ^ i19;
                                                    i21 = ((iM31618 ^ i20) * (-16929)) ^ 1171857454;
                                                    i22 = 474434361;
                                                }
                                                break;
                                            case -1729072215:
                                            case 1882297346:
                                                if (C3734.f12817 >= 0) {
                                                    iM31618 = (C0773.m3169("۟ۧ") + i19) * 71;
                                                    i21 = ((iM31618 ^ i20) * (-2463)) ^ (-253913795);
                                                    i22 = 838562418;
                                                } else {
                                                    iM31618 = C0619.m2761("ܰۛ") ^ i19;
                                                    i21 = ((iM31618 ^ i20) * (-23863)) ^ (-585432244);
                                                    i22 = -380185031;
                                                }
                                                break;
                                            case -1688721953:
                                            case 1056919596:
                                                if (C2419.m8174() >= 0) {
                                                    iM31618 = (C0619.m2761("ܺۜ") + i19) * (-61);
                                                    i21 = ((iM31618 ^ i20) * 8101) ^ 1991802845;
                                                    i22 = -63113494;
                                                } else {
                                                    iM31618 = C0773.m3169("᩸ۡ") ^ i20;
                                                    i21 = ((iM31618 ^ i19) * 11939) ^ (-1324947278);
                                                    i22 = 690503899;
                                                }
                                                break;
                                            case -1635372992:
                                            case 132130568:
                                                if (C2419.f7754 >= 0) {
                                                    iM31618 = (C0773.m3169("ۜ᩺") ^ i20) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                    i21 = ((iM31618 ^ i19) * 4585) ^ 34738644;
                                                    i22 = -914184451;
                                                } else {
                                                    iM31618 = (C0619.m2761("᩶ۢ") + i19) * (-121);
                                                    i21 = ((iM31618 ^ i20) * (-975)) ^ 237909846;
                                                    i22 = -1923911778;
                                                }
                                                break;
                                            case -1564796840:
                                            case 1075447021:
                                                if (C0862.f3233 != 0) {
                                                    iM31618 = C0619.m2761("۬ᩴ") ^ i20;
                                                    i21 = ((iM31618 ^ i19) * (-17797)) ^ 1620593362;
                                                    i22 = -1613461769;
                                                } else {
                                                    iM31618 = (i20 - C0619.m2761("۟ۚ")) * (-73);
                                                    i21 = ((iM31618 ^ i19) * 30851) ^ (-99900995);
                                                    i22 = 790160175;
                                                }
                                                break;
                                            case -1411813962:
                                            case -898888534:
                                                this.f6196 = this;
                                                if (C2288.f7433 <= 0) {
                                                    iM31618 = (C0773.m3169("ۜ᩺") ^ i20) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                    i21 = ((iM31618 ^ i19) * 4585) ^ 34738644;
                                                    i22 = -914184451;
                                                } else {
                                                    iM31618 = (C0773.m3169("ۗ۬") + i20) * (-61);
                                                    i21 = ((iM31618 ^ i19) * SecP224K1Field.PInv33) ^ (-1580350660);
                                                    i22 = -1234365522;
                                                }
                                                break;
                                            case -1386835295:
                                            case 872890498:
                                                if (C0269.f1558 <= 0) {
                                                    iM31618 = (C0773.m3169("۟ۧ") + i19) * 71;
                                                    i21 = ((iM31618 ^ i20) * (-2463)) ^ (-253913795);
                                                    i22 = 838562418;
                                                } else {
                                                    iM31618 = (C0773.m3169("ۘ᩻") ^ i19) * 3;
                                                    i21 = ((iM31618 ^ i20) * (-727)) ^ (-2070608149);
                                                    i22 = 2102354043;
                                                }
                                                break;
                                            case -1055054615:
                                            case 1717751394:
                                                if (!C17202.f56030) {
                                                    iM31618 = (C0619.m2761("ܺۜ") + i19) * (-61);
                                                    i21 = ((iM31618 ^ i20) * 8101) ^ 1991802845;
                                                    i22 = -63113494;
                                                } else {
                                                    iM31618 = C0619.m2761("۬ᩴ") ^ i20;
                                                    i21 = ((iM31618 ^ i19) * (-17797)) ^ 1620593362;
                                                    i22 = -1613461769;
                                                }
                                                break;
                                            case -794967505:
                                            case -190318245:
                                                C17202.m40372();
                                                C2878.m9491();
                                                iM31618 = (C0619.m2761("ܺۜ") + i19) * (-61);
                                                i21 = ((iM31618 ^ i20) * 8101) ^ 1991802845;
                                                i22 = -63113494;
                                                break;
                                            case -667708873:
                                            case 1871678904:
                                                return;
                                            case -83943798:
                                            case 1260468748:
                                                if (C23916.f77426 <= 0) {
                                                    iM31618 = (C0773.m3169("۟ۧ") + i19) * 71;
                                                    i21 = ((iM31618 ^ i20) * (-2463)) ^ (-253913795);
                                                    i22 = 838562418;
                                                } else {
                                                    iM31618 = C0773.m3169("ۤ۠") ^ i19;
                                                    i21 = ((iM31618 ^ i20) * 6711) ^ (-115574372);
                                                    i22 = -1731766360;
                                                }
                                                break;
                                            case 331210969:
                                            case 1470795408:
                                                if (RunnableC3646.m11813() != 0) {
                                                    iM31618 = (C0773.m3169("ۜ᩺") ^ i20) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                    i21 = ((iM31618 ^ i19) * 4585) ^ 34738644;
                                                    i22 = -914184451;
                                                } else {
                                                    iM31618 = (i20 - C0619.m2761("᩹᩸")) * 73;
                                                    i21 = ((iM31618 ^ i19) * (-8579)) ^ (-180029464);
                                                    i22 = -191052351;
                                                }
                                                break;
                                            case 343505902:
                                            case 1191397527:
                                                C2288.m7767();
                                                C0269.m1775();
                                                throw new RuntimeException();
                                            default:
                                                if (C4238.f15451 >= 0) {
                                                    iM31618 = (C0773.m3169("۟ۧ") + i19) * 71;
                                                    i21 = ((iM31618 ^ i20) * (-2463)) ^ (-253913795);
                                                    i22 = 838562418;
                                                } else {
                                                    iM31618 = (C0773.m3169("᩹ܶ") ^ i20) * (-43);
                                                    i21 = ((iM31618 ^ i19) * (-25483)) ^ (-2048089174);
                                                    i22 = 1378018206;
                                                }
                                                break;
                                        }
                                    }
                                }

                                /* JADX WARN: Code duplicated, block: B:53:0x01fa  */
                                /* JADX WARN: Code duplicated, block: B:61:0x025f A[PHI: r0 r26
                                  0x025f: PHI (r0v59 l.᩵ۢ֫) = (r0v2 l.᩵ۢ֫), (r0v58 l.᩵ۢ֫), (r0v2 l.᩵ۢ֫) binds: [B:60:0x0251, B:49:0x01de, B:46:0x01d5] A[DONT_GENERATE, DONT_INLINE]
                                  0x025f: PHI (r26v3 l.ܶ۠᩹) = (r26v2 l.ܶ۠᩹), (r26v1 l.ܶ۠᩹), (r26v1 l.ܶ۠᩹) binds: [B:60:0x0251, B:49:0x01de, B:46:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:67:0x02b8 A[PHI: r3 r4 r25
                                  0x02b8: PHI (r3v73 l.᩵ۢ֫) = (r3v2 l.᩵ۢ֫), (r3v72 l.᩵ۢ֫), (r3v2 l.᩵ۢ֫) binds: [B:66:0x02a9, B:58:0x0237, B:52:0x01f8] A[DONT_GENERATE, DONT_INLINE]
                                  0x02b8: PHI (r4v54 int) = (r4v53 int), (r4v2 int), (r4v2 int) binds: [B:66:0x02a9, B:58:0x0237, B:52:0x01f8] A[DONT_GENERATE, DONT_INLINE]
                                  0x02b8: PHI (r25v3 l.ܶ۠᩹) = (r25v2 l.ܶ۠᩹), (r25v1 l.ܶ۠᩹), (r25v1 l.ܶ۠᩹) binds: [B:66:0x02a9, B:58:0x0237, B:52:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code restructure failed: missing block: B:25:0x014b, code lost:
                                
                                    if (l.C3033.f9831 < 0) goto L35;
                                 */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void run() {
                                    /*
                                        Method dump skipped, instruction units count: 2922
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: l.RunnableC1827.run():void");
                                }
                            };
                            if (AbstractC0116.m1243() == 0) {
                                iM2761 = (C0619.m2761("᩵۬") + i8) * 25;
                                i = ((iM2761 ^ i9) * (-21781)) ^ (-1294951120);
                                i2 = 869116765;
                                i11 = i2 ^ iM2761;
                                i10 = i;
                                arrayList4 = arrayList;
                                c15948 = c15945;
                                c12268 = c12267;
                                c14505 = c14504;
                                str3 = str;
                                c20472 = c20472;
                                applicationInfo2 = applicationInfo;
                                packageInfo2 = packageInfo;
                                str4 = str4;
                            } else {
                                str2 = str;
                                int iM2767 = C0619.m2761("ۧۨ") ^ i8;
                                arrayList4 = arrayList;
                                c15948 = c15945;
                                c12268 = c12267;
                                c14505 = c14504;
                                c20472 = c20472;
                                applicationInfo2 = applicationInfo;
                                packageInfo2 = packageInfo;
                                str4 = str4;
                                str3 = str2;
                                i13 = i13;
                                i11 = iM2767 ^ (-1166801862);
                                i10 = ((iM2767 ^ i9) * (-16167)) ^ (-390024616);
                            }
                        } else {
                            c12267 = c12269;
                            c14504 = c14505;
                            int iM31618 = C0773.m3169("᩹ۢ") ^ i8;
                            i11 = (-1517750818) ^ iM31618;
                            i10 = ((iM31618 ^ i9) * 6365) ^ (-1375607473);
                            arrayList4 = arrayList;
                            c15948 = c15945;
                            c12268 = c12267;
                            c14505 = c14504;
                            str3 = str;
                            c20472 = c20472;
                            applicationInfo2 = applicationInfo;
                            packageInfo2 = packageInfo;
                            str4 = str4;
                            runnable = null;
                        }
                    } else {
                        c12268 = c12269;
                        int iM31619 = (i9 - C0773.m3169("ܰܰ")) * (-55);
                        i11 = 1810456567 ^ iM31619;
                        i10 = ((iM31619 ^ i8) * 14895) ^ 409652437;
                        c15948 = c15945;
                        c12268 = c12268;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        arrayList4 = null;
                        runnable = null;
                    }
                    break;
                case 97942989:
                case 590520759:
                    AbstractC0641.m2813();
                    if (C11235.m28309() != 0) {
                        arrayList2 = arrayList4;
                        c20472 = c20472;
                        applicationInfo = applicationInfo2;
                        packageInfo = packageInfo2;
                        c12267 = c12268;
                        str4 = str4;
                        str = str3;
                        c14504 = c14505;
                        int iM31620 = (i9 - C0773.m3169("۠ܳ")) * (-89);
                        i11 = 2033404884 ^ iM31620;
                        i10 = ((iM31620 ^ i8) * 26085) ^ (-821491620);
                        arrayList4 = arrayList2;
                        c12268 = c12267;
                        c14505 = c14504;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                    } else {
                        arrayList = arrayList4;
                        c20472 = c20472;
                        applicationInfo = applicationInfo2;
                        packageInfo = packageInfo2;
                        c12267 = c12268;
                        str4 = str4;
                        str2 = str3;
                        c15945 = c15948;
                        c14504 = c14505;
                        int iM2768 = C0619.m2761("ۧۨ") ^ i8;
                        arrayList4 = arrayList;
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        str3 = str2;
                        i13 = i13;
                        i11 = iM2768 ^ (-1166801862);
                        i10 = ((iM2768 ^ i9) * (-16167)) ^ (-390024616);
                    }
                    break;
                case 151950901:
                case 706007371:
                    C0269.m1775();
                    str = str3;
                    iM31610 = C0619.m2761("۫᩵") ^ i9;
                    i6 = ((iM31610 ^ i8) * 31447) ^ 75245542;
                    i7 = -1898585365;
                    i11 = i7 ^ iM31610;
                    i10 = i6;
                    i13 = i13;
                    str3 = str;
                    break;
                case 218355826:
                case 1380511343:
                    str = str3;
                    if (c20472.f65594.lastUpdateTime == packageInfo2.lastUpdateTime) {
                        iM31610 = (C0619.m2761("ۜ᩹") ^ i8) * (-103);
                        i6 = ((iM31610 ^ i9) * (-22983)) ^ 1482329013;
                        i7 = -2062262767;
                    } else {
                        iM31610 = C0619.m2761("ܶ᩷") ^ i9;
                        i6 = ((iM31610 ^ i8) * 10203) ^ 697457178;
                        i7 = -1262636962;
                    }
                    i11 = i7 ^ iM31610;
                    i10 = i6;
                    i13 = i13;
                    str3 = str;
                    break;
                case 281681435:
                case 1782342315:
                    arrayList = arrayList4;
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    c12267 = c12268;
                    str4 = str4;
                    str = str3;
                    c15945 = c15948;
                    c14504 = c14505;
                    ViewOnClickListenerC7793 viewOnClickListenerC7794 = this.f80769;
                    if (this.f80773 != RunnableC0334.m2051(viewOnClickListenerC7794.f25887)) {
                        viewOnClickListenerC7793 = viewOnClickListenerC7794;
                        iM2761 = C0773.m3169("֫ۘ") ^ i9;
                        i = ((iM2761 ^ i8) * 23741) ^ (-170653511);
                        i2 = -2106760115;
                        i11 = i2 ^ iM2761;
                        i10 = i;
                        arrayList4 = arrayList;
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                    } else {
                        int iM2769 = C0619.m2761("ܰۢ") ^ i9;
                        int i18 = ((iM2769 ^ i8) * 1215) ^ 1968684625;
                        i3 = iM2769 ^ (-23633626);
                        viewOnClickListenerC7793 = viewOnClickListenerC7794;
                        i10 = i18;
                        arrayList4 = arrayList;
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        i11 = i3;
                        i13 = i13;
                    }
                    break;
                case 456364045:
                case 1690491510:
                    str = str3;
                    if (applicationInfo2.sourceDir != null) {
                        iM31610 = C0619.m2761("ۧ֡") ^ i8;
                        i6 = ((iM31610 ^ i9) * 29665) ^ (-258518870);
                        i7 = 418370225;
                        i11 = i7 ^ iM31610;
                        i10 = i6;
                        i13 = i13;
                        str3 = str;
                    } else {
                        c15945 = c15948;
                        int iM316110 = (C0773.m3169("᩻᩷") + i8) * 77;
                        i11 = 261381018 ^ iM316110;
                        i10 = ((iM316110 ^ i9) * (-5949)) ^ (-584148482);
                        c15948 = c15945;
                        c12268 = c12268;
                        str3 = str;
                        c20472 = c20472;
                        str4 = str4;
                    }
                    break;
                case 712777490:
                case 1068143898:
                    str = str3;
                    if (C2310.f7472 < 0) {
                        Consumer consumer = new Consumer() { // from class: l.ۧۢ֫
                            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                                return C12312.$default$andThen(this, consumer2);
                            }

                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void n(Object obj) {
                                int i19 = 476865795;
                                int i20 = C1146.f4234;
                                int i21 = RunnableC3055.f9898;
                                int iM27610 = C0619.m2761("ܰ֨") ^ i21;
                                int i22 = ((iM27610 ^ i20) * 16149) ^ (-1836450174);
                                int i23 = 260746669;
                                while (true) {
                                    i19 = ((((i19 ^ i20) * 26099) >> 31) & i22) ^ (iM27610 ^ i23);
                                    switch (i19) {
                                        case -2139728645:
                                        case 873991191:
                                            C0862.m3503();
                                            if (C3998.f13671 != 0) {
                                                iM27610 = C0773.m3169("᩻۬") ^ i21;
                                                i22 = ((iM27610 ^ i20) * (-24031)) ^ (-636463976);
                                                i23 = 1688051754;
                                            } else {
                                                iM27610 = (C0619.m2761("᩸ۚ") ^ i20) * 49;
                                                i22 = ((iM27610 ^ i21) * (-10737)) ^ 494031723;
                                                i23 = -1871802861;
                                            }
                                            break;
                                        case -1938387683:
                                        case -280331067:
                                            if (C1542.f5343 <= 0) {
                                                iM27610 = (i20 - C0773.m3169("ۜۘ")) * (-119);
                                                i22 = ((iM27610 ^ i21) * 19761) ^ (-774426754);
                                                i23 = -1008509023;
                                            } else {
                                                iM27610 = C0619.m2761("᩶ۢ") ^ i21;
                                                i22 = ((iM27610 ^ i20) * (-3447)) ^ (-1935754654);
                                                i23 = -257922849;
                                            }
                                            break;
                                        case -1904055169:
                                        case -1443966000:
                                            C2288.m7767();
                                            if (C11235.f35427 >= 0) {
                                                iM27610 = (C0619.m2761("᩸ۚ") ^ i20) * 49;
                                                i22 = ((iM27610 ^ i21) * (-10737)) ^ 494031723;
                                                i23 = -1871802861;
                                            } else {
                                                iM27610 = (i20 - C0619.m2761("ۚܰ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i22 = ((iM27610 ^ i21) * 30411) ^ (-545579995);
                                                i23 = 1599218474;
                                            }
                                            break;
                                        case -1605262448:
                                        case 2138940209:
                                            if (RunnableC1848.f6235) {
                                                iM27610 = (i20 - C0619.m2761("ۚܰ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i22 = ((iM27610 ^ i21) * 30411) ^ (-545579995);
                                                i23 = 1599218474;
                                            } else {
                                                iM27610 = C0773.m3169("ۜܺ") ^ i21;
                                                i22 = ((iM27610 ^ i20) * (-27499)) ^ (-501121669);
                                                i23 = 437720258;
                                            }
                                            break;
                                        case -1433674513:
                                        case -302547106:
                                            if (RunnableC0334.m2063()) {
                                                iM27610 = (C0619.m2761("᩸ۚ") ^ i20) * 49;
                                                i22 = ((iM27610 ^ i21) * (-10737)) ^ 494031723;
                                                i23 = -1871802861;
                                            } else {
                                                iM27610 = C0773.m3169("ᩳۗ") ^ i20;
                                                i22 = ((iM27610 ^ i21) * 25459) ^ 1315217426;
                                                i23 = 1934817302;
                                            }
                                            break;
                                        case -1025234725:
                                        case -267700072:
                                            if (C1564.f5401 <= 0) {
                                                iM27610 = (i20 - C0773.m3169("ۜۘ")) * (-119);
                                                i22 = ((iM27610 ^ i21) * 19761) ^ (-774426754);
                                                i23 = -1008509023;
                                            } else {
                                                iM27610 = C0773.m3169("᩺ܶ") ^ i20;
                                                i22 = ((iM27610 ^ i21) * 12183) ^ (-1446439208);
                                                i23 = -463628658;
                                            }
                                            break;
                                        case -1020748592:
                                        case -901083036:
                                            if (RunnableC0334.m2063()) {
                                                iM27610 = (C0619.m2761("᩸ۚ") ^ i20) * 49;
                                                i22 = ((iM27610 ^ i21) * (-10737)) ^ 494031723;
                                                i23 = -1871802861;
                                            } else {
                                                iM27610 = C0619.m2761("ܽۢ") ^ i21;
                                                i22 = ((iM27610 ^ i20) * 29523) ^ (-6736384);
                                                i23 = -377136651;
                                            }
                                            break;
                                        case -816488911:
                                        case -147670407:
                                            C2834.m9344();
                                            break;
                                        case -628478370:
                                        case 1411904368:
                                            if (RunnableC1848.f6235) {
                                                iM27610 = (C0619.m2761("᩸ۚ") ^ i20) * 49;
                                                i22 = ((iM27610 ^ i21) * (-10737)) ^ 494031723;
                                                i23 = -1871802861;
                                            } else {
                                                iM27610 = (C0619.m2761("۫ᩳ") ^ i21) * 15;
                                                i22 = ((iM27610 ^ i20) * 16943) ^ 1337008405;
                                                i23 = -820073601;
                                            }
                                            break;
                                        case -443105711:
                                        case 798992133:
                                            if (C0619.m2763()) {
                                                iM27610 = C0773.m3169("᩻۬") ^ i21;
                                                i22 = ((iM27610 ^ i20) * (-24031)) ^ (-636463976);
                                                i23 = 1688051754;
                                            } else {
                                                iM27610 = (i20 - C0619.m2761("۫ۨ")) * (-69);
                                                i22 = ((iM27610 ^ i21) * (-3599)) ^ (-1551884938);
                                                i23 = 1181299369;
                                            }
                                            break;
                                        case -129910666:
                                        case 274496283:
                                            C1542.m5459();
                                            iM27610 = (i21 - C0773.m3169("᩻۫")) * 119;
                                            i22 = ((iM27610 ^ i20) * 2085) ^ (-1430045842);
                                            i23 = 650443477;
                                            break;
                                        case 60377396:
                                        case 758799629:
                                            if (C1542.f5343 <= 0) {
                                                iM27610 = (i20 - C0619.m2761("ۚܰ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i22 = ((iM27610 ^ i21) * 30411) ^ (-545579995);
                                                i23 = 1599218474;
                                            } else {
                                                iM27610 = C0773.m3169("᩺᩺") ^ i20;
                                                i22 = ((iM27610 ^ i21) * (-8889)) ^ (-539955637);
                                                i23 = 271299282;
                                            }
                                            break;
                                        case 703357230:
                                        case 1332430219:
                                            if (C11235.f35427 >= 0) {
                                                iM27610 = C0773.m3169("᩻۬") ^ i21;
                                                i22 = ((iM27610 ^ i20) * (-24031)) ^ (-636463976);
                                                i23 = 1688051754;
                                            } else {
                                                iM27610 = (C0619.m2761("᩶۠") + i21) * (-89);
                                                i22 = ((iM27610 ^ i20) * (-31097)) ^ 1965285169;
                                                i23 = 809876845;
                                            }
                                            break;
                                        case 1301524292:
                                        case 1459874163:
                                            C2375.m8065();
                                            if (C2702.f8586 <= 0) {
                                                iM27610 = (i20 - C0619.m2761("ۚܰ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i22 = ((iM27610 ^ i21) * 30411) ^ (-545579995);
                                                i23 = 1599218474;
                                            } else {
                                                iM27610 = (i21 - C0773.m3169("᩻۫")) * 119;
                                                i22 = ((iM27610 ^ i20) * 2085) ^ (-1430045842);
                                                i23 = 650443477;
                                            }
                                            break;
                                        case 1331683316:
                                        case 2025505835:
                                            if (C2702.f8586 <= 0) {
                                                iM27610 = (i21 - C0773.m3169("᩻۫")) * 119;
                                                i22 = ((iM27610 ^ i20) * 2085) ^ (-1430045842);
                                                i23 = 650443477;
                                            } else {
                                                iM27610 = (C0619.m2761("ܰ۫") ^ i20) * 59;
                                                i22 = ((iM27610 ^ i21) * (-11803)) ^ 1553665083;
                                                i23 = 544788158;
                                            }
                                            break;
                                        default:
                                            C17202.m40369(this.f36264);
                                            break;
                                    }
                                    return;
                                }
                            }
                        };
                        if (C1542.m5459() < 0) {
                            arrayList = arrayList4;
                            c20472 = c20472;
                            applicationInfo = applicationInfo2;
                            packageInfo = packageInfo2;
                            str4 = str4;
                            c15945 = c15948;
                            C3448.m11245(new C16742(viewOnClickListenerC7793, c15947, c9829M30645, c9829M30646, runnable, consumer, new RunnableC10858(1)));
                            c12267 = c12268;
                            c14504 = c14505;
                            iM2761 = C0773.m3169("֫ۘ") ^ i9;
                            i = ((iM2761 ^ i8) * 23741) ^ (-170653511);
                            i2 = -2106760115;
                            i11 = i2 ^ iM2761;
                            i10 = i;
                            arrayList4 = arrayList;
                            c15948 = c15945;
                            c12268 = c12267;
                            c14505 = c14504;
                            str3 = str;
                            c20472 = c20472;
                            applicationInfo2 = applicationInfo;
                            packageInfo2 = packageInfo;
                            str4 = str4;
                        } else {
                            iM31610 = C0619.m2761("۫᩵") ^ i9;
                            i6 = ((iM31610 ^ i8) * 31447) ^ 75245542;
                            i7 = -1898585365;
                            i11 = i7 ^ iM31610;
                            i10 = i6;
                            i13 = i13;
                            str3 = str;
                        }
                    } else {
                        iM31610 = C0619.m2761("ۘۜ") ^ i8;
                        i6 = ((iM31610 ^ i9) * (-27)) ^ (-302301610);
                        i7 = -863724605;
                        i11 = i7 ^ iM31610;
                        i10 = i6;
                        i13 = i13;
                        str3 = str;
                    }
                    break;
                case 904644551:
                case 1010150094:
                    if (C2287.f7432 >= 0) {
                        arrayList3 = arrayList4;
                        c20472 = c20472;
                        applicationInfo = applicationInfo2;
                        packageInfo = packageInfo2;
                        str4 = str4;
                        str = str3;
                        c15946 = c15948;
                        c14504 = c14505;
                        iM3169 = C0773.m3169("ᩳ۬") ^ i8;
                        i5 = ((iM3169 ^ i9) * (-14347)) ^ 303330028;
                        i4 = 1187741208;
                        i11 = i4 ^ iM3169;
                        i10 = i5;
                        arrayList4 = arrayList3;
                        c15948 = c15946;
                        c14505 = c14504;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                    } else {
                        arrayList = arrayList4;
                        c20472 = c20472;
                        applicationInfo = applicationInfo2;
                        packageInfo = packageInfo2;
                        c12267 = c12268;
                        str4 = str4;
                        str2 = str3;
                        c15945 = c15948;
                        c14504 = c14505;
                        int iM27610 = C0619.m2761("ۧۨ") ^ i8;
                        arrayList4 = arrayList;
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        str3 = str2;
                        i13 = i13;
                        i11 = iM27610 ^ (-1166801862);
                        i10 = ((iM27610 ^ i9) * (-16167)) ^ (-390024616);
                    }
                    break;
                case 915239548:
                case 958012584:
                    C3077.m10041();
                    if (!RunnableC1848.f6235) {
                        arrayList = arrayList4;
                        c20472 = c20472;
                        applicationInfo = applicationInfo2;
                        packageInfo = packageInfo2;
                        c12267 = c12268;
                        str4 = str4;
                        str2 = str3;
                        c15945 = c15948;
                        c14504 = c14505;
                        int iM27611 = C0619.m2761("ۧۨ") ^ i8;
                        arrayList4 = arrayList;
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        str3 = str2;
                        i13 = i13;
                        i11 = iM27611 ^ (-1166801862);
                        i10 = ((iM27611 ^ i9) * (-16167)) ^ (-390024616);
                    } else {
                        str = str3;
                        iM31610 = C0619.m2761("۫᩵") ^ i9;
                        i6 = ((iM31610 ^ i8) * 31447) ^ 75245542;
                        i7 = -1898585365;
                        i11 = i7 ^ iM31610;
                        i10 = i6;
                        i13 = i13;
                        str3 = str;
                    }
                    break;
                case 991398871:
                case 1551420936:
                    arrayList2 = arrayList4;
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    c12267 = c12268;
                    str4 = str4;
                    str = str3;
                    c14504 = c14505;
                    C15945 c15949 = this.f80772;
                    c15948 = null;
                    if (AbstractC3624.f12429 > 0) {
                        int iM27612 = (C0619.m2761("۫᩶") + i9) * 65;
                        int i19 = ((iM27612 ^ i8) * 9903) ^ (-783318891);
                        i3 = iM27612 ^ (-1365527302);
                        c15947 = c15949;
                        i10 = i19;
                        arrayList4 = arrayList2;
                        c12268 = c12267;
                        c14505 = c14504;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        i11 = i3;
                        i13 = i13;
                    } else {
                        c15947 = c15949;
                        int iM31621 = (i9 - C0773.m3169("۠ܳ")) * (-89);
                        i11 = 2033404884 ^ iM31621;
                        i10 = ((iM31621 ^ i8) * 26085) ^ (-821491620);
                        arrayList4 = arrayList2;
                        c12268 = c12267;
                        c14505 = c14504;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                    }
                    break;
                case 1236851110:
                case 1490071800:
                    arrayList = arrayList4;
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    c12267 = c12268;
                    str4 = str4;
                    str = str3;
                    c15945 = c15948;
                    c14504 = c14505;
                    c9829M30646 = c12267.m30645(arrayList);
                    if (C2375.f7641 > 0) {
                        iM2761 = C0773.m3169("ۖۛ") ^ i8;
                        i = ((iM2761 ^ i9) * 15561) ^ 984114717;
                        i2 = -870834851;
                        i11 = i2 ^ iM2761;
                        i10 = i;
                        arrayList4 = arrayList;
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                    } else {
                        int iM316111 = C0773.m3169("᩹ۢ") ^ i8;
                        i11 = (-1517750818) ^ iM316111;
                        i10 = ((iM316111 ^ i9) * 6365) ^ (-1375607473);
                        arrayList4 = arrayList;
                        c15948 = c15945;
                        c12268 = c12267;
                        c14505 = c14504;
                        str3 = str;
                        c20472 = c20472;
                        applicationInfo2 = applicationInfo;
                        packageInfo2 = packageInfo;
                        str4 = str4;
                        runnable = null;
                    }
                    break;
                default:
                    arrayList = arrayList4;
                    c20472 = c20472;
                    applicationInfo = applicationInfo2;
                    packageInfo = packageInfo2;
                    c12267 = c12268;
                    str4 = str4;
                    str = str3;
                    c15945 = c15948;
                    c14504 = c14505;
                    if (viewOnClickListenerC7793.m21234()) {
                        iM2761 = (C0619.m2761("ᩴܿ") ^ i8) * 71;
                        i = ((iM2761 ^ i9) * 27939) ^ (-1301334999);
                        i2 = -1005269398;
                    } else {
                        iM2761 = C0773.m3169("֫ۘ") ^ i9;
                        i = ((iM2761 ^ i8) * 23741) ^ (-170653511);
                        i2 = -2106760115;
                    }
                    i11 = i2 ^ iM2761;
                    i10 = i;
                    arrayList4 = arrayList;
                    c15948 = c15945;
                    c12268 = c12267;
                    c14505 = c14504;
                    str3 = str;
                    c20472 = c20472;
                    applicationInfo2 = applicationInfo;
                    packageInfo2 = packageInfo;
                    str4 = str4;
                    break;
            }
            return;
        }
    }
}
