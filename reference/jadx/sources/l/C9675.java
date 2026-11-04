package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes4.dex */
public final class C9675 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31248 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f31249 = new ArrayList();

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C9675(Map map, final Function function, final Function function2) {
        C17359.requireNonNull(map);
        C1170.stream(map.entrySet()).forEach(new Consumer() { // from class: l.ۢ᩸᩺
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C9675.m25248(this.f33130, function2, function, (Map.Entry) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25248(C9675 c9675, final Function function, Function function2, Map.Entry entry) {
        final ArrayList arrayList = new ArrayList();
        C4937.forEach((Set) entry.getValue(), new Consumer() { // from class: l.֨᩸᩺
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((C7660) function.apply((C7110) obj));
            }
        });
        if (((C7110) entry.getKey()).mo4218()) {
            c9675.f31248.add(new C7008((C7660) function2.apply((C7110) entry.getKey()), Integer.valueOf(((C1144) entry.getKey()).m4217()), arrayList));
        } else {
            c9675.f31249.add(new C18941((C7660) function2.apply((C7110) entry.getKey()), arrayList));
        }
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        ArrayList<C18941> arrayList = this.f31249;
        if (arrayList.isEmpty()) {
            ArrayList<C7008> arrayList2 = this.f31248;
            C11388 c11388 = (C11388) interfaceC9397;
            c11388.m28740(arrayList2.size());
            for (C7008 c7008 : arrayList2) {
                Object obj = c7008.f61428;
                Object obj2 = c7008.f23101;
                c11388.m28740(((C7660) obj).f67820);
                c11388.m28740(((Integer) c7008.f61429).intValue());
                List list = (List) obj2;
                c11388.m28740(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c11388.m28740(((C7660) it.next()).f67820);
                }
            }
            return;
        }
        C11388 c11389 = (C11388) interfaceC9397;
        c11389.m28740(arrayList.size());
        for (C18941 c18941 : arrayList) {
            c11389.m28740(((C7660) c18941.f61428).f67820);
            c11389.m28740(((List) c18941.f61429).size());
            Iterator it2 = ((List) c18941.f61429).iterator();
            while (it2.hasNext()) {
                c11389.m28740(((C7660) it2.next()).f67820);
            }
        }
    }

    @Override // l.InterfaceC3359
    public final int getLength() {
        int size;
        int iSum;
        ArrayList arrayList = this.f31249;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f31248;
            size = (arrayList2.size() * 6) + 2;
            iSum = C1170.stream(arrayList2).mapToInt(new C18626()).filter(new C0727()).sum();
        } else {
            size = (arrayList.size() * 4) + 2;
            iSum = C1170.stream(arrayList).mapToInt(new C8185()).filter(new C19372()).sum();
        }
        return (iSum * 2) + size;
    }
}
