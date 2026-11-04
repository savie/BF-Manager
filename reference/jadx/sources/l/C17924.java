package l;

/* JADX INFO: renamed from: l.ܽ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes5.dex */
public final class C17924 extends AbstractC21654 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC21654[] f58709;

    public C17924(AbstractC22664 abstractC22664, AbstractC21654[] abstractC21654Arr) {
        super(abstractC22664);
        this.f58709 = abstractC21654Arr;
    }

    public C17924(C2832 c2832, C14769 c14769) {
        super(c2832);
        this.f58709 = (AbstractC21654[]) c14769.toArray(new AbstractC21654[c14769.m35551()]);
    }

    @Override // l.AbstractC21654
    /* JADX INFO: renamed from: ۙ */
    public final void mo12192(InterfaceC14940 interfaceC14940) {
        interfaceC14940.mo18305(this);
    }

    @Override // l.InterfaceC19466
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        AbstractC21654[] abstractC21654Arr = this.f58709;
        int length = abstractC21654Arr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            AbstractC21654 abstractC21654 = abstractC21654Arr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(abstractC21654);
            i++;
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // l.AbstractC21654, l.InterfaceC19466
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12191(InterfaceC14990 interfaceC14990) {
        return interfaceC14990.mo22505(C14769.m35542((Object[]) this.f58709));
    }

    @Override // l.AbstractC21654
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5510 mo41838() {
        AbstractC21654[] abstractC21654Arr = this.f58709;
        if (abstractC21654Arr.length != 0) {
            return abstractC21654Arr[0].mo41838();
        }
        return null;
    }
}
