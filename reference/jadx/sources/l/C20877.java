package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20877 extends AbstractC15939 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable[] f67814;

    public C20877(Iterable[] iterableArr) {
        this.f67814 = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable[] iterableArr = this.f67814;
        return new C8697(new C7471(iterableArr.length, iterableArr));
    }
}
