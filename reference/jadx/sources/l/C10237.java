package l;

/* JADX INFO: renamed from: l.ۢܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9E5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10237 extends C24652 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C6117 f32709;

    public C10237(EnumC15700 enumC15700, C6117 c6117, long j) {
        super(9, enumC15700, EnumC23906.SMB2_TREE_CONNECT, j, 0L);
        this.f32709 = c6117;
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7006(C7453 c7453) {
        c7453.m56023(this.f79801);
        EnumC15700 enumC15700 = EnumC15700.UNKNOWN;
        c7453.m20461();
        c7453.m56023(72);
        String strM17653 = this.f32709.m17653();
        if (strM17653 == null) {
            c7453.m56023(0);
        } else {
            c7453.m56023(strM17653.length() * 2);
        }
        c7453.m56026(strM17653, C22150.f71349);
    }
}
