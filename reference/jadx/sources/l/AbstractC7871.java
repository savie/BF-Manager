package l;

/* JADX INFO: renamed from: l.۟ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBHV */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7871 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4142 f26207;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1028 f26208;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f26209;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18312 f26210;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f26211;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo2218();

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC2650 mo2219(int i, int i2, C0282 c0282, C13836 c13836);

    /* JADX INFO: renamed from: ᩴ */
    public abstract String mo2221();

    public AbstractC7871(C18312 c18312, C1028 c1028, int i, C4142 c4142) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (c4142 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f26210 = c18312;
        this.f26208 = c1028;
        this.f26209 = i;
        this.f26207 = c4142;
        this.f26211 = -1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m21401() {
        m21399();
        return this.f26211;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m21399() {
        if (this.f26211 < 0) {
            int iMo2218 = mo2218();
            int iM21400 = m21400();
            int iM35181 = this.f26209 + 2;
            C18312 c18312 = this.f26210;
            C22460 c22460M42713 = c18312.m42713();
            C9230 c9230M42711 = c18312.m42711();
            for (int i = 0; i < iM21400; i++) {
                try {
                    int iM50641 = c22460M42713.m50641(iM35181);
                    int iM50642 = c22460M42713.m50641(iM35181 + 2);
                    int iM50643 = c22460M42713.m50641(iM35181 + 4);
                    C9976 c9976 = (C9976) c9230M42711.get(iM50642);
                    C9976 c9977 = (C9976) c9230M42711.get(iM50643);
                    C14582 c14582 = new C14582(c18312, iMo2218, iM35181 + 6, this.f26207);
                    iM35181 = c14582.m35181();
                    C13836 c13836M35182 = c14582.m35182();
                    c13836M35182.mo15005();
                    mo2219(i, iM50641, new C0282(c9976, c9977), c13836M35182);
                } catch (C7125 e) {
                    e.m12508("...while parsing " + mo2221() + "s[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C7125 c7125 = new C7125(null, e2);
                    c7125.m12508("...while parsing " + mo2221() + "s[" + i + "]");
                    throw c7125;
                }
            }
            this.f26211 = iM35181;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21400() {
        return this.f26210.m42713().m50641(this.f26209);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1028 m21398() {
        return this.f26208;
    }
}
