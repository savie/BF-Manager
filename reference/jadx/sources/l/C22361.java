package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22361 implements InterfaceC14852 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f72383;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2920 f72384;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14769 f72385;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C14769 f72386;

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo11630() {
        return false;
    }

    public C22361(C11172 c11172, C2920 c2920, C14769 c14769, C14769 c147610) {
        this.f72383 = c11172;
        this.f72384 = c2920;
        this.f72385 = c14769;
        this.f72386 = c147610;
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public final void mo11629(AbstractC11781 abstractC11781) {
        C11172 c11172;
        C18499 c18499 = new C18499();
        C2920 c2920 = this.f72384;
        c18499.addAll(c2920.f9543);
        C18499 c184910 = new C18499();
        Iterator it = this.f72385.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c11172 = this.f72383;
            if (!zHasNext) {
                break;
            }
            C18825 c18825 = new C18825(c11172.f35200.m35517(c2920, ((C1258) it.next()).f4533));
            c184910.m43089(c18825);
            c18499.m43089(c18825);
        }
        c2920.f9560 = c184910.m43093();
        C18499 c184911 = new C18499();
        for (C10206 c10206 : this.f72386) {
            C18499 c184912 = new C18499();
            Iterator it2 = c10206.f32640.iterator();
            while (it2.hasNext()) {
                c184912.m43089(c11172.f35200.m35517(c2920, (AbstractC19728) it2.next()));
            }
            C18079 c18079 = new C18079(c11172.f35200.m35517(c2920, c10206.f32641), c184912.m43093());
            c184911.m43089(c18079);
            c18499.m43089(c18079);
        }
        c2920.f9557 = c184911.m43093();
        c2920.f9543 = c18499.m43093();
    }
}
