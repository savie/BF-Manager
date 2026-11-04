package l;

/* JADX INFO: renamed from: l.ۘۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B410 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3975 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3804 f13616;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC24113 f13617;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f13618;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC18560 f13619;

    public C3975(EnumC24113 enumC24113) {
        this(enumC24113, null, null, null);
    }

    public C3975(EnumC24113 enumC24113, InterfaceC15976 interfaceC15976) {
        this(enumC24113, interfaceC15976, null, null);
    }

    public C3975(EnumC24113 enumC24113, InterfaceC18560 interfaceC18560, InterfaceC3804 interfaceC3804) {
        this(enumC24113, interfaceC18560.mo43139(), interfaceC18560, interfaceC3804);
    }

    public C3975(EnumC24113 enumC24113, InterfaceC15976 interfaceC15976, InterfaceC18560 interfaceC18560, InterfaceC3804 interfaceC3804) {
        this.f13617 = enumC24113;
        this.f13618 = interfaceC15976;
        this.f13619 = interfaceC18560;
        this.f13616 = interfaceC3804;
    }

    public final String toString() {
        return "TaskEvent[" + this.f13617 + "," + this.f13618 + "," + this.f13616 + "]";
    }

    public C3975(EnumC24113 enumC24113, C19113 c19113) {
        this(enumC24113, c19113.f61856, c19113, null);
    }
}
