package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۛۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5960 extends C17249 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Comparator f20314;

    @Override // l.C17249
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7371 mo16249(int i, Object[] objArr) {
        C7000.m18807(objArr.length, 0, i);
        return new C20072(objArr, 0, i, this.f54957, this.f20314);
    }

    public C5960(InterfaceC21086 interfaceC21086, long j, Comparator comparator) {
        super(interfaceC21086, j, 85);
        this.f20314 = comparator;
    }

    @Override // l.C17249, l.InterfaceC20693
    public final Comparator getComparator() {
        return this.f20314;
    }
}
