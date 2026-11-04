package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W6G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24590 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0314 f79677 = new C0314(Collections.EMPTY_LIST);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54904(C2551 c2551, InterfaceC14892 interfaceC14892) {
        m54905(c2551, interfaceC14892, c2551.m8515());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54902(C2551 c2551, InterfaceC6281 interfaceC6281, AbstractC6683 abstractC6683) {
        m54905(c2551, abstractC6683, interfaceC6281);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54901(C2551 c2551, InterfaceC4452 interfaceC4452) {
        int size = c2551.m8508().size() * 5;
        int i = 0;
        while (true) {
            boolean zM54906 = m54906(c2551, interfaceC4452, c2551.m8515());
            int i2 = i + 1;
            if (i > size) {
                StringBuilder sbM12235 = C3769.m12235(size, "Iterative traversal limit reached: limit: ", ", visitor: ");
                sbM12235.append(interfaceC4452.getClass().getName());
                sbM12235.append(", blocks count: ");
                sbM12235.append(c2551.m8508().size());
                throw new C8597(sbM12235.toString());
            }
            if (!zM54906) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54903(C2551 c2551, C11882 c11882) {
        int size = c2551.m8508().size() * 5;
        int i = 0;
        while (true) {
            boolean zM54906 = m54906(c2551, c11882, c2551.m8515());
            if (!zM54906) {
                Iterator it = c2551.m8530().iterator();
                while (it.hasNext() && !(zM54906 = m54906(c2551, c11882, ((C19684) it.next()).m45364()))) {
                }
            }
            int i2 = i + 1;
            if (i > size) {
                StringBuilder sbM12235 = C3769.m12235(size, "Iterative traversal limit reached: limit: ", ", visitor: ");
                sbM12235.append(C11882.class.getName());
                sbM12235.append(", blocks count: ");
                sbM12235.append(c2551.m8508().size());
                throw new C8597(sbM12235.toString());
            }
            if (!zM54906) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54905(C2551 c2551, InterfaceC14892 interfaceC14892, InterfaceC6281 interfaceC6281) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(interfaceC6281);
        while (true) {
            InterfaceC6281 interfaceC6282 = (InterfaceC6281) C6823.m19006(arrayList);
            if (interfaceC6282 == null) {
                return;
            }
            C0314 c0314 = f79677;
            if (interfaceC6282 == c0314) {
                InterfaceC18213 interfaceC18213 = (InterfaceC18213) C6823.m19006(arrayList2);
                C17359.requireNonNull(interfaceC18213);
                interfaceC14892.mo13866(c2551, interfaceC18213);
            } else if (interfaceC6282 instanceof InterfaceC23435) {
                interfaceC14892.mo18704(c2551, (InterfaceC23435) interfaceC6282);
            } else if (interfaceC6282 instanceof InterfaceC18213) {
                InterfaceC18213 interfaceC18214 = (InterfaceC18213) interfaceC6282;
                boolean zMo7323 = interfaceC14892.mo7323(c2551, interfaceC18214);
                arrayList.add(c0314);
                arrayList2.add(interfaceC18214);
                if (zMo7323) {
                    List listMo19035 = interfaceC18214.mo19035();
                    int size = listMo19035.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            arrayList.add((InterfaceC6281) listMo19035.get(size));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m54906(C2551 c2551, InterfaceC4452 interfaceC4452, InterfaceC18213 interfaceC18213) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC18213);
        while (true) {
            InterfaceC18213 interfaceC18214 = (InterfaceC18213) C6823.m19006(arrayList);
            if (interfaceC18214 == null) {
                return false;
            }
            if (interfaceC4452.mo7322(c2551, interfaceC18214)) {
                return true;
            }
            List listMo19035 = interfaceC18214.mo19035();
            for (int size = listMo19035.size() - 1; size >= 0; size--) {
                InterfaceC6281 interfaceC6281 = (InterfaceC6281) listMo19035.get(size);
                if (interfaceC6281 instanceof InterfaceC18213) {
                    arrayList.add((InterfaceC18213) interfaceC6281);
                }
            }
        }
    }
}
