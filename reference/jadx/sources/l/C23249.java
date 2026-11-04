package l;

/* JADX INFO: renamed from: l.᩹ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VS */
/* JADX INFO: loaded from: classes.dex */
public final class C23249 extends AbstractC3111 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f75329;

    public C23249(float f, float f2) {
        this.f10078 = f;
        this.f75329 = f2;
        this.f10080 = true;
    }

    @Override // l.AbstractC3111
    /* JADX INFO: renamed from: ᩷ */
    public final Float mo10182() {
        return Float.valueOf(this.f75329);
    }

    @Override // l.AbstractC3111
    /* JADX INFO: renamed from: ۙ */
    public final void mo10181(Object obj) {
        if (obj == null || obj.getClass() != Float.class) {
            return;
        }
        this.f75329 = ((Float) obj).floatValue();
        this.f10080 = true;
    }

    @Override // l.AbstractC3111
    public final Object clone() {
        C23249 c23249 = new C23249(this.f10078, this.f75329);
        c23249.m10180(m10179());
        return c23249;
    }

    @Override // l.AbstractC3111
    public final AbstractC3111 clone() {
        C23249 c23249 = new C23249(this.f10078, this.f75329);
        c23249.m10180(m10179());
        return c23249;
    }
}
