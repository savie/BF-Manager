package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WIVV */
/* JADX INFO: loaded from: classes.dex */
public final class C22747 extends AbstractC4847 {
    /* JADX WARN: Code duplicated, block: B:110:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:120:0x0196 A[EDGE_INSN: B:120:0x0196->B:69:0x0196 BREAK  A[LOOP:0: B:6:0x005a->B:67:0x016a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e A[LOOP:1: B:11:0x0091->B:63:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x016a A[LOOP:0: B:6:0x005a->B:67:0x016a, LOOP_END] */
    @Override // l.AbstractC4847
    /* JADX INFO: renamed from: ᩷ */
    public final List mo6399() {
        C21943 c21943;
        C21943 c21944;
        AbstractC1118 abstractC1118;
        AbstractC1118 abstractC1119;
        C21943 c21945;
        int i;
        C7830 c7830M21345;
        int i2;
        char c;
        int i3;
        C19017 c19017M4147;
        AbstractC14124 abstractC14124M30715;
        AbstractC14124 c7413;
        List list;
        boolean z;
        boolean zM39122;
        boolean z2;
        boolean zEquals;
        boolean z3;
        C7830 c7830M14886 = m14886();
        C16907 c16907M21352 = c7830M14886.m21352();
        AbstractC1118 abstractC1118M21353 = c7830M14886.m21353();
        AbstractC1118 abstractC1118M21356 = c7830M14886.m21356();
        C19017 c19017M4148 = abstractC1118M21353.m4147();
        C19017 c19017M4149 = abstractC1118M21356.m4147();
        C21943 c21943M44106 = c19017M4148.m44106();
        C21943 c21943M44107 = c19017M4149.m44106();
        AbstractC1118 abstractC1118M21354 = c7830M14886.m21353();
        AbstractC1118 abstractC1118M21357 = c7830M14886.m21356();
        C19017 c19017M41410 = abstractC1118M21354.m4147();
        C19017 c19017M41411 = abstractC1118M21357.m4147();
        if (c19017M41410 == null || c19017M41411 == null) {
            throw new UnsupportedOperationException("The instruction comparator handler has received a state which does not support block insn info");
        }
        C21943 c21943M44108 = c19017M41410.m44106();
        C21943 c21943M44109 = c19017M41411.m44106();
        List listM44105 = c19017M41410.m44105();
        List listM44106 = c19017M41411.m44105();
        int size = listM44105.size();
        int size2 = listM44106.size();
        int iMin = Math.min(size, size2);
        ArrayList arrayList = new ArrayList(iMin);
        int i4 = 0;
        while (true) {
            if (i4 >= iMin) {
                c21943 = c21943M44106;
                c21944 = c21943M44107;
                abstractC1118 = abstractC1118M21354;
                abstractC1119 = abstractC1118M21357;
                c21943M44108 = c21943M44108;
                c21945 = c21943M44109;
                i = iMin;
                break;
            }
            c21944 = c21943M44107;
            C18959 c18959 = (C18959) listM44106.get((size2 - i4) - 1);
            List list2 = listM44106;
            C18959 c189510 = (C18959) listM44105.get((size - i4) - 1);
            if (c18959.mo4075(c189510)) {
                c21943 = c21943M44106;
                list = listM44105;
                int i5 = 0;
                while (true) {
                    if (i5 >= c18959.m44039()) {
                        abstractC1118 = abstractC1118M21354;
                        abstractC1119 = abstractC1118M21357;
                        c21943M44108 = c21943M44108;
                        c21945 = c21943M44109;
                        i = iMin;
                        z = true;
                        break;
                    }
                    AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(i5);
                    abstractC1118 = abstractC1118M21354;
                    AbstractC16481 abstractC16481Mo44036 = c189510.mo44035(i5);
                    if (abstractC16481Mo44035 == null) {
                        abstractC1119 = abstractC1118M21357;
                        c21945 = c21943M44109;
                    } else {
                        abstractC1119 = abstractC1118M21357;
                        boolean z4 = abstractC16481Mo44035 instanceof C6041;
                        abstractC16481Mo44036.getClass();
                        c21945 = c21943M44109;
                        if (z4 == (abstractC16481Mo44036 instanceof C6041)) {
                            if (z4) {
                                C6041 c6041 = (C6041) abstractC16481Mo44035;
                                C6041 c6042 = (C6041) abstractC16481Mo44036;
                                if (c6041.m17534(c6042)) {
                                    c21943M44108 = c21943M44108;
                                    i = iMin;
                                } else {
                                    c21943M44108 = c21943M44108;
                                    C11457 c11457 = C11457.f36008;
                                    i = iMin;
                                    C24466 c24466 = (C24466) c6042.mo17862((InterfaceC2157) c11457);
                                    C24466 c24467 = (C24466) c6041.mo17862((InterfaceC2157) c11457);
                                    if (!((c24466 == null || c24467 == null) ? false : c24467.equals(c24466))) {
                                        C18959 c18959M17529 = c6042.m17529();
                                        C18959 c18959M175210 = c6041.m17529();
                                        if (c18959M17529 == null || c18959M175210 == null || !c18959M17529.mo4075(c18959M175210)) {
                                            z3 = true;
                                        } else {
                                            z3 = (c18959M17529.m44025() && c18959M175210.m44025()) ? !C17359.equals(c18959M17529.m44026(), c18959M17529.m44026()) : false;
                                        }
                                        if (z3) {
                                        }
                                    }
                                }
                                zM39122 = abstractC16481Mo44035.m39122();
                                if (zM39122 == abstractC16481Mo44036.m39122()) {
                                    if (zM39122) {
                                        if (abstractC16481Mo44035.m39122() || !abstractC16481Mo44036.m39122()) {
                                            zEquals = false;
                                        } else {
                                            zEquals = abstractC16481Mo44035.equals(abstractC16481Mo44036);
                                        }
                                        if (zEquals) {
                                        }
                                    }
                                    z2 = true;
                                }
                            } else {
                                c21943M44108 = c21943M44108;
                                i = iMin;
                                zM39122 = abstractC16481Mo44035.m39122();
                                if (zM39122 == abstractC16481Mo44036.m39122()) {
                                    if (zM39122) {
                                        if (abstractC16481Mo44035.m39122()) {
                                            zEquals = false;
                                        } else {
                                            zEquals = false;
                                        }
                                        if (zEquals) {
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        if (!z2) {
                            i5++;
                            abstractC1118M21354 = abstractC1118;
                            abstractC1118M21357 = abstractC1119;
                            c21943M44109 = c21945;
                            c21943M44108 = c21943M44108;
                            iMin = i;
                        }
                    }
                    i = iMin;
                    z2 = false;
                    if (!z2) {
                        i5++;
                        abstractC1118M21354 = abstractC1118;
                        abstractC1118M21357 = abstractC1119;
                        c21943M44109 = c21945;
                        c21943M44108 = c21943M44108;
                        iMin = i;
                    }
                }
                if (!z) {
                    break;
                }
                arrayList.add(new C4869(c189510, c18959));
                i4++;
                c21943M44106 = c21943;
                c21943M44107 = c21944;
                listM44106 = list2;
                listM44105 = list;
                abstractC1118M21354 = abstractC1118;
                abstractC1118M21357 = abstractC1119;
                c21943M44109 = c21945;
                c21943M44108 = c21943M44108;
                iMin = i;
            } else {
                c21943 = c21943M44106;
                abstractC1118 = abstractC1118M21354;
                abstractC1119 = abstractC1118M21357;
                c21943M44108 = c21943M44108;
                c21945 = c21943M44109;
                list = listM44105;
                i = iMin;
            }
            z = false;
            if (!z) {
                break;
                break;
            }
            arrayList.add(new C4869(c189510, c18959));
            i4++;
            c21943M44106 = c21943;
            c21943M44107 = c21944;
            listM44106 = list2;
            listM44105 = list;
            abstractC1118M21354 = abstractC1118;
            abstractC1118M21357 = abstractC1119;
            c21943M44109 = c21945;
            c21943M44108 = c21943M44108;
            iMin = i;
        }
        int size3 = arrayList.size();
        c7830M14886.m21349(c19017M41410, size3);
        c7830M14886.m21349(c19017M41411, size3);
        boolean z5 = ((size > size2) || (size < size2)) ? false : true;
        boolean z6 = size3 == i;
        boolean z7 = size3 == 0;
        c7830M14886.m21351().addAll(arrayList);
        if (!z6) {
            AbstractC1118 abstractC11110 = abstractC1118;
            AbstractC1118 abstractC11111 = abstractC1119;
            C21943 c21946 = c21945;
            C21943 c21947 = c21943M44108;
            if (z7) {
                if (abstractC11110.m4153().m3014() || abstractC11111.m4153().m3014()) {
                    C0701 c0701M4153 = abstractC11110.m4153();
                    C0701 c0701M4154 = abstractC11111.m4153();
                    if (c0701M4153.m3014()) {
                        c0701M4153.m3011();
                        c7830M21345 = C7830.m21345(c7830M14886, C12304.m30715(c0701M4153, c21947), new C7413(abstractC11111));
                    } else {
                        c0701M4154.m3011();
                        c7830M21345 = C7830.m21345(c7830M14886, new C7413(abstractC11110), C12304.m30715(c0701M4154, c21946));
                    }
                } else {
                    EnumC14541 enumC14541 = EnumC14541.NON_MATCHING_INSTRUCTIONS;
                    c7830M21345 = C7830.m21345(c7830M14886, C21255.m48442(enumC14541), C21255.m48442(enumC14541));
                }
            } else {
                EnumC14541 enumC14542 = EnumC14541.NON_MATCHING_INSTRUCTIONS;
                c7830M21345 = C7830.m21345(c7830M14886, C21255.m48442(enumC14542), C21255.m48442(enumC14542));
            }
        } else if (z5) {
            C0701 c0701M3005 = c7830M14886.m21353().m4153().m3005();
            C0701 c0701M3006 = c7830M14886.m21356().m4153().m3005();
            c0701M3005.m3009(false);
            c0701M3006.m3009(false);
            c0701M3005.m3011();
            c0701M3006.m3011();
            c7830M21345 = C7830.m21345(c7830M14886, C12304.m30715(c0701M3005, c21943M44108), C12304.m30715(c0701M3006, c21945));
        } else {
            C21943 c21948 = c21945;
            C21943 c21949 = c21943M44108;
            int iMax = Math.max(size, size2);
            if (size > size2) {
                C0701 c0701M3007 = abstractC1119.m4153().m3005();
                c0701M3007.m3009(false);
                c0701M3007.m3011();
                C0701 c0701M4155 = abstractC1118.m4153();
                c0701M4155.m3009(false);
                c0701M4155.m3011();
                i3 = size - iMax;
                AbstractC1118 abstractC11112 = abstractC1118;
                c7413 = new C7413(abstractC11112);
                c19017M4147 = abstractC11112.m4147();
                abstractC14124M30715 = C12304.m30715(c0701M3007, c21948);
            } else {
                C0701 c0701M3008 = abstractC1118.m4153().m3005();
                c0701M3008.m3009(false);
                c0701M3008.m3011();
                C0701 c0701M4156 = abstractC1119.m4153();
                c0701M4156.m3009(false);
                c0701M4156.m3011();
                i3 = size2 - iMax;
                abstractC1119.m4153().m3009(false);
                AbstractC1118 abstractC11113 = abstractC1119;
                C7413 c7414 = new C7413(abstractC11113);
                c19017M4147 = abstractC11113.m4147();
                AbstractC14124 abstractC14124M30716 = C12304.m30715(c0701M3008, c21949);
                abstractC14124M30715 = c7414;
                c7413 = abstractC14124M30716;
            }
            c19017M4147.m44107(c19017M4147.m44108() + i3);
            c7830M21345 = C7830.m21345(c7830M14886, c7413, abstractC14124M30715);
        }
        if (c21943 == null || c21944 == null) {
            i2 = 1;
            c = 0;
        } else {
            i2 = 1;
            c = 0;
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = new Object[]{c7830M21345}[0];
            c16907M21352.m39890(c21943, c21944, C24579.m54899(obj, arrayList2, obj, arrayList2));
        }
        Object[] objArr = new Object[i2];
        objArr[c] = c7830M21345;
        ArrayList arrayList3 = new ArrayList(i2);
        Object obj2 = objArr[c];
        return C24579.m54899(obj2, arrayList3, obj2, arrayList3);
    }
}
