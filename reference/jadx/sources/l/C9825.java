package l;

import android.app.Activity;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۢۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9825 extends AbstractC9781 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f31635;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2368 f31636;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9825(C2368 c2368, AbstractActivityC17204 abstractActivityC17204, byte[] bArr) {
        super(abstractActivityC17204);
        this.f31636 = c2368;
        this.f31635 = bArr;
    }

    @Override // l.AbstractC9781
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo5156() {
        if (!C18978.m44078()) {
            C22673.m51152(R.string.MT_Protector);
            return false;
        }
        final String string = m25509(0).m54021().toString();
        final String string2 = m25509(1).m54021().toString();
        final String string3 = m25509(2).m54021().toString();
        if (string.isEmpty()) {
            m25509(0).requestFocus();
            return false;
        }
        if (string2.isEmpty()) {
            m25509(1).requestFocus();
            return false;
        }
        if (string3.isEmpty()) {
            m25509(2).requestFocus();
            return false;
        }
        final byte[] bArr = this.f31635;
        if (bArr.length < 4) {
            C22673.m51159(R.string.MT_Protector);
            return false;
        }
        C2368 c2368 = this.f31636;
        C13511 c13511 = new C13511(c2368.f7625, R.string.MT_Protector);
        c13511.m33192();
        final AbstractActivityC17204 abstractActivityC17204 = c2368.f7625;
        final C18776 c18776 = new C18776(this, c13511, string, string2, string3);
        ReentrantLock reentrantLock = C11650.f37690;
        if (bArr.length > 102400 || TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            c18776.mo5773(new C13778(2));
            return false;
        }
        new Thread(new Runnable() { // from class: l.᩹ۜ᩻
            {
                int i = -2047786711;
                int i2 = C4238.f15451;
                int i3 = C2834.f9334;
                int iM2761 = C0619.m2761("ۧۧ") ^ i2;
                int i4 = ((iM2761 ^ i3) * (-28289)) ^ (-2097569070);
                int i5 = 1780554528;
                while (true) {
                    i = ((((i ^ i3) * 27159) >> 31) & i4) ^ (iM2761 ^ i5);
                    switch (i) {
                        case -2046636509:
                        case -1809737486:
                            if (C1783.f6087 <= 0) {
                                iM2761 = (C0773.m3169("ۖۤ") ^ i2) * 29;
                                i4 = ((iM2761 ^ i3) * 25781) ^ 554922522;
                                i5 = 307166910;
                            } else {
                                iM2761 = C0773.m3169("ۨ֡") ^ i3;
                                i4 = ((iM2761 ^ i2) * 25913) ^ 1175786530;
                                i5 = 1772740046;
                            }
                            break;
                        case -1823493024:
                        case -1129495971:
                            C1783.m6232();
                            C1542.m5459();
                            throw new RuntimeException();
                        case -1600406635:
                        case 529573112:
                            C2485.m8357();
                            if (C2419.f7754 < 0) {
                                iM2761 = C0773.m3169("ᩴ᩶") ^ i3;
                                i4 = ((iM2761 ^ i2) * 861) ^ 1774597744;
                                i5 = -1651067950;
                            } else {
                                iM2761 = (i2 - C0619.m2761("۬ܳ")) * 15;
                                i4 = ((iM2761 ^ i3) * (-18015)) ^ 724581437;
                                i5 = 1929574441;
                            }
                            break;
                        case -1448153847:
                        case -231983722:
                            if (C4282.f15546 <= 0) {
                                iM2761 = (i2 - C0619.m2761("۬ܳ")) * 15;
                                i4 = ((iM2761 ^ i3) * (-18015)) ^ 724581437;
                                i5 = 1929574441;
                            } else {
                                iM2761 = C0619.m2761("ܺۡ") ^ i2;
                                i4 = ((iM2761 ^ i3) * 21929) ^ (-1629765232);
                                i5 = 2072776952;
                            }
                            break;
                        case -944935273:
                        case 2071303300:
                            C1321.m4852();
                            iM2761 = C0619.m2761("ܰۜ") ^ i3;
                            i4 = ((iM2761 ^ i2) * (-14029)) ^ 198210258;
                            i5 = -603528164;
                            break;
                        case -851719370:
                        case -798577304:
                            if (RunnableC3646.f12471) {
                                iM2761 = C0773.m3169("ᩴ᩶") ^ i3;
                                i4 = ((iM2761 ^ i2) * 861) ^ 1774597744;
                                i5 = -1651067950;
                            } else {
                                iM2761 = (C0619.m2761("۬ۚ") + i2) * 45;
                                i4 = ((iM2761 ^ i3) * 29009) ^ (-2022871626);
                                i5 = 1454090035;
                            }
                            break;
                        case -799476024:
                        case 2093911278:
                            if (C0269.m1775() <= 0) {
                                iM2761 = C0773.m3169("ᩴ۠") ^ i3;
                                i4 = ((iM2761 ^ i2) * (-8141)) ^ 1978834964;
                                i5 = 344308199;
                            } else {
                                iM2761 = (C0619.m2761("᩺۠") + i2) * (-99);
                                i4 = ((iM2761 ^ i3) * 7451) ^ (-23805224);
                                i5 = -1503269518;
                            }
                            break;
                        case -757315456:
                        case 1906242911:
                            C0619.m2763();
                            if (C3492.f12043 > 0) {
                                iM2761 = (i2 - C0619.m2761("۬ܳ")) * 15;
                                i4 = ((iM2761 ^ i3) * (-18015)) ^ 724581437;
                                i5 = 1929574441;
                            } else {
                                iM2761 = C0619.m2761("ܰۜ") ^ i3;
                                i4 = ((iM2761 ^ i2) * (-14029)) ^ 198210258;
                                i5 = -603528164;
                            }
                            break;
                        case -594085143:
                        case -522471076:
                            if (C0269.f1558 <= 0) {
                                iM2761 = (i2 - C0619.m2761("۬ܳ")) * 15;
                                i4 = ((iM2761 ^ i3) * (-18015)) ^ 724581437;
                                i5 = 1929574441;
                            } else {
                                iM2761 = (C0619.m2761("ܰۘ") + i3) * 31;
                                i4 = ((iM2761 ^ i2) * (-7339)) ^ 1177757418;
                                i5 = 866532993;
                            }
                            break;
                        case -571757144:
                        case 1693938298:
                            if (RunnableC0334.f1808 <= 0) {
                                iM2761 = C0773.m3169("ᩴ۠") ^ i3;
                                i4 = ((iM2761 ^ i2) * (-8141)) ^ 1978834964;
                                i5 = 344308199;
                            } else {
                                iM2761 = (i2 - C0619.m2761("ۛ۟")) * 61;
                                i4 = ((iM2761 ^ i3) * (-15707)) ^ (-1550517794);
                                i5 = 972573002;
                            }
                            break;
                        case -209278335:
                        case 543680744:
                            if (C2834.f9334 <= 0) {
                                iM2761 = C0619.m2761("ܰۜ") ^ i3;
                                i4 = ((iM2761 ^ i2) * (-14029)) ^ 198210258;
                                i5 = -603528164;
                            } else {
                                iM2761 = (C0773.m3169("ܳ۠") ^ i3) * (-41);
                                i4 = ((iM2761 ^ i2) * 2427) ^ 42722388;
                                i5 = -1867891661;
                            }
                            break;
                        case 271089256:
                        case 2107410950:
                            if (C1321.f4751 >= 0) {
                                iM2761 = C0773.m3169("ᩴ᩶") ^ i3;
                                i4 = ((iM2761 ^ i2) * 861) ^ 1774597744;
                                i5 = -1651067950;
                            } else {
                                iM2761 = (C0773.m3169("۫᩹") ^ i3) * 23;
                                i4 = ((iM2761 ^ i2) * (-24473)) ^ (-434351077);
                                i5 = -808595878;
                            }
                            break;
                        case 652260263:
                        case 1619881669:
                            if (C17202.f56030) {
                                iM2761 = C0619.m2761("ܳۧ") ^ i2;
                                i4 = ((iM2761 ^ i3) * (-8867)) ^ 1710690679;
                                i5 = -1499486891;
                            } else {
                                iM2761 = (C0773.m3169("ۖۤ") ^ i2) * 29;
                                i4 = ((iM2761 ^ i3) * 25781) ^ 554922522;
                                i5 = 307166910;
                            }
                            break;
                        case 944002757:
                        case 1224149944:
                            if (C3779.f12953 <= 0) {
                                iM2761 = C0619.m2761("ܰۜ") ^ i3;
                                i4 = ((iM2761 ^ i2) * (-14029)) ^ 198210258;
                                i5 = -603528164;
                            } else {
                                iM2761 = C0773.m3169("ۨ۟") ^ i3;
                                i4 = ((iM2761 ^ i2) * 14823) ^ 655859827;
                                i5 = -917788924;
                            }
                            break;
                        case 964316384:
                        case 1540306651:
                            C23916.m53419();
                            if (AbstractC3624.f12429 <= 0) {
                                iM2761 = (C0773.m3169("ۖۤ") ^ i2) * 29;
                                i4 = ((iM2761 ^ i3) * 25781) ^ 554922522;
                                i5 = 307166910;
                            } else {
                                iM2761 = (i2 - C0619.m2761("۬ܳ")) * 15;
                                i4 = ((iM2761 ^ i3) * (-18015)) ^ 724581437;
                                i5 = 1929574441;
                            }
                            break;
                        default:
                            return;
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:41:0x0114  */
            /* JADX WARN: Code duplicated, block: B:45:0x0146  */
            /* JADX WARN: Code duplicated, block: B:53:0x0192 A[PHI: r12 r13
              0x0192: PHI (r12v3 java.lang.String) = (r12v1 java.lang.String), (r12v2 java.lang.String), (r12v1 java.lang.String), (r12v1 java.lang.String) binds: [B:52:0x0190, B:23:0x0068, B:15:0x004f, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]
              0x0192: PHI (r13v3 java.lang.String) = (r13v1 java.lang.String), (r13v2 java.lang.String), (r13v1 java.lang.String), (r13v1 java.lang.String) binds: [B:52:0x0190, B:23:0x0068, B:15:0x004f, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:57:0x01c3 A[PHI: r15 r16
              0x01c3: PHI (r15v4 android.app.Activity) = (r15v2 android.app.Activity), (r15v1 android.app.Activity), (r15v1 android.app.Activity), (r15v1 android.app.Activity) binds: [B:56:0x01c1, B:48:0x0175, B:9:0x003e, B:32:0x00be] A[DONT_GENERATE, DONT_INLINE]
              0x01c3: PHI (r16v3 l.ܳ۬᩻) = (r16v1 l.ܳ۬᩻), (r16v1 l.ܳ۬᩻), (r16v1 l.ܳ۬᩻), (r16v5 l.ܳ۬᩻) binds: [B:56:0x01c1, B:48:0x0175, B:9:0x003e, B:32:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            public final void run() {
                int iM2761;
                int i;
                int i2 = 373318308;
                int i3 = C3690.f12684;
                int i4 = C2834.f9334;
                int iM2762 = C0619.m2761("᩷ۖ") ^ i3;
                int i5 = ((iM2762 ^ i4) * 31001) ^ 1131910598;
                int i6 = iM2762 ^ 38266296;
                Activity activity = null;
                InterfaceC15379 interfaceC15379 = null;
                byte[] bArr2 = null;
                String str = null;
                String str2 = null;
                while (true) {
                    i2 = i6 ^ ((((i2 ^ i4) * 22769) >> 31) & i5);
                    switch (i2) {
                        case -2135609855:
                        case -1952251244:
                            if (C11235.f35427 < 0) {
                                iM2761 = (i4 - C0619.m2761("֡ۙ")) * (-89);
                                i5 = ((iM2761 ^ i3) * (-3681)) ^ (-1878526353);
                                i = -56989707;
                            } else {
                                iM2761 = C0619.m2761("᩶ᩳ") ^ i3;
                                i5 = ((iM2761 ^ i4) * 30401) ^ (-140852233);
                                i = 462698806;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        case -1975929647:
                        case 627324651:
                            AbstractC0116.m1243();
                            if (C3779.m12264()) {
                                iM2761 = (C0619.m2761("ۘ᩹") ^ i3) * 49;
                                i5 = ((iM2761 ^ i4) * 9931) ^ (-1773291935);
                                i = -1835162304;
                            } else {
                                iM2761 = (i4 - C0619.m2761("֡ۙ")) * (-89);
                                i5 = ((iM2761 ^ i3) * (-3681)) ^ (-1878526353);
                                i = -56989707;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        case -1919082513:
                        case 1990454185:
                            InterfaceC15379 interfaceC153710 = c18776;
                            if (C3734.m12152() >= 0) {
                                interfaceC15379 = interfaceC153710;
                                iM2761 = (C0773.m3169("ۜܶ") ^ i4) * (-23);
                                i5 = ((iM2761 ^ i3) * (-20109)) ^ 1057867867;
                                i = 1624388379;
                                i6 = iM2761 ^ i;
                            } else {
                                int iM2763 = (C0619.m2761("᩵֨") + i3) * (-99);
                                i5 = ((iM2763 ^ i4) * (-30789)) ^ (-676710048);
                                i6 = iM2763 ^ 1934052548;
                                interfaceC15379 = interfaceC153710;
                            }
                            break;
                        case -1845505578:
                        case 1018666983:
                            activity = abstractActivityC17204;
                            if (C1826.f6190 <= 0) {
                                iM2761 = (C0773.m3169("ۜܶ") ^ i4) * (-23);
                                i5 = ((iM2761 ^ i3) * (-20109)) ^ 1057867867;
                                i = 1624388379;
                            } else {
                                iM2761 = C0619.m2761("ᩴ᩺") ^ i3;
                                i5 = ((iM2761 ^ i4) * (-10125)) ^ 55795619;
                                i = 911083301;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        case -1828408899:
                        case 607571466:
                            RunnableC3055.m9933();
                            iM2761 = (C0619.m2761("ۘ᩹") ^ i3) * 49;
                            i5 = ((iM2761 ^ i4) * 9931) ^ (-1773291935);
                            i = -1835162304;
                            i6 = iM2761 ^ i;
                            break;
                        case -1640429903:
                        case 104710907:
                            RunnableC3055.m9933();
                            break;
                        case -1561749064:
                        case 2065027178:
                            if (C1080.m4050()) {
                                iM2761 = (C0619.m2761("᩺ۛ") + i4) * (-109);
                                i5 = ((iM2761 ^ i3) * 24473) ^ (-1317121523);
                                i = 1251924298;
                            } else {
                                iM2761 = C0619.m2761("᩶ᩳ") ^ i3;
                                i5 = ((iM2761 ^ i4) * 30401) ^ (-140852233);
                                i = 462698806;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        case -1510791559:
                        case -850478845:
                            if (C1146.m4231()) {
                                iM2761 = (i4 - C0773.m3169("᩵ۤ")) * 55;
                                i5 = ((iM2761 ^ i3) * (-12103)) ^ (-195063456);
                                i = -1498490833;
                            } else {
                                iM2761 = C0619.m2761("᩶ᩳ") ^ i3;
                                i5 = ((iM2761 ^ i4) * 30401) ^ (-140852233);
                                i = 462698806;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        case -1366653096:
                        case 285571239:
                            if (C2288.f7433 <= 0) {
                                iM2761 = (C0619.m2761("ۘ᩹") ^ i3) * 49;
                                i5 = ((iM2761 ^ i4) * 9931) ^ (-1773291935);
                                i = -1835162304;
                            } else {
                                iM2761 = C0773.m3169("ܳۢ") ^ i4;
                                i5 = ((iM2761 ^ i3) * (-25861)) ^ 956819446;
                                i = 1298094689;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        case -1153925412:
                        case 916302416:
                            str = string;
                            str2 = string2;
                            if (C0487.f2131 <= 0) {
                                iM2761 = (i4 - C0619.m2761("֡ۙ")) * (-89);
                                i5 = ((iM2761 ^ i3) * (-3681)) ^ (-1878526353);
                                i = -56989707;
                            } else {
                                iM2761 = (i3 - C0619.m2761("ۛܶ")) * 87;
                                i5 = ((iM2761 ^ i4) * 28637) ^ 879462296;
                                i = 1615633826;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        case -706144381:
                        case 1055311790:
                            bArr2 = bArr;
                            if (C2375.f7641 <= 0) {
                                iM2761 = (C0619.m2761("ۗ᩵") + i3) * 97;
                                i5 = ((iM2761 ^ i4) * (-18435)) ^ (-1933477571);
                                i = -2073665506;
                            } else {
                                iM2761 = C0619.m2761("ᩴۛ") ^ i4;
                                i5 = ((iM2761 ^ i3) * 32551) ^ 219040973;
                                i = -193793557;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        case 69998257:
                        case 345385598:
                            C11650.m29312(bArr2, str, str2, string3, activity, interfaceC15379);
                            break;
                        case 146671811:
                        case 448487714:
                            if (C2834.f9334 <= 0) {
                                iM2761 = (i4 - C0619.m2761("֡ۙ")) * (-89);
                                i5 = ((iM2761 ^ i3) * (-3681)) ^ (-1878526353);
                                i = -56989707;
                            } else {
                                iM2761 = C0619.m2761("ܿۧ") ^ i4;
                                i5 = ((iM2761 ^ i3) * (-6739)) ^ 1272232388;
                                i = 586141279;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        case 235303339:
                        case 1591755520:
                            C3099.m10095();
                            if (C0619.f2439) {
                                iM2761 = (C0773.m3169("ۜܶ") ^ i4) * (-23);
                                i5 = ((iM2761 ^ i3) * (-20109)) ^ 1057867867;
                                i = 1624388379;
                            } else {
                                iM2761 = (C0619.m2761("ۘ᩹") ^ i3) * 49;
                                i5 = ((iM2761 ^ i4) * 9931) ^ (-1773291935);
                                i = -1835162304;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        case 483012891:
                        case 1839635463:
                            if (AbstractC0641.f2496 >= 0) {
                                iM2761 = (C0773.m3169("ۜܶ") ^ i4) * (-23);
                                i5 = ((iM2761 ^ i3) * (-20109)) ^ 1057867867;
                                i = 1624388379;
                            } else {
                                iM2761 = (C0773.m3169("ۚۚ") + i3) * (-13);
                                i5 = ((iM2761 ^ i4) * 23191) ^ 113971498;
                                i = 1751756185;
                            }
                            i6 = iM2761 ^ i;
                            break;
                        default:
                            if (C0487.f2131 <= 0) {
                                iM2761 = C0619.m2761("᩶ᩳ") ^ i3;
                                i5 = ((iM2761 ^ i4) * 30401) ^ (-140852233);
                                i = 462698806;
                            } else {
                                iM2761 = C0773.m3169("᩻۫") ^ i3;
                                i5 = ((iM2761 ^ i4) * (-15999)) ^ 1298437810;
                                i = 1172679386;
                            }
                            i6 = iM2761 ^ i;
                            break;
                    }
                    return;
                }
            }
        }).start();
        return false;
    }
}
