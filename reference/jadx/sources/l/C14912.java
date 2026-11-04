package l;

/* JADX INFO: renamed from: l.ܰ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14912 implements InterfaceC6163 {
    @Override // l.InterfaceC6163
    public final boolean apply(Object obj) {
        InterfaceC22049 interfaceC22049 = (InterfaceC22049) obj;
        if (!(interfaceC22049 instanceof InterfaceC20557)) {
            return false;
        }
        InterfaceC3058 interfaceC3058M12512 = C3881.m12512((InterfaceC20557) interfaceC22049);
        InterfaceC20670 interfaceC20670Of = C23654.of((Object[]) new String[]{"stream", "parallelStream", "toBuilder"});
        C17359.requireNonNull(interfaceC3058M12512);
        return interfaceC20670Of.anyMatch(new C17854(1, interfaceC3058M12512));
    }
}
