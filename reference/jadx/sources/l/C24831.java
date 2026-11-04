package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes.dex */
public final class C24831 extends AbstractC0501 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80320;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f80321;

    public C24831(Iterable iterable, int i) {
        this.f80321 = iterable;
        this.f80320 = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f80321.iterator();
        it.getClass();
        int i = this.f80320;
        C12128.m30308("limit is negative", i >= 0);
        return new C20355(i, it);
    }
}
