package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12930 extends AbstractC15939 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f42972;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19010 f42973;

    public C12930(Iterable iterable, InterfaceC19010 interfaceC19010) {
        this.f42972 = iterable;
        this.f42973 = interfaceC19010;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f42972.iterator();
        it.getClass();
        InterfaceC19010 interfaceC19010 = this.f42973;
        interfaceC19010.getClass();
        return new C17868(it, interfaceC19010);
    }
}
