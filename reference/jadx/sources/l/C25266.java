package l;

/* JADX INFO: renamed from: l.᩻᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29DP */
/* JADX INFO: loaded from: classes.dex */
public final class C25266 extends AbstractC16314 {
    @Override // l.AbstractC16314, l.AbstractC13331
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7408(AbstractC21779 abstractC21779) {
        return (abstractC21779 instanceof C4514) && ((C18684) ((C4514) abstractC21779).m49391()).m43451() != 0;
    }

    @Override // l.AbstractC16314
    /* JADX INFO: renamed from: ۙ */
    public final void mo11782(C4514 c4514) throws C9469 {
        do {
            this.f42518.m32898(c4514);
            try {
                c4514 = c4514.mo14237();
            } catch (C2013 e) {
                throw new C9469("Missing compounded message data", e);
            }
        } while (c4514 != null);
    }
}
