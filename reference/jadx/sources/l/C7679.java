package l;

/* JADX INFO: renamed from: l.۟ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8HG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7679 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20917(long j, C21287 c21287, InterfaceC22024[] interfaceC22024Arr) {
        int i;
        int iM48493;
        while (true) {
            if (c21287.m48486() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (c21287.m48486() == 0) {
                    i = -1;
                    break;
                }
                int iM48494 = c21287.m48493();
                i2 += iM48494;
                if (iM48494 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (c21287.m48486() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iM48493 = c21287.m48493();
                    i3 += iM48493;
                }
            } while (iM48493 == 255);
            int iM48516 = c21287.m48516() + i3;
            if (i3 == -1 || i3 > c21287.m48486()) {
                C1896.m6517("Skipping remainder of malformed SEI NAL unit.");
                iM48516 = c21287.m48509();
            } else if (i == 4 && i3 >= 8) {
                int iM48495 = c21287.m48493();
                int iM48496 = c21287.m48494();
                int iM48500 = iM48496 == 49 ? c21287.m48500() : 0;
                int iM48497 = c21287.m48493();
                if (iM48496 == 47) {
                    c21287.m48503(1);
                }
                boolean z = iM48495 == 181 && (iM48496 == 49 || iM48496 == 47) && iM48497 == 3;
                if (iM48496 == 49) {
                    z &= iM48500 == 1195456820;
                }
                if (z) {
                    m20918(j, c21287, interfaceC22024Arr);
                }
            }
            c21287.m48510(iM48516);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20918(long j, C21287 c21287, InterfaceC22024[] interfaceC22024Arr) {
        int iM48493 = c21287.m48493();
        if ((iM48493 & 64) != 0) {
            c21287.m48503(1);
            int i = (iM48493 & 31) * 3;
            int iM48516 = c21287.m48516();
            for (InterfaceC22024 interfaceC22024 : interfaceC22024Arr) {
                c21287.m48510(iM48516);
                interfaceC22024.mo14381(i, c21287);
                C20782.m47568(j != -9223372036854775807L);
                interfaceC22024.mo14383(j, 1, i, 0, null);
            }
        }
    }
}
