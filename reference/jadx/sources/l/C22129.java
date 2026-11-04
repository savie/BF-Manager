package l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22129 extends C10194 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C25113 f71298;

    public C22129(C5721 c5721, C24404 c24404, InterfaceC7886 interfaceC7886) {
        super(c24404, interfaceC7886);
        this.f71298 = c5721.f19729.m39893(interfaceC7886.getType());
    }

    @Override // l.C10194, l.InterfaceC7886
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC19073 interfaceC19073 = (InterfaceC19073) arrayList.get(i);
            String strM55991 = this.f71298.m55991(interfaceC19073.getName());
            if (strM55991 != null) {
                arrayList.set(i, new C4975(strM55991, interfaceC19073.getValue()));
            }
        }
        return C5721.m16765(arrayList);
    }
}
