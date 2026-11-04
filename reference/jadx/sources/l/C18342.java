package l;

/* JADX INFO: renamed from: l.ܿ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F6PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18342 extends C12472 {
    @Override // l.C12472
    /* JADX INFO: renamed from: ᩸ */
    public final void mo29438(AbstractC0540 abstractC0540) {
    }

    @Override // l.C12472
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8743 mo29436(AbstractC0540 abstractC0540) {
        throw new C24407(abstractC0540);
    }

    @Override // l.C12472
    /* JADX INFO: renamed from: ۙ */
    public final void mo29437(AbstractC0540 abstractC0540, C10234 c10234) {
        int i = 0;
        while (abstractC0540.m2520().getType() != -1) {
            int type = abstractC0540.m2520().getType();
            if (i != 0 || (type != 93 && type != 92)) {
                if (type == 87 || type == 89 || type == 91) {
                    i++;
                }
                if (type == 88 || type == 90 || type == 92) {
                    if (i == 0) {
                        return;
                    } else {
                        i--;
                    }
                }
                abstractC0540.mo2527();
            } else {
                if (abstractC0540.m2522().f9157 == null) {
                    abstractC0540.mo2527();
                    return;
                }
                return;
            }
        }
    }
}
