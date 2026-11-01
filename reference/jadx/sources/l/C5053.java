package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۚۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes2.dex */
public final class C5053 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Supplier f17628;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile Object f17629;

    public C5053(Supplier supplier) {
        this.f17628 = supplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m14070() {
        Object obj = this.f17629;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            if (this.f17629 == null) {
                obj = this.f17628.get();
                this.f17629 = obj;
            }
        }
        return obj;
    }
}
