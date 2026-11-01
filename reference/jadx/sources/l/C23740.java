package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KG */
/* JADX INFO: loaded from: classes.dex */
public final class C23740 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76808;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17721 f76810;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f76811;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f76809 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f76807 = new HashMap();

    public C23740(InterfaceC17721 interfaceC17721) throws C12731 {
        this.f76810 = interfaceC17721;
        this.f76808 = interfaceC17721.mo19106();
        this.f76811 = interfaceC17721.mo7944().size() + 1;
        for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
            if (this.f76807.put(Integer.valueOf(interfaceC19133.mo26942()), interfaceC19133) != null) {
                throw C3277.m9767("RESOURCE_TARGET_AMBIGUOUS", "Duplicate type IDs prevent adding resources safely.");
            }
            this.f76811 = Math.max(this.f76811, interfaceC19133.mo26942() + 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9629 m52271(int i) {
        InterfaceC19133 interfaceC19133;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f76809;
        C9629 c9629 = (C9629) map.get(numValueOf);
        if (c9629 == null && (interfaceC19133 = (InterfaceC19133) this.f76807.get(Integer.valueOf(i))) != null) {
            c9629 = new C9629(interfaceC19133.mo26942(), interfaceC19133.getTypeName());
            c9629.f32424 = interfaceC19133;
            c9629.f32422 = interfaceC19133.mo1519();
            for (InterfaceC12783 interfaceC12783 : interfaceC19133.mo25271()) {
                c9629.f32422 = Math.max(c9629.f32422, interfaceC12783.mo31751() + 1);
                String strM47741 = C21291.m47741(interfaceC12783);
                for (InterfaceC3609 interfaceC3609 : interfaceC12783.mo31746()) {
                    int iMo10691 = interfaceC3609.mo10691();
                    String strMo7645 = interfaceC3609.mo7645();
                    String str = (String) c9629.f32421.put(Integer.valueOf(iMo10691), strMo7645);
                    if (str != null && !str.equals(strMo7645)) {
                        throw C3277.m9767("RESOURCE_TARGET_AMBIGUOUS", "Resource variants disagree about the entry name.");
                    }
                    c9629.f32419.put(strMo7645, Integer.valueOf(iMo10691));
                    if (!c9629.f32420.add(iMo10691 + "\n" + strM47741)) {
                        throw C3277.m9767("RESOURCE_TARGET_AMBIGUOUS", "Duplicate resource variants prevent adding resources safely.");
                    }
                }
            }
            map.put(Integer.valueOf(i), c9629);
        }
        return c9629;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9629 m52272(String str) {
        int iMo26942 = -1;
        for (InterfaceC19133 interfaceC19133 : this.f76807.values()) {
            if (C21291.m47740(interfaceC19133.getTypeName()).equals(str)) {
                if (iMo26942 != -1) {
                    throw C3277.m9767("RESOURCE_TARGET_AMBIGUOUS", "Multiple types have the requested resource type name.");
                }
                iMo26942 = interfaceC19133.mo26942();
            }
        }
        if (iMo26942 != -1) {
            return m52271(iMo26942);
        }
        HashMap map = this.f76809;
        for (C9629 c9629 : map.values()) {
            if (C21291.m47740(c9629.f32423).equals(str)) {
                return c9629;
            }
        }
        int i = this.f76811;
        if (i > 255) {
            throw C3277.m9767("RESOURCE_ID_EXHAUSTED", "No unused type ID remains in this package.");
        }
        this.f76811 = i + 1;
        C9629 c96210 = new C9629(i, str);
        map.put(Integer.valueOf(c96210.f32425), c96210);
        return c96210;
    }
}
