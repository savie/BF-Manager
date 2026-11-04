package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩶۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21171 extends C14457 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4544 f67585;

    @Override // l.C14457
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15949 mo34922(int i, int[] iArr) {
        C18450.m42990(iArr.length, 0, i);
        return new C20425(iArr, 0, i, this.f45495, this.f67585);
    }

    public C21171(InterfaceC8273 interfaceC8273, long j, InterfaceC4544 interfaceC4544) {
        super(interfaceC8273, j, 341);
        this.f67585 = interfaceC4544;
    }

    @Override // l.C14457, l.InterfaceC8409
    public final Comparator getComparator() {
        return this.f67585;
    }

    @Override // l.C14457, l.InterfaceC15949, l.InterfaceC8409
    public final InterfaceC4544 getComparator() {
        return this.f67585;
    }
}
