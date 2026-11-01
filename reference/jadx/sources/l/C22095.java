package l;

/* JADX INFO: renamed from: l.᩹ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6PC */
/* JADX INFO: loaded from: classes.dex */
public final class C22095 extends C12000 {
    @Override // l.C12000
    /* JADX INFO: renamed from: ۖ */
    public final void mo27093(AbstractC7060 abstractC7060) {
    }

    @Override // l.C12000
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC19761 mo27094(AbstractC7060 abstractC7060) {
        throw new C5649(abstractC7060);
    }

    @Override // l.C12000
    /* JADX INFO: renamed from: ۙ */
    public final void mo27095(AbstractC7060 abstractC7060, C21877 c21877) {
        int i = 0;
        while (abstractC7060.m18920().getType() != -1) {
            int type = abstractC7060.m18920().getType();
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
                abstractC7060.mo18924();
            } else {
                if (abstractC7060.m18923().f29378 == null) {
                    abstractC7060.mo18924();
                    return;
                }
                return;
            }
        }
    }
}
