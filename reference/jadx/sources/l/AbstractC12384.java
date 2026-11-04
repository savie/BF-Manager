package l;

/* JADX INFO: renamed from: l.ۨ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A67V */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12384 implements InterfaceC23331 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9400 f39755;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC22631 f39756;

    /* JADX INFO: renamed from: ۢ */
    public abstract EnumC7011 mo1544();

    public AbstractC12384(EnumC22631 enumC22631) {
        C6544.m18431(enumC22631, mo1544());
        this.f39756 = enumC22631;
    }

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC22631 mo30864() {
        return this.f39756;
    }

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۨ */
    public int mo3033() {
        return mo1544().f23142 / 2;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C9400 m30863() {
        C9400 c9400 = this.f39755;
        if (c9400 != null) {
            return c9400;
        }
        throw new IllegalStateException("Cannot get the location of an instruction that hasn't been added to a method.");
    }

    public final String toString() {
        return mo1543();
    }
}
