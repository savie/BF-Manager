package l;

/* JADX INFO: renamed from: l.ۡ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9169 extends AbstractC10330 implements InterfaceC0182 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C7869 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9169(C7869 c7869, InterfaceC19171 interfaceC19171, boolean z) {
        super(interfaceC19171);
        this.e = c7869;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // l.InterfaceC10974, l.InterfaceC19171
    public final void accept(int i) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.e.s.test(i);
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
            this.a.accept(i);
        }
    }

    @Override // l.InterfaceC0182
    public final long h() {
        return this.b;
    }
}
