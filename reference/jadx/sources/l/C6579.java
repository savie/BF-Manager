package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6579 extends AbstractC15939 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22159;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f22160;

    public C6579(Iterable iterable, int i) {
        this.f22160 = iterable;
        this.f22159 = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f22160.iterator();
        it.getClass();
        int i = this.f22159;
        C18304.m42516("limit is negative", i >= 0);
        return new C7991(i, it);
    }
}
