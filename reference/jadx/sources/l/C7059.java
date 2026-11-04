package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۜۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7059 implements InterfaceC11271 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f23266;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13770 f23267;

    public C7059(C13770 c13770) {
        this.f23267 = c13770;
        this.f23266 = C4560.m14323(0, c13770.f43708);
    }

    @Override // l.InterfaceC11271
    public final boolean hasNext() {
        return this.f23266 >= 0;
    }

    @Override // l.InterfaceC11271
    public final int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f23266;
        this.f23266 = C4560.m14323(i + 1, this.f23267.f43708);
        return i;
    }
}
