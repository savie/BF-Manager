package l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4654 extends AbstractC10442 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC20147 f16445;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21588 f16446;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11992 f16447;

    public C4654(C6771 c6771, C11992 c11992, InterfaceC20147 interfaceC20147) {
        this.f16447 = c11992;
        this.f16445 = interfaceC20147;
        this.f16446 = c6771.f22863.m42054(interfaceC20147.getType());
    }

    @Override // l.InterfaceC20147
    public final String getType() {
        return (String) this.f16447.m29872().mo1014(this.f16445.getType());
    }

    @Override // l.InterfaceC20147
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(C15604.m37271(this.f16445.getElements(), this.f16447.m29862()));
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC6533 interfaceC6533 = (InterfaceC6533) arrayList.get(i);
            String strM48306 = this.f16446.m48306(interfaceC6533.getName());
            if (strM48306 != null) {
                arrayList.set(i, new C3367(strM48306, interfaceC6533.getValue()));
            }
        }
        return C6771.m18357(arrayList);
    }
}
