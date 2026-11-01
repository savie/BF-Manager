package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۖۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4IS */
/* JADX INFO: loaded from: classes3.dex */
public final class C2278 extends AbstractC2679 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f8133 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f8134;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1428 f8135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Set f8136;

    public C2278(int i, C1428 c1428, AbstractC23844 abstractC23844) {
        this.f8134 = i;
        this.f8135 = c1428;
        this.f8136 = abstractC23844;
    }

    @Override // l.InterfaceC3710
    public final int getVisibility() {
        return this.f8134;
    }

    @Override // l.InterfaceC3710
    public final String getType() {
        return this.f8135.f5881.f11559;
    }

    @Override // l.InterfaceC3710
    public final Set getElements() {
        return this.f8136;
    }
}
