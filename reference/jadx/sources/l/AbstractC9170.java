package l;

/* JADX INFO: renamed from: l.ۡ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9170 extends AbstractC10581 implements InterfaceC17117 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6346 f31213;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC8325 f31214;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9170(C6346 c6346, InterfaceC17117 interfaceC17117) {
        super(c6346, interfaceC17117);
        this.f31213 = c6346;
        this.f31214 = null;
    }

    @Override // l.InterfaceC17117
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC7446 mo3896() {
        AbstractC8325 abstractC8325 = this.f31214;
        if (abstractC8325 != null) {
            return abstractC8325;
        }
        InterfaceC17117 interfaceC17117 = (InterfaceC17117) this.f36197;
        return C6346.m17452(this.f31213, interfaceC17117.mo3895(), interfaceC17117.mo3896());
    }

    @Override // l.InterfaceC17117
    /* JADX INFO: renamed from: ۟ */
    public final int mo3895() {
        return ((InterfaceC17117) this.f36197).mo3895();
    }

    @Override // l.AbstractC10581, l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        super.mo1141(c8485);
        this.f31214 = (AbstractC8325) c8485.m22156(mo3896());
    }
}
