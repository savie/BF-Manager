package l;

/* JADX INFO: renamed from: l.ᩴ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5D2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20170 implements InterfaceC23331 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC22631 f64785;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public abstract EnumC7011 mo46398();

    public AbstractC20170(EnumC22631 enumC22631) {
        C6544.m18431(enumC22631, mo46398());
        this.f64785 = enumC22631;
    }

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۤ */
    public final EnumC22631 mo30864() {
        return this.f64785;
    }

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۨ */
    public int mo3033() {
        return mo46398().f23142 / 2;
    }
}
