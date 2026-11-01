package l;

/* JADX INFO: renamed from: l.᩺᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1X3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23295 extends AbstractC2832 {
    @Override // l.AbstractC1421
    /* JADX INFO: renamed from: ۙ */
    public final String mo4983() {
        return "ParameterBytes";
    }

    @Override // l.AbstractC2832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8587(C10124 c10124, InterfaceC7945 interfaceC7945) {
        if (!c10124.mo9700().contains("StringFog") && !c10124.mo9700().startsWith("Lnp/")) {
            if (!super.mo8587(c10124, interfaceC7945)) {
                return false;
            }
            if (c10124.getParameters().size() != 1) {
                return m8589();
            }
        }
        return true;
    }
}
