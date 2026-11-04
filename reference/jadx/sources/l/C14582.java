package l;

/* JADX INFO: renamed from: l.ܰۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBC9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14582 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4142 f45952;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f45953;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f45954;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13836 f45955;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18312 f45956;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f45957;

    public C14582(C18312 c18312, int i, int i2, C4142 c4142) {
        if (c18312 == null) {
            throw new NullPointerException("cf == null");
        }
        if (c4142 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int iM50641 = c18312.m42713().m50641(i2);
        this.f45956 = c18312;
        this.f45953 = i;
        this.f45954 = i2;
        this.f45952 = c4142;
        this.f45955 = new C13836(iM50641);
        this.f45957 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35181() {
        m35180();
        return this.f45957;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13836 m35182() {
        m35180();
        return this.f45955;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m35180() {
        if (this.f45957 < 0) {
            C13836 c13836 = this.f45955;
            int size = c13836.size();
            int iMo1345 = this.f45954 + 2;
            C18312 c18312 = this.f45956;
            c18312.getClass();
            for (int i = 0; i < size; i++) {
                try {
                    AbstractC5875 abstractC5875M13269 = this.f45952.m13269(c18312, this.f45953, iMo1345);
                    iMo1345 += abstractC5875M13269.mo1345();
                    c13836.m31601(i, abstractC5875M13269);
                } catch (C7125 e) {
                    e.m12508("...while parsing attributes[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C7125 c7125 = new C7125(null, e2);
                    c7125.m12508("...while parsing attributes[" + i + "]");
                    throw c7125;
                }
            }
            this.f45957 = iMo1345;
        }
    }
}
