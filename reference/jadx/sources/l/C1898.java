package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5I3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1898 extends AbstractC22827 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2338 f6396;

    public C1898(InterfaceC2338 interfaceC2338) {
        this.f6396 = interfaceC2338;
    }

    @Override // l.InterfaceC13062
    public final List getValue() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13084(this));
        InterfaceC2338 interfaceC2338 = this.f6396;
        arrayList.add(new C5012(interfaceC2338.mo7877()));
        arrayList.add(new C5627(this));
        arrayList.addAll(interfaceC2338.mo7876());
        return arrayList;
    }
}
