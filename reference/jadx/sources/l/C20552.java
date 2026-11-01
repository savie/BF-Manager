package l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20552 implements InterfaceC8558 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12068 f66549;

    public C20552(AbstractC12068 abstractC12068) {
        this.f66549 = abstractC12068;
    }

    @Override // l.InterfaceC8558
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo19051() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f66549.f40389.entrySet()) {
            arrayList.add(new C9969((String) entry.getKey(), ((Integer) entry.getValue()).intValue()));
        }
        return arrayList;
    }

    @Override // l.InterfaceC8558
    /* JADX INFO: renamed from: ۙ */
    public final void mo19052(C9969 c9969) {
        this.f66549.f40389.put(c9969.m25236(), Integer.valueOf(c9969.m25237()));
        C5717.m15755();
    }

    @Override // l.InterfaceC8558
    /* JADX INFO: renamed from: ܰ */
    public final void mo19053(C9969 c9969) {
        this.f66549.f40389.remove(c9969.m25236());
        C5717.m15755();
    }
}
