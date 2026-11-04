package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1852 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12050 extends AbstractC20255 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f38819;

    public C12050(InterfaceC18213 interfaceC18213) {
        super(interfaceC18213);
        this.f38819 = new ArrayList(1);
    }

    @Override // l.InterfaceC18213
    /* JADX INFO: renamed from: ܿ */
    public final List mo19035() {
        return this.f38819;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30228(InterfaceC6281 interfaceC6281) {
        AbstractC20255.m46530(interfaceC6281, (AbstractC20255) this);
        this.f38819.add(interfaceC6281);
    }

    @Override // l.AbstractC20255, l.InterfaceC6281
    /* JADX INFO: renamed from: ۙ */
    public final void mo1987(C13476 c13476, InterfaceC3145 interfaceC3145) {
        Iterator it = this.f38819.iterator();
        while (it.hasNext()) {
            c13476.m33153(interfaceC3145, (InterfaceC6281) it.next());
        }
    }

    @Override // l.AbstractC20255, l.InterfaceC18213
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19029(InterfaceC6281 interfaceC6281, InterfaceC6281 interfaceC6282) {
        ArrayList arrayList = this.f38819;
        int iIndexOf = arrayList.indexOf(interfaceC6281);
        if (iIndexOf == -1) {
            return false;
        }
        arrayList.set(iIndexOf, interfaceC6282);
        AbstractC20255.m46530(interfaceC6282, (AbstractC20255) this);
        return true;
    }

    @Override // l.InterfaceC6281
    /* JADX INFO: renamed from: ᩻ */
    public final String mo1988() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f38819;
        int size = arrayList.size();
        sb.append('(');
        sb.append(size);
        if (size > 0) {
            sb.append(':');
            C4123.m13228(sb, arrayList, "|", new C18980(8));
        }
        sb.append(')');
        return sb.toString();
    }

    public final String toString() {
        return "R" + mo1988();
    }
}
