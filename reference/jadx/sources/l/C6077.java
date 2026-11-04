package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X4UI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6077 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m17589(C15580 c15580) {
        if (c15580 == null) {
            return null;
        }
        Object objM37318 = c15580.m37318();
        switch (C12042.f38808[c15580.m37317().ordinal()]) {
            case 1:
                AbstractC1566 abstractC1566 = AbstractC1566.f5426;
                int i = AbstractC16481.f53441;
                return C23195.m52120(0L, abstractC1566);
            case 2:
                return Boolean.TRUE.equals(objM37318) ? C23195.m52121() : C23195.m52119();
            case 3:
                long jByteValue = ((Byte) objM37318).byteValue();
                AbstractC1566 abstractC1567 = AbstractC1566.f5421;
                int i2 = AbstractC16481.f53441;
                return C23195.m52120(jByteValue, abstractC1567);
            case 4:
                long jShortValue = ((Short) objM37318).shortValue();
                AbstractC1566 abstractC1568 = AbstractC1566.f5407;
                int i3 = AbstractC16481.f53441;
                return C23195.m52120(jShortValue, abstractC1568);
            case 5:
                long jCharValue = ((Character) objM37318).charValue();
                AbstractC1566 abstractC1569 = AbstractC1566.f5433;
                int i4 = AbstractC16481.f53441;
                return C23195.m52120(jCharValue, abstractC1569);
            case 6:
                long jIntValue = ((Integer) objM37318).intValue();
                AbstractC1566 abstractC15610 = AbstractC1566.f5429;
                int i5 = AbstractC16481.f53441;
                return C23195.m52120(jIntValue, abstractC15610);
            case 7:
                long jLongValue = ((Long) objM37318).longValue();
                AbstractC1566 abstractC15611 = AbstractC1566.f5438;
                int i6 = AbstractC16481.f53441;
                return C23195.m52120(jLongValue, abstractC15611);
            case 8:
                long jFloatToIntBits = Float.floatToIntBits(((Float) objM37318).floatValue());
                AbstractC1566 abstractC15612 = AbstractC1566.f5440;
                int i7 = AbstractC16481.f53441;
                return C23195.m52120(jFloatToIntBits, abstractC15612);
            case 9:
                long jDoubleToLongBits = Double.doubleToLongBits(((Double) objM37318).doubleValue());
                AbstractC1566 abstractC15613 = AbstractC1566.f5424;
                int i8 = AbstractC16481.f53441;
                return C23195.m52120(jDoubleToLongBits, abstractC15613);
            case 10:
                return (String) objM37318;
            case 11:
                return AbstractC1566.m5535((String) objM37318);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16481 m17590(C1610 c1610, C15580 c15580) {
        String str;
        C18959 c5557;
        Object objM37318 = c15580.m37318();
        switch (C12042.f38808[c15580.m37317().ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return (AbstractC16481) m17589(c15580);
            case 2:
                long j = ((Boolean) objM37318).booleanValue() ? 0L : 1L;
                AbstractC1566 abstractC1566 = AbstractC1566.f5436;
                int i = AbstractC16481.f53441;
                return C23195.m52120(j, abstractC1566);
            case 10:
                return AbstractC16481.m39112(new C5557((String) objM37318));
            case 11:
                return AbstractC16481.m39112(new C13014(AbstractC1566.m5535((String) objM37318)));
            case 12:
                return AbstractC16481.m39112(m17592(c1610, (InterfaceC7179) objM37318));
            case 13:
                InterfaceC8670 interfaceC8670 = (InterfaceC8670) objM37318;
                if (interfaceC8670.getType().m50355()) {
                    c5557 = new C5557("FIELD:" + interfaceC8670.mo5149());
                } else {
                    InterfaceC13890 interfaceC13890Mo5148 = interfaceC8670.mo5148();
                    interfaceC13890Mo5148.mo33834();
                    C1345 c1345M4955 = C1345.m4955(c1610, AbstractC1566.m5538("java.lang.invoke.MethodHandles.Lookup"));
                    EnumC22294 type = interfaceC8670.getType();
                    int i2 = C12042.f38807[type.ordinal()];
                    if (i2 == 1) {
                        str = "findStatic";
                    } else if (i2 == 2) {
                        str = "findConstructor";
                    } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                        str = "findVirtual";
                    } else {
                        str = "<" + type + '>';
                    }
                    C21219 c21219 = new C21219(C21965.m49691(c1610, c1345M4955, str, Arrays.asList(AbstractC1566.f5427, AbstractC1566.f5417, AbstractC1566.m5538("java.lang.invoke.MethodType")), AbstractC1566.m5538("java.lang.invoke.MethodHandle")), EnumC0336.DIRECT, 4);
                    c21219.mo44014((AbstractC16481) m17591(c1610));
                    c21219.mo44014((AbstractC16481) AbstractC16481.m39112(new C13014(AbstractC1566.m5538(interfaceC13890Mo5148.mo33836()))));
                    c21219.mo44014((AbstractC16481) AbstractC16481.m39112(new C5557(interfaceC13890Mo5148.getName())));
                    c21219.mo44014((AbstractC16481) AbstractC16481.m39112(m17592(c1610, interfaceC13890Mo5148)));
                    c5557 = c21219;
                }
                return AbstractC16481.m39112(c5557);
            default:
                throw new C8597("Unsupported type for raw invoke-custom: " + c15580.m37317());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21219 m17592(C1610 c1610, InterfaceC7179 interfaceC7179) {
        C18959 c13014;
        AbstractC1566 abstractC1566M5535 = AbstractC1566.m5535(interfaceC7179.mo11553());
        List listM13226 = C4123.m13226(interfaceC7179.mo11554(), new C3398(5));
        ArrayList<AbstractC1566> arrayList = new ArrayList(listM13226.size() + 1);
        arrayList.add(abstractC1566M5535);
        arrayList.addAll(listM13226);
        AbstractC1566 abstractC1566M5538 = AbstractC1566.m5538("java.lang.invoke.MethodType");
        C21219 c21219 = new C21219(C21965.m49691(c1610, C1345.m4955(c1610, abstractC1566M5538), "methodType", arrayList, abstractC1566M5538), EnumC0336.STATIC, arrayList.size());
        for (AbstractC1566 abstractC1566 : arrayList) {
            if (!abstractC1566.m5556()) {
                c13014 = new C13014(abstractC1566);
            } else {
                EnumC24203 enumC24203 = EnumC24203.SGET;
                AbstractC1566 abstractC1566M30191 = abstractC1566.mo5558().m30191();
                c13014 = new C3319(enumC24203, C14022.m34144(c1610, C1345.m4955(c1610, abstractC1566M30191), "TYPE", abstractC1566M30191), 0);
            }
            c21219.mo44014((AbstractC16481) AbstractC16481.m39112(c13014));
        }
        return c21219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17227 m17591(C1610 c1610) {
        return AbstractC16481.m39112(new C21219(C21965.m49691(c1610, C1345.m4955(c1610, AbstractC1566.m5538("java.lang.invoke.MethodHandles")), "lookup", Collections.EMPTY_LIST, AbstractC1566.m5538("java.lang.invoke.MethodHandles.Lookup")), EnumC0336.STATIC, 0));
    }
}
