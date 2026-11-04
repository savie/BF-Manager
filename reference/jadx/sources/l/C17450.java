package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܽ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F15V */
/* JADX INFO: loaded from: classes4.dex */
public final class C17450 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f56756;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f56757;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f56758;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15958 f56759;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f56760;

    public C17450(C15958 c15958, int i, int i2, int i3, boolean z) {
        this.f56759 = c15958;
        this.f56756 = i;
        this.f56760 = i2;
        this.f56757 = i3;
        this.f56758 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40948(C8850 c8850, C10628 c10628, int i) {
        int i2 = this.f56757;
        if (i2 == -1) {
            throw new RuntimeException();
        }
        C15958.m38073(c8850, (InterfaceC4859) ((List) this.f56759.f51816.get(i2)).get(this.f56756), this.f56760, this.f56758, c10628, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40949(C8850 c8850, C10628 c10628, int i) {
        int i2 = this.f56757;
        if (i2 == -1) {
            throw new RuntimeException();
        }
        C15958.m38073(c8850, (InterfaceC4859) this.f56759.f51814.get(i2), this.f56760, this.f56758, c10628, i);
    }
}
