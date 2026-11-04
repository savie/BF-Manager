package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V6HP */
/* JADX INFO: loaded from: classes.dex */
public final class C24065 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1610 f77812;

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "SignatureProcessor";
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        this.f77812 = c1610;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        C11304 c11304M28566 = C11304.m28566(c24927);
        if (c11304M28566 != null) {
            try {
                List listM28572 = c11304M28566.m28572();
                AbstractC1566 abstractC1566M28575 = c11304M28566.m28575();
                AbstractC1566 abstractC1566M55553 = c24927.m55553();
                if (C17359.equals(abstractC1566M28575.mo5570(), c24927.m55571().getType().mo5570())) {
                    c24927.m31138("Incorrect class signature: super class is equals to this class");
                } else {
                    if (!abstractC1566M28575.mo5543()) {
                        c24927.m31138("Incorrect class signature, class is not an object: " + abstractC1566M28575);
                        abstractC1566M28575 = abstractC1566M55553;
                    }
                    abstractC1566M55553 = abstractC1566M28575;
                }
                List arrayList = null;
                while (true) {
                    AbstractC1566 abstractC1566M28576 = c11304M28566.m28575();
                    if (abstractC1566M28576 == null) {
                        break;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractC1566M28576);
                }
                if (arrayList == null) {
                    arrayList = Collections.EMPTY_LIST;
                }
                List listM53609 = m53609(c24927, arrayList);
                c24927.m55540(m53610(c24927, listM28572, abstractC1566M55553, listM53609), abstractC1566M55553, listM53609);
            } catch (Exception e) {
                c24927.m31134("Failed to parse class signature: " + c11304M28566.m28574(), e);
            }
        }
        for (C17467 c17467 : c24927.getFields()) {
            C11304 c11304M28567 = C11304.m28566(c17467);
            if (c11304M28567 != null) {
                C24927 c24927M40972 = c17467.m40972();
                try {
                    AbstractC1566 abstractC1566M28577 = c11304M28567.m28575();
                    if (abstractC1566M28577 != null) {
                        if (m53611(abstractC1566M28577)) {
                            this.f77812.m5692().getClass();
                            C3101.m10102(c24927M40972, abstractC1566M28577);
                            if (m53612(abstractC1566M28577, c17467.getType())) {
                                c17467.m40963(abstractC1566M28577);
                            } else {
                                c17467.m31137("Incorrect field signature: " + c11304M28567.m28574());
                            }
                        } else {
                            c17467.m31138("Incorrect inner types in field signature: " + c11304M28567.m28574());
                        }
                    }
                } catch (Exception e2) {
                    c24927M40972.m31134("Field signature parse error: " + c17467.getName(), e2);
                }
            }
        }
        for (C2551 c2551 : c24927.getMethods()) {
            C11304 c11304M28568 = C11304.m28566(c2551);
            if (c11304M28568 != null) {
                try {
                    List listM28573 = c11304M28568.m28572();
                    List listM28574 = c11304M28568.m28573(c2551.mo8532().m49705());
                    AbstractC1566 abstractC1566M28578 = c11304M28568.m28575();
                    if (m53611(abstractC1566M28578)) {
                        Iterator it = listM28574.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                c2551.m8538(listM28573);
                                C3101 c3101M5692 = this.f77812.m5692();
                                c3101M5692.getClass();
                                C3101.m10100(c2551, abstractC1566M28578);
                                if (!m53613(c2551, c11304M28568, abstractC1566M28578, C4123.m13226(listM28574, new C2085(c3101M5692, c2551)))) {
                                    c2551.m8538(Collections.EMPTY_LIST);
                                    break;
                                }
                                break;
                            }
                            if (!m53611((AbstractC1566) it.next())) {
                            }
                        }
                    }
                    c2551.m31138("Incorrect inner types in method signature: " + c11304M28568.m28574());
                    break;
                } catch (Exception e3) {
                    c2551.m31134("Failed to parse method signature: " + c11304M28568.m28574(), e3);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m53609(C24927 c24927, List list) {
        List listM55564 = c24927.m55564();
        if (list.isEmpty()) {
            return listM55564;
        }
        int size = list.size();
        int size2 = listM55564.size();
        ArrayList arrayList = new ArrayList(size2);
        int iMin = Math.min(size2, size);
        for (int i = 0; i < size2; i++) {
            if (i < iMin) {
                AbstractC1566 abstractC1566 = (AbstractC1566) list.get(i);
                AbstractC1566 abstractC1567 = (AbstractC1566) listM55564.get(i);
                if (abstractC1566 == null) {
                    abstractC1566 = abstractC1567;
                } else if (!abstractC1566.mo5543()) {
                    c24927.m31138("Incorrect class signature, class is not an object: " + abstractC1566);
                    abstractC1566 = abstractC1567;
                }
                arrayList.add(abstractC1566);
            } else {
                arrayList.add((AbstractC1566) listM55564.get(i));
            }
        }
        if (size2 < size) {
            c24927.m31138("Unexpected interfaces in signature: " + list.subList(size2, size));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m53610(C24927 c24927, List list, AbstractC1566 abstractC1566, List list2) {
        List arrayList;
        if (!list2.isEmpty() || !abstractC1566.equals(AbstractC1566.f5426)) {
            final HashSet hashSet = new HashSet();
            abstractC1566.m5544((Function) new C6704(2, hashSet));
            C4937.forEach(list2, new Consumer() { // from class: l.᩵ۙ᩵
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    ((AbstractC1566) obj).m5544((Function) new C25269(2, hashSet));
                }
            });
            if (!hashSet.isEmpty()) {
                if (c24927.m55552()) {
                    arrayList = new ArrayList(list);
                    c24927.m55541(new C12130(0, arrayList));
                } else {
                    arrayList = list;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet.remove(((AbstractC1566) it.next()).mo5570());
                }
                if (!hashSet.isEmpty()) {
                    c24927.m31137("Add missing generic type declarations: " + hashSet);
                    final ArrayList arrayList2 = new ArrayList(hashSet.size() + list.size());
                    arrayList2.addAll(list);
                    C1170.stream(hashSet).sorted().map(new C8195(7)).forEach(new Consumer() { // from class: l.ۛۙ᩵
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            arrayList2.add((AbstractC1566) obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C12312.$default$andThen(this, consumer);
                        }
                    });
                    return arrayList2;
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53613(C2551 c2551, C11304 c11304, AbstractC1566 abstractC1566, List list) {
        try {
            if (!m53612(abstractC1566, c2551.mo8532().m49698())) {
                c2551.m31138("Incorrect return type in method signature: " + c11304.m28574());
                return false;
            }
            List listM53608 = m53608(c2551, c11304, list);
            if (listM53608 == null) {
                return false;
            }
            c2551.m8500(abstractC1566, C4681.unmodifiableList(listM53608));
            return true;
        } catch (Exception e) {
            c2551.m31134("Type validation failed for signature: " + c11304.m28574(), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m53608(C2551 c2551, C11304 c11304, List list) {
        C21965 c21965Mo8532 = c2551.mo8532();
        List listM49702 = c21965Mo8532.m49702();
        int size = list.size();
        if (size == listM49702.size()) {
            for (int i = 0; i < size; i++) {
                if (!m53612((AbstractC1566) list.get(i), (AbstractC1566) listM49702.get(i))) {
                    c2551.m31138("Incorrect types in method signature: " + c11304.m28574());
                    return null;
                }
            }
            return list;
        }
        if (c2551.m8536().mo8547().m26539()) {
            return null;
        }
        if (c21965Mo8532.m49703() && !listM49702.isEmpty() && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.add(0, (AbstractC1566) listM49702.get(0));
            if (arrayList.size() == listM49702.size()) {
                return arrayList;
            }
        }
        c2551.m31133("Incorrect args count in method signature: " + c11304.m28574());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53612(AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        EnumC7215 enumC7215M23403 = this.f77812.m5687().m23403(abstractC1566, abstractC1567);
        if (enumC7215M23403 == EnumC7215.UNKNOWN && abstractC1566.mo5543()) {
            String strMo5570 = abstractC1566.mo5570();
            if (C13534.m33241(strMo5570)) {
                if (strMo5570.indexOf(46) <= 0) {
                    if (enumC7215M23403 != EnumC7215.CONFLICT) {
                        return true;
                    }
                } else {
                    for (String str : strMo5570.split("\\.")) {
                        if (C13534.m33240(str)) {
                        }
                    }
                    if (enumC7215M23403 != EnumC7215.CONFLICT) {
                        return true;
                    }
                }
            }
        } else if (enumC7215M23403 != EnumC7215.CONFLICT) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53611(AbstractC1566 abstractC1566) {
        String strMo5570;
        AbstractC1566 abstractC1566Mo5553 = abstractC1566.mo5553();
        if (abstractC1566Mo5553 == null) {
            return true;
        }
        C24927 c24927M5672 = this.f77812.m5672(abstractC1566.mo5559());
        if (c24927M5672 == null) {
            return true;
        }
        if (abstractC1566Mo5553.mo5559() != null) {
            strMo5570 = abstractC1566Mo5553.mo5559().mo5570();
        } else {
            strMo5570 = abstractC1566Mo5553.mo5570();
        }
        if (!strMo5570.contains(".")) {
            Iterator it = c24927M5672.m55534().iterator();
            while (it.hasNext()) {
                if (((C24927) it.next()).m55532().equals(strMo5570)) {
                    return true;
                }
            }
            return false;
        }
        C1610 c1610 = this.f77812;
        c1610.getClass();
        C24927 c24927M5671 = c1610.m5671(C1345.m4955(c1610, AbstractC1566.m5538(strMo5570)));
        if (c24927M5671 == null) {
            return false;
        }
        if (!c24927M5671.m55574().equals(c24927M5672)) {
            c24927M5672.m55558(c24927M5671);
            c24927M5671.m55571().m4961(c24927M5672);
        }
        return m53611(abstractC1566Mo5553);
    }
}
