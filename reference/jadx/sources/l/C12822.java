package l;

/* JADX INFO: renamed from: l.۬ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2623 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12822 extends AbstractC0287 {
    @Override // l.AbstractC0287
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1809(Object obj) {
        return ((InterfaceC6533) obj) instanceof C3648;
    }

    @Override // l.AbstractC0287
    /* JADX INFO: renamed from: ܰ */
    public final Object mo1810(Object obj) {
        InterfaceC6533 interfaceC6533 = (InterfaceC6533) obj;
        if (interfaceC6533 instanceof C3648) {
            return (C3648) interfaceC6533;
        }
        return new C3648(interfaceC6533.getName(), interfaceC6533.getValue());
    }
}
