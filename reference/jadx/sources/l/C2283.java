package l;

/* JADX INFO: renamed from: l.֫᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 01WQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2283 extends AbstractC5266 {
    @Override // l.AbstractC23166
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo7731() {
        return "ParameterBytesString";
    }

    @Override // l.AbstractC5266
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
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
