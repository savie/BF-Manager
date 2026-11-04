package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.۠ۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2IWY */
/* JADX INFO: loaded from: classes4.dex */
public final class C8453 extends AbstractC16700 {
    /* JADX WARN: Code duplicated, block: B:77:0x0174  */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        boolean zM22643;
        C1017 c1017;
        if (c2551.m8524()) {
            return;
        }
        Iterator it = c2551.m8508().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C18959 c18959 : (ArrayList) ((C21943) it.next()).mo1986()) {
                if (c18959.getType() == EnumC24203.SWITCH && !c18959.mo17865(EnumC1763.REMOVE)) {
                    final C1082 c1082 = (C1082) c18959;
                    AbstractC16481 abstractC16481Mo44035 = c1082.mo44035(0);
                    abstractC16481Mo44035.getClass();
                    if (!(abstractC16481Mo44035 instanceof C17227)) {
                        zM22643 = false;
                        break;
                    }
                    C18959 c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
                    int i = C9198.f30008[c18959M40461.getType().ordinal()];
                    c17467Arr = null;
                    c17467Arr = null;
                    final C17467[] c17467Arr = null;
                    zM22643 = true;
                    if (i != 1) {
                        if (i != 2) {
                            zM22643 = false;
                            break;
                        }
                        C21219 c21219 = (C21219) c18959M40461;
                        if (!c21219.mo18926().m49701().equals("ordinal()I")) {
                            zM22643 = false;
                            break;
                        }
                        AbstractC16481 abstractC16481Mo44036 = c21219.mo44035(0);
                        C24927 c24927M5672 = c2551.mo8527().m5672(abstractC16481Mo44036.getType());
                        if (c24927M5672 == null || (c1017 = (C1017) c24927M5672.mo17862((InterfaceC2157) C11457.f36006)) == null) {
                            zM22643 = false;
                            break;
                        }
                        List listM3913 = c1017.m3913();
                        int length = c1082.m4073().length;
                        if (listM3913.size() >= length) {
                            C17467[] c17467Arr2 = new C17467[length];
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    c17467Arr = c17467Arr2;
                                    break;
                                }
                                Object objM4071 = c1082.m4071(i2);
                                if (!(objM4071 instanceof Integer)) {
                                    break;
                                }
                                int iIntValue = ((Integer) objM4071).intValue();
                                try {
                                    c17467Arr2[iIntValue] = ((C9965) listM3913.get(iIntValue)).m25797();
                                    i2++;
                                } catch (Exception unused) {
                                }
                            }
                        }
                        if (c17467Arr == null) {
                            zM22643 = false;
                            break;
                        }
                        zM22643 = m22643(c1082, abstractC16481Mo44035, abstractC16481Mo44036, new IntFunction() { // from class: l.ᩳۜۗ
                            @Override // java.util.function.IntFunction
                            public final Object apply(int i3) {
                                return c17467Arr[i3];
                            }
                        });
                    } else {
                        C2487 c2487M22642 = m22642(c2551.mo8527(), c18959M40461);
                        if (c2487M22642 == null) {
                            zM22643 = false;
                            break;
                        }
                        C17467 c17467M8363 = c2487M22642.m8363();
                        AbstractC16481 abstractC16481M8362 = c2487M22642.m8362();
                        C2508 c2508 = (C2508) c17467M8363.m40972().mo17862((InterfaceC2157) C11457.f36000);
                        final C9219 c9219M8391 = c2508 != null ? c2508.m8391(c17467M8363) : null;
                        if (c9219M8391 == null) {
                            zM22643 = false;
                            break;
                        }
                        int length2 = c1082.m4073().length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                if (m22643(c1082, abstractC16481Mo44035, abstractC16481M8362, new IntFunction() { // from class: l.ۢۜۗ
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i4) {
                                        return c9219M8391.m24395(c1082.m4071(i4));
                                    }
                                })) {
                                    c17467M8363.mo17866(EnumC1763.DONT_GENERATE);
                                    C24927 c24927M40972 = c17467M8363.m40972();
                                    Iterator it2 = c24927M40972.getFields().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            c24927M40972.mo17866(EnumC1763.DONT_GENERATE);
                                            break;
                                        }
                                        C17467 c17467 = (C17467) it2.next();
                                        C10293 c10293Mo8547 = c17467.mo8547();
                                        if (c10293Mo8547.m26528() && c10293Mo8547.m26540() && c10293Mo8547.m26538() && !c17467.mo17865(EnumC1763.DONT_GENERATE)) {
                                            break;
                                        }
                                    }
                                }
                            } else if (c9219M8391.m24395(c1082.m4071(i3)) != null) {
                                i3++;
                            }
                            zM22643 = false;
                            break;
                        }
                    }
                    z |= zM22643;
                }
            }
        }
        if (z) {
            C7347.m20164(c2551);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22643(C1082 c1082, AbstractC16481 abstractC16481, AbstractC16481 abstractC16482, IntFunction intFunction) {
        C4328 c4328 = (C4328) c1082.mo17862((InterfaceC2157) C11457.f36010);
        if (c4328 == null || !c1082.mo14762(abstractC16481, abstractC16482)) {
            return false;
        }
        final HashMap map = new HashMap();
        int length = c1082.m4073().length;
        for (int i = 0; i < length; i++) {
            Object objM4071 = c1082.m4071(i);
            Object objApply = intFunction.apply(i);
            c1082.m4066(i, objApply);
            map.put(objM4071, objApply);
        }
        Iterator it = ((C14287) c4328.m13823()).m34695().iterator();
        while (it.hasNext()) {
            C12884.replaceAll(((C3847) it.next()).m12479(), new UnaryOperator() { // from class: l.֨ۜۗ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo10608andThen(Function function) {
                    return C24247.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C24247.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Object obj2 = map.get(obj);
                    return obj2 == null ? obj : obj2;
                }
            });
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2487 m22642(C1610 c1610, C18959 c18959) {
        C24927 c24927M5671;
        C17467 c17467M5670;
        AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
        AbstractC16481 abstractC16481Mo44036 = c18959.mo44035(1);
        abstractC16481Mo44035.getClass();
        if (!(abstractC16481Mo44035 instanceof C17227)) {
            return null;
        }
        abstractC16481Mo44036.getClass();
        if (!(abstractC16481Mo44036 instanceof C17227)) {
            return null;
        }
        C18959 c18959M40461 = ((C17227) abstractC16481Mo44036).m40461();
        C18959 c18959M40462 = ((C17227) abstractC16481Mo44035).m40461();
        if (c18959M40461.getType() != EnumC24203.INVOKE || c18959M40462.getType() != EnumC24203.SGET) {
            return null;
        }
        C21219 c21219 = (C21219) c18959M40461;
        if (!c21219.mo18926().m49701().equals("ordinal()I") || (c24927M5671 = c1610.m5671(c21219.mo18926().m49700())) == null || !c24927M5671.m55554()) {
            return null;
        }
        Object objM10937 = ((C3319) c18959M40462).m10937();
        if ((objM10937 instanceof C14022) && (c17467M5670 = c1610.m5670((C14022) objM10937)) != null && c17467M5670.mo8547().m26528()) {
            return new C2487(c21219.mo44035(0), c17467M5670);
        }
        return null;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo22644(C24927 c24927) {
        C2487 c2487M22642;
        C17467 c17467M5670;
        C2551 c2551M55570 = c24927.m55570("<clinit>()V");
        if (c2551M55570 == null || c2551M55570.m8524() || c2551M55570.m8508() == null) {
            return true;
        }
        C2508 c2508 = new C2508();
        Iterator it = c2551M55570.m8508().iterator();
        while (it.hasNext()) {
            for (C18959 c18959 : (ArrayList) ((C21943) it.next()).mo1986()) {
                if (c18959.getType() == EnumC24203.APUT) {
                    C1610 c1610Mo8527 = c24927.mo8527();
                    AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(2);
                    abstractC16481Mo44035.getClass();
                    if ((abstractC16481Mo44035 instanceof C23195) && (c2487M22642 = m22642(c1610Mo8527, c18959)) != null) {
                        AbstractC16481 abstractC16481M8362 = c2487M22642.m8362();
                        C17467 c17467M8363 = c2487M22642.m8363();
                        if (c17467M8363 != null) {
                            abstractC16481M8362.getClass();
                            if (abstractC16481M8362 instanceof C17227) {
                                C18959 c18959M40461 = ((C17227) abstractC16481M8362).m40461();
                                if (c18959M40461 instanceof C3319) {
                                    Object objM10937 = ((C3319) c18959M40461).m10937();
                                    if ((objM10937 instanceof C14022) && (c17467M5670 = c1610Mo8527.m5670((C14022) objM10937)) != null) {
                                        c2508.m8392(c17467M8363, Integer.valueOf((int) ((C23195) abstractC16481Mo44035).m52122()), c17467M5670);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (c2508.m8393()) {
            return true;
        }
        c24927.mo17864(c2508);
        return true;
    }
}
