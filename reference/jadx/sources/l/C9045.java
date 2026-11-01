package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9045 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f30857;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f30858;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7675 f30859;

    public /* synthetic */ C9045(C0576 c0576, Iterable iterable, C7675 c7675, Set set) {
        this.f30858 = iterable;
        this.f30859 = c7675;
        this.f30857 = set;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10456(this.f30858, this.f30859, this.f30857);
    }
}
