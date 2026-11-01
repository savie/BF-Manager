package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3756 extends AbstractC15939 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11955 f13608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f13609;

    public C3756(Iterable iterable, InterfaceC11955 interfaceC11955) {
        this.f13609 = iterable;
        this.f13608 = interfaceC11955;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C18574(this.f13609.iterator(), this.f13608);
    }
}
