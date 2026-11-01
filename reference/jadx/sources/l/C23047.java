package l;

/* JADX INFO: renamed from: l.᩺ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7LT */
/* JADX INFO: loaded from: classes.dex */
public final class C23047 implements InterfaceC16697 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C0954 f74867 = new C0954();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13302 f74868;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10045 f74869;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6694 f74870;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f74871;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7648 f74872;

    public C23047(InterfaceC10045 interfaceC10045, C7648 c7648, C6694 c6694, InterfaceC13302 interfaceC13302, boolean z) {
        this.f74869 = interfaceC10045;
        this.f74872 = c7648;
        this.f74870 = c6694;
        this.f74868 = interfaceC13302;
        this.f74871 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50981(C14984 c14984) {
        return this.f74869.mo2750(c14984, f74867) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23047 m50980() {
        InterfaceC10045 c5624;
        InterfaceC10045 interfaceC10045 = this.f74869;
        InterfaceC10045 interfaceC10045Mo2755 = interfaceC10045.mo2755();
        C2023.m6510(!((interfaceC10045Mo2755 instanceof C15130) || (interfaceC10045Mo2755 instanceof C17618)));
        C2023.m6509("Can't recreate wrapped extractors. Outer type: " + interfaceC10045.getClass(), interfaceC10045.mo2755() == interfaceC10045);
        if (interfaceC10045 instanceof C6446) {
            c5624 = new C6446(this.f74872.f25269, this.f74870, this.f74868, this.f74871);
        } else if (interfaceC10045 instanceof C1327) {
            c5624 = new C1327(0);
        } else if (interfaceC10045 instanceof C11912) {
            c5624 = new C11912();
        } else if (interfaceC10045 instanceof C5561) {
            c5624 = new C5561();
        } else {
            if (!(interfaceC10045 instanceof C5624)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC10045.getClass().getSimpleName()));
            }
            c5624 = new C5624(0);
        }
        return new C23047(c5624, this.f74872, this.f74870, this.f74868, this.f74871);
    }
}
