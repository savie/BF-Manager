package l;

import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧ᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11969 extends AbstractC7629 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C11969 f38536 = new C11969();

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20835(C6178 c6178) {
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20842() {
        return "local";
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo20829(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.isDirectory()) {
            return null;
        }
        return interfaceC2386.mo8093().mo4290();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        boolean zEndsWith = str.endsWith("/");
        if (zEndsWith) {
            str = C1402.m5124(1, 0, str);
        }
        C6004 c6004 = new C6004(C14584.m35193(str, new String[0]));
        if (c6004.isDirectory() != zEndsWith) {
            return null;
        }
        return c6004;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20833(MessageDigest messageDigest) {
        messageDigest.update("local".getBytes());
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        String str2;
        if (C16514.m39144()) {
            return new ArrayList();
        }
        final String strM20187 = AbstractC7364.m20187(str);
        List listMo4299 = C14584.m35193(strM20187, new String[0]).mo4299(z);
        int i = 1;
        ArrayList arrayList = new ArrayList(listMo4299.size() + 1);
        if (listMo4299.isEmpty()) {
            if (strM20187.equals("/")) {
                String[] strArr = {"/system", "/system_ext", "/etc", "/sdcard", "/storage", "/data", "/cust", "/mnt", "/proc", "/product", "/vendor"};
                for (int i2 = 0; i2 < 11; i2++) {
                    AbstractC22044 abstractC22044M35193 = C14584.m35193(strArr[i2], new String[0]);
                    if (abstractC22044M35193.mo2934()) {
                        arrayList.add(new C6004(abstractC22044M35193));
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                AbstractC22044 abstractC22044 = C6382.f21566;
                sb.append(abstractC22044.getParent());
                sb.append("/");
                if (strM20187.equalsIgnoreCase(sb.toString())) {
                    arrayList.add(new C6004(abstractC22044));
                    String name = abstractC22044.getName();
                    if (name.equals("0")) {
                        str2 = "999";
                    } else {
                        str2 = name.equals("999") ? "0" : null;
                    }
                    if (str2 != null) {
                        AbstractC22044 abstractC22044M49868 = abstractC22044.m49868(str2);
                        if (abstractC22044M49868.mo2934()) {
                            arrayList.add(new C6004(abstractC22044M49868));
                        }
                    }
                } else if (strM20187.equalsIgnoreCase("/storage/")) {
                    AbstractC22044 abstractC22044M35194 = C14584.m35193("/storage/emulated", new String[0]);
                    if (abstractC22044M35194.mo2934()) {
                        arrayList.add(new C6004(abstractC22044M35194));
                    }
                } else if (strM20187.equalsIgnoreCase("/data/")) {
                    AbstractC22044 abstractC22044M35195 = C14584.m35193("/data/app", new String[0]);
                    if (abstractC22044M35195.mo2934()) {
                        arrayList.add(new C6004(abstractC22044M35195));
                    }
                    if (C4013.m12986().mo29538()) {
                        AbstractC22044 abstractC22044M35196 = C14584.m35193("/data/local", new String[0]);
                        if (abstractC22044M35196.mo2934()) {
                            arrayList.add(new C6004(abstractC22044M35196));
                        }
                    }
                } else if (strM20187.equalsIgnoreCase("/data/local/")) {
                    if (C4013.m12986().mo29538()) {
                        AbstractC22044 abstractC22044M35197 = C14584.m35193("/data/local/tmp", new String[0]);
                        if (abstractC22044M35197.mo2934()) {
                            arrayList.add(new C6004(abstractC22044M35197));
                        }
                    }
                } else {
                    int i3 = C24276.f78588;
                    if (AbstractC21292.f67895.m48533("/data/app/", strM20187)) {
                        int i4 = 2;
                        C1170.stream(C21576.m49081().getInstalledPackages(0)).map(new C8110(i4)).filter(new Predicate() { // from class: l.֫᩻۫
                            @Override // java.util.function.Predicate
                            public /* synthetic */ Predicate and(Predicate predicate) {
                                return C19025.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* JADX INFO: renamed from: negate */
                            public /* synthetic */ Predicate mo7134negate() {
                                return C19025.$default$negate(this);
                            }

                            public /* synthetic */ Predicate or(Predicate predicate) {
                                return C19025.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                String str3 = (String) obj;
                                int length = str3.length();
                                String str4 = strM20187;
                                if (length <= str4.length()) {
                                    return false;
                                }
                                int i5 = C24276.f78588;
                                return AbstractC21292.f67895.m48533(str4, str3);
                            }
                        }).map(new C15135(i, strM20187)).distinct().map(new C24665(i, strM20187)).filter(new C24727(i4)).map(new C17205(i4)).forEach(new C15713(i, arrayList));
                    }
                }
            }
        } else {
            Iterator it = listMo4299.iterator();
            while (it.hasNext()) {
                arrayList.add(new C6004((AbstractC22044) it.next()));
            }
        }
        if (!strM20187.equalsIgnoreCase("/storage/")) {
            return arrayList;
        }
        synchronized (C17085.class) {
            Iterator it2 = C17085.m40233().iterator();
            while (it2.hasNext()) {
                arrayList.add(new C6004((C25291) it2.next()));
            }
        }
        return arrayList;
    }
}
