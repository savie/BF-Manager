package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳ᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: DAFW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19318 extends AbstractC11946 {
    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ۙ */
    public final Object mo25426(Object obj) throws Exception {
        C3568 c3568 = (C3568) obj;
        C20614 c20614M26671 = C10367.m26671(c3568);
        c20614M26671.f66128 = c3568;
        return c20614M26671;
    }

    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ۙ */
    public final void mo25427(Object obj, InterfaceC17913 interfaceC17913) {
        C20614 c20614 = (C20614) interfaceC17913.mo14204();
        C17359.toString(c20614);
        c20614.m22548();
        try {
            c20614.m22542().m37625();
        } catch (C2079 unused) {
        }
    }

    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC17913 mo25428(Object obj) {
        return new C4489((C20614) obj);
    }

    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo25429(Object obj, InterfaceC17913 interfaceC17913) {
        C20614 c20614 = (C20614) interfaceC17913.mo14204();
        if (c20614.m22536()) {
            return false;
        }
        try {
            if (!c20614.m22542().m37620()) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC17913.mo14206().toEpochMilli();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 2000) {
                return true;
            }
            try {
                c20614.m47231(".");
                return true;
            } catch (IOException unused) {
                return false;
            }
        } catch (C2079 e) {
            e.toString();
            return false;
        }
    }
}
