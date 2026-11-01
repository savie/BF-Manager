package l;

/* JADX INFO: renamed from: l.ܰۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13589 extends AbstractC13152 implements InterfaceC0182 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C17787 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13589(C17787 c17787, InterfaceC19171 interfaceC19171, boolean z) {
        super(interfaceC19171);
        this.e = c17787;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // l.InterfaceC8857, l.InterfaceC19171
    public final void accept(double d) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.e.t.test(d);
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
            this.a.accept(d);
        }
    }

    @Override // l.InterfaceC0182
    public final long h() {
        return this.b;
    }
}
