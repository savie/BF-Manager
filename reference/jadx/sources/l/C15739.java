package l;

/* JADX INFO: renamed from: l.ܶ֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public class C15739 extends AbstractC13763 {
    @Override // l.AbstractC13763
    /* JADX INFO: renamed from: ۙ */
    public final String mo33653() {
        return "nth-of-type";
    }

    @Override // l.AbstractC13763
    /* JADX INFO: renamed from: ۙ */
    public final int mo33652(C15496 c15496) {
        int i = 0;
        if (c15496.mo37068() == null) {
            return 0;
        }
        for (C15496 c15497 : c15496.mo37068().m37082()) {
            if (c15497.m37077().equals(c15496.m37077())) {
                i++;
            }
            if (c15497 == c15496) {
                break;
            }
        }
        return i;
    }
}
