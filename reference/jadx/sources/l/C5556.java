package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5556 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PackageManager f19292;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f19293;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f19294;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f19295;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15945 f19296;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19297;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7793 f19298;

    static {
        ApplicationC23172.m52091(63);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public native void mo1135(Exception exc);

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        C12267 c12267 = null;
        C3072 c3072 = null;
        boolean z = false;
        C12267 c12268 = null;
        int i = 1058897677;
        int i2 = AbstractC0116.f1064;
        int i3 = C20932.f66974;
        int iM3169 = (C0773.m3169("᩷۠") ^ i2) * (-57);
        int i4 = ((iM3169 ^ i3) * (-29003)) ^ (-324302295);
        int i5 = 1664484153;
        while (true) {
            i = ((((i ^ i3) * 18505) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2139884282:
                case 1967752094:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (i2 - C0773.m3169("᩹۬")) * 13;
                        i4 = ((iM3169 ^ i3) * 21173) ^ (-38050051);
                        i5 = -968919409;
                    } else {
                        iM3169 = C0773.m3169("ۚ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27689) ^ (-333865310);
                        i5 = -1153688265;
                    }
                    break;
                case -2038928920:
                case 633880729:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i2 - C0773.m3169("ᩳ᩹")) * (-7);
                        i4 = ((iM3169 ^ i3) * 14341) ^ 811130367;
                        i5 = -297949217;
                    } else {
                        iM3169 = C0619.m2761("ۤ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23979)) ^ (-1843001478);
                        i5 = -209890248;
                    }
                    break;
                case -2001359839:
                case 1241166151:
                    if (C0487.m2356() >= 0) {
                        iM3169 = (i2 - C0773.m3169("ᩳ᩹")) * (-7);
                        i4 = ((iM3169 ^ i3) * 14341) ^ 811130367;
                        i5 = -297949217;
                    } else {
                        iM3169 = (C0619.m2761("ܺۢ") + i3) * (-59);
                        i4 = ((iM3169 ^ i2) * (-6365)) ^ 1727335779;
                        i5 = -208881272;
                    }
                    break;
                case -1809146179:
                case -787208087:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ܶᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10645)) ^ (-1894672218);
                        i5 = -673251237;
                    } else {
                        iM3169 = C0773.m3169("᩺ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-31185)) ^ 1423764838;
                        i5 = -2107265036;
                    }
                    break;
                case -1605111472:
                case -742325222:
                    C1343.m4943();
                    if (C2485.f7950 == 0) {
                        iM3169 = (i2 - C0773.m3169("᩹۬")) * 13;
                        i4 = ((iM3169 ^ i3) * 21173) ^ (-38050051);
                        i5 = -968919409;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۤ") ^ i3) * 35;
                        i4 = ((iM3169 ^ i2) * 11195) ^ 1372313646;
                        i5 = -1155230913;
                    }
                    break;
                case -642683729:
                case 1812121234:
                    if (C0269.m1775() <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩹۬")) * 13;
                        i4 = ((iM3169 ^ i3) * 21173) ^ (-38050051);
                        i5 = -968919409;
                    } else {
                        iM3169 = (C0773.m3169("ܶ᩵") ^ i2) * (-27);
                        i4 = ((iM3169 ^ i3) * (-10339)) ^ (-1315804039);
                        i5 = -632274429;
                    }
                    break;
                case -525744415:
                case 1373055525:
                    c12268.f39447.m10021(z);
                    break;
                case -478911049:
                case -212358502:
                    RunnableC3055.m9933();
                    iM3169 = (C0619.m2761("᩻ۤ") ^ i3) * 35;
                    i4 = ((iM3169 ^ i2) * 11195) ^ 1372313646;
                    i5 = -1155230913;
                    break;
                case -454719192:
                case -89037250:
                    c3072 = c12267.f39447;
                    z = true;
                    if (C2023.f6737) {
                        iM3169 = (i2 - C0773.m3169("ᩳ᩹")) * (-7);
                        i4 = ((iM3169 ^ i3) * 14341) ^ 811130367;
                        i5 = -297949217;
                    } else {
                        iM3169 = (C0773.m3169("֨ۨ") + i3) * (-41);
                        i4 = ((iM3169 ^ i2) * (-14789)) ^ 12609306;
                        i5 = 2030868291;
                    }
                    break;
                case -435209057:
                case 1545217328:
                    c3072.m10021(z);
                    c12268 = viewOnClickListenerC7793.f25872;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩹۬")) * 13;
                        i4 = ((iM3169 ^ i3) * 21173) ^ (-38050051);
                        i5 = -968919409;
                    } else {
                        iM3169 = (C0619.m2761("ۖ۬") ^ i2) * 29;
                        i4 = ((iM3169 ^ i3) * (-12027)) ^ (-2039932825);
                        i5 = -1748782621;
                    }
                    break;
                case -309663631:
                case 1585357053:
                    if (C2287.m7745() > 0) {
                        iM3169 = C0619.m2761("ܶᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10645)) ^ (-1894672218);
                        i5 = -673251237;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۤ") ^ i3) * 35;
                        i4 = ((iM3169 ^ i2) * 11195) ^ 1372313646;
                        i5 = -1155230913;
                    }
                    break;
                case -291612265:
                case 1250283244:
                    c12267 = viewOnClickListenerC7793.f25880;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i2 - C0773.m3169("ᩳ᩹")) * (-7);
                        i4 = ((iM3169 ^ i3) * 14341) ^ 811130367;
                        i5 = -297949217;
                    } else {
                        iM3169 = (i3 - C0773.m3169("۟ۗ")) * (-89);
                        i4 = ((iM3169 ^ i2) * (-11041)) ^ (-710413137);
                        i5 = -67158285;
                    }
                    break;
                case 218338169:
                case 633199145:
                    if (C2288.f7433 > 0) {
                        iM3169 = C0619.m2761("ۢۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 14425) ^ (-641736057);
                        i5 = -951649074;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩹۬")) * 13;
                        i4 = ((iM3169 ^ i3) * 21173) ^ (-38050051);
                        i5 = -968919409;
                    }
                    break;
                case 765272717:
                case 1986572362:
                    viewOnClickListenerC7793 = this.f19298;
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("ۢۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 14425) ^ (-641736057);
                        i5 = -951649074;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩸ܶ")) * (-55);
                        i4 = ((iM3169 ^ i2) * 10071) ^ (-386206947);
                        i5 = 1321284665;
                    }
                    break;
                case 1558751165:
                case 1632292955:
                    C3492.m11488();
                    break;
                default:
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = (i2 - C0773.m3169("᩹۬")) * 13;
                        i4 = ((iM3169 ^ i3) * 21173) ^ (-38050051);
                        i5 = -968919409;
                    } else {
                        iM3169 = (C0619.m2761("᩻ᩳ") ^ i2) * (-57);
                        i4 = ((iM3169 ^ i3) * (-12219)) ^ (-285561413);
                        i5 = -1646885091;
                    }
                    break;
            }
            return;
        }
    }

    public C5556(ViewOnClickListenerC7793 viewOnClickListenerC7793, int i) {
        int i2 = -1178017222;
        int i3 = C1321.f4751;
        int i4 = C2287.f7432;
        this.f19298 = viewOnClickListenerC7793;
        this.f19297 = i;
        int iM3169 = C0773.m3169("᩸᩹") ^ i4;
        int i5 = ((iM3169 ^ i3) * 22915) ^ (-2030224250);
        int i6 = 2007209819;
        while (true) {
            i2 = ((((i2 ^ i3) * 3703) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2034039689:
                case 1661640920:
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("᩷ۘ") + i4) * (-45);
                        i5 = ((iM3169 ^ i3) * 3761) ^ 2083683501;
                        i6 = 86185181;
                    } else {
                        iM3169 = C0619.m2761("᩵᩹") ^ i4;
                        i5 = ((iM3169 ^ i3) * 1397) ^ (-784317067);
                        i6 = 551258232;
                    }
                    break;
                case -1909827447:
                case 1298338199:
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0773.m3169("ۘۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28235)) ^ 917156138;
                        i6 = 2067484609;
                    } else {
                        iM3169 = (C0619.m2761("ۢۗ") + i3) * 77;
                        i5 = ((iM3169 ^ i4) * 3239) ^ (-1786473056);
                        i6 = 2019636549;
                    }
                    break;
                case -1862378150:
                case -1754805181:
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("ᩳۢ") + i3) * 79;
                        i5 = ((iM3169 ^ i4) * 25683) ^ (-1299094747);
                        i6 = 1133113711;
                    } else {
                        iM3169 = (C0619.m2761("᩸ܿ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i3) * (-3485)) ^ 1954710635;
                        i6 = 461624685;
                    }
                    break;
                case -1826449289:
                case 1575113119:
                    C2419.m8174();
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0773.m3169("ۙ᩺") ^ i4;
                        i5 = ((iM3169 ^ i3) * 19401) ^ 1959278422;
                        i6 = -1549026394;
                    } else {
                        iM3169 = C0773.m3169("᩵ܳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-22055)) ^ (-2060174016);
                        i6 = -481702757;
                    }
                    break;
                case -1774602068:
                case -1375164433:
                    if (C3492.m11488()) {
                        iM3169 = C0773.m3169("۬ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 8025) ^ (-1975213049);
                        i6 = 1202219051;
                    } else {
                        iM3169 = C0773.m3169("ۘۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28235)) ^ 917156138;
                        i6 = 2067484609;
                    }
                    break;
                case -1737902469:
                case 2120538403:
                    C23916.m53419();
                    iM3169 = C0773.m3169("ۘۨ") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-28235)) ^ 917156138;
                    i6 = 2067484609;
                    break;
                case -1597024043:
                case 735934318:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("᩷ۘ") + i4) * (-45);
                        i5 = ((iM3169 ^ i3) * 3761) ^ 2083683501;
                        i6 = 86185181;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩺") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-23809)) ^ (-1590569097);
                        i6 = 283717043;
                    }
                    break;
                case -1524211203:
                case -516929961:
                    if (C2354.m7983()) {
                        iM3169 = C0619.m2761("ܶۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-15337)) ^ 396771358;
                        i6 = -2077083577;
                    } else {
                        iM3169 = C0773.m3169("ۘۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28235)) ^ 917156138;
                        i6 = 2067484609;
                    }
                    break;
                case -1419901743:
                case 698740153:
                    this.f19294 = true;
                    return;
                case -576500822:
                case 345920458:
                    C3492.m11488();
                    throw new RuntimeException();
                case -430172767:
                case 875678303:
                    if (C3033.m9845() <= 0) {
                        iM3169 = C0773.m3169("ۙ᩺") ^ i4;
                        i5 = ((iM3169 ^ i3) * 19401) ^ 1959278422;
                        i6 = -1549026394;
                    } else {
                        iM3169 = C0619.m2761("᩸ۢ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-31403)) ^ (-1473075881);
                        i6 = 542695526;
                    }
                    break;
                case -138983853:
                case 469443852:
                    this.f19292 = viewOnClickListenerC7793.getPackageManager();
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("᩵ܳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-22055)) ^ (-2060174016);
                        i6 = -481702757;
                    } else {
                        iM3169 = C0619.m2761("۟᩷") ^ i4;
                        i5 = ((iM3169 ^ i3) * 827) ^ (-1441389299);
                        i6 = 372165085;
                    }
                    break;
                case -19985386:
                case 581566797:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("᩵ܳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-22055)) ^ (-2060174016);
                        i6 = -481702757;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ۫") ^ i4) * 127;
                        i5 = ((iM3169 ^ i3) * (-14597)) ^ (-1580746051);
                        i6 = 68649611;
                    }
                    break;
                case 317733498:
                case 1683769013:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0619.m2761("᩸ܿ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i3) * (-3485)) ^ 1954710635;
                        i6 = 461624685;
                    } else {
                        iM3169 = C0619.m2761("᩺ۖ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 24561) ^ (-1179397136);
                        i6 = -1272614966;
                    }
                    break;
                case 795381426:
                case 1171400894:
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (C0773.m3169("᩷ۘ") + i4) * (-45);
                        i5 = ((iM3169 ^ i3) * 3761) ^ 2083683501;
                        i6 = 86185181;
                    } else {
                        iM3169 = C0773.m3169("ۘۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28235)) ^ 917156138;
                        i6 = 2067484609;
                    }
                    break;
                default:
                    RunnableC3055.m9933();
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("᩵ܳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-22055)) ^ (-2060174016);
                        i6 = -481702757;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۘ") + i4) * (-45);
                        i5 = ((iM3169 ^ i3) * 3761) ^ 2083683501;
                        i6 = 86185181;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x013a A[PHI: r4 r6 r7
      0x013a: PHI (r4v5 java.util.Iterator) = (r4v3 java.util.Iterator), (r4v2 java.util.Iterator), (r4v2 java.util.Iterator), (r4v2 java.util.Iterator) binds: [B:43:0x0134, B:27:0x00a0, B:24:0x0080, B:22:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r6v6 android.content.pm.PackageInfo) = 
      (r6v2 android.content.pm.PackageInfo)
      (r6v4 android.content.pm.PackageInfo)
      (r6v2 android.content.pm.PackageInfo)
      (r6v2 android.content.pm.PackageInfo)
     binds: [B:43:0x0134, B:27:0x00a0, B:24:0x0080, B:22:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r7v5 android.content.pm.ApplicationInfo) = 
      (r7v2 android.content.pm.ApplicationInfo)
      (r7v3 android.content.pm.ApplicationInfo)
      (r7v2 android.content.pm.ApplicationInfo)
      (r7v2 android.content.pm.ApplicationInfo)
     binds: [B:43:0x0134, B:27:0x00a0, B:24:0x0080, B:22:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01cb A[PHI: r2
      0x01cb: PHI (r2v4 java.util.List<android.content.pm.PackageInfo>) = 
      (r2v2 java.util.List<android.content.pm.PackageInfo>)
      (r2v3 java.util.List<android.content.pm.PackageInfo>)
      (r2v2 java.util.List<android.content.pm.PackageInfo>)
      (r2v2 java.util.List<android.content.pm.PackageInfo>)
     binds: [B:61:0x01c9, B:53:0x0193, B:32:0x00c8, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01f7 A[PHI: r1
      0x01f7: PHI (r1v4 int) = (r1v2 int), (r1v3 int), (r1v2 int) binds: [B:65:0x01f5, B:57:0x01ad, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0228 A[PHI: r0 r5
      0x0228: PHI (r0v6 android.content.pm.PackageManager) = 
      (r0v5 android.content.pm.PackageManager)
      (r0v2 android.content.pm.PackageManager)
      (r0v2 android.content.pm.PackageManager)
      (r0v2 android.content.pm.PackageManager)
     binds: [B:69:0x0226, B:36:0x00ea, B:19:0x0067, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r5v5 l.ۧܿ֫) = (r5v2 l.ۧܿ֫), (r5v4 l.ۧܿ֫), (r5v2 l.ۧܿ֫), (r5v2 l.ۧܿ֫) binds: [B:69:0x0226, B:36:0x00ea, B:19:0x0067, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        int iM2761;
        int i;
        PackageManager packageManager = null;
        int i2 = 0;
        List<PackageInfo> installedPackages = null;
        Iterator itM7968 = null;
        C11762 c11762 = null;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        int i3 = 1629839940;
        int i4 = C1783.f6087;
        int i5 = C1826.f6190;
        int iM2762 = C0619.m2761("֫ᩴ") ^ i4;
        int i6 = ((iM2762 ^ i5) * (-31031)) ^ 2113594971;
        int i7 = -876377377;
        while (true) {
            int i8 = iM2762 ^ i7;
            ArrayList arrayList = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 9481) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2114508544:
                    case 532825251:
                        packageManager = this.f19292;
                        if (C3492.f12043 <= 0) {
                            iM2761 = (C0619.m2761("ۖۛ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM2761 ^ i5) * 9709) ^ (-796337325);
                            i = -649812231;
                        } else {
                            iM2761 = C0619.m2761("ܰ۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-15719)) ^ 1646219448;
                            i = -1534597097;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1936537967:
                    case -1067303348:
                        if (C3492.m11488()) {
                            iM2761 = (i4 - C0773.m3169("ܽۚ")) * (-77);
                            i6 = ((iM2761 ^ i5) * (-801)) ^ (-587005781);
                            i = 129616339;
                        } else {
                            iM2761 = (C0619.m2761("ܽܺ") ^ i4) * q.h;
                            i6 = ((iM2761 ^ i5) * 28819) ^ 554153039;
                            i = 238807767;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1823970372:
                    case 1564256376:
                        if (C3998.m12923(itM7968)) {
                            iM2761 = (C0619.m2761("۠ۚ") + i4) * (-27);
                            i6 = ((iM2761 ^ i5) * (-22675)) ^ 619015918;
                            i = 1911470385;
                        } else {
                            iM2761 = (C0619.m2761("᩸۫") + i5) * 19;
                            i6 = ((iM2761 ^ i4) * 19569) ^ 55942630;
                            i = -1392351506;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1767109765:
                    case -779180040:
                        C17202.m40369(c11762);
                        if (C0487.m2356() >= 0) {
                            iM2761 = C0619.m2761("۬۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-9495)) ^ (-1020573344);
                            i = 1741991220;
                        } else {
                            iM2761 = C0773.m3169("۠᩵") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-30375)) ^ (-232430786);
                            i = -743543351;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1717900374:
                    case -1606928784:
                        this.f19296 = C7742.m21081(C7756.m21111());
                        break;
                    case -1595485568:
                    case -1124568583:
                        installedPackages = packageManager.getInstalledPackages(i2);
                        C7756.m21114();
                        if (C1519.f5300 >= 0) {
                            iM2761 = C0619.m2761("۬۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-9495)) ^ (-1020573344);
                            i = 1741991220;
                        } else {
                            iM2761 = C0619.m2761("᩶᩹") ^ i5;
                            i6 = ((iM2761 ^ i4) * 30001) ^ (-68324519);
                            i = 1331707727;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1455921272:
                    case -820702745:
                        if (RunnableC1848.f6235) {
                            iM2761 = C0619.m2761("۬۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-9495)) ^ (-1020573344);
                            i = 1741991220;
                        } else {
                            iM2761 = C0773.m3169("ܺ֫") ^ i4;
                            i6 = ((iM2761 ^ i5) * 14065) ^ (-1701816358);
                            i = 999882241;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1227237102:
                    case 1728913757:
                        C2310.m7813();
                        C1542.m5459();
                        break;
                    case -1174836636:
                    case 1569662593:
                        packageInfo = (PackageInfo) C4238.m13529(itM7968);
                        applicationInfo = packageInfo.applicationInfo;
                        if (applicationInfo != null) {
                            iM2761 = C0773.m3169("ۚ᩵") ^ i5;
                            i6 = ((iM2761 ^ i4) * 20881) ^ 1742406903;
                            i = -1796302042;
                        } else {
                            iM2761 = C0619.m2761("ᩳ᩶") ^ i4;
                            i6 = ((iM2761 ^ i5) * 24881) ^ 1099028502;
                            i = 386633709;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1159921604:
                    case 1907126854:
                        i2 = 0;
                        if (C1826.f6190 <= 0) {
                            iM2761 = (C0619.m2761("ܽܺ") ^ i4) * q.h;
                            i6 = ((iM2761 ^ i5) * 28819) ^ 554153039;
                            i = 238807767;
                        } else {
                            iM2761 = (i5 - C0619.m2761("ۤᩳ")) * 17;
                            i6 = ((iM2761 ^ i4) * 61) ^ 1207816719;
                            i = 332288984;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1158354240:
                    case 1649164731:
                        C2485.m8357();
                        if (RunnableC3646.f12471) {
                            iM2761 = (C0619.m2761("᩶ܽ") + i5) * (-51);
                            i6 = ((iM2761 ^ i4) * 28507) ^ 1585676317;
                            i = -1191094154;
                        } else {
                            iM2761 = (C0619.m2761("ۖۛ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM2761 ^ i5) * 9709) ^ (-796337325);
                            i = -649812231;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -800971456:
                    case 634349694:
                        c11762 = (C11762) C4013.m12986();
                        if (C13473.m33144()) {
                            iM2761 = C0773.m3169("ۤ֨") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-7381)) ^ 1722332356;
                            i = -1251258533;
                        } else {
                            iM2761 = (C0619.m2761("ۖۛ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM2761 ^ i5) * 9709) ^ (-796337325);
                            i = -649812231;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -721730712:
                    case -12654670:
                        this.f19295 = arrayList;
                        itM7968 = C2354.m7968(installedPackages);
                        iM2761 = C0619.m2761("ᩳ᩶") ^ i4;
                        i6 = ((iM2761 ^ i5) * 24881) ^ 1099028502;
                        i = 386633709;
                        i8 = iM2761 ^ i;
                        break;
                    case -267696614:
                    case 1227559559:
                        if (applicationInfo.sourceDir != null) {
                            iM2761 = (C0619.m2761("ۡۧ") + i5) * (-77);
                            i6 = ((iM2761 ^ i4) * 1795) ^ 465987666;
                            i = -923488120;
                        } else {
                            iM2761 = C0619.m2761("ᩳ᩶") ^ i4;
                            i6 = ((iM2761 ^ i5) * 24881) ^ 1099028502;
                            i = 386633709;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case 53560147:
                    case 1116657354:
                        C4238.m13540();
                        if (C3690.f12684 <= 0) {
                        }
                        iM2761 = (C0619.m2761("ܽܺ") ^ i4) * q.h;
                        i6 = ((iM2761 ^ i5) * 28819) ^ 554153039;
                        i = 238807767;
                        i8 = iM2761 ^ i;
                        break;
                    case 701679360:
                    case 730219115:
                        int iM11247 = C3448.m11247(installedPackages);
                        if (C2354.f7599 < 0) {
                            arrayList = new ArrayList(iM11247);
                            if (!C1321.m4852()) {
                            }
                            iM2761 = C0619.m2761("᩷ۤ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 32633) ^ 1417219238;
                            i = -1630793261;
                            i8 = iM2761 ^ i;
                            break;
                        }
                        break;
                    case 898785512:
                    case 1590223791:
                        C13473.m33144();
                        if (C3779.f12953 <= 0) {
                        }
                        iM2761 = (C0619.m2761("᩶ܽ") + i5) * (-51);
                        i6 = ((iM2761 ^ i4) * 28507) ^ 1585676317;
                        i = -1191094154;
                        i8 = iM2761 ^ i;
                        break;
                    case 1422765789:
                    case 1555076448:
                        C1321.m4852();
                        C3077.m10041();
                        iM2761 = (C0619.m2761("ۖۛ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM2761 ^ i5) * 9709) ^ (-796337325);
                        i = -649812231;
                        i8 = iM2761 ^ i;
                        break;
                    default:
                        ArrayList arrayList2 = this.f19295;
                        if (C3077.f9998) {
                            RunnableC0334.m2054(arrayList2, new C20472(packageInfo));
                            iM2761 = C0619.m2761("ᩳ᩶") ^ i4;
                            i6 = ((iM2761 ^ i5) * 24881) ^ 1099028502;
                            i = 386633709;
                        } else {
                            iM2761 = C0619.m2761("۬۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-9495)) ^ (-1020573344);
                            i = 1741991220;
                        }
                        i8 = iM2761 ^ i;
                        break;
                }
                return;
            }
            iM2762 = C0619.m2761("ۢܳ") ^ i4;
            i6 = ((iM2762 ^ i5) * (-31159)) ^ (-1491144197);
            i7 = 679015644;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0288 A[PHI: r12 r13
      0x0288: PHI (r12v8 java.util.ArrayList) = (r12v1 java.util.ArrayList), (r12v2 java.util.ArrayList), (r12v3 java.util.ArrayList), (r12v9 java.util.ArrayList) binds: [B:66:0x0270, B:62:0x024f, B:58:0x022f, B:22:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r13v8 l.ۨۢ֫) = (r13v1 l.ۨۢ֫), (r13v2 l.ۨۢ֫), (r13v3 l.ۨۢ֫), (r13v9 l.ۨۢ֫) binds: [B:66:0x0270, B:62:0x024f, B:58:0x022f, B:22:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02aa A[PHI: r8 r9 r12 r13 r27
      0x02aa: PHI (r8v4 l.۟ۢ֫) = (r8v3 l.۟ۢ֫), (r8v2 l.۟ۢ֫), (r8v2 l.۟ۢ֫) binds: [B:70:0x02a8, B:40:0x0174, B:14:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r9v4 java.util.concurrent.atomic.AtomicInteger) = 
      (r9v3 java.util.concurrent.atomic.AtomicInteger)
      (r9v2 java.util.concurrent.atomic.AtomicInteger)
      (r9v2 java.util.concurrent.atomic.AtomicInteger)
     binds: [B:70:0x02a8, B:40:0x0174, B:14:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r12v10 java.util.ArrayList) = (r12v0 java.util.ArrayList), (r12v6 java.util.ArrayList), (r12v11 java.util.ArrayList) binds: [B:70:0x02a8, B:40:0x0174, B:14:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r13v10 l.ۨۢ֫) = (r13v0 l.ۨۢ֫), (r13v6 l.ۨۢ֫), (r13v11 l.ۨۢ֫) binds: [B:70:0x02a8, B:40:0x0174, B:14:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r27v3 l.ۢۖ᩹) = (r27v1 l.ۢۖ᩹), (r27v2 l.ۢۖ᩹), (r27v1 l.ۢۖ᩹) binds: [B:70:0x02a8, B:40:0x0174, B:14:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        if (l.C1783.f6087 <= 0) goto L10;
     */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1134() {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5556.mo1134():void");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        int i = 229796110;
        int i2 = RunnableC0334.f1808;
        int i3 = C0487.f2131;
        int iM2761 = (C0619.m2761("ۖۘ") ^ i2) * 87;
        int i4 = ((iM2761 ^ i3) * 31117) ^ (-1092849861);
        int i5 = 1567917917;
        while (true) {
            i = ((((i ^ i3) * 20507) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2143926309:
                case -468971257:
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0773.m3169("᩻ۢ") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * 17035) ^ (-2059690006);
                        i5 = 1869567998;
                    } else {
                        iM2761 = C0619.m2761("ۚܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17041)) ^ 596421612;
                        i5 = 170360504;
                    }
                    break;
                case -2097520557:
                case -956682939:
                    C0862.m3503();
                    if (C4282.f15546 > 0) {
                        iM2761 = C0619.m2761("᩻֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22143)) ^ 1852203202;
                        i5 = 76957118;
                    } else {
                        iM2761 = C0619.m2761("۠۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6827) ^ (-1377892103);
                        i5 = 1261531305;
                    }
                    break;
                case -1835073669:
                case -674932382:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("᩵۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20749)) ^ (-837873953);
                        i5 = 1658062957;
                    } else {
                        iM2761 = (C0619.m2761("᩶᩹") ^ i3) * (-97);
                        i4 = ((iM2761 ^ i2) * 2391) ^ 109160082;
                        i5 = -2006345533;
                    }
                    break;
                case -1784423226:
                case 1890709234:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0619.m2761("۠۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6827) ^ (-1377892103);
                        i5 = 1261531305;
                    } else {
                        iM2761 = (C0619.m2761("۠ۗ") ^ i2) * 3;
                        i4 = ((iM2761 ^ i3) * 22677) ^ (-445912811);
                        i5 = 2079381312;
                    }
                    break;
                case -1404064080:
                case 1466486184:
                    C0862.m3503();
                    iM2761 = C0619.m2761("۠۫") ^ i3;
                    i4 = ((iM2761 ^ i2) * 6827) ^ (-1377892103);
                    i5 = 1261531305;
                    break;
                case -1316774636:
                case 1598821167:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0773.m3169("᩻ۢ") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * 17035) ^ (-2059690006);
                        i5 = 1869567998;
                    } else {
                        iM2761 = C0619.m2761("ۡ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2159)) ^ 290657787;
                        i5 = -1756898781;
                    }
                    break;
                case -1265029075:
                case -1095145801:
                    C2287.m7745();
                    if (C2702.f8586 > 0) {
                        iM2761 = (C0773.m3169("᩻ۢ") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * 17035) ^ (-2059690006);
                        i5 = 1869567998;
                    } else {
                        iM2761 = C0619.m2761("᩻֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22143)) ^ 1852203202;
                        i5 = 76957118;
                    }
                    break;
                case -1000239511:
                case 1963622491:
                    if (this.f19293) {
                        iM2761 = C0773.m3169("᩵᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13933)) ^ (-1897430814);
                        i5 = 313322278;
                    } else {
                        iM2761 = (C0773.m3169("ܶ᩺") ^ i2) * (-61);
                        i4 = ((iM2761 ^ i3) * (-30281)) ^ 1445693149;
                        i5 = -23829787;
                    }
                    break;
                case -945192265:
                case 1547758522:
                    C1519.m5403();
                    C2966.m9664();
                    break;
                case -806373052:
                case -612878682:
                    m16474();
                    iM2761 = C0773.m3169("᩵᩸") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-13933)) ^ (-1897430814);
                    i5 = 313322278;
                    break;
                case -624051992:
                case 2012643213:
                    if (C17202.f56030) {
                        iM2761 = C0619.m2761("ܶۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11211)) ^ (-997533894);
                        i5 = 486232439;
                    } else {
                        iM2761 = C0619.m2761("۠۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6827) ^ (-1377892103);
                        i5 = 1261531305;
                    }
                    break;
                case -291355164:
                case 824869367:
                    if (!C3492.m11488()) {
                        iM2761 = C0619.m2761("᩵۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20749)) ^ (-837873953);
                        i5 = 1658062957;
                    } else {
                        iM2761 = C0619.m2761("۠۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6827) ^ (-1377892103);
                        i5 = 1261531305;
                    }
                    break;
                case -289154585:
                case -280475937:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("᩵۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20749)) ^ (-837873953);
                        i5 = 1658062957;
                    } else {
                        iM2761 = C0773.m3169("᩻ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28511) ^ (-376990577);
                        i5 = 1794167291;
                    }
                    break;
                case 98493085:
                case 924994019:
                    break;
                case 151900511:
                case 1542327440:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0619.m2761("ᩴ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3623)) ^ 2141464397;
                        i5 = -1962564992;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩵ۗ")) * 55;
                        i4 = ((iM2761 ^ i3) * (-11519)) ^ 196538657;
                        i5 = -24866480;
                    }
                    break;
                case 193654788:
                case 1933944530:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0619.m2761("᩵۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20749)) ^ (-837873953);
                        i5 = 1658062957;
                    } else {
                        iM2761 = C0773.m3169("᩵֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 25303) ^ (-1220333214);
                        i5 = 1285321284;
                    }
                    break;
                case 511821622:
                case 1415634266:
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0619.m2761("۠۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6827) ^ (-1377892103);
                        i5 = 1261531305;
                    } else {
                        iM2761 = (C0619.m2761("᩵ܺ") ^ i3) * 57;
                        i4 = ((iM2761 ^ i2) * (-7545)) ^ 2103975822;
                        i5 = -684330742;
                    }
                    break;
                default:
                    if (C2288.m7767()) {
                        iM2761 = (C0773.m3169("᩻ۢ") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * 17035) ^ (-2059690006);
                        i5 = 1869567998;
                    } else {
                        iM2761 = C0619.m2761("᩵᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26179)) ^ (-1776011144);
                        i5 = -495326961;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m16474() {
        C15945 c15945 = null;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        AtomicInteger atomicInteger = null;
        C3072 c3072 = null;
        boolean z = false;
        C12267 c12267 = null;
        int i = 1225310828;
        int i2 = C0487.f2131;
        int i3 = C20932.f66974;
        int iM3169 = (i2 - C0773.m3169("ᩴۙ")) * 49;
        int i4 = ((iM3169 ^ i3) * 14507) ^ (-255889626);
        int i5 = 1070032996;
        while (true) {
            i = ((((i ^ i3) * (-1007)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1947365082:
                case 310431181:
                    if (C0269.m1775() <= 0) {
                        iM3169 = (C0619.m2761("֫ۗ") ^ i3) * 15;
                        i4 = ((iM3169 ^ i2) * 20479) ^ (-300722961);
                        i5 = -1680676448;
                    } else {
                        iM3169 = (C0773.m3169("ۧᩴ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i3) * 13073) ^ (-1509062583);
                        i5 = 2087705444;
                    }
                    break;
                case -1709939789:
                case 124583170:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ᩴ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29383)) ^ (-695717806);
                        i5 = -770591774;
                    } else {
                        iM3169 = C0619.m2761("ۨۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5735) ^ 1349712791;
                        i5 = -390675509;
                    }
                    break;
                case -1306698707:
                case 820166327:
                    viewOnClickListenerC7793.f25888 = false;
                    viewOnClickListenerC7793.m21229();
                    break;
                case -1276952129:
                case -3712977:
                    if (!C2354.m7983()) {
                        iM3169 = C0773.m3169("ۛܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10635)) ^ (-1272187587);
                        i5 = -122023735;
                    } else {
                        iM3169 = (C0619.m2761("֫ۗ") ^ i3) * 15;
                        i4 = ((iM3169 ^ i2) * 20479) ^ (-300722961);
                        i5 = -1680676448;
                    }
                    break;
                case -1268783801:
                case -333967416:
                    if (C1080.m4050()) {
                        iM3169 = (C0619.m2761("ۧۧ") + i2) * (-105);
                        i4 = ((iM3169 ^ i3) * 353) ^ 456518982;
                        i5 = -373117330;
                    } else {
                        iM3169 = C0773.m3169("۬ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29609) ^ (-1278457770);
                        i5 = 471551058;
                    }
                    break;
                case -1032137338:
                case 340356420:
                    c3072 = viewOnClickListenerC7793.f25880.f39447;
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("ۘۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8767) ^ 1209532141;
                        i5 = 667165494;
                    } else {
                        iM3169 = C0773.m3169("ۛܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10635)) ^ (-1272187587);
                        i5 = -122023735;
                    }
                    break;
                case -732325504:
                case 2106638145:
                    C11235.m28309();
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("۬ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29609) ^ (-1278457770);
                        i5 = 471551058;
                    } else {
                        iM3169 = C0773.m3169("ۛܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10635)) ^ (-1272187587);
                        i5 = -122023735;
                    }
                    break;
                case -573776997:
                case 1989297693:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("۬ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29609) ^ (-1278457770);
                        i5 = 471551058;
                    } else {
                        iM3169 = C0773.m3169("᩶ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 123) ^ (-220126993);
                        i5 = -958952976;
                    }
                    break;
                case -519552644:
                case 1415957668:
                    c3072.m10021(z);
                    c12267 = viewOnClickListenerC7793.f25872;
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0619.m2761("ۨ֨") + i3) * (-3);
                        i4 = ((iM3169 ^ i2) * 28079) ^ 1854004166;
                        i5 = -1412527439;
                    } else {
                        iM3169 = C0619.m2761("ܿ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19283)) ^ (-1038292971);
                        i5 = 1302566561;
                    }
                    break;
                case -421931839:
                case 1523725880:
                    c12267.f39447.m10021(z);
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("ۛܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10635)) ^ (-1272187587);
                        i5 = -122023735;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۢᩳ")) * (-39);
                        i4 = ((iM3169 ^ i3) * (-4519)) ^ (-124092032);
                        i5 = -536877054;
                    }
                    break;
                case -350543585:
                case -47307307:
                    C0487.m2360(c15945);
                    iM3169 = C0619.m2761("ܶۤ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 309) ^ (-579858673);
                    i5 = 1348099494;
                    break;
                case -271872918:
                case 2086223881:
                    C2288.m7767();
                    C0269.m1775();
                    iM3169 = (C0619.m2761("֫ۗ") ^ i3) * 15;
                    i4 = ((iM3169 ^ i2) * 20479) ^ (-300722961);
                    i5 = -1680676448;
                    break;
                case -125294913:
                case 347850626:
                    break;
                case -119654943:
                case 552590256:
                    if (this.f19297 != C1519.m5400(atomicInteger)) {
                        iM3169 = (C0773.m3169("ۨۙ") ^ i3) * 127;
                        i4 = ((iM3169 ^ i2) * 3957) ^ 188569753;
                        i5 = 797303310;
                    } else {
                        iM3169 = C0773.m3169("ۛ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31223)) ^ 656045178;
                        i5 = -390674842;
                    }
                    break;
                case 438930215:
                case 1628263849:
                    C0950.m3785();
                    break;
                case 512485000:
                case 1458162127:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ۛܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10635)) ^ (-1272187587);
                        i5 = -122023735;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20477)) ^ 486163335;
                        i5 = 765510920;
                    }
                    break;
                case 575053325:
                case 2056680269:
                    viewOnClickListenerC7793 = this.f19298;
                    atomicInteger = viewOnClickListenerC7793.f25882;
                    if (C3492.m11488()) {
                        iM3169 = C0773.m3169("ۡܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2159)) ^ (-82328594);
                        i5 = 1642323312;
                    } else {
                        iM3169 = C0773.m3169("۬ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29609) ^ (-1278457770);
                        i5 = 471551058;
                    }
                    break;
                case 779143520:
                case 817217342:
                    z = false;
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("۬ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29609) ^ (-1278457770);
                        i5 = 471551058;
                    } else {
                        iM3169 = C0773.m3169("ۖܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30033) ^ (-1513112299);
                        i5 = 2125061889;
                    }
                    break;
                case 920082692:
                case 1223642668:
                    if (C4238.m13540() <= 0) {
                        iM3169 = C0619.m2761("ۨۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5735) ^ 1349712791;
                        i5 = -390675509;
                    } else {
                        iM3169 = C0773.m3169("ۛܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10635)) ^ (-1272187587);
                        i5 = -122023735;
                    }
                    break;
                default:
                    c15945 = this.f19296;
                    if (c15945 != null) {
                        iM3169 = C0773.m3169("ۜ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15789)) ^ 825380170;
                        i5 = -60126950;
                    } else {
                        iM3169 = C0619.m2761("ܶۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 309) ^ (-579858673);
                        i5 = 1348099494;
                    }
                    break;
            }
            return;
        }
    }
}
