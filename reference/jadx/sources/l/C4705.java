package l;

/* JADX INFO: renamed from: l.ۙۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4705 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f16606;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4705 m14596(C21287 c21287) {
        String str;
        c21287.m48503(2);
        int iM48493 = c21287.m48493();
        int i = iM48493 >> 1;
        int iM48494 = ((c21287.m48493() >> 3) & 31) | ((iM48493 & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(i < 10 ? ".0" : ".");
        sbM27333.append(i);
        sbM27333.append(iM48494 < 10 ? ".0" : ".");
        sbM27333.append(iM48494);
        return new C4705(sbM27333.toString());
    }

    public C4705(String str) {
        this.f16606 = str;
    }
}
