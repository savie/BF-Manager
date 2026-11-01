package l;

/* JADX INFO: renamed from: l.֡᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T5IF */
/* JADX INFO: loaded from: classes2.dex */
public class C0647 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4777 mo2941(AbstractC4777 abstractC4777) {
        int i = C20404.f66107[abstractC4777.f16801.ordinal()];
        if (i == 2) {
            abstractC4777.mo5125(mo2942(abstractC4777.mo5126()));
            return abstractC4777;
        }
        if (i != 3) {
            if (i != 4) {
                return abstractC4777;
            }
            throw null;
        }
        abstractC4777.mo13248(mo2942(abstractC4777.mo13244()));
        abstractC4777.mo13246(mo2942(abstractC4777.mo13245()));
        return abstractC4777;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC7124 mo2942(AbstractC7124 abstractC7124) {
        int i = C20404.f66107[abstractC7124.f23822.ordinal()];
        if (i == 2) {
            abstractC7124.mo19021(mo2942(abstractC7124.mo19020()));
            return abstractC7124;
        }
        if (i == 3) {
            abstractC7124.mo19026(mo2942(abstractC7124.mo19024()));
            abstractC7124.mo19025(mo2942(abstractC7124.mo19019()));
            return abstractC7124;
        }
        if (i == 4) {
            AbstractC7124[] abstractC7124ArrMo19023 = abstractC7124.mo19023();
            for (int i2 = 0; i2 < abstractC7124ArrMo19023.length; i2++) {
                abstractC7124ArrMo19023[i2] = mo2942(abstractC7124ArrMo19023[i2]);
            }
        }
        return abstractC7124;
    }
}
