package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public final class C6945 extends C16160 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16865 f23363;

    public C6945(C16202 c16202) {
        this.f23363 = c16202;
    }

    @Override // l.AbstractC7693
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo18689(C7675 c7675, Object obj) {
        return (Set) obj;
    }

    @Override // l.AbstractC7693
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo18690(C18258 c18258, Object obj) {
        Object obj2 = (Set) obj;
        m46039(c18258.mo24652(), obj2);
        List parameters = c18258.getParameters();
        C21825 c21825Mo24652 = c18258.mo24652();
        if (!c21825Mo24652.isEmpty()) {
            ArrayList arrayList = new ArrayList(c21825Mo24652);
            arrayList.addAll(parameters);
            parameters = arrayList;
        }
        return (Set) m46039(parameters, obj2);
    }

    @Override // l.AbstractC7693
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo18691(C22492 c22492, Object obj) {
        Object obj2 = (Set) obj;
        m46039(c22492.mo24652(), obj2);
        List listMo2882 = c22492.mo2882();
        C21825 c21825Mo24652 = c22492.mo24652();
        if (!c21825Mo24652.isEmpty()) {
            ArrayList arrayList = new ArrayList(c21825Mo24652);
            arrayList.addAll(listMo2882);
            listMo2882 = arrayList;
        }
        return (Set) m46039(listMo2882, obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m18692(InterfaceC14625 interfaceC14625, Set set) {
        Iterator it = ((C16202) this.f23363).m38307(interfaceC14625).iterator();
        while (it.hasNext()) {
            set.add((InterfaceC23216) ((InterfaceC6157) it.next()).mo17159().mo1935());
        }
        return (Set) interfaceC14625.mo3841(this, set);
    }
}
