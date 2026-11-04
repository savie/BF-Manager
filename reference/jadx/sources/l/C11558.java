package l;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L6BT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11558 extends AbstractC22001 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12304 f36344;

    public C11558(C12304 c12304) {
        super(c12304);
        this.f36344 = c12304;
    }

    @Override // l.AbstractC22001
    /* JADX INFO: renamed from: ᩷ */
    public final void mo27545() {
        Object c21255;
        AbstractC1118 abstractC1118M49734 = m49734();
        AtomicReference atomicReferenceM21355 = abstractC1118M49734.m4149().m21355(abstractC1118M49734);
        if (atomicReferenceM21355 == null) {
            throw new C8597("Orphaned traverser state");
        }
        C21943 c21943M30716 = this.f36344.m30716();
        C5198 c5198 = new C5198(abstractC1118M49734);
        AbstractC1118 abstractC1118M8737 = c5198.m8737();
        C0701 c0701M4153 = abstractC1118M8737.m4153();
        C9649 c9649M4152 = abstractC1118M8737.m4152();
        List listM49643 = c21943M30716.m49643();
        C17359.requireNonNull(c9649M4152);
        List listM19008 = C6823.m19008((Collection) listM49643, (Predicate) new C11221(1, c9649M4152));
        int size = listM19008.size();
        if (size == 0) {
            c21255 = new C21255(c5198.m8736(), EnumC14541.END_OF_PATH);
        } else if (size == 1) {
            c21255 = new C3355(c5198.m8736(), c0701M4153, new C19017((C21943) listM19008.get(0), 0, 0));
        } else {
            c21255 = new C9320(c5198.m8736(), c0701M4153, listM19008);
        }
        atomicReferenceM21355.set(c21255);
    }
}
