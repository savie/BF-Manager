package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩹ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes2.dex */
public final class C22270 extends C5336 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4692 f72782;

    public C22270(char[] cArr, int i, int i2, int i3, InterfaceC4692 interfaceC4692) {
        super(i, i2, cArr, i3 | 20);
        this.f72782 = interfaceC4692;
    }

    @Override // l.C5336
    /* JADX INFO: renamed from: ۙ */
    public final C5336 mo14814(int i, int i2) {
        return new C22270(this.f18407, i, i2, this.f18409, this.f72782);
    }

    @Override // l.C5336, l.InterfaceC20693
    public final Comparator getComparator() {
        return this.f72782;
    }

    @Override // l.C5336, l.InterfaceC11687, l.InterfaceC20693
    public final InterfaceC4692 getComparator() {
        return this.f72782;
    }
}
