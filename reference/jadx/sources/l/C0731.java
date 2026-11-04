package l;

/* JADX INFO: renamed from: l.֡᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0731 extends AbstractC2377 implements InterfaceC17293 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C11171 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0731(C11171 c11171, InterfaceC15143 interfaceC15143, boolean z) {
        super(interfaceC15143);
        this.e = c11171;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // l.InterfaceC13080, java.util.function.DoubleConsumer
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

    @Override // l.InterfaceC17293
    public final long h() {
        return this.b;
    }
}
