package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81RP */
/* JADX INFO: loaded from: classes3.dex */
public class C4604 extends AbstractC23941 {

    /* JADX INFO: renamed from: ۫ۗܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f16302 = {9626, 5156, -6530, 6305, 7688, 7965, -6436, 4818, 9492, 9566, 9567, 9538, 9561, 9558, 9563, 9545, 9545, 9567, 9545, 9564, 9555, 9558, 9567, 9553, 9567, 9567, 9546, 9595, 9546, 9553, 9577, 9555, 9565, 9592, 9558, 9557, 9561, 9553, 9545, 9567, 9558, 9567, 9561, 9550, 9588, 9563, 9559, 9567, 9545, 9582, 9554, 9567, 9498, 9559, 9563, 9555, 9556, 9498, 9563, 9546, 9553, 9498, 9556, 9557, 9550, 9498, 9564, 9557, 9551, 9556, 9566, 9492, 9595, 9556, 9566, 9544, 9557, 9555, 9566, 9591, 9563, 9556, 9555, 9564, 9567, 9545, 9550, 9492, 9538, 9559, 9558, 9599, 9556, 9550, 9544, 9539, 9498, 9556, 9557, 9550, 9498, 9564, 9557, 9551, 9556, 9566, 9472, 9498, 9595, 9556, 9566, 9544, 9557, 9555, 9566, 9591, 9563, 9556, 9555, 9564, 9567, 9545, 9550, 9492, 9538, 9559, 9558, 9492, 9550, 9559, 9546, 9560, 9563, 9545, 9567, 9544, 9567, 9545, 9557, 9551, 9544, 9561, 9567, 9545, 9492, 9563, 9544, 9545, 9561, 9599, 9556, 9550, 9544, 9539, 9498, 9556, 9557, 9550, 9498, 9564, 9557, 9551, 9556, 9566, 9472, 9498, 9544, 9567, 9545, 9557, 9551, 9544, 9561, 9567, 9545, 9492, 9563, 9544, 9545, 9561, 9494, 9559, 9563, 9556, 9555, 9564, 9567, 9545, 9550, 9561, 9558, 9563, 9545, 9545, 9567, 9545, 9569, 9482, 9495, 9475, 9575, 9488, 9574, 9492, 9566, 9567, 9538, 9545, 9546, 9558, 9555, 9550, 9555, 9545, 9596, 9567, 9563, 9550, 9551, 9544, 9567, 9577, 9546, 9558, 9555, 9550, 9573, 9563, 9546, 9553, 9545, 9492, 9563, 9546, 9553, 9559, 9567, 9550, 9563, 9495, 9566, 9563, 9550, 9563, 9551, 9545, 9567, 9545, 9495, 9561, 9557, 9556, 9564, 9555, 9565, 9551, 9544, 9563, 9550, 9555, 9557, 9556, 9546, 9567, 9544, 9559, 9555, 9545, 9545, 9555, 9557, 9556, 9551, 9545, 9567, 9545, 9495, 9546, 9567, 9544, 9559, 9555, 9545, 9545, 9555, 9557, 9556, 9547, 9551, 9567, 9544, 9555, 9567, 9545, 9551, 9545, 9567, 9545, 9495, 9546, 9567, 9544, 9559, 9555, 9545, 9545, 9555, 9557, 9556, 9495, 9545, 9566, 9553, 9495, 9480, 9481, 9563, 9546, 9546, 9558, 9555, 9561, 9563, 9550, 9555, 9557, 9556, 9551, 9545, 9567, 9545, 9495, 9564, 9567, 9563, 9550, 9551, 9544, 9567, 9559, 9557, 9566, 9551, 9558, 9567, 6267, -2979, -2990, -2985, -2978, 29398, -21087, -31509, 26655, 25483, 27027};

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f16303;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f16304;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f16305;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f16306;

    /* JADX WARN: Code duplicated, block: B:49:0x019a A[PHI: r9 r21
      0x019a: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:48:0x0198, B:33:0x0101, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r21v3 int) = (r21v1 int), (r21v2 int), (r21v1 int) binds: [B:48:0x0198, B:33:0x0101, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d0 A[PHI: r7 r8 r11 r12 r13
      0x01d0: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:52:0x01ce, B:37:0x0123, B:29:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:52:0x01ce, B:37:0x0123, B:29:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:52:0x01ce, B:37:0x0123, B:29:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:52:0x01ce, B:37:0x0123, B:29:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:52:0x01ce, B:37:0x0123, B:29:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0222 A[PHI: r2 r22
      0x0222: PHI (r2v5 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v3 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
     binds: [B:60:0x0220, B:21:0x0093, B:14:0x0079, B:7:0x0050, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r22v6 char) = (r22v4 char), (r22v3 char), (r22v3 char), (r22v3 char), (r22v3 char) binds: [B:60:0x0220, B:21:0x0093, B:14:0x0079, B:7:0x0050, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0256 A[PHI: r3 r5 r6 r14 r15 r16
      0x0256: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:64:0x0254, B:56:0x0202, B:25:0x00b5, B:14:0x0079, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:64:0x0254, B:56:0x0202, B:25:0x00b5, B:14:0x0079, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short), (r6v1 short) binds: [B:64:0x0254, B:56:0x0202, B:25:0x00b5, B:14:0x0079, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r14v3 short[]) = (r14v1 short[]), (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:64:0x0254, B:56:0x0202, B:25:0x00b5, B:14:0x0079, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r15v3 int) = (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:64:0x0254, B:56:0x0202, B:25:0x00b5, B:14:0x0079, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0254, B:56:0x0202, B:25:0x00b5, B:14:0x0079, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        int iM11306;
        int i;
        int i2;
        String strM10901 = null;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = -1273081795;
        int i11 = C3535.f13026;
        int i12 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11307 = (ThreadFactoryC3888.m11306("ۨܺ") + i11) * (-47);
        int i13 = ((iM11307 ^ i12) * (-29173)) ^ (-318974238);
        int i14 = iM11307 ^ (-1346731065);
        short[] sArr3 = null;
        int i15 = 0;
        int iM11308 = 0;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-31951)) >> 31));
            switch (i10) {
                case -2043923500:
                case -1498852936:
                    sArr = f16302;
                    i7 = 1;
                    i8 = 3;
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۘ") ^ i11;
                        i = ((iM11306 ^ i12) * (-10431)) ^ 1444586159;
                        i2 = 1713377571;
                    } else {
                        iM11306 = C19806.m45029("ۢ᩵") ^ i11;
                        i = ((iM11306 ^ i12) * (-23775)) ^ (-2109066036);
                        i2 = -1668616942;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -2034604094:
                case 892613955:
                    sArr2 = f16302;
                    i9 = 4;
                    i15 = 3;
                    if (C2642.m8171() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۚ") ^ i11;
                        i = ((iM11306 ^ i12) * 19511) ^ (-1191848214);
                        i2 = 966613093;
                    } else {
                        iM11306 = C19806.m45029("ۢ۟") ^ i11;
                        i = ((iM11306 ^ i12) * (-16291)) ^ (-357494248);
                        i2 = 1944667206;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -2007214620:
                case -386443658:
                    m41562(C19806.m45029(strM10901) ^ 2129014903);
                    break;
                case -1463211967:
                case -29265734:
                    C0962.m3746();
                    break;
                case -1342172769:
                case -71421198:
                    C2477.m7593();
                    if (C1189.m4368() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۚ") ^ i11;
                        i = ((iM11306 ^ i12) * 19511) ^ (-1191848214);
                        i2 = 966613093;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") ^ i12) * 87;
                        i = ((iM11306 ^ i11) * (-29491)) ^ (-1996839263);
                        i2 = -2087424331;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1218409350:
                case 237571928:
                    i3 = s * s2;
                    i4 = s * s;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۘ") ^ i11;
                        i = ((iM11306 ^ i12) * (-10431)) ^ 1444586159;
                        i2 = 1713377571;
                    } else {
                        iM11306 = C19806.m45029("ۧܺ") ^ i11;
                        i = ((iM11306 ^ i12) * 19207) ^ 73381222;
                        i2 = -406515331;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1205473199:
                case -237147378:
                    i5 = 3896676;
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") ^ i12) * 87;
                        i = ((iM11306 ^ i11) * (-29491)) ^ (-1996839263);
                        i2 = -2087424331;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܳ") ^ i11;
                        i = ((iM11306 ^ i12) * (-25097)) ^ 992168702;
                        i2 = 916587770;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -1016447266:
                case -750686931:
                    iM11308 = ThreadFactoryC3888.m11306(RunnableC1895.m6164(sArr, i7, i8, i6));
                    if (C0671.m3008() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") ^ i12) * 87;
                        i = ((iM11306 ^ i11) * (-29491)) ^ (-1996839263);
                        i2 = -2087424331;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۖ") ^ i12) * 77;
                        i = ((iM11306 ^ i11) * (-8409)) ^ (-1582649568);
                        i2 = 2106360167;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -904472698:
                case 1400838498:
                    sArr3 = f16302;
                    if (C0962.m3746() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۚ") ^ i11;
                        i = ((iM11306 ^ i12) * 19511) ^ (-1191848214);
                        i2 = 966613093;
                    } else {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("᩶᩷")) * (-115);
                        i = ((iM11306 ^ i11) * (-7949)) ^ (-774290695);
                        i2 = 1966685703;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case -899598961:
                case 1765991261:
                    if ((i4 + i5) - i3 >= 0) {
                        iM11306 = (C19806.m45029("ۖۡ") + i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM11306 ^ i11) * (-27341)) ^ 1643958831;
                        i2 = 914799421;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i12;
                        i = ((iM11306 ^ i11) * 19629) ^ (-1964885684);
                        i2 = 1839304605;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 398465922:
                case 425690225:
                    s = sArr3[c];
                    s2 = 3948;
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۚ") ^ i11;
                        i = ((iM11306 ^ i12) * 19511) ^ (-1191848214);
                        i2 = 966613093;
                    } else {
                        iM11306 = (i12 - ThreadFactoryC3888.m11306("ۢ᩸")) * 83;
                        i = ((iM11306 ^ i11) * (-1607)) ^ (-938578758);
                        i2 = 1992714301;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 517391614:
                case 2005379213:
                    C0050.m934(this, iM11308 ^ 2097807992);
                    if (RunnableC1895.f7152) {
                        iM11306 = (C19806.m45029("۠᩶") + i12) * (-101);
                        i = ((iM11306 ^ i11) * (-24311)) ^ (-1296722003);
                        i2 = 596011920;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۘ") ^ i11;
                        i = ((iM11306 ^ i12) * (-10431)) ^ 1444586159;
                        i2 = 1713377571;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 564427331:
                case 1699929712:
                    if (CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۚ") ^ i11;
                        i = ((iM11306 ^ i12) * 19511) ^ (-1191848214);
                        i2 = 966613093;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ۬") ^ i12;
                        i = ((iM11306 ^ i11) * 14023) ^ (-28759452);
                        i2 = -1224252980;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 618952906:
                case 677772846:
                    i6 = 58485;
                    iM11306 = ThreadFactoryC3888.m11306("֨᩺") ^ i11;
                    i = ((iM11306 ^ i12) * (-11843)) ^ 349911306;
                    i2 = -112614283;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 738829412:
                case 1749741361:
                    strM10901 = C3722.m10901(sArr2, i9, i15, i6);
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ۬") ^ i12;
                        i = ((iM11306 ^ i11) * 14023) ^ (-28759452);
                        i2 = -1224252980;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۧ") ^ i11;
                        i = ((iM11306 ^ i12) * 10271) ^ (-772888393);
                        i2 = -1223192610;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 968945930:
                case 1292140959:
                    C1398.m4895();
                    if (C2332.m7079() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ۬") ^ i12;
                        i = ((iM11306 ^ i11) * 14023) ^ (-28759452);
                        i2 = -1224252980;
                    } else {
                        iM11306 = (C19806.m45029("᩻᩸") + i12) * (-81);
                        i = ((iM11306 ^ i11) * 21239) ^ 1906506516;
                        i2 = 2139933071;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 1297221359:
                case 1755052055:
                    i6 = 40678;
                    iM11306 = ThreadFactoryC3888.m11306("֨᩺") ^ i11;
                    i = ((iM11306 ^ i12) * (-11843)) ^ 349911306;
                    i2 = -112614283;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                case 1670855085:
                case 2139256731:
                    c = 0;
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ۬") ^ i12;
                        i = ((iM11306 ^ i11) * 14023) ^ (-28759452);
                        i2 = -1224252980;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘᩴ") ^ i11) * (-47);
                        i = ((iM11306 ^ i12) * 29581) ^ (-1762375917);
                        i2 = 2095504770;
                    }
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
                default:
                    C2704.m8255();
                    iM11306 = ThreadFactoryC3888.m11306("ۧ۬") ^ i12;
                    i = ((iM11306 ^ i11) * 14023) ^ (-28759452);
                    i2 = -1224252980;
                    i14 = iM11306 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    public C4604() {
        AbstractC20745 abstractC20745M8478 = null;
        int i = -911098777;
        int i2 = C1460.f5948;
        int i3 = C1419.f5860;
        int iM45029 = (i3 - C19806.m45029("ۗ֨")) * (-15);
        int i4 = ((iM45029 ^ i2) * (-21771)) ^ 1217576975;
        int i5 = -711708503;
        while (true) {
            i = ((((i ^ i2) * (-6247)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2071874131:
                case -1918877191:
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28827)) ^ 1861460380;
                        i5 = -1235441208;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17345)) ^ 709420565;
                        i5 = -1447898192;
                    }
                    break;
                case -1627183683:
                case -477948627:
                    C1419.m4973();
                    iM45029 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-4349)) ^ (-945833776);
                    i5 = 1911844633;
                    break;
                case -1551684773:
                case 1670167097:
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("ܿ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25393) ^ (-1657774723);
                        i5 = 687944091;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30507) ^ (-946613097);
                        i5 = 1361215698;
                    }
                    break;
                case -1537778522:
                case -406688403:
                    C3535.m10431();
                    C0526.m2437();
                    throw new RuntimeException();
                case -1444583946:
                case 34897227:
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4349)) ^ (-945833776);
                        i5 = 1911844633;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܺ") ^ i2) * 119;
                        i4 = ((iM45029 ^ i3) * 11671) ^ (-582434621);
                        i5 = 869500043;
                    }
                    break;
                case -1424999711:
                case 1302629603:
                    if (C1937.m6279() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28827)) ^ 1861460380;
                        i5 = -1235441208;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵۟")) * (-37);
                        i4 = ((iM45029 ^ i2) * (-16425)) ^ (-847512809);
                        i5 = -1984738266;
                    }
                    break;
                case -1395431838:
                case -1334528625:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ܿ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25393) ^ (-1657774723);
                        i5 = 687944091;
                    } else {
                        iM45029 = C19806.m45029("ۢۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29787)) ^ 739197502;
                        i5 = -45785363;
                    }
                    break;
                case -1372060784:
                case -1024037052:
                    abstractC20745M8478 = C2788.m8478(C11904.f39941);
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۠") ^ i3) * 97;
                        i4 = ((iM45029 ^ i2) * 4039) ^ (-748703319);
                        i5 = -769675753;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ۟") + i3) * (-95);
                        i4 = ((iM45029 ^ i2) * 16745) ^ (-231944130);
                        i5 = -719192743;
                    }
                    break;
                case -1282034855:
                case 686132128:
                    this.f16304 = abstractC20745M8478;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬۠") ^ i3) * 97;
                        i4 = ((iM45029 ^ i2) * 4039) ^ (-748703319);
                        i5 = -769675753;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21835)) ^ 2010765738;
                        i5 = 1401618405;
                    }
                    break;
                case -1214472914:
                case 495577761:
                    this.f16305 = new ArrayList();
                    return;
                case -854110411:
                case 1147468252:
                    C0671.m3008();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30073)) ^ 1366110370;
                        i5 = 127225065;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4349)) ^ (-945833776);
                        i5 = 1911844633;
                    }
                    break;
                case -130328160:
                case 1064024106:
                    if (C2642.m8171() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4349)) ^ (-945833776);
                        i5 = 1911844633;
                    } else {
                        iM45029 = C19806.m45029("᩸ᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16309) ^ 541297298;
                        i5 = -2019987085;
                    }
                    break;
                case 543242054:
                case 1677465041:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C0629.f2722 > 0) {
                        iM45029 = C19806.m45029("ܿ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25393) ^ (-1657774723);
                        i5 = 687944091;
                    } else {
                        iM45029 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30073)) ^ 1366110370;
                        i5 = 127225065;
                    }
                    break;
                case 602928985:
                case 2111310392:
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28827)) ^ 1861460380;
                        i5 = -1235441208;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4349)) ^ (-945833776);
                        i5 = 1911844633;
                    }
                    break;
                case 1611045457:
                case 1818681375:
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30073)) ^ 1366110370;
                        i5 = 127225065;
                    } else {
                        iM45029 = C19806.m45029("ܳۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 4161) ^ (-1028825920);
                        i5 = 472726032;
                    }
                    break;
                default:
                    if (CallableC1627.f6528) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ܰ") + i3) * 45;
                        i4 = ((iM45029 ^ i2) * (-18781)) ^ 2131549102;
                        i5 = 1036489176;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28827)) ^ 1861460380;
                        i5 = -1235441208;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5722;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        int i = -161851478;
        int i2 = C0050.f912;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM45029 = C19806.m45029("ᩴۜ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-6111)) ^ 301842539;
        int i5 = -2086955075;
        while (true) {
            i = ((((i ^ i3) * (-20759)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2132587636:
                case -1072737451:
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("᩻֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15335) ^ (-580852231);
                        i5 = -712267950;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۙ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * 14301) ^ (-690749135);
                        i5 = -284388907;
                    }
                    break;
                case -2082448778:
                case 1253025996:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۙ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * 14301) ^ (-690749135);
                        i5 = -284388907;
                    } else {
                        iM45029 = (C19806.m45029("᩹᩹") + i3) * (-29);
                        i4 = ((iM45029 ^ i2) * 16583) ^ (-529323747);
                        i5 = 254901758;
                    }
                    break;
                case -1910070723:
                case 1068049773:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (C19806.m45029("۫֨") + i2) * (-73);
                        i4 = ((iM45029 ^ i3) * 27435) ^ (-297231847);
                        i5 = -1439913999;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2693)) ^ 590731972;
                        i5 = 283513929;
                    }
                    break;
                case -1872183306:
                case 1556900838:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۟ۤ")) * 73;
                        i4 = ((iM45029 ^ i3) * (-20529)) ^ 1065235601;
                        i5 = 2059957106;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ܶ") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * 22641) ^ 573847158;
                        i5 = -957387368;
                    }
                    break;
                case -1832115075:
                case 582253811:
                    if (!C3286.f12186) {
                        iM45029 = (C19806.m45029("۫֨") + i2) * (-73);
                        i4 = ((iM45029 ^ i3) * 27435) ^ (-297231847);
                        i5 = -1439913999;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۙ") + i2) * (-57);
                        i4 = ((iM45029 ^ i3) * 3331) ^ 670644922;
                        i5 = 1987002746;
                    }
                    break;
                case -1632570043:
                case -810404682:
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("۠ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11687)) ^ (-741669274);
                        i5 = -949963784;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۙ") + i2) * (-57);
                        i4 = ((iM45029 ^ i3) * 3331) ^ 670644922;
                        i5 = 1987002746;
                    }
                    break;
                case -1604306857:
                case 69349150:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ܶ") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * 22641) ^ 573847158;
                        i5 = -957387368;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۙ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * 14301) ^ (-690749135);
                        i5 = -284388907;
                    }
                    break;
                case -1400447464:
                case 879552346:
                    C1066.m4028(c11545, C2642.m8160(this.f16303));
                    c11545.m28830();
                    iM45029 = ThreadFactoryC3888.m11306("ۙܿ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 4517) ^ 639078891;
                    i5 = 726846573;
                    break;
                case -1345003616:
                case -1023764554:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ܶ") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * 22641) ^ 573847158;
                        i5 = -957387368;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۘ") + i2) * 41;
                        i4 = ((iM45029 ^ i3) * (-8097)) ^ (-1001429048);
                        i5 = -218462135;
                    }
                    break;
                case -1261721063:
                case 2084509108:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    break;
                case -1112817081:
                case 1499243692:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (C19806.m45029("۫֨") + i2) * (-73);
                        i4 = ((iM45029 ^ i3) * 27435) ^ (-297231847);
                        i5 = -1439913999;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܽۙ")) * (-63);
                        i4 = ((iM45029 ^ i2) * (-1345)) ^ (-1373223200);
                        i5 = -1100180097;
                    }
                    break;
                case -1035105040:
                case 232081373:
                    C1398.m4895();
                    if (C0278.f1572 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۙ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * 14301) ^ (-690749135);
                        i5 = -284388907;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۙ") + i2) * (-57);
                        i4 = ((iM45029 ^ i3) * 3331) ^ 670644922;
                        i5 = 1987002746;
                    }
                    break;
                case -868489979:
                case -451454139:
                    if (C1461.m5079(c5202)) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29927) ^ 733307421;
                        i5 = 421662237;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 4517) ^ 639078891;
                        i5 = 726846573;
                    }
                    break;
                case -852533732:
                case 1592112414:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17213) ^ (-784576568);
                        i5 = -330720431;
                    } else {
                        iM45029 = C19806.m45029("᩷۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14179) ^ 1741898430;
                        i5 = -426694277;
                    }
                    break;
                case -306709007:
                case 510493017:
                    C1377.m4833();
                    ThreadFactoryC3888.m11300();
                    iM45029 = (ThreadFactoryC3888.m11306("ܺۙ") + i2) * (-57);
                    i4 = ((iM45029 ^ i3) * 3331) ^ 670644922;
                    i5 = 1987002746;
                    break;
                case -169410451:
                case 1735953928:
                    break;
                case 804329092:
                case 1235273192:
                    if (C2871.m8646()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۡ") ^ i2) * 95;
                        i4 = ((iM45029 ^ i3) * 30031) ^ (-1630074444);
                        i5 = -1497815782;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17213) ^ (-784576568);
                        i5 = -330720431;
                    }
                    break;
                case 1348738784:
                case 1757425391:
                    if (m41579(c11545)) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵᩸") + i3) * (-41);
                        i4 = ((iM45029 ^ i2) * 29837) ^ 883788455;
                        i5 = -274225854;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 4517) ^ 639078891;
                        i5 = 726846573;
                    }
                    break;
                default:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17213) ^ (-784576568);
                        i5 = -330720431;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ᩷") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * 11845) ^ 847621407;
                        i5 = 1253954750;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x04c2 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.C5202 mo3077() {
        /*
            Method dump skipped, instruction units count: 1942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4604.mo3077():l.ۚ۟ۜ");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        Iterator itM9863 = null;
        AbstractC20745 abstractC20745 = null;
        AbstractC20745 abstractC20746 = null;
        int i = -1605675475;
        int i2 = C0629.f2722;
        int i3 = C1419.f5860;
        int iM45029 = (i2 - C19806.m45029("᩻ۖ")) * 55;
        int i4 = ((iM45029 ^ i3) * 55) ^ (-14267805);
        int i5 = -805401016;
        while (true) {
            i = ((((i ^ i3) * 31805) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2125818632:
                case -1848535350:
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16027) ^ (-609588916);
                        i5 = -1099912980;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22949)) ^ 897512203;
                        i5 = -677711345;
                    }
                    break;
                case -1980392701:
                case -223423611:
                    C0526.m2436(abstractC20746);
                    iM45029 = C19806.m45029("᩵᩻") ^ i3;
                    i4 = ((iM45029 ^ i2) * 25811) ^ 242135972;
                    i5 = 184408787;
                    break;
                case -1946070086:
                case -1278516397:
                    abstractC20745 = this.f16303;
                    if (abstractC20745 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23027)) ^ (-1692465110);
                        i5 = -691758043;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܶ᩵")) * (-53);
                        i4 = ((iM45029 ^ i3) * (-30893)) ^ (-2076252896);
                        i5 = 837380001;
                    }
                    break;
                case -1390435567:
                case -146344992:
                    C2871.m8646();
                    if (!C19806.f63586) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۤ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * (-14793)) ^ (-984879008);
                        i5 = 933678337;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29641)) ^ 665869812;
                        i5 = -193721381;
                    }
                    break;
                case -1344132153:
                case -475362649:
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16027) ^ (-609588916);
                        i5 = -1099912980;
                    } else {
                        iM45029 = C19806.m45029("ᩳᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25901) ^ 492607834;
                        i5 = -557899730;
                    }
                    break;
                case -1142994526:
                case 1722091778:
                    if (C1189.m4368() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16027) ^ (-609588916);
                        i5 = -1099912980;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30849) ^ (-914851013);
                        i5 = -24105427;
                    }
                    break;
                case -1114051580:
                case 998976717:
                    if (C3535.m10431() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29641)) ^ 665869812;
                        i5 = -193721381;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 885) ^ (-1624139839);
                        i5 = 1976165061;
                    }
                    break;
                case -1113536754:
                case 723367331:
                    C1377.m4829((C2455) C0216.m1584(itM9863));
                    iM45029 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 6673) ^ 2144913819;
                    i5 = -483596702;
                    break;
                case -1053177705:
                case 2141061312:
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12145) ^ (-633691401);
                        i5 = -1017044113;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16027) ^ (-609588916);
                        i5 = -1099912980;
                    }
                    break;
                case -874189162:
                case 1011234881:
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(this.f16305);
                    iM45029 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 6673) ^ 2144913819;
                    i5 = -483596702;
                    break;
                case -841761141:
                case 2037287650:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (C19806.m45029("ۗܺ") + i3) * (-71);
                        i4 = ((iM45029 ^ i2) * 21693) ^ (-1144751896);
                        i5 = -1118052979;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۤۜ")) * (-19);
                        i4 = ((iM45029 ^ i2) * 21987) ^ (-1818789208);
                        i5 = -1536869342;
                    }
                    break;
                case -808764526:
                case -804374138:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۤ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * (-14793)) ^ (-984879008);
                        i5 = 933678337;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-8675)) ^ (-239381141);
                        i5 = 667610997;
                    }
                    break;
                case -795646619:
                case 2074923301:
                    C3535.m10431();
                    iM45029 = (C19806.m45029("۟᩵") + i2) * 51;
                    i4 = ((iM45029 ^ i3) * (-9361)) ^ 515572351;
                    i5 = -2037864489;
                    break;
                case -705205038:
                case 724770247:
                    if (MenuItemOnMenuItemClickListenerC3244.m9712(c5202)) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܶ᩵")) * (-53);
                        i4 = ((iM45029 ^ i3) * (-30893)) ^ (-2076252896);
                        i5 = 837380001;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩵") + i3) * (-15);
                        i4 = ((iM45029 ^ i2) * (-14157)) ^ (-1640043103);
                        i5 = -141458714;
                    }
                    break;
                case -592547023:
                case 212382656:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16027) ^ (-609588916);
                        i5 = -1099912980;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11823)) ^ (-230081677);
                        i5 = 345578935;
                    }
                    break;
                case -547447537:
                case 345359971:
                    C0526.m2436(this.f16304);
                    C2788.m8475();
                    break;
                case -440196784:
                case 37360803:
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29641)) ^ 665869812;
                        i5 = -193721381;
                    } else {
                        iM45029 = (C19806.m45029("֫֫") ^ i2) * 87;
                        i4 = ((iM45029 ^ i3) * 15361) ^ (-1839518921);
                        i5 = -1770833540;
                    }
                    break;
                case -417647233:
                case 295632953:
                    C0962.m3746();
                    if (C0216.f1393 == 0) {
                        iM45029 = (C19806.m45029("ۗܺ") + i3) * (-71);
                        i4 = ((iM45029 ^ i2) * 21693) ^ (-1144751896);
                        i5 = -1118052979;
                    } else {
                        iM45029 = (C19806.m45029("۟᩵") + i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-9361)) ^ 515572351;
                        i5 = -2037864489;
                    }
                    break;
                case -227913576:
                case -76734378:
                    if (C3535.m10431() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16027) ^ (-609588916);
                        i5 = -1099912980;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩵ۙ")) * (-85);
                        i4 = ((iM45029 ^ i3) * 13693) ^ 561116315;
                        i5 = 829074244;
                    }
                    break;
                case -58970646:
                case 1509878873:
                    C1066.m4023();
                    break;
                case 272376564:
                case 1934129963:
                    abstractC20746 = this.f16306;
                    if (abstractC20746 != null) {
                        iM45029 = (C19806.m45029("᩷ܳ") ^ i2) * 81;
                        i4 = ((iM45029 ^ i3) * 8361) ^ (-1227503244);
                        i5 = -1400640037;
                    } else {
                        iM45029 = C19806.m45029("᩵᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25811) ^ 242135972;
                        i5 = 184408787;
                    }
                    break;
                case 459331645:
                case 2101039640:
                    C3577.m10565();
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۤ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * (-14793)) ^ (-984879008);
                        i5 = 933678337;
                    } else {
                        iM45029 = (C19806.m45029("۟᩵") + i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-9361)) ^ 515572351;
                        i5 = -2037864489;
                    }
                    break;
                case 915395771:
                case 1271326925:
                    if (C0962.m3748(itM9863)) {
                        iM45029 = (i3 - C19806.m45029("ᩴ۫")) * (-113);
                        i4 = ((iM45029 ^ i2) * (-25995)) ^ 175591120;
                        i5 = -1630179954;
                    } else {
                        iM45029 = (C19806.m45029("ۡܳ") + i2) * (-41);
                        i4 = ((iM45029 ^ i3) * (-9533)) ^ (-1048960833);
                        i5 = -221749074;
                    }
                    break;
                default:
                    RunnableC3388.m10052(abstractC20745);
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("ܶ᩵")) * (-53);
                    i4 = ((iM45029 ^ i3) * (-30893)) ^ (-2076252896);
                    i5 = 837380001;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c7 A[PHI: r3 r7
      0x00c7: PHI (r3v3 java.lang.String[]) = (r3v2 java.lang.String[]), (r3v4 java.lang.String[]) binds: [B:15:0x0082, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r7v3 short[]) = (r7v2 short[]), (r7v4 short[]) binds: [B:15:0x0082, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0174 A[PHI: r1 r8 r10
      0x0174: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:41:0x0172, B:23:0x00ab, B:12:0x0079, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:41:0x0172, B:23:0x00ab, B:12:0x0079, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:41:0x0172, B:23:0x00ab, B:12:0x0079, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0227 A[PHI: r18 r23
      0x0227: PHI (r18v4 int) = (r18v3 int), (r18v2 int) binds: [B:56:0x0225, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r23v5 int) = (r23v4 int), (r23v3 int) binds: [B:56:0x0225, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x025a A[PHI: r4 r5 r6 r9 r12 r13
      0x025a: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:60:0x0258, B:52:0x0205, B:33:0x0123, B:29:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:60:0x0258, B:52:0x0205, B:33:0x0123, B:29:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:60:0x0258, B:52:0x0205, B:33:0x0123, B:29:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:60:0x0258, B:52:0x0205, B:33:0x0123, B:29:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:60:0x0258, B:52:0x0205, B:33:0x0123, B:29:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r13v4 short) = (r13v2 short), (r13v3 short), (r13v2 short), (r13v2 short) binds: [B:60:0x0258, B:52:0x0205, B:33:0x0123, B:29:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x028e A[PHI: r2 r15 r16 r17
      0x028e: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v6 java.lang.String)
     binds: [B:64:0x028c, B:17:0x0086, B:15:0x0082, B:12:0x0079, B:87:0x028e] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v6 short[]) binds: [B:64:0x028c, B:17:0x0086, B:15:0x0082, B:12:0x0079, B:87:0x028e] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x028c, B:17:0x0086, B:15:0x0082, B:12:0x0079, B:87:0x028e] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r17v5 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:64:0x028c, B:17:0x0086, B:15:0x0082, B:12:0x0079, B:87:0x028e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        int iM45029;
        int i;
        int i2;
        int i3 = C1460.f5948;
        int i4 = C1398.f5802;
        int iM450210 = (C19806.m45029("ۘ֨") + i3) * (-97);
        int i5 = ((iM450210 ^ i4) * (-3169)) ^ 2079462492;
        String strM9788 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ (-1749227767);
        int iM450211 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = -338581530;
        int i13 = 0;
        String[] strArr = null;
        short[] sArr3 = null;
        int i14 = 0;
        String strM41569 = null;
        String strM3859 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 8265) >> 31));
            switch (i12) {
                case -1888248828:
                case -1850409212:
                    int i15 = i11 + i13;
                    i10 = i15 + i15;
                    s2 = 14161;
                    if (C2788.f10625 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩻") + i3) * (-101);
                        i = ((iM45029 ^ i4) * (-6331)) ^ 2095773409;
                        i2 = -1235518076;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܳ") ^ i4;
                        i = ((iM45029 ^ i3) * 1061) ^ 1615317854;
                        i2 = -332170341;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1822070895:
                case -1629162915:
                    return C0216.m1574(C19806.m45029(RunnableC0195.m1429(sArr2, i8, i9, i14)) ^ 2102334769, strArr);
                case -1809856128:
                case -1008495380:
                    i8 = 353;
                    i9 = 3;
                    if (RunnableC3388.m10064()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۗ᩷")) * (-5);
                        i = ((iM45029 ^ i4) * 3115) ^ 153072969;
                        i2 = 418475107;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۬") + i4) * (-31);
                        i = ((iM45029 ^ i3) * 32161) ^ (-273812713);
                        i2 = 1350006466;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1736618739:
                case -1329307389:
                    C0797.m3359();
                    if (C2332.f8260) {
                        iM45029 = (C19806.m45029("ۜܿ") ^ i3) * (-111);
                        i = ((iM45029 ^ i4) * 20577) ^ (-323130249);
                        i2 = 1439258563;
                    } else {
                        iM45029 = C19806.m45029("᩷ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * 11493) ^ 978593663;
                        i2 = -438053006;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1609940261:
                case 653677014:
                    i11 = s * s;
                    i13 = 200533921;
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ۢ᩵")) * (-63);
                        i = ((iM45029 ^ i3) * 31447) ^ (-2101432907);
                        i2 = 1002605130;
                    } else {
                        iM45029 = C19806.m45029("۫ۙ") ^ i3;
                        i = ((iM45029 ^ i4) * 5069) ^ 403885825;
                        i2 = 1801831676;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1578618212:
                case -403080357:
                    i14 = 48172;
                    iM45029 = C19806.m45029("ۧۘ") ^ i4;
                    i = ((iM45029 ^ i3) * (-13315)) ^ 514239980;
                    i2 = 506612703;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1574405898:
                case 77080883:
                    sArr = f16302;
                    c = 345;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("᩷ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * 11493) ^ 978593663;
                        i2 = -438053006;
                    } else {
                        iM45029 = C19806.m45029("ᩳ֨") ^ i3;
                        i = ((iM45029 ^ i4) * 26723) ^ 507774943;
                        i2 = 385032049;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1449843625:
                case -219765934:
                    s = sArr[c];
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩻") + i3) * (-101);
                        i = ((iM45029 ^ i4) * (-6331)) ^ 2095773409;
                        i2 = -1235518076;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩸") ^ i4;
                        i = ((iM45029 ^ i3) * 26551) ^ (-861269081);
                        i2 = -1960867893;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1260273042:
                case -539439684:
                    C1875.m6086();
                    if (C0671.m3008() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۬") + i4) * (-31);
                        i = ((iM45029 ^ i3) * 32161) ^ (-273812713);
                        i2 = 1350006466;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۢ᩵")) * (-63);
                        i = ((iM45029 ^ i3) * 31447) ^ (-2101432907);
                        i2 = 1002605130;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1222051621:
                case -822748884:
                    C1460.m5050();
                    C2788.m8472();
                    return null;
                case -1203428706:
                case 927162170:
                    iM450211 = C19806.m45029(strM9788);
                    i7 = 2098711210;
                    if (C1460.f5948 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩻") + i3) * (-101);
                        i = ((iM45029 ^ i4) * (-6331)) ^ 2095773409;
                        i2 = -1235518076;
                    } else {
                        iM45029 = C19806.m45029("ᩳ᩷") ^ i4;
                        i = ((iM45029 ^ i3) * 25969) ^ 155751265;
                        i2 = -1374822819;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -953772772:
                case 1581915223:
                    int i16 = s + s2;
                    if (i10 - (i16 * i16) < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۙ") ^ i4;
                        i = ((iM45029 ^ i3) * (-27409)) ^ (-1646934369);
                        i2 = -856905531;
                    } else {
                        iM45029 = (C19806.m45029("ۧܽ") + i3) * q.h;
                        i = ((iM45029 ^ i4) * 20081) ^ 1077703857;
                        i2 = 946034791;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -882410195:
                case 891790067:
                    strM3859 = C1025.m3859(f16302, 346, 4, i14);
                    if (C1189.f5284 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۬") + i4) * (-31);
                        i = ((iM45029 ^ i3) * 32161) ^ (-273812713);
                        i2 = 1350006466;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰۨ")) * 85;
                        i = ((iM45029 ^ i4) * (-18761)) ^ 818936030;
                        i2 = 1405764847;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -743802149:
                case 1728583003:
                    i14 = 62523;
                    iM45029 = C19806.m45029("ۧۘ") ^ i4;
                    i = ((iM45029 ^ i3) * (-13315)) ^ 514239980;
                    i2 = 506612703;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -480944311:
                case 1334071014:
                    C2332.m7079();
                    iM45029 = C19806.m45029("᩷ܺ") ^ i4;
                    i = ((iM45029 ^ i3) * 11493) ^ 978593663;
                    i2 = -438053006;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -387687495:
                case 668840282:
                    strM41569 = m41569(strM3859);
                    sArr3 = f16302;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("᩷ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * 11493) ^ 978593663;
                        i2 = -438053006;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450212 = (i4 - C19806.m45029("ܽ᩹")) * 27;
                        i5 = ((iM450212 ^ i3) * 8489) ^ (-495823587);
                        i6 = iM450212 ^ (-589663669);
                    }
                    break;
                case 787428856:
                case 1475890736:
                    strM9788 = C3286.m9788(sArr3, 350, 3, i14);
                    if (C3535.f13026 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩻") + i3) * (-101);
                        i = ((iM45029 ^ i4) * (-6331)) ^ 2095773409;
                        i2 = -1235518076;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܿ") ^ i3) * 81;
                        i = ((iM45029 ^ i4) * 3103) ^ (-1933762870);
                        i2 = 475407381;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1005002193:
                case 1572876768:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۬") + i4) * (-31);
                        i = ((iM45029 ^ i3) * 32161) ^ (-273812713);
                        i2 = 1350006466;
                    } else {
                        iM45029 = C19806.m45029("᩷ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * 11493) ^ 978593663;
                        i2 = -438053006;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    strArr = new String[]{strM41569, C1875.m6085(iM450211 ^ i7)};
                    sArr2 = f16302;
                    if (C1419.m4973()) {
                        iM45029 = (C19806.m45029("ۜܿ") ^ i3) * (-111);
                        i = ((iM45029 ^ i4) * 20577) ^ (-323130249);
                        i2 = 1439258563;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۨ") + i3) * (-3);
                        i = ((iM45029 ^ i4) * (-12023)) ^ (-677377434);
                        i2 = -1873133013;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
