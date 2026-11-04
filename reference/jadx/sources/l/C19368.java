package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1IY6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19368 extends AbstractC6683 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C19368 f62577 = new C19368(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44785(C2551 c2551) {
        C24590.m54904(c2551, f62577);
    }

    @Override // l.AbstractC6683, l.InterfaceC14892
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13866(C2551 c2551, InterfaceC18213 interfaceC18213) {
        if (interfaceC18213 instanceof C6831) {
            ((C6831) interfaceC18213).m19039();
            return;
        }
        if (interfaceC18213 instanceof C14287) {
            C14804.m35645(c2551, (C14287) interfaceC18213);
            return;
        }
        if (interfaceC18213 instanceof C12050) {
            C12050 c12050 = (C12050) interfaceC18213;
            ArrayList arrayList = (ArrayList) c12050.mo19035();
            if (arrayList.isEmpty()) {
                return;
            }
            InterfaceC6281 interfaceC6281 = (InterfaceC6281) j$$ExternalSyntheticOutline0.m(arrayList, 1);
            List listMo17861 = interfaceC6281.mo17861(C11457.f36017);
            if (listMo17861.isEmpty()) {
                return;
            }
            C18916 c18916 = (C18916) listMo17861.get(0);
            if (c18916.m43922().equals(interfaceC6281)) {
                if (interfaceC6281 instanceof C21943) {
                    C21943 c21943 = (C21943) interfaceC6281;
                    if (((ArrayList) c21943.mo1986()).isEmpty()) {
                        ((ArrayList) c21943.mo1986()).add(c18916.m43923());
                        return;
                    }
                }
                c12050.m30228((InterfaceC6281) new C0314(c18916.m43923()));
            }
        }
    }
}
