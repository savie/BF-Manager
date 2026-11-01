package l;

/* JADX INFO: renamed from: l.ܽۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBHV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16355 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f52655;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7182 f52656;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f52657;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6143 f52658;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19883 f52659;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo1189();

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC23411 mo1190(int i, int i2, C0498 c0498, C9300 c9300);

    /* JADX INFO: renamed from: ۚ */
    public abstract String mo1191();

    public AbstractC16355(C19883 c19883, C6143 c6143, int i, C7182 c7182) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (c7182 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f52659 = c19883;
        this.f52658 = c6143;
        this.f52657 = i;
        this.f52656 = c7182;
        this.f52655 = -1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m38523() {
        m38526();
        return this.f52655;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m38526() {
        if (this.f52655 < 0) {
            int iMo1189 = mo1189();
            int iM38525 = m38525();
            int iM46446 = this.f52657 + 2;
            C19883 c19883 = this.f52659;
            C14009 c14009M45129 = c19883.m45129();
            C11083 c11083M45133 = c19883.m45133();
            for (int i = 0; i < iM38525; i++) {
                try {
                    int iM33871 = c14009M45129.m33871(iM46446);
                    int iM33872 = c14009M45129.m33871(iM46446 + 2);
                    int iM33873 = c14009M45129.m33871(iM46446 + 4);
                    C17432 c17432 = (C17432) c11083M45133.get(iM33872);
                    C17432 c17433 = (C17432) c11083M45133.get(iM33873);
                    C20588 c20588 = new C20588(c19883, iMo1189, iM46446 + 6, this.f52656);
                    iM46446 = c20588.m46446();
                    C9300 c9300M46447 = c20588.m46447();
                    c9300M46447.mo9637();
                    mo1190(i, iM33871, new C0498(c17432, c17433), c9300M46447);
                } catch (C1537 e) {
                    e.m20021("...while parsing " + mo1191() + "s[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C1537 c1537 = new C1537(null, e2);
                    c1537.m20021("...while parsing " + mo1191() + "s[" + i + "]");
                    throw c1537;
                }
            }
            this.f52655 = iM46446;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m38525() {
        return this.f52659.m45129().m33871(this.f52657);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6143 m38524() {
        return this.f52658;
    }
}
