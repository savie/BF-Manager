package l;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V1O7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24877 extends AbstractC21147 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f80504 = new ArrayList(3);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55406(AbstractC21147 abstractC21147) {
        this.f80504.add(abstractC21147);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55407(AbstractC21147 abstractC21147) {
        this.f80504.remove(abstractC21147);
    }

    @Override // l.AbstractC21147
    public final void onPageScrolled(int i, float f, int i2) {
        try {
            Iterator it = this.f80504.iterator();
            while (it.hasNext()) {
                ((AbstractC21147) it.next()).onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // l.AbstractC21147
    public final void onPageSelected(int i) {
        try {
            Iterator it = this.f80504.iterator();
            while (it.hasNext()) {
                ((AbstractC21147) it.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // l.AbstractC21147
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it = this.f80504.iterator();
            while (it.hasNext()) {
                ((AbstractC21147) it.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
