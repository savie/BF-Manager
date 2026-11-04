package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۬ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes4.dex */
public final class C13797 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Supplier f43767;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile Object f43768;

    public C13797(Supplier supplier) {
        this.f43767 = supplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m33706() {
        Object obj = this.f43768;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            if (this.f43768 == null) {
                obj = this.f43767.get();
                this.f43768 = obj;
            }
        }
        return obj;
    }
}
