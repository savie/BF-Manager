package l;

/* JADX INFO: renamed from: l.֫ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public class C1925 extends AbstractC8982 {
    @Override // l.AbstractC8982
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo6259() {
        return "nth-of-type";
    }

    @Override // l.AbstractC8982
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo6258(C0617 c0617) {
        int i = 0;
        if (c0617.mo2849() == null) {
            return 0;
        }
        for (C0617 c0618 : c0617.mo2849().m2846()) {
            if (c0618.m2860().equals(c0617.m2860())) {
                i++;
            }
            if (c0618 == c0617) {
                break;
            }
        }
        return i;
    }
}
