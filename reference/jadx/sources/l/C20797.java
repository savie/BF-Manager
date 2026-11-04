package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩵᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20797 extends C3643 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16564 f66608;

    public C20797(char[] cArr, int i, int i2, int i3, InterfaceC16564 interfaceC16564) {
        super(i, i2, cArr, i3 | 20);
        this.f66608 = interfaceC16564;
    }

    @Override // l.C3643
    /* JADX INFO: renamed from: ۙ */
    public final C3643 mo11797(int i, int i2) {
        return new C20797(this.f12468, i, i2, this.f12470, this.f66608);
    }

    @Override // l.C3643, l.InterfaceC8409
    public final Comparator getComparator() {
        return this.f66608;
    }

    @Override // l.C3643, l.InterfaceC16321, l.InterfaceC8409
    public final InterfaceC16564 getComparator() {
        return this.f66608;
    }
}
