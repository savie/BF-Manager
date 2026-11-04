package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6H1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14287 extends AbstractC20255 implements InterfaceC3297 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Object f45114 = new C23985();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f45115;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21943 f45116;

    public C14287(InterfaceC18213 interfaceC18213, C21943 c21943) {
        super(interfaceC18213);
        this.f45116 = c21943;
        this.f45115 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C21943 m34697() {
        return this.f45116;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34696(List list, InterfaceC6281 interfaceC6281) {
        this.f45115.add(new C3847(list, interfaceC6281));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34695() {
        return this.f45115;
    }

    @Override // l.AbstractC20255, l.InterfaceC3297
    /* JADX INFO: renamed from: ۧ */
    public final List mo10884() {
        return C4681.unmodifiableList(C4123.m13226(this.f45115, new C6085()));
    }

    @Override // l.InterfaceC18213
    /* JADX INFO: renamed from: ܿ */
    public final List mo19035() {
        ArrayList arrayList = this.f45115;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
        arrayList2.add(this.f45116);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3847) it.next()).f13151);
        }
        return C4681.unmodifiableList(arrayList2);
    }

    @Override // l.AbstractC20255, l.InterfaceC6281
    /* JADX INFO: renamed from: ۙ */
    public final void mo1987(C13476 c13476, InterfaceC3145 interfaceC3145) {
        c13476.m33156(this, interfaceC3145);
    }

    @Override // l.InterfaceC6281
    /* JADX INFO: renamed from: ᩻ */
    public final String mo1988() {
        return "SW:" + this.f45116.mo1988();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Switch: ");
        sb.append(this.f45116.mo1988());
        for (C3847 c3847 : this.f45115) {
            List listM13226 = C4123.m13226(c3847.m12479(), new C13105(5));
            sb.append("\n case ");
            sb.append(C4123.m13221(listM13226, ", "));
            sb.append(" -> ");
            sb.append(c3847.m12478());
        }
        return sb.toString();
    }
}
