package l;

/* JADX INFO: renamed from: l.۫֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8T2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12732 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40759;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f40760;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f40761;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f40762;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17426 f40763;

    public C12732(C17426 c17426) {
        this.f40763 = c17426;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31543(int i) {
        this.f40762 |= i > 0;
        this.f40760 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31544(C17426 c17426) {
        this.f40762 |= this.f40763 != c17426;
        this.f40763 = c17426;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31545(int i) {
        if (this.f40761 && this.f40759 != 5) {
            C20782.m47565(i == 5);
            return;
        }
        this.f40762 = true;
        this.f40761 = true;
        this.f40759 = i;
    }
}
