package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11404 extends AbstractC0501 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5417 f35870;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f35871;

    public C11404(Iterable iterable, InterfaceC5417 interfaceC5417) {
        this.f35871 = iterable;
        this.f35870 = interfaceC5417;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3201(this.f35871.iterator(), this.f35870);
    }
}
