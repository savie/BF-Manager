package l;

import java.util.List;
import java.util.Vector;

/* JADX INFO: renamed from: l.ܺܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes5.dex */
public final class C16992 implements InterfaceC17058 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23706 f55531;

    public C16992(C23706 c23706) {
        this.f55531 = c23706;
    }

    @Override // l.InterfaceC17058
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12540(Object obj) {
        return ((C17630) obj).m41280();
    }

    @Override // l.InterfaceC17058
    /* JADX INFO: renamed from: ᩷ */
    public final String mo12541(Object obj) {
        return ((C17630) obj).m41279();
    }

    @Override // l.InterfaceC17058
    /* JADX INFO: renamed from: ۙ */
    public final List mo12539(String str) {
        String strM20187 = AbstractC7364.m20187(str);
        C23706 c23706 = this.f55531;
        C20614 c20614M52959 = C23706.m52959(c23706);
        try {
            Vector<C17630> vectorM47225 = c20614M52959.m47225(strM20187);
            if (c23706.f76837 == null && vectorM47225.size() > 0) {
                C23706.m52958(c23706, c20614M52959, vectorM47225, strM20187);
            }
            for (C17630 c17630 : vectorM47225) {
                if (c17630.m41273().m52105()) {
                    String strM47230 = c20614M52959.m47230(C11293.m28549(strM20187, c17630.m41279()));
                    c17630.m41274(strM47230);
                    if (!strM47230.startsWith("/")) {
                        strM47230 = C11293.m28549(strM20187, strM47230);
                    }
                    try {
                        c17630.m41275(c20614M52959.m47231(strM47230));
                    } catch (C20199 e) {
                        int i = e.f64841;
                        if (i == 2) {
                            continue;
                        } else if (i != 10) {
                            throw e;
                        }
                    }
                }
            }
            C10367.m26670(c20614M52959);
            return vectorM47225;
        } catch (Throwable th) {
            C10367.m26670(c20614M52959);
            throw th;
        }
    }
}
