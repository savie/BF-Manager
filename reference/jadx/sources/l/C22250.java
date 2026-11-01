package l;

/* JADX INFO: renamed from: l.᩹ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J4YT */
/* JADX INFO: loaded from: classes2.dex */
public final class C22250 extends AbstractC4465 implements InterfaceC20209 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f72734 = EnumC18057.Format21t;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f72735;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", " + mo8965();
    }

    public C22250(EnumC10297 enumC10297, int i, C5171 c5171) {
        super(enumC10297, c5171);
        C13530.m33075(i);
        this.f72735 = i;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f72735;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f72734;
    }
}
