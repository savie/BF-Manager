package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M1UL */
/* JADX INFO: loaded from: classes3.dex */
public class C3243 extends AbstractC18908 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC8858 f12062;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11992 f12063;

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo9700() {
        return (String) this.f12063.m29872().mo1014(this.f12062.mo9700());
    }

    @Override // l.InterfaceC8858
    public String getName() {
        return this.f12062.getName();
    }

    public C3243(C11992 c11992, InterfaceC8858 interfaceC8858) {
        this.f12063 = c11992;
        this.f12062 = interfaceC8858;
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List mo9699() {
        InterfaceC8858 interfaceC8858 = this.f12062;
        ArrayList arrayList = new ArrayList(interfaceC8858.mo9699().size());
        Iterator it = interfaceC8858.mo9699().iterator();
        while (it.hasNext()) {
            arrayList.add(((CharSequence) it.next()).toString());
        }
        return C15604.m37270(this.f12063.m29872(), (List) arrayList);
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo9698() {
        return (String) this.f12063.m29872().mo1014(this.f12062.mo9698());
    }
}
