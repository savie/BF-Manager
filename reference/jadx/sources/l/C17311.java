package l;

/* JADX INFO: renamed from: l.ܿۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 04XX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17311 extends AbstractC3384 implements InterfaceC6740 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f55089 = EnumC18057.Format51l;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f55090;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f55091;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", " + mo4062();
    }

    public C17311(EnumC10297 enumC10297, int i, long j) {
        super(enumC10297);
        C13530.m33075(i);
        this.f55091 = i;
        this.f55090 = j;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f55091;
    }

    @Override // l.InterfaceC6802
    /* JADX INFO: renamed from: ܺ */
    public final long mo4062() {
        return this.f55090;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f55089;
    }
}
