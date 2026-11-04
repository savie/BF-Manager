package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes3.dex */
public final class C1710 extends AbstractC0501 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f5855;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6163 f5856;

    public C1710(Iterable iterable, InterfaceC6163 interfaceC6163) {
        this.f5855 = iterable;
        this.f5856 = interfaceC6163;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f5855.iterator();
        it.getClass();
        InterfaceC6163 interfaceC6163 = this.f5856;
        interfaceC6163.getClass();
        return new C23339(it, interfaceC6163);
    }
}
