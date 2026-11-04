package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FIQP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9887 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f31798;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13616 f31799;

    public C9887(C13616 c13616) {
        this.f31799 = c13616;
        C4933 c4933 = c13616.f43256;
        this.f31798 = c4933 == null ? 0 : c4933.f17207;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C18838(this);
    }
}
