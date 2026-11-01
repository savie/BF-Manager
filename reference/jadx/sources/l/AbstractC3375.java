package l;

/* JADX INFO: renamed from: l.ۗܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3375 extends AbstractC19460 implements InterfaceC23133, InterfaceC0553 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2339 f12493;

    @Override // l.InterfaceC0553
    /* JADX INFO: renamed from: ۖ */
    public final C0928 mo2638() {
        return null;
    }

    @Override // l.InterfaceC0553
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo2639() {
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2339 m10026() {
        C2339 c2339 = this.f12493;
        if (c2339 != null) {
            return c2339;
        }
        C13465.m32968("job");
        throw null;
    }

    @Override // l.InterfaceC23133
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo10025() {
        m10026().m7115(this);
    }

    @Override // l.C4269
    public final String toString() {
        return getClass().getSimpleName() + '@' + C13961.m33816(this) + "[job@" + C13961.m33816(m10026()) + ']';
    }

    public InterfaceC11138 getParent() {
        return m10026();
    }
}
