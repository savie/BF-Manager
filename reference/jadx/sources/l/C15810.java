package l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public final class C15810 implements InterfaceC24762 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0148 f51438;

    public C15810(AbstractC0148 abstractC0148) {
        this.f51438 = abstractC0148;
    }

    @Override // l.InterfaceC24762
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList mo37733() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f51438.f1120.entrySet()) {
            arrayList.add(new C16556((String) entry.getKey(), ((Integer) entry.getValue()).intValue()));
        }
        return arrayList;
    }

    @Override // l.InterfaceC24762
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37734(C16556 c16556) {
        this.f51438.f1120.put(c16556.m39198(), Integer.valueOf(c16556.m39199()));
        C7606.m20793();
    }

    @Override // l.InterfaceC24762
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo37735(C16556 c16556) {
        this.f51438.f1120.remove(c16556.m39198());
        C7606.m20793();
    }
}
