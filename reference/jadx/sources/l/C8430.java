package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 94TD */
/* JADX INFO: loaded from: classes3.dex */
public class C8430 extends AbstractC7724 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f29278;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20424 f29279;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f29280;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f29281;

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ܰ */
    public double mo5599() {
        return 0.0d;
    }

    public final int hashCode() {
        return this.f25545;
    }

    /* JADX INFO: renamed from: ۘ */
    public int mo5598() {
        return this.f25545;
    }

    public C8430(C20424 c20424, int i, String str) {
        super(i);
        this.f29279 = c20424;
        this.f29278 = str;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m22076() {
        return this.f29281;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22078(String str) {
        this.f29281 = str;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m22081() {
        return this.f29281 != null;
    }

    @Override // l.AbstractC7724, java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(AbstractC7724 abstractC7724) {
        int iCompareTo = super.compareTo(abstractC7724);
        if (iCompareTo != 0 || !(abstractC7724 instanceof C8430)) {
            return iCompareTo;
        }
        return this.f29278.compareTo(((C8430) abstractC7724).f29278);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8430) && compareTo((AbstractC7724) obj) == 0;
    }

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1773(C12283 c12283) throws IOException {
        c12283.write(58);
        c12283.write(this.f29278);
        if (this.f29279.f66197) {
            c12283.mo6726(this.f29280);
        } else {
            c12283.mo6726(mo5598());
        }
        if (this.f29281 == null) {
            return true;
        }
        c12283.write("  #", 0, 3);
        c12283.write(this.f29281);
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22080(C12283 c12283) throws IOException {
        c12283.write(58);
        c12283.write(this.f29278);
        if (this.f29279.f66197) {
            c12283.mo6726(this.f29280);
        } else {
            c12283.mo6726(mo5598());
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m22079() {
        return this.f29278;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22077(int i) {
        this.f29280 = i;
    }
}
