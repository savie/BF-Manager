package l;

/* JADX INFO: renamed from: l.ܽ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: E1Y3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17944 extends AbstractC5266 {
    @Override // l.AbstractC23166
    /* JADX INFO: renamed from: ۙ */
    public final String mo7731() {
        return "ParameterString";
    }

    @Override // l.AbstractC5266
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15856(C7447 c7447) {
        return true;
    }

    @Override // l.AbstractC5266
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7732(C5122 c5122, InterfaceC7140 interfaceC7140) {
        if (!c5122.mo6804().contains("StringFog") && !c5122.mo6804().startsWith("Lnp/")) {
            if (!super.mo7732(c5122, interfaceC7140)) {
                return false;
            }
            if (c5122.getParameters().size() != 1) {
                return m15857();
            }
        }
        return true;
    }

    @Override // l.AbstractC5266
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15855(C5122 c5122) {
        return EnumC2536.STATIC.m8459(c5122.mo13184());
    }
}
