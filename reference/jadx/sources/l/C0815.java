package l;

import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0815 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974("local") && !c21422.m47977();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        String name;
        c21422.m47963("local");
        C11545 c11545M47970 = c21422.m47970();
        boolean z = !c11545M47970.m28794() && c11545M47970.m28814("local");
        boolean zAnyMatch = C9030.stream(c21422.m47979()).anyMatch(new C2185(0));
        String strSubstring = "";
        if (c21422.m47975() == 1) {
            InterfaceC2557 interfaceC2557M47981 = c21422.m47981();
            if (interfaceC2557M47981.isDirectory()) {
                name = interfaceC2557M47981.getName();
            } else {
                name = interfaceC2557M47981.getName();
                int iLastIndexOf = name.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    String strSubstring2 = name.substring(0, iLastIndexOf);
                    strSubstring = name.substring(iLastIndexOf);
                    name = strSubstring2;
                }
            }
        } else {
            name = C5553.m15313(c21422.m47959(), new String[0]).getName();
        }
        C20239 c20239 = new C20239(c21422.m47980(), z, c11545M47970, c21422);
        c20239.m11288(name, strSubstring);
        c20239.m11287(c21422.m47975(), zAnyMatch, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3394(C10142 c10142, C21422 c21422, boolean z) {
        c10142.m25769("compressToAnother", z);
        if (z) {
            c10142.m25775(c21422);
        } else {
            c10142.m25777(c21422);
        }
        c10142.m25763();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4612 m3391(AbstractC17902 abstractC17902, String[] strArr, boolean z) {
        C4612 c4612 = new C4612();
        c4612.m12758(strArr, z, new C0482(abstractC17902));
        return c4612;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3395(AbstractC17902 abstractC17902, String[] strArr, List list, int i) {
        String strM956;
        List list2 = (List) C9030.stream(list).map(new C7538(0)).collect(C1890.toList());
        try {
            ArrayList arrayListM3389 = m3389(list, new C0219());
            boolean z = i > 1;
            if (z) {
                abstractC17902.m41591(R.string.MT_Protector);
                abstractC17902.mo21455(0);
                if (abstractC17902 instanceof AbstractC20413) {
                    ((AbstractC20413) abstractC17902).m46157(0);
                }
            }
            for (String str : strArr) {
                if (!m3396(str, list2)) {
                    AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
                    try {
                        if (abstractC20745M15313.mo40126()) {
                            strM956 = m3388(abstractC20745M15313.mo33986());
                        } else {
                            strM956 = C0055.m956(abstractC20745M15313.mo33986());
                        }
                        if (!m3396(strM956, arrayListM3389)) {
                            if (z) {
                                abstractC17902.mo41554(abstractC20745M15313.getName());
                            }
                            EnumC11669 enumC11669M29115 = EnumC11669.m29115(abstractC20745M15313.mo33974());
                            if (abstractC20745M15313.mo24647()) {
                                enumC11669M29115.m29117(str);
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3388(String str) {
        String strM15306 = C5553.m15306(str);
        if (strM15306 != null) {
            return new File(C11904.f39934.mo33986(), strM15306).getPath();
        }
        return C5553.m15304(str) ? C11904.f39934.mo33986() : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3389(List list, C0219 c0219) {
        ArrayList arrayList = new ArrayList(list.size());
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC20745 abstractC20745 = (AbstractC20745) it.next();
            if (abstractC20745.mo40126()) {
                arrayList.add(m3388(abstractC20745.mo33986()));
            } else {
                String parent = abstractC20745.getParent();
                if (parent == null) {
                    arrayList.add(C0055.m956(abstractC20745.mo33986()));
                } else {
                    String strM956 = (String) map.get(parent);
                    if (strM956 == null) {
                        strM956 = C0055.m956(parent);
                        map.put(parent, strM956);
                    }
                    arrayList.add(new File(strM956, abstractC20745.getName()).getPath());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3396(final String str, List list) {
        if (C5553.m15304(str) || C5553.m15329(str)) {
            return C9030.stream(list).anyMatch(new C15474(str, 1));
        }
        final String strConcat = str.endsWith("/") ? str : str.concat("/");
        return C9030.stream(list).anyMatch(new Predicate() { // from class: l.᩷ܳ᩹
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String str2 = (String) obj;
                return str2.equals(str) || str2.startsWith(strConcat);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m3390(List list) {
        return (List) C9030.stream(list).map(new C3105(0)).collect(C1890.toList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3393(C5202 c5202, boolean z, boolean z2, C11545 c11545, C11545 c11546, List list) {
        if (c5202.m14380() && z2) {
            if (z) {
                c11545 = c11546;
            }
            c11545.m28831();
            c11545.m28777((Collection) list);
            c11545.m28830();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3392(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC20745) it.next()).mo24644();
        }
    }
}
