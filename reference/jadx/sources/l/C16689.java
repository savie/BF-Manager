package l;

/* JADX INFO: renamed from: l.ܺ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBG3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16689 extends AbstractC14451 {
    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return "field";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16689 m39456(C5085 c5085) {
        C1028 c1028;
        C1028 c1029 = C1028.f3733;
        switch (c5085.mo8408()) {
            case 0:
                c1028 = C1028.f3717;
                break;
            case 1:
                c1028 = C1028.f3731;
                break;
            case 2:
                c1028 = C1028.f3722;
                break;
            case 3:
                c1028 = C1028.f3725;
                break;
            case 4:
                c1028 = C1028.f3724;
                break;
            case 5:
                c1028 = C1028.f3723;
                break;
            case 6:
                c1028 = C1028.f3729;
                break;
            case 7:
                c1028 = C1028.f3734;
                break;
            case 8:
                c1028 = C1028.f3730;
                break;
            default:
                throw new IllegalArgumentException("not primitive: " + c5085);
        }
        return new C16689(c1028, C0282.f1592);
    }

    public C16689(C1028 c1028, C0282 c0282) {
        super(c1028, c0282);
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return m34885().m1850();
    }

    @Override // l.AbstractC14451, l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1848(AbstractC13487 abstractC13487) {
        int iMo1848 = super.mo1848(abstractC13487);
        return iMo1848 != 0 ? iMo1848 : m34885().m1846().compareTo(((C16689) abstractC13487).m34885().m1846());
    }
}
