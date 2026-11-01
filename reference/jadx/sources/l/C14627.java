package l;

/* JADX INFO: renamed from: l.ܳܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public class C14627 extends AbstractC8982 {
    @Override // l.AbstractC8982
    /* JADX INFO: renamed from: ۙ */
    public final String mo6259() {
        return "nth-last-of-type";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC8982
    /* JADX INFO: renamed from: ۙ */
    public final int mo6258(C0617 c0617) {
        int i = 0;
        if (c0617.mo2849() == null) {
            return 0;
        }
        C4747 c4747M2846 = c0617.mo2849().m2846();
        for (int iM2873 = c0617.m2873(); iM2873 < c4747M2846.size(); iM2873++) {
            if (((C0617) c4747M2846.get(iM2873)).m2860().equals(c0617.m2860())) {
                i++;
            }
        }
        return i;
    }
}
