package l;

/* JADX INFO: renamed from: l.ۛۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5868 extends AbstractC23508 {
    /* JADX INFO: renamed from: ֨ */
    public abstract boolean mo5521();

    /* JADX INFO: renamed from: ᩹ */
    public abstract boolean mo5526();

    /* JADX INFO: renamed from: ۘ */
    public Object mo5522() {
        AbstractC3895 abstractC3895M51759 = m51759();
        return abstractC3895M51759 == null ? C10808.f36819 : abstractC3895M51759.mo7614();
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo5525(AbstractC1073 abstractC1073) {
        int iM12067;
        C4269 c4269M12066;
        if (mo5526()) {
            C5681 c5681M51760 = m51760();
            do {
                c4269M12066 = c5681M51760.m12066();
                if (c4269M12066 instanceof AbstractC3895) {
                    return false;
                }
            } while (!c4269M12066.m12069(abstractC1073, c5681M51760));
        } else {
            C5681 c5681M51761 = m51760();
            C17157 c17157 = new C17157(abstractC1073, this);
            do {
                C4269 c4269M12067 = c5681M51761.m12066();
                if (c4269M12067 instanceof AbstractC3895) {
                    return false;
                }
                iM12067 = c4269M12067.m12067(abstractC1073, c5681M51761, c17157);
                if (iM12067 != 1) {
                }
            } while (iM12067 != 2);
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC3045 m16082() {
        return new C0223(this);
    }
}
