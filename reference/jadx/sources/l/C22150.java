package l;

import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.᩹۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C22150 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72461;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23604 f72462;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3450 f72463;

    static {
        ApplicationC6132.m17119(DHParameters.DEFAULT_MINIMUM_LENGTH);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C22150(int i, ViewOnClickListenerC23604 viewOnClickListenerC23604, C3450 c3450) {
        int i2 = -943942979;
        int i3 = C1148.f5161;
        int i4 = C2124.f7782;
        this.f72461 = i;
        this.f72462 = viewOnClickListenerC23604;
        this.f72463 = c3450;
        int iM11306 = ThreadFactoryC3888.m11306("ۢ᩺") ^ i4;
        int i5 = ((iM11306 ^ i3) * 4979) ^ 2000202303;
        int i6 = -1533598306;
        while (true) {
            i2 = (iM11306 ^ i6) ^ (i5 & (((i2 ^ i3) * 29279) >> 31));
            switch (i2) {
                case -2009858737:
                case -921756424:
                    C1977.m6356();
                    if (AbstractC0464.m2313() == 0) {
                        iM11306 = (C19806.m45029("۠ܽ") ^ i3) * (-11);
                        i5 = ((iM11306 ^ i4) * 25001) ^ (-1125792750);
                        i6 = -2012170563;
                    }
                    break;
                case -1945539833:
                case 173682194:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = (i4 - C19806.m45029("۫ܳ")) * (-5);
                        i5 = ((iM11306 ^ i3) * (-26975)) ^ 1777690625;
                        i6 = 566840158;
                    }
                    break;
                case -1729114825:
                case -1238816258:
                    return;
                case -754168755:
                case 31172910:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۫ܺ")) * 35;
                        i5 = ((iM11306 ^ i4) * 16329) ^ (-530001092);
                        i6 = -1362725865;
                    } else {
                        iM11306 = C19806.m45029("ᩴۚ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-13403)) ^ 7740859;
                        i6 = -413160906;
                        continue;
                    }
                    break;
                case 190438335:
                case 1039634012:
                    C0050.m946();
                    break;
                case 1730528952:
                case 2004403912:
                    C2249.m6915();
                    C1875.m6086();
                    throw new RuntimeException();
                default:
                    C2124.m6673();
                    if (C3722.f13525 > 0) {
                        iM11306 = C19806.m45029("֫᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17417) ^ 1752454569;
                        i6 = -74307780;
                    }
                    break;
            }
            iM11306 = C19806.m45029("ۗܳ") ^ i4;
            i5 = ((iM11306 ^ i3) * (-27213)) ^ (-335765248);
            i6 = 14916607;
        }
    }
}
