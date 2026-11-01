package l;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܶ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C15479 extends AbstractC18154 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19003 f50428;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f50430;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19003 f50431;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f50429 = new HashSet();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashMap f50427 = new HashMap();

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (!abstractC16579.m39001(EnumC6617.CLASS)) {
            return null;
        }
        C21825 c21825Mo1943 = c0309.mo1943();
        C21825 c21825Mo1944 = abstractC16579.mo1943();
        if (c21825Mo1943.m48596() != c21825Mo1944.m48596()) {
            return null;
        }
        while (c21825Mo1943.m48595()) {
            m37024((AbstractC16579) c21825Mo1943.f70876, (AbstractC16579) c21825Mo1944.f70876);
            c21825Mo1943 = c21825Mo1943.f70877;
            c21825Mo1944 = c21825Mo1944.f70877;
        }
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        boolean zMo2036 = c0350.mo2036();
        C23800 c23800 = this.f50430;
        if (zMo2036) {
            m37024(c23800.m52415(c0350), c23800.m52415(abstractC16579));
            return null;
        }
        if (!c0350.mo2034()) {
            return null;
        }
        m37024(c23800.m52433(c0350), c23800.m52433(abstractC16579));
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (!abstractC16579.m39001(EnumC6617.ARRAY)) {
            return null;
        }
        C23800 c23800 = this.f50430;
        m37024(c23800.m52416(c8777), c23800.m52416(abstractC16579));
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        AbstractC0618 abstractC0618 = c22929.f53222;
        HashMap map = this.f50427;
        AbstractC16579 abstractC165710 = (AbstractC16579) map.get(abstractC0618);
        if (abstractC165710 != null) {
            boolean zMo2034 = abstractC165710.mo2034();
            C23800 c23800 = this.f50430;
            if (zMo2034 && abstractC16579.mo2034()) {
                if (!c23800.m52413(c23800.m52433(abstractC165710), c23800.m52433(abstractC16579), true)) {
                    abstractC16579 = abstractC165710;
                }
            } else {
                if (abstractC165710.mo2036() && abstractC16579.mo2036()) {
                    if (c23800.m52413(c23800.m52415(abstractC165710), c23800.m52415(abstractC16579), true)) {
                    }
                } else if (!c23800.m52399(abstractC165710, abstractC16579)) {
                    throw new C23240();
                }
                abstractC16579 = abstractC165710;
            }
        } else {
            this.f50431.m43723(c22929);
            this.f50428.m43723(abstractC16579);
        }
        map.put(c22929.f53222, abstractC16579);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37024(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C7571 c7571 = new C7571(abstractC16579, abstractC165710, this.f50430);
        HashSet hashSet = this.f50429;
        if (hashSet.add(c7571)) {
            try {
                abstractC16579.mo1928(this, abstractC165710);
            } finally {
                hashSet.remove(c7571);
            }
        }
    }

    public C15479(C23800 c23800, C19003 c19003, C19003 c19004) {
        this.f50430 = c23800;
        this.f50431 = c19003;
        this.f50428 = c19004;
    }
}
