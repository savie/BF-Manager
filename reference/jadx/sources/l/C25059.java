package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66DS */
/* JADX INFO: loaded from: classes.dex */
public final class C25059 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        m55883(c2551);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C17752 m55883(C2551 c2551) {
        try {
            C17752 c17752 = (C17752) c2551.mo17862((InterfaceC2157) C11457.f36009);
            if (c17752 != null) {
                return c17752;
            }
            if (c2551.mo17865(EnumC1763.METHOD_CANDIDATE_FOR_INLINE)) {
                if (c2551.m8508() == null) {
                    return null;
                }
                C17752 c17752M55884 = m55884(c2551);
                if (c17752M55884 != null) {
                    return c17752M55884;
                }
            }
        } catch (Exception e) {
            c2551.m31134("Method inline analysis failed", e);
        }
        return C17752.m41565(c2551);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17752 m55884(C2551 c2551) {
        List listM8508 = c2551.m8508();
        ?? arrayList = new ArrayList(2);
        Iterator it = listM8508.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = (ArrayList) ((C21943) it.next()).mo1986();
            int size = arrayList2.size();
            if (size != 0) {
                if (arrayList.size() + size > 2) {
                    arrayList = Collections.EMPTY_LIST;
                    break;
                }
                arrayList.addAll(arrayList2);
            }
        }
        int size2 = arrayList.size();
        if (size2 == 0) {
            return null;
        }
        if (size2 == 1) {
            C18959 c18959 = (C18959) arrayList.get(0);
            if (c18959.getType() != EnumC24203.RETURN || c18959.m44039() != 1) {
                return m55881(c2551, c18959, false);
            }
            AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
            abstractC16481Mo44035.getClass();
            if (abstractC16481Mo44035 instanceof C17227) {
                return m55881(c2551, ((C17227) abstractC16481Mo44035).m40462(), true);
            }
            return null;
        }
        if (size2 != 2 || ((C18959) arrayList.get(1)).getType() != EnumC24203.RETURN) {
            return null;
        }
        C18959 c189510 = (C18959) arrayList.get(0);
        C18959 c189511 = (C18959) arrayList.get(1);
        if (c189511.m44039() != 0) {
            List listM8526 = c2551.m8526();
            int i = C11632.f36475[c189510.getType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5 || !c189511.mo44035(0).m39115(c189510.m44027())) {
                                return null;
                            }
                            List listM8527 = c2551.m8526();
                            List listM44023 = c189510.m44023();
                            if (listM8527 != listM44023) {
                                if (listM8527.size() != listM44023.size()) {
                                    return null;
                                }
                                Iterator it2 = listM8527.iterator();
                                Iterator it3 = listM44023.iterator();
                                while (it2.hasNext() && it3.hasNext()) {
                                    Object next = it2.next();
                                    if (!((AbstractC16481) it3.next()).m39115((C6041) next)) {
                                        return null;
                                    }
                                }
                                if (it2.hasNext() || it3.hasNext()) {
                                    return null;
                                }
                            }
                        } else if (listM8526.size() != 1 || !c189511.mo44035(0).m39115((C6041) listM8526.get(0)) || !c189510.mo44035(0).m39115((C6041) listM8526.get(0))) {
                            return null;
                        }
                    } else if (listM8526.size() != 2 || !c189511.mo44035(0).m39115((C6041) listM8526.get(1)) || !c189510.mo44035(0).m39115((C6041) listM8526.get(1)) || !c189510.mo44035(1).m39115((C6041) listM8526.get(0))) {
                        return null;
                    }
                } else if (!listM8526.isEmpty() || !c189511.mo44035(0).m39115(c189510.m44027())) {
                    return null;
                }
            } else if (listM8526.size() != 1 || !c189511.mo44035(0).m39115(c189510.m44027()) || !c189510.mo44035(0).m39115((C6041) listM8526.get(0))) {
                return null;
            }
        }
        return m55881(c2551, c189510, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17752 m55881(C2551 c2551, C18959 c18959, boolean z) {
        if (m55882(c18959)) {
            if (!z) {
                c18959 = c18959.mo4072();
            }
            c18959.m44013(new C1938());
            return C17752.m41566(c2551, c18959);
        }
        if (!z) {
            return null;
        }
        c18959.m44013(new C1938());
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55882(C18959 c18959) {
        EnumC24203 type = c18959.getType();
        if (type == EnumC24203.INVOKE) {
            return true;
        }
        if (type == EnumC24203.ONE_ARG) {
            AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
            abstractC16481Mo44035.getClass();
            if (abstractC16481Mo44035 instanceof C17227) {
                return m55882(((C17227) abstractC16481Mo44035).m40461());
            }
        } else if ((c18959 instanceof C3319) && (((C3319) c18959).m10937() instanceof C14022)) {
            return true;
        }
        return false;
    }
}
