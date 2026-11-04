package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۗᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C3599 extends AbstractC5837 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4345 f12304;

    @Override // l.AbstractC5837, l.AbstractC13711, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C3599(C4345 c4345) {
        this.f12304 = c4345;
    }

    @Override // l.InterfaceC5574
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6352(long j) {
        return this.f12304.m13845(j) != -1;
    }

    @Override // l.AbstractC5837
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11667(long j) {
        C4345 c4345 = this.f12304;
        int iM13845 = c4345.m13845(j);
        if (iM13845 == -1) {
            return false;
        }
        int i = (c4345.f15714 - iM13845) - 1;
        long[] jArr = c4345.f15719;
        int i2 = iM13845 + 1;
        System.arraycopy(jArr, i2, jArr, iM13845, i);
        Object[] objArr = c4345.f15715;
        System.arraycopy(objArr, i2, objArr, iM13845, i);
        int i3 = c4345.f15714 - 1;
        c4345.f15714 = i3;
        c4345.f15715[i3] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C16277(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC5574, l.InterfaceC3336
    public final InterfaceC12285 iterator() {
        return new C16277(this);
    }

    @Override // l.AbstractC5837, l.AbstractC13711, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C23737(this, 0, this.f12304.f15714);
    }

    @Override // l.AbstractC13711, l.InterfaceC3336
    public final void forEach(LongConsumer longConsumer) {
        C4345 c4345 = this.f12304;
        long[] jArr = c4345.f15719;
        int i = c4345.f15714;
        for (int i2 = 0; i2 < i; i2++) {
            longConsumer.accept(jArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12304.f15714;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12304.clear();
    }
}
