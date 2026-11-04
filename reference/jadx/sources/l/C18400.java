package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18400 extends AbstractC0501 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable[] f59938;

    public C18400(Iterable[] iterableArr) {
        this.f59938 = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable[] iterableArr = this.f59938;
        return new C6185(new C21384(iterableArr.length, iterableArr));
    }
}
