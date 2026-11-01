package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C18662 extends C20779 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15841 f60585;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18662(C15841 c15841) {
        super(c15841);
        this.f60585 = c15841;
    }

    @Override // l.C20779, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C17956(this.f60585);
    }
}
