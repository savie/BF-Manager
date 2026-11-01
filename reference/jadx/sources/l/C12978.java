package l;

/* JADX INFO: renamed from: l.۬۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C12978 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43287;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23604 f43288;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f43289;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16740 f43290;

    static {
        ApplicationC6132.m17119(119);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C12978(int i, String str, ViewOnClickListenerC23604 viewOnClickListenerC23604, C16740 c16740) {
        int i2 = 1330715834;
        int i3 = C2642.f10294;
        int i4 = C1025.f4800;
        this.f43287 = i;
        this.f43289 = str;
        this.f43288 = viewOnClickListenerC23604;
        this.f43290 = c16740;
        int iM11306 = ThreadFactoryC3888.m11306("ܳܰ") ^ i3;
        int i5 = ((iM11306 ^ i4) * (-19067)) ^ (-626607168);
        int i6 = 2028746490;
        while (true) {
            i2 = (iM11306 ^ i6) ^ (i5 & (((i2 ^ i4) * 17729) >> 31));
            switch (i2) {
                case -1987168747:
                case 1735895709:
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (C19806.m45029("ܿܰ") ^ i4) * (-73);
                        i5 = ((iM11306 ^ i3) * (-21085)) ^ (-1031654588);
                        i6 = -739549443;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۧ") + i4) * 43;
                        i5 = ((iM11306 ^ i3) * (-32759)) ^ 1207199964;
                        i6 = -1150056718;
                    }
                    break;
                case -1368730993:
                case -709257709:
                    C0629.m2907();
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-29183)) ^ 1430572317;
                        i6 = 226606342;
                    } else {
                        iM11306 = (C19806.m45029("ۛۨ") ^ i3) * 21;
                        i5 = ((iM11306 ^ i4) * (-18589)) ^ 576537290;
                        i6 = -1596434374;
                    }
                    break;
                case -1347159336:
                case 1030864798:
                    C3286.m9798();
                    iM11306 = (C19806.m45029("ۛۨ") ^ i3) * 21;
                    i5 = ((iM11306 ^ i4) * (-18589)) ^ 576537290;
                    i6 = -1596434374;
                    break;
                case -1318673812:
                case -604378819:
                    C2249.m6915();
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = C19806.m45029("֨ܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 20349) ^ (-1110560064);
                        i6 = -1339541911;
                    } else {
                        iM11306 = (C19806.m45029("ۛۨ") ^ i3) * 21;
                        i5 = ((iM11306 ^ i4) * (-18589)) ^ 576537290;
                        i6 = -1596434374;
                    }
                    break;
                case -1250866165:
                case 880841228:
                    return;
                case 303663132:
                case 1904583380:
                    C1066.m4023();
                    if (CallableC1627.m5507() == 0) {
                        iM11306 = C19806.m45029("֨ܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 20349) ^ (-1110560064);
                        i6 = -1339541911;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܿ۬")) * 101;
                        i5 = ((iM11306 ^ i3) * (-10947)) ^ (-788122847);
                        i6 = -457402010;
                    }
                    break;
                default:
                    C0797.m3359();
                    throw new RuntimeException();
            }
        }
    }
}
