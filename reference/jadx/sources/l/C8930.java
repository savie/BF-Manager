package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes4.dex */
public final class C8930 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f29125 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f29124 = new ArrayList();

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C8930(Set set, final Function function, final C20864 c20864) {
        C17359.requireNonNull(set);
        C4937.forEach(set, new Consumer() { // from class: l.ۖ᩸᩺
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C7660 c7660;
                C7110 c7110 = (C7110) obj;
                boolean zMo4218 = c7110.mo4218();
                C8930 c8930 = this.f9651;
                Function function2 = function;
                if (!zMo4218) {
                    c8930.f29125.add((C7660) function2.apply(c7110));
                    return;
                }
                ArrayList arrayList = c8930.f29124;
                C7660 c7661 = (C7660) function2.apply(c7110);
                Integer numValueOf = Integer.valueOf(((C1144) c7110).m4217());
                C5268 c5268 = (C5268) c7110;
                if (c5268.m15858() == null) {
                    c7660 = null;
                } else {
                    c7660 = (C7660) c20864.apply(c5268.m15858());
                }
                arrayList.add(new C7008(c7661, numValueOf, c7660));
            }
        });
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        ArrayList arrayList = this.f29125;
        if (arrayList.isEmpty()) {
            ArrayList<C7008> arrayList2 = this.f29124;
            C11388 c11388 = (C11388) interfaceC9397;
            c11388.m28740(arrayList2.size());
            for (C7008 c7008 : arrayList2) {
                c11388.m28740(((C7660) c7008.f61428).f67820);
                c11388.m28740(((Integer) c7008.f61429).intValue());
                Object obj = c7008.f23101;
                c11388.m28740(obj == null ? 0 : ((C7660) obj).f67820);
            }
            return;
        }
        C11388 c11389 = (C11388) interfaceC9397;
        c11389.m28740(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c11389.m28740(((C7660) it.next()).f67820);
        }
    }

    @Override // l.InterfaceC3359
    public final int getLength() {
        int size;
        ArrayList arrayList = this.f29125;
        if (arrayList.isEmpty()) {
            size = this.f29124.size() * 6;
        } else {
            size = arrayList.size() * 2;
        }
        return size + 2;
    }
}
