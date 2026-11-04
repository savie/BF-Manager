package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1UL */
/* JADX INFO: loaded from: classes3.dex */
public class C2737 extends AbstractC6968 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC4859 f9097;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C24404 f9098;

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܳ */
    public final String mo6804() {
        return (String) this.f9098.m54589().mo2798(this.f9097.mo6804());
    }

    @Override // l.InterfaceC4859
    public String getName() {
        return this.f9097.getName();
    }

    public C2737(C24404 c24404, InterfaceC4859 interfaceC4859) {
        this.f9098 = c24404;
        this.f9097 = interfaceC4859;
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܶ */
    public final List mo6805() {
        InterfaceC4859 interfaceC4859 = this.f9097;
        ArrayList arrayList = new ArrayList(interfaceC4859.mo6805().size());
        Iterator it = interfaceC4859.mo6805().iterator();
        while (it.hasNext()) {
            arrayList.add(((CharSequence) it.next()).toString());
        }
        return C19906.m45836(this.f9098.m54589(), (List) arrayList);
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ۤ */
    public final String mo6802() {
        return (String) this.f9098.m54589().mo2798(this.f9097.mo6802());
    }
}
