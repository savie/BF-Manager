package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12695 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Iterator f40660;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21646 f40661;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22547 f40662;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Iterator f40663;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22547 f40664;

    public C12695(InterfaceC21646 interfaceC21646) {
        this.f40661 = interfaceC21646;
        Iterator itMo3129 = interfaceC21646.mo3129();
        this.f40663 = itMo3129;
        Iterator itMo3128 = interfaceC21646.mo3128();
        this.f40660 = itMo3128;
        this.f40662 = itMo3129.hasNext() ? (C22547) itMo3129.next() : null;
        this.f40664 = itMo3128.hasNext() ? (C22547) itMo3128.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (this.f40662 == null && this.f40664 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C22547 c22547;
        C22547 c22548 = this.f40662;
        if (c22548 == null || ((c22547 = this.f40664) != null && (c22547.f72892 < c22548.f72892 || c22547.f72894 < c22548.f72894))) {
            C22547 c22549 = this.f40664;
            Iterator it = this.f40660;
            this.f40664 = it.hasNext() ? (C22547) it.next() : null;
            return new C5393(c22549, Boolean.TRUE);
        }
        Iterator it2 = this.f40663;
        this.f40662 = it2.hasNext() ? (C22547) it2.next() : null;
        return new C5393(c22548, Boolean.FALSE);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
