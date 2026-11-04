package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5G1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9683 extends AbstractC1002 implements InterfaceC17800 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11330 f31262;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f31263;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31264;

    public C9683(String str, C11330 c11330) {
        int i;
        this.f31263 = str;
        this.f31262 = c11330;
        if (str != null && str.startsWith("call_site_")) {
            try {
                i = Integer.parseInt(str.substring(10));
            } catch (NumberFormatException unused) {
                i = -1;
            }
        } else {
            i = -1;
        }
        this.f31264 = i;
    }

    @Override // l.InterfaceC2338
    public final String getName() {
        return this.f31263;
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6813 mo7875() {
        return ((C14313) this.f31262.f35702.get(0)).f45175;
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ܺ */
    public final String mo7877() {
        return ((InterfaceC14553) this.f31262.f35702.get(1)).getValue();
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC13524 mo7878() {
        return ((C21027) this.f31262.f35702.get(2)).f67194;
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ۧ */
    public final List mo7876() {
        C11330 c11330 = this.f31262;
        if (c11330.f35702.size() <= 3) {
            return AbstractC1928.of();
        }
        List list = c11330.f35702;
        return list.subList(3, list.size());
    }

    @Override // l.InterfaceC2338
    public final int getIndex() {
        return this.f31264;
    }
}
