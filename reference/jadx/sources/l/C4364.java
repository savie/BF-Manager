package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X6IH */
/* JADX INFO: loaded from: classes3.dex */
public final class C4364 extends AbstractC6683 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14287 f15741;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6281 f15742;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18293 f15743;

    public C4364(InterfaceC6281 interfaceC6281, C18293 c18293, C14287 c14287) {
        super(1);
        this.f15742 = interfaceC6281;
        this.f15743 = c18293;
        this.f15741 = c14287;
    }

    @Override // l.AbstractC6683, l.InterfaceC14892
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo13866(C2551 c2551, InterfaceC18213 interfaceC18213) {
        if (interfaceC18213 != this.f15742) {
            InterfaceC6281 interfaceC6281 = (InterfaceC6281) C6823.m18999(interfaceC18213.mo19035());
            if (interfaceC6281 instanceof C21943) {
                Iterator it = ((C21943) interfaceC6281).m49646().iterator();
                while (it.hasNext()) {
                    if (!this.f15743.m42625((C21943) it.next())) {
                    }
                }
                return;
            }
            return;
        }
        if (interfaceC18213.mo17865(EnumC1763.FALL_THROUGH) || C20531.m47076(interfaceC18213)) {
            return;
        }
        List listMo19035 = interfaceC18213.mo19035();
        C18959 c18959 = new C18959(EnumC24203.BREAK, 0);
        c18959.mo17866(EnumC1763.SYNTHETIC);
        c18959.mo17864(new C4328(this.f15741));
        listMo19035.add(new C0314(c18959));
    }
}
