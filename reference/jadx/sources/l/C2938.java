package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 36GR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2938 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Function f9618;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m9613(C7830 c7830, AbstractC11902 abstractC11902) {
        if (!(abstractC11902 instanceof AbstractC22001)) {
            if (abstractC11902 instanceof AbstractC4847) {
                return ((AbstractC4847) abstractC11902).m14887();
            }
            throw new C8597("A sealed class, AbstractBlockPathTraverserHandler, has an unknown implementation");
        }
        ((AbstractC22001) abstractC11902).m49735();
        Object[] objArr = {c7830};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        return C24579.m54899(obj, arrayList, obj, arrayList);
    }

    public C2938(Function function) {
        this.f9618 = function;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m9615(C7830 c7830) {
        List listM54899;
        EnumC10066 enumC10066Mo4155;
        EnumC10066 enumC10066;
        boolean z;
        boolean zM9614;
        C21943 c21943M44106;
        C21943 c21943M44107;
        AtomicReference atomicReference = new AtomicReference(null);
        AtomicReference atomicReference2 = new AtomicReference(null);
        while (true) {
            C16907 c16907M21352 = c7830.m21352();
            AbstractC1118 abstractC1118M21353 = c7830.m21353();
            AbstractC1118 abstractC1118M21356 = c7830.m21356();
            if (atomicReference.get() == abstractC1118M21353 && atomicReference2.get() == abstractC1118M21356) {
                EnumC14541 enumC14541 = EnumC14541.UNRESOLVABLE_STATES;
                Object[] objArr = {C7830.m21345(c7830, C21255.m48442(enumC14541), C21255.m48442(enumC14541))};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                listM54899 = C24579.m54899(obj, arrayList, obj, arrayList);
            } else {
                atomicReference.set(abstractC1118M21353);
                atomicReference2.set(abstractC1118M21356);
                if (abstractC1118M21353.mo4145() || abstractC1118M21356.mo4145()) {
                    listM54899 = null;
                } else if (abstractC1118M21353.getClass().equals(abstractC1118M21356.getClass())) {
                    EnumC10066 enumC10066Mo4156 = abstractC1118M21353.mo4155();
                    EnumC10066 enumC10067 = EnumC10066.READY_TO_COMPARE;
                    if (enumC10066Mo4156 == enumC10067 && abstractC1118M21356.mo4155() == enumC10067) {
                        C19017 c19017M4147 = abstractC1118M21353.m4147();
                        C19017 c19017M4148 = abstractC1118M21356.m4147();
                        if (c19017M4147 == null || c19017M4148 == null) {
                            c21943M44106 = null;
                            c21943M44107 = null;
                        } else {
                            c21943M44106 = c19017M4147.m44106();
                            c21943M44107 = c19017M4148.m44106();
                        }
                        if ((c21943M44106 == null || c21943M44107 == null) ? false : c16907M21352.m39894(c21943M44106, c21943M44107)) {
                            List<C7830> listM39888 = c16907M21352.m39888(c21943M44106, c21943M44107);
                            ArrayList arrayList2 = new ArrayList(listM39888.size());
                            for (C7830 c7831 : listM39888) {
                                C7830 c7830M21345 = C7830.m21345(c7830, C24239.m54230(c7831.m21353()), C24239.m54230(c7831.m21356()));
                                c7830M21345.m21348(listM39888);
                                arrayList2.add(c7830M21345);
                            }
                            listM54899 = arrayList2;
                        } else {
                            listM54899 = m9613(c7830, abstractC1118M21356.mo4151());
                        }
                    } else {
                        enumC10066Mo4155 = abstractC1118M21353.mo4155();
                        enumC10066 = EnumC10066.READY_TO_COMPARE;
                        if (enumC10066Mo4155 != enumC10066 || abstractC1118M21356.mo4155() == enumC10066) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zM9614 = m9614(c7830, abstractC1118M21353, z);
                        boolean zM9615 = m9614(c7830, abstractC1118M21356, z);
                        if (zM9614 || !zM9615) {
                            ArrayList arrayList3 = new ArrayList(1);
                            Object obj2 = new Object[]{c7830}[0];
                            listM54899 = C24579.m54899(obj2, arrayList3, obj2, arrayList3);
                        } else {
                            listM54899 = null;
                        }
                    }
                } else {
                    enumC10066Mo4155 = abstractC1118M21353.mo4155();
                    enumC10066 = EnumC10066.READY_TO_COMPARE;
                    if (enumC10066Mo4155 != enumC10066) {
                        z = true;
                    } else {
                        z = true;
                    }
                    zM9614 = m9614(c7830, abstractC1118M21353, z);
                    boolean zM9616 = m9614(c7830, abstractC1118M21356, z);
                    if (zM9614) {
                    }
                    ArrayList arrayList4 = new ArrayList(1);
                    Object obj3 = new Object[]{c7830}[0];
                    listM54899 = C24579.m54899(obj3, arrayList4, obj3, arrayList4);
                }
            }
            if (listM54899 == null || listM54899.isEmpty()) {
                break;
            }
            if (listM54899.size() != 1) {
                C2938 c2938 = new C2938(this.f9618);
                ArrayList arrayList5 = new ArrayList();
                Iterator it = listM54899.iterator();
                while (it.hasNext()) {
                    arrayList5.addAll(c2938.m9615((C7830) it.next()));
                }
                return arrayList5;
            }
            c7830 = (C7830) listM54899.get(0);
        }
        Object[] objArr2 = {c7830};
        ArrayList arrayList6 = new ArrayList(1);
        Object obj4 = objArr2[0];
        return C24579.m54899(obj4, arrayList6, obj4, arrayList6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9614(C7830 c7830, AbstractC1118 abstractC1118, boolean z) {
        Function function = this.f9618;
        boolean z2 = function != null && ((Boolean) function.apply(abstractC1118)).booleanValue();
        if ((function == null || !z2) && (abstractC1118.mo4155() == EnumC10066.NOT_READY || (abstractC1118.mo4155() == EnumC10066.AWAITING_OPTIONAL_PREDECESSOR_MERGE && z))) {
            List listM9613 = m9613(c7830, abstractC1118.mo4151());
            if (listM9613.size() != 1 || listM9613.get(0) != c7830) {
                throw new C8597("A traverser handler which was not expected to change path states actually did");
            }
        }
        return z2;
    }
}
