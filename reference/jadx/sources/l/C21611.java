package l;

import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21611 extends AbstractC9677 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C21611 f70098 = new C21611();

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15075(C11018 c11018) {
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۨ */
    public final String mo15077() {
        return "local";
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo15073(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.isDirectory()) {
            return null;
        }
        return interfaceC2557.mo7989().mo33970();
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        boolean zEndsWith = str.endsWith("/");
        if (zEndsWith) {
            str = C20630.m46498(1, 0, str);
        }
        C6794 c6794 = new C6794(C5553.m15313(str, new String[0]));
        if (c6794.isDirectory() != zEndsWith) {
            return null;
        }
        return c6794;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15074(MessageDigest messageDigest) {
        messageDigest.update("local".getBytes());
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        String str2;
        if (C15198.m36412()) {
            return new ArrayList();
        }
        final String strM28608 = AbstractC11462.m28608(str);
        List listMo33983 = C5553.m15313(strM28608, new String[0]).mo33983(z);
        final ArrayList arrayList = new ArrayList(listMo33983.size() + 1);
        if (listMo33983.isEmpty()) {
            if (strM28608.equals("/")) {
                String[] strArr = {"/system", "/system_ext", "/etc", "/sdcard", "/storage", "/data", "/cust", "/mnt", "/proc", "/product", "/vendor"};
                for (int i = 0; i < 11; i++) {
                    AbstractC20745 abstractC20745M15313 = C5553.m15313(strArr[i], new String[0]);
                    if (abstractC20745M15313.mo33975()) {
                        arrayList.add(new C6794(abstractC20745M15313));
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                AbstractC20745 abstractC20745 = C11904.f39934;
                sb.append(abstractC20745.getParent());
                sb.append("/");
                if (strM28608.equalsIgnoreCase(sb.toString())) {
                    arrayList.add(new C6794(abstractC20745));
                    String name = abstractC20745.getName();
                    if (name.equals("0")) {
                        str2 = "999";
                    } else {
                        str2 = name.equals("999") ? "0" : null;
                    }
                    if (str2 != null) {
                        AbstractC20745 abstractC20745M46706 = abstractC20745.m46706(str2);
                        if (abstractC20745M46706.mo33975()) {
                            arrayList.add(new C6794(abstractC20745M46706));
                        }
                    }
                } else if (strM28608.equalsIgnoreCase("/storage/")) {
                    AbstractC20745 abstractC20745M15314 = C5553.m15313("/storage/emulated", new String[0]);
                    if (abstractC20745M15314.mo33975()) {
                        arrayList.add(new C6794(abstractC20745M15314));
                    }
                } else if (strM28608.equalsIgnoreCase("/data/")) {
                    AbstractC20745 abstractC20745M15315 = C5553.m15313("/data/app", new String[0]);
                    if (abstractC20745M15315.mo33975()) {
                        arrayList.add(new C6794(abstractC20745M15315));
                    }
                    if (C19812.m45045().mo43870()) {
                        AbstractC20745 abstractC20745M15316 = C5553.m15313("/data/local", new String[0]);
                        if (abstractC20745M15316.mo33975()) {
                            arrayList.add(new C6794(abstractC20745M15316));
                        }
                    }
                } else if (strM28608.equalsIgnoreCase("/data/local/")) {
                    if (C19812.m45045().mo43870()) {
                        AbstractC20745 abstractC20745M15317 = C5553.m15313("/data/local/tmp", new String[0]);
                        if (abstractC20745M15317.mo33975()) {
                            arrayList.add(new C6794(abstractC20745M15317));
                        }
                    }
                } else if (C6851.m18466("/data/app/", strM28608)) {
                    int i2 = 1;
                    C9030.stream(C16737.m39292().getInstalledPackages(0)).map(new C4141(2)).filter(new Predicate() { // from class: l.᩺ܰ֨
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
                            String str3 = (String) obj;
                            int length = str3.length();
                            String str4 = strM28608;
                            return length > str4.length() && C6851.m18466(str4, str3);
                        }
                    }).map(new C23710(i2, strM28608)).distinct().map(new C17761(i2, strM28608)).filter(new C19665(2)).map(new C23590(3)).forEach(new Consumer() { // from class: l.ܶܰ֨
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            arrayList.add((C6794) obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C1455.$default$andThen(this, consumer);
                        }
                    });
                }
            }
        } else {
            Iterator it = listMo33983.iterator();
            while (it.hasNext()) {
                arrayList.add(new C6794((AbstractC20745) it.next()));
            }
        }
        if (!strM28608.equalsIgnoreCase("/storage/")) {
            return arrayList;
        }
        synchronized (C19001.class) {
            Iterator it2 = C19001.m43715().iterator();
            while (it2.hasNext()) {
                arrayList.add(new C6794((C18295) it2.next()));
            }
        }
        return arrayList;
    }
}
