package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: DAFW */
/* JADX INFO: loaded from: classes5.dex */
public final class C16796 extends AbstractC12684 {
    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ۙ */
    public final Object mo16189(Object obj) throws Exception {
        C8351 c8351 = (C8351) obj;
        C4670 c4670M31268 = C12563.m31268(c8351);
        c4670M31268.f16519 = c8351;
        return c4670M31268;
    }

    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ۙ */
    public final void mo16190(Object obj, InterfaceC11273 interfaceC11273) {
        C4670 c4670 = (C4670) interfaceC11273.mo28254();
        C13638.toString(c4670);
        c4670.m20737();
        try {
            c4670.m20728().m9247();
        } catch (C5813 unused) {
        }
    }

    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC11273 mo16191(Object obj) {
        return new C11874((C4670) obj);
    }

    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo16192(Object obj, InterfaceC11273 interfaceC11273) {
        C4670 c4670 = (C4670) interfaceC11273.mo28254();
        if (c4670.m20730()) {
            return false;
        }
        try {
            if (!c4670.m20728().m9242()) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC11273.mo28258().toEpochMilli();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 2000) {
                return true;
            }
            try {
                c4670.m12938(".");
                return true;
            } catch (IOException unused) {
                return false;
            }
        } catch (C5813 e) {
            e.toString();
            return false;
        }
    }
}
