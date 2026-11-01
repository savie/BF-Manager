package l;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۙܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4773 extends C9238 implements ListIterator {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13947 f16791;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private ListIterator m13243() {
        m23754();
        return (ListIterator) this.f31398;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4773(C13947 c13947) {
        super(c13947);
        this.f16791 = c13947;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4773(C13947 c13947, int i) {
        super(c13947, ((List) c13947.f10884).listIterator(i));
        this.f16791 = c13947;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m13243().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m13243().previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m13243().nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m13243().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m13243().set(obj);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C13947 c13947 = this.f16791;
        boolean zIsEmpty = c13947.isEmpty();
        m13243().add(obj);
        AbstractC11830.m29505(c13947.f45897);
        if (zIsEmpty) {
            c13947.m8688();
        }
    }
}
