package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۛۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R6HH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6187 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f21075 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m17828(AbstractC12531 abstractC12531) {
        return (Set) C11392.getOrDefault(this.f21075, abstractC12531, Collections.EMPTY_SET);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17830(AbstractC12531 abstractC12531, Comparable comparable) {
        if (abstractC12531 == comparable) {
            return;
        }
        ((Set) C11392.computeIfAbsent(this.f21075, abstractC12531, new C10558(5))).add(comparable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17829(BiConsumer biConsumer) {
        for (Map.Entry entry : this.f21075.entrySet()) {
            biConsumer.accept(entry.getKey(), (Set) entry.getValue());
        }
    }
}
