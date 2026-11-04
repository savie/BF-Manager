package l;

import android.content.DialogInterface;
import android.graphics.RectF;
import bin.mt.plus.R;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩹۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23426 extends AbstractC2432 {

    /* JADX INFO: renamed from: ᩷ܶܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f75848 = {8005, -18641, -18575, -18577, -18586};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f75849;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f75850;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1752 f75851;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f75852;

    public C23426(C8614 c8614, AbstractC22044 abstractC22044) {
        this.f75849 = c8614;
        this.f75850 = abstractC22044;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f75849.m23233(), R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        RectF rectFM6191 = this.f75851.m6191();
        int iM6197 = (int) this.f75851.m6197();
        int iM6195 = (int) this.f75851.m6195();
        if (iM6197 == -1 && iM6195 == -1) {
            iM6197 = (int) (rectFM6191.right - rectFM6191.left);
            iM6195 = (int) (rectFM6191.bottom - rectFM6191.top);
        } else if (rectFM6191 == null) {
            this.f75851.m6185(iM6197, iM6195);
        }
        int i = iM6197;
        int i2 = iM6195;
        new C15966(this, this.f75849.m23233(), i, i2, i, i2);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f75849.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b0 A[PHI: r9
      0x00b0: PHI (r9v3 l.۠ۨܳ) = (r9v2 l.۠ۨܳ), (r9v1 l.۠ۨܳ), (r9v1 l.۠ۨܳ) binds: [B:26:0x00ae, B:16:0x0081, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02a0 A[PHI: r7 r8 r16
      0x02a0: PHI (r7v3 java.lang.String) = 
      (r7v1 java.lang.String)
      (r7v2 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
     binds: [B:69:0x029e, B:30:0x00e6, B:18:0x0085, B:16:0x0081, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r8v3 boolean) = (r8v1 boolean), (r8v2 boolean), (r8v1 boolean), (r8v1 boolean), (r8v1 boolean) binds: [B:69:0x029e, B:30:0x00e6, B:18:0x0085, B:16:0x0081, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r16v3 short) = (r16v2 short), (r16v1 short), (r16v1 short), (r16v1 short), (r16v1 short) binds: [B:69:0x029e, B:30:0x00e6, B:18:0x0085, B:16:0x0081, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02d9 A[PHI: r4 r5 r15
      0x02d9: PHI (r4v3 java.lang.StringBuilder) = (r4v1 java.lang.StringBuilder), (r4v2 java.lang.StringBuilder), (r4v1 java.lang.StringBuilder) binds: [B:73:0x02d7, B:42:0x0152, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r5v3 java.lang.String) = (r5v1 java.lang.String), (r5v2 java.lang.String), (r5v1 java.lang.String) binds: [B:73:0x02d7, B:42:0x0152, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r15v3 int) = (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:73:0x02d7, B:42:0x0152, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x032b A[PHI: r6 r12 r18
      0x032b: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v4 java.lang.String) binds: [B:81:0x0329, B:38:0x012b, B:34:0x0108] A[DONT_GENERATE, DONT_INLINE]
      0x032b: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:81:0x0329, B:38:0x012b, B:34:0x0108] A[DONT_GENERATE, DONT_INLINE]
      0x032b: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char) binds: [B:81:0x0329, B:38:0x012b, B:34:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0361 A[PHI: r13 r17 r24
      0x0361: PHI (r13v3 short) = (r13v1 short), (r13v2 short), (r13v1 short), (r13v1 short) binds: [B:85:0x035f, B:77:0x030d, B:9:0x0058, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0361: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:85:0x035f, B:77:0x030d, B:9:0x0058, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0361: PHI (r24v5 int) = (r24v3 int), (r24v4 int), (r24v3 int), (r24v3 int) binds: [B:85:0x035f, B:77:0x030d, B:9:0x0058, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public void mo1136() throws Throwable {
        int iM3169;
        int i;
        int i2;
        InputStream inputStreamM13655 = null;
        Throwable th = null;
        StringBuilder sb = null;
        String strM49874 = null;
        String strM3500 = null;
        String strM4058 = null;
        boolean z = false;
        C8614 c8614 = null;
        Object obj = null;
        short s = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = -2018885732;
        int i5 = C0487.f2131;
        int i6 = C2287.f7432;
        int iM31610 = C0773.m3169("᩻ۜ") ^ i5;
        int i7 = ((iM31610 ^ i6) * 199) ^ 454707934;
        int i8 = iM31610 ^ (-1986516430);
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = 0;
        char c = 0;
        AbstractC22044 abstractC22044 = null;
        int i10 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i6) * 21273) >> 31));
            switch (i4) {
                case -2092111575:
                case 1510125317:
                    C0773.m3161();
                    if (C1343.f4799 == 0) {
                        iM3169 = C0619.m2761("۬ܺ") ^ i5;
                        i = ((iM3169 ^ i6) * (-2601)) ^ (-1434694908);
                        i2 = 1041862981;
                    } else {
                        iM3169 = (C0619.m2761("֨۟") ^ i5) * (-73);
                        i = ((iM3169 ^ i6) * 21671) ^ 1546671537;
                        i2 = -1330030799;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -2068277639:
                case 1743618618:
                    if (inputStreamM13655 != null) {
                        iM3169 = C0773.m3169("ۜܰ") ^ i6;
                        i = ((iM3169 ^ i5) * (-159)) ^ 2105872333;
                        i2 = -840052394;
                    } else {
                        iM3169 = C0619.m2761("֡ۜ") ^ i5;
                        i = ((iM3169 ^ i6) * (-30723)) ^ 2062093687;
                        i2 = 1484809831;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -2006920016:
                case -1769742491:
                    C3779.m12258(sb, strM3500);
                    strM4058 = C1080.m4058(sb);
                    z = false;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (i6 - C0619.m2761("ۛᩳ")) * 43;
                        i = ((iM3169 ^ i5) * (-5643)) ^ 1031818942;
                        i2 = -1147548843;
                    } else {
                        iM3169 = C0773.m3169("᩸֡") ^ i5;
                        i = ((iM3169 ^ i6) * 18793) ^ 182470143;
                        i2 = -1697742168;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1916993639:
                case -1580624994:
                    c8614 = this.f75849;
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("۬ܺ") ^ i5;
                        i = ((iM3169 ^ i6) * (-2601)) ^ (-1434694908);
                        i2 = 1041862981;
                    } else {
                        iM3169 = C0619.m2761("᩶ۧ") ^ i5;
                        i = ((iM3169 ^ i6) * 3613) ^ (-2052614053);
                        i2 = -1277892899;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1869564439:
                case -532975960:
                    C1783.m6232();
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("۬ܺ") ^ i5;
                        i = ((iM3169 ^ i6) * (-2601)) ^ (-1434694908);
                        i2 = 1041862981;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ۛᩳ")) * 43;
                        i = ((iM3169 ^ i5) * (-5643)) ^ 1031818942;
                        i2 = -1147548843;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1777333160:
                case 1590798168:
                    s2 = 16424;
                    if (C3779.f12953 <= 0) {
                        iM3169 = (i6 - C0619.m2761("ۛᩳ")) * 43;
                        i = ((iM3169 ^ i5) * (-5643)) ^ 1031818942;
                        i2 = -1147548843;
                    } else {
                        iM3169 = (C0773.m3169("ۨ᩸") + i5) * (-121);
                        i = ((iM3169 ^ i6) * 10833) ^ (-480861521);
                        i2 = -1952391029;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1712759025:
                case -1532585228:
                    this.f75852 = c8614.m23170(strM4058, z).m49839(true);
                    return;
                case -1628809493:
                case 901993349:
                    sArr = f75848;
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = C0619.m2761("֫۠") ^ i6;
                        i = ((iM3169 ^ i5) * 22013) ^ 1561534956;
                        i2 = -941186550;
                    } else {
                        iM3169 = (C0773.m3169("ۙۜ") ^ i6) * 95;
                        i = ((iM3169 ^ i5) * 32481) ^ (-928164634);
                        i2 = 2122866613;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1628669045:
                case -300907726:
                    C1146.m4219(th, obj);
                    iM3169 = C0773.m3169("ܶ۫") ^ i6;
                    i = ((iM3169 ^ i5) * 2727) ^ 322419934;
                    i2 = 1314188843;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1538599659:
                case -1536118954:
                    try {
                        this.f75851 = C1752.m6176(inputStreamM13655);
                        iM3169 = C0773.m3169("ۜ᩻") ^ i5;
                        i = ((iM3169 ^ i6) * 19793) ^ 1187791917;
                        i2 = -1815527810;
                    } catch (Throwable th2) {
                        th = th2;
                        iM3169 = (i5 - C0619.m2761("ܳܿ")) * 35;
                        i = ((iM3169 ^ i6) * 8661) ^ (-1624222262);
                        i2 = 1408517976;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1448870635:
                case -1413444344:
                    strM3500 = C0862.m3500(sArr2, 1, 4, i9);
                    if (C2419.f7754 >= 0) {
                        iM3169 = (i6 - C0773.m3169("ۚۙ")) * (-57);
                        i = ((iM3169 ^ i5) * 10233) ^ 411630065;
                        i2 = 1921505292;
                    } else {
                        iM3169 = (C0619.m2761("ۜ᩵") ^ i6) * (-49);
                        i = ((iM3169 ^ i5) * 13721) ^ 575423869;
                        i2 = -318733163;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1329749295:
                case -719083506:
                    s = sArr[c];
                    i10 = s * s;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0619.m2761("֫۠") ^ i6;
                        i = ((iM3169 ^ i5) * 22013) ^ 1561534956;
                        i2 = -941186550;
                    } else {
                        iM3169 = C0773.m3169("ۜ۫") ^ i5;
                        i = ((iM3169 ^ i6) * (-31679)) ^ 951245211;
                        i2 = 1709300784;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1295702691:
                case 1621315859:
                    if (i3 - (s * s2) < 0) {
                        iM3169 = C0773.m3169("ۚ᩶") ^ i6;
                        i = ((iM3169 ^ i5) * 3577) ^ (-1479461177);
                        i2 = -2105716273;
                    } else {
                        iM3169 = C0773.m3169("ۨܰ") ^ i6;
                        i = ((iM3169 ^ i5) * (-3923)) ^ 454947142;
                        i2 = -937634537;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1274177262:
                case 1382653337:
                    AbstractC22044 abstractC22045 = this.f75850;
                    inputStreamM13655 = C4282.m13655(abstractC22045);
                    int iM2761 = C0619.m2761("ۗۛ") ^ i6;
                    i7 = ((iM2761 ^ i5) * 325) ^ 884571210;
                    abstractC22044 = abstractC22045;
                    i8 = iM2761 ^ 610111992;
                    break;
                case -1180589554:
                case 1207011990:
                    C11235.m28309();
                    C3099.m10095();
                    iM3169 = (i6 - C0619.m2761("ۛᩳ")) * 43;
                    i = ((iM3169 ^ i5) * (-5643)) ^ 1031818942;
                    i2 = -1147548843;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1128462539:
                case 1208718934:
                    i9 = 46849;
                    iM3169 = C0773.m3169("۠ۗ") ^ i5;
                    i = ((iM3169 ^ i6) * 28621) ^ (-1852438363);
                    i2 = -1552153091;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -941892381:
                case 1308267659:
                    C1519.m5402(inputStreamM13655);
                    iM3169 = C0619.m2761("֡ۜ") ^ i5;
                    i = ((iM3169 ^ i6) * (-30723)) ^ 2062093687;
                    i2 = 1484809831;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -834431401:
                case 525953205:
                    throw th;
                case -805977246:
                case 1014703228:
                    try {
                        C1519.m5402(inputStreamM13655);
                        iM3169 = C0773.m3169("ܶ۫") ^ i6;
                        i = ((iM3169 ^ i5) * 2727) ^ 322419934;
                        i2 = 1314188843;
                        i8 = iM3169 ^ i2;
                    } catch (Throwable th3) {
                        int iM31611 = C0773.m3169("ۤᩳ") ^ i5;
                        i = ((iM31611 ^ i6) * 30547) ^ (-473907709);
                        i8 = iM31611 ^ (-111070171);
                        obj = th3;
                    }
                    i7 = i;
                    break;
                case -790969452:
                case 1448774442:
                    C3779.m12258(sb, strM49874);
                    sArr2 = f75848;
                    if (C1343.f4799 != 0) {
                        iM3169 = (i6 - C0773.m3169("ۚۙ")) * (-57);
                        i = ((iM3169 ^ i5) * 10233) ^ 411630065;
                        i2 = 1921505292;
                    } else {
                        iM3169 = (C0619.m2761("᩸ۙ") + i5) * 55;
                        i = ((iM3169 ^ i6) * 19831) ^ (-1214447801);
                        i2 = -1580692745;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -688211784:
                case 40509722:
                    i9 = 53563;
                    iM3169 = C0773.m3169("۠ۗ") ^ i5;
                    i = ((iM3169 ^ i6) * 28621) ^ (-1852438363);
                    i2 = -1552153091;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -327883307:
                case 141129994:
                    C2485.m8357();
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("֫۠") ^ i6;
                        i = ((iM3169 ^ i5) * 22013) ^ 1561534956;
                        i2 = -941186550;
                    } else {
                        iM3169 = (i6 - C0773.m3169("۬᩻")) * (-77);
                        i = ((iM3169 ^ i5) * (-3199)) ^ 1068534522;
                        i2 = 590305227;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -164956893:
                case -156759029:
                    c = 0;
                    if (C17202.f56030) {
                        iM3169 = (i5 - C0619.m2761("ۨܺ")) * 7;
                        i = ((iM3169 ^ i6) * 23777) ^ (-984469540);
                        i2 = 1899056228;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ۚۙ")) * (-57);
                        i = ((iM3169 ^ i5) * 10233) ^ 411630065;
                        i2 = 1921505292;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 34771569:
                case 1341232164:
                    sb = new StringBuilder();
                    strM49874 = abstractC22044.m49874();
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0619.m2761("֨۟") ^ i5) * (-73);
                        i = ((iM3169 ^ i6) * 21671) ^ 1546671537;
                        i2 = -1330030799;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ۧۡ")) * (-117);
                        i = ((iM3169 ^ i5) * (-7633)) ^ 1524001901;
                        i2 = -1522305519;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 945204366:
                case 1087715247:
                    C1146.m4231();
                    C2419.m8174();
                    return;
                case 1300282146:
                case 1922056359:
                    i3 = i10 + 67436944;
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0619.m2761("֨۟") ^ i5) * (-73);
                        i = ((iM3169 ^ i6) * 21671) ^ 1546671537;
                        i2 = -1330030799;
                    } else {
                        iM3169 = C0619.m2761("᩻ۢ") ^ i6;
                        i = ((iM3169 ^ i5) * (-30147)) ^ (-730217474);
                        i2 = 369404310;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 1499667015:
                case 1739157724:
                    if (inputStreamM13655 != null) {
                        iM3169 = (C0619.m2761("᩶᩷") ^ i6) * (-53);
                        i = ((iM3169 ^ i5) * (-20739)) ^ (-1940972386);
                        i2 = 1204544228;
                    } else {
                        iM3169 = C0773.m3169("ܶ۫") ^ i6;
                        i = ((iM3169 ^ i5) * 2727) ^ 322419934;
                        i2 = 1314188843;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                default:
                    C1564.m5509();
                    if (C3448.f11240 < 0) {
                        iM3169 = (i6 - C0619.m2761("ۛᩳ")) * 43;
                        i = ((iM3169 ^ i5) * (-5643)) ^ 1031818942;
                        i2 = -1147548843;
                    } else {
                        iM3169 = C0619.m2761("֫۠") ^ i6;
                        i = ((iM3169 ^ i5) * 22013) ^ 1561534956;
                        i2 = -941186550;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
            }
        }
    }
}
