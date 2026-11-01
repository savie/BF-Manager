package l;

/* JADX INFO: renamed from: l.֨ۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15YU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0909 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC0287 f3640 = new C22077();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5143 m3626(InterfaceC10975 interfaceC10975) {
        int iMo2656 = interfaceC10975.mo2656();
        if (iMo2656 == 0) {
            InterfaceC12386 interfaceC12386 = (InterfaceC12386) interfaceC10975;
            return interfaceC12386 instanceof C13611 ? (C13611) interfaceC12386 : new C13611(interfaceC12386.getValue());
        }
        if (iMo2656 == 6) {
            InterfaceC3212 interfaceC3212 = (InterfaceC3212) interfaceC10975;
            return interfaceC3212 instanceof C15022 ? (C15022) interfaceC3212 : new C15022(interfaceC3212.getValue());
        }
        if (iMo2656 == 2) {
            InterfaceC2237 interfaceC2237 = (InterfaceC2237) interfaceC10975;
            return interfaceC2237 instanceof C19255 ? (C19255) interfaceC2237 : new C19255(interfaceC2237.getValue());
        }
        if (iMo2656 == 3) {
            InterfaceC17324 interfaceC17324 = (InterfaceC17324) interfaceC10975;
            return interfaceC17324 instanceof C11494 ? (C11494) interfaceC17324 : new C11494(interfaceC17324.getValue());
        }
        if (iMo2656 == 4) {
            InterfaceC9564 interfaceC9564 = (InterfaceC9564) interfaceC10975;
            return interfaceC9564 instanceof C22783 ? (C22783) interfaceC9564 : new C22783(interfaceC9564.getValue());
        }
        if (iMo2656 == 16) {
            InterfaceC1801 interfaceC1801 = (InterfaceC1801) interfaceC10975;
            return interfaceC1801 instanceof C6554 ? (C6554) interfaceC1801 : new C6554(interfaceC1801.getValue());
        }
        if (iMo2656 == 17) {
            InterfaceC6035 interfaceC6035 = (InterfaceC6035) interfaceC10975;
            return interfaceC6035 instanceof C2320 ? (C2320) interfaceC6035 : new C2320(interfaceC6035.getValue());
        }
        switch (iMo2656) {
            case 21:
                InterfaceC11411 interfaceC11411 = (InterfaceC11411) interfaceC10975;
                return interfaceC11411 instanceof C18549 ? (C18549) interfaceC11411 : new C18549(C12117.m30157(interfaceC11411.getValue()));
            case 22:
                InterfaceC13528 interfaceC13528 = (InterfaceC13528) interfaceC10975;
                return interfaceC13528 instanceof C17843 ? (C17843) interfaceC13528 : new C17843(C16350.m38521(interfaceC13528.getValue()));
            case 23:
                InterfaceC5060 interfaceC5060 = (InterfaceC5060) interfaceC10975;
                return interfaceC5060 instanceof C8672 ? (C8672) interfaceC5060 : new C8672(interfaceC5060.getValue());
            case 24:
                InterfaceC21994 interfaceC21994 = (InterfaceC21994) interfaceC10975;
                return interfaceC21994 instanceof C10083 ? (C10083) interfaceC21994 : new C10083(interfaceC21994.getValue());
            case 25:
                InterfaceC14503 interfaceC14503 = (InterfaceC14503) interfaceC10975;
                return interfaceC14503 instanceof C3731 ? (C3731) interfaceC14503 : new C3731(C0121.m1182(interfaceC14503.getValue()));
            case 26:
                InterfaceC4354 interfaceC4354 = (InterfaceC4354) interfaceC10975;
                return interfaceC4354 instanceof C21371 ? (C21371) interfaceC4354 : new C21371(C17055.m39832(interfaceC4354.getValue()));
            case 27:
                InterfaceC23675 interfaceC23675 = (InterfaceC23675) interfaceC10975;
                return interfaceC23675 instanceof C12905 ? (C12905) interfaceC23675 : new C12905(C0121.m1182(interfaceC23675.getValue()));
            case 28:
                InterfaceC0390 interfaceC0390 = (InterfaceC0390) interfaceC10975;
                return interfaceC0390 instanceof C2943 ? (C2943) interfaceC0390 : new C2943(interfaceC0390.getValue());
            case 29:
                InterfaceC20147 interfaceC20147 = (InterfaceC20147) interfaceC10975;
                return interfaceC20147 instanceof C9295 ? (C9295) interfaceC20147 : new C9295(interfaceC20147.getType(), interfaceC20147.getElements());
            case 30:
                return C7966.f26159;
            case 31:
                return ((InterfaceC16619) interfaceC10975).getValue() ? C4437.f15773 : C4437.f15774;
            default:
                C18304.m42517(false);
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5143 m3625(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return new C6554(0.0f);
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return new C19255((short) 0);
            }
            if (cCharAt == 'I') {
                return new C22783(0);
            }
            if (cCharAt == 'J') {
                return new C15022(0L);
            }
            if (cCharAt == 'Z') {
                return C4437.f15774;
            }
            if (cCharAt != '[') {
                switch (cCharAt) {
                    case 'B':
                        return new C13611((byte) 0);
                    case 'C':
                        return new C11494((char) 0);
                    case 'D':
                        return new C2320(0.0d);
                    default:
                        throw new C20749(null, "Unrecognized type: %s", str);
                }
            }
        }
        return C7966.f26159;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m3627(Iterable iterable) {
        return f3640.m1808(iterable);
    }
}
