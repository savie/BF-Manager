package l;

/* JADX INFO: renamed from: l.֨᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BCI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C1433 f5889 = new C1433();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5008(C12723 c12723, C16251 c16251, C16251 c16252) {
        if (c16251.getType() == C3320.f12281) {
            if (!(c16252.m38401() instanceof C21665)) {
                if ((c16251.m38401() instanceof C21665) && c12723.m31572() == 15) {
                    C21665 c21665 = (C21665) c16251.m38401();
                    c21665.getClass();
                    int iMo21658 = c21665.mo21658();
                    return ((short) iMo21658) == iMo21658;
                }
            } else {
                C21665 c21666 = (C21665) c16252.m38401();
                switch (c12723.m31572()) {
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                        c21666.getClass();
                        int iMo21659 = c21666.mo21658();
                        if (((short) iMo21659) == iMo21659) {
                            return true;
                        }
                        break;
                    case 15:
                        int iMo216510 = C21665.m48398(-c21666.mo21658()).mo21658();
                        return ((short) iMo216510) == iMo216510;
                    case 23:
                    case 24:
                    case 25:
                        c21666.getClass();
                        int iMo216511 = c21666.mo21658();
                        if (((byte) iMo216511) == iMo216511) {
                            return true;
                        }
                        break;
                }
            }
        }
        return false;
    }
}
