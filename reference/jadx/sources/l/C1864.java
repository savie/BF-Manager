package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6FF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1864 extends AbstractC4847 {
    @Override // l.AbstractC4847
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List mo6399() {
        ArrayList<C7830> arrayList;
        C5593 c5593;
        ArrayList arrayList2;
        Object obj;
        AbstractC1118 abstractC1118M54232;
        AbstractC1118 abstractC1118M54233;
        C7830 c7830M21346 = m14886().m21346();
        C16907 c16907M21352 = c7830M21346.m21352();
        C16033 c16033 = (C16033) c7830M21346.m21353();
        C16033 c16034 = (C16033) c7830M21346.m21356();
        C21943 c21943M38193 = c16033.m38193();
        C21943 c21943M38194 = c16034.m38193();
        final C21943 c21943M38195 = c16033.m38193();
        final C21943 c21943M38196 = c16034.m38193();
        final C9649 c9649M4152 = c16033.m4152();
        final C9649 c9649M4153 = c16034.m4152();
        Function function = new Function() { // from class: l.۫ۤ᩵
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function2) {
                return C24247.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function2) {
                return C24247.$default$compose(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                AbstractC1118 abstractC1118 = (AbstractC1118) obj2;
                if (abstractC1118.m4152() == c9649M4152) {
                    C19017 c19017M4147 = abstractC1118.m4147();
                    return Boolean.valueOf(c19017M4147 != null && c19017M4147.m44106() == c21943M38195);
                }
                if (abstractC1118.m4152() != c9649M4153) {
                    throw new C8597("Unknown global traverser state. Has a global state been duplicated?");
                }
                C19017 c19017M4148 = abstractC1118.m4147();
                return Boolean.valueOf(c19017M4148 != null && c19017M4148.m44106() == c21943M38196);
            }
        };
        List listM38192 = c16034.m38192();
        Stack stack = new Stack();
        ArrayList arrayList3 = new ArrayList();
        m6398(arrayList3, listM38192, stack, ((ArrayList) listM38192).size());
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                arrayList = null;
                c5593 = null;
                break;
            }
            C21943[] c21943Arr = (C21943[]) it.next();
            ArrayList arrayList4 = new ArrayList();
            int i = 0;
            while (i < ((ArrayList) c16033.m38192()).size()) {
                arrayList4.add(C7830.m21345(c7830M21346, C3355.m11053(c16033.m4153().m3005(), new C19017((C21943) ((ArrayList) c16033.m38192()).get(i), 0, 0)), C3355.m11053(c16034.m4153().m3005(), new C19017(c21943Arr[i], 0, 0))));
                i++;
                it = it;
            }
            Iterator it2 = it;
            arrayList = new ArrayList();
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList.addAll(new C2938(function).m9615((C7830) it3.next()));
            }
            boolean zM39894 = c16907M21352.m39894(c21943M38193, c21943M38194);
            c5593 = new C5593();
            for (C7830 c7830 : arrayList) {
                if (c7830.m21353().mo4145() || c7830.m21356().mo4145()) {
                    AbstractC1118 abstractC1118M21353 = c7830.m21353();
                    AbstractC1118 abstractC1118M21356 = c7830.m21356();
                    boolean z = abstractC1118M21356 instanceof C24239;
                    if ((abstractC1118M21353 instanceof C24239) && z) {
                        C24239 c24239 = (C24239) abstractC1118M21353;
                        C24239 c242310 = (C24239) abstractC1118M21356;
                        if (c24239.m54231() || c242310.m54231()) {
                            c5593.f19415 = false;
                        } else {
                            abstractC1118M54232 = c24239.m54232();
                            abstractC1118M54233 = c242310.m54232();
                        }
                    } else {
                        c5593.f19415 = false;
                    }
                } else {
                    abstractC1118M54232 = c7830.m21353();
                    abstractC1118M54233 = c7830.m21356();
                }
                C0701 c0701M4153 = abstractC1118M54232.m4153();
                C0701 c0701M4154 = abstractC1118M54233.m4153();
                c5593.f19417 &= c0701M4153.m3010();
                c5593.f19416 &= c0701M4154.m3010();
                c5593.f19414.addAll(c0701M4153.m3012());
                c5593.f19413.addAll(c0701M4154.m3012());
            }
            if (c5593.f19415 || zM39894) {
                break;
            }
            it = it2;
        }
        if (arrayList == null || c5593 == null) {
            EnumC14541 enumC14541 = EnumC14541.NON_MATCHING_PATHS;
            Object[] objArr = {C7830.m21345(c7830M21346, C21255.m48442(enumC14541), C21255.m48442(enumC14541))};
            arrayList2 = new ArrayList(1);
            obj = objArr[0];
        } else {
            C0701 c0701M3005 = c16033.m4153().m3005();
            c0701M3005.m3009(c5593.f19417);
            c0701M3005.m3006(c5593.f19414);
            C0701 c0701M3006 = c16034.m4153().m3005();
            c0701M3006.m3009(c5593.f19416);
            c0701M3006.m3006(c5593.f19413);
            C7830 c7830M21345 = C7830.m21345(c7830M21346, C3355.m11053(c0701M3005, new C19017(c16033.m38193(), 0, 0)), C3355.m11053(c0701M3006, new C19017(c16034.m38193(), 0, 0)));
            c7830M21345.m21348(arrayList);
            Object[] objArr2 = {c7830M21345};
            arrayList2 = new ArrayList(1);
            obj = objArr2[0];
        }
        return C24579.m54899(obj, arrayList2, obj, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6398(ArrayList arrayList, List list, Stack stack, int i) {
        if (stack.size() == i) {
            arrayList.add((C21943[]) C1170.toArray(stack, new C19763()));
        }
        for (C21943 c21943 : (C21943[]) C1170.toArray(list, new C15287())) {
            stack.push(c21943);
            list.remove(c21943);
            m6398(arrayList, list, stack, i);
            list.add((C21943) stack.pop());
        }
    }
}
