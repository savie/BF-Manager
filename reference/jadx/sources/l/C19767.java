package l;

/* JADX INFO: renamed from: l.᩵᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 717L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19767 extends AbstractC2832 {
    @Override // l.AbstractC1421
    /* JADX INFO: renamed from: ۙ */
    public final String mo4983() {
        return "ParameterStringString";
    }

    @Override // l.AbstractC2832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8587(C10124 c10124, InterfaceC7945 interfaceC7945) {
        if (c10124.mo9700().contains("StringFog") || c10124.mo9700().startsWith("Lnp/")) {
            return true;
        }
        if (!super.mo8587(c10124, interfaceC7945)) {
            return false;
        }
        if (c10124.getParameters().size() == 2) {
            return true;
        }
        return m8589();
    }
}
