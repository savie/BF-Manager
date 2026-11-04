package l;

/* JADX INFO: renamed from: l.᩻᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S912 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25405 extends AbstractC17376 {
    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo17483(C10420 c10420, InterfaceC17045 interfaceC17045, InterfaceC13864 interfaceC13864);

    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ */
    public final void mo12252(InterfaceC20029 interfaceC20029, AbstractC11528 abstractC11528, InterfaceC13864 interfaceC13864) {
        if (interfaceC13864.mo14577()) {
            AbstractC17376.m40819(interfaceC20029, abstractC11528, interfaceC13864.mo14574());
        }
        Object objMo17483 = mo17483(interfaceC20029.mo7360(), interfaceC20029.mo7334(), interfaceC13864);
        if (objMo17483 != null) {
            C20775.m47526(interfaceC20029.builder(), objMo17483, interfaceC13864.start(), interfaceC13864.end());
        }
    }
}
