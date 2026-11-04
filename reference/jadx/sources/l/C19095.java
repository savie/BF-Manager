package l;

import android.widget.BaseAdapter;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q62Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C19095 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC10144 f61815;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        AbstractActivityC10144 abstractActivityC10144 = null;
        int i2 = 1109545616;
        int i3 = C2354.f7599;
        int i4 = C1080.f3865;
        int iM2761 = C0619.m2761("ܶۛ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 28593) ^ 186798686;
        int i6 = -1318302553;
        while (true) {
            i2 = ((((i2 ^ i4) * (-11149)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1864325163:
                case 1435421370:
                    if (C0619.f2439) {
                        iM2761 = (C0619.m2761("ۖۡ") ^ i3) * 101;
                        i5 = ((iM2761 ^ i4) * (-2027)) ^ 492672545;
                        i6 = -1220616305;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۡۛ")) * (-55);
                        i5 = ((iM2761 ^ i4) * (-13369)) ^ (-1503524455);
                        i6 = -776727284;
                    }
                    break;
                case -1856963828:
                case -301898623:
                    if (C3998.f13671 != 0) {
                        iM2761 = (i3 - C0773.m3169("᩷ۖ")) * (-111);
                        i5 = ((iM2761 ^ i4) * (-11459)) ^ (-2122262363);
                        i6 = -1470755793;
                    } else {
                        iM2761 = C0773.m3169("ۜᩴ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14937) ^ 1510408451;
                        i6 = 179212135;
                    }
                    break;
                case -1829354887:
                case -406853471:
                    if (C1080.m4050()) {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * 837) ^ (-946172752);
                        i6 = 44016689;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ᩴۘ")) * (-99);
                        i5 = ((iM2761 ^ i3) * 15199) ^ (-954897296);
                        i6 = -591037960;
                    }
                    break;
                case -1820663200:
                case -194423924:
                    C3033.m9845();
                    if (!C2878.f9462) {
                        iM2761 = (C0619.m2761("ۖۡ") ^ i3) * 101;
                        i5 = ((iM2761 ^ i4) * (-2027)) ^ 492672545;
                        i6 = -1220616305;
                    } else {
                        iM2761 = (C0773.m3169("᩻֫") ^ i4) * (-13);
                        i5 = ((iM2761 ^ i3) * 17449) ^ 910498838;
                        i6 = -1557900088;
                    }
                    break;
                case -1724987909:
                case -431699622:
                    return abstractActivityC10144.f32490[i];
                case -1308858633:
                case -479703816:
                    abstractActivityC10144 = this.f61815;
                    if (abstractActivityC10144.f32504) {
                        iM2761 = C0619.m2761("ۚ۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-32329)) ^ 426002490;
                        i6 = 1112033366;
                    } else {
                        iM2761 = C0619.m2761("֡᩺") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-6731)) ^ (-428668686);
                        i6 = 610511215;
                    }
                    break;
                case -1232173234:
                case -812349746:
                    C4238.m13540();
                    iM2761 = (C0773.m3169("᩻֫") ^ i4) * (-13);
                    i5 = ((iM2761 ^ i3) * 17449) ^ 910498838;
                    i6 = -1557900088;
                    break;
                case -775407977:
                case 310781684:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("ۛܳ") ^ i3) * 123;
                        i5 = ((iM2761 ^ i4) * 28307) ^ 1336375779;
                        i6 = 1533848813;
                    } else {
                        iM2761 = C0773.m3169("ܿۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 6965) ^ (-125266418);
                        i6 = -974248785;
                    }
                    break;
                case -702370445:
                case 884670442:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (i3 - C0773.m3169("᩷ۖ")) * (-111);
                        i5 = ((iM2761 ^ i4) * (-11459)) ^ (-2122262363);
                        i6 = -1470755793;
                    } else {
                        iM2761 = C0773.m3169("ۡ۬") ^ i4;
                        i5 = ((iM2761 ^ i3) * 1391) ^ (-1170152239);
                        i6 = -372168808;
                    }
                    break;
                case -637879206:
                case 1509161293:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩷ۖ")) * (-111);
                        i5 = ((iM2761 ^ i4) * (-11459)) ^ (-2122262363);
                        i6 = -1470755793;
                    } else {
                        iM2761 = C0619.m2761("ۢۨ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 23297) ^ 2033573799;
                        i6 = -1529206212;
                    }
                    break;
                case -473472767:
                case 554476370:
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0773.m3169("᩻֫") ^ i4) * (-13);
                        i5 = ((iM2761 ^ i3) * 17449) ^ 910498838;
                        i6 = -1557900088;
                    } else {
                        iM2761 = C0773.m3169("۟ۗ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 7081) ^ 1467800917;
                        i6 = -621959466;
                    }
                    break;
                case 25897958:
                case 1639815955:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩷ۖ")) * (-111);
                        i5 = ((iM2761 ^ i4) * (-11459)) ^ (-2122262363);
                        i6 = -1470755793;
                    } else {
                        iM2761 = C0773.m3169("ܽ᩷") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-27313)) ^ 545519987;
                        i6 = 19925062;
                    }
                    break;
                case 49903686:
                case 99112405:
                    C1564.m5509();
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ᩴۘ")) * (-99);
                        i5 = ((iM2761 ^ i3) * 15199) ^ (-954897296);
                        i6 = -591037960;
                    } else {
                        iM2761 = (C0773.m3169("᩻֫") ^ i4) * (-13);
                        i5 = ((iM2761 ^ i3) * 17449) ^ 910498838;
                        i6 = -1557900088;
                    }
                    break;
                case 546621047:
                case 850898267:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("ۛܳ") ^ i3) * 123;
                        i5 = ((iM2761 ^ i4) * 28307) ^ 1336375779;
                        i6 = 1533848813;
                    } else {
                        iM2761 = C0619.m2761("ܳۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 9629) ^ (-1451722445);
                        i6 = 1929945980;
                    }
                    break;
                case 708390570:
                case 1429993105:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = (C0619.m2761("ۖۡ") ^ i3) * 101;
                        i5 = ((iM2761 ^ i4) * (-2027)) ^ 492672545;
                        i6 = -1220616305;
                    } else {
                        iM2761 = (C0619.m2761("ۙܰ") + i4) * (-17);
                        i5 = ((iM2761 ^ i3) * 23257) ^ 2097256737;
                        i6 = -1986375920;
                    }
                    break;
                case 756789774:
                case 2029857056:
                    C0487.m2356();
                    C1080.m4050();
                    return 0L;
                case 1091419496:
                case 1376577138:
                    if (C11235.m28309() != 0) {
                        iM2761 = (i3 - C0773.m3169("᩷ۖ")) * (-111);
                        i5 = ((iM2761 ^ i4) * (-11459)) ^ (-2122262363);
                        i6 = -1470755793;
                    } else {
                        iM2761 = (C0773.m3169("᩻֫") ^ i4) * (-13);
                        i5 = ((iM2761 ^ i3) * 17449) ^ 910498838;
                        i6 = -1557900088;
                    }
                    break;
                default:
                    return i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x053a A[PHI: r3 r10 r16 r18 r19 r23 r24
      0x053a: PHI (r3v9 l.ۧ۬ۤ) = (r3v2 l.ۧ۬ۤ), (r3v2 l.ۧ۬ۤ), (r3v4 l.ۧ۬ۤ), (r3v2 l.ۧ۬ۤ) binds: [B:111:0x0538, B:107:0x050f, B:88:0x0413, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x053a: PHI (r10v65 android.view.View) = (r10v44 android.view.View), (r10v45 android.view.View), (r10v51 android.view.View), (r10v66 android.view.View) binds: [B:111:0x0538, B:107:0x050f, B:88:0x0413, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x053a: PHI (r16v12 int) = (r16v2 int), (r16v2 int), (r16v4 int), (r16v2 int) binds: [B:111:0x0538, B:107:0x050f, B:88:0x0413, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x053a: PHI (r18v30 java.lang.String) = (r18v5 java.lang.String), (r18v6 java.lang.String), (r18v12 java.lang.String), (r18v31 java.lang.String) binds: [B:111:0x0538, B:107:0x050f, B:88:0x0413, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x053a: PHI (r19v35 l.ۢ۬ۤ) = (r19v5 l.ۢ۬ۤ), (r19v6 l.ۢ۬ۤ), (r19v16 l.ۢ۬ۤ), (r19v36 l.ۢ۬ۤ) binds: [B:111:0x0538, B:107:0x050f, B:88:0x0413, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x053a: PHI (r23v56 java.lang.CharSequence) = 
      (r23v31 java.lang.CharSequence)
      (r23v32 java.lang.CharSequence)
      (r23v39 java.lang.CharSequence)
      (r23v57 java.lang.CharSequence)
     binds: [B:111:0x0538, B:107:0x050f, B:88:0x0413, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x053a: PHI (r24v33 android.widget.TextView) = 
      (r24v6 android.widget.TextView)
      (r24v7 android.widget.TextView)
      (r24v13 android.widget.TextView)
      (r24v34 android.widget.TextView)
     binds: [B:111:0x0538, B:107:0x050f, B:88:0x0413, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x01eb A[PHI: r13 r14 r15
      0x01eb: PHI (r13v4 java.lang.CharSequence) = (r13v3 java.lang.CharSequence), (r13v2 java.lang.CharSequence) binds: [B:52:0x01d2, B:45:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r14v4 java.lang.CharSequence) = (r14v3 java.lang.CharSequence), (r14v2 java.lang.CharSequence) binds: [B:52:0x01d2, B:45:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:52:0x01d2, B:45:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0101, code lost:
    
        if (l.C1343.m4943() != false) goto L9;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
        /*
            Method dump skipped, instruction units count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19095.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C19095(AbstractActivityC10144 abstractActivityC10144) {
        this.f61815 = abstractActivityC10144;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        AbstractActivityC10144 abstractActivityC10144 = null;
        int i = 1656839887;
        int i2 = C23916.f77426;
        int i3 = C1080.f3865;
        int iM2761 = C0619.m2761("ۧ᩻") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-7251)) ^ (-1554085898);
        int i5 = -1353537067;
        while (true) {
            i = ((((i ^ i3) * 23871) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2094020384:
                case 1632029763:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("ۢۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24169) ^ (-792743695);
                        i5 = -427434508;
                    } else {
                        iM2761 = (C0773.m3169("ۚ۬") ^ i2) * (-51);
                        i4 = ((iM2761 ^ i3) * 2415) ^ 1066965647;
                        i5 = -728321023;
                    }
                    break;
                case -2062371123:
                case 1811480157:
                    C3690.m11987();
                    iM2761 = C0773.m3169("ۢۢ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 24169) ^ (-792743695);
                    i5 = -427434508;
                    break;
                case -1888478147:
                case -1871832829:
                    return abstractActivityC10144.f32492;
                case -1875020555:
                case 734985310:
                    if (C3448.m11248() != 0) {
                        iM2761 = C0773.m3169("᩵᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5843)) ^ (-1364582009);
                        i5 = 1648309522;
                    } else {
                        iM2761 = (C0619.m2761("֫ۙ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * (-8353)) ^ 1554062773;
                        i5 = -1651585233;
                    }
                    break;
                case -1840961026:
                case 538103421:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0619.m2761("᩵ۢ") + i3) * 69;
                        i4 = ((iM2761 ^ i2) * (-309)) ^ (-552168233);
                        i5 = -883680911;
                    } else {
                        iM2761 = (C0619.m2761("֡۫") + i3) * (-75);
                        i4 = ((iM2761 ^ i2) * (-25683)) ^ 1796626383;
                        i5 = 2080853645;
                    }
                    break;
                case -1783559625:
                case 204208131:
                    abstractActivityC10144 = this.f61815;
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = (C0619.m2761("᩵ۢ") + i3) * 69;
                        i4 = ((iM2761 ^ i2) * (-309)) ^ (-552168233);
                        i5 = -883680911;
                    } else {
                        iM2761 = C0773.m3169("ܺ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31371)) ^ 2112358099;
                        i5 = 262347883;
                    }
                    break;
                case -1711448253:
                case 2128160166:
                    if (C3734.m12152() < 0) {
                        iM2761 = C0619.m2761("ۘ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26413)) ^ (-1755034909);
                        i5 = 1360741204;
                    } else {
                        iM2761 = C0773.m3169("ۢۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24169) ^ (-792743695);
                        i5 = -427434508;
                    }
                    break;
                case -1369422988:
                case 698118013:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("᩵᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5843)) ^ (-1364582009);
                        i5 = 1648309522;
                    } else {
                        iM2761 = C0619.m2761("ۛ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4099)) ^ 1318160133;
                        i5 = -1465477784;
                    }
                    break;
                case -1240469724:
                case -1215552563:
                    if (C3077.m10041()) {
                        iM2761 = C0773.m3169("᩵᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5843)) ^ (-1364582009);
                        i5 = 1648309522;
                    } else {
                        iM2761 = C0619.m2761("۟ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 30569) ^ (-14925250);
                        i5 = 861086564;
                    }
                    break;
                case -993514121:
                case 656172612:
                    if (abstractActivityC10144.f32497 == null) {
                        iM2761 = (C0619.m2761("᩹ܿ") + i2) * 79;
                        i4 = ((iM2761 ^ i3) * (-25201)) ^ (-2062874862);
                        i5 = 986877169;
                    } else {
                        iM2761 = (C0619.m2761("۟۫") ^ i3) * 61;
                        i4 = ((iM2761 ^ i2) * 2331) ^ 1545570047;
                        i5 = -1035176784;
                    }
                    break;
                case -467813009:
                case 2004768796:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0619.m2761("᩵ۢ") + i3) * 69;
                        i4 = ((iM2761 ^ i2) * (-309)) ^ (-552168233);
                        i5 = -883680911;
                    } else {
                        iM2761 = C0619.m2761("۬ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31879) ^ 26725806;
                        i5 = 228148738;
                    }
                    break;
                case -400535944:
                case 729921210:
                    C1321.m4852();
                    if (C0487.f2131 > 0) {
                        iM2761 = C0773.m3169("᩵᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5843)) ^ (-1364582009);
                        i5 = 1648309522;
                    } else {
                        iM2761 = C0619.m2761("ۘ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26413)) ^ (-1755034909);
                        i5 = 1360741204;
                    }
                    break;
                case -187684446:
                case 930793723:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("᩵ۢ") + i3) * 69;
                        i4 = ((iM2761 ^ i2) * (-309)) ^ (-552168233);
                        i5 = -883680911;
                    } else {
                        iM2761 = (C0773.m3169("ۛ᩹") ^ i3) * (-69);
                        i4 = ((iM2761 ^ i2) * 14381) ^ (-321431331);
                        i5 = 1792819679;
                    }
                    break;
                case -176348388:
                case 893430040:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ۘ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26413)) ^ (-1755034909);
                        i5 = 1360741204;
                    } else {
                        iM2761 = (C0619.m2761("֫ۚ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i2) * 25351) ^ 720409882;
                        i5 = -978097162;
                    }
                    break;
                case 162573082:
                case 1288498338:
                    if (C17202.m40372()) {
                        iM2761 = (C0619.m2761("ܳ᩹") ^ i3) * (-51);
                        i4 = ((iM2761 ^ i2) * 1715) ^ (-402417661);
                        i5 = 734912309;
                    } else {
                        iM2761 = C0773.m3169("ۢۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24169) ^ (-792743695);
                        i5 = -427434508;
                    }
                    break;
                case 401918901:
                case 1410045875:
                    return 0;
                case 1038309212:
                case 1224096195:
                    C2310.m7813();
                    return 0;
                case 1491019808:
                case 1707063029:
                    C2023.m6964();
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("ۘ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26413)) ^ (-1755034909);
                        i5 = 1360741204;
                    } else {
                        iM2761 = C0773.m3169("ۢ᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24985) ^ 1641534335;
                        i5 = 1117513343;
                    }
                    break;
                case 1658726993:
                case 1976069903:
                    return C2702.m8879(abstractActivityC10144.f32497);
                default:
                    if (abstractActivityC10144.f32504) {
                        iM2761 = (i3 - C0773.m3169("᩹᩶")) * 101;
                        i4 = ((iM2761 ^ i2) * (-8729)) ^ 1455527001;
                        i5 = 23203626;
                    } else {
                        iM2761 = (C0619.m2761("ۢ᩻") + i2) * (-89);
                        i4 = ((iM2761 ^ i3) * (-3581)) ^ 1718042333;
                        i5 = -461724616;
                    }
                    break;
            }
        }
    }
}
