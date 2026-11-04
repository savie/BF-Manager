package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩵۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20425 extends C3271 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4544 f65429;

    public C20425(int[] iArr, int i, int i2, int i3, InterfaceC4544 interfaceC4544) {
        super(i, i2, i3 | 20, iArr);
        this.f65429 = interfaceC4544;
    }

    @Override // l.C3271
    /* JADX INFO: renamed from: ۙ */
    public final C3271 mo10770(int i, int i2) {
        return new C20425(this.f10652, i, i2, this.f10654, this.f65429);
    }

    @Override // l.C3271, l.InterfaceC8409
    public final Comparator getComparator() {
        return this.f65429;
    }

    @Override // l.C3271, l.InterfaceC15949, l.InterfaceC8409
    public final InterfaceC4544 getComparator() {
        return this.f65429;
    }
}
