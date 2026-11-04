package l;

import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBI9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19255 implements InterfaceC13025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10304 f62281;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20946[] f62282;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f62283;

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ۙ */
    public final void mo6341(C1356 c1356) {
    }

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ۙ */
    public final void mo6342(C14033 c14033) {
    }

    public C19255(C10304 c10304, C20946[] c20946Arr, HashSet hashSet) {
        this.f62281 = c10304;
        this.f62282 = c20946Arr;
        this.f62283 = hashSet;
    }

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6343(C1356 c1356) {
        if (c1356.mo4988().m43509() != 3) {
            return;
        }
        int iMo17877 = ((C15943) ((AbstractC12741) c1356.mo4993()).m31552()).mo17877();
        C20946[] c20946Arr = this.f62282;
        C20946 c20946 = c20946Arr[iMo17877];
        if (c20946 == null) {
            c20946Arr[iMo17877] = c1356.m16508();
            return;
        }
        C20946 c20946M16508 = c1356.m16508();
        C3046 c3046M47896 = c20946.m47896();
        C3046 c3046M47897 = c20946M16508.m47896();
        if (c3046M47896 == null) {
            c3046M47896 = c3046M47897;
        } else if (c3046M47897 != null && !c3046M47896.equals(c3046M47897)) {
            return;
        }
        C10304 c10304 = this.f62281;
        c10304.f32881.m55738(c20946.m47903()).m16503(c3046M47896);
        C8068 c8068 = new C8068(this, c20946M16508, c20946);
        List listM55752 = c10304.f32881.m55752(c20946M16508.m47903());
        int size = listM55752.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AbstractC5568) listM55752.get(size)).mo4995(c8068);
            } else {
                this.f62283.add(c1356);
                return;
            }
        }
    }
}
