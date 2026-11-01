package l;

/* JADX INFO: renamed from: l.ᩳ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9RC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18355 extends AbstractC2832 {
    @Override // l.AbstractC1421
    /* JADX INFO: renamed from: ۙ */
    public final String mo4983() {
        return "ParameterIII";
    }

    @Override // l.AbstractC2832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8588(C19213 c19213) {
        for (C15063 c15063 : c19213.mo20496()) {
            if (EnumC15236.PRIVATE.m36501(c15063.mo28400()) && EnumC15236.STATIC.m36501(c15063.mo28400()) && c15063.getType().equals("[S")) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC2832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8586(C10124 c10124) {
        return EnumC15236.STATIC.m36501(c10124.mo25750());
    }
}
