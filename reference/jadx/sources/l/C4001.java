package l;

/* JADX INFO: renamed from: l.ۘ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4001 extends AbstractC18171 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC18171
    /* JADX INFO: renamed from: ۙ */
    public final void mo6217(AbstractC6239 abstractC6239, Object obj) {
        InterfaceC14441 interfaceC14441 = (InterfaceC14441) abstractC6239;
        StringBuilder sb = (StringBuilder) obj;
        sb.append(interfaceC14441.hashCode() + " ");
        sb.append(interfaceC14441.mo25146().toString().replaceAll(",", " ").replaceAll("\\{", "[").replaceAll("\\}", "]"));
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC18171
    /* JADX INFO: renamed from: ۙ */
    public final void mo6218(InterfaceC24139 interfaceC24139, AbstractC6239 abstractC6239, AbstractC6239 abstractC62310, Object obj) {
        InterfaceC14441 interfaceC14441 = (InterfaceC14441) abstractC6239;
        InterfaceC14441 interfaceC14442 = (InterfaceC14441) abstractC62310;
        StringBuilder sb = (StringBuilder) obj;
        sb.append(interfaceC14441.hashCode() + " -> " + interfaceC14442.hashCode());
        sb.append(interfaceC14441.mo25147(interfaceC14442, interfaceC24139).toString().replaceAll(",", " ").replaceAll("\\{", "[").replaceAll("\\}", "]"));
        sb.append('\n');
    }
}
