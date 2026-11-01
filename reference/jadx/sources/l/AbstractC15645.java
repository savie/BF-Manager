package l;

/* JADX INFO: renamed from: l.ܺۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5D2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15645 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC10297 f50843;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public abstract EnumC18057 mo37320();

    public AbstractC15645(EnumC10297 enumC10297) {
        C13530.m33065(enumC10297, mo37320());
        this.f50843 = enumC10297;
    }

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۜ */
    public final EnumC10297 mo5435() {
        return this.f50843;
    }

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۡ */
    public int mo5436() {
        return mo37320().f57758 / 2;
    }
}
