package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7654 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0942 f25224;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f25225;

    public C7654(C0942 c0942, CharSequence charSequence) {
        this.f25225 = charSequence;
        this.f25224 = c0942;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C0942.m3761(this.f25224, this.f25225);
    }

    public final String toString() {
        C17349 c17349M40726 = C17349.m40726(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        c17349M40726.m40729(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
