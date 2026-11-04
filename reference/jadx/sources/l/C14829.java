package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes5.dex */
public final class C14829 extends C4389 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16564 f48513;

    @Override // l.C4389
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16321 mo13998(char[] cArr, int i) {
        C18450.m42990(cArr.length, 0, i);
        return new C20797(cArr, 0, i, this.f15818, this.f48513);
    }

    public C14829(InterfaceC8360 interfaceC8360, long j, InterfaceC16564 interfaceC16564) {
        super(interfaceC8360, j, 341);
        this.f48513 = interfaceC16564;
    }

    @Override // l.C4389, l.InterfaceC8409
    public final Comparator getComparator() {
        return this.f48513;
    }

    @Override // l.C4389, l.InterfaceC16321, l.InterfaceC8409
    public final InterfaceC16564 getComparator() {
        return this.f48513;
    }
}
