package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 151T */
/* JADX INFO: loaded from: classes5.dex */
public final class C16067 extends AbstractC13894 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23527 f52067;

    public C16067(C23527 c23527) {
        this.f52067 = c23527;
    }

    @Override // l.AbstractC13894, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C23527 c23527 = this.f52067;
        return AbstractC0501.m2460(c23527.f76020).m2461(c23527.f76019 + 1).m2462(C3389.f11037).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f52067.f76019 + 1;
    }
}
