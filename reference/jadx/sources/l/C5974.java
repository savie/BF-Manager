package l;

/* JADX INFO: renamed from: l.ۚ᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5974 extends AbstractC9591 implements InterfaceC17293 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C2465 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5974(C2465 c2465, InterfaceC15143 interfaceC15143, boolean z) {
        super(interfaceC15143);
        this.e = c2465;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.e.t.test(obj);
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
            this.a.accept(obj);
        }
    }

    @Override // l.InterfaceC17293
    public final long h() {
        return this.b;
    }
}
