package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܿۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18254 implements InterfaceC16438, InterfaceC10768 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3071 f59573;

    public C18254(InterfaceC3071 interfaceC3071) {
        this.f59573 = interfaceC3071;
    }

    public final int hashCode() {
        return C0773.m3169(this.f59573);
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3071 mo1985() {
        return this.f59573;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo1486(Object obj) {
        this.f59573.invoke(obj);
    }

    public final boolean equals(Object obj) {
        InterfaceC3071 interfaceC3071Mo1985 = null;
        int i = 76335690;
        int i2 = C2288.f7433;
        int i3 = C2419.f7754;
        int iM2761 = C0619.m2761("ۜۧ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 6923) ^ (-1932855215);
        int i5 = 626112183;
        while (true) {
            i = ((((i ^ i3) * 3345) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1793168623:
                case 943432498:
                    if (!C2354.m7983()) {
                        iM2761 = C0619.m2761("ᩴ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32311)) ^ (-798246006);
                        i5 = 675652904;
                    } else {
                        iM2761 = (C0773.m3169("֫۠") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * 15673) ^ 1596951265;
                        i5 = 2110137804;
                    }
                    break;
                case -1545951510:
                case 1490068774:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("ᩴ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32311)) ^ (-798246006);
                        i5 = 675652904;
                    } else {
                        iM2761 = (i3 - C0619.m2761("֫ܰ")) * 25;
                        i4 = ((iM2761 ^ i2) * 20359) ^ (-2082387172);
                        i5 = -1223604304;
                    }
                    break;
                case -1542403229:
                case -710296725:
                    if (C1564.m5509() <= 0) {
                        iM2761 = (i2 - C0773.m3169("ܳ᩶")) * (-97);
                        i4 = ((iM2761 ^ i3) * (-12203)) ^ (-1525525288);
                        i5 = 1657472690;
                    } else {
                        iM2761 = (C0619.m2761("ܶ᩶") + i3) * 45;
                        i4 = ((iM2761 ^ i2) * (-15887)) ^ 1885271801;
                        i5 = 149149597;
                    }
                    break;
                case -1417377863:
                case 1199775165:
                    if (C2878.f9462) {
                        iM2761 = (C0773.m3169("֫۠") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * 15673) ^ 1596951265;
                        i5 = 2110137804;
                    } else {
                        iM2761 = C0773.m3169("ᩳۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15349) ^ 39064861;
                        i5 = -1551874429;
                    }
                    break;
                case -1312814440:
                case 1470989613:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (i2 - C0773.m3169("ܳ᩶")) * (-97);
                        i4 = ((iM2761 ^ i3) * (-12203)) ^ (-1525525288);
                        i5 = 1657472690;
                    } else {
                        iM2761 = C0619.m2761("֨֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26399) ^ (-228237270);
                        i5 = 1516843375;
                    }
                    break;
                case -571037132:
                case 531040784:
                    C3492.m11488();
                    if (C0862.f3233 == 0) {
                        iM2761 = C0619.m2761("֨֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26399) ^ (-228237270);
                        i5 = 1516843375;
                    } else {
                        iM2761 = (C0773.m3169("֫۠") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * 15673) ^ 1596951265;
                        i5 = 2110137804;
                    }
                    break;
                case -458142291:
                case 1979488881:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("۬֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 26949) ^ (-2025709729);
                        i5 = -539322222;
                    } else {
                        iM2761 = (C0619.m2761("ᩳܶ") ^ i2) * 29;
                        i4 = ((iM2761 ^ i3) * 4879) ^ (-1931444496);
                        i5 = 1689462779;
                    }
                    break;
                case -332778424:
                case 880051640:
                    if (C3099.m10095()) {
                        iM2761 = (C0773.m3169("֫۠") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * 15673) ^ 1596951265;
                        i5 = 2110137804;
                    } else {
                        iM2761 = (C0619.m2761("ۛ۬") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i3) * (-12663)) ^ 958896528;
                        i5 = 1951894585;
                    }
                    break;
                case -223631268:
                case 1802122588:
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("֨֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26399) ^ (-228237270);
                        i5 = 1516843375;
                    } else {
                        iM2761 = C0619.m2761("᩵ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23573)) ^ 673150674;
                        i5 = 981580150;
                    }
                    break;
                case -170188577:
                case 1339267593:
                    if (C1321.m4852()) {
                        iM2761 = C0773.m3169("ۛ֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8649)) ^ (-1037501791);
                        i5 = 2061284326;
                    } else {
                        iM2761 = C0619.m2761("ᩴ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32311)) ^ (-798246006);
                        i5 = 675652904;
                    }
                    break;
                case -83880848:
                case 552303889:
                    C3492.m11488();
                    C3099.m10095();
                    iM2761 = C0619.m2761("ᩴ۫") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-32311)) ^ (-798246006);
                    i5 = 675652904;
                    break;
                case 14493485:
                case 1659103151:
                    return false;
                case 73111799:
                case 235521465:
                    interfaceC3071Mo1985 = ((InterfaceC10768) obj).mo1985();
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("۬֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 26949) ^ (-2025709729);
                        i5 = -539322222;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܿۤ")) * 55;
                        i4 = ((iM2761 ^ i2) * 7261) ^ (-1771315116);
                        i5 = 1634671763;
                    }
                    break;
                case 187823656:
                case 1242871938:
                    RunnableC3646.m11813();
                    return false;
                case 575327799:
                case 737459655:
                    if (obj instanceof InterfaceC16438) {
                        iM2761 = (i3 - C0773.m3169("ܰܿ")) * (-119);
                        i4 = ((iM2761 ^ i2) * (-8551)) ^ (-2094743811);
                        i5 = -606857085;
                    } else {
                        iM2761 = (C0773.m3169("ۛۧ") + i2) * (-9);
                        i4 = ((iM2761 ^ i3) * 20777) ^ (-2006547281);
                        i5 = -369688256;
                    }
                    break;
                case 808620476:
                case 1709465045:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0773.m3169("֫۠") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * 15673) ^ 1596951265;
                        i5 = 2110137804;
                    } else {
                        iM2761 = C0773.m3169("᩵ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13741)) ^ 1871829145;
                        i5 = 1445304801;
                    }
                    break;
                case 820497280:
                case 1851654018:
                    return C3492.m11490(this.f59573, interfaceC3071Mo1985);
                case 920380612:
                case 1191397985:
                    if (C11235.m28309() != 0) {
                        iM2761 = C0619.m2761("֨֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26399) ^ (-228237270);
                        i5 = 1516843375;
                    } else {
                        iM2761 = C0773.m3169("᩸ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-25687)) ^ 1811497807;
                        i5 = -1203344553;
                    }
                    break;
                default:
                    if (obj instanceof InterfaceC10768) {
                        iM2761 = (C0619.m2761("ۘ֡") + i2) * (-109);
                        i4 = ((iM2761 ^ i3) * (-18115)) ^ (-1042809162);
                        i5 = 653466149;
                    } else {
                        iM2761 = (C0773.m3169("ۛۧ") + i2) * (-9);
                        i4 = ((iM2761 ^ i3) * 20777) ^ (-2006547281);
                        i5 = -369688256;
                    }
                    break;
            }
        }
    }
}
