package l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2537 extends C14534 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21588 f10045;

    public C2537(C6771 c6771, C11992 c11992, InterfaceC3710 interfaceC3710) {
        super(c11992, interfaceC3710);
        this.f10045 = c6771.f22863.m42054(interfaceC3710.getType());
    }

    @Override // l.C14534, l.InterfaceC3710
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC6533 interfaceC6533 = (InterfaceC6533) arrayList.get(i);
            String strM48306 = this.f10045.m48306(interfaceC6533.getName());
            if (strM48306 != null) {
                arrayList.set(i, new C11711(strM48306, interfaceC6533.getValue()));
            }
        }
        return C6771.m18357(arrayList);
    }
}
