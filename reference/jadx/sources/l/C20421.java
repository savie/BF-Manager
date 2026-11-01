package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20421 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12660 f66192;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f66193;

    public C20421(C12660 c12660, CharSequence charSequence) {
        this.f66193 = charSequence;
        this.f66192 = c12660;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C12660.m31453(this.f66192, this.f66193);
    }

    public final String toString() {
        C13366 c13366M32865 = C13366.m32865(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        c13366M32865.m32868(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
