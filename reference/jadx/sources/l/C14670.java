package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes5.dex */
public final class C14670 extends AbstractC0501 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f47962;

    public C14670(Iterable iterable) {
        this.f47962 = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6185(new C3201(((C11404) this.f47962).iterator(), new C22313()));
    }
}
