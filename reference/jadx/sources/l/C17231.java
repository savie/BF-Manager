package l;

/* JADX INFO: renamed from: l.ܽ֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public class C17231 extends AbstractC13763 {
    @Override // l.AbstractC13763
    /* JADX INFO: renamed from: ۙ */
    public final String mo33653() {
        return "nth-last-of-type";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC13763
    /* JADX INFO: renamed from: ۙ */
    public final int mo33652(C15496 c15496) {
        int i = 0;
        if (c15496.mo37068() == null) {
            return 0;
        }
        C20477 c20477M37082 = c15496.mo37068().m37082();
        for (int iM37081 = c15496.m37081(); iM37081 < c20477M37082.size(); iM37081++) {
            if (((C15496) c20477M37082.get(iM37081)).m37077().equals(c15496.m37077())) {
                i++;
            }
        }
        return i;
    }
}
