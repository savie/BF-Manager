package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5I3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17656 extends AbstractC7619 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18029 f56113;

    public C17656(InterfaceC18029 interfaceC18029) {
        this.f56113 = interfaceC18029;
    }

    @Override // l.InterfaceC0390
    public final List getValue() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C16951(this));
        InterfaceC18029 interfaceC18029 = this.f56113;
        arrayList.add(new C8672(interfaceC18029.mo19722()));
        arrayList.add(new C12718(this));
        arrayList.addAll(interfaceC18029.mo19720());
        return arrayList;
    }
}
