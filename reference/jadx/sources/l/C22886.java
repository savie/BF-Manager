package l;

/* JADX INFO: renamed from: l.᩸ܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22886 extends AbstractC6610 implements InterfaceC17293 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C23632 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22886(C23632 c23632, InterfaceC15143 interfaceC15143, boolean z) {
        super(interfaceC15143);
        this.e = c23632;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // l.InterfaceC1148, l.InterfaceC15143
    public final void accept(long j) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.e.s.test(j);
            this.c = !zTest;
            if (zTest) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = this.d;
        if (z2 && !z) {
            this.b++;
        }
        if (z2 || z) {
            this.a.accept(j);
        }
    }

    @Override // l.InterfaceC17293
    public final long h() {
        return this.b;
    }
}
