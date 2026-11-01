package l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩻᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23896 implements InterfaceC7296 {

    /* JADX INFO: renamed from: ۚܿۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f77429 = {4679, 18165, 18146, 18172, 2729, 5150, 5129, 5143, 5146, 5142, 5140, 5207, 5144, 5143, 5149, 5131, 5142, 5136, 5149, 5207, 5135, 5148, 5143, 5149, 5136, 5143, 5150, 5144, 5143, 5149, 5131, 5142, 5136, 5149, 5207, 5136, 5143, 5133, 5148, 5143, 5133, 5207, 5146, 5144, 5133, 5148, 5150, 5142, 5131, 5120, 5207, 5173, 5176, 5164, 5175, 5178, 5169, 5180, 5163, 5150, 5129, 5143, 5144, 5143, 5149, 5131, 5142, 5136, 5149, 5207, 5136, 5143, 5133, 5148, 5143, 5133, 5207, 5146, 5144, 5133, 5148, 5150, 5142, 5131, 5120, 5207, 5168, 5175, 5183, 5174, 9043, 21794, 21813, 21803, -9277, 10815, 12144, 15509, 10069, 10607, -11058, -13036, 572, 2825, -11343, 8440, 7042, 25103, 25088, 25098, 25116, 25089, 25095, 25098, 25152, 25095, 25088, 25114, 25099, 25088, 25114, 25152, 25103, 25101, 25114, 25095, 25089, 25088, 25152, 25123, 25135, 25127, 25120, 25101, 25089, 25091, 25152, 25103, 25088, 25098, 25116, 25089, 25095, 25098, 25152, 25112, 25099, 25088, 25098, 25095, 25088, 25097, 3400, -24600, -24588, -24588, -24592, -24589, -24646, -24657, -24657, -24595, -24588, -24658, -24605, -24605};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Object f77430 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View f77431;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final RunnableC0611 f77432;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f77433;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f77434;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Main f77435;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f77436;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnWindowFocusChangeListenerC16840 f77437;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77438;

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ void mo10182(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo10183(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ void mo10187(InterfaceC1423 interfaceC1423) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52685(C23896 c23896, boolean z) {
        int i = 413593250;
        int i2 = C2477.f9839;
        int i3 = C1025.f4800;
        int iM11306 = ThreadFactoryC3888.m11306("᩻ۖ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 19655) ^ (-609964186);
        int i5 = -1175547654;
        while (true) {
            i = ((((i ^ i3) * (-29225)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2088420416:
                case -1790388939:
                    if (z) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18293) ^ (-273692399);
                        i5 = 220744305;
                    } else {
                        iM11306 = (C19806.m45029("֨֫") ^ i2) * (-75);
                        i4 = ((iM11306 ^ i3) * (-9875)) ^ 1992350163;
                        i5 = -763491398;
                    }
                    break;
                case -2043267942:
                case 1939822684:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (C19806.m45029("ۖܿ") + i3) * (-125);
                        i4 = ((iM11306 ^ i2) * 1207) ^ (-665914521);
                        i5 = 1061818222;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺܰ") + i3) * 101;
                        i4 = ((iM11306 ^ i2) * (-25903)) ^ 2019515013;
                        i5 = -1540203440;
                    }
                    break;
                case -1793155169:
                case 1903221778:
                    C3286.m9798();
                    iM11306 = C19806.m45029("ۜۚ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-15253)) ^ (-1506091441);
                    i5 = -1102022237;
                    break;
                case -1722697316:
                case -932855004:
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13775)) ^ (-2118416140);
                        i5 = -606995040;
                    } else {
                        iM11306 = (C19806.m45029("ۢۘ") + i2) * (-99);
                        i4 = ((iM11306 ^ i3) * (-18245)) ^ (-851036812);
                        i5 = -305793786;
                    }
                    break;
                case -1714001685:
                case -224226903:
                    if (C19806.f63586) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘᩴ")) * 61;
                        i4 = ((iM11306 ^ i2) * (-15201)) ^ (-1793896587);
                        i5 = 1981561290;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩻ۘ")) * 33;
                        i4 = ((iM11306 ^ i3) * (-21589)) ^ (-1214946177);
                        i5 = -525343644;
                    }
                    break;
                case -1023111448:
                case 1860261394:
                    C2124.m6673();
                    break;
                case -908284497:
                case -197956481:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ۖܿ") + i3) * (-125);
                        i4 = ((iM11306 ^ i2) * 1207) ^ (-665914521);
                        i5 = 1061818222;
                    } else {
                        iM11306 = C19806.m45029("֨᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11411) ^ (-717082771);
                        i5 = 204457840;
                    }
                    break;
                case -869121043:
                case 1903061071:
                    C3286.m9798();
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ܿۨ")) * (-57);
                        i4 = ((iM11306 ^ i3) * (-29993)) ^ 1523954947;
                        i5 = 1501539877;
                    } else {
                        iM11306 = C19806.m45029("ۜۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15253)) ^ (-1506091441);
                        i5 = -1102022237;
                    }
                    break;
                case -656549838:
                case -577145268:
                    c23896.m52687();
                    iM11306 = (C19806.m45029("֨֫") ^ i2) * (-75);
                    i4 = ((iM11306 ^ i3) * (-9875)) ^ 1992350163;
                    i5 = -763491398;
                    break;
                case -593560974:
                case 976367003:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("ۢۘ") + i2) * (-99);
                        i4 = ((iM11306 ^ i3) * (-18245)) ^ (-851036812);
                        i5 = -305793786;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-15663)) ^ 1143609529;
                        i5 = 932353089;
                    }
                    break;
                case -294988546:
                case -217169365:
                    break;
                case 14483671:
                case 1201894700:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (i2 - C19806.m45029("ܿۨ")) * (-57);
                        i4 = ((iM11306 ^ i3) * (-29993)) ^ 1523954947;
                        i5 = 1501539877;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܰ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM11306 ^ i2) * (-27393)) ^ 786471638;
                        i5 = -1088698372;
                    }
                    break;
                case 74118824:
                case 426076366:
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("ۜۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15253)) ^ (-1506091441);
                        i5 = -1102022237;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧۖ") ^ i2) * 21;
                        i4 = ((iM11306 ^ i3) * (-24453)) ^ 1730367526;
                        i5 = -59562095;
                    }
                    break;
                case 190895379:
                case 605690922:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘᩴ")) * 61;
                        i4 = ((iM11306 ^ i2) * (-15201)) ^ (-1793896587);
                        i5 = 1981561290;
                    } else {
                        iM11306 = C19806.m45029("᩸۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32523)) ^ (-1223754053);
                        i5 = 426193030;
                    }
                    break;
                case 670727302:
                case 1172975787:
                    if (!C2332.f8260) {
                        iM11306 = C19806.m45029("ۜۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15253)) ^ (-1506091441);
                        i5 = -1102022237;
                    } else {
                        iM11306 = (C19806.m45029("ۢۘ") + i2) * (-99);
                        i4 = ((iM11306 ^ i3) * (-18245)) ^ (-851036812);
                        i5 = -305793786;
                    }
                    break;
                case 1212844636:
                case 1603013176:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ܿۨ")) * (-57);
                        i4 = ((iM11306 ^ i3) * (-29993)) ^ 1523954947;
                        i5 = 1501539877;
                    } else {
                        iM11306 = C19806.m45029("ۧۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-18215)) ^ (-495050868);
                        i5 = 1767158523;
                    }
                    break;
                case 1731025114:
                case 1767181595:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (C19806.m45029("ۢۘ") + i2) * (-99);
                        i4 = ((iM11306 ^ i3) * (-18245)) ^ (-851036812);
                        i5 = -305793786;
                    } else {
                        iM11306 = C19806.m45029("ᩴۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20153)) ^ 742243503;
                        i5 = -1557293443;
                    }
                    break;
                default:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("ۖܿ") + i3) * (-125);
                        i4 = ((iM11306 ^ i2) * 1207) ^ (-665914521);
                        i5 = 1061818222;
                    } else {
                        iM11306 = (C19806.m45029("ۢۘ") + i2) * (-99);
                        i4 = ((iM11306 ^ i3) * (-18245)) ^ (-851036812);
                        i5 = -305793786;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۨ */
    public final void mo10185(InterfaceC1423 interfaceC1423) {
        View view = null;
        int i = 1237225123;
        int i2 = C1419.f5860;
        int i3 = C1398.f5802;
        int iM45029 = C19806.m45029("ۤܽ") ^ i3;
        int i4 = ((iM45029 ^ i2) * 2763) ^ 848318249;
        int i5 = -257671856;
        while (true) {
            i = ((((i ^ i2) * (-535)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1954609147:
                case -1176623117:
                    view = this.f77431;
                    if (C1937.m6279() >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۘۧ")) * 19;
                        i4 = ((iM45029 ^ i2) * (-15281)) ^ (-1660773641);
                        i5 = 49278742;
                    } else {
                        iM45029 = C19806.m45029("ܶܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32487) ^ 1777611066;
                        i5 = -947899356;
                    }
                    break;
                case -1909390526:
                case 1490939738:
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-795)) ^ (-719848281);
                        i5 = -1325031200;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۘ") ^ i2) * (-63);
                        i4 = ((iM45029 ^ i3) * 20583) ^ 95760879;
                        i5 = 662179395;
                    }
                    break;
                case -1889640795:
                case 439579966:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (C19806.m45029("ܺۗ") + i3) * 71;
                        i4 = ((iM45029 ^ i2) * 10871) ^ 1620167798;
                        i5 = 2054776819;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۛ") + i3) * 33;
                        i4 = ((iM45029 ^ i2) * (-4365)) ^ (-928198972);
                        i5 = -822354903;
                    }
                    break;
                case -1875777383:
                case 1061640747:
                    if (C2477.m7593() >= 0) {
                        iM45029 = (C19806.m45029("ܺۗ") + i3) * 71;
                        i4 = ((iM45029 ^ i2) * 10871) ^ 1620167798;
                        i5 = 2054776819;
                    } else {
                        iM45029 = C19806.m45029("᩶ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32087) ^ 1519321466;
                        i5 = 1528590180;
                    }
                    break;
                case -1710207442:
                case 1310639757:
                    ThreadFactoryC3888.m11300();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("ܺۗ") + i3) * 71;
                        i4 = ((iM45029 ^ i2) * 10871) ^ 1620167798;
                        i5 = 2054776819;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5267) ^ 121522692;
                        i5 = -1481701123;
                    }
                    break;
                case -1649254277:
                case 812470460:
                    C2124.m6673();
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("᩻᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23935) ^ 21485759;
                        i5 = -860870018;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-795)) ^ (-719848281);
                        i5 = -1325031200;
                    }
                    break;
                case -1255103297:
                case -665441178:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("᩵ܰ") + i2) * (-45);
                        i4 = ((iM45029 ^ i3) * 12203) ^ (-96549058);
                        i5 = -58858035;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5267) ^ 121522692;
                        i5 = -1481701123;
                    }
                    break;
                case -1127302078:
                case 420703320:
                    C1461.m5080();
                    if (C3535.m10431() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-795)) ^ (-719848281);
                        i5 = -1325031200;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5267) ^ 121522692;
                        i5 = -1481701123;
                    }
                    break;
                case -1073826713:
                case 1242800077:
                    if (C1189.m4368() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-795)) ^ (-719848281);
                        i5 = -1325031200;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۬ᩴ")) * (-87);
                        i4 = ((iM45029 ^ i2) * (-19401)) ^ 212917850;
                        i5 = 1177544067;
                    }
                    break;
                case -609102732:
                case -35844649:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5267) ^ 121522692;
                        i5 = -1481701123;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12515)) ^ 1680111727;
                        i5 = -213663054;
                    }
                    break;
                case 161246805:
                case 1126408388:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("᩻᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23935) ^ 21485759;
                        i5 = -860870018;
                    } else {
                        iM45029 = (C19806.m45029("ۗۨ") ^ i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-18669)) ^ 378469138;
                        i5 = -522693633;
                    }
                    break;
                case 237520880:
                case 1913404006:
                    C1419.m4973();
                    break;
                case 304143332:
                case 743774677:
                    view.removeCallbacks(this.f77432);
                    break;
                case 322054080:
                case 1050791466:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ܺۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29921)) ^ 339999625;
                        i5 = -353913421;
                    } else {
                        iM45029 = (C19806.m45029("ܺۗ") + i3) * 71;
                        i4 = ((iM45029 ^ i2) * 10871) ^ 1620167798;
                        i5 = 2054776819;
                    }
                    break;
                case 1531338594:
                case 1879728611:
                    if (C19806.f63586) {
                        iM45029 = (i3 - C19806.m45029("ۘۧ")) * 19;
                        i4 = ((iM45029 ^ i2) * (-15281)) ^ (-1660773641);
                        i5 = 49278742;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24511) ^ (-1918416368);
                        i5 = -1832362733;
                    }
                    break;
                default:
                    C1189.m4368();
                    C2704.m8255();
                    iM45029 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 5267) ^ 121522692;
                    i5 = -1481701123;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01bf A[PHI: r7 r10 r16
      0x01bf: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:56:0x01bd, B:40:0x0131, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x01bf: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:56:0x01bd, B:40:0x0131, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x01bf: PHI (r16v16 bin.mt.plus.Main) = (r16v6 bin.mt.plus.Main), (r16v11 bin.mt.plus.Main), (r16v17 bin.mt.plus.Main) binds: [B:56:0x01bd, B:40:0x0131, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01f3 A[PHI: r2 r5 r6 r16
      0x01f3: PHI (r2v4 char) = (r2v2 char), (r2v3 char), (r2v2 char), (r2v2 char) binds: [B:60:0x01f1, B:52:0x019c, B:44:0x0154, B:15:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:60:0x01f1, B:52:0x019c, B:44:0x0154, B:15:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:60:0x01f1, B:52:0x019c, B:44:0x0154, B:15:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r16v18 bin.mt.plus.Main) = (r16v5 bin.mt.plus.Main), (r16v7 bin.mt.plus.Main), (r16v10 bin.mt.plus.Main), (r16v19 bin.mt.plus.Main) binds: [B:60:0x01f1, B:52:0x019c, B:44:0x0154, B:15:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0228 A[PHI: r3 r4 r16
      0x0228: PHI (r3v3 short) = (r3v2 short), (r3v4 short) binds: [B:64:0x0226, B:48:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r4v3 short) = (r4v2 short), (r4v4 short) binds: [B:64:0x0226, B:48:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r16v8 bin.mt.plus.Main) = (r16v4 bin.mt.plus.Main), (r16v9 bin.mt.plus.Main) binds: [B:64:0x0226, B:48:0x017b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (l.C1066.m4023() <= 0) goto L15;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m52688(l.C23896 r18) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23896.m52688(l.᩻᩵ۘ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (l.C1189.f5284 > 0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [l.֡᩵ۘ] */
    /* JADX WARN: Type inference failed for: r2v44, types: [android.view.ViewTreeObserver] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ܽ᩵ۘ] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C23896(bin.mt.plus.Main r23) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23896.<init>(bin.mt.plus.Main):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52682(WeakReference weakReference) {
        Object obj = null;
        C23896 c23896 = null;
        int i = 417636761;
        int i2 = C2871.f10837;
        int i3 = C2788.f10625;
        int iM45029 = C19806.m45029("ܰܽ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-26407)) ^ 437352793;
        int i5 = -502721540;
        while (true) {
            i = ((((i ^ i3) * 27867) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2070916315:
                case -1451685465:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (C19806.m45029("֡᩺") + i2) * (-101);
                        i4 = ((iM45029 ^ i3) * 13683) ^ (-993753377);
                        i5 = -1494560334;
                    } else {
                        iM45029 = C19806.m45029("ܶۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3713)) ^ (-1559346665);
                        i5 = 206970943;
                    }
                    break;
                case -2021742635:
                case 1269790140:
                    C10634.m26820();
                    if (C2788.f10625 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14575)) ^ 2099965508;
                        i5 = 1785737144;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29155) ^ (-1326040480);
                        i5 = 1656894812;
                    }
                    break;
                case -1980765600:
                case -169282029:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩷") ^ i2) * 37;
                        i4 = ((iM45029 ^ i3) * 24563) ^ (-1148705302);
                        i5 = -1753489061;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2639) ^ 1185021558;
                        i5 = -1614368898;
                    }
                    break;
                case -1927191093:
                case -18306889:
                    c23896.f77438 = false;
                    c23896.m52687();
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("۫᩷")) * (-53);
                    i4 = ((iM45029 ^ i3) * (-30413)) ^ (-2058227786);
                    i5 = -927632486;
                    break;
                case -1811225936:
                case 758539293:
                    c23896 = (C23896) obj;
                    if (c23896 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13929)) ^ 697301670;
                        i5 = 721855501;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۫᩷")) * (-53);
                        i4 = ((iM45029 ^ i3) * (-30413)) ^ (-2058227786);
                        i5 = -927632486;
                    }
                    break;
                case -1656753400:
                case 715337804:
                    if (C1398.m4895() <= 0) {
                        iM45029 = (C19806.m45029("֡᩺") + i2) * (-101);
                        i4 = ((iM45029 ^ i3) * 13683) ^ (-993753377);
                        i5 = -1494560334;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29155) ^ (-1326040480);
                        i5 = 1656894812;
                    }
                    break;
                case -1628951734:
                case -662473808:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۤ") ^ i3) * (-95);
                        i4 = ((iM45029 ^ i2) * 19495) ^ 595306920;
                        i5 = -1240827916;
                    } else {
                        iM45029 = (C19806.m45029("֡᩺") + i2) * (-101);
                        i4 = ((iM45029 ^ i3) * 13683) ^ (-993753377);
                        i5 = -1494560334;
                    }
                    break;
                case -1565166777:
                case -713428366:
                    if (CallableC1627.f6528) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֨ۙ")) * (-115);
                        i4 = ((iM45029 ^ i2) * (-8311)) ^ (-1828451625);
                        i5 = 1283936326;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩷") ^ i2) * 37;
                        i4 = ((iM45029 ^ i3) * 24563) ^ (-1148705302);
                        i5 = -1753489061;
                    }
                    break;
                case -1242545892:
                case -1231216743:
                    if (C1377.m4833() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29155) ^ (-1326040480);
                        i5 = 1656894812;
                    } else {
                        iM45029 = C19806.m45029("᩺᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 27013) ^ 1284189562;
                        i5 = 1325021188;
                    }
                    break;
                case -1221851956:
                case -1159576712:
                    C19806.m45024();
                    AbstractC0464.m2313();
                    break;
                case -1096362798:
                case 2038635648:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29155) ^ (-1326040480);
                        i5 = 1656894812;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22453) ^ (-358042389);
                        i5 = 1364844473;
                    }
                    break;
                case -1072450251:
                case 1356628105:
                    C0526.m2437();
                    iM45029 = ThreadFactoryC3888.m11306("ۗܽ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 29155) ^ (-1326040480);
                    i5 = 1656894812;
                    break;
                case -475335488:
                case 232663440:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩷") ^ i2) * 37;
                        i4 = ((iM45029 ^ i3) * 24563) ^ (-1148705302);
                        i5 = -1753489061;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۗ") + i3) * (-33);
                        i4 = ((iM45029 ^ i2) * (-17455)) ^ (-1664760954);
                        i5 = 679612034;
                    }
                    break;
                case -274351090:
                case 1019968122:
                    break;
                case -66493001:
                case 1915419828:
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩷") ^ i2) * 37;
                        i4 = ((iM45029 ^ i3) * 24563) ^ (-1148705302);
                        i5 = -1753489061;
                    } else {
                        iM45029 = (C19806.m45029("᩻ᩳ") + i3) * 115;
                        i4 = ((iM45029 ^ i2) * 10177) ^ 612770748;
                        i5 = 945672934;
                    }
                    break;
                case 596504652:
                case 1871824214:
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14575)) ^ 2099965508;
                        i5 = 1785737144;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10893)) ^ 860788885;
                        i5 = 272993905;
                    }
                    break;
                case 1358555005:
                case 1725743515:
                    obj = weakReference.get();
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14575)) ^ 2099965508;
                        i5 = 1785737144;
                    } else {
                        iM45029 = C19806.m45029("᩷ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 28773) ^ (-1216373294);
                        i5 = 1668337182;
                    }
                    break;
                default:
                    if (C1066.m4023() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29155) ^ (-1326040480);
                        i5 = 1656894812;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۤ֨")) * (-37);
                        i4 = ((iM45029 ^ i2) * 22199) ^ (-1269199179);
                        i5 = -511751691;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52683(InterfaceC6025 interfaceC6025, PackageManager packageManager) {
        short s = f77429[4];
        int i = (s * s) + 227466724;
        int i2 = s + 15082;
        int i3 = (i + i) - (i2 * i2) >= 0 ? 5241 : 19694;
        synchronized (f77430) {
            if (interfaceC6025.getInt(ThreadFactoryC3888.m11312(f77429, 5, 3, i3), 0) != 0) {
                return;
            }
            int i4 = 1;
            try {
                packageManager.getApplicationInfo(C3577.m10571(f77429, 8, 19, i3), 0);
                if (m52686(packageManager, C0216.m1588(f77429, 27, 32, i3)) || m52686(packageManager, C3660.m10790(f77429, 62, 28, i3))) {
                    i4 = 2;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            C2249.m6906(CallableC1627.m5517(interfaceC6025).mo4065(i4, C1189.m4365(f77429, 59, 3, i3)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52686(PackageManager packageManager, String str) {
        int iM11306;
        int i;
        int i2;
        int iM45029;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = C1025.f4800;
        int i9 = C10634.f36300;
        int iM450210 = (i8 - C19806.m45029("᩹᩷")) * (-35);
        int i10 = ((iM450210 ^ i9) * (-12799)) ^ 219562569;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = iM450210 ^ 651150024;
        char c = 0;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = 760190377;
        Iterator itM9705 = null;
        Intent intent = null;
        String strM9715 = null;
        Intent intent2 = null;
        while (true) {
            i16 = i11 ^ (i10 & (((i16 ^ i9) * (-25937)) >> 31));
            switch (i16) {
                case -2136982333:
                case 1603378566:
                    intent2 = intent2;
                    strM9715 = strM9715;
                    intent = intent;
                    int i17 = s + s2;
                    if (i14 - (i17 * i17) >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ֫") ^ i8;
                        i3 = ((iM45029 ^ i9) * 14017) ^ (-853853829);
                        i4 = -1408109238;
                    } else {
                        iM45029 = (C19806.m45029("ۧ᩺") ^ i8) * 39;
                        i3 = ((iM45029 ^ i9) * 26833) ^ 1018772428;
                        i4 = 799235315;
                    }
                    int i18 = iM45029 ^ i4;
                    intent = intent;
                    intent2 = intent2;
                    i11 = i18;
                    i10 = i3;
                    strM9715 = strM9715;
                    break;
                case -1979841825:
                case -933250524:
                    if (C2124.f7782 > 0) {
                        iM11306 = (C19806.m45029("ۧᩴ") ^ i8) * (-79);
                        i = ((iM11306 ^ i9) * (-16457)) ^ 1027486019;
                        i2 = -945432122;
                    } else {
                        iM11306 = (C19806.m45029("֡᩶") + i9) * (-33);
                        i = ((iM11306 ^ i8) * (-31679)) ^ (-1034366534);
                        i2 = 68962794;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1876316038:
                case 1571031772:
                    if (C0962.m3748(itM9705)) {
                        iM11306 = (C19806.m45029("ۢۤ") + i9) * 19;
                        i = ((iM11306 ^ i8) * 11659) ^ 1744060038;
                        i2 = 1971286347;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۖ") ^ i8;
                        i = ((iM11306 ^ i9) * 20405) ^ 1807855228;
                        i2 = -1641449072;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1787974766:
                case -875295412:
                    intent2 = intent2;
                    intent = intent;
                    strM9715 = MenuItemOnMenuItemClickListenerC3244.m9715(sArr2, 133, 19, i15);
                    if (C3660.m10791() == 0) {
                        int iM11307 = ThreadFactoryC3888.m11306("ܺۧ") ^ i8;
                        i7 = ((iM11307 ^ i9) * 20211) ^ 428563775;
                        intent = intent;
                        i11 = iM11307 ^ (-1831499862);
                        i10 = i7;
                        intent2 = intent2;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("֡۫") ^ i9;
                        i5 = ((iM11308 ^ i8) * 26349) ^ (-78995344);
                        i6 = iM11308 ^ (-1892645818);
                        intent2 = intent2;
                        Intent intent3 = intent;
                        i11 = i6;
                        i10 = i5;
                        intent = intent3;
                    }
                    break;
                case -1332436412:
                case -340535042:
                    intent2 = intent2;
                    strM9715 = strM9715;
                    intent = intent;
                    c = 'j';
                    if (C2788.m8472() == 0) {
                        iM45029 = (i9 - C19806.m45029("֨᩹")) * (-31);
                        i3 = ((iM45029 ^ i8) * (-24075)) ^ (-750561384);
                        i4 = 822869433;
                        int i19 = iM45029 ^ i4;
                        intent = intent;
                        intent2 = intent2;
                        i11 = i19;
                        i10 = i3;
                        strM9715 = strM9715;
                    } else {
                        strM9715 = strM9715;
                        int iM11309 = ThreadFactoryC3888.m11306("֡۫") ^ i9;
                        i5 = ((iM11309 ^ i8) * 26349) ^ (-78995344);
                        i6 = iM11309 ^ (-1892645818);
                        intent2 = intent2;
                        Intent intent4 = intent;
                        i11 = i6;
                        i10 = i5;
                        intent = intent4;
                    }
                    break;
                case -992755151:
                case 513720705:
                    intent2 = intent2;
                    strM9715 = strM9715;
                    intent = intent;
                    int i20 = i12 + i13;
                    i14 = i20 + i20;
                    s2 = 14067;
                    if (C3743.f13569) {
                        iM45029 = (C19806.m45029("ۨۜ") ^ i9) * 27;
                        i3 = ((iM45029 ^ i8) * (-5903)) ^ 1160313903;
                        i4 = 2063527235;
                        int i110 = iM45029 ^ i4;
                        intent = intent;
                        intent2 = intent2;
                        i11 = i110;
                        i10 = i3;
                        strM9715 = strM9715;
                    }
                    intent = intent;
                    int iM450211 = C19806.m45029("᩹۬") ^ i8;
                    i11 = iM450211 ^ 638609190;
                    i10 = ((iM450211 ^ i9) * (-21369)) ^ (-349940840);
                    intent2 = intent2;
                    strM9715 = strM9715;
                    break;
                case -966616220:
                case -447421353:
                    i15 = 42347;
                    iM45029 = (i9 - C19806.m45029("ܺۤ")) * 101;
                    i3 = ((iM45029 ^ i8) * 13233) ^ (-1975312491);
                    i4 = 362401243;
                    int i111 = iM45029 ^ i4;
                    intent = intent;
                    intent2 = intent2;
                    i11 = i111;
                    i10 = i3;
                    strM9715 = strM9715;
                    break;
                case -702881001:
                case 1546625655:
                    itM9705 = MenuItemOnMenuItemClickListenerC3244.m9705(packageManager.queryIntentActivities(intent, 512));
                    int iM113010 = ThreadFactoryC3888.m11306("ۜۜ") ^ i8;
                    intent = intent;
                    i5 = ((iM113010 ^ i9) * 30471) ^ 1586707290;
                    i6 = iM113010 ^ (-1927993965);
                    Intent intent5 = intent;
                    i11 = i6;
                    i10 = i5;
                    intent = intent5;
                    break;
                case -675003169:
                case 1683867466:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        intent2 = intent2;
                        strM9715 = strM9715;
                        int iM450212 = C19806.m45029("᩹۬") ^ i8;
                        i11 = iM450212 ^ 638609190;
                        i10 = ((iM450212 ^ i9) * (-21369)) ^ (-349940840);
                        intent2 = intent2;
                        strM9715 = strM9715;
                    } else {
                        iM11306 = (C19806.m45029("ۧᩴ") ^ i8) * (-79);
                        i = ((iM11306 ^ i9) * (-16457)) ^ 1027486019;
                        i2 = -945432122;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case -277470493:
                case 1493966818:
                    intent2 = intent2;
                    strM9715 = strM9715;
                    intent = intent;
                    s = sArr[c];
                    i12 = s * s;
                    i13 = 197880489;
                    if (C0629.m2907()) {
                        iM45029 = (C19806.m45029("᩸ۙ") ^ i8) * (-7);
                        i3 = ((iM45029 ^ i9) * 18069) ^ 138786505;
                        i4 = -1882222577;
                        int i112 = iM45029 ^ i4;
                        intent = intent;
                        intent2 = intent2;
                        i11 = i112;
                        i10 = i3;
                        strM9715 = strM9715;
                    }
                    intent = intent;
                    int iM450213 = C19806.m45029("᩹۬") ^ i8;
                    i11 = iM450213 ^ 638609190;
                    i10 = ((iM450213 ^ i9) * (-21369)) ^ (-349940840);
                    intent2 = intent2;
                    strM9715 = strM9715;
                    break;
                case -188559246:
                case -16708503:
                    intent2 = intent2;
                    strM9715 = strM9715;
                    intent = intent;
                    sArr = f77429;
                    if (C1066.f4915 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ֡") ^ i9) * 3;
                        i3 = ((iM45029 ^ i8) * (-18735)) ^ (-2113230441);
                        i4 = -693859924;
                        int i113 = iM45029 ^ i4;
                        intent = intent;
                        intent2 = intent2;
                        i11 = i113;
                        i10 = i3;
                        strM9715 = strM9715;
                    }
                    intent = intent;
                    int iM450214 = C19806.m45029("᩹۬") ^ i8;
                    i11 = iM450214 ^ 638609190;
                    i10 = ((iM450214 ^ i9) * (-21369)) ^ (-349940840);
                    intent2 = intent2;
                    strM9715 = strM9715;
                    break;
                case 321764325:
                case 927275927:
                    return true;
                case 530491009:
                case 808766791:
                    if (!RunnableC1564.m5345()) {
                        iM11306 = (C19806.m45029("֡᩶") + i9) * (-33);
                        i = ((iM11306 ^ i8) * (-31679)) ^ (-1034366534);
                        i2 = 68962794;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    } else {
                        intent2 = intent2;
                        strM9715 = strM9715;
                        intent = intent;
                        iM45029 = (i8 - C19806.m45029("ᩳ֡")) * (-25);
                        i3 = ((iM45029 ^ i9) * 32539) ^ 206417791;
                        i4 = 387036280;
                        int i114 = iM45029 ^ i4;
                        intent = intent;
                        intent2 = intent2;
                        i11 = i114;
                        i10 = i3;
                        strM9715 = strM9715;
                    }
                    break;
                case 597992956:
                case 1113888136:
                    intent = intent2.setPackage(strM9715);
                    if (C1066.f4915 > 0) {
                        int iM113011 = (ThreadFactoryC3888.m11306("ۚ᩶") + i9) * (-65);
                        intent2 = intent2;
                        i7 = ((iM113011 ^ i8) * (-22793)) ^ 2119668602;
                        i11 = iM113011 ^ (-1452957202);
                        i10 = i7;
                        intent2 = intent2;
                    } else {
                        intent2 = intent2;
                        strM9715 = strM9715;
                        int iM450215 = C19806.m45029("᩹۬") ^ i8;
                        i11 = iM450215 ^ 638609190;
                        i10 = ((iM450215 ^ i9) * (-21369)) ^ (-349940840);
                        intent2 = intent2;
                        strM9715 = strM9715;
                    }
                    break;
                case 600564442:
                case 2090916719:
                    i15 = 25198;
                    iM45029 = (i9 - C19806.m45029("ܺۤ")) * 101;
                    i3 = ((iM45029 ^ i8) * 13233) ^ (-1975312491);
                    i4 = 362401243;
                    int i115 = iM45029 ^ i4;
                    intent = intent;
                    intent2 = intent2;
                    i11 = i115;
                    i10 = i3;
                    strM9715 = strM9715;
                    break;
                case 859169002:
                case 1590729221:
                    intent2 = intent2;
                    strM9715 = strM9715;
                    intent = intent;
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i8 - C19806.m45029("ᩳ֡")) * (-25);
                        i3 = ((iM45029 ^ i9) * 32539) ^ 206417791;
                        i4 = 387036280;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩹") ^ i8;
                        i3 = ((iM45029 ^ i9) * (-4489)) ^ 680221806;
                        i4 = 611568490;
                    }
                    int i116 = iM45029 ^ i4;
                    intent = intent;
                    intent2 = intent2;
                    i11 = i116;
                    i10 = i3;
                    strM9715 = strM9715;
                    break;
                case 981712402:
                case 1477469596:
                    if (!((ResolveInfo) C0278.m1776(itM9705)).activityInfo.exported) {
                        int iM113012 = ThreadFactoryC3888.m11306("ۜۜ") ^ i8;
                        intent = intent;
                        i5 = ((iM113012 ^ i9) * 30471) ^ 1586707290;
                        i6 = iM113012 ^ (-1927993965);
                        Intent intent6 = intent;
                        i11 = i6;
                        i10 = i5;
                        intent = intent6;
                    } else {
                        iM11306 = (C19806.m45029("᩸ᩴ") + i9) * 41;
                        i = ((iM11306 ^ i8) * 20897) ^ (-1299331646);
                        i2 = -1357838104;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case 1011086241:
                case 1225111102:
                    intent2 = intent2;
                    intent = intent;
                    short[] sArr3 = f77429;
                    if (C0817.f3443) {
                        strM9715 = strM9715;
                        String strM3361 = C0797.m3361(sArr3, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 26, i15);
                        if (C2871.f10837 < 0) {
                            Intent intentAddCategory = new Intent(strM3361).addCategory(str);
                            sArr2 = f77429;
                            if (C0050.f912 <= 0) {
                                intent2 = intentAddCategory;
                            } else {
                                int iM113013 = (i9 - ThreadFactoryC3888.m11306("۟ܿ")) * 31;
                                intent2 = intentAddCategory;
                                i10 = ((iM113013 ^ i8) * (-2059)) ^ 1965870236;
                                intent = intent;
                                i11 = iM113013 ^ (-357832583);
                            }
                        }
                        strM9715 = strM9715;
                        int iM113014 = ThreadFactoryC3888.m11306("֡۫") ^ i9;
                        i5 = ((iM113014 ^ i8) * 26349) ^ (-78995344);
                        i6 = iM113014 ^ (-1892645818);
                        intent2 = intent2;
                        Intent intent7 = intent;
                        i11 = i6;
                        i10 = i5;
                        intent = intent7;
                    } else {
                        strM9715 = strM9715;
                        intent = intent;
                        int iM450216 = C19806.m45029("᩹۬") ^ i8;
                        i11 = iM450216 ^ 638609190;
                        i10 = ((iM450216 ^ i9) * (-21369)) ^ (-349940840);
                        intent2 = intent2;
                    }
                    strM9715 = strM9715;
                    break;
                case 1028133279:
                case 1318605233:
                    return false;
                case 1469529736:
                case 1593461700:
                    C1148.m4232();
                    C3722.m10894();
                    return false;
                default:
                    RunnableC1564.m5345();
                    C1460.m5050();
                    iM11306 = (C19806.m45029("ۧᩴ") ^ i8) * (-79);
                    i = ((iM11306 ^ i9) * (-16457)) ^ 1027486019;
                    i2 = -945432122;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Runnable m52690() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 979251062;
        int i5 = C0629.f2722;
        int i6 = RunnableC3388.f12514;
        int iM11306 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i5;
        int i7 = ((iM11306 ^ i6) * 12423) ^ (-1512028986);
        int i8 = -989324991;
        while (true) {
            i4 = ((((i4 ^ i6) * (-32259)) >> 31) & i7) ^ (iM11306 ^ i8);
            switch (i4) {
                case -2114620473:
                case -2066693333:
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۚ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 26159) ^ 414862131;
                        i8 = -170311494;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩻") + i5) * (-13);
                        i7 = ((iM11306 ^ i6) * (-15249)) ^ (-1448016043);
                        i8 = -984737231;
                    }
                    break;
                case -1970680004:
                case -1479621384:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C2477.f9839 > 0) {
                        iM11306 = (C19806.m45029("ۨ᩷") ^ i6) * (-99);
                        i7 = ((iM11306 ^ i5) * (-7963)) ^ (-612395600);
                        i8 = 1452360741;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۛۛ")) * 43;
                        i7 = ((iM11306 ^ i6) * (-16619)) ^ (-1737494582);
                        i8 = 306539952;
                    }
                    break;
                case -1854011497:
                case -963079513:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("ᩳۖ") + i6) * 71;
                        i7 = ((iM11306 ^ i5) * 11745) ^ (-1916203513);
                        i8 = 38211852;
                    } else {
                        iM11306 = C19806.m45029("ۨ۟") ^ i5;
                        i7 = ((iM11306 ^ i6) * 4949) ^ 687473595;
                        i8 = -1526826912;
                    }
                    break;
                case -1284583851:
                case -337905439:
                    C7105.m18985();
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("ۛۛ")) * 43;
                    i7 = ((iM11306 ^ i6) * (-16619)) ^ (-1737494582);
                    i8 = 306539952;
                    break;
                case -1273309165:
                case 1024895315:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("ۨ᩷") ^ i6) * (-99);
                        i7 = ((iM11306 ^ i5) * (-7963)) ^ (-612395600);
                        i8 = 1452360741;
                    } else {
                        iM11306 = (i6 - C19806.m45029("۠ۗ")) * (-107);
                        i7 = ((iM11306 ^ i5) * 22661) ^ (-1308319334);
                        i8 = -700242803;
                    }
                    break;
                case -1268522507:
                case -966168331:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (C19806.m45029("ۨ᩷") ^ i6) * (-99);
                        i7 = ((iM11306 ^ i5) * (-7963)) ^ (-612395600);
                        i8 = 1452360741;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۘ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 30621) ^ (-1660747141);
                        i8 = 1486403684;
                    }
                    break;
                case -1215204269:
                case -647240556:
                    if (C2477.m7593() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۚ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 26159) ^ 414862131;
                        i8 = -170311494;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ۧ") ^ i6) * (-47);
                        i7 = ((iM11306 ^ i5) * (-28317)) ^ (-599768653);
                        i8 = 275985664;
                    }
                    break;
                case -850592625:
                case -781235966:
                    C2332.m7079();
                    if (C7105.f23796 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i5) * 19;
                        i7 = ((iM11306 ^ i6) * 16803) ^ 2108936916;
                        i8 = -71840461;
                    } else {
                        iM11306 = (C19806.m45029("ۨ᩷") ^ i6) * (-99);
                        i7 = ((iM11306 ^ i5) * (-7963)) ^ (-612395600);
                        i8 = 1452360741;
                    }
                    break;
                case -767605753:
                case 666276165:
                    i3 = i + i2;
                    if (C1148.m4232() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۚ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 26159) ^ 414862131;
                        i8 = -170311494;
                    } else {
                        iM11306 = C19806.m45029("ܰۖ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-26987)) ^ 1170498523;
                        i8 = -1180700394;
                    }
                    break;
                case -697879673:
                case -56353906:
                    i = this.f77433;
                    if (C1977.f7413 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i5) * 19;
                        i7 = ((iM11306 ^ i6) * 16803) ^ 2108936916;
                        i8 = -71840461;
                    } else {
                        iM11306 = C19806.m45029("֡ۤ") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-13303)) ^ (-133981599);
                        i8 = -1691065814;
                    }
                    break;
                case -373464541:
                case 599114213:
                    i2 = 1;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (C19806.m45029("᩻᩹") ^ i5) * 37;
                        i7 = ((iM11306 ^ i6) * 12677) ^ (-1374845645);
                        i8 = -385515513;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۚ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 26159) ^ 414862131;
                        i8 = -170311494;
                    }
                    break;
                case -310252928:
                case 484425855:
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۛۛ")) * 43;
                        i7 = ((iM11306 ^ i6) * (-16619)) ^ (-1737494582);
                        i8 = 306539952;
                    } else {
                        iM11306 = (C19806.m45029("᩺᩵") ^ i5) * (-111);
                        i7 = ((iM11306 ^ i6) * 27691) ^ 155126960;
                        i8 = -1360000708;
                    }
                    break;
                case 664790287:
                case 1758565493:
                    this.f77433 = i3;
                    return new RunnableC11196(this);
                case 1350935001:
                case 1374050940:
                    C0962.m3746();
                    return null;
                case 1809484358:
                case 2049696061:
                    RunnableC1606.m5473();
                    if (!C0962.f3784) {
                        iM11306 = (C19806.m45029("ᩳۖ") + i6) * 71;
                        i7 = ((iM11306 ^ i5) * 11745) ^ (-1916203513);
                        i8 = 38211852;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i5) * 19;
                        i7 = ((iM11306 ^ i6) * 16803) ^ 2108936916;
                        i8 = -71840461;
                    }
                    break;
                default:
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("᩶ܳ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 5799) ^ (-1897607930);
                        i8 = 536262917;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i5) * 19;
                        i7 = ((iM11306 ^ i6) * 16803) ^ 2108936916;
                        i8 = -71840461;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۚ */
    public final void mo10184(InterfaceC1423 interfaceC1423) {
        boolean z = false;
        RunnableC0611 runnableC0611 = null;
        View view = null;
        DialogInterfaceC19356 dialogInterfaceC19356 = null;
        int i = 1566930240;
        int i2 = C1875.f7103;
        int i3 = C1066.f4915;
        int iM45029 = C19806.m45029("ۤ۫") ^ i2;
        int i4 = ((iM45029 ^ i3) * 8945) ^ (-1147732963);
        int i5 = -1748350691;
        while (true) {
            i = ((((i ^ i3) * 18635) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2146444493:
                case 1610240922:
                    C1668.m5572(dialogInterfaceC19356);
                    iM45029 = (ThreadFactoryC3888.m11306("ܽ᩺") ^ i2) * 127;
                    i4 = ((iM45029 ^ i3) * (-10633)) ^ (-1440740451);
                    i5 = 1160811393;
                    break;
                case -1834257526:
                case -463141087:
                    if (C1668.m5583()) {
                        iM45029 = C19806.m45029("ۙۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 2809) ^ (-1947608168);
                        i5 = 391637460;
                    } else {
                        iM45029 = C19806.m45029("᩶ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20961)) ^ 448070263;
                        i5 = -1966056070;
                    }
                    break;
                case -1808838316:
                case 2030254512:
                    z = true;
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("ۜܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14851) ^ 1852838987;
                        i5 = -821145774;
                    } else {
                        iM45029 = C19806.m45029("ܽ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25111) ^ 362847712;
                        i5 = 1556521167;
                    }
                    break;
                case -1730242764:
                case -663968221:
                    C0962.m3743(interfaceC1423).mo9172(this);
                    dialogInterfaceC19356 = this.f77434;
                    if (dialogInterfaceC19356 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6857) ^ (-1978375895);
                        i5 = 977706423;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩺") ^ i2) * 127;
                        i4 = ((iM45029 ^ i3) * (-10633)) ^ (-1440740451);
                        i5 = 1160811393;
                    }
                    break;
                case -1678424183:
                case 326685918:
                    if (C0817.m3399()) {
                        iM45029 = C19806.m45029("ܳܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9971)) ^ 16104971;
                        i5 = -2115459706;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۖ") ^ i2) * (-121);
                        i4 = ((iM45029 ^ i3) * 9271) ^ 1046443501;
                        i5 = -1832294838;
                    }
                    break;
                case -1431126552:
                case 342520038:
                    C1398.m4895();
                    if (C0216.f1393 == 0) {
                        iM45029 = C19806.m45029("᩶ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20961)) ^ 448070263;
                        i5 = -1966056070;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۖ") ^ i2) * (-121);
                        i4 = ((iM45029 ^ i3) * 9271) ^ 1046443501;
                        i5 = -1832294838;
                    }
                    break;
                case -1249844724:
                case 219524646:
                    view = this.f77431;
                    view.removeCallbacks(runnableC0611);
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("᩶ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20961)) ^ 448070263;
                        i5 = -1966056070;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-14779)) ^ 956809044;
                        i5 = -1837793194;
                    }
                    break;
                case -1136294469:
                case 1696675407:
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f77437);
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("᩶ۜ")) * (-9);
                    i4 = ((iM45029 ^ i3) * 14427) ^ 1361811362;
                    i5 = 599651445;
                    break;
                case -1111405699:
                case 1642231283:
                    C0216.m1591();
                    if (C1398.m4895() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9309)) ^ (-2056082235);
                        i5 = -1165224521;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۖ") ^ i2) * (-121);
                        i4 = ((iM45029 ^ i3) * 9271) ^ 1046443501;
                        i5 = -1832294838;
                    }
                    break;
                case -884493266:
                case 2096858679:
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ۜܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14851) ^ 1852838987;
                        i5 = -821145774;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۗᩳ")) * 29;
                        i4 = ((iM45029 ^ i3) * 7581) ^ (-649966324);
                        i5 = -930765774;
                    }
                    break;
                case -875484263:
                case 1928010642:
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5313)) ^ (-429919571);
                        i5 = 1892118369;
                    } else {
                        iM45029 = C19806.m45029("ۜܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14851) ^ 1852838987;
                        i5 = -821145774;
                    }
                    break;
                case -767424801:
                case 1203679631:
                    C1875.m6086();
                    C1377.m4833();
                    iM45029 = (ThreadFactoryC3888.m11306("᩶ܿ") ^ i3) * (-31);
                    i4 = ((iM45029 ^ i2) * (-17971)) ^ (-410886760);
                    i5 = -409043285;
                    break;
                case -550466997:
                case 345670685:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۖ") ^ i2) * (-121);
                        i4 = ((iM45029 ^ i3) * 9271) ^ 1046443501;
                        i5 = -1832294838;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܿ") ^ i3) * (-31);
                        i4 = ((iM45029 ^ i2) * (-17971)) ^ (-410886760);
                        i5 = -409043285;
                    }
                    break;
                case -386769647:
                case 574389662:
                    break;
                case 95864336:
                case 2034520051:
                    if (view.getViewTreeObserver().isAlive()) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7465)) ^ (-1046331450);
                        i5 = 10339580;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩶ۜ")) * (-9);
                        i4 = ((iM45029 ^ i3) * 14427) ^ 1361811362;
                        i5 = 599651445;
                    }
                    break;
                case 827624602:
                case 964325102:
                    this.f77436 = z;
                    runnableC0611 = this.f77432;
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ۜܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14851) ^ 1852838987;
                        i5 = -821145774;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6927) ^ (-667031762);
                        i5 = -801143523;
                    }
                    break;
                case 921410180:
                case 1827771071:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۖ") ^ i2) * (-121);
                        i4 = ((iM45029 ^ i3) * 9271) ^ 1046443501;
                        i5 = -1832294838;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30447)) ^ (-1395842097);
                        i5 = 469784634;
                    }
                    break;
                case 1245890732:
                case 1318786582:
                    C0671.m3008();
                    break;
                case 1412640456:
                case 2042408222:
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9309)) ^ (-2056082235);
                        i5 = -1165224521;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܿ") + i2) * (-83);
                        i4 = ((iM45029 ^ i3) * (-14503)) ^ (-481009392);
                        i5 = 1521113468;
                    }
                    break;
                default:
                    if (C1377.m4833() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۖ") ^ i2) * (-121);
                        i4 = ((iM45029 ^ i3) * 9271) ^ 1046443501;
                        i5 = -1832294838;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ۢ") ^ i2) * (-75);
                        i4 = ((iM45029 ^ i3) * (-4771)) ^ 803793167;
                        i5 = 1632468793;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52689() {
        int i = 0;
        int i2 = 0;
        int i3 = -694484451;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i5 = C1460.f5948;
        int iM11306 = (ThreadFactoryC3888.m11306("۟۫") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i6 = ((iM11306 ^ i5) * 28889) ^ (-792242332);
        int i7 = 1912668369;
        while (true) {
            i3 = ((((i3 ^ i5) * 17779) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -2122080261:
                case 1589235109:
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۜ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM11306 ^ i4) * 22213) ^ (-2038495292);
                        i7 = -175947200;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۟") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32617)) ^ 1376388295;
                        i7 = -809741521;
                    }
                    break;
                case -2097339869:
                case -1724720626:
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("۬᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * 19531) ^ 640452908;
                        i7 = -1613305302;
                    } else {
                        iM11306 = (C19806.m45029("۫ܺ") ^ i4) * 101;
                        i6 = ((iM11306 ^ i5) * (-7583)) ^ (-106935212);
                        i7 = 1311645807;
                    }
                    break;
                case -2040359859:
                case -1500887101:
                    i2 = -1;
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("ܳۧ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-19001)) ^ (-1052574629);
                        i7 = -94409437;
                    } else {
                        iM11306 = C19806.m45029("᩵ۧ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-29887)) ^ 2143636098;
                        i7 = 307331254;
                    }
                    break;
                case -2033719647:
                case -1893865106:
                    if (C2332.m7079() <= 0) {
                        iM11306 = C19806.m45029("ܳۧ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-19001)) ^ (-1052574629);
                        i7 = -94409437;
                    } else {
                        iM11306 = C19806.m45029("ۘۚ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-27769)) ^ (-2047103743);
                        i7 = -837664293;
                    }
                    break;
                case -2024515766:
                case 343540954:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-7533)) ^ 350359702;
                        i7 = -1163131090;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۟") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32617)) ^ 1376388295;
                        i7 = -809741521;
                    }
                    break;
                case -1343676373:
                case 1418796857:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۘۤ")) * (-89);
                        i6 = ((iM11306 ^ i5) * (-6165)) ^ 1769588077;
                        i7 = -1797813019;
                    } else {
                        iM11306 = (C19806.m45029("ۨ᩵") + i5) * 69;
                        i6 = ((iM11306 ^ i4) * (-13303)) ^ (-1146362445);
                        i7 = -57342290;
                    }
                    break;
                case -1290189148:
                case 1693759464:
                    if (!C3743.f13569) {
                        iM11306 = C19806.m45029("۬᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * 19531) ^ 640452908;
                        i7 = -1613305302;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۟") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32617)) ^ 1376388295;
                        i7 = -809741521;
                    }
                    break;
                case -1288560622:
                case -715246903:
                    if (C1148.f5161 > 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۘۤ")) * (-89);
                        i6 = ((iM11306 ^ i5) * (-6165)) ^ 1769588077;
                        i7 = -1797813019;
                    } else {
                        iM11306 = C19806.m45029("۬᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * 19531) ^ 640452908;
                        i7 = -1613305302;
                    }
                    break;
                case -1269749897:
                case -1021669762:
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("۟ۚ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-21193)) ^ 2050515785;
                        i7 = -93047206;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵۠") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-13167)) ^ 588324131;
                        i7 = -797496170;
                    }
                    break;
                case -790749738:
                case 867603643:
                    i = this.f77433;
                    if (C1461.m5080()) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۘۤ")) * (-89);
                        i6 = ((iM11306 ^ i5) * (-6165)) ^ 1769588077;
                        i7 = -1797813019;
                    } else {
                        iM11306 = C19806.m45029("ۨܳ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 12967) ^ 934857168;
                        i7 = 500633569;
                    }
                    break;
                case -673020848:
                case -91022543:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ۢܺ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-23999)) ^ 496235764;
                        i7 = 655152976;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۘۤ")) * (-89);
                        i6 = ((iM11306 ^ i5) * (-6165)) ^ 1769588077;
                        i7 = -1797813019;
                    }
                    break;
                case -639353132:
                case 309928948:
                    C3722.m10894();
                    iM11306 = C19806.m45029("۬᩷") ^ i5;
                    i6 = ((iM11306 ^ i4) * 19531) ^ 640452908;
                    i7 = -1613305302;
                    break;
                case -529268799:
                case 2076221079:
                    C1937.m6279();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    break;
                case -80473385:
                case 732556798:
                    if (C2788.f10625 < 0) {
                        iM11306 = C19806.m45029("۟ۚ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-21193)) ^ 2050515785;
                        i7 = -93047206;
                    } else {
                        iM11306 = C19806.m45029("۬᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * 19531) ^ 640452908;
                        i7 = -1613305302;
                    }
                    break;
                case 1540554121:
                case 1759035663:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۟") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32617)) ^ 1376388295;
                        i7 = -809741521;
                    } else {
                        iM11306 = C19806.m45029("ܰۗ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-19253)) ^ 1443324279;
                        i7 = -1277873403;
                    }
                    break;
                default:
                    this.f77433 = i + i2;
                    m52687();
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ܰ */
    public final void mo10186(InterfaceC1423 interfaceC1423) {
        m52687();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m52687() {
        View view = null;
        RunnableC0611 runnableC0611 = null;
        int i = 1587692135;
        int i2 = AbstractC0464.f2088;
        int i3 = C1875.f7103;
        int iM45029 = (i2 - C19806.m45029("۟᩸")) * (-121);
        int i4 = ((iM45029 ^ i3) * 2095) ^ (-369428285);
        int i5 = 1174884795;
        while (true) {
            i = ((((i ^ i3) * 25601) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2109338416:
                case -636152807:
                    if (C0278.m1789() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩻") ^ i2) * (-101);
                        i4 = ((iM45029 ^ i3) * (-29811)) ^ 4012615;
                        i5 = -1936225436;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18455)) ^ 1802655618;
                        i5 = -144567957;
                    }
                    break;
                case -2076835174:
                case -1898595048:
                    C3660.m10791();
                    if (C2249.f8050 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩻") ^ i2) * (-101);
                        i4 = ((iM45029 ^ i3) * (-29811)) ^ 4012615;
                        i5 = -1936225436;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۚ") ^ i3) * (-111);
                        i4 = ((iM45029 ^ i2) * (-8789)) ^ (-1919899172);
                        i5 = 606937048;
                    }
                    break;
                case -2053015811:
                case 988552038:
                    view.removeCallbacks(runnableC0611);
                    view.post(runnableC0611);
                    iM45029 = ThreadFactoryC3888.m11306("ۙ۫") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-19245)) ^ (-1778318779);
                    i5 = -495140647;
                    break;
                case -2031567033:
                case 1647982782:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (i2 - C19806.m45029("᩸ۘ")) * (-107);
                        i4 = ((iM45029 ^ i3) * (-5001)) ^ (-844172760);
                        i5 = 1569800851;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ֡") + i2) * 65;
                        i4 = ((iM45029 ^ i3) * (-25741)) ^ 732068777;
                        i5 = -1420627820;
                    }
                    break;
                case -1886752734:
                case -1436581267:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("᩺ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16993)) ^ (-851566324);
                        i5 = -66327934;
                    } else {
                        iM45029 = C19806.m45029("ܺ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18617)) ^ (-1984925678);
                        i5 = 859451376;
                    }
                    break;
                case -1841248866:
                case -1381083355:
                    C0216.m1591();
                    break;
                case -1619561775:
                case 389661361:
                    C0050.m946();
                    CallableC1627.m5507();
                    iM45029 = (ThreadFactoryC3888.m11306("ۧ᩻") ^ i2) * (-101);
                    i4 = ((iM45029 ^ i3) * (-29811)) ^ 4012615;
                    i5 = -1936225436;
                    break;
                case -1481603575:
                case -670317023:
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩻") ^ i2) * (-101);
                        i4 = ((iM45029 ^ i3) * (-29811)) ^ 4012615;
                        i5 = -1936225436;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۬ܰ")) * (-67);
                        i4 = ((iM45029 ^ i2) * 22737) ^ (-1785198277);
                        i5 = 274455739;
                    }
                    break;
                case -1442712317:
                case 561728815:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = (i2 - C19806.m45029("᩸ۘ")) * (-107);
                        i4 = ((iM45029 ^ i3) * (-5001)) ^ (-844172760);
                        i5 = 1569800851;
                    } else {
                        iM45029 = C19806.m45029("᩺ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16993)) ^ (-851566324);
                        i5 = -66327934;
                    }
                    break;
                case -1172394804:
                case 804784673:
                    break;
                case -1016580744:
                case 759709822:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩻") ^ i2) * (-101);
                        i4 = ((iM45029 ^ i3) * (-29811)) ^ 4012615;
                        i5 = -1936225436;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12927)) ^ 406150828;
                        i5 = 1248204542;
                    }
                    break;
                case -187029256:
                case 431817082:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (i2 - C19806.m45029("᩸ۘ")) * (-107);
                        i4 = ((iM45029 ^ i3) * (-5001)) ^ (-844172760);
                        i5 = 1569800851;
                    } else {
                        iM45029 = (C19806.m45029("֡᩶") ^ i3) * 21;
                        i4 = ((iM45029 ^ i2) * (-11963)) ^ 181104989;
                        i5 = 1717485126;
                    }
                    break;
                case 187598163:
                case 326814229:
                    if (C0817.m3399()) {
                        iM45029 = (C19806.m45029("֫᩵") + i2) * 13;
                        i4 = ((iM45029 ^ i3) * (-19809)) ^ 849650386;
                        i5 = 1689292903;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩻") ^ i2) * (-101);
                        i4 = ((iM45029 ^ i3) * (-29811)) ^ 4012615;
                        i5 = -1936225436;
                    }
                    break;
                case 302488171:
                case 1104861183:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ܿ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28891)) ^ 256205152;
                        i5 = -672652980;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩸ۘ")) * (-107);
                        i4 = ((iM45029 ^ i3) * (-5001)) ^ (-844172760);
                        i5 = 1569800851;
                    }
                    break;
                case 475258573:
                case 515534118:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("᩻ۗ") ^ i3) * (-37);
                        i4 = ((iM45029 ^ i2) * (-8295)) ^ (-1784392882);
                        i5 = -1894414189;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6053)) ^ (-1736362539);
                        i5 = 1653465729;
                    }
                    break;
                case 503929051:
                case 2144325497:
                    if (this.f77436) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19245)) ^ (-1778318779);
                        i5 = -495140647;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15705) ^ 2029500964;
                        i5 = 774812992;
                    }
                    break;
                case 1085104634:
                case 1300627776:
                    if (!C0817.f3443) {
                        iM45029 = C19806.m45029("᩺ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16993)) ^ (-851566324);
                        i5 = -66327934;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ᩻") ^ i2) * (-101);
                        i4 = ((iM45029 ^ i3) * (-29811)) ^ 4012615;
                        i5 = -1936225436;
                    }
                    break;
                default:
                    view = this.f77431;
                    runnableC0611 = this.f77432;
                    if (C1148.f5161 <= 0) {
                        iM45029 = (i2 - C19806.m45029("᩸ۘ")) * (-107);
                        i4 = ((iM45029 ^ i3) * (-5001)) ^ (-844172760);
                        i5 = 1569800851;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24847)) ^ (-848569076);
                        i5 = -534980450;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0185 A[PHI: r5 r6
      0x0185: PHI (r5v2 android.widget.TextView) = (r5v1 android.widget.TextView), (r5v1 android.widget.TextView), (r5v5 android.widget.TextView) binds: [B:145:0x0185, B:43:0x0183, B:35:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r6v2 android.content.Context) = (r6v1 android.content.Context), (r6v1 android.content.Context), (r6v3 android.content.Context) binds: [B:145:0x0185, B:43:0x0183, B:35:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007f, code lost:
    
        if (l.C0817.f3443 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        if (l.C2642.m8171() == 0) goto L13;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52684(final l.C23896 r29) {
        /*
            Method dump skipped, instruction units count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23896.m52684(l.᩻᩵ۘ):void");
    }
}
