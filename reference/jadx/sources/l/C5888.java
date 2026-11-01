package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۛۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5888 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12239 f20081;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23942 f20082;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23800 f20084;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f20083 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f20080 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17177 f20079 = new C17177(this);

    public C5888(C23800 c23800, C23942 c23942) {
        this.f20084 = c23800;
        this.f20082 = c23942;
        this.f20081 = new C12239(this, c23800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16113(AbstractC16579 abstractC16579) {
        return C17177.m40100(this.f20079, this.f20084.m52402(abstractC16579));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m16117(AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC16579M52402 = this.f20084.m52402(abstractC16579);
        C12239 c12239 = this.f20081;
        c12239.f40971.f67646 = 0;
        c12239.mo30442(abstractC16579M52402);
        C20809 c20809 = c12239.f40971;
        C23942 c23942 = c12239.f40970.f20082;
        byte[] bArr = c20809.f67645;
        return C17177.m40100(this.f20079, c23942.f77631.mo17388(0, c20809.f67646, bArr));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m16116(AbstractC23903 abstractC23903) {
        AbstractC11242 abstractC11242Mo17388;
        EnumC10477 enumC10477 = abstractC23903.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35865;
        C12239 c12239 = this.f20081;
        C17177 c17177 = this.f20079;
        if (enumC10477 == enumC10478) {
            AbstractC16579 abstractC16579 = abstractC23903.f77449;
            c12239.f40971.f67646 = 0;
            C21825 c21825Mo1938 = abstractC16579.mo1938();
            if (c21825Mo1938.m48595()) {
                c12239.m48425(c21825Mo1938);
            }
            C23800 c23800 = this.f20084;
            c12239.mo30442(c23800.m52432(abstractC16579));
            Iterator it = c23800.m52439(abstractC16579).iterator();
            while (it.hasNext()) {
                c12239.mo30442((AbstractC16579) it.next());
            }
            C20809 c20809 = c12239.f40971;
            C23942 c23942 = c12239.f40970.f20082;
            byte[] bArr = c20809.f67645;
            abstractC11242Mo17388 = c23942.f77631.mo17388(0, c20809.f67646, bArr);
        } else {
            AbstractC16579 abstractC165710 = abstractC23903.f77449;
            c12239.f40971.f67646 = 0;
            c12239.mo30442(abstractC165710);
            C20809 c208010 = c12239.f40971;
            C23942 c23943 = c12239.f40970.f20082;
            byte[] bArr2 = c208010.f67645;
            abstractC11242Mo17388 = c23943.f77631.mo17388(0, c208010.f67646, bArr2);
        }
        return C17177.m40100(c17177, abstractC11242Mo17388);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16111(Object obj) {
        if (obj instanceof Integer) {
            return m16112((InterfaceC7299) new C10122(3, (Integer) obj));
        }
        if (obj instanceof Float) {
            return m16112((InterfaceC7299) new C10122(4, (Float) obj));
        }
        if (obj instanceof Long) {
            return m16112((InterfaceC7299) new C10122(5, (Long) obj));
        }
        if (obj instanceof Double) {
            return m16112((InterfaceC7299) new C10122(6, (Double) obj));
        }
        if (obj instanceof String) {
            return m16112((InterfaceC7299) C8711.m22544((String) obj));
        }
        throw new AssertionError(C9023.m23354(obj, "unexpected constant: "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16112(InterfaceC7299 interfaceC7299) {
        int iMo1941 = interfaceC7299.mo1941();
        if (iMo1941 == 7) {
            return m16113((AbstractC16579) interfaceC7299);
        }
        C17177 c17177 = this.f20079;
        if (iMo1941 == 16) {
            return C17177.m40100(c17177, this.f20084.m52402((AbstractC16579) interfaceC7299));
        }
        return C17177.m40100(c17177, interfaceC7299);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m16118(AbstractC23903 abstractC23903) {
        AbstractC11242 abstractC11242 = abstractC23903.f77453;
        EnumC10477 enumC10477 = abstractC23903.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35879;
        C23800 c23800 = this.f20084;
        return C17177.m40100(this.f20079, new C20705(abstractC11242, enumC10477 == enumC10478 ? abstractC23903.m52698(c23800) : abstractC23903.mo50006(c23800)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16115(C22492 c22492) {
        if (c22492.f77449.mo12731()) {
            throw new AssertionError("Unexpected intersection type: " + c22492.f77449);
        }
        c22492.mo49994();
        if (c22492.f77448.m52720() != null) {
            LinkedHashSet linkedHashSet = this.f20083;
            if (linkedHashSet.contains(c22492)) {
                return;
            }
            m16115(c22492.f77448.m52720());
            linkedHashSet.add(c22492);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16114(AbstractC23903 abstractC23903) {
        EnumC10477 enumC10477 = abstractC23903.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35879;
        C23800 c23800 = this.f20084;
        return m16117(enumC10477 == enumC10478 ? abstractC23903.m52698(c23800) : abstractC23903.mo50006(c23800));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16108(C5888 c5888, InterfaceC19294 interfaceC19294) {
        C8005 c8005Mo18745 = interfaceC19294.mo18745(c5888.f20084);
        LinkedHashMap linkedHashMap = c5888.f20080;
        Integer numValueOf = (Integer) linkedHashMap.get(c8005Mo18745);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(c8005Mo18745, numValueOf);
        }
        return numValueOf.intValue();
    }
}
