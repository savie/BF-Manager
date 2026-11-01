package l;

/* JADX INFO: renamed from: l.֫᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S912 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2159 extends AbstractC3382 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo6724(C18410 c18410, InterfaceC9239 interfaceC9239, InterfaceC21022 interfaceC21022);

    @Override // l.AbstractC3382
    /* JADX INFO: renamed from: ۙ */
    public final void mo3244(InterfaceC12061 interfaceC12061, AbstractC4332 abstractC4332, InterfaceC21022 interfaceC21022) {
        if (interfaceC21022.mo38114()) {
            AbstractC3382.m10034(interfaceC12061, abstractC4332, interfaceC21022.mo38112());
        }
        Object objMo6724 = mo6724(interfaceC12061.mo29970(), interfaceC12061.mo29965(), interfaceC21022);
        if (objMo6724 != null) {
            C2657.m8180(interfaceC12061.builder(), objMo6724, interfaceC21022.start(), interfaceC21022.end());
        }
    }
}
