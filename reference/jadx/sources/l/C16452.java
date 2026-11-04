package l;

/* JADX INFO: renamed from: l.ܶ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 717L */
/* JADX INFO: loaded from: classes5.dex */
public final class C16452 extends AbstractC5266 {
    @Override // l.AbstractC23166
    /* JADX INFO: renamed from: ۙ */
    public final String mo7731() {
        return "ParameterStringString";
    }

    @Override // l.AbstractC5266
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7732(C5122 c5122, InterfaceC7140 interfaceC7140) {
        if (c5122.mo6804().contains("StringFog") || c5122.mo6804().startsWith("Lnp/")) {
            return true;
        }
        if (!super.mo7732(c5122, interfaceC7140)) {
            return false;
        }
        if (c5122.getParameters().size() == 2) {
            return true;
        }
        return m15857();
    }
}
