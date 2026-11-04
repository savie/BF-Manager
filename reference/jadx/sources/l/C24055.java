package l;

/* JADX INFO: renamed from: l.᩺ۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5OF */
/* JADX INFO: loaded from: classes2.dex */
public class C24055 extends AbstractC12384 implements InterfaceC21729, InterfaceC21839 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f77792 = EnumC7011.Format21c;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f77793;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC10824 f77794;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", " + getReference();
    }

    public C24055(EnumC22631 enumC22631, int i, InterfaceC10824 interfaceC10824) {
        super(enumC22631);
        C6544.m18435(i);
        this.f77793 = i;
        this.f77794 = interfaceC10824;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f77793;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        return this.f77794;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f77794 = c8850.m23714(this.f77794);
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        return this.f39756.f73513;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f77792;
    }
}
