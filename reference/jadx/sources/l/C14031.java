package l;

/* JADX INFO: renamed from: l.ܰ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14031 extends AbstractC11914 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f46141;

    public C14031(float f, float f2) {
        this.f40006 = f;
        this.f46141 = f2;
        this.f40007 = true;
    }

    @Override // l.AbstractC11914
    /* JADX INFO: renamed from: ۨ */
    public final Float mo29723() {
        return Float.valueOf(this.f46141);
    }

    @Override // l.AbstractC11914
    /* JADX INFO: renamed from: ۙ */
    public final void mo29722(Object obj) {
        if (obj == null || obj.getClass() != Float.class) {
            return;
        }
        this.f46141 = ((Float) obj).floatValue();
        this.f40007 = true;
    }

    @Override // l.AbstractC11914
    public final Object clone() {
        C14031 c14031 = new C14031(this.f40006, this.f46141);
        c14031.m29721(m29720());
        return c14031;
    }

    @Override // l.AbstractC11914
    public final AbstractC11914 clone() {
        C14031 c14031 = new C14031(this.f40006, this.f46141);
        c14031.m29721(m29720());
        return c14031;
    }
}
