package l;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩵ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19213 extends AbstractC9031 implements InterfaceC22762 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12863 f62040;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1428 f62041;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC0934 f62042;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C4956 f62043;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C1428 f62044;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3067 f62045;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC0934 f62046;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5807 f62047;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f62048;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SortedSet f62050;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final SortedSet f62052;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f62049 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62051 = 0;

    public C19213(C1428 c1428, int i, C1428 c1429, C4956 c4956, C3067 c3067, C12863 c12863, AbstractC0934 abstractC0934, AbstractC0934 abstractC0935, Iterable iterable, C5807 c5807) {
        iterable = iterable == null ? AbstractC22433.of() : iterable;
        abstractC0934 = abstractC0934 == null ? AbstractC0934.of() : abstractC0934;
        abstractC0935 = abstractC0935 == null ? AbstractC0934.of() : abstractC0935;
        this.f62044 = c1428;
        this.f62048 = i;
        this.f62041 = c1429;
        this.f62043 = c4956;
        this.f62045 = c3067;
        this.f62040 = c12863;
        this.f62052 = abstractC0934;
        this.f62050 = abstractC0935;
        this.f62046 = AbstractC0934.m3682(C22808.m50474(iterable, C5370.f18561));
        this.f62042 = AbstractC0934.m3682(C22808.m50474(iterable, C5370.f18563));
        this.f62047 = c5807;
    }

    @Override // l.InterfaceC15914
    public final String getType() {
        return this.f62044.f5881.f11559;
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۨ */
    public final int mo20491() {
        return this.f62048;
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۬ۨ */
    public final String mo20494() {
        C1428 c1428 = this.f62041;
        if (c1428 == null) {
            return null;
        }
        return c1428.f5881.f11559;
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۬ */
    public final String mo20493() {
        C3067 c3067 = this.f62045;
        if (c3067 == null) {
            return null;
        }
        return c3067.f11559;
    }

    @Override // l.InterfaceC22762
    public final Set getAnnotations() {
        return this.f62040;
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ܳۙ */
    public final Iterable mo20496() {
        return this.f62052;
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ܳۙ */
    public final SortedSet mo20496() {
        return this.f62052;
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۢܰ */
    public final Iterable mo20489() {
        return this.f62050;
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ܰۨ */
    public final Iterable mo20495() {
        return this.f62046;
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ܰۨ */
    public final AbstractC0934 mo20495() {
        return this.f62046;
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۚۨ */
    public final Iterable mo20486() {
        return this.f62042;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44129(C1428 c1428) {
        this.f62041 = c1428;
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ᩹ۙ */
    public final List mo20500() {
        return C3051.m9144(this.f62043, C5604.m15472());
    }

    @Override // l.InterfaceC22762
    public final Iterable getFields() {
        return new C18507(this);
    }

    @Override // l.InterfaceC22762
    public final Iterable getMethods() {
        return new C7924(this);
    }

    @Override // l.InterfaceC22762
    public final Collection getMethods() {
        return new C7924(this);
    }
}
