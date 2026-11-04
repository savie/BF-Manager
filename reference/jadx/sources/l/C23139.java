package l;

/* JADX INFO: renamed from: l.᩸᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BF0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23139 extends AbstractC14933 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7521 f75019;

    public C23139(C9012 c9012, C7521 c7521) {
        super(c9012);
        if (c7521 == null) {
            throw new NullPointerException("locals == null");
        }
        this.f75019 = c7521;
    }

    @Override // l.AbstractC14933, l.AbstractC18884
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC18884 mo8332(int i) {
        return new C23139(m43799(), this.f75019.m20584(i));
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo18813(C0063 c0063) {
        return new C23139(m43799(), this.f75019);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7521 m52062() {
        return this.f75019;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final String mo18812() {
        return this.f75019.toString();
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ܺ */
    public final String mo8330() {
        C7521 c7521 = this.f75019;
        int size = c7521.size();
        int iM20590 = c7521.m20590();
        StringBuilder sb = new StringBuilder((size * 40) + 100);
        sb.append("local-snapshot");
        for (int i = 0; i < iM20590; i++) {
            C20946 c20946 = c7521.get(i);
            if (c20946 != null) {
                sb.append("\n  ");
                sb.append(C20155.m46372(c20946));
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo43797(C22985 c22985) {
        C9012 c9012M43799 = m43799();
        C7521 c7521 = this.f75019;
        int iM20590 = c7521.m20590();
        C7521 c7522 = new C7521(c22985.m51867());
        for (int i = 0; i < iM20590; i++) {
            C20946 c20946 = c7521.get(i);
            if (c20946 != null) {
                c7522.m20592(c22985.mo21960(c20946));
            }
        }
        c7522.mo15005();
        if (!c7522.equals(c7521)) {
            c7521 = c7522;
        }
        return new C23139(c9012M43799, c7521);
    }
}
