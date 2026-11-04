package l;

/* JADX INFO: renamed from: l.᩸ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBDV */
/* JADX INFO: loaded from: classes.dex */
public class C22985 extends AbstractC21976 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24698 f74626;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f74627;

    public C22985(int i) {
        this.f74626 = new C24698(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51867() {
        return this.f74627;
    }

    @Override // l.AbstractC21976
    /* JADX INFO: renamed from: ۙ */
    public final C20946 mo21960(C20946 c20946) {
        int i;
        if (c20946 == null) {
            return null;
        }
        try {
            i = this.f74626.get(c20946.m47903());
        } catch (IndexOutOfBoundsException unused) {
            i = -1;
        }
        if (i < 0) {
            throw new RuntimeException("no mapping specified for register");
        }
        return c20946.m47899(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51868(int i) {
        C24698 c24698 = this.f74626;
        if (i >= c24698.size()) {
            return -1;
        }
        return c24698.get(i);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo13841(int i, int i2, int i3) {
        C24698 c24698 = this.f74626;
        if (i >= c24698.size()) {
            for (int size = i - c24698.size(); size >= 0; size--) {
                c24698.add(-1);
            }
        }
        c24698.set(i, i2);
        int i4 = i2 + i3;
        if (this.f74627 < i4) {
            this.f74627 = i4;
        }
    }
}
