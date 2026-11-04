package l;

/* JADX INFO: renamed from: l.᩻᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9RC */
/* JADX INFO: loaded from: classes2.dex */
public final class C25404 extends AbstractC5266 {
    @Override // l.AbstractC23166
    /* JADX INFO: renamed from: ۙ */
    public final String mo7731() {
        return "ParameterIII";
    }

    @Override // l.AbstractC5266
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15856(C7447 c7447) {
        for (C9838 c9838 : c7447.mo20398()) {
            if (EnumC2536.PRIVATE.m8459(c9838.mo8823()) && EnumC2536.STATIC.m8459(c9838.mo8823()) && c9838.getType().equals("[S")) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC5266
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15855(C5122 c5122) {
        return EnumC2536.STATIC.m8459(c5122.mo13184());
    }
}
