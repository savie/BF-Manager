package l;

/* JADX INFO: renamed from: l.ۙܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5030 extends AbstractC16962 {
    @Override // l.AbstractC23128, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // l.InterfaceC18873
    public final void i(InterfaceC18873 interfaceC18873) {
        this.b += ((AbstractC16962) interfaceC18873).b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }
}
