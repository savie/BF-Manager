package l;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۧ᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F6IK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11850 {

    /* JADX INFO: renamed from: ֨᩻ۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f38177 = {6676, -9118, -9139, -9145, -9135, -9140, -9142, -9145, -9213, -9152, -9140, -9138, -9133, -9142, -9137, -9146, -9213, -9137, -9142, -9151, -9135, -9150, -9135, -9126, -9213, -9152, -9141, -9146, -9152, -9144, -9136, -9130, -9138, -9213, -9138, -9142, -9136, -9138, -9150, -9129, -9152, -9141, -9147, -9150, -9197, -9189, -9152, -9151, -9194, -9194, -9150, -9190, -9194, -9189, -9199, -9200, -9190, -9189, -9152, -9199, -9152, -9151, -9150, -9150, -9193, -9199, -9190, -9193, -9200, -9196, -9146, -9193, -9197, -9189, -9198, -9194, -9194, -9194, -9152, -9147, -9199, -9146, -9190, -9200, -9151, -9145, -9152, -9152, -9147, -9196, -9190, -9150, -9147, -9199, -9189, -9145, -9146, -9190, -9200, -9151, -9189, -9152, -9152, -9199, -9194, -9198, -9110, -9139, -9131, -9150, -9137, -9142, -9145, -9213, -9118, -9139, -9145, -9135, -9140, -9142, -9145, -9213, -9152, -9140, -9138, -9133, -9142, -9137, -9146, -9213, -9137, -9142, -9151, -9135, -9150, -9135, -9126, -9213, -9146, -9139, -9129, -9135, -9126, -9191, -9213, -9097, -9135, -9130, -9139, -9152, -9150, -9129, -9146, -9145, -9213, -9118, -9139, -9145, -9135, -9140, -9142, -9145, -9213, -9152, -9140, -9138, -9133, -9142, -9137, -9146, -9213, -9137, -9142, -9151, -9135, -9150, -9135, -9126, -9213, -9146, -9139, -9129, -9135, -9126, -9118, -9139, -9145, -9135, -9140, -9142, -9145, -9213, -9152, -9140, -9138, -9133, -9142, -9137, -9146, -9213, -9137, -9142, -9151, -9135, -9150, -9135, -9126, -9213, -9152, -9150, -9139, -9152, -9146, -9137, -9146, -9145, 5290, 26592, 26575, 26565, 26579, 26574, 26568, 26565, 26497, 26562, 26574, 26572, 26577, 26568, 26573, 26564, 26497, 26573, 26568, 26563, 26579, 26560, 26579, 26584, 26497, 26562, 26560, 26575, 26562, 26564, 26573, 26564, 26565, 4160, -18723, -18726, -18805, -18813, -18728, -18727, -18802, -18802, -18726, -18814, -18802, -18813, -18807, -18808, -18814, -18813, -18728, -18807, -18728, -18727, -18726, -18726, -18801, -18807, -18814, -18801, -18808, -18804, -18722, -18801, -18805, -18813, -18806, -18802, -18802, -18802, -18728, -18723, -18807, -18722, -18814, -18808, -18727, -18721, -18728, -18728, -18723, -18804, -18814, -18726, -18723, -18807, -18813, -18721, -18722, -18814, -18808, -18727, -18813, -18728, -18728, -18807, -18802, -18806, 9078, 4193, 4140, 4131, 4142, 4156, 4156, 4192, 4193, 4193, 4193, 4902, -27411, -27454, -27448, -27426, -27453, -27451, -27448, -27508, -27441, -27453, -27455, -27428, -27451, -27456, -27447, -27508, -27456, -27451, -27442, -27426, -27443, -27426, -27435, -27508, -27420, -27400, -27400, -27396, -27508, -27443, -27454, -27448, -27426, -27453, -27451, -27448, -27519, -27456, -27451, -27442, -27426, -27443, -27426, -27435, -27519, -27518, -27432, -27455, -27428, -27409, -27443, -27454, -27454, -27453, -27432, -27508, -27441, -27426, -27447, -27443, -27432, -27447, -27508, -27411, -27454, -27448, -27426, -27453, -27451, -27448, -27508, -27441, -27453, -27455, -27428, -27451, -27456, -27447, -27508, -27456, -27451, -27442, -27426, -27443, -27426, -27435, -27508, -27448, -27451, -27426, -27447, -27441, -27432, -27453, -27426, -27435, -27411, -27454, -27448, -27426, -27453, -27451, -27448, -27508, -27441, -27453, -27455, -27428, -27451, -27456, -27447, -27508, -27456, -27451, -27442, -27426, -27443, -27426, -27435, -27508, -27426, -27447, -27425, -27428, -27453, -27454, -27425, -27447, -27508, -27442, -27453, -27448, -27435, -27508, -27451, -27425, -27508, -27455, -27451, -27425, -27425, -27451, -27454, -27445, -27409, -27443, -27454, -27454, -27453, -27432, -27508, -27426, -27447, -27428, -27456, -27443, -27441, -27447, -27508, -27411, -27454, -27448, -27426, -27453, -27451, -27448, -27508, -27441, -27453, -27455, -27428, -27451, -27456, -27447, -27508, -27456, -27451, -27442, -27426, -27443, -27426, -27435};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C5885 f38178 = new C5885();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29690(InterfaceC25004 interfaceC25004, AtomicBoolean atomicBoolean) {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 969369716;
        int i7 = C2288.f7433;
        int i8 = RunnableC3055.f9898;
        int iM3169 = (C0773.m3169("֨۬") + i7) * (-67);
        int i9 = ((iM3169 ^ i8) * 569) ^ (-1630713099);
        int i10 = -766054022;
        while (true) {
            i6 = ((((i6 ^ i8) * (-807)) >> 31) & i9) ^ (iM3169 ^ i10);
            switch (i6) {
                case -2015497443:
                case 1899387525:
                    s = sArr[c];
                    s2 = 13207;
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("ܺۖ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 14263) ^ 1665779052;
                        i10 = -1693691606;
                    } else {
                        iM3169 = (i8 - C0619.m2761("ۨۨ")) * 61;
                        i9 = ((iM3169 ^ i7) * (-22061)) ^ 1689386084;
                        i10 = -1014598999;
                    }
                    break;
                case -1962724426:
                case -52994519:
                    if (C11235.m28304(interfaceC25004)) {
                        iM3169 = C0619.m2761("᩶ۗ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-17373)) ^ (-1403958713);
                        i10 = -994361456;
                    } else {
                        iM3169 = C0619.m2761("ۗۘ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-4435)) ^ 352290025;
                        i10 = 751455123;
                    }
                    break;
                case -1918431726:
                case 724597460:
                    C4282.m13644();
                    return;
                case -1819047364:
                case 425196902:
                    i2 = i * i;
                    i3 = s * s;
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ۡۗ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 19159) ^ 534527395;
                        i10 = 490392188;
                    } else {
                        iM3169 = C0619.m2761("ۗۧ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-25299)) ^ 844774797;
                        i10 = 1880312654;
                    }
                    break;
                case -1776742489:
                case 2119926659:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("ۨᩳ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-29941)) ^ (-2147312320);
                        i10 = -269100604;
                    } else {
                        iM3169 = C0619.m2761("۟᩸") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-26891)) ^ (-176207783);
                        i10 = 108120939;
                    }
                    break;
                case -1710266822:
                case 1872541058:
                    i4 = 174424849;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ۨᩳ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-29941)) ^ (-2147312320);
                        i10 = -269100604;
                    } else {
                        iM3169 = (C0773.m3169("᩵ۛ") ^ i7) * 17;
                        i9 = ((iM3169 ^ i8) * (-29207)) ^ (-2060959557);
                        i10 = 1396552708;
                    }
                    break;
                case -1646858442:
                case 1680016207:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("ۨᩳ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-29941)) ^ (-2147312320);
                        i10 = -269100604;
                    } else {
                        iM3169 = C0619.m2761("ۛ֫") ^ i8;
                        i9 = ((iM3169 ^ i7) * 15747) ^ (-1303913207);
                        i10 = -23508407;
                    }
                    break;
                case -1553861708:
                case -735952663:
                    C3099.m10095();
                    C0862.m3503();
                    iM3169 = C0619.m2761("ۨᩳ") ^ i7;
                    i9 = ((iM3169 ^ i8) * (-29941)) ^ (-2147312320);
                    i10 = -269100604;
                    break;
                case -1494604820:
                case -448656573:
                    short[] sArr2 = f38177;
                    if (!C3690.m11987() && C3998.m12920()) {
                        throw new InterruptedIOException(C1321.m4861(sArr2, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 32, i5));
                    }
                    iM3169 = C0773.m3169("۠۠") ^ i7;
                    i9 = ((iM3169 ^ i8) * (-15243)) ^ (-1318187485);
                    i10 = 728230360;
                    break;
                case -1483414188:
                case -111243093:
                    C3448.m11248();
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ۡۗ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 19159) ^ 534527395;
                        i10 = 490392188;
                    } else {
                        iM3169 = C0619.m2761("۬ۢ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 3771) ^ (-1568660600);
                        i10 = 1232984390;
                    }
                    break;
                case -959027466:
                case 1915557319:
                    return;
                case -837799334:
                case 24901002:
                    c = 216;
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("۠۠") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-15243)) ^ (-1318187485);
                        i10 = 728230360;
                    } else {
                        iM3169 = (C0773.m3169("ۧۨ") ^ i7) * (-121);
                        i9 = ((iM3169 ^ i8) * (-29979)) ^ 144607160;
                        i10 = -135176543;
                    }
                    break;
                case -731949553:
                case 1432712339:
                    int i11 = i3 + i4;
                    if (i2 - (i11 + i11) <= 0) {
                        iM3169 = (C0619.m2761("ܶܰ") ^ i8) * (-41);
                        i9 = ((iM3169 ^ i7) * 5073) ^ (-1743054167);
                        i10 = -74211935;
                    } else {
                        iM3169 = C0773.m3169("᩻ᩴ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 11) ^ (-2031845361);
                        i10 = 88293385;
                    }
                    break;
                case -514020494:
                case 187966429:
                    i = s + s2;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("۠۠") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-15243)) ^ (-1318187485);
                        i10 = 728230360;
                    } else {
                        iM3169 = C0773.m3169("᩸ۖ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-4995)) ^ (-43973711);
                        i10 = 2064048485;
                    }
                    break;
                case -507884652:
                case -148446738:
                    C0619.m2763();
                    if (C3690.f12684 > 0) {
                        iM3169 = C0619.m2761("۬ۢ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 3771) ^ (-1568660600);
                        i10 = 1232984390;
                    } else {
                        iM3169 = C0619.m2761("ۨᩳ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-29941)) ^ (-2147312320);
                        i10 = -269100604;
                    }
                    break;
                case -44325108:
                case 1286311657:
                    if (atomicBoolean.get()) {
                        iM3169 = C0619.m2761("᩶ۗ") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-17373)) ^ (-1403958713);
                        i10 = -994361456;
                    } else {
                        iM3169 = (i7 - C0619.m2761("ᩴ֡")) * 7;
                        i9 = ((iM3169 ^ i8) * (-3973)) ^ 2037132739;
                        i10 = 1291788793;
                    }
                    break;
                case -28598065:
                case 344287229:
                    sArr = f38177;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ۡۗ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 19159) ^ 534527395;
                        i10 = 490392188;
                    } else {
                        iM3169 = (C0619.m2761("۬ۖ") + i8) * (-57);
                        i9 = ((iM3169 ^ i7) * 13849) ^ 1313703063;
                        i10 = -568302968;
                    }
                    break;
                case 983790210:
                case 1729243149:
                    i5 = 46554;
                    iM3169 = C0619.m2761("ۤ᩵") ^ i8;
                    i9 = ((iM3169 ^ i7) * (-12689)) ^ 1720258397;
                    i10 = -1497921156;
                    break;
                case 1212542309:
                case 2048041139:
                    i5 = 26529;
                    iM3169 = C0619.m2761("ۤ᩵") ^ i8;
                    i9 = ((iM3169 ^ i7) * (-12689)) ^ 1720258397;
                    i10 = -1497921156;
                    break;
                default:
                    C3448.m11248();
                    if (C1080.f3865 < 0) {
                        iM3169 = C0773.m3169("ܺۖ") ^ i7;
                        i9 = ((iM3169 ^ i8) * 14263) ^ 1665779052;
                        i10 = -1693691606;
                    } else {
                        iM3169 = C0619.m2761("۬ۢ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 3771) ^ (-1568660600);
                        i10 = 1232984390;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23381. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29691(java.io.File r50) {
        /*
            Method dump skipped, instruction units count: 2338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11850.m29691(java.io.File):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:78:0x02d6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29693(C24363 c24363, String str, File file, InterfaceC25004 interfaceC25004) throws Throwable {
        int i;
        int iM2761;
        int i2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        int iM31610;
        int i6;
        int i7;
        Throwable th = null;
        int i8 = C3734.f12817;
        int i9 = C11235.f35427;
        int iM31611 = (C0773.m3169("᩷֡") ^ i8) * 97;
        int i10 = ((iM31611 ^ i9) * 5721) ^ (-988586351);
        Throwable th2 = null;
        C9444 c9444Execute = null;
        Object obj = null;
        int i11 = iM31611 ^ 85266202;
        String strM6366 = null;
        int i12 = 0;
        boolean z = false;
        boolean zM28304 = false;
        boolean zM24819 = false;
        boolean z2 = false;
        boolean zM8058 = false;
        boolean zRenameTo = false;
        IOException iOException = null;
        AbstractC8699 abstractC8699M24818 = null;
        int i13 = 1934261714;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = null;
        AtomicBoolean atomicBoolean = null;
        InterfaceC6595 interfaceC6595M54450 = null;
        File fileCreateTempFile = null;
        File parentFile = null;
        boolean z3 = false;
        while (true) {
            i13 = i11 ^ (i10 & (((i13 ^ i9) * 14441) >> 31));
            switch (i13) {
                case -2014438248:
                case 1561451889:
                    obj = obj;
                    th = th;
                    fileCreateTempFile = File.createTempFile(C1343.m4939(f38177, 355, 16, i12), C13473.m33137(f38177, 371, 4, i12), parentFile);
                    C0496 c0496 = new C0496();
                    c0496.m2397(str);
                    interfaceC6595M54450 = c24363.m54450(c0496.m2389());
                    atomicBoolean = new AtomicBoolean();
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC13342());
                    iM3169 = (i8 - C0619.m2761("ᩳ᩵")) * 99;
                    i4 = ((iM3169 ^ i9) * (-8901)) ^ 1451351753;
                    i5 = 913773188;
                    i11 = iM3169 ^ i5;
                    i10 = i4;
                    obj = obj;
                    th = th;
                    break;
                case -1974424630:
                case -752902145:
                    obj = obj;
                    th = th;
                    strM6366 = RunnableC1848.m6366(f38177, 326, 29, i12);
                    z3 = false;
                    if (C11235.m28304(interfaceC25004)) {
                        iM3169 = (C0619.m2761("ۛۢ") + i8) * 59;
                        i4 = ((iM3169 ^ i9) * 12221) ^ (-1389694940);
                        i5 = 803372457;
                    } else {
                        iM3169 = C0619.m2761("᩸۬") ^ i8;
                        i4 = ((iM3169 ^ i9) * (-16961)) ^ (-1838683771);
                        i5 = 24671773;
                    }
                    i11 = iM3169 ^ i5;
                    i10 = i4;
                    obj = obj;
                    th = th;
                    break;
                case -1840270559:
                case 109479779:
                    try {
                        obj = obj;
                        i = i12;
                        th = th;
                        try {
                            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new RunnableC1903(interfaceC25004, atomicBoolean, interfaceC6595M54450, 2), 0L, 100L, TimeUnit.MILLISECONDS);
                            c9444Execute = interfaceC6595M54450.execute();
                            iM31610 = C0773.m3169("᩹۬") ^ i9;
                            i6 = ((iM31610 ^ i8) * 20009) ^ 91442956;
                            i7 = 1148635821;
                        } catch (IOException e) {
                            e = e;
                            iOException = e;
                            iM31610 = C0773.m3169("ܽۨ") ^ i8;
                            i6 = ((iM31610 ^ i9) * (-9297)) ^ (-248162843);
                            i7 = 2100001749;
                        } catch (Throwable th3) {
                            th = th3;
                            th2 = th;
                            iM31610 = C0619.m2761("ᩴۢ") ^ i9;
                            i6 = ((iM31610 ^ i8) * (-20863)) ^ (-1251664886);
                            i7 = -1829720810;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        obj = obj;
                        i = i12;
                        th = th;
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj;
                        i = i12;
                        th = th;
                    }
                    i11 = i7 ^ iM31610;
                    i10 = i6;
                    obj = obj;
                    th = th;
                    i12 = i;
                    break;
                case -1819027062:
                case -1687643002:
                    throw iOException;
                case -1804893232:
                case -1603974286:
                    obj = obj;
                    th = th;
                    parentFile = file.getAbsoluteFile().getParentFile();
                    if (parentFile.isDirectory()) {
                        iM3169 = C0773.m3169("᩶ۤ") ^ i9;
                        i4 = ((iM3169 ^ i8) * (-9929)) ^ 89538316;
                        i5 = -806300405;
                    } else {
                        iM3169 = (C0773.m3169("ܿۙ") + i9) * 5;
                        i4 = ((iM3169 ^ i8) * 21727) ^ (-1293732515);
                        i5 = -1798287788;
                    }
                    i11 = iM3169 ^ i5;
                    i10 = i4;
                    obj = obj;
                    th = th;
                    break;
                case -1611194003:
                case -816259789:
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdownNow();
                    C0147.m1307(fileCreateTempFile);
                    return true;
                case -1475254506:
                case 55218133:
                    zM28304 = C11235.m28304(interfaceC25004);
                    iM2761 = C0619.m2761("۟ۨ") ^ i8;
                    i2 = ((iM2761 ^ i9) * 28343) ^ 1501756373;
                    i3 = 1545871027;
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case -1464964136:
                case 950242780:
                    i12 = 38060;
                    iM3169 = (C0619.m2761("ۤ᩺") + i9) * (-29);
                    i4 = ((iM3169 ^ i8) * 14669) ^ 348904046;
                    i5 = -1889836287;
                    i11 = iM3169 ^ i5;
                    i10 = i4;
                    obj = obj;
                    th = th;
                    break;
                case -1404352373:
                case -791037119:
                    try {
                        try {
                            zRenameTo = fileCreateTempFile.renameTo(file);
                            iM2761 = (i9 - C0619.m2761("ۨ֫")) * 39;
                            i2 = ((iM2761 ^ i8) * (-7083)) ^ (-788023395);
                            i3 = 1138618567;
                            i11 = i3 ^ iM2761;
                            i10 = i2;
                        } catch (IOException e3) {
                            iOException = e3;
                            obj = obj;
                            i = i12;
                            th = th;
                            iM31610 = C0773.m3169("ܽۨ") ^ i8;
                            i6 = ((iM31610 ^ i9) * (-9297)) ^ (-248162843);
                            i7 = 2100001749;
                            i11 = i7 ^ iM31610;
                            i10 = i6;
                            obj = obj;
                            th = th;
                            i12 = i;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        obj = obj;
                        i = i12;
                        th = th;
                        iM31610 = C0619.m2761("ᩴۢ") ^ i9;
                        i6 = ((iM31610 ^ i8) * (-20863)) ^ (-1251664886);
                        i7 = -1829720810;
                        i11 = i7 ^ iM31610;
                        i10 = i6;
                        obj = obj;
                        th = th;
                        i12 = i;
                    }
                    break;
                case -1393811495:
                case -236040876:
                    try {
                        m29689(abstractC8699M24818.m23391(), fileCreateTempFile, interfaceC25004, atomicBoolean);
                        iM2761 = (C0773.m3169("ۧۙ") ^ i9) * 37;
                        i2 = ((iM2761 ^ i8) * (-6051)) ^ 2076904947;
                        i3 = 598510766;
                    } catch (Throwable th6) {
                        th = th6;
                        iM2761 = C0619.m2761("᩺ᩴ") ^ i9;
                        i2 = ((iM2761 ^ i8) * (-16615)) ^ 1333855612;
                        i3 = -776982216;
                    }
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case -1347423403:
                case 40986930:
                    throw new IOException(C23916.m53420(f38177, FloatingActionButton.AUTO_MINI_LARGEST_SCREEN_WIDTH, 38, i12));
                case -1270749143:
                case -687228911:
                    if (zM24819) {
                        iM2761 = (C0619.m2761("᩶᩶") + i8) * (-57);
                        i2 = ((iM2761 ^ i9) * (-4035)) ^ (-678530481);
                        i3 = -433944387;
                    } else {
                        iM2761 = C0619.m2761("ܺ֫") ^ i9;
                        i2 = ((iM2761 ^ i8) * 23729) ^ 1281583594;
                        i3 = -1089907660;
                    }
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case -1182842728:
                case 1323595086:
                    throw new IOException(C3779.m12266(f38177, 422, 48, i12));
                case -929195197:
                case -353809828:
                    zM8058 = C2375.m8058(interfaceC25004);
                    iM2761 = C0619.m2761("ܺ᩹") ^ i8;
                    i2 = ((iM2761 ^ i9) * (-9321)) ^ 1971019572;
                    i3 = 1512683939;
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case -893408177:
                case 884792891:
                    RunnableC3646.m11799(th, obj);
                    iM2761 = C0619.m2761("ۨܽ") ^ i9;
                    i2 = ((iM2761 ^ i8) * (-8343)) ^ (-1659985654);
                    i3 = -577299870;
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case -818311835:
                case 250122063:
                    if (zM8058) {
                        iM2761 = (i8 - C0619.m2761("֫᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM2761 ^ i9) * 31377) ^ (-2000062145);
                        i3 = -1707714405;
                    } else {
                        iM2761 = C0773.m3169("ܺۜ") ^ i8;
                        i2 = ((iM2761 ^ i9) * (-5005)) ^ (-617215881);
                        i3 = 1170838298;
                    }
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case -813366871:
                case -243235370:
                    i12 = 60448;
                    iM3169 = (C0619.m2761("ۤ᩺") + i9) * (-29);
                    i4 = ((iM3169 ^ i8) * 14669) ^ 348904046;
                    i5 = -1889836287;
                    i11 = iM3169 ^ i5;
                    i10 = i4;
                    obj = obj;
                    th = th;
                    break;
                case -694697366:
                case 601334600:
                    zM24819 = c9444Execute.m24819();
                    iM2761 = (i8 - C0773.m3169("᩷ܶ")) * (-15);
                    i2 = ((iM2761 ^ i9) * (-2317)) ^ (-311269998);
                    i3 = -260732589;
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case -576022068:
                case 1902158124:
                    throw new IOException(C1564.m5510(f38177, 375, 47, i12));
                case -563288559:
                case 1333130339:
                    throw th;
                case -398765529:
                case 1772633784:
                    z = atomicBoolean.get();
                    iM2761 = C0619.m2761("᩷ܽ") ^ i8;
                    i2 = ((iM2761 ^ i9) * (-22387)) ^ 1220015060;
                    i3 = -1690987424;
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case -272843808:
                case 1002938808:
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdownNow();
                    C0147.m1307(fileCreateTempFile);
                    return z3;
                case -234927433:
                case 2040182985:
                    obj = obj;
                    th = th;
                    short s = f38177[325];
                    int i14 = s + 10981;
                    int i15 = (s * s) + 120582361;
                    if ((i14 * i14) - (i15 + i15) <= 0) {
                        iM3169 = C0773.m3169("ܿۖ") ^ i8;
                        i4 = ((iM3169 ^ i9) * (-30311)) ^ (-1520847346);
                        i5 = 1035878934;
                    } else {
                        iM3169 = C0773.m3169("᩶᩻") ^ i9;
                        i4 = ((iM3169 ^ i8) * 14565) ^ (-1000110409);
                        i5 = 1667364935;
                    }
                    i11 = iM3169 ^ i5;
                    i10 = i4;
                    obj = obj;
                    th = th;
                    break;
                case -24995703:
                case 1961904329:
                    return z3;
                case 1156268:
                case 979560997:
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdownNow();
                    C0147.m1307(fileCreateTempFile);
                    throw th2;
                case 43122148:
                case 237396351:
                    if (z) {
                        iM2761 = (i8 - C0619.m2761("֫᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM2761 ^ i9) * 31377) ^ (-2000062145);
                        i3 = -1707714405;
                    } else {
                        iM2761 = C0619.m2761("᩻ۧ") ^ i9;
                        i2 = ((iM2761 ^ i8) * (-5351)) ^ 1509969146;
                        i3 = 988835726;
                    }
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case 232172934:
                case 254047152:
                    if (abstractC8699M24818 != null) {
                        iM2761 = C0773.m3169("ۗܶ") ^ i9;
                        i2 = ((iM2761 ^ i8) * 18107) ^ 1501402603;
                        i3 = 1041168306;
                    } else {
                        iM2761 = (C0619.m2761("᩷ܰ") + i8) * 31;
                        i2 = ((iM2761 ^ i9) * (-2341)) ^ 528198344;
                        i3 = -1273856138;
                    }
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case 425726704:
                case 1507370216:
                    c9444Execute.close();
                    z2 = atomicBoolean.get();
                    iM2761 = C0773.m3169("᩷ܿ") ^ i8;
                    i2 = ((iM2761 ^ i9) * 18391) ^ (-758869997);
                    i3 = -1020589194;
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case 477752971:
                case 596223952:
                    if (zRenameTo) {
                        iM2761 = (C0619.m2761("۬᩸") ^ i8) * 33;
                        i2 = ((iM2761 ^ i9) * (-18099)) ^ (-998259181);
                        i3 = -1460725960;
                    } else {
                        iM2761 = (C0619.m2761("ᩴᩴ") + i9) * (-77);
                        i2 = ((iM2761 ^ i8) * (-16987)) ^ 623791582;
                        i3 = 2136473705;
                    }
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case 514526375:
                case 770409169:
                    StringBuilder sb = new StringBuilder(strM6366);
                    C3779.m12269(sb, c9444Execute.m24820());
                    throw new IOException(C2023.m6952(sb));
                case 682096818:
                case 1867306578:
                    abstractC8699M24818 = c9444Execute.m24818();
                    iM2761 = C0619.m2761("ۛۧ") ^ i8;
                    i2 = ((iM2761 ^ i9) * (-16289)) ^ 1808717801;
                    i3 = -1707841947;
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case 1056360583:
                case 1446575719:
                    if (z2) {
                        iM2761 = (i8 - C0619.m2761("֫᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM2761 ^ i9) * 31377) ^ (-2000062145);
                        i3 = -1707714405;
                    } else {
                        iM2761 = C0773.m3169("ۗܰ") ^ i9;
                        i2 = ((iM2761 ^ i8) * (-10003)) ^ (-1486355621);
                        i3 = 2014028337;
                    }
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
                case 1129401686:
                case 1692506069:
                    try {
                        c9444Execute.close();
                        iM2761 = C0619.m2761("ۨܽ") ^ i9;
                        i2 = ((iM2761 ^ i8) * (-8343)) ^ (-1659985654);
                        i3 = -577299870;
                        i11 = i3 ^ iM2761;
                        i10 = i2;
                    } catch (Throwable th7) {
                        int iM2762 = (i8 - C0619.m2761("ܺᩳ")) * (-15);
                        obj = th7;
                        i10 = ((iM2762 ^ i9) * 18613) ^ 1476632400;
                        i11 = iM2762 ^ (-1901249521);
                    }
                    break;
                case 1254082642:
                case 2145646446:
                    obj = obj;
                    i = i12;
                    th = th;
                    if (!parentFile.mkdirs()) {
                        iM31610 = (C0773.m3169("۟ۢ") + i9) * (-93);
                        i6 = ((iM31610 ^ i8) * (-2107)) ^ 1660747596;
                        i7 = 2116673737;
                        i11 = i7 ^ iM31610;
                        i10 = i6;
                        obj = obj;
                        th = th;
                        i12 = i;
                    } else {
                        i12 = i;
                        iM3169 = C0773.m3169("᩶ۤ") ^ i9;
                        i4 = ((iM3169 ^ i8) * (-9929)) ^ 89538316;
                        i5 = -806300405;
                        i11 = iM3169 ^ i5;
                        i10 = i4;
                        obj = obj;
                        th = th;
                    }
                    break;
                default:
                    if (zM28304) {
                        iM2761 = (i8 - C0619.m2761("֫᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM2761 ^ i9) * 31377) ^ (-2000062145);
                        i3 = -1707714405;
                    } else {
                        iM2761 = (i9 - C0773.m3169("ۡۢ")) * (-21);
                        i2 = ((iM2761 ^ i8) * (-5947)) ^ 770521860;
                        i3 = 1611661659;
                    }
                    i11 = i3 ^ iM2761;
                    i10 = i2;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 32501. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29689(java.io.InputStream r54, java.io.File r55, l.InterfaceC25004 r56, java.util.concurrent.atomic.AtomicBoolean r57) {
        /*
            Method dump skipped, instruction units count: 3250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11850.m29689(java.io.InputStream, java.io.File, l.᩻ۧܺ, java.util.concurrent.atomic.AtomicBoolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0534 A[PHI: r1 r4 r13 r20 r21 r23 r24 r26 r27 r31
      0x0534: PHI (r1v75 int) = (r1v14 int), (r1v73 int), (r1v76 int) binds: [B:9:0x0091, B:107:0x0532, B:99:0x04b5] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r4v16 short[]) = (r4v5 short[]), (r4v14 short[]), (r4v17 short[]) binds: [B:9:0x0091, B:107:0x0532, B:99:0x04b5] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r13v53 int) = (r13v8 int), (r13v51 int), (r13v54 int) binds: [B:9:0x0091, B:107:0x0532, B:99:0x04b5] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r20v3 int) = (r20v2 int), (r20v2 int), (r20v4 int) binds: [B:9:0x0091, B:107:0x0532, B:99:0x04b5] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r21v4 short) = (r21v2 short), (r21v3 short), (r21v2 short) binds: [B:9:0x0091, B:107:0x0532, B:99:0x04b5] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r23v13 int) = (r23v5 int), (r23v11 int), (r23v14 int) binds: [B:9:0x0091, B:107:0x0532, B:99:0x04b5] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r24v12 java.lang.String) = (r24v5 java.lang.String), (r24v10 java.lang.String), (r24v13 java.lang.String) binds: [B:9:0x0091, B:107:0x0532, B:99:0x04b5] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r26v13 java.lang.String[]) = (r26v5 java.lang.String[]), (r26v11 java.lang.String[]), (r26v14 java.lang.String[]) binds: [B:9:0x0091, B:107:0x0532, B:99:0x04b5] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r27v11 int) = (r27v5 int), (r27v9 int), (r27v12 int) binds: [B:9:0x0091, B:107:0x0532, B:99:0x04b5] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r31v40 short[]) = (r31v6 short[]), (r31v38 short[]), (r31v41 short[]) binds: [B:9:0x0091, B:107:0x0532, B:99:0x04b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01dd A[PHI: r7
      0x01dd: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:48:0x01c5, B:40:0x0181, B:32:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v33 */
    /* JADX WARN: Type inference failed for: r25v38 */
    /* JADX WARN: Type inference failed for: r25v40 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29692(String str) {
        int iM2761;
        int i;
        int i2;
        int i3;
        int i4;
        short[] sArr;
        int i5;
        ?? r25;
        int i6;
        String[] strArr;
        short[] sArr2;
        int i7;
        short[] sArr3;
        int iM2762;
        int i8;
        int i9;
        int i10;
        str = str;
        int i11 = C3734.f12817;
        int i12 = C1080.f3865;
        int iM2763 = C0619.m2761("ۗ۠") ^ i11;
        int i13 = ((iM2763 ^ i12) * 3051) ^ 603483476;
        String[] strArr2 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i14 = iM2763 ^ 953658146;
        int length = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        char c = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        short s = 0;
        short s2 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1694436849;
        int i27 = 0;
        String str2 = null;
        String str3 = null;
        ?? r2 = 0;
        int i28 = 0;
        while (true) {
            i26 = i14 ^ (i13 & (((i26 ^ i12) * 21013) >> 31));
            switch (i26) {
                case -2085836196:
                case -361217871:
                    i23 = i23;
                    sArr6 = sArr6;
                    i27 = i27;
                    str2 = str2;
                    i24 = i24;
                    int i29 = i25;
                    strArr2 = strArr2;
                    sArr5 = sArr5;
                    i3 = i29;
                    s = sArr4[c];
                    if (C2023.f6737) {
                        iM2762 = (C0619.m2761("ܿ۫") ^ i12) * (-69);
                        i8 = ((iM2762 ^ i11) * (-4047)) ^ (-693851765);
                        i9 = -131927186;
                    } else {
                        iM2762 = (C0619.m2761("ܰ۫") + i12) * (-109);
                        i8 = ((iM2762 ^ i11) * (-3319)) ^ 305522188;
                        i9 = 1050528081;
                    }
                    i10 = iM2762 ^ i9;
                    i27 = i27;
                    i24 = i24;
                    sArr6 = sArr6;
                    i14 = i10;
                    str = str;
                    String str4 = str2;
                    i23 = i23;
                    i13 = i8;
                    str2 = str4;
                    int i30 = i3;
                    sArr5 = sArr5;
                    strArr2 = strArr2;
                    i25 = i30;
                    break;
                case -2040447194:
                case 65675920:
                    return r2;
                case -2004967058:
                case -396831342:
                    if (C2375.m8073(str, 92) >= 0) {
                        i4 = i24;
                        sArr = sArr6;
                        i5 = i27;
                        r25 = r2;
                        i6 = i23;
                        int i31 = i25;
                        strArr = strArr2;
                        sArr2 = sArr5;
                        i7 = i31;
                        int iM2764 = (C0619.m2761("۟ۜ") ^ i12) * 87;
                        int i32 = i4;
                        i13 = ((iM2764 ^ i11) * (-30597)) ^ (-253099709);
                        i23 = i6;
                        i27 = i5;
                        r2 = r25;
                        i24 = i32;
                        sArr6 = sArr;
                        i14 = iM2764 ^ 101360144;
                        int i33 = i7;
                        sArr5 = sArr2;
                        strArr2 = strArr;
                        i25 = i33;
                    } else {
                        iM2761 = C0773.m3169("ۜۢ") ^ i11;
                        i = ((iM2761 ^ i12) * 241) ^ 582795300;
                        i2 = -1948042981;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                    }
                    break;
                case -1982636269:
                case -145361906:
                    return r2;
                case -1908787629:
                case -655147728:
                    if (C3448.f11240 < 0) {
                        sArr3 = sArr5;
                        i23 = i23;
                        i3 = i25;
                        sArr6 = sArr6;
                        i27 = i27;
                        str2 = str2;
                        strArr2 = strArr2;
                        int iM3169 = C0773.m3169("۟ۛ") ^ i12;
                        int i34 = ((iM3169 ^ i11) * 19181) ^ (-1235257260);
                        i27 = i27;
                        sArr6 = sArr6;
                        i14 = iM3169 ^ (-1236966078);
                        str2 = str2;
                        i23 = i23;
                        i13 = i34;
                        strArr2 = strArr2;
                        i25 = i3;
                        sArr5 = sArr3;
                        str = str;
                    } else {
                        iM2761 = C0773.m3169("᩶᩷") ^ i12;
                        i = ((iM2761 ^ i11) * (-31873)) ^ (-1372563474);
                        i2 = 491699686;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                    }
                    break;
                case -1789725490:
                case -1379418254:
                    i23 = i23;
                    sArr6 = sArr6;
                    i27 = i27;
                    str2 = str2;
                    i24 = i24;
                    int i35 = i25;
                    strArr2 = strArr2;
                    sArr5 = sArr5;
                    i3 = i35;
                    sArr4 = f38177;
                    if (C3779.m12264()) {
                        iM2762 = (C0773.m3169("֫᩻") + i12) * (-85);
                        i8 = ((iM2762 ^ i11) * 5195) ^ (-1729509570);
                        i9 = 2126768249;
                    } else {
                        iM2762 = (C0619.m2761("᩸۟") ^ i11) * 17;
                        i8 = ((iM2762 ^ i12) * (-16503)) ^ (-616019216);
                        i9 = -1679852100;
                    }
                    i10 = iM2762 ^ i9;
                    i27 = i27;
                    i24 = i24;
                    sArr6 = sArr6;
                    i14 = i10;
                    str = str;
                    String str5 = str2;
                    i23 = i23;
                    i13 = i8;
                    str2 = str5;
                    int i36 = i3;
                    sArr5 = sArr5;
                    strArr2 = strArr2;
                    i25 = i36;
                    break;
                case -1742029456:
                case 762470694:
                    i23 = i23;
                    sArr6 = sArr6;
                    i27 = i27;
                    str2 = str2;
                    i24 = i24;
                    int i37 = i25;
                    strArr2 = strArr2;
                    sArr5 = sArr5;
                    i3 = i37;
                    int i38 = i20 + i21;
                    i22 = i38 + i38;
                    if (C1826.f6190 <= 0) {
                        iM2762 = (C0619.m2761("ܿ۫") ^ i12) * (-69);
                        i8 = ((iM2762 ^ i11) * (-4047)) ^ (-693851765);
                        i9 = -131927186;
                    } else {
                        iM2762 = (i11 - C0619.m2761("֨֡")) * 85;
                        i8 = ((iM2762 ^ i12) * (-15311)) ^ 163118428;
                        i9 = -1324468347;
                    }
                    i10 = iM2762 ^ i9;
                    i27 = i27;
                    i24 = i24;
                    sArr6 = sArr6;
                    i14 = i10;
                    str = str;
                    String str6 = str2;
                    i23 = i23;
                    i13 = i8;
                    str2 = str6;
                    int i39 = i3;
                    sArr5 = sArr5;
                    strArr2 = strArr2;
                    i25 = i39;
                    break;
                case -1582584048:
                case -1468266587:
                    C3448.m11248();
                    if (!C2878.f9462) {
                        iM2761 = C0773.m3169("ܰۨ") ^ i12;
                        i = ((iM2761 ^ i11) * (-30703)) ^ (-66048230);
                        i2 = 60132960;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                    } else {
                        i23 = i23;
                        sArr6 = sArr6;
                        i27 = i27;
                        str2 = str2;
                        i24 = i24;
                        int i40 = i25;
                        strArr2 = strArr2;
                        sArr5 = sArr5;
                        i3 = i40;
                        iM2762 = (C0619.m2761("ܿ۫") ^ i12) * (-69);
                        i8 = ((iM2762 ^ i11) * (-4047)) ^ (-693851765);
                        i9 = -131927186;
                        i10 = iM2762 ^ i9;
                        i27 = i27;
                        i24 = i24;
                        sArr6 = sArr6;
                        i14 = i10;
                        str = str;
                        String str7 = str2;
                        i23 = i23;
                        i13 = i8;
                        str2 = str7;
                        int i310 = i3;
                        sArr5 = sArr5;
                        strArr2 = strArr2;
                        i25 = i310;
                    }
                    break;
                case -1477182114:
                case 942960643:
                    strArr2 = strArr2;
                    sArr6 = f38177;
                    i27 = 321;
                    if (C13473.f42873 != 0) {
                        sArr5 = sArr5;
                        i23 = i23;
                        sArr6 = sArr6;
                        i3 = 1;
                        str2 = str2;
                        i24 = i24;
                        int iM31610 = (C0773.m3169("ۨܳ") ^ i11) * (-79);
                        i8 = ((iM31610 ^ i12) * (-14825)) ^ (-81639736);
                        i10 = iM31610 ^ 2133268341;
                        i24 = i24;
                        sArr6 = sArr6;
                        i14 = i10;
                        str = str;
                        String str8 = str2;
                        i23 = i23;
                        i13 = i8;
                        str2 = str8;
                        int i311 = i3;
                        sArr5 = sArr5;
                        strArr2 = strArr2;
                        i25 = i311;
                    } else {
                        int iM2765 = (i11 - C0619.m2761("ۢۢ")) * (-121);
                        i14 = iM2765 ^ (-1216771583);
                        i13 = ((iM2765 ^ i12) * (-10635)) ^ (-788192993);
                        strArr2 = strArr2;
                        i25 = 1;
                    }
                    break;
                case -1416173624:
                case 792346852:
                    i23 = i23;
                    sArr6 = sArr6;
                    i27 = i27;
                    str2 = str2;
                    i24 = i24;
                    int i41 = i25;
                    strArr2 = strArr2;
                    sArr5 = sArr5;
                    i3 = i41;
                    i20 = s * s;
                    i21 = 160199649;
                    if (C0619.f2439) {
                        iM2762 = (C0773.m3169("ᩴܰ") + i11) * 109;
                        i8 = ((iM2762 ^ i12) * (-24387)) ^ (-394817760);
                        i9 = -772523276;
                    } else {
                        iM2762 = (i11 - C0773.m3169("ܺۡ")) * (-109);
                        i8 = ((iM2762 ^ i12) * 10087) ^ 668390372;
                        i9 = 269547238;
                    }
                    i10 = iM2762 ^ i9;
                    i27 = i27;
                    i24 = i24;
                    sArr6 = sArr6;
                    i14 = i10;
                    str = str;
                    String str9 = str2;
                    i23 = i23;
                    i13 = i8;
                    str2 = str9;
                    int i312 = i3;
                    sArr5 = sArr5;
                    strArr2 = strArr2;
                    i25 = i312;
                    break;
                case -1375047297:
                case -1053223350:
                    str2 = str2;
                    i3 = i25;
                    sArr6 = sArr6;
                    i27 = i27;
                    strArr2 = strArr2;
                    sArr3 = f38177;
                    i23 = 315;
                    i24 = 6;
                    if (RunnableC0334.f1808 <= 0) {
                        int iM31611 = C0773.m3169("۟ۛ") ^ i12;
                        int i313 = ((iM31611 ^ i11) * 19181) ^ (-1235257260);
                        i27 = i27;
                        sArr6 = sArr6;
                        i14 = iM31611 ^ (-1236966078);
                        str2 = str2;
                        i23 = i23;
                        i13 = i313;
                        strArr2 = strArr2;
                        i25 = i3;
                    } else {
                        int iM31612 = C0773.m3169("ܶ᩻") ^ i12;
                        i13 = ((iM31612 ^ i11) * (-623)) ^ 1675311383;
                        i27 = i27;
                        strArr2 = strArr2;
                        sArr6 = sArr6;
                        i14 = iM31612 ^ (-1004182094);
                        i25 = i3;
                        str2 = str2;
                        i23 = 315;
                    }
                    sArr5 = sArr3;
                    str = str;
                    break;
                case -1300535336:
                case 1238336725:
                    sArr8 = f38177;
                    i17 = 323;
                    i18 = 2;
                    if (!C3077.f9998) {
                        i23 = i23;
                        sArr6 = sArr6;
                        i27 = i27;
                        str2 = str2;
                        i24 = i24;
                        int i42 = i25;
                        strArr2 = strArr2;
                        sArr5 = sArr5;
                        i3 = i42;
                        iM2762 = (C0619.m2761("᩸۟") ^ i11) * 17;
                        i8 = ((iM2762 ^ i12) * (-16503)) ^ (-616019216);
                        i9 = -1679852100;
                        i10 = iM2762 ^ i9;
                        i27 = i27;
                        i24 = i24;
                        sArr6 = sArr6;
                        i14 = i10;
                        str = str;
                        String str10 = str2;
                        i23 = i23;
                        i13 = i8;
                        str2 = str10;
                        int i314 = i3;
                        sArr5 = sArr5;
                        strArr2 = strArr2;
                        i25 = i314;
                    } else {
                        iM2761 = C0619.m2761("֨ۨ") ^ i12;
                        i = ((iM2761 ^ i11) * (-16131)) ^ (-48628739);
                        i2 = -565020588;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                    }
                    break;
                case -970218033:
                case 178967377:
                    C1146.m4231();
                    C0773.m3161();
                    return false;
                case -963865929:
                case 1020541443:
                    return true;
                case -962991246:
                case 1718194567:
                    i3 = i25;
                    i19 = 4175;
                    iM2762 = C0619.m2761("֨ᩴ") ^ i11;
                    i8 = ((iM2762 ^ i12) * 10409) ^ 669978512;
                    i9 = 991589898;
                    i10 = iM2762 ^ i9;
                    i27 = i27;
                    i24 = i24;
                    sArr6 = sArr6;
                    i14 = i10;
                    str = str;
                    String str11 = str2;
                    i23 = i23;
                    i13 = i8;
                    str2 = str11;
                    int i315 = i3;
                    sArr5 = sArr5;
                    strArr2 = strArr2;
                    i25 = i315;
                    break;
                case -816399547:
                case 587737009:
                    i23 = i23;
                    sArr6 = sArr6;
                    i27 = i27;
                    str2 = str2;
                    i24 = i24;
                    int i43 = i25;
                    strArr2 = strArr2;
                    sArr5 = sArr5;
                    i3 = i43;
                    s2 = 12657;
                    if (C0950.m3785() == 0) {
                        iM2762 = C0619.m2761("ۙ᩸") ^ i12;
                        i8 = ((iM2762 ^ i11) * (-8439)) ^ 1537645506;
                        i9 = -374168831;
                        i10 = iM2762 ^ i9;
                        i27 = i27;
                        i24 = i24;
                        sArr6 = sArr6;
                        i14 = i10;
                        str = str;
                        String str12 = str2;
                        i23 = i23;
                        i13 = i8;
                        str2 = str12;
                        int i316 = i3;
                        sArr5 = sArr5;
                        strArr2 = strArr2;
                        i25 = i316;
                    } else {
                        i27 = i27;
                        int iM31613 = (C0773.m3169("ۨܳ") ^ i11) * (-79);
                        i8 = ((iM31613 ^ i12) * (-14825)) ^ (-81639736);
                        i10 = iM31613 ^ 2133268341;
                        i24 = i24;
                        sArr6 = sArr6;
                        i14 = i10;
                        str = str;
                        String str13 = str2;
                        i23 = i23;
                        i13 = i8;
                        str2 = str13;
                        int i317 = i3;
                        sArr5 = sArr5;
                        strArr2 = strArr2;
                        i25 = i317;
                    }
                    break;
                case -545079753:
                case 1476322578:
                    i28++;
                    iM2761 = C0773.m3169("ܿܶ") ^ i11;
                    i = ((iM2761 ^ i12) * (-18803)) ^ 729703208;
                    i2 = -1162465124;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -518377113:
                case 519253028:
                    if (C11235.m28315(str, r2) < 0) {
                        iM2761 = C0619.m2761("ۧ᩶") ^ i12;
                        i = ((iM2761 ^ i11) * (-24699)) ^ (-621291387);
                        i2 = 1058520923;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                    } else {
                        i4 = i24;
                        sArr = sArr6;
                        i5 = i27;
                        r25 = r2;
                        i6 = i23;
                        int i318 = i25;
                        strArr = strArr2;
                        sArr2 = sArr5;
                        i7 = i318;
                        int iM2766 = (C0619.m2761("۟ۜ") ^ i12) * 87;
                        int i319 = i4;
                        i13 = ((iM2766 ^ i11) * (-30597)) ^ (-253099709);
                        i23 = i6;
                        i27 = i5;
                        r2 = r25;
                        i24 = i319;
                        sArr6 = sArr;
                        i14 = iM2766 ^ 101360144;
                        int i320 = i7;
                        sArr5 = sArr2;
                        strArr2 = strArr;
                        i25 = i320;
                    }
                    break;
                case -432260460:
                case 1476520817:
                    i23 = i23;
                    sArr6 = sArr6;
                    i27 = i27;
                    str2 = str2;
                    i24 = i24;
                    int i44 = i25;
                    strArr2 = strArr2;
                    sArr5 = sArr5;
                    i3 = i44;
                    c = 314;
                    if (C2287.m7745() > 0) {
                        iM2762 = C0773.m3169("ܽ۟") ^ i11;
                        i8 = ((iM2762 ^ i12) * 5647) ^ (-1375076624);
                        i9 = 381453223;
                        i10 = iM2762 ^ i9;
                        i27 = i27;
                        i24 = i24;
                        sArr6 = sArr6;
                        i14 = i10;
                        str = str;
                        String str14 = str2;
                        i23 = i23;
                        i13 = i8;
                        str2 = str14;
                        int i3110 = i3;
                        sArr5 = sArr5;
                        strArr2 = strArr2;
                        i25 = i3110;
                    } else {
                        sArr3 = sArr5;
                        i24 = i24;
                        int iM31614 = C0773.m3169("۟ۛ") ^ i12;
                        int i3111 = ((iM31614 ^ i11) * 19181) ^ (-1235257260);
                        i27 = i27;
                        sArr6 = sArr6;
                        i14 = iM31614 ^ (-1236966078);
                        str2 = str2;
                        i23 = i23;
                        i13 = i3111;
                        strArr2 = strArr2;
                        i25 = i3;
                        sArr5 = sArr3;
                        str = str;
                    }
                    break;
                case -354846569:
                case 1893088764:
                    sArr7 = f38177;
                    i15 = 322;
                    i16 = 1;
                    if (C3033.m9845() > 0) {
                        iM2761 = (C0619.m2761("ܺۜ") ^ i11) * (-27);
                        i = ((iM2761 ^ i12) * 25191) ^ 2089986583;
                        i2 = 2030176829;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                    } else {
                        sArr3 = sArr5;
                        i23 = i23;
                        i3 = i25;
                        sArr6 = sArr6;
                        i27 = i27;
                        str2 = str2;
                        strArr2 = strArr2;
                        int iM31615 = C0773.m3169("۟ۛ") ^ i12;
                        int i3112 = ((iM31615 ^ i11) * 19181) ^ (-1235257260);
                        i27 = i27;
                        sArr6 = sArr6;
                        i14 = iM31615 ^ (-1236966078);
                        str2 = str2;
                        i23 = i23;
                        i13 = i3112;
                        strArr2 = strArr2;
                        i25 = i3;
                        sArr5 = sArr3;
                        str = str;
                    }
                    break;
                case -306093580:
                case 2106338818:
                    AbstractC0641.m2813();
                    if (C0487.f2131 > 0) {
                        iM2761 = C0773.m3169("᩶᩷") ^ i12;
                        i = ((iM2761 ^ i11) * (-31873)) ^ (-1372563474);
                        i2 = 491699686;
                    } else {
                        iM2761 = C0773.m3169("ܰۨ") ^ i12;
                        i = ((iM2761 ^ i11) * (-30703)) ^ (-66048230);
                        i2 = 60132960;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -222299628:
                case 799414770:
                    if (i28 < length) {
                        iM2761 = C0773.m3169("ᩴ֨") ^ i11;
                        i = ((iM2761 ^ i12) * (-23823)) ^ (-822734906);
                        i2 = -1305892957;
                    } else {
                        iM2761 = C0619.m2761("ۙۛ") ^ i12;
                        i = ((iM2761 ^ i11) * 22717) ^ 1848114003;
                        i2 = -407717943;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -190634151:
                case 2133774119:
                    C1519.m5403();
                    RunnableC1848.m6360();
                    iM2761 = C0773.m3169("᩶᩷") ^ i12;
                    i = ((iM2761 ^ i11) * (-31873)) ^ (-1372563474);
                    i2 = 491699686;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 36063746:
                case 1007677134:
                    int i45 = i25;
                    short[] sArr9 = sArr6;
                    i5 = i27;
                    strArr = strArr2;
                    String strM6366 = RunnableC1848.m6366(sArr9, i5, i45, i19);
                    if (C20932.m47857(str, strM6366)) {
                        sArr = sArr9;
                        i4 = i24;
                        r25 = r2;
                        i6 = i23;
                        short[] sArr10 = sArr5;
                        i7 = i45;
                        str2 = strM6366;
                        sArr2 = sArr10;
                        int iM2767 = (C0619.m2761("۟ۜ") ^ i12) * 87;
                        int i3113 = i4;
                        i13 = ((iM2767 ^ i11) * (-30597)) ^ (-253099709);
                        i23 = i6;
                        i27 = i5;
                        r2 = r25;
                        i24 = i3113;
                        sArr6 = sArr;
                        i14 = iM2767 ^ 101360144;
                        int i321 = i7;
                        sArr5 = sArr2;
                        strArr2 = strArr;
                        i25 = i321;
                    } else {
                        int iM2768 = C0619.m2761("֫ܶ") ^ i12;
                        i13 = ((iM2768 ^ i11) * 7615) ^ (-1924031942);
                        i27 = i5;
                        i25 = i45;
                        str2 = strM6366;
                        strArr2 = strArr;
                        i14 = iM2768 ^ 1394098541;
                        sArr6 = sArr9;
                    }
                    break;
                case 87333116:
                case 124397004:
                    if (C3492.m11490(str3, C2702.m8881(sArr8, i17, i18, i19))) {
                        iM2761 = (C0619.m2761("ۢ᩶") + i12) * 67;
                        i = ((iM2761 ^ i11) * (-12041)) ^ 1937407677;
                        i2 = 1877844388;
                    } else {
                        iM2761 = C0773.m3169("᩹᩸") ^ i11;
                        i = ((iM2761 ^ i12) * 7203) ^ 366259343;
                        i2 = -1024629580;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 142597035:
                case 1831069814:
                    C4238.m13540();
                    if (C3998.f13671 == 0) {
                        i23 = i23;
                        sArr6 = sArr6;
                        str2 = str2;
                        i24 = i24;
                        int i46 = i25;
                        strArr2 = strArr2;
                        sArr5 = sArr5;
                        i3 = i46;
                        int iM31616 = (C0773.m3169("ۨܳ") ^ i11) * (-79);
                        i8 = ((iM31616 ^ i12) * (-14825)) ^ (-81639736);
                        i10 = iM31616 ^ 2133268341;
                        i24 = i24;
                        sArr6 = sArr6;
                        i14 = i10;
                        str = str;
                        String str15 = str2;
                        i23 = i23;
                        i13 = i8;
                        str2 = str15;
                        int i3114 = i3;
                        sArr5 = sArr5;
                        strArr2 = strArr2;
                        i25 = i3114;
                    } else {
                        iM2761 = C0773.m3169("᩶᩷") ^ i12;
                        i = ((iM2761 ^ i11) * (-31873)) ^ (-1372563474);
                        i2 = 491699686;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                    }
                    break;
                case 363266250:
                case 852761430:
                    i23 = i23;
                    sArr6 = sArr6;
                    i27 = i27;
                    str2 = str2;
                    i24 = i24;
                    int i47 = i25;
                    strArr2 = strArr2;
                    sArr5 = sArr5;
                    i3 = i47;
                    int i48 = s + s2;
                    if (i22 - (i48 * i48) < 0) {
                        iM2762 = (C0619.m2761("ۗᩴ") ^ i11) * 89;
                        i8 = ((iM2762 ^ i12) * (-26945)) ^ (-1464392573);
                        i9 = -1854052344;
                    } else {
                        iM2762 = C0773.m3169("ܽۢ") ^ i12;
                        i8 = ((iM2762 ^ i11) * (-8743)) ^ (-270434047);
                        i9 = -1123082198;
                    }
                    i10 = iM2762 ^ i9;
                    i27 = i27;
                    i24 = i24;
                    sArr6 = sArr6;
                    i14 = i10;
                    str = str;
                    String str16 = str2;
                    i23 = i23;
                    i13 = i8;
                    str2 = str16;
                    int i3115 = i3;
                    sArr5 = sArr5;
                    strArr2 = strArr2;
                    i25 = i3115;
                    break;
                case 524536159:
                case 1904100828:
                    i6 = i23;
                    i4 = i24;
                    sArr = sArr6;
                    i5 = i27;
                    String str17 = str2;
                    int i49 = i25;
                    strArr = strArr2;
                    sArr2 = sArr5;
                    i7 = i49;
                    r25 = 0;
                    if (C2966.m9659(str, C0487.m2361(sArr2, i6, i4, i19))) {
                        int iM31617 = C0773.m3169("᩺᩹") ^ i11;
                        i24 = i4;
                        i27 = i5;
                        sArr6 = sArr;
                        i13 = ((iM31617 ^ i12) * (-15207)) ^ (-634882589);
                        i14 = iM31617 ^ 853572824;
                        str2 = str17;
                        i23 = i6;
                        r2 = 0;
                    } else {
                        str2 = str17;
                        int iM2769 = (C0619.m2761("۟ۜ") ^ i12) * 87;
                        int i3116 = i4;
                        i13 = ((iM2769 ^ i11) * (-30597)) ^ (-253099709);
                        i23 = i6;
                        i27 = i5;
                        r2 = r25;
                        i24 = i3116;
                        sArr6 = sArr;
                        i14 = iM2769 ^ 101360144;
                    }
                    int i322 = i7;
                    sArr5 = sArr2;
                    strArr2 = strArr;
                    i25 = i322;
                    break;
                case 628147042:
                case 1462966860:
                    C3734.m12152();
                    if (C1783.f6087 > 0) {
                        i23 = i23;
                        sArr6 = sArr6;
                        i27 = i27;
                        str2 = str2;
                        i24 = i24;
                        int i410 = i25;
                        strArr2 = strArr2;
                        sArr5 = sArr5;
                        i3 = i410;
                        iM2762 = (C0619.m2761("᩸۟") ^ i11) * 17;
                        i8 = ((iM2762 ^ i12) * (-16503)) ^ (-616019216);
                        i9 = -1679852100;
                        i10 = iM2762 ^ i9;
                        i27 = i27;
                        i24 = i24;
                        sArr6 = sArr6;
                        i14 = i10;
                        str = str;
                        String str18 = str2;
                        i23 = i23;
                        i13 = i8;
                        str2 = str18;
                        int i3117 = i3;
                        sArr5 = sArr5;
                        strArr2 = strArr2;
                        i25 = i3117;
                    } else {
                        iM2761 = C0773.m3169("ܰۨ") ^ i12;
                        i = ((iM2761 ^ i11) * (-30703)) ^ (-66048230);
                        i2 = 60132960;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                    }
                    break;
                case 658133166:
                case 1116147197:
                    str3 = strArr2[i28];
                    if (C2878.m9480(str3)) {
                        iM2761 = (C0619.m2761("ۢ᩶") + i12) * 67;
                        i = ((iM2761 ^ i11) * (-12041)) ^ 1937407677;
                        i2 = 1877844388;
                    } else {
                        iM2761 = C0619.m2761("۠֫") ^ i12;
                        i = ((iM2761 ^ i11) * 29801) ^ 1587567681;
                        i2 = -1414483489;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 732189124:
                case 1045017690:
                    if (C3492.m11490(str3, C3492.m11486(sArr7, i15, i16, i19))) {
                        iM2761 = (C0619.m2761("ۢ᩶") + i12) * 67;
                        i = ((iM2761 ^ i11) * (-12041)) ^ 1937407677;
                        i2 = 1877844388;
                    } else {
                        iM2761 = C0619.m2761("֫᩸") ^ i11;
                        i = ((iM2761 ^ i12) * 8747) ^ 526430681;
                        i2 = 661349196;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 1139149868:
                case 2008106651:
                    i3 = i25;
                    i19 = 18835;
                    iM2762 = C0619.m2761("֨ᩴ") ^ i11;
                    i8 = ((iM2762 ^ i12) * 10409) ^ 669978512;
                    i9 = 991589898;
                    i10 = iM2762 ^ i9;
                    i27 = i27;
                    i24 = i24;
                    sArr6 = sArr6;
                    i14 = i10;
                    str = str;
                    String str19 = str2;
                    i23 = i23;
                    i13 = i8;
                    str2 = str19;
                    int i3118 = i3;
                    sArr5 = sArr5;
                    strArr2 = strArr2;
                    i25 = i3118;
                    break;
                default:
                    String[] strArrSplit = str.split(str2, -1);
                    length = strArrSplit.length;
                    i28 = 0;
                    strArr2 = strArrSplit;
                    iM2761 = C0773.m3169("ܿܶ") ^ i11;
                    i = ((iM2761 ^ i12) * (-18803)) ^ 729703208;
                    i2 = -1162465124;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
            }
        }
    }
}
