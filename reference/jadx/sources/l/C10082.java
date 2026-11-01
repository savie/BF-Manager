package l;

/* JADX INFO: renamed from: l.ۤۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10082 extends AbstractC1094 implements InterfaceC0182 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C12904 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10082(C12904 c12904, InterfaceC19171 interfaceC19171, boolean z) {
        super(interfaceC19171);
        this.e = c12904;
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

    @Override // l.InterfaceC0182
    public final long h() {
        return this.b;
    }
}
