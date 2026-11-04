package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NIT3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14367 extends AbstractC16700 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f45297 = C16980.m40037(C14367.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21965 f45298;

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        this.f45298 = C21965.m49691(c1610, C1345.m4955(c1610, AbstractC1566.f5417), "getBytes", Collections.EMPTY_LIST, AbstractC1566.m5528(AbstractC1566.f5421));
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524()) {
            return;
        }
        Iterator it = c2551.m8508().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (m34810((C21943) it.next(), c2551)) {
                z = true;
            }
        }
        if (z || c2551.mo17865(EnumC1763.REQUEST_CODE_SHRINK)) {
            C7347.m20164(c2551);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m34810(C21943 c21943, C2551 c2551) {
        List listMo1986 = c21943.mo1986();
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = (ArrayList) listMo1986;
            if (i >= arrayList.size()) {
                return z;
            }
            C18959 c18959 = (C18959) arrayList.get(i);
            int size = arrayList.size();
            C18959 c18959M34807 = m34807(c2551, c18959, (C18959) null);
            if (c18959M34807 != null) {
                if (i < arrayList.size() && arrayList.get(i) == c18959) {
                    arrayList.set(i, c18959M34807);
                } else {
                    int iM47981 = C20993.m47981(arrayList, c18959);
                    if (iM47981 == -1) {
                        throw new C8597("Failed to replace insn");
                    }
                    arrayList.set(iM47981, c18959M34807);
                }
                C9804.m25538(c2551, c18959);
                c18959M34807.mo14759();
                if (arrayList.size() < size) {
                    m34810(c21943, c2551);
                    return true;
                }
                z = true;
            }
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:219:0x04b4  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0227, code lost:
    
        if (r2 != false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C18959 m34807(l.C2551 r13, l.C18959 r14, l.C18959 r15) {
        /*
            Method dump skipped, instruction units count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14367.m34807(l.ۖۡۗ, l.ᩳۡۗ, l.ᩳۡۗ):l.ᩳۡۗ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34809(C2551 c2551, C17489 c17489) {
        AbstractC16481 abstractC16481Mo44035 = c17489.mo44035(0);
        abstractC16481Mo44035.getClass();
        if (abstractC16481Mo44035 instanceof C17227) {
            C18959 c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
            if (c18959M40461.getType() == EnumC24203.CMP_L || c18959M40461.getType() == EnumC24203.CMP_G) {
                if (!c17489.mo44035(1).mo39117()) {
                    f45297.mo13728(c17489, "TODO: cmp {}");
                } else {
                    c17489.m40990(c17489.m40994(), c18959M40461.mo44035(0).mo17528(), c18959M40461.mo44035(1).mo17528());
                    C9804.m25538(c2551, c18959M40461);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f A[Catch: Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:3:0x0001, B:6:0x000a, B:7:0x000e, B:9:0x0014, B:12:0x0022, B:15:0x0037, B:17:0x0040, B:20:0x0055, B:23:0x005f, B:25:0x006d, B:27:0x0073, B:29:0x008a, B:31:0x0096, B:35:0x009f, B:36:0x00a5, B:38:0x00c6, B:40:0x00ce, B:42:0x00df, B:43:0x00ec, B:45:0x00f2, B:46:0x00fc, B:47:0x0105, B:49:0x010b, B:51:0x0113, B:52:0x0117, B:41:0x00d8), top: B:57:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[Catch: Exception -> 0x011b, LOOP:1: B:22:0x005d->B:35:0x009f, LOOP_END, TryCatch #0 {Exception -> 0x011b, blocks: (B:3:0x0001, B:6:0x000a, B:7:0x000e, B:9:0x0014, B:12:0x0022, B:15:0x0037, B:17:0x0040, B:20:0x0055, B:23:0x005f, B:25:0x006d, B:27:0x0073, B:29:0x008a, B:31:0x0096, B:35:0x009f, B:36:0x00a5, B:38:0x00c6, B:40:0x00ce, B:42:0x00df, B:43:0x00ec, B:45:0x00f2, B:46:0x00fc, B:47:0x0105, B:49:0x010b, B:51:0x0113, B:52:0x0117, B:41:0x00d8), top: B:57:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[Catch: Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:3:0x0001, B:6:0x000a, B:7:0x000e, B:9:0x0014, B:12:0x0022, B:15:0x0037, B:17:0x0040, B:20:0x0055, B:23:0x005f, B:25:0x006d, B:27:0x0073, B:29:0x008a, B:31:0x0096, B:35:0x009f, B:36:0x00a5, B:38:0x00c6, B:40:0x00ce, B:42:0x00df, B:43:0x00ec, B:45:0x00f2, B:46:0x00fc, B:47:0x0105, B:49:0x010b, B:51:0x0113, B:52:0x0117, B:41:0x00d8), top: B:57:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2 A[Catch: Exception -> 0x011b, LOOP:2: B:43:0x00ec->B:45:0x00f2, LOOP_END, TryCatch #0 {Exception -> 0x011b, blocks: (B:3:0x0001, B:6:0x000a, B:7:0x000e, B:9:0x0014, B:12:0x0022, B:15:0x0037, B:17:0x0040, B:20:0x0055, B:23:0x005f, B:25:0x006d, B:27:0x0073, B:29:0x008a, B:31:0x0096, B:35:0x009f, B:36:0x00a5, B:38:0x00c6, B:40:0x00ce, B:42:0x00df, B:43:0x00ec, B:45:0x00f2, B:46:0x00fc, B:47:0x0105, B:49:0x010b, B:51:0x0113, B:52:0x0117, B:41:0x00d8), top: B:57:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010b A[Catch: Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:3:0x0001, B:6:0x000a, B:7:0x000e, B:9:0x0014, B:12:0x0022, B:15:0x0037, B:17:0x0040, B:20:0x0055, B:23:0x005f, B:25:0x006d, B:27:0x0073, B:29:0x008a, B:31:0x0096, B:35:0x009f, B:36:0x00a5, B:38:0x00c6, B:40:0x00ce, B:42:0x00df, B:43:0x00ec, B:45:0x00f2, B:46:0x00fc, B:47:0x0105, B:49:0x010b, B:51:0x0113, B:52:0x0117, B:41:0x00d8), top: B:57:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0105 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m34808(C2551 c2551, C21219 c21219, List list) {
        int i;
        C18959 c18959;
        Iterator it;
        C9804 c9804;
        Iterator it2;
        C18959 c189510;
        C18959 c189511;
        AbstractC16481 abstractC16481Mo44035;
        try {
            int size = list.size();
            if (size >= 2) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    if (!C8314.m22409(c2551, (C18959) it3.next(), c21219)) {
                    }
                }
                ArrayList arrayList = new ArrayList(size);
                C18959 c189512 = (C18959) list.get(0);
                if (c189512.getType() == EnumC24203.CONSTRUCTOR) {
                    C6787 c6787 = (C6787) c189512;
                    if (c6787.m44039() == 1) {
                        if (((AbstractC1566) c6787.mo18926().m49702().get(0)).mo5543()) {
                            arrayList.add(c6787.mo44035(0));
                            for (i = 1; i < size; i++) {
                                c189511 = (C18959) list.get(i);
                                if (c189511.getType() == EnumC24203.INVOKE) {
                                    abstractC16481Mo44035 = null;
                                } else {
                                    abstractC16481Mo44035 = null;
                                }
                                if (abstractC16481Mo44035 == null) {
                                    arrayList.add(abstractC16481Mo44035);
                                }
                            }
                            c18959 = new C18959(EnumC24203.STR_CONCAT, m34806(C4123.m13226(arrayList, new C18980(9))));
                            c18959.mo17866(EnumC1763.SYNTHETIC);
                            if (c21219.m44027() != null) {
                                c18959.m44031(c21219.m44027());
                            } else {
                                c18959.m44031(c21219.m44027());
                            }
                            c18959.m39414((AbstractC16678) c21219);
                            c18959.m16975((AbstractC5820) c21219);
                            C9804.m25540(c2551, c21219);
                            it = list.iterator();
                            while (it.hasNext()) {
                                C9804.m25540(c2551, (C18959) it.next());
                            }
                            c9804 = new C9804(null, c2551);
                            it2 = list.iterator();
                            while (it2.hasNext()) {
                                c189510 = (C18959) it2.next();
                                if (c189510 != c21219) {
                                    c9804.m25544(c189510);
                                }
                            }
                            c9804.m25543();
                            return c18959;
                        }
                    } else {
                        while (i < size) {
                            c189511 = (C18959) list.get(i);
                            if (c189511.getType() == EnumC24203.INVOKE || c189511.m44039() != 2) {
                                abstractC16481Mo44035 = null;
                            } else {
                                C21965 c21965Mo18926 = ((C21219) c189511).mo18926();
                                if (c21965Mo18926.m49700().m4957().equals("java.lang.StringBuilder") && c21965Mo18926.getName().equals("append")) {
                                    abstractC16481Mo44035 = c189511.mo44035(1);
                                } else {
                                    abstractC16481Mo44035 = null;
                                }
                            }
                            if (abstractC16481Mo44035 == null) {
                                arrayList.add(abstractC16481Mo44035);
                            }
                        }
                        c18959 = new C18959(EnumC24203.STR_CONCAT, m34806(C4123.m13226(arrayList, new C18980(9))));
                        c18959.mo17866(EnumC1763.SYNTHETIC);
                        if (c21219.m44027() != null && !c21219.mo17865(EnumC1763.WRAPPED)) {
                            c18959.m44031(c2551.m8495(AbstractC1566.f5417));
                        } else {
                            c18959.m44031(c21219.m44027());
                        }
                        c18959.m39414((AbstractC16678) c21219);
                        c18959.m16975((AbstractC5820) c21219);
                        C9804.m25540(c2551, c21219);
                        it = list.iterator();
                        while (it.hasNext()) {
                            C9804.m25540(c2551, (C18959) it.next());
                        }
                        c9804 = new C9804(null, c2551);
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            c189510 = (C18959) it2.next();
                            if (c189510 != c21219) {
                                c9804.m25544(c189510);
                            }
                        }
                        c9804.m25543();
                        return c18959;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            c2551.m31134("String concatenation convert failed", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m34806(List list) {
        String string;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            boolean zM39122 = ((AbstractC16481) it.next()).m39122();
            if (zM39122 && z) {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                ArrayList arrayList2 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    AbstractC16481 abstractC16481 = (AbstractC16481) list.get(i);
                    abstractC16481.getClass();
                    if (abstractC16481 instanceof C23195) {
                        string = C15186.m36536((C23195) abstractC16481);
                    } else if (abstractC16481 instanceof C17227) {
                        C18959 c18959M40461 = ((C17227) abstractC16481).m40461();
                        if (c18959M40461 instanceof C5557) {
                            string = ((C5557) c18959M40461).getString();
                        } else {
                            string = null;
                        }
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        arrayList2.add(string);
                    } else {
                        if (!arrayList2.isEmpty()) {
                            arrayList.add(arrayList2.size() == 1 ? (AbstractC16481) list.get(i - 1) : AbstractC16481.m39112(new C5557(C4123.m13225(arrayList2))));
                            arrayList2.clear();
                        }
                        arrayList.add(abstractC16481);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2.size() == 1 ? (AbstractC16481) list.get(size - 1) : AbstractC16481.m39112(new C5557(C4123.m13225(arrayList2))));
                }
                return arrayList;
            }
            z = zM39122;
        }
        return list;
    }
}
