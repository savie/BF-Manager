package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18682 extends AbstractC18551 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7495 f60728;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18682(C7495 c7495) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f60728 = c7495;
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        C7495.f24785 = new C22829("local", null);
        c8614.m23224();
        if (c8614.m23236().m23197()) {
            c8614.m23236().m23224();
        } else {
            C6331.m18055();
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f60728);
        AbstractC7364 abstractC7364M23213 = c8614.m23236().m23213();
        if (abstractC7364M23213 instanceof C7495) {
            arrayList.add((C7495) abstractC7364M23213);
        }
        C2935<AbstractC7364> c2935M46163 = c8614.m23194().m46163();
        c2935M46163.m9583();
        try {
            for (AbstractC7364 abstractC7364 : c2935M46163) {
                if (abstractC7364 instanceof C7495) {
                    arrayList.add((C7495) abstractC7364);
                }
            }
            c2935M46163.m9584();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C7495) it.next()).f24220.m23726();
            }
            c8614.m23194().m46172();
        } catch (Throwable th) {
            c2935M46163.m9584();
            throw th;
        }
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo3179() {
        return this.f60728.mo20209() && !C7495.f24785.f73990.isEmpty();
    }
}
