package l;

/* JADX INFO: renamed from: l.᩺ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBG3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23077 extends AbstractC20960 {
    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return "field";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23077 m51063(C3320 c3320) {
        C6143 c6143;
        C6143 c6144 = C6143.f20966;
        switch (c3320.mo9834()) {
            case 0:
                c6143 = C6143.f20964;
                break;
            case 1:
                c6143 = C6143.f20959;
                break;
            case 2:
                c6143 = C6143.f20972;
                break;
            case 3:
                c6143 = C6143.f20967;
                break;
            case 4:
                c6143 = C6143.f20979;
                break;
            case 5:
                c6143 = C6143.f20961;
                break;
            case 6:
                c6143 = C6143.f20963;
                break;
            case 7:
                c6143 = C6143.f20974;
                break;
            case 8:
                c6143 = C6143.f20978;
                break;
            default:
                throw new IllegalArgumentException("not primitive: " + c3320);
        }
        return new C23077(c6143, C0498.f2186);
    }

    public C23077(C6143 c6143, C0498 c0498) {
        super(c6143, c0498);
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return m47133().m2381();
    }

    @Override // l.AbstractC20960, l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final int mo2378(AbstractC9901 abstractC9901) {
        int iMo2378 = super.mo2378(abstractC9901);
        return iMo2378 != 0 ? iMo2378 : m47133().m2380().compareTo(((C23077) abstractC9901).m47133().m2380());
    }
}
