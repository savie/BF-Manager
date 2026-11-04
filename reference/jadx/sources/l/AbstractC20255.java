package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩵ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: KIS2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20255 extends AbstractC16678 implements InterfaceC18213 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f65041 = C16980.m40037(AbstractC20255.class);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC18213 f65042;

    public AbstractC20255(InterfaceC18213 interfaceC18213) {
        this.f65042 = interfaceC18213;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo1987(C13476 c13476, InterfaceC3145 interfaceC3145) throws C7852 {
        throw new C7852("Code generate not implemented for container: ".concat(getClass().getSimpleName()));
    }

    @Override // l.InterfaceC18213
    public final InterfaceC18213 getParent() {
        return this.f65042;
    }

    @Override // l.InterfaceC18213
    /* JADX INFO: renamed from: ۙ */
    public final void mo42361(AbstractC20255 abstractC20255) {
        this.f65042 = abstractC20255;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo19029(InterfaceC6281 interfaceC6281, InterfaceC6281 interfaceC6282) {
        f65041.mo13728(getClass(), "Replace sub block not supported for class \"{}\"");
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46530(InterfaceC6281 interfaceC6281, AbstractC20255 abstractC20255) {
        if (interfaceC6281 instanceof InterfaceC18213) {
            ((InterfaceC18213) interfaceC6281).mo42361(abstractC20255);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public List mo10884() {
        return mo19035();
    }
}
