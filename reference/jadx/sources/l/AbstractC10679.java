package l;

/* JADX INFO: renamed from: l.ۤۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB9T */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10679 implements InterfaceC2650 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33903;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1028 f33904;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13836 f33905;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0282 f33906;

    public AbstractC10679(C1028 c1028, int i, C0282 c0282, C13836 c13836) {
        if (c1028 == null) {
            throw new NullPointerException("definingClass == null");
        }
        this.f33904 = c1028;
        this.f33903 = i;
        this.f33906 = c0282;
        this.f33905 = c13836;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.f33906.mo1843());
        sb.append('}');
        return sb.toString();
    }

    @Override // l.InterfaceC2650
    /* JADX INFO: renamed from: ܳ */
    public final C1028 mo8782() {
        return this.f33904;
    }

    @Override // l.InterfaceC2650
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8783() {
        return this.f33903;
    }

    @Override // l.InterfaceC2650
    /* JADX INFO: renamed from: ۚ */
    public final C0282 mo8780() {
        return this.f33906;
    }

    @Override // l.InterfaceC2650
    public final C9976 getName() {
        return this.f33906.getName();
    }

    @Override // l.InterfaceC2650
    /* JADX INFO: renamed from: ۫ */
    public final C9976 mo8781() {
        return this.f33906.m1846();
    }

    @Override // l.InterfaceC2650
    public final C13836 getAttributes() {
        return this.f33905;
    }
}
