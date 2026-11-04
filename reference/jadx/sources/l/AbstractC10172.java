package l;

/* JADX INFO: renamed from: l.ۢܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBAF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10172 extends AbstractC23599 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32566;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19123 f32567;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f32568;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f32569;

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo1456();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo1457(C10918 c10918, C15000 c15000);

    /* JADX INFO: renamed from: ᩷ */
    public void mo1458(C19123 c19123, int i) {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC10172 abstractC10172 = (AbstractC10172) obj;
        if (this == abstractC10172) {
            return 0;
        }
        EnumC3461 enumC3461Mo1454 = mo1454();
        EnumC3461 enumC3461Mo1455 = abstractC10172.mo1454();
        if (enumC3461Mo1454 != enumC3461Mo1455) {
            return enumC3461Mo1454.compareTo(enumC3461Mo1455);
        }
        return mo15563(abstractC10172);
    }

    public AbstractC10172(int i, int i2) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.f32569 = i;
        this.f32566 = i2;
        this.f32567 = null;
        this.f32568 = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC10172 abstractC10172 = (AbstractC10172) obj;
        return mo1454() == abstractC10172.mo1454() && mo15563(abstractC10172) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26283(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.f32566 >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.f32566 = i;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13418() {
        int i = this.f32566;
        if (i >= 0) {
            return i;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo13417(C10918 c10918, C15000 c15000) {
        c15000.m36110(this.f32569);
        try {
            if (this.f32566 < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            c15000.m36127(m26285());
            mo1457(c10918, c15000);
        } catch (RuntimeException e) {
            throw C3880.m12507("...while writing " + this, e);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m26285() {
        int i = this.f32568;
        if (i < 0) {
            throw new RuntimeException("offset not yet known");
        }
        return this.f32567.m23360(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26282(C19123 c19123, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.f32567 != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.f32569 - 1;
        int i3 = (i + i2) & (~i2);
        this.f32567 = c19123;
        this.f32568 = i3;
        mo1458(c19123, i3);
        return i3;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m26284() {
        return this.f32569;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m26281() {
        return "[" + Integer.toHexString(m26285()) + ']';
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo15563(AbstractC10172 abstractC10172) {
        throw new UnsupportedOperationException("unsupported");
    }
}
