package l;

/* JADX INFO: renamed from: l.ۛܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M181 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6131 implements InterfaceC12414 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11071 f20936;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C18597 f20935 = new C18597();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18597 f20934 = new C18597();

    public C6131(C11071 c11071) {
        this.f20936 = c11071;
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۨ */
    public final void mo1609(int i) {
        this.f20934.add(i);
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۙ */
    public final void mo1606(int i) {
        this.f20935.add(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17118() {
        C11071 c11071;
        InterfaceC13431 it = this.f20935.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c11071 = this.f20936;
            if (!zHasNext) {
                break;
            }
            int iNextInt = it.nextInt();
            if (iNextInt > c11071.f37576) {
                c11071.f37576 = iNextInt;
            }
        }
        InterfaceC13431 it2 = this.f20934.iterator();
        while (it2.hasNext()) {
            int iNextInt2 = it2.nextInt();
            if (iNextInt2 > c11071.f37576) {
                c11071.f37576 = iNextInt2;
            }
        }
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ܰ */
    public final void mo1610(int i) {
        mo1609(i);
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۖ */
    public final void mo1605(int i) {
        mo1606(i);
    }
}
