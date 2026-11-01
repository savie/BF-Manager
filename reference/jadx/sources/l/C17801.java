package l;

import java.util.List;

/* JADX INFO: renamed from: l.ᩳۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5G1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17801 extends AbstractC23142 implements InterfaceC14358 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f56417;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5807 f56418;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56419;

    public C17801(String str, C5807 c5807) {
        int i;
        this.f56417 = str;
        this.f56418 = c5807;
        if (str != null && str.startsWith("call_site_")) {
            try {
                i = Integer.parseInt(str.substring(10));
            } catch (NumberFormatException unused) {
                i = -1;
            }
        } else {
            i = -1;
        }
        this.f56419 = i;
    }

    @Override // l.InterfaceC18029
    public final String getName() {
        return this.f56417;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC8152 mo19719() {
        return ((C22118) this.f56418.f19725.get(0)).f71614;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ܶ */
    public final String mo19722() {
        return ((InterfaceC5060) this.f56418.f19725.get(1)).getValue();
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC19441 mo19721() {
        return ((C0950) this.f56418.f19725.get(2)).f3768;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ۜ */
    public final List mo19720() {
        C5807 c5807 = this.f56418;
        if (c5807.f19725.size() <= 3) {
            return AbstractC22433.of();
        }
        List list = c5807.f19725;
        return list.subList(3, list.size());
    }

    @Override // l.InterfaceC18029
    public final int getIndex() {
        return this.f56419;
    }
}
