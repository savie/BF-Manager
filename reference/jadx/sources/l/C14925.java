package l;

/* JADX INFO: renamed from: l.ܶ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14925 extends AbstractC19864 {
    @Override // l.AbstractC18548, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // l.InterfaceC2319
    public final void i(InterfaceC2319 interfaceC2319) {
        this.b += ((AbstractC19864) interfaceC2319).b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }
}
