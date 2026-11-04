package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C2541 extends C10701 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22636 f8123;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2541(C22636 c22636) {
        super(c22636);
        this.f8123 = c22636;
    }

    @Override // l.C10701, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C9252(this.f8123);
    }
}
