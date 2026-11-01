package l;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1O7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16561 extends AbstractC11435 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53190 = new ArrayList(3);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38977(AbstractC11435 abstractC11435) {
        this.f53190.add(abstractC11435);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38978(AbstractC11435 abstractC11435) {
        this.f53190.remove(abstractC11435);
    }

    @Override // l.AbstractC11435
    public final void onPageScrolled(int i, float f, int i2) {
        try {
            Iterator it = this.f53190.iterator();
            while (it.hasNext()) {
                ((AbstractC11435) it.next()).onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // l.AbstractC11435
    public final void onPageSelected(int i) {
        try {
            Iterator it = this.f53190.iterator();
            while (it.hasNext()) {
                ((AbstractC11435) it.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // l.AbstractC11435
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it = this.f53190.iterator();
            while (it.hasNext()) {
                ((AbstractC11435) it.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
