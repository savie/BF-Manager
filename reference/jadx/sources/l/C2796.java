package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2796 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f9201;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4288 f9202;

    public C2796(Iterable iterable, InterfaceC4288 interfaceC4288) {
        this.f9201 = iterable;
        this.f9202 = interfaceC4288;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C9507(this, this.f9201.iterator());
    }
}
