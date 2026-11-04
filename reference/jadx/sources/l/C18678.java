package l;

/* JADX INFO: renamed from: l.ܿ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18678 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC13347 f60723 = new C21662();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14948 m43430(InterfaceC16791 interfaceC16791) {
        int iMo5414 = interfaceC16791.mo5414();
        if (iMo5414 == 0) {
            InterfaceC1876 interfaceC1876 = (InterfaceC1876) interfaceC16791;
            return interfaceC1876 instanceof C6746 ? (C6746) interfaceC1876 : new C6746(interfaceC1876.getValue());
        }
        if (iMo5414 == 6) {
            InterfaceC20521 interfaceC20521 = (InterfaceC20521) interfaceC16791;
            return interfaceC20521 instanceof C1525 ? (C1525) interfaceC20521 : new C1525(interfaceC20521.getValue());
        }
        if (iMo5414 == 2) {
            InterfaceC4113 interfaceC4113 = (InterfaceC4113) interfaceC16791;
            return interfaceC4113 instanceof C14202 ? (C14202) interfaceC4113 : new C14202(interfaceC4113.getValue());
        }
        if (iMo5414 == 3) {
            InterfaceC11570 interfaceC11570 = (InterfaceC11570) interfaceC16791;
            return interfaceC11570 instanceof C24646 ? (C24646) interfaceC11570 : new C24646(interfaceC11570.getValue());
        }
        if (iMo5414 == 4) {
            InterfaceC3367 interfaceC3367 = (InterfaceC3367) interfaceC16791;
            return interfaceC3367 instanceof C10473 ? (C10473) interfaceC3367 : new C10473(interfaceC3367.getValue());
        }
        if (iMo5414 == 16) {
            InterfaceC23505 interfaceC23505 = (InterfaceC23505) interfaceC16791;
            return interfaceC23505 instanceof C19424 ? (C19424) interfaceC23505 : new C19424(interfaceC23505.getValue());
        }
        if (iMo5414 == 17) {
            InterfaceC24997 interfaceC24997 = (InterfaceC24997) interfaceC16791;
            return interfaceC24997 instanceof C4508 ? (C4508) interfaceC24997 : new C4508(interfaceC24997.getValue());
        }
        switch (iMo5414) {
            case 21:
                InterfaceC24251 interfaceC24251 = (InterfaceC24251) interfaceC16791;
                return interfaceC24251 instanceof C8982 ? (C8982) interfaceC24251 : new C8982(C2271.m7709(interfaceC24251.getValue()));
            case 22:
                InterfaceC6351 interfaceC6351 = (InterfaceC6351) interfaceC16791;
                return interfaceC6351 instanceof C3016 ? (C3016) interfaceC6351 : new C3016(C6000.m17432(interfaceC6351.getValue()));
            case 23:
                InterfaceC14553 interfaceC14553 = (InterfaceC14553) interfaceC16791;
                return interfaceC14553 instanceof C5012 ? (C5012) interfaceC14553 : new C5012(interfaceC14553.getValue());
            case 24:
                InterfaceC21267 interfaceC21267 = (InterfaceC21267) interfaceC16791;
                return interfaceC21267 instanceof C22166 ? (C22166) interfaceC21267 : new C22166(interfaceC21267.getValue());
            case 25:
                InterfaceC16045 interfaceC16045 = (InterfaceC16045) interfaceC16791;
                return interfaceC16045 instanceof C8237 ? (C8237) interfaceC16045 : new C8237(C13457.m33096(interfaceC16045.getValue()));
            case 26:
                InterfaceC12316 interfaceC12316 = (InterfaceC12316) interfaceC16791;
                return interfaceC12316 instanceof C9727 ? (C9727) interfaceC12316 : new C9727(C11965.m29941(interfaceC12316.getValue()));
            case 27:
                InterfaceC17537 interfaceC17537 = (InterfaceC17537) interfaceC16791;
                return interfaceC17537 instanceof C0779 ? (C0779) interfaceC17537 : new C0779(C13457.m33096(interfaceC17537.getValue()));
            case 28:
                InterfaceC13062 interfaceC13062 = (InterfaceC13062) interfaceC16791;
                return interfaceC13062 instanceof C20916 ? (C20916) interfaceC13062 : new C20916(interfaceC13062.getValue());
            case 29:
                InterfaceC15299 interfaceC15299 = (InterfaceC15299) interfaceC16791;
                return interfaceC15299 instanceof C3762 ? (C3762) interfaceC15299 : new C3762(interfaceC15299.getType(), interfaceC15299.getElements());
            case 30:
                return C7491.f24771;
            case 31:
                return ((InterfaceC5605) interfaceC16791).getValue() ? C12711.f40702 : C12711.f40703;
            default:
                C12128.m30309(false);
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14948 m43429(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return new C19424(0.0f);
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return new C14202((short) 0);
            }
            if (cCharAt == 'I') {
                return new C10473(0);
            }
            if (cCharAt == 'J') {
                return new C1525(0L);
            }
            if (cCharAt == 'Z') {
                return C12711.f40703;
            }
            if (cCharAt != '[') {
                switch (cCharAt) {
                    case 'B':
                        return new C6746((byte) 0);
                    case 'C':
                        return new C24646((char) 0);
                    case 'D':
                        return new C4508(0.0d);
                    default:
                        throw new C23044(null, "Unrecognized type: %s", str);
                }
            }
        }
        return C7491.f24771;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m43428(Iterable iterable) {
        return f60723.m32927(iterable);
    }
}
