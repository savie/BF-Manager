package l;

/* JADX INFO: renamed from: l.֡ۧۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2623 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0384 extends AbstractC13347 {
    @Override // l.AbstractC13347
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2184(Object obj) {
        return ((InterfaceC19073) obj) instanceof C7842;
    }

    @Override // l.AbstractC13347
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object mo2185(Object obj) {
        InterfaceC19073 interfaceC19073 = (InterfaceC19073) obj;
        if (interfaceC19073 instanceof C7842) {
            return (C7842) interfaceC19073;
        }
        return new C7842(interfaceC19073.getName(), interfaceC19073.getValue());
    }
}
