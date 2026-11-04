package l;

/* JADX INFO: renamed from: l.᩻ܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes.dex */
public class C25172 implements InterfaceC4288 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24404 f81361;

    public C25172(C24404 c24404) {
        this.f81361 = c24404;
    }

    @Override // l.InterfaceC4288
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public InterfaceC23331 mo2798(InterfaceC23331 interfaceC23331) {
        if (!(interfaceC23331 instanceof InterfaceC6177)) {
            return interfaceC23331;
        }
        switch (C13960.f44262[interfaceC23331.mo30864().f73508.ordinal()]) {
            case 1:
                return new C10999(this, (InterfaceC13633) interfaceC23331);
            case 2:
                return new C22934(this, (InterfaceC21729) interfaceC23331);
            case 3:
                return new C19950(this, (InterfaceC5321) interfaceC23331);
            case 4:
                return new C15474(this, (InterfaceC23221) interfaceC23331);
            case 5:
                return new C13237(this, (InterfaceC6067) interfaceC23331);
            case 6:
                return new C5780(this, (InterfaceC14269) interfaceC23331);
            case 7:
                return new C2051(this, (InterfaceC0100) interfaceC23331);
            case 8:
                return new C11745(this, (InterfaceC7558) interfaceC23331);
            default:
                throw new IllegalArgumentException(interfaceC23331.mo30864().f73509);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10824 m56092(C25172 c25172, int i, InterfaceC10824 interfaceC10824) {
        C24404 c24404 = c25172.f81361;
        switch (i) {
            case 0:
                return (InterfaceC10824) c24404.m54592().mo2798((InterfaceC22759) interfaceC10824);
            case 1:
                return new C8762(c24404.m54589(), (InterfaceC19775) interfaceC10824);
            case 2:
                return (InterfaceC10824) c24404.m54580().mo2798((InterfaceC8304) interfaceC10824);
            case 3:
                return (InterfaceC10824) c24404.m54587().mo2798((InterfaceC4859) interfaceC10824);
            case 4:
                return new C22144(c24404.m54589(), (InterfaceC13524) interfaceC10824);
            case 5:
                C2029 c2029M54581 = c24404.m54581();
                c2029M54581.getClass();
                return new C5758(c2029M54581, (InterfaceC2338) interfaceC10824);
            case 6:
                return C19906.m45838((InterfaceC6813) interfaceC10824, c24404);
            default:
                throw new C23044(null, "Invalid reference type: %d", Integer.valueOf(i));
        }
    }
}
