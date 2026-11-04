package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7483 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f24757;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f24758;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14106 f24759;

    public /* synthetic */ C7483(C19571 c19571, Iterable iterable, C14106 c14106, Set set) {
        this.f24757 = iterable;
        this.f24759 = c14106;
        this.f24758 = set;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C14194(this.f24757, this.f24759, this.f24758);
    }
}
