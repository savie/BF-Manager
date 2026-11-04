package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q62Z */
/* JADX INFO: loaded from: classes.dex */
public final class C24317 extends AbstractC24700 {

    /* JADX INFO: renamed from: ᩳ۫᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f78715 = {186, -17710, -22256, -17779, 18929, -17509, -26385, 6825, 29400, 27934, -24767, 6842, 19797, -18205, -23035, 20559, -29312, 21464, -23362, 24038, -30712, -8723, -8783, -8723, -17067, -21612, 16626, 9722, 15500, -12039, -12834};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10467 f78716;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC10144 f78717;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f78718;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f78719;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f78720;

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public C24317(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Code duplicated, block: B:101:0x0415 A[PHI: r11 r12 r16
      0x0415: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:100:0x0413, B:38:0x012e, B:26:0x00af, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0415: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:100:0x0413, B:38:0x012e, B:26:0x00af, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0415: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:100:0x0413, B:38:0x012e, B:26:0x00af, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00da A[PHI: r8 r9
      0x00da: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:30:0x00d8, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:30:0x00d8, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0307 A[PHI: r2 r3
      0x0307: PHI (r2v4 int) = (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:80:0x0305, B:20:0x008d, B:18:0x0089, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r3v4 l.ۢ۬ۤ) = (r3v3 l.ۢ۬ۤ), (r3v2 l.ۢ۬ۤ), (r3v2 l.ۢ۬ۤ), (r3v2 l.ۢ۬ۤ) binds: [B:80:0x0305, B:20:0x008d, B:18:0x0089, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x03b0 A[PHI: r13 r18 r19
      0x03b0: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:92:0x03ae, B:34:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x03b0: PHI (r18v4 short) = (r18v3 short), (r18v2 short) binds: [B:92:0x03ae, B:34:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x03b0: PHI (r19v4 int) = (r19v3 int), (r19v2 int) binds: [B:92:0x03ae, B:34:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x03e3 A[PHI: r15 r17 r24
      0x03e3: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v5 int) binds: [B:96:0x03e1, B:12:0x0075, B:6:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:96:0x03e1, B:12:0x0075, B:6:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r24v4 int) = (r24v3 int), (r24v3 int), (r24v6 int) binds: [B:96:0x03e1, B:12:0x0075, B:6:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo54355(String str) {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int i4;
        int i5 = AbstractC0116.f1064;
        int i6 = C1826.f6190;
        int iM2763 = C0619.m2761("۫֨") ^ i5;
        int i7 = ((iM2763 ^ i6) * 5491) ^ (-1173849121);
        AbstractActivityC10144 abstractActivityC10144 = null;
        short[] sArr = null;
        int i8 = iM2763 ^ 1521396882;
        int selectedItemPosition = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int iM3169 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 223752012;
        int i15 = 0;
        short[] sArr2 = null;
        int i16 = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * (-1767)) >> 31));
            switch (i14) {
                case -2004385446:
                case 898287172:
                    abstractActivityC10144.f32504 = z;
                    sArr = f78715;
                    i10 = 28;
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("ۤᩴ") ^ i5;
                        i = ((iM2761 ^ i6) * 10579) ^ (-64595715);
                        i2 = 1813898811;
                    } else {
                        iM2761 = (C0619.m2761("۠ۚ") + i6) * 21;
                        i = ((iM2761 ^ i5) * 17755) ^ (-1446220270);
                        i2 = 1495554504;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1984683442:
                case 34260468:
                    i9 = 17259;
                    iM2761 = (C0619.m2761("֨ۤ") + i5) * (-117);
                    i = ((iM2761 ^ i6) * 30031) ^ (-673300177);
                    i2 = -1589612907;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1937222139:
                case -1845942913:
                    C0773.m3161();
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("ۘ᩷") + i5) * (-49);
                        i = ((iM2761 ^ i6) * 3125) ^ (-157933184);
                        i2 = 1148514871;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ᩴᩳ")) * 97;
                        i = ((iM2761 ^ i5) * (-1557)) ^ 724827610;
                        i2 = 2067932294;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1800490521:
                case 1945552142:
                    C0487.m2356();
                    if (C2419.m8174() < 0) {
                        iM2761 = (C0619.m2761("ۘ᩷") + i5) * (-49);
                        i = ((iM2761 ^ i6) * 3125) ^ (-157933184);
                        i2 = 1148514871;
                    } else {
                        iM2761 = C0773.m3169("᩸᩶") ^ i6;
                        i = ((iM2761 ^ i5) * 28679) ^ 1113769977;
                        i2 = -395433188;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1699427266:
                case -1503016790:
                    abstractActivityC10144.f32489 = selectedItemPosition;
                    if (C2966.m9664()) {
                        iM2761 = (C0773.m3169("ۚܿ") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i5) * 31777) ^ 591443656;
                        i2 = 748983976;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ᩴᩳ")) * 97;
                        i = ((iM2761 ^ i5) * (-1557)) ^ 724827610;
                        i2 = 2067932294;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1631566408:
                case 1905733794:
                    C1826.m6301();
                    C3690.m11987();
                    return false;
                case -1628506446:
                case -1525809183:
                    abstractActivityC10144.f32501.notifyDataSetChanged();
                    abstractActivityC10144.m26255();
                    return z2;
                case -1593247885:
                case -1128083139:
                    selectedItemPosition = this.f78716.getSelectedItemPosition();
                    abstractActivityC10144 = this.f78717;
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩷") + i5) * (-49);
                        i = ((iM2761 ^ i6) * 3125) ^ (-157933184);
                        i2 = 1148514871;
                    } else {
                        iM2761 = C0773.m3169("᩸᩵") ^ i6;
                        i = ((iM2761 ^ i5) * 433) ^ 948739154;
                        i2 = -1030769232;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1514592192:
                case 1113204383:
                    if (C1564.m5512(str)) {
                        iM2761 = (C0773.m3169("ۨۜ") ^ i6) * (-13);
                        i = ((iM2761 ^ i5) * 14759) ^ (-1470585429);
                        i2 = -498426775;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩷ۜ")) * (-43);
                        i = ((iM2761 ^ i6) * 32421) ^ 1810406731;
                        i2 = -1255116434;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1480771428:
                case 12354878:
                    if (abstractActivityC10144.f32489 != 2) {
                        iM2762 = C0773.m3169("᩵᩷") ^ i6;
                        i3 = ((iM2762 ^ i5) * 1941) ^ 1480970;
                        i4 = -1476618876;
                    } else {
                        iM2762 = C0619.m2761("ܺܽ") ^ i5;
                        i3 = ((iM2762 ^ i6) * (-663)) ^ 492273755;
                        i4 = -1131040059;
                    }
                    i8 = iM2762 ^ i4;
                    i7 = i3;
                    z = false;
                    z2 = true;
                    break;
                case -1427374581:
                case 1834390642:
                    i9 = 47661;
                    iM2761 = (C0619.m2761("֨ۤ") + i5) * (-117);
                    i = ((iM2761 ^ i6) * 30031) ^ (-673300177);
                    i2 = -1589612907;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1368750969:
                case 1291014719:
                    iM3169 = C0773.m3169(C2310.m7803(sArr, i10, i11, i9));
                    i16 = 2098513503;
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0773.m3169("᩸᩶") ^ i6;
                        i = ((iM2761 ^ i5) * 28679) ^ 1113769977;
                        i2 = -395433188;
                    } else {
                        iM2761 = C0619.m2761("ܽ᩵") ^ i5;
                        i = ((iM2761 ^ i6) * (-19575)) ^ (-1401080529);
                        i2 = 1263650581;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1314225012:
                case 201283830:
                    s = sArr2[c];
                    i13 = s + 1;
                    if (C0862.m3503()) {
                        iM2761 = C0773.m3169("ᩴۚ") ^ i5;
                        i = ((iM2761 ^ i6) * (-22717)) ^ 2082168173;
                        i2 = -1092932014;
                    } else {
                        iM2761 = (C0619.m2761("᩸᩹") ^ i6) * 5;
                        i = ((iM2761 ^ i5) * 15967) ^ (-550100217);
                        i2 = -939742791;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1265547707:
                case 1330626673:
                    C1564.m5518(abstractActivityC10144, iM3169 ^ i16);
                    abstractActivityC10144.f32495 = -1;
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("ۤᩴ") ^ i5;
                        i = ((iM2761 ^ i6) * 10579) ^ (-64595715);
                        i2 = 1813898811;
                    } else {
                        iM2761 = C0619.m2761("ۗ۫") ^ i6;
                        i = ((iM2761 ^ i5) * 23751) ^ (-1518800550);
                        i2 = -99934303;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1198806982:
                case 1884601017:
                    z3 = false;
                    iM2761 = C0773.m3169("۟ۙ") ^ i5;
                    i = ((iM2761 ^ i6) * 28083) ^ (-1223826319);
                    i2 = 1996389507;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1021646655:
                case -14307802:
                    z3 = true;
                    iM2761 = C0773.m3169("۟ۙ") ^ i5;
                    i = ((iM2761 ^ i6) * 28083) ^ (-1223826319);
                    i2 = 1996389507;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -983471042:
                case 1065146823:
                    C0619.m2763();
                    if (C2287.m7745() <= 0) {
                        iM2761 = (i6 - C0773.m3169("ᩴᩳ")) * 97;
                        i = ((iM2761 ^ i5) * (-1557)) ^ 724827610;
                        i2 = 2067932294;
                    } else {
                        iM2761 = C0619.m2761("ۤᩴ") ^ i5;
                        i = ((iM2761 ^ i6) * 10579) ^ (-64595715);
                        i2 = 1813898811;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -839907938:
                case 1588628787:
                    sArr2 = f78715;
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("ۤᩴ") ^ i5;
                        i = ((iM2761 ^ i6) * 10579) ^ (-64595715);
                        i2 = 1813898811;
                    } else {
                        iM2761 = C0619.m2761("ᩳۖ") ^ i6;
                        i = ((iM2761 ^ i5) * 27965) ^ 375705726;
                        i2 = 1694173810;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -726621016:
                case 1121306862:
                    AbstractC0641.m2813();
                    iM2761 = (C0619.m2761("ۘ᩷") + i5) * (-49);
                    i = ((iM2761 ^ i6) * 3125) ^ (-157933184);
                    i2 = 1148514871;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -447234953:
                case 1703083972:
                    z4 = true;
                    iM2761 = C0619.m2761("۫ᩳ") ^ i6;
                    i = ((iM2761 ^ i5) * (-31009)) ^ (-1907227413);
                    i2 = 162698974;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -414688814:
                case -93968531:
                    return z;
                case -330692470:
                case 2130894920:
                    abstractActivityC10144.f32487 = m55054(z2 ? 1 : 0);
                    iM2761 = (i5 - C0773.m3169("᩺ܽ")) * (-41);
                    i = ((iM2761 ^ i6) * (-21331)) ^ 1302817654;
                    i2 = 1305956673;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -16912497:
                case 1028726985:
                    if (abstractActivityC10144.f32489 == 0) {
                        iM2761 = (C0773.m3169("۠ۘ") ^ i5) * 39;
                        i = ((iM2761 ^ i6) * 1431) ^ (-1556082349);
                        i2 = -1793256936;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩻") ^ i5;
                        i = ((iM2761 ^ i6) * 2901) ^ 438784073;
                        i2 = -1582875751;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 1901398:
                case 219075344:
                    c = 27;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i5 - C0773.m3169("ۘܿ")) * 39;
                        i = ((iM2761 ^ i6) * 18009) ^ (-1653019875);
                        i2 = 876186388;
                    } else {
                        iM2761 = C0773.m3169("ᩳ֡") ^ i5;
                        i = ((iM2761 ^ i6) * (-14883)) ^ (-275118181);
                        i2 = -1246281538;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 31544414:
                case 300688129:
                    if ((i12 + 1) - i15 > 0) {
                        iM2761 = (C0773.m3169("ۜ᩶") ^ i6) * 77;
                        i = ((iM2761 ^ i5) * 27501) ^ (-508347909);
                        i2 = 1529462253;
                    } else {
                        iM2761 = (C0619.m2761("ۢᩴ") + i5) * (-55);
                        i = ((iM2761 ^ i6) * 30403) ^ (-1497340942);
                        i2 = -1211627403;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 35143776:
                case 1265348568:
                    mo8146((C11273) null, "");
                    return z2;
                case 212950320:
                case 442148894:
                    if (C2878.m9480(str)) {
                        iM2761 = C0619.m2761("ᩳۛ") ^ i6;
                        i = ((iM2761 ^ i5) * (-7219)) ^ (-1341391375);
                        i2 = -1709447520;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩻") ^ i5;
                        i = ((iM2761 ^ i6) * 2901) ^ 438784073;
                        i2 = -1582875751;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 488639291:
                case 657133115:
                    z4 = false;
                    iM2761 = C0619.m2761("۫ᩳ") ^ i6;
                    i = ((iM2761 ^ i5) * (-31009)) ^ (-1907227413);
                    i2 = 162698974;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 536548541:
                case 1505197788:
                    i11 = 3;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("᩸᩹") ^ i6) * 5;
                        i = ((iM2761 ^ i5) * 15967) ^ (-550100217);
                        i2 = -939742791;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩶᩵")) * 123;
                        i = ((iM2761 ^ i6) * 23699) ^ 297151744;
                        i2 = 1462212360;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 977962555:
                case 1745087383:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (i6 - C0773.m3169("ᩴᩳ")) * 97;
                        i = ((iM2761 ^ i5) * (-1557)) ^ 724827610;
                        i2 = 2067932294;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۘܿ")) * 39;
                        i = ((iM2761 ^ i6) * 18009) ^ (-1653019875);
                        i2 = 876186388;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 1577000663:
                case 1834440145:
                    this.f78720 = z4;
                    abstractActivityC10144.f32494 = m55054(z ? 1 : 0);
                    if (this.f78718) {
                        iM2761 = (C0773.m3169("᩷᩻") + i6) * 69;
                        i = ((iM2761 ^ i5) * 12149) ^ (-846429243);
                        i2 = 1302962431;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩺ܽ")) * (-41);
                        i = ((iM2761 ^ i6) * (-21331)) ^ 1302817654;
                        i2 = 1305956673;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 1918519463:
                case 1927305957:
                    this.f78719 = z3;
                    if (abstractActivityC10144.f32489 != z2) {
                        iM2761 = C0773.m3169("ۤۚ") ^ i5;
                        i = ((iM2761 ^ i6) * (-27391)) ^ (-256442210);
                        i2 = 1637670414;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ܽۤ")) * (-125);
                        i = ((iM2761 ^ i5) * (-11339)) ^ (-2090690548);
                        i2 = -1683121189;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                default:
                    i15 = i13 * i13;
                    i12 = s * 2;
                    if (C2966.m9664()) {
                        iM2761 = (C0773.m3169("ܰۨ") + i6) * 41;
                        i = ((iM2761 ^ i5) * (-16895)) ^ 2031085204;
                        i2 = 959854966;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۘܿ")) * 39;
                        i = ((iM2761 ^ i6) * 18009) ^ (-1653019875);
                        i2 = 876186388;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0511 A[PHI: r41
      0x0511: PHI (r41v98 java.lang.String) = (r41v90 java.lang.String), (r41v99 java.lang.String) binds: [B:113:0x04f8, B:95:0x0447] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x057e A[PHI: r41
      0x057e: PHI (r41v92 java.lang.String) = (r41v86 java.lang.String), (r41v93 java.lang.String) binds: [B:123:0x0567, B:107:0x04bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x05f1 A[PHI: r41
      0x05f1: PHI (r41v88 java.lang.String) = (r41v82 java.lang.String), (r41v89 java.lang.String) binds: [B:131:0x05d8, B:117:0x0530] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x0625 A[PHI: r12 r41
      0x0625: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v2 java.lang.String) binds: [B:135:0x060c, B:76:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x0625: PHI (r41v108 java.lang.String) = (r41v81 java.lang.String), (r41v109 java.lang.String) binds: [B:135:0x060c, B:76:0x0391] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x02b7 A[PHI: r41
      0x02b7: PHI (r41v123 java.lang.String) = (r41v118 java.lang.String), (r41v124 java.lang.String) binds: [B:51:0x02a0, B:42:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x031d A[PHI: r41
      0x031d: PHI (r41v119 java.lang.String) = (r41v115 java.lang.String), (r41v120 java.lang.String) binds: [B:61:0x0306, B:47:0x0271] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x036e A[PHI: r41
      0x036e: PHI (r41v116 java.lang.String) = (r41v112 java.lang.String), (r41v117 java.lang.String) binds: [B:70:0x0357, B:56:0x02d0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ */
    public final void mo8146(C11273 c11273, String str) {
        int iM3169;
        int i;
        int i2;
        int i3;
        short[] sArr;
        int i4;
        int i5;
        int i6;
        int iM31610;
        int i7;
        int i8;
        int i9;
        int iM2761;
        int i10;
        int i11;
        int iM2762;
        int i12;
        int i13;
        String str2;
        int i14;
        short[] sArr2;
        int i15;
        int i16;
        short[] sArr3;
        int i17;
        int i18;
        int i19;
        int i20;
        int iM2763;
        int i21;
        int i22;
        int i23;
        short[] sArr4;
        int i24;
        int i25;
        int i26;
        String str3;
        int i27;
        int i28;
        int i29;
        int i30;
        int iM2764;
        int i31;
        int i32;
        int iM31611;
        int i33;
        int i34;
        String strM6952;
        c11273 = c11273;
        int i35 = 0;
        int i36 = 0;
        boolean z = false;
        boolean z2 = false;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int iM31612 = 0;
        int i40 = 0;
        int iM2765 = 0;
        short[] sArr5 = null;
        short s = 0;
        short s2 = 0;
        int i41 = 593070229;
        int i42 = C2287.f7432;
        int i43 = C2834.f9334;
        int iM2766 = C0619.m2761("᩺ۜ") ^ i42;
        int i44 = ((iM2766 ^ i43) * (-32407)) ^ 1321939785;
        int i45 = iM2766 ^ 143493072;
        String str4 = null;
        String strM40377 = null;
        String str5 = null;
        String strM6246 = null;
        String strM12271 = null;
        String str6 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i46 = 0;
        AbstractActivityC10144 abstractActivityC10144 = null;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int iM8879 = 0;
        boolean zM5512 = false;
        char c = 0;
        boolean z3 = false;
        int iM31613 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        Object[] objArr = null;
        C11636 c11636 = null;
        String str7 = null;
        int i58 = 0;
        while (true) {
            i41 = i45 ^ (i44 & (((i41 ^ i43) * 22031) >> 31));
            switch (i41) {
                case -2139276656:
                case 865167401:
                    i32 = i50;
                    i5 = iM31613;
                    C1564.m5518(abstractActivityC10144, i32);
                    iM2764 = (C0773.m3169("֡۬") ^ i42) * (-51);
                    i6 = i32;
                    i44 = ((iM2764 ^ i43) * (-15407)) ^ (-1792928773);
                    i31 = 939924048;
                    i45 = iM2764 ^ i31;
                    c11273 = c11273;
                    i34 = i6;
                    iM31613 = i5;
                    i46 = i46;
                    i50 = i34;
                    break;
                case -2129239069:
                case 1322608102:
                    C0862.m3503();
                    C3779.m12264();
                    iM3169 = (C0773.m3169("᩶ۚ") + i42) * (-13);
                    i = ((iM3169 ^ i43) * (-24541)) ^ (-196836541);
                    i2 = 1727644857;
                    i45 = iM3169 ^ i2;
                    i44 = i;
                    break;
                case -2108781370:
                case -662916593:
                    str6 = str6;
                    if (c11273.m28527(c11636.m29233())) {
                        iM2761 = (i42 - C0619.m2761("᩻᩵")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM2761 ^ i43) * (-21685)) ^ 303778604;
                        i11 = 1574343641;
                    } else {
                        iM2761 = (C0619.m2761("ۢۘ") ^ i42) * 83;
                        i10 = ((iM2761 ^ i43) * (-28021)) ^ (-564257322);
                        i11 = 1627740098;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -2102772210:
                case 2123709901:
                    i22 = i46;
                    str6 = str6;
                    str5 = str5;
                    i58 = i58;
                    iM31613 = iM31613;
                    i23 = i51;
                    sArr4 = sArr8;
                    i24 = i56;
                    int i59 = i57;
                    int i60 = iM31612 ^ i40;
                    sArr7 = f78715;
                    i54 = 15;
                    i55 = 3;
                    if (C1343.f4799 != 0) {
                        i50 = i60;
                        i57 = i59;
                        int iM2767 = (C0619.m2761("ۚ֨") ^ i42) * 51;
                        i44 = ((iM2767 ^ i43) * (-8677)) ^ 297002649;
                        i45 = iM2767 ^ (-25062668);
                        i51 = i23;
                        i56 = i24;
                        i46 = i22;
                        str6 = str6;
                        str5 = str5;
                        sArr8 = sArr4;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i58;
                    } else {
                        int iM2768 = (i43 - C0619.m2761("᩻᩸")) * 51;
                        i45 = iM2768 ^ (-635091075);
                        i51 = i23;
                        i44 = ((iM2768 ^ i42) * (-1817)) ^ 1054610317;
                        i56 = i24;
                        iM31613 = iM31613;
                        str6 = str6;
                        i57 = i59;
                        str5 = str5;
                        sArr8 = sArr4;
                        i58 = i58;
                        c11273 = c11273;
                        i50 = i60;
                        i46 = i22;
                    }
                    break;
                case -2047166653:
                case -1718901259:
                    String str8 = str6;
                    String str9 = str5;
                    i25 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    int i61 = i51;
                    short[] sArr10 = sArr8;
                    int i62 = i56;
                    int i63 = i57;
                    c11636 = (C11636) C3690.m11990(abstractActivityC10144.f32497, i48);
                    int i64 = c11636.m29232() ? i48 : i35;
                    int iM2769 = C0619.m2761("᩸֨") ^ i42;
                    i22 = i64;
                    i26 = ((iM2769 ^ i43) * 26493) ^ (-1188263976);
                    i45 = iM2769 ^ 620886417;
                    i51 = i61;
                    i56 = i62;
                    str6 = str8;
                    i57 = i63;
                    str5 = str9;
                    sArr8 = sArr10;
                    c11273 = c11273;
                    int i65 = i25;
                    i44 = i26;
                    i46 = i22;
                    i50 = i50;
                    iM31613 = iM31613;
                    i58 = i65;
                    break;
                case -2044014481:
                case -1487744943:
                    str6 = str6;
                    if (i46 != i47) {
                        iM2761 = C0619.m2761("֡᩸") ^ i42;
                        i10 = ((iM2761 ^ i43) * 16209) ^ 728359000;
                        i11 = 933611662;
                    } else {
                        i37 = i46;
                        iM2761 = (C0773.m3169("ᩴ۠") + i43) * (-91);
                        i10 = ((iM2761 ^ i42) * 7695) ^ 1365100457;
                        i11 = -1568153950;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -2003230085:
                case 665627713:
                    str6 = str6;
                    str5 = str5;
                    i58 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    i51 = i51;
                    sArr6 = sArr6;
                    i52 = i52;
                    i53 = i53;
                    sArr7 = sArr7;
                    i54 = i54;
                    i55 = i55;
                    sArr8 = sArr8;
                    i56 = i56;
                    i57 = i57;
                    i46 = i46;
                    sArr5 = f78715;
                    if (C3492.m11488()) {
                        iM2762 = C0619.m2761("۠ۨ") ^ i42;
                        i12 = ((iM2762 ^ i43) * (-15591)) ^ (-1061257154);
                        i13 = -1053025248;
                    } else {
                        iM2762 = (i43 - C0619.m2761("ܳ᩺")) * (-53);
                        i12 = ((iM2762 ^ i42) * 28517) ^ (-412098251);
                        i13 = -1511127682;
                    }
                    i45 = iM2762 ^ i13;
                    i52 = i52;
                    i53 = i53;
                    i56 = i56;
                    i46 = i46;
                    str6 = str6;
                    i57 = i57;
                    str5 = str5;
                    sArr8 = sArr8;
                    i55 = i55;
                    sArr7 = sArr7;
                    i54 = i54;
                    i51 = i51;
                    sArr6 = sArr6;
                    i44 = i12;
                    i50 = i50;
                    c11273 = c11273;
                    iM31613 = iM31613;
                    i58 = i58;
                    break;
                case -1990372170:
                case -1647538211:
                    int[] iArr = abstractActivityC10144.f32490;
                    int i66 = abstractActivityC10144.f32492;
                    str6 = str6;
                    abstractActivityC10144.f32492 = i66 + 1;
                    iArr[i66] = i46;
                    i39 = -1;
                    iM2761 = C0619.m2761("ۛ᩵") ^ i43;
                    i10 = ((iM2761 ^ i42) * (-681)) ^ 2109822784;
                    i11 = 2023249990;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -1927887935:
                case 688960316:
                    str6 = str6;
                    if (abstractActivityC10144.f32487) {
                        iM2761 = C0619.m2761("ۢ᩵") ^ i42;
                        i10 = ((iM2761 ^ i43) * (-22237)) ^ (-982115497);
                        i11 = 1959997927;
                    } else {
                        iM2761 = (i42 - C0619.m2761("ۜ᩶")) * 123;
                        i10 = ((iM2761 ^ i43) * 10689) ^ (-1350767917);
                        i11 = 1909239395;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -1924473512:
                case -728142760:
                    int i67 = i50;
                    i22 = i46;
                    int i68 = iM31613;
                    i50 = i67;
                    i25 = i58;
                    if (abstractActivityC10144.f32489 != i25) {
                        int iM31614 = (i43 - C0773.m3169("᩷᩺")) * 25;
                        i30 = ((iM31614 ^ i42) * (-19829)) ^ (-2055613859);
                        i45 = iM31614 ^ 1033713589;
                        i46 = i22;
                        i50 = i50;
                        iM31613 = i68;
                        i58 = i25;
                        i44 = i30;
                        c11273 = c11273;
                    } else {
                        int iM27610 = C0619.m2761("֡ۖ") ^ i43;
                        iM31613 = i68;
                        i26 = ((iM27610 ^ i42) * (-14487)) ^ 1927984626;
                        i45 = iM27610 ^ (-619124561);
                        c11273 = c11273;
                        int i69 = i25;
                        i44 = i26;
                        i46 = i22;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i69;
                    }
                    break;
                case -1819115368:
                case 2093574691:
                    i4 = i50;
                    strM12271 = C3779.m12271(abstractActivityC10144, i4);
                    if (abstractActivityC10144.f32494) {
                        int iM27611 = C0619.m2761("ۤܺ") ^ i42;
                        i46 = i46;
                        i45 = iM27611 ^ 1491274386;
                        i34 = i4;
                        i44 = ((iM27611 ^ i43) * (-23421)) ^ 105388186;
                    } else {
                        i46 = i46;
                        str6 = strM12271;
                        i5 = iM31613;
                        i6 = i4;
                        iM2764 = C0619.m2761("ۘܺ") ^ i42;
                        i44 = ((iM2764 ^ i43) * (-9553)) ^ (-1158288184);
                        i31 = -517711271;
                        i45 = iM2764 ^ i31;
                        c11273 = c11273;
                        i34 = i6;
                        iM31613 = i5;
                    }
                    i46 = i46;
                    i50 = i34;
                    break;
                case -1806571478:
                case 440043188:
                    i32 = i50;
                    i5 = iM31613;
                    C1564.m5518(abstractActivityC10144, i5);
                    iM2764 = (C0773.m3169("֡۬") ^ i42) * (-51);
                    i6 = i32;
                    i44 = ((iM2764 ^ i43) * (-15407)) ^ (-1792928773);
                    i31 = 939924048;
                    i45 = iM2764 ^ i31;
                    c11273 = c11273;
                    i34 = i6;
                    iM31613 = i5;
                    i46 = i46;
                    i50 = i34;
                    break;
                case -1742109119:
                case -402983311:
                    C2288.m7767();
                    if (C0773.f2792 > 0) {
                        str6 = str6;
                        str5 = str5;
                        i58 = i58;
                        iM31613 = iM31613;
                        i50 = i50;
                        i51 = i51;
                        sArr6 = sArr6;
                        i52 = i52;
                        i53 = i53;
                        sArr7 = sArr7;
                        i54 = i54;
                        i55 = i55;
                        sArr8 = sArr8;
                        i56 = i56;
                        i57 = i57;
                        i46 = i46;
                        iM2762 = (i43 - C0619.m2761("ܳ᩺")) * (-53);
                        i12 = ((iM2762 ^ i42) * 28517) ^ (-412098251);
                        i13 = -1511127682;
                        i45 = iM2762 ^ i13;
                        i52 = i52;
                        i53 = i53;
                        i56 = i56;
                        i46 = i46;
                        str6 = str6;
                        i57 = i57;
                        str5 = str5;
                        sArr8 = sArr8;
                        i55 = i55;
                        sArr7 = sArr7;
                        i54 = i54;
                        i51 = i51;
                        sArr6 = sArr6;
                        i44 = i12;
                        i50 = i50;
                        c11273 = c11273;
                        iM31613 = iM31613;
                        i58 = i58;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۚ") + i42) * (-13);
                        i = ((iM3169 ^ i43) * (-24541)) ^ (-196836541);
                        i2 = 1727644857;
                        i45 = iM3169 ^ i2;
                        i44 = i;
                    }
                    break;
                case -1709177751:
                case 1618172312:
                    iM8879 = C2702.m8879(abstractActivityC10144.f32497);
                    i47 = -1;
                    i48 = 0;
                    i35 = -1;
                    iM2762 = (C0773.m3169("ܺۙ") + i42) * (-111);
                    i12 = ((iM2762 ^ i43) * (-6643)) ^ (-509476494);
                    i13 = -1229463530;
                    i45 = iM2762 ^ i13;
                    i52 = i52;
                    i53 = i53;
                    i56 = i56;
                    i46 = i46;
                    str6 = str6;
                    i57 = i57;
                    str5 = str5;
                    sArr8 = sArr8;
                    i55 = i55;
                    sArr7 = sArr7;
                    i54 = i54;
                    i51 = i51;
                    sArr6 = sArr6;
                    i44 = i12;
                    i50 = i50;
                    c11273 = c11273;
                    iM31613 = iM31613;
                    i58 = i58;
                    break;
                case -1692794803:
                case -631113016:
                    i4 = i50;
                    i46 = i46;
                    if (!abstractActivityC10144.f32494) {
                        str6 = str4;
                        i5 = iM31613;
                        i6 = i4;
                        iM2764 = C0619.m2761("ۘܺ") ^ i42;
                        i44 = ((iM2764 ^ i43) * (-9553)) ^ (-1158288184);
                        i31 = -517711271;
                        i45 = iM2764 ^ i31;
                        c11273 = c11273;
                        i34 = i6;
                        iM31613 = i5;
                        i46 = i46;
                        i50 = i34;
                    } else {
                        iM31610 = C0773.m3169("᩶ܶ") ^ i43;
                        i = ((iM31610 ^ i42) * 14879) ^ 1702732751;
                        i7 = 2111992317;
                        i45 = iM31610 ^ i7;
                        i46 = i46;
                        i50 = i4;
                        i44 = i;
                    }
                    break;
                case -1680164338:
                case -117626538:
                    if (C23916.f77426 > 0) {
                        str6 = str6;
                        str3 = str5;
                        i25 = i58;
                        iM31613 = iM31613;
                        i50 = i50;
                        i27 = i51;
                        i28 = i57;
                        i29 = i46;
                        int iM27612 = (i42 - C0619.m2761("֨ۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i10 = ((iM27612 ^ i43) * (-8759)) ^ (-1740525520);
                        i45 = iM27612 ^ 190942526;
                        i51 = i27;
                        i46 = i29;
                        i57 = i28;
                        str5 = str3;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i25;
                        i44 = i10;
                        str6 = str6;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۚ") + i42) * (-13);
                        i = ((iM3169 ^ i43) * (-24541)) ^ (-196836541);
                        i2 = 1727644857;
                        i45 = iM3169 ^ i2;
                        i44 = i;
                    }
                    break;
                case -1581174095:
                case 1841392638:
                    str6 = str6;
                    str5 = str5;
                    i58 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    i3 = i51;
                    i52 = i52;
                    i53 = i53;
                    sArr7 = sArr7;
                    i54 = i54;
                    i55 = i55;
                    sArr8 = sArr8;
                    i56 = i56;
                    i57 = i57;
                    i46 = i46;
                    sArr = sArr6;
                    iM31612 = C0773.m3169(C3077.m10047(sArr, i52, i53, i3));
                    i40 = 2100921644;
                    if (C0862.f3233 == 0) {
                        sArr6 = sArr;
                        iM2762 = C0773.m3169("᩶۠") ^ i42;
                        i51 = i3;
                        i12 = ((iM2762 ^ i43) * 14583) ^ (-1832943178);
                        i13 = 46045997;
                        i45 = iM2762 ^ i13;
                        i52 = i52;
                        i53 = i53;
                        i56 = i56;
                        i46 = i46;
                        str6 = str6;
                        i57 = i57;
                        str5 = str5;
                        sArr8 = sArr8;
                        i55 = i55;
                        sArr7 = sArr7;
                        i54 = i54;
                        i51 = i51;
                        sArr6 = sArr6;
                        i44 = i12;
                        i50 = i50;
                        c11273 = c11273;
                        iM31613 = iM31613;
                        i58 = i58;
                    }
                    int iM27613 = (i42 - C0619.m2761("ۤᩳ")) * 63;
                    short[] sArr11 = sArr;
                    i20 = ((iM27613 ^ i43) * (-8077)) ^ (-777522267);
                    i45 = iM27613 ^ (-1018452268);
                    i51 = i3;
                    i52 = i52;
                    i53 = i53;
                    i56 = i56;
                    str6 = str6;
                    i57 = i57;
                    str5 = str5;
                    sArr8 = sArr8;
                    i55 = i55;
                    sArr7 = sArr7;
                    i54 = i54;
                    sArr6 = sArr11;
                    i44 = i20;
                    i46 = i46;
                    i50 = i50;
                    iM31613 = iM31613;
                    i58 = i58;
                    break;
                case -1578890447:
                case -1281105397:
                    i48++;
                    i35 = i36;
                    iM2762 = (C0773.m3169("ܺۙ") + i42) * (-111);
                    i12 = ((iM2762 ^ i43) * (-6643)) ^ (-509476494);
                    i13 = -1229463530;
                    i45 = iM2762 ^ i13;
                    i52 = i52;
                    i53 = i53;
                    i56 = i56;
                    i46 = i46;
                    str6 = str6;
                    i57 = i57;
                    str5 = str5;
                    sArr8 = sArr8;
                    i55 = i55;
                    sArr7 = sArr7;
                    i54 = i54;
                    i51 = i51;
                    sArr6 = sArr6;
                    i44 = i12;
                    i50 = i50;
                    c11273 = c11273;
                    iM31613 = iM31613;
                    i58 = i58;
                    break;
                case -1555728374:
                case 1572309769:
                    i25 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    i22 = i46;
                    str6 = str6;
                    int i70 = i51;
                    short[] sArr12 = sArr9;
                    int i71 = i57;
                    int iM27614 = C0619.m2761(C17202.m40377(sArr12, i71, 3, i70)) ^ 2120978243;
                    if (!z3) {
                        int iM31615 = C0773.m3169("۠ۗ") ^ i42;
                        i26 = ((iM31615 ^ i43) * 9801) ^ 666228021;
                        i45 = iM31615 ^ 713642410;
                        i51 = i70;
                        i57 = i71;
                        sArr9 = sArr12;
                        str6 = str6;
                        i49 = iM27614;
                        c11273 = c11273;
                        int i610 = i25;
                        i44 = i26;
                        i46 = i22;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i610;
                    } else {
                        int iM31616 = (C0773.m3169("ܿᩴ") + i43) * 57;
                        i10 = ((iM31616 ^ i42) * 30307) ^ 819560091;
                        i45 = iM31616 ^ (-603347515);
                        i51 = i70;
                        sArr9 = sArr12;
                        i46 = i22;
                        i57 = i71;
                        i49 = iM27614;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i25;
                        i44 = i10;
                        str6 = str6;
                    }
                    break;
                case -1525326424:
                case -1365268555:
                    int i72 = i50;
                    i46 = i46;
                    i5 = iM31613;
                    i6 = i72;
                    str5 = c11636.f36482;
                    if (this.f78720) {
                        iM2764 = C0619.m2761("ۤܽ") ^ i42;
                        i44 = ((iM2764 ^ i43) * (-30599)) ^ 1247952245;
                        i31 = -1816396611;
                    } else {
                        iM2764 = (C0773.m3169("֡᩵") ^ i43) * 109;
                        i44 = ((iM2764 ^ i42) * (-20693)) ^ (-186556620);
                        i31 = 1047146496;
                    }
                    i45 = iM2764 ^ i31;
                    c11273 = c11273;
                    i34 = i6;
                    iM31613 = i5;
                    i46 = i46;
                    i50 = i34;
                    break;
                case -1490320044:
                case -1008091266:
                    str6 = str6;
                    str5 = str5;
                    i58 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    i51 = i51;
                    sArr6 = sArr6;
                    i52 = i52;
                    i53 = i53;
                    sArr7 = sArr7;
                    i54 = i54;
                    i55 = i55;
                    sArr8 = sArr8;
                    i56 = i56;
                    i57 = i57;
                    i46 = i46;
                    int i73 = iM8879;
                    if (i48 >= i73) {
                        iM8879 = i73;
                        iM2762 = (C0619.m2761("۟᩸") ^ i43) * (-29);
                        i12 = ((iM2762 ^ i42) * 20069) ^ 1809307645;
                        i13 = 2070491171;
                        i45 = iM2762 ^ i13;
                        i52 = i52;
                        i53 = i53;
                        i56 = i56;
                        i46 = i46;
                        str6 = str6;
                        i57 = i57;
                        str5 = str5;
                        sArr8 = sArr8;
                        i55 = i55;
                        sArr7 = sArr7;
                        i54 = i54;
                        i51 = i51;
                        sArr6 = sArr6;
                        i44 = i12;
                        i50 = i50;
                        c11273 = c11273;
                        iM31613 = iM31613;
                        i58 = i58;
                    } else {
                        int iM27615 = C0619.m2761("᩹֨") ^ i42;
                        iM8879 = i73;
                        i20 = ((iM27615 ^ i43) * 1073) ^ 963094272;
                        i45 = iM27615 ^ 99488517;
                        i52 = i52;
                        i53 = i53;
                        i56 = i56;
                        str6 = str6;
                        i57 = i57;
                        str5 = str5;
                        sArr8 = sArr8;
                        i55 = i55;
                        sArr7 = sArr7;
                        i54 = i54;
                        i51 = i51;
                        sArr6 = sArr6;
                        i44 = i20;
                        i46 = i46;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i58;
                    }
                    break;
                case -1475187049:
                case 210113648:
                    str6 = str6;
                    i25 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    i23 = i51;
                    i22 = i46;
                    strM40377 = C17202.m40377(f78715, 21, 3, i23);
                    sArr9 = f78715;
                    i57 = 24;
                    if (!RunnableC0334.m2063()) {
                        int iM27616 = C0619.m2761("ܰۖ") ^ i42;
                        i10 = ((iM27616 ^ i43) * 5665) ^ 503675740;
                        i45 = iM27616 ^ 592577445;
                        i51 = i23;
                        i46 = i22;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i25;
                        i44 = i10;
                        str6 = str6;
                    } else {
                        i58 = i25;
                        sArr4 = sArr8;
                        i24 = i56;
                        int iM27617 = (C0619.m2761("ۚ֨") ^ i42) * 51;
                        i44 = ((iM27617 ^ i43) * (-8677)) ^ 297002649;
                        i45 = iM27617 ^ (-25062668);
                        i51 = i23;
                        i56 = i24;
                        i46 = i22;
                        str6 = str6;
                        str5 = str5;
                        sArr8 = sArr4;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i58;
                    }
                    break;
                case -1432480684:
                case -1265463169:
                    int i74 = i50;
                    i46 = i46;
                    i5 = iM31613;
                    i6 = i74;
                    strM6246 = C1783.m6246(abstractActivityC10144, i5);
                    if (abstractActivityC10144.f32494) {
                        iM2764 = C0619.m2761("᩶ܳ") ^ i43;
                        i44 = ((iM2764 ^ i42) * 4663) ^ 1303570756;
                        i31 = 779686338;
                    } else {
                        str6 = strM6246;
                        iM2764 = C0619.m2761("ۘܺ") ^ i42;
                        i44 = ((iM2764 ^ i43) * (-9553)) ^ (-1158288184);
                        i31 = -517711271;
                    }
                    i45 = iM2764 ^ i31;
                    c11273 = c11273;
                    i34 = i6;
                    iM31613 = i5;
                    i46 = i46;
                    i50 = i34;
                    break;
                case -1407859929:
                case -386120700:
                    str6 = str6;
                    z4 = !z5;
                    iM2761 = C0773.m3169("ᩳ۟") ^ i42;
                    i10 = ((iM2761 ^ i43) * 3725) ^ 1883362483;
                    i11 = 1429427613;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -1395101274:
                case 2109016591:
                    str6 = str6;
                    if (abstractActivityC10144.f32494) {
                        iM2761 = C0773.m3169("᩸۠") ^ i42;
                        i10 = ((iM2761 ^ i43) * (-28295)) ^ (-1965080765);
                        i11 = -1735936832;
                    } else {
                        z6 = z7;
                        iM2761 = C0619.m2761("ܿ۫") ^ i43;
                        i10 = ((iM2761 ^ i42) * (-29839)) ^ 1768960976;
                        i11 = 550820224;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -1354559962:
                case 455681953:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("ۗۤ") + i43) * (-43);
                        i = ((iM3169 ^ i42) * (-12333)) ^ 1378299240;
                        i2 = 1233339952;
                        i45 = iM3169 ^ i2;
                        i44 = i;
                    } else {
                        str6 = str6;
                        str5 = str5;
                        i58 = i58;
                        iM31613 = iM31613;
                        i50 = i50;
                        i51 = i51;
                        sArr6 = sArr6;
                        i52 = i52;
                        i53 = i53;
                        sArr7 = sArr7;
                        i54 = i54;
                        i55 = i55;
                        sArr8 = sArr8;
                        i56 = i56;
                        i57 = i57;
                        i46 = i46;
                        iM2762 = (i43 - C0619.m2761("ܳ᩺")) * (-53);
                        i12 = ((iM2762 ^ i42) * 28517) ^ (-412098251);
                        i13 = -1511127682;
                        i45 = iM2762 ^ i13;
                        i52 = i52;
                        i53 = i53;
                        i56 = i56;
                        i46 = i46;
                        str6 = str6;
                        i57 = i57;
                        str5 = str5;
                        sArr8 = sArr8;
                        i55 = i55;
                        sArr7 = sArr7;
                        i54 = i54;
                        i51 = i51;
                        sArr6 = sArr6;
                        i44 = i12;
                        i50 = i50;
                        c11273 = c11273;
                        iM31613 = iM31613;
                        i58 = i58;
                    }
                    break;
                case -1297560459:
                case 1682430083:
                    str6 = str6;
                    str2 = str5;
                    iM31613 = iM31613;
                    i50 = i50;
                    i14 = i51;
                    short[] sArr13 = sArr6;
                    int i75 = i52;
                    int i76 = i53;
                    sArr2 = sArr7;
                    i15 = i54;
                    i16 = i55;
                    sArr3 = sArr8;
                    i17 = i56;
                    i18 = i57;
                    i19 = i46;
                    abstractActivityC10144 = this.f78717;
                    abstractActivityC10144.f32504 = true;
                    abstractActivityC10144.f32492 = 0;
                    if (C23916.f77426 <= 0) {
                        i52 = i75;
                        i53 = i76;
                        sArr6 = sArr13;
                        c = 0;
                        i58 = 1;
                        iM2763 = (C0619.m2761("ۘᩴ") ^ i42) * (-73);
                        i44 = (-1605907470) ^ ((iM2763 ^ i43) * 18711);
                        i21 = 1652146722;
                        i45 = iM2763 ^ i21;
                        c11273 = c11273;
                        i56 = i17;
                        i46 = i19;
                        str6 = str6;
                        i57 = i18;
                        str5 = str2;
                        sArr8 = sArr3;
                        i55 = i16;
                        sArr7 = sArr2;
                        i54 = i15;
                        i51 = i14;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i58;
                    } else {
                        int iM27618 = (C0619.m2761("֨۫") ^ i42) * 11;
                        int i77 = ((iM27618 ^ i43) * 9827) ^ 2052578763;
                        i45 = iM27618 ^ 450805575;
                        c11273 = c11273;
                        i52 = i75;
                        i53 = i76;
                        i56 = i17;
                        str6 = str6;
                        i57 = i18;
                        str5 = str2;
                        sArr8 = sArr3;
                        i55 = i16;
                        sArr7 = sArr2;
                        i54 = i15;
                        i51 = i14;
                        sArr6 = sArr13;
                        c = 0;
                        i44 = i77;
                        i46 = i19;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = 1;
                    }
                    break;
                case -1287417559:
                case 1334201827:
                    str6 = str6;
                    if (abstractActivityC10144.f32494) {
                        iM2761 = C0619.m2761("ܽ᩻") ^ i42;
                        i10 = ((iM2761 ^ i43) * 7431) ^ 1529478080;
                        i11 = -1310527871;
                    } else {
                        z = z2;
                        iM2761 = C0619.m2761("۬֨") ^ i43;
                        i10 = ((iM2761 ^ i42) * 28117) ^ 1590824138;
                        i11 = -1320199368;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -1213030800:
                case 1781878182:
                    str6 = str6;
                    if (i46 != i48) {
                        iM2761 = (i42 - C0773.m3169("ۙ᩷")) * (-127);
                        i10 = ((iM2761 ^ i43) * (-5421)) ^ 2033528036;
                        i11 = 1804089986;
                    } else {
                        i37 = i46;
                        iM2761 = (C0773.m3169("ᩴ۠") + i43) * (-91);
                        i10 = ((iM2761 ^ i42) * 7695) ^ 1365100457;
                        i11 = -1568153950;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -1201803301:
                case 1594817456:
                    int[] iArr2 = abstractActivityC10144.f32490;
                    int i78 = abstractActivityC10144.f32492;
                    abstractActivityC10144.f32492 = i78 + 1;
                    iArr2[i78] = i48;
                    i36 = i38;
                    i4 = i50;
                    str6 = str6;
                    i46 = i46;
                    iM31610 = C0773.m3169("᩺۬") ^ i43;
                    i = ((iM31610 ^ i42) * (-21903)) ^ 1456972801;
                    i7 = -51811223;
                    i45 = iM31610 ^ i7;
                    i46 = i46;
                    i50 = i4;
                    i44 = i;
                    break;
                case -1181228788:
                case 1830925198:
                    int[] iArr3 = abstractActivityC10144.f32490;
                    int i79 = abstractActivityC10144.f32492;
                    abstractActivityC10144.f32492 = i79 + 1;
                    iArr3[i79] = i48;
                    i36 = i37;
                    i4 = i50;
                    str6 = str6;
                    i46 = i46;
                    iM31610 = C0773.m3169("᩺۬") ^ i43;
                    i = ((iM31610 ^ i42) * (-21903)) ^ 1456972801;
                    i7 = -51811223;
                    i45 = iM31610 ^ i7;
                    i46 = i46;
                    i50 = i4;
                    i44 = i;
                    break;
                case -1161030090:
                case 1672838484:
                    z2 = true;
                    iM2761 = (i43 - C0619.m2761("ܶ۠")) * 55;
                    i10 = ((iM2761 ^ i42) * 14737) ^ (-1326790823);
                    i11 = 1193460489;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -1009962535:
                case 1936381289:
                    str6 = str6;
                    if (i46 != i47) {
                        iM2761 = C0619.m2761("ۖܽ") ^ i43;
                        i10 = ((iM2761 ^ i42) * (-24393)) ^ 598038219;
                        i11 = -1767432040;
                    } else {
                        i39 = i46;
                        iM2761 = C0619.m2761("ۛ᩵") ^ i43;
                        i10 = ((iM2761 ^ i42) * (-681)) ^ 2109822784;
                        i11 = 2023249990;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -967209560:
                case 1370168049:
                    str6 = str6;
                    if (c11273 != null) {
                        iM2761 = (C0619.m2761("ۨۛ") ^ i43) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((iM2761 ^ i42) * 13319) ^ (-866251373);
                        i11 = -1178939661;
                    } else {
                        iM2761 = C0773.m3169("ۨۤ") ^ i43;
                        i10 = ((iM2761 ^ i42) * 4301) ^ 654791619;
                        i11 = -175800550;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -911536010:
                case -91961108:
                    if (C1519.f5300 < 0) {
                        str6 = str6;
                        str2 = str5;
                        i58 = i58;
                        iM31613 = iM31613;
                        i50 = i50;
                        i14 = i51;
                        sArr2 = sArr7;
                        i15 = i54;
                        i16 = i55;
                        sArr3 = sArr8;
                        i17 = i56;
                        i18 = i57;
                        i19 = i46;
                        iM2763 = (C0619.m2761("ۘᩴ") ^ i42) * (-73);
                        i44 = (-1605907470) ^ ((iM2763 ^ i43) * 18711);
                        i21 = 1652146722;
                        i45 = iM2763 ^ i21;
                        c11273 = c11273;
                        i56 = i17;
                        i46 = i19;
                        str6 = str6;
                        i57 = i18;
                        str5 = str2;
                        sArr8 = sArr3;
                        i55 = i16;
                        sArr7 = sArr2;
                        i54 = i15;
                        i51 = i14;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i58;
                    } else {
                        str6 = str6;
                        str3 = str5;
                        i25 = i58;
                        iM31613 = iM31613;
                        i50 = i50;
                        i27 = i51;
                        i28 = i57;
                        i29 = i46;
                        int iM27619 = (i42 - C0619.m2761("֨ۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i10 = ((iM27619 ^ i43) * (-8759)) ^ (-1740525520);
                        i45 = iM27619 ^ 190942526;
                        i51 = i27;
                        i46 = i29;
                        i57 = i28;
                        str5 = str3;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i25;
                        i44 = i10;
                        str6 = str6;
                    }
                    break;
                case -910621669:
                case 1130643754:
                    abstractActivityC10144.f32491 = str4;
                    iM3169 = (i43 - C0773.m3169("֫ۤ")) * 67;
                    i = ((iM3169 ^ i42) * 9619) ^ (-1593399699);
                    i2 = 791601621;
                    i45 = iM3169 ^ i2;
                    i44 = i;
                    break;
                case -896285318:
                case 698459429:
                    z7 = false;
                    iM2761 = (i42 - C0619.m2761("ۤᩴ")) * 115;
                    i10 = ((iM2761 ^ i43) * 1373) ^ (-865805738);
                    i11 = 652760957;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -840223446:
                case -483867702:
                    str6 = str6;
                    i25 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    i23 = i51;
                    int i80 = i57;
                    i22 = i46;
                    Object[] objArr2 = objArr;
                    abstractActivityC10144.setTitle(C2485.m8354(abstractActivityC10144, iM2765 ^ 2126889037, objArr2));
                    boolean z8 = this.f78720;
                    if (C1564.f5401 > 0) {
                        int iM31617 = (C0773.m3169("᩶ۡ") ^ i42) * 101;
                        z3 = z8;
                        i26 = ((iM31617 ^ i43) * 9023) ^ 1333703201;
                        i45 = iM31617 ^ 540494077;
                        i51 = i23;
                        objArr = objArr2;
                        str6 = str6;
                        i57 = i80;
                        c11273 = c11273;
                        int i611 = i25;
                        i44 = i26;
                        i46 = i22;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i611;
                    } else {
                        z3 = z8;
                        i58 = i25;
                        objArr = objArr2;
                        i57 = i80;
                        sArr4 = sArr8;
                        i24 = i56;
                        int iM276110 = (C0619.m2761("ۚ֨") ^ i42) * 51;
                        i44 = ((iM276110 ^ i43) * (-8677)) ^ 297002649;
                        i45 = iM276110 ^ (-25062668);
                        i51 = i23;
                        i56 = i24;
                        i46 = i22;
                        str6 = str6;
                        str5 = str5;
                        sArr8 = sArr4;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i58;
                    }
                    break;
                case -718802600:
                case -396907654:
                    str6 = str6;
                    if (!z4) {
                        i4 = i50;
                        str6 = str6;
                        i46 = i46;
                        i36 = i46;
                        iM31610 = C0773.m3169("᩺۬") ^ i43;
                        i = ((iM31610 ^ i42) * (-21903)) ^ 1456972801;
                        i7 = -51811223;
                        i45 = iM31610 ^ i7;
                        i46 = i46;
                        i50 = i4;
                        i44 = i;
                    } else {
                        iM2761 = (C0619.m2761("֫ۗ") + i43) * 63;
                        i10 = ((iM2761 ^ i42) * 6215) ^ (-1260923963);
                        i11 = 604142325;
                        i45 = iM2761 ^ i11;
                        i44 = i10;
                        str6 = str6;
                    }
                    break;
                case -710250244:
                case 1634736919:
                    z5 = true;
                    iM2761 = C0619.m2761("ۜۨ") ^ i43;
                    i10 = ((iM2761 ^ i42) * 2903) ^ (-1864061059);
                    i11 = 2095062727;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -666629446:
                case 479384032:
                    z7 = true;
                    iM2761 = (i42 - C0619.m2761("ۤᩴ")) * 115;
                    i10 = ((iM2761 ^ i43) * 1373) ^ (-865805738);
                    i11 = 652760957;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -655079347:
                case 577984634:
                    StringBuilder sbM10405 = C3188.m10405(strM12271, strM40377);
                    C1783.m6234(sbM10405, C1783.m6246(abstractActivityC10144, i49));
                    strM6952 = C1080.m4058(sbM10405);
                    str6 = strM6952;
                    int i81 = i50;
                    i46 = i46;
                    i5 = iM31613;
                    i6 = i81;
                    iM2764 = C0619.m2761("ۘܺ") ^ i42;
                    i44 = ((iM2764 ^ i43) * (-9553)) ^ (-1158288184);
                    i31 = -517711271;
                    i45 = iM2764 ^ i31;
                    c11273 = c11273;
                    i34 = i6;
                    iM31613 = i5;
                    i46 = i46;
                    i50 = i34;
                    break;
                case -640402408:
                case 330088045:
                    i8 = i50;
                    i9 = i46;
                    if (this.f78719) {
                        iM31611 = C0773.m3169("᩻᩶") ^ i43;
                        i30 = ((iM31611 ^ i42) * 1603) ^ (-775279877);
                        i33 = -1034143414;
                    } else {
                        iM31611 = (i42 - C0619.m2761("ۘܰ")) * (-15);
                        i30 = ((iM31611 ^ i43) * (-23253)) ^ (-1983800441);
                        i33 = 936365426;
                    }
                    i45 = iM31611 ^ i33;
                    i46 = i9;
                    i50 = i8;
                    i44 = i30;
                    c11273 = c11273;
                    break;
                case -638693777:
                case 1479810358:
                    str6 = str6;
                    if (i46 != i48) {
                        iM2761 = (C0619.m2761("֨ᩴ") + i43) * 21;
                        i10 = ((iM2761 ^ i42) * (-27277)) ^ 1765111572;
                        i11 = 138486650;
                    } else {
                        i39 = i46;
                        iM2761 = C0619.m2761("ۛ᩵") ^ i43;
                        i10 = ((iM2761 ^ i42) * (-681)) ^ 2109822784;
                        i11 = 2023249990;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -621615080:
                case 545628008:
                    i51 = 52993;
                    int iM31618 = (C0773.m3169("᩶ۧ") ^ i43) * 79;
                    i12 = ((iM31618 ^ i42) * (-27429)) ^ (-224749900);
                    i45 = iM31618 ^ 474337260;
                    i52 = i52;
                    i53 = i53;
                    i56 = i56;
                    i46 = i46;
                    str6 = str6;
                    i57 = i57;
                    str5 = str5;
                    sArr8 = sArr8;
                    i55 = i55;
                    sArr7 = sArr7;
                    i54 = i54;
                    sArr6 = sArr6;
                    i44 = i12;
                    i50 = i50;
                    c11273 = c11273;
                    iM31613 = iM31613;
                    i58 = i58;
                    break;
                case -474922923:
                case 1189049938:
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("ۖܰ") ^ i43;
                        i = ((iM3169 ^ i42) * 17161) ^ 276211521;
                        i2 = -1244813786;
                    } else {
                        iM3169 = (i42 - C0619.m2761("ܰۛ")) * (-35);
                        i = ((iM3169 ^ i43) * (-23385)) ^ 548111800;
                        i2 = 771217604;
                    }
                    i45 = iM3169 ^ i2;
                    i44 = i;
                    break;
                case -459002299:
                case 1188931200:
                    str6 = str6;
                    if (c11273.m28527(str5)) {
                        iM2761 = C0773.m3169("ۨۤ") ^ i43;
                        i10 = ((iM2761 ^ i42) * 4301) ^ 654791619;
                        i11 = -175800550;
                    } else {
                        iM2761 = C0773.m3169("᩷۠") ^ i42;
                        i10 = ((iM2761 ^ i43) * 24345) ^ (-1947523351);
                        i11 = -1540380051;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -426824273:
                case -404773402:
                    z5 = false;
                    iM2761 = C0619.m2761("ۜۨ") ^ i43;
                    i10 = ((iM2761 ^ i42) * 2903) ^ (-1864061059);
                    i11 = 2095062727;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -312520868:
                case -251294022:
                    str6 = str6;
                    i25 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    int i82 = i51;
                    i18 = i57;
                    i19 = i46;
                    str2 = str5;
                    short[] sArr14 = sArr8;
                    i17 = i56;
                    iM2765 = C0619.m2761(AbstractC3624.m11769(sArr14, i17, 3, i82));
                    if (C1080.f3865 < 0) {
                        int iM27620 = C0619.m2761("ᩳۜ") ^ i43;
                        i10 = ((iM27620 ^ i42) * 2121) ^ 617720688;
                        i45 = iM27620 ^ (-1402843949);
                        i51 = i82;
                        i56 = i17;
                        i46 = i19;
                        i57 = i18;
                        str5 = str2;
                        sArr8 = sArr14;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i25;
                        i44 = i10;
                        str6 = str6;
                    } else {
                        i14 = i82;
                        i58 = i25;
                        sArr3 = sArr14;
                        sArr2 = sArr7;
                        i15 = i54;
                        i16 = i55;
                        iM2763 = (C0619.m2761("ۘᩴ") ^ i42) * (-73);
                        i44 = (-1605907470) ^ ((iM2763 ^ i43) * 18711);
                        i21 = 1652146722;
                        i45 = iM2763 ^ i21;
                        c11273 = c11273;
                        i56 = i17;
                        i46 = i19;
                        str6 = str6;
                        i57 = i18;
                        str5 = str2;
                        sArr8 = sArr3;
                        i55 = i16;
                        sArr7 = sArr2;
                        i54 = i15;
                        i51 = i14;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i58;
                    }
                    break;
                case -281793872:
                case -80599591:
                    abstractActivityC10144.f32495 = -1;
                    abstractActivityC10144.f32501.notifyDataSetChanged();
                    abstractActivityC10144.m26255();
                    break;
                case -188465091:
                case 350698548:
                    str6 = str6;
                    if (c11273 != null) {
                        iM2761 = (C0773.m3169("᩹۠") ^ i43) * (-9);
                        i10 = ((iM2761 ^ i42) * (-957)) ^ (-1182220767);
                        i11 = -1272024521;
                    } else {
                        iM2761 = (i42 - C0619.m2761("᩻᩵")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM2761 ^ i43) * (-21685)) ^ 303778604;
                        i11 = 1574343641;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -164802018:
                case 133951658:
                    i51 = 56781;
                    int iM31619 = (C0773.m3169("᩶ۧ") ^ i43) * 79;
                    i12 = ((iM31619 ^ i42) * (-27429)) ^ (-224749900);
                    i45 = iM31619 ^ 474337260;
                    i52 = i52;
                    i53 = i53;
                    i56 = i56;
                    i46 = i46;
                    str6 = str6;
                    i57 = i57;
                    str5 = str5;
                    sArr8 = sArr8;
                    i55 = i55;
                    sArr7 = sArr7;
                    i54 = i54;
                    sArr6 = sArr6;
                    i44 = i12;
                    i50 = i50;
                    c11273 = c11273;
                    iM31613 = iM31613;
                    i58 = i58;
                    break;
                case -81091914:
                case 2051670432:
                    str6 = str6;
                    str7 = c11636.f36488;
                    if (str7 != null) {
                        iM2761 = (C0619.m2761("֨ܿ") + i42) * 69;
                        i10 = ((iM2761 ^ i43) * 19123) ^ (-628391795);
                        i11 = -860882825;
                    } else {
                        iM2761 = (i43 - C0619.m2761("᩵ܿ")) * (-121);
                        i10 = ((iM2761 ^ i42) * (-17637)) ^ (-608610561);
                        i11 = -1936102628;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case -64980908:
                case 2083435519:
                    i4 = i50;
                    i46 = i46;
                    if (str5 == null) {
                        i5 = iM31613;
                        i6 = i4;
                        iM2764 = C0619.m2761("ۤܽ") ^ i42;
                        i44 = ((iM2764 ^ i43) * (-30599)) ^ 1247952245;
                        i31 = -1816396611;
                        i45 = iM2764 ^ i31;
                        c11273 = c11273;
                        i34 = i6;
                        iM31613 = i5;
                        i46 = i46;
                        i50 = i34;
                    } else {
                        i36 = i46;
                        iM31610 = C0773.m3169("᩺۬") ^ i43;
                        i = ((iM31610 ^ i42) * (-21903)) ^ 1456972801;
                        i7 = -51811223;
                        i45 = iM31610 ^ i7;
                        i46 = i46;
                        i50 = i4;
                        i44 = i;
                    }
                    break;
                case -33148204:
                case 1497693335:
                    str6 = str6;
                    if (!z) {
                        i4 = i50;
                        str6 = str6;
                        i46 = i46;
                        i36 = i46;
                        iM31610 = C0773.m3169("᩺۬") ^ i43;
                        i = ((iM31610 ^ i42) * (-21903)) ^ 1456972801;
                        i7 = -51811223;
                        i45 = iM31610 ^ i7;
                        i46 = i46;
                        i50 = i4;
                        i44 = i;
                    } else {
                        iM2761 = C0619.m2761("ۚۖ") ^ i43;
                        i10 = ((iM2761 ^ i42) * (-7309)) ^ (-688152209);
                        i11 = -1937481931;
                        i45 = iM2761 ^ i11;
                        i44 = i10;
                        str6 = str6;
                    }
                    break;
                case -13765633:
                case 2074658616:
                    int i83 = i50;
                    i46 = i46;
                    i5 = iM31613;
                    i6 = i83;
                    if (this.f78719) {
                        iM2764 = (C0619.m2761("۠۟") ^ i42) * (-45);
                        i44 = ((iM2764 ^ i43) * (-31917)) ^ 826660691;
                        i31 = -1584838390;
                    } else {
                        iM2764 = C0619.m2761("۬۬") ^ i43;
                        i44 = ((iM2764 ^ i42) * (-28671)) ^ (-1396445982);
                        i31 = -589567800;
                    }
                    i45 = iM2764 ^ i31;
                    c11273 = c11273;
                    i34 = i6;
                    iM31613 = i5;
                    i46 = i46;
                    i50 = i34;
                    break;
                case 42072121:
                case 287518612:
                    String str10 = str6;
                    String str11 = str5;
                    i58 = i58;
                    i50 = i50;
                    int i84 = i51;
                    int i85 = i54;
                    int i86 = i55;
                    short[] sArr15 = sArr8;
                    int i87 = i56;
                    int i88 = i57;
                    i46 = i46;
                    short[] sArr16 = sArr7;
                    iM31613 = C0773.m3169(C3998.m12925(sArr16, i85, i86, i84)) ^ 2098167733;
                    if (!zM5512) {
                        int iM27621 = C0619.m2761("۟ۘ") ^ i43;
                        i44 = ((iM27621 ^ i42) * 21597) ^ 1205935012;
                        i45 = iM27621 ^ 780174212;
                        i51 = i84;
                        i54 = i85;
                        i56 = i87;
                        i46 = i46;
                        str6 = str10;
                        i57 = i88;
                        str5 = str11;
                        sArr8 = sArr15;
                        i55 = i86;
                        sArr7 = sArr16;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i58;
                    } else {
                        int iM31620 = (C0773.m3169("ۢۢ") + i43) * (-117);
                        i20 = ((iM31620 ^ i42) * (-4915)) ^ (-1100091099);
                        i45 = iM31620 ^ 1336009704;
                        i51 = i84;
                        i55 = i86;
                        i54 = i85;
                        i56 = i87;
                        str6 = str10;
                        i57 = i88;
                        str5 = str11;
                        sArr8 = sArr15;
                        sArr7 = sArr16;
                        i44 = i20;
                        i46 = i46;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i58;
                    }
                    break;
                case 60421031:
                case 838175318:
                    str6 = str6;
                    z = !z2;
                    iM2761 = C0619.m2761("۬֨") ^ i43;
                    i10 = ((iM2761 ^ i42) * 28117) ^ 1590824138;
                    i11 = -1320199368;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 187256534:
                case 1233462968:
                    str6 = str6;
                    if (str5 == null) {
                        i4 = i50;
                        str6 = str6;
                        i46 = i46;
                        i36 = i46;
                        iM31610 = C0773.m3169("᩺۬") ^ i43;
                        i = ((iM31610 ^ i42) * (-21903)) ^ 1456972801;
                        i7 = -51811223;
                        i45 = iM31610 ^ i7;
                        i46 = i46;
                        i50 = i4;
                        i44 = i;
                    } else {
                        iM2761 = (C0619.m2761("ܿۨ") + i43) * 37;
                        i10 = ((iM2761 ^ i42) * 18853) ^ (-1912922883);
                        i11 = 610510636;
                        i45 = iM2761 ^ i11;
                        i44 = i10;
                        str6 = str6;
                    }
                    break;
                case 385204681:
                case 936444780:
                    int[] iArr4 = abstractActivityC10144.f32490;
                    int i89 = abstractActivityC10144.f32492;
                    abstractActivityC10144.f32492 = i89 + 1;
                    iArr4[i89] = i48;
                    i36 = i39;
                    i4 = i50;
                    str6 = str6;
                    i46 = i46;
                    iM31610 = C0773.m3169("᩺۬") ^ i43;
                    i = ((iM31610 ^ i42) * (-21903)) ^ 1456972801;
                    i7 = -51811223;
                    i45 = iM31610 ^ i7;
                    i46 = i46;
                    i50 = i4;
                    i44 = i;
                    break;
                case 396298768:
                case 1708901398:
                    str6 = str6;
                    if (i46 != i47) {
                        iM2761 = C0619.m2761("ܺ֡") ^ i42;
                        i10 = ((iM2761 ^ i43) * 15645) ^ 1264639181;
                        i11 = -302430029;
                    } else {
                        i38 = i46;
                        iM2761 = C0773.m3169("ܺۘ") ^ i43;
                        i10 = ((iM2761 ^ i42) * 29123) ^ 719673150;
                        i11 = -149635883;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 408632334:
                case 2050706008:
                    C3448.m11248();
                    C2878.m9491();
                    break;
                case 412291489:
                case 982256203:
                    str6 = str6;
                    z6 = !z7;
                    iM2761 = C0619.m2761("ܿ۫") ^ i43;
                    i10 = ((iM2761 ^ i42) * (-29839)) ^ 1768960976;
                    i11 = 550820224;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 514635894:
                case 1093361185:
                    str6 = str6;
                    str5 = str5;
                    i58 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    i51 = i51;
                    sArr6 = sArr6;
                    i52 = i52;
                    i53 = i53;
                    sArr7 = sArr7;
                    i54 = i54;
                    i55 = i55;
                    sArr8 = sArr8;
                    i56 = i56;
                    i57 = i57;
                    i46 = i46;
                    s = sArr5[11];
                    s2 = 19222;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2762 = C0773.m3169("᩸ܽ") ^ i43;
                        i12 = ((iM2762 ^ i42) * (-23885)) ^ (-1325373236);
                        i13 = -1212700861;
                    } else {
                        iM2762 = (C0619.m2761("᩻ۜ") + i43) * (-81);
                        i12 = ((iM2762 ^ i42) * 25089) ^ (-755440430);
                        i13 = -1123054242;
                    }
                    i45 = iM2762 ^ i13;
                    i52 = i52;
                    i53 = i53;
                    i56 = i56;
                    i46 = i46;
                    str6 = str6;
                    i57 = i57;
                    str5 = str5;
                    sArr8 = sArr8;
                    i55 = i55;
                    sArr7 = sArr7;
                    i54 = i54;
                    i51 = i51;
                    sArr6 = sArr6;
                    i44 = i12;
                    i50 = i50;
                    c11273 = c11273;
                    iM31613 = iM31613;
                    i58 = i58;
                    break;
                case 523711305:
                case 1580247020:
                    str6 = str6;
                    int[] iArr5 = abstractActivityC10144.f32490;
                    int i90 = abstractActivityC10144.f32492;
                    abstractActivityC10144.f32492 = i90 + 1;
                    iArr5[i90] = i46;
                    i37 = -1;
                    iM2761 = (C0773.m3169("ᩴ۠") + i43) * (-91);
                    i10 = ((iM2761 ^ i42) * 7695) ^ 1365100457;
                    i11 = -1568153950;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 538681586:
                case 1451227201:
                    str6 = str6;
                    if (c11273.m28527(str7)) {
                        iM2761 = C0773.m3169("ۤ᩺") ^ i42;
                        i10 = ((iM2761 ^ i43) * (-10871)) ^ (-838793315);
                        i11 = -1668956161;
                    } else {
                        iM2761 = (C0773.m3169("֡ۙ") ^ i43) * (-95);
                        i10 = ((iM2761 ^ i42) * 28457) ^ 170602230;
                        i11 = 1501235442;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 607850285:
                case 1726752724:
                    z2 = false;
                    iM2761 = (i43 - C0619.m2761("ܶ۠")) * 55;
                    i10 = ((iM2761 ^ i42) * 14737) ^ (-1326790823);
                    i11 = 1193460489;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 758512672:
                case 1360204770:
                    if (C2485.f7950 != 0) {
                        str6 = str6;
                        str5 = str5;
                        i58 = i58;
                        iM31613 = iM31613;
                        i50 = i50;
                        i51 = i51;
                        sArr6 = sArr6;
                        i52 = i52;
                        i53 = i53;
                        sArr7 = sArr7;
                        i54 = i54;
                        i55 = i55;
                        sArr8 = sArr8;
                        i56 = i56;
                        i57 = i57;
                        i46 = i46;
                        iM2762 = C0773.m3169("᩸ܽ") ^ i43;
                        i12 = ((iM2762 ^ i42) * (-23885)) ^ (-1325373236);
                        i13 = -1212700861;
                        i45 = iM2762 ^ i13;
                        i52 = i52;
                        i53 = i53;
                        i56 = i56;
                        i46 = i46;
                        str6 = str6;
                        i57 = i57;
                        str5 = str5;
                        sArr8 = sArr8;
                        i55 = i55;
                        sArr7 = sArr7;
                        i54 = i54;
                        i51 = i51;
                        sArr6 = sArr6;
                        i44 = i12;
                        i50 = i50;
                        c11273 = c11273;
                        iM31613 = iM31613;
                        i58 = i58;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۚ") + i42) * (-13);
                        i = ((iM3169 ^ i43) * (-24541)) ^ (-196836541);
                        i2 = 1727644857;
                        i45 = iM3169 ^ i2;
                        i44 = i;
                    }
                    break;
                case 786074629:
                case 866742427:
                    str6 = str6;
                    if (abstractActivityC10144.f32494) {
                        iM2761 = (i42 - C0773.m3169("ۗۢ")) * 27;
                        i10 = ((iM2761 ^ i43) * 6605) ^ (-1377429487);
                        i11 = 779310861;
                    } else {
                        z4 = z5;
                        iM2761 = C0773.m3169("ᩳ۟") ^ i42;
                        i10 = ((iM2761 ^ i43) * 3725) ^ 1883362483;
                        i11 = 1429427613;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 802555935:
                case 2049122193:
                    if (C2834.f9334 <= 0) {
                        str6 = str6;
                        str5 = str5;
                        i58 = i58;
                        iM31613 = iM31613;
                        i50 = i50;
                        i3 = i51;
                        i52 = i52;
                        i53 = i53;
                        sArr7 = sArr7;
                        i54 = i54;
                        i55 = i55;
                        sArr8 = sArr8;
                        i56 = i56;
                        i57 = i57;
                        i46 = i46;
                        sArr = sArr6;
                        int iM276111 = (i42 - C0619.m2761("ۤᩳ")) * 63;
                        short[] sArr17 = sArr;
                        i20 = ((iM276111 ^ i43) * (-8077)) ^ (-777522267);
                        i45 = iM276111 ^ (-1018452268);
                        i51 = i3;
                        i52 = i52;
                        i53 = i53;
                        i56 = i56;
                        str6 = str6;
                        i57 = i57;
                        str5 = str5;
                        sArr8 = sArr8;
                        i55 = i55;
                        sArr7 = sArr7;
                        i54 = i54;
                        sArr6 = sArr17;
                        i44 = i20;
                        i46 = i46;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i58;
                    } else {
                        iM3169 = (C0773.m3169("ۗۤ") + i43) * (-43);
                        i = ((iM3169 ^ i42) * (-12333)) ^ 1378299240;
                        i2 = 1233339952;
                        i45 = iM3169 ^ i2;
                        i44 = i;
                    }
                    break;
                case 807341821:
                case 1237269178:
                    AbstractC0641.m2813();
                    if (!C1783.m6232()) {
                        str6 = str6;
                        str5 = str5;
                        i58 = i58;
                        iM31613 = iM31613;
                        i50 = i50;
                        i51 = i51;
                        sArr6 = sArr6;
                        i52 = i52;
                        i53 = i53;
                        sArr7 = sArr7;
                        i54 = i54;
                        i55 = i55;
                        sArr8 = sArr8;
                        i56 = i56;
                        i57 = i57;
                        i46 = i46;
                        iM2762 = C0773.m3169("᩸ܽ") ^ i43;
                        i12 = ((iM2762 ^ i42) * (-23885)) ^ (-1325373236);
                        i13 = -1212700861;
                        i45 = iM2762 ^ i13;
                        i52 = i52;
                        i53 = i53;
                        i56 = i56;
                        i46 = i46;
                        str6 = str6;
                        i57 = i57;
                        str5 = str5;
                        sArr8 = sArr8;
                        i55 = i55;
                        sArr7 = sArr7;
                        i54 = i54;
                        i51 = i51;
                        sArr6 = sArr6;
                        i44 = i12;
                        i50 = i50;
                        c11273 = c11273;
                        iM31613 = iM31613;
                        i58 = i58;
                    } else {
                        iM3169 = (i42 - C0619.m2761("ܰۛ")) * (-35);
                        i = ((iM3169 ^ i43) * (-23385)) ^ 548111800;
                        i2 = 771217604;
                        i45 = iM3169 ^ i2;
                        i44 = i;
                    }
                    break;
                case 847218070:
                case 1844327197:
                    str6 = str6;
                    if (i46 != i48) {
                        iM2761 = (C0773.m3169("֨᩷") ^ i42) * (-87);
                        i10 = ((iM2761 ^ i43) * (-19119)) ^ (-1301006371);
                        i11 = 848164543;
                    } else {
                        i38 = i46;
                        iM2761 = C0773.m3169("ܺۘ") ^ i43;
                        i10 = ((iM2761 ^ i42) * 29123) ^ 719673150;
                        i11 = -149635883;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 849936301:
                case 1714190501:
                    strM6952 = C3779.m12271(abstractActivityC10144, i49);
                    str6 = strM6952;
                    int i810 = i50;
                    i46 = i46;
                    i5 = iM31613;
                    i6 = i810;
                    iM2764 = C0619.m2761("ۘܺ") ^ i42;
                    i44 = ((iM2764 ^ i43) * (-9553)) ^ (-1158288184);
                    i31 = -517711271;
                    i45 = iM2764 ^ i31;
                    c11273 = c11273;
                    i34 = i6;
                    iM31613 = i5;
                    i46 = i46;
                    i50 = i34;
                    break;
                case 865656969:
                case 1872595932:
                    str6 = str6;
                    if (z6) {
                        iM2761 = C0619.m2761("ۢᩴ") ^ i42;
                        i10 = ((iM2761 ^ i43) * (-10425)) ^ 665211403;
                        i11 = -439568947;
                    } else {
                        iM2761 = (i43 - C0619.m2761("᩵ܿ")) * (-121);
                        i10 = ((iM2761 ^ i42) * (-17637)) ^ (-608610561);
                        i11 = -1936102628;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 883649815:
                case 1630773103:
                    StringBuilder sbM10406 = C3188.m10405(strM6246, strM40377);
                    C3779.m12258(sbM10406, C3779.m12271(abstractActivityC10144, i49));
                    strM6952 = C2023.m6952(sbM10406);
                    str6 = strM6952;
                    int i811 = i50;
                    i46 = i46;
                    i5 = iM31613;
                    i6 = i811;
                    iM2764 = C0619.m2761("ۘܺ") ^ i42;
                    i44 = ((iM2764 ^ i43) * (-9553)) ^ (-1158288184);
                    i31 = -517711271;
                    i45 = iM2764 ^ i31;
                    c11273 = c11273;
                    i34 = i6;
                    iM31613 = i5;
                    i46 = i46;
                    i50 = i34;
                    break;
                case 1227260805:
                case 1437080641:
                    str6 = str6;
                    str5 = str5;
                    i58 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    i51 = i51;
                    sArr6 = sArr6;
                    i52 = i52;
                    i53 = i53;
                    sArr7 = sArr7;
                    i54 = i54;
                    i55 = i55;
                    sArr8 = sArr8;
                    i56 = i56;
                    i57 = i57;
                    i46 = i46;
                    int i91 = s + s2;
                    int i92 = (s * s) + 369485284;
                    if ((i92 + i92) - (i91 * i91) >= 0) {
                        iM2762 = C0773.m3169("ᩴۖ") ^ i43;
                        i12 = ((iM2762 ^ i42) * 4453) ^ 201987571;
                        i13 = 1219592088;
                    } else {
                        iM2762 = C0773.m3169("ۨ֡") ^ i42;
                        i12 = ((iM2762 ^ i43) * 8239) ^ 168646352;
                        i13 = -1600988456;
                    }
                    i45 = iM2762 ^ i13;
                    i52 = i52;
                    i53 = i53;
                    i56 = i56;
                    i46 = i46;
                    str6 = str6;
                    i57 = i57;
                    str5 = str5;
                    sArr8 = sArr8;
                    i55 = i55;
                    sArr7 = sArr7;
                    i54 = i54;
                    i51 = i51;
                    sArr6 = sArr6;
                    i44 = i12;
                    i50 = i50;
                    c11273 = c11273;
                    iM31613 = iM31613;
                    i58 = i58;
                    break;
                case 1231379155:
                case 1665948847:
                    str6 = str6;
                    if (str5 != null) {
                        i8 = i50;
                        str6 = str6;
                        i9 = i46;
                        iM31611 = C0773.m3169("᩻᩶") ^ i43;
                        i30 = ((iM31611 ^ i42) * 1603) ^ (-775279877);
                        i33 = -1034143414;
                        i45 = iM31611 ^ i33;
                        i46 = i9;
                        i50 = i8;
                        i44 = i30;
                        c11273 = c11273;
                    } else {
                        i4 = i50;
                        str6 = str6;
                        i46 = i46;
                        i36 = i46;
                        iM31610 = C0773.m3169("᩺۬") ^ i43;
                        i = ((iM31610 ^ i42) * (-21903)) ^ 1456972801;
                        i7 = -51811223;
                        i45 = iM31610 ^ i7;
                        i46 = i46;
                        i50 = i4;
                        i44 = i;
                    }
                    break;
                case 1243690839:
                case 1353638410:
                    str6 = str6;
                    if (c11273 != null) {
                        iM2761 = C0619.m2761("᩸ܶ") ^ i42;
                        i10 = ((iM2761 ^ i43) * (-17591)) ^ 2054796012;
                        i11 = -1609628347;
                    } else {
                        iM2761 = C0773.m3169("ۤ᩺") ^ i42;
                        i10 = ((iM2761 ^ i43) * (-10871)) ^ (-838793315);
                        i11 = -1668956161;
                    }
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 1251794185:
                case 1951061650:
                    str6 = str6;
                    int[] iArr6 = abstractActivityC10144.f32490;
                    int i93 = abstractActivityC10144.f32492;
                    abstractActivityC10144.f32492 = i93 + 1;
                    iArr6[i93] = i46;
                    i38 = -1;
                    iM2761 = C0773.m3169("ܺۘ") ^ i43;
                    i10 = ((iM2761 ^ i42) * 29123) ^ 719673150;
                    i11 = -149635883;
                    i45 = iM2761 ^ i11;
                    i44 = i10;
                    str6 = str6;
                    break;
                case 1462231007:
                case 2144963320:
                    str6 = str6;
                    str2 = str5;
                    i58 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    i14 = i51;
                    sArr2 = sArr7;
                    i15 = i54;
                    i16 = i55;
                    sArr3 = sArr8;
                    i17 = i56;
                    i18 = i57;
                    i19 = i46;
                    zM5512 = C1564.m5512(str);
                    str4 = null;
                    sArr6 = f78715;
                    i52 = 12;
                    i53 = 3;
                    if (C20932.m47848() != 0) {
                        iM2763 = (C0619.m2761("ۘᩴ") ^ i42) * (-73);
                        i44 = (-1605907470) ^ ((iM2763 ^ i43) * 18711);
                        i21 = 1652146722;
                    } else {
                        iM2763 = (i43 - C0619.m2761("ۘۖ")) * (-65);
                        i44 = 843775192 ^ ((iM2763 ^ i42) * (-8303));
                        i21 = 2134983199;
                    }
                    i45 = iM2763 ^ i21;
                    c11273 = c11273;
                    i56 = i17;
                    i46 = i19;
                    str6 = str6;
                    i57 = i18;
                    str5 = str2;
                    sArr8 = sArr3;
                    i55 = i16;
                    sArr7 = sArr2;
                    i54 = i15;
                    i51 = i14;
                    i50 = i50;
                    iM31613 = iM31613;
                    i58 = i58;
                    break;
                case 1511376425:
                case 1640623501:
                    str6 = str6;
                    str3 = str5;
                    i25 = i58;
                    iM31613 = iM31613;
                    i50 = i50;
                    i27 = i51;
                    i28 = i57;
                    i29 = i46;
                    Object[] objArr3 = new Object[i25];
                    objArr3[c] = str;
                    sArr8 = f78715;
                    i56 = 18;
                    if (C1542.f5343 <= 0) {
                        objArr = objArr3;
                        int iM276112 = (i42 - C0619.m2761("֨ۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i10 = ((iM276112 ^ i43) * (-8759)) ^ (-1740525520);
                        i45 = iM276112 ^ 190942526;
                        i51 = i27;
                        i46 = i29;
                        i57 = i28;
                        str5 = str3;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i25;
                        i44 = i10;
                        str6 = str6;
                    } else {
                        int iM31621 = C0773.m3169("᩻ۡ") ^ i42;
                        int i94 = ((iM31621 ^ i43) * 637) ^ (-422847291);
                        i45 = iM31621 ^ 1833691795;
                        objArr = objArr3;
                        i51 = i27;
                        i46 = i29;
                        str6 = str6;
                        i57 = i28;
                        c11273 = c11273;
                        i50 = i50;
                        iM31613 = iM31613;
                        i58 = i25;
                        i44 = i94;
                        str5 = str3;
                    }
                    break;
                default:
                    abstractActivityC10144.f32491 = str6;
                    iM3169 = (i43 - C0773.m3169("֫ۤ")) * 67;
                    i = ((iM3169 ^ i42) * 9619) ^ (-1593399699);
                    i2 = 791601621;
                    i45 = iM3169 ^ i2;
                    i44 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x020b A[PHI: r7 r8 r9 r10 r12 r13 r17
      0x020b: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:59:0x0209, B:55:0x01e6, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:59:0x0209, B:55:0x01e6, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:59:0x0209, B:55:0x01e6, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:59:0x0209, B:55:0x01e6, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v5 short[]) binds: [B:59:0x0209, B:55:0x01e6, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:59:0x0209, B:55:0x01e6, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r17v22 l.ۢ۬ۤ) = (r17v6 l.ۢ۬ۤ), (r17v7 l.ۢ۬ۤ), (r17v23 l.ۢ۬ۤ) binds: [B:59:0x0209, B:55:0x01e6, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (l.C3690.f12684 > 0) goto L14;
     */
    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo8145() {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24317.mo8145():void");
    }
}
