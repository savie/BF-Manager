package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5904 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC13908 f20208;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f20209;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4214 f20210;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2175 f20211;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f20212;

    public C5904(C2175 c2175, AbstractC19728 abstractC19728, Predicate predicate, EnumC13908 enumC13908) {
        this.f20211 = c2175;
        this.f20209 = predicate;
        this.f20208 = enumC13908;
        C4214 c4214M7483 = c2175.m7483(abstractC19728, predicate);
        this.f20210 = c4214M7483;
        C2175 c2176 = c4214M7483.f15399;
        this.f20212 = c2176 != null ? c2176.f7156 : -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C4214 c4214 = this.f20210;
        C2175 c2175 = c4214.f15399;
        if (c2175 != null && this.f20212 != c2175.f7156 && !c2175.mo7485(c4214.f15400)) {
            this.f20210 = this.f20210.m13479(this.f20209);
        }
        C2175 c2176 = this.f20210.f15399;
        if (c2176 != null) {
            return this.f20208 == EnumC13908.RECURSIVE || c2176 == this.f20211;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C4214 c4214 = this.f20210;
        this.f20210 = c4214.m13479(this.f20209);
        return c4214.f15400;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
