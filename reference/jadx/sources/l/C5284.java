package l;

/* JADX INFO: renamed from: l.ۚ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BCI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5284 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C5284 f18610 = new C5284();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15881(C18708 c18708, C20946 c20946, C20946 c20947) {
        if (c20946.getType() == C5085.f17753) {
            if (!(c20947.m47898() instanceof C15943)) {
                if ((c20946.m47898() instanceof C15943) && c18708.m43509() == 15) {
                    C15943 c15943 = (C15943) c20946.m47898();
                    c15943.getClass();
                    int iMo17877 = c15943.mo17877();
                    return ((short) iMo17877) == iMo17877;
                }
            } else {
                C15943 c15944 = (C15943) c20947.m47898();
                switch (c18708.m43509()) {
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                        c15944.getClass();
                        int iMo17878 = c15944.mo17877();
                        if (((short) iMo17878) == iMo17878) {
                            return true;
                        }
                        break;
                    case 15:
                        int iMo17879 = C15943.m37967(-c15944.mo17877()).mo17877();
                        return ((short) iMo17879) == iMo17879;
                    case 23:
                    case 24:
                    case 25:
                        c15944.getClass();
                        int iMo178710 = c15944.mo17877();
                        if (((byte) iMo178710) == iMo178710) {
                            return true;
                        }
                        break;
                }
            }
        }
        return false;
    }
}
