package l;

/* JADX INFO: renamed from: l.ܶ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15082 extends AbstractC18609 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC18609
    /* JADX INFO: renamed from: ۙ */
    public final void mo9567(AbstractC6614 abstractC6614, Object obj) {
        InterfaceC21431 interfaceC21431 = (InterfaceC21431) abstractC6614;
        StringBuilder sb = (StringBuilder) obj;
        sb.append(interfaceC21431.hashCode() + " ");
        sb.append(interfaceC21431.mo5805().toString().replaceAll(",", " ").replaceAll("\\{", "[").replaceAll("\\}", "]"));
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC18609
    /* JADX INFO: renamed from: ۙ */
    public final void mo9568(InterfaceC22843 interfaceC22843, AbstractC6614 abstractC6614, AbstractC6614 abstractC6615, Object obj) {
        InterfaceC21431 interfaceC21431 = (InterfaceC21431) abstractC6614;
        InterfaceC21431 interfaceC21432 = (InterfaceC21431) abstractC6615;
        StringBuilder sb = (StringBuilder) obj;
        sb.append(interfaceC21431.hashCode() + " -> " + interfaceC21432.hashCode());
        sb.append(interfaceC21431.mo12538(interfaceC21432, interfaceC22843).toString().replaceAll(",", " ").replaceAll("\\{", "[").replaceAll("\\}", "]"));
        sb.append('\n');
    }
}
