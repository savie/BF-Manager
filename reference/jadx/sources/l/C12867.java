package l;

/* JADX INFO: renamed from: l.۬ۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8HG */
/* JADX INFO: loaded from: classes3.dex */
public final class C12867 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31907(long j, C2460 c2460, InterfaceC8011[] interfaceC8011Arr) {
        int i;
        int iM7516;
        while (true) {
            if (c2460.m7503() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (c2460.m7503() == 0) {
                    i = -1;
                    break;
                }
                int iM7517 = c2460.m7516();
                i2 += iM7517;
                if (iM7517 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (c2460.m7503() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iM7516 = c2460.m7516();
                    i3 += iM7516;
                }
            } while (iM7516 == 255);
            int iM7500 = c2460.m7500() + i3;
            if (i3 == -1 || i3 > c2460.m7503()) {
                C0303.m1848("Skipping remainder of malformed SEI NAL unit.");
                iM7500 = c2460.m7509();
            } else if (i == 4 && i3 >= 8) {
                int iM7518 = c2460.m7516();
                int iM7519 = c2460.m7519();
                int iM7499 = iM7519 == 49 ? c2460.m7499() : 0;
                int iM75110 = c2460.m7516();
                if (iM7519 == 47) {
                    c2460.m7535(1);
                }
                boolean z = iM7518 == 181 && (iM7519 == 49 || iM7519 == 47) && iM75110 == 3;
                if (iM7519 == 49) {
                    z &= iM7499 == 1195456820;
                }
                if (z) {
                    m31908(j, c2460, interfaceC8011Arr);
                }
            }
            c2460.m7510(iM7500);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m31908(long j, C2460 c2460, InterfaceC8011[] interfaceC8011Arr) {
        int iM7516 = c2460.m7516();
        if ((iM7516 & 64) != 0) {
            c2460.m7535(1);
            int i = (iM7516 & 31) * 3;
            int iM7500 = c2460.m7500();
            for (InterfaceC8011 interfaceC8011 : interfaceC8011Arr) {
                c2460.m7510(iM7500);
                interfaceC8011.mo8112(i, c2460);
                C2023.m6510(j != -9223372036854775807L);
                interfaceC8011.mo8114(j, 1, i, 0, null);
            }
        }
    }
}
