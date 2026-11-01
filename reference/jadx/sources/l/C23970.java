package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1JP */
/* JADX INFO: loaded from: classes.dex */
public final class C23970 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1433 f77711 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f77712 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m52817() {
        return f77712;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1433 m52814() {
        return f77711;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17661 m52815(C17661 c17661, int i, boolean z) {
        EnumSet enumSetAllOf = EnumSet.allOf(EnumC11270.class);
        f77712 = z;
        f77711 = C1433.f5889;
        C4108 c4108M8230 = C2697.m8230(c17661, i);
        m52816(c4108M8230, enumSetAllOf);
        C17661 c17661M28099 = C11165.m28099(c4108M8230, false);
        int iM15555 = c17661M28099.m41141().m15555();
        f77711.getClass();
        if (iM15555 <= 16) {
            return c17661M28099;
        }
        C4108 c4108M8231 = C2697.m8230(c17661, i);
        EnumSet enumSetClone = enumSetAllOf.clone();
        enumSetClone.remove(EnumC11270.CONST_COLLECTOR);
        m52816(c4108M8231, enumSetClone);
        return C11165.m28099(c4108M8231, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52816(C4108 c4108, EnumSet enumSet) {
        boolean z;
        int i;
        C16251 c16251;
        C16251 c16252;
        if (enumSet.contains(EnumC11270.MOVE_PARAM_COMBINER)) {
            C17619.m41000(c4108);
        }
        if (enumSet.contains(EnumC11270.SCCP)) {
            C4814.m13370(c4108);
            C13387.m32882(c4108);
            z = false;
        } else {
            z = true;
        }
        if (enumSet.contains(EnumC11270.LITERAL_UPGRADE)) {
            C16209.m38320(c4108);
            C13387.m32882(c4108);
            z = false;
        }
        EnumC11270 enumC11270 = EnumC11270.ESCAPE_ANALYSIS;
        enumSet.remove(enumC11270);
        if (enumSet.contains(enumC11270)) {
            C10565.m26717(c4108);
            C13387.m32882(c4108);
            z = false;
        }
        if (enumSet.contains(EnumC11270.CONST_COLLECTOR)) {
            C22559 c22559 = new C22559();
            int iM11685 = c4108.m11685();
            int iM11686 = c4108.m11685();
            HashMap map = new HashMap();
            new HashSet();
            int i2 = 0;
            while (true) {
                i = 1;
                if (i2 >= iM11686) {
                    break;
                }
                AbstractC22454 abstractC22454M11684 = c4108.m11684(i2);
                if (abstractC22454M11684 != null && abstractC22454M11684.mo17426() != null) {
                    C16251 c16251M49955 = abstractC22454M11684.m49955();
                    InterfaceC4919 interfaceC4919M38401 = c16251M49955.m38401();
                    if (interfaceC4919M38401.mo9847()) {
                        AbstractC23783 abstractC23783 = (AbstractC23783) interfaceC4919M38401;
                        if (abstractC22454M11684.mo17426().m31572() == 56) {
                            abstractC22454M11684 = (AbstractC22454) C19084.m43861(((C11871) c4108.m11687().get(abstractC22454M11684.m49949().m29596().nextSetBit(0))).m29613(), 1);
                        }
                        if (!abstractC22454M11684.mo17425() && !c4108.m11679(c16251M49955)) {
                            Integer num = (Integer) map.get(abstractC23783);
                            if (num == null) {
                                map.put(abstractC23783, 1);
                            } else {
                                map.put(abstractC23783, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    }
                }
                i2++;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 1) {
                    arrayList.add((AbstractC23783) entry.getKey());
                }
            }
            Collections.sort(arrayList, new C2802(map));
            int iMin = Math.min(arrayList.size(), 5);
            C11871 c11871M11683 = c4108.m11683();
            HashMap map2 = new HashMap(iMin);
            int i3 = 0;
            while (i3 < iMin) {
                AbstractC23783 abstractC23784 = (AbstractC23783) arrayList.get(i3);
                C16251 c16251M38381 = C16251.m38381(c4108.m11689(), abstractC23784);
                C12723 c12723M17483 = C6372.m17483(abstractC23784);
                if (c12723M17483.m31577() == i) {
                    c11871M11683.m29606(new C9196(C6372.m17483(abstractC23784), C11312.f38175, c16251M38381, C0727.f3015, abstractC23784));
                    c16252 = c16251M38381;
                } else {
                    C11871 c11871M11684 = c4108.m11683();
                    C11871 c11871M29616 = c11871M11684.m29616();
                    C11871 c11871M29614 = c11871M11684.m29614(c11871M29616);
                    C11312 c11312 = C11312.f38175;
                    C0727 c0727 = C0727.f3015;
                    c11871M29614.m29620(new C14840(c12723M17483, c11312, c0727, C9672.f32573, abstractC23784));
                    c16252 = c16251M38381;
                    c11871M29614.m29614(c11871M29616).m29606(new C10607(C6372.m17480(c16251M38381.m38401()), c11312, c16252, c0727));
                }
                map2.put(abstractC23784, c16252);
                i3++;
                c11871M11683 = c11871M11683;
                arrayList = arrayList;
                iMin = iMin;
                i = 1;
            }
            new HashSet();
            ArrayList[] arrayListArrM11668 = c4108.m11668();
            for (int i4 = 0; i4 < iM11685; i4++) {
                AbstractC22454 abstractC22454M11685 = c4108.m11684(i4);
                if (abstractC22454M11685 != null) {
                    C16251 c16251M49956 = abstractC22454M11685.m49955();
                    InterfaceC4919 interfaceC4919M38402 = abstractC22454M11685.m49955().m38401();
                    if (interfaceC4919M38402.mo9847() && (c16251 = (C16251) map2.get((AbstractC23783) interfaceC4919M38402)) != null && !c4108.m11679(c16251M49956)) {
                        C5625 c5625 = new C5625(c22559, c16251M49956, c16251);
                        for (AbstractC22454 abstractC22454 : arrayListArrM11668[c16251M49956.m38400()]) {
                            if (!abstractC22454.mo17425() || abstractC22454.m49949().m29622().cardinality() <= 1) {
                                abstractC22454.mo17427(c5625);
                            }
                        }
                    }
                }
            }
            C13387.m32882(c4108);
            z = false;
        }
        if (z) {
            C13387.m32882(c4108);
        }
        C3507.m10331(c4108);
    }
}
