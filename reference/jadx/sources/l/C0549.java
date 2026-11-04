package l;

/* JADX INFO: renamed from: l.֡ܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M181 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0549 implements InterfaceC11442 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8007 f2283;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0594 f2282 = new C0594();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0594 f2281 = new C0594();

    public C0549(C8007 c8007) {
        this.f2283 = c8007;
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo2553(int i) {
        this.f2281.add(i);
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2552(int i) {
        this.f2282.add(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2551() {
        C8007 c8007;
        InterfaceC6036 it = this.f2282.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c8007 = this.f2283;
            if (!zHasNext) {
                break;
            }
            int iNextInt = it.nextInt();
            if (iNextInt > c8007.f26610) {
                c8007.f26610 = iNextInt;
            }
        }
        InterfaceC6036 it2 = this.f2281.iterator();
        while (it2.hasNext()) {
            int iNextInt2 = it2.nextInt();
            if (iNextInt2 > c8007.f26610) {
                c8007.f26610 = iNextInt2;
            }
        }
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo2554(int i) {
        mo2553(i);
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo2555(int i) {
        mo2552(i);
    }
}
