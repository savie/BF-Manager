package l;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۤۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8ISW */
/* JADX INFO: loaded from: classes4.dex */
public final class C10812 extends AbstractC22001 {
    @Override // l.AbstractC22001
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo27545() {
        if (m49734().m4147() == null) {
            throw new C8597("Expected to find block info within BaseBlockTraverserHandler");
        }
        AtomicReference atomicReferenceM21355 = m49734().m4149().m21355(m49734());
        if (atomicReferenceM21355 != null) {
            C8575 c8575 = new C8575(m49734());
            C19017 c19017M4147 = c8575.m8737().m4147();
            List listM44105 = c19017M4147.m44105();
            ListIterator listIterator = listM44105.listIterator(listM44105.size());
            int i = 0;
            while (listIterator.hasPrevious() && ((C18959) listIterator.previous()).getType() == EnumC24203.GOTO) {
                i++;
            }
            c19017M4147.m44107(c19017M4147.m44108() + i);
            c19017M4147.m44102(c19017M4147.m44103() + i);
            atomicReferenceM21355.set(new C13795(c8575.m8737()).m33705());
            return;
        }
        throw new C8597("Orphaned traverser state");
    }
}
