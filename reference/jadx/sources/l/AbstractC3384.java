package l;

/* JADX INFO: renamed from: l.ۗܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A67V */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3384 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15050 f12505;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC10297 f12506;

    /* JADX INFO: renamed from: ۛ */
    public abstract EnumC18057 mo2108();

    public AbstractC3384(EnumC10297 enumC10297) {
        C13530.m33065(enumC10297, mo2108());
        this.f12506 = enumC10297;
    }

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۜ */
    public final EnumC10297 mo5435() {
        return this.f12506;
    }

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۡ */
    public int mo5436() {
        return mo2108().f57758 / 2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15050 m10035() {
        C15050 c15050 = this.f12505;
        if (c15050 != null) {
            return c15050;
        }
        throw new IllegalStateException("Cannot get the location of an instruction that hasn't been added to a method.");
    }

    public final String toString() {
        return mo1142();
    }
}
