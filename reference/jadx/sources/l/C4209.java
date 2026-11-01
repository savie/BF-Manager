package l;

/* JADX INFO: renamed from: l.ۘ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: B410 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4209 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC15542 f15278;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23216 f15279;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC13383 f15280;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f15281;

    public C4209(EnumC13383 enumC13383) {
        this(enumC13383, null, null, null);
    }

    public C4209(EnumC13383 enumC13383, InterfaceC2173 interfaceC2173) {
        this(enumC13383, interfaceC2173, null, null);
    }

    public C4209(EnumC13383 enumC13383, InterfaceC15542 interfaceC15542, InterfaceC23216 interfaceC23216) {
        this(enumC13383, interfaceC15542.mo25897(), interfaceC15542, interfaceC23216);
    }

    public C4209(EnumC13383 enumC13383, InterfaceC2173 interfaceC2173, InterfaceC15542 interfaceC15542, InterfaceC23216 interfaceC23216) {
        this.f15280 = enumC13383;
        this.f15281 = interfaceC2173;
        this.f15278 = interfaceC15542;
        this.f15279 = interfaceC23216;
    }

    public final String toString() {
        return "TaskEvent[" + this.f15280 + "," + this.f15281 + "," + this.f15279 + "]";
    }

    public C4209(EnumC13383 enumC13383, C10164 c10164) {
        this(enumC13383, c10164.f34725, c10164, null);
    }
}
