package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۘ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4188 extends AbstractC17449 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f15240 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f15241;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC165710 = (AbstractC16579) obj;
        if (abstractC165710.m39001(EnumC6617.WILDCARD)) {
            return (Boolean) m20360(abstractC16579, abstractC165710);
        }
        return Boolean.valueOf(m11837(abstractC16579, abstractC165710) || m11837(abstractC165710, abstractC16579));
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        boolean zM52412;
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (c0350.mo2037()) {
            return Boolean.FALSE;
        }
        if (!abstractC16579.m39001(EnumC6617.WILDCARD)) {
            if (c0350.mo2036()) {
                return Boolean.valueOf(m11837(abstractC16579, c0350.f1774));
            }
            return Boolean.valueOf(m11837(c0350.f1774, abstractC16579));
        }
        if (abstractC16579.mo2037()) {
            return Boolean.FALSE;
        }
        boolean zMo2036 = c0350.mo2036();
        C23800 c23800 = this.f15241;
        if (zMo2036) {
            if (abstractC16579.mo2036()) {
                AbstractC16579 abstractC165710 = c0350.f1774;
                AbstractC16579 abstractC16579M52415 = c23800.m52415(abstractC16579);
                C7571 c7571 = new C7571(abstractC165710, abstractC16579M52415, c23800);
                HashSet hashSet = this.f15240;
                if (hashSet.add(c7571)) {
                    try {
                        zM52412 = c23800.m52412(abstractC165710, abstractC16579M52415, c23800.f76946);
                    } finally {
                        hashSet.remove(c7571);
                    }
                } else {
                    zM52412 = true;
                }
                return Boolean.valueOf(!zM52412);
            }
            if (abstractC16579.mo2034()) {
                return Boolean.valueOf(m11837(c23800.m52433(abstractC16579), c0350.f1774));
            }
        } else if (c0350.mo2034() && abstractC16579.mo2036()) {
            return Boolean.valueOf(m11837(c0350.f1774, c23800.m52415(abstractC16579)));
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m11837(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C23800 c23800 = this.f15241;
        C7571 c7571 = new C7571(abstractC16579, abstractC165710, c23800);
        HashSet hashSet = this.f15240;
        if (!hashSet.add(c7571)) {
            return false;
        }
        try {
            return c23800.m52358(abstractC16579, abstractC165710);
        } finally {
            hashSet.remove(c7571);
        }
    }

    public C4188(C23800 c23800) {
        this.f15241 = c23800;
    }
}
