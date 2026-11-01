package l;

/* JADX INFO: renamed from: l.᩷ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBC9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20588 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f67083;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7182 f67084;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9300 f67085;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f67086;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19883 f67087;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f67088;

    public C20588(C19883 c19883, int i, int i2, C7182 c7182) {
        if (c19883 == null) {
            throw new NullPointerException("cf == null");
        }
        if (c7182 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int iM33871 = c19883.m45129().m33871(i2);
        this.f67087 = c19883;
        this.f67086 = i;
        this.f67088 = i2;
        this.f67084 = c7182;
        this.f67085 = new C9300(iM33871);
        this.f67083 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46446() {
        m46445();
        return this.f67083;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9300 m46447() {
        m46445();
        return this.f67085;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m46445() {
        if (this.f67083 < 0) {
            C9300 c9300 = this.f67085;
            int size = c9300.size();
            int iMo2281 = this.f67088 + 2;
            C19883 c19883 = this.f67087;
            c19883.getClass();
            for (int i = 0; i < size; i++) {
                try {
                    AbstractC1100 abstractC1100M19114 = this.f67084.m19114(c19883, this.f67086, iMo2281);
                    iMo2281 += abstractC1100M19114.mo2281();
                    c9300.m15253(i, abstractC1100M19114);
                } catch (C1537 e) {
                    e.m20021("...while parsing attributes[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C1537 c1537 = new C1537(null, e2);
                    c1537.m20021("...while parsing attributes[" + i + "]");
                    throw c1537;
                }
            }
            this.f67083 = iMo2281;
        }
    }
}
