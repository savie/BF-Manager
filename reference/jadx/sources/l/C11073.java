package l;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۤᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11073 extends C5108 implements ListIterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23008 f34926;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private ListIterator m27983() {
        m15453();
        return (ListIterator) this.f17810;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11073(C23008 c23008) {
        super(c23008);
        this.f34926 = c23008;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11073(C23008 c23008, int i) {
        super(c23008, ((List) c23008.f71734).listIterator(i));
        this.f34926 = c23008;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m27983().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m27983().previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m27983().nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m27983().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m27983().set(obj);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C23008 c23008 = this.f34926;
        boolean zIsEmpty = c23008.isEmpty();
        m27983().add(obj);
        AbstractC20024.m46061(c23008.f74670);
        if (zIsEmpty) {
            c23008.m50314();
        }
    }
}
