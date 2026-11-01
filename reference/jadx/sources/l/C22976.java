package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩺ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes2.dex */
public final class C22976 extends C6747 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4692 f74678;

    @Override // l.C6747
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11687 mo18245(char[] cArr, int i) {
        C7000.m18807(cArr.length, 0, i);
        return new C22270(cArr, 0, i, this.f22728, this.f74678);
    }

    public C22976(InterfaceC20921 interfaceC20921, long j, InterfaceC4692 interfaceC4692) {
        super(interfaceC20921, j, 341);
        this.f74678 = interfaceC4692;
    }

    @Override // l.C6747, l.InterfaceC20693
    public final Comparator getComparator() {
        return this.f74678;
    }

    @Override // l.C6747, l.InterfaceC11687, l.InterfaceC20693
    public final InterfaceC4692 getComparator() {
        return this.f74678;
    }
}
