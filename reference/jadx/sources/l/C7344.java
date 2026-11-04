package l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7344 extends AbstractC10892 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C25113 f24183;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15299 f24184;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C24404 f24185;

    public C7344(C5721 c5721, C24404 c24404, InterfaceC15299 interfaceC15299) {
        this.f24185 = c24404;
        this.f24184 = interfaceC15299;
        this.f24183 = c5721.f19729.m39893(interfaceC15299.getType());
    }

    @Override // l.InterfaceC15299
    public final String getType() {
        return (String) this.f24185.m54589().mo2798(this.f24184.getType());
    }

    @Override // l.InterfaceC15299
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(C19906.m45837(this.f24184.getElements(), this.f24185.m54579()));
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC19073 interfaceC19073 = (InterfaceC19073) arrayList.get(i);
            String strM55991 = this.f24183.m55991(interfaceC19073.getName());
            if (strM55991 != null) {
                arrayList.set(i, new C8835(strM55991, interfaceC19073.getValue()));
            }
        }
        return C5721.m16765(arrayList);
    }
}
