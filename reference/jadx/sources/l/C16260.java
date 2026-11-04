package l;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܶᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6HP */
/* JADX INFO: loaded from: classes5.dex */
public final class C16260 extends AbstractC17072 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Set f52843;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public SortedSet f52844;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f52845;

    public C16260(List list, SortedSet sortedSet, Set set) {
        this.f52845 = list;
        this.f52844 = sortedSet;
        this.f52843 = set;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36025;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m38596() {
        return this.f52845;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final SortedSet m38595() {
        return this.f52844;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m38593() {
        return this.f52843;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38594(SortedSet sortedSet) {
        this.f52844 = sortedSet;
    }

    public final String toString() {
        return "METHOD_OVERRIDE: " + this.f52843;
    }
}
