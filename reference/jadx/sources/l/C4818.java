package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94TD */
/* JADX INFO: loaded from: classes3.dex */
public class C4818 extends AbstractC19734 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f16857;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C5564 f16858;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f16859;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f16860;

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ᩸ */
    public double mo13837() {
        return 0.0d;
    }

    public final int hashCode() {
        return this.f63511;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo14841() {
        return this.f63511;
    }

    public C4818(C5564 c5564, int i, String str) {
        super(i);
        this.f16858 = c5564;
        this.f16859 = str;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m14846() {
        return this.f16860;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14844(String str) {
        this.f16860 = str;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m14848() {
        return this.f16860 != null;
    }

    @Override // l.AbstractC19734, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int compareTo(AbstractC19734 abstractC19734) {
        int iCompareTo = super.compareTo(abstractC19734);
        if (iCompareTo != 0 || !(abstractC19734 instanceof C4818)) {
            return iCompareTo;
        }
        return this.f16859.compareTo(((C4818) abstractC19734).f16859);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4818) && compareTo((AbstractC19734) obj) == 0;
    }

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4982(C2161 c2161) throws IOException {
        c2161.write(58);
        c2161.write(this.f16859);
        if (this.f16858.f19335) {
            c2161.mo7441(this.f16857);
        } else {
            c2161.mo7441(mo14841());
        }
        if (this.f16860 == null) {
            return true;
        }
        c2161.write("  #", 0, 3);
        c2161.write(this.f16860);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14847(C2161 c2161) throws IOException {
        c2161.write(58);
        c2161.write(this.f16859);
        if (this.f16858.f19335) {
            c2161.mo7441(this.f16857);
        } else {
            c2161.mo7441(mo14841());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m14845() {
        return this.f16859;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14843(int i) {
        this.f16857 = i;
    }
}
