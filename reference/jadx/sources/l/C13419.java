package l;

/* JADX INFO: renamed from: l.۬᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13419 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5657 f44382;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC9414 f44383;

    public C13419(InterfaceC22591 interfaceC22591, EnumC9414 enumC9414) {
        C13465.m32966(enumC9414, "initialState");
        C13465.m32962(interfaceC22591);
        this.f44382 = C15536.m37146(interfaceC22591);
        this.f44383 = enumC9414;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC9414 m32907() {
        return this.f44383;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32908(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        EnumC9414 enumC9414M5550 = enumC1651.m5550();
        EnumC9414 enumC9414 = this.f44383;
        C13465.m32966(enumC9414, "state1");
        if (enumC9414M5550 != null && enumC9414M5550.compareTo(enumC9414) < 0) {
            enumC9414 = enumC9414M5550;
        }
        this.f44383 = enumC9414;
        this.f44382.mo4164(interfaceC1423, enumC1651);
        this.f44383 = enumC9414M5550;
    }
}
