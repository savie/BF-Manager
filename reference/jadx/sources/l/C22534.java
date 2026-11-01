package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C22534 extends AbstractC17449 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f73505;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC165710 = (AbstractC16579) obj;
        if (abstractC16579.m39004(abstractC165710)) {
            return Boolean.TRUE;
        }
        if (abstractC165710.mo14987()) {
            return (Boolean) abstractC165710.mo1928(this, abstractC16579);
        }
        switch (C14068.f46214[abstractC16579.mo1933().ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 15:
                return Boolean.valueOf(abstractC16579.m39001(abstractC165710.mo1933()));
            case 12:
                boolean z = false;
                if (abstractC165710.m39001(EnumC6617.TYPEVAR)) {
                    return Boolean.valueOf(abstractC16579 == abstractC165710);
                }
                if (abstractC165710.mo2034() && !abstractC165710.mo2036() && ((Boolean) abstractC16579.mo1928(this, this.f73505.m52415(abstractC165710))).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
            default:
                throw new AssertionError("isSameType " + abstractC16579.mo1933());
        }
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (c0309 == abstractC16579) {
            return Boolean.TRUE;
        }
        if (abstractC16579.mo14987()) {
            return (Boolean) abstractC16579.mo1928(this, c0309);
        }
        boolean zMo2034 = abstractC16579.mo2034();
        boolean z = false;
        C23800 c23800 = this.f73505;
        if (zMo2034 && !abstractC16579.mo2036()) {
            if (((Boolean) c0309.mo1928(this, c23800.m52415(abstractC16579))).booleanValue() && ((Boolean) c0309.mo1928(this, c23800.m52433(abstractC16579))).booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (!c0309.mo12731() || !abstractC16579.mo12731()) {
            if (c0309.f53222 == abstractC16579.f53222 && ((Boolean) c0309.mo1934().mo1928(this, abstractC16579.mo1934())).booleanValue() && c23800.m52430(c0309.mo1938(), abstractC16579.mo1938())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (!((Boolean) c23800.m52432(c0309).mo1928(this, c23800.m52432(abstractC16579))).booleanValue()) {
            return Boolean.FALSE;
        }
        HashMap map = new HashMap();
        for (AbstractC16579 abstractC165710 : c23800.m52439(c0309)) {
            if (map.containsKey(abstractC165710)) {
                throw new AssertionError("Malformed intersection");
            }
            map.put(abstractC165710.f53222, abstractC165710);
        }
        for (AbstractC16579 abstractC165711 : c23800.m52439(abstractC16579)) {
            if (!map.containsKey(abstractC165711.f53222)) {
                return Boolean.FALSE;
            }
            if (!((Boolean) ((AbstractC16579) map.remove(abstractC165711.f53222)).mo1928(this, abstractC165711)).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.valueOf(map.isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        boolean z;
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (!abstractC16579.m39001(EnumC6617.WILDCARD)) {
            return Boolean.FALSE;
        }
        C0350 c0351 = (C0350) abstractC16579;
        if (c0350.f1776 == c0351.f1776 || (c0350.mo2036() && abstractC16579.mo2036())) {
            if (this.f73505.m52399(c0350.f1774, c0351.f1774)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11012(C2466 c2466, Object obj) {
        return Boolean.valueOf(c2466 == ((AbstractC16579) obj));
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo4812(C5954 c5954, Object obj) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        boolean z;
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (c8777 == abstractC16579) {
            return Boolean.TRUE;
        }
        if (abstractC16579.mo14987()) {
            return (Boolean) abstractC16579.mo1928(this, c8777);
        }
        if (abstractC16579.m39001(EnumC6617.ARRAY)) {
            AbstractC16579 abstractC165710 = c8777.f30194;
            C23800 c23800 = this.f73505;
            AbstractC16579 abstractC16579M52416 = c23800.m52416(abstractC16579);
            if (c23800.m52399(abstractC165710, abstractC16579M52416) || (c23800.m52427(abstractC165710, abstractC16579M52416) && c23800.m52427(abstractC16579M52416, abstractC165710))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4813(C10229 c10229, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (abstractC16579.m39001(EnumC6617.WILDCARD)) {
            return Boolean.FALSE;
        }
        if (c10229 == abstractC16579 || c10229.f53121 == abstractC16579 || abstractC16579.m39001(EnumC6617.ERROR) || abstractC16579.m39001(EnumC6617.UNKNOWN)) {
            return Boolean.TRUE;
        }
        c10229.m26013(EnumC8112.f28428, abstractC16579, this.f73505);
        return Boolean.TRUE;
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo9280(C10894 c10894, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (!abstractC16579.m39001(EnumC6617.FORALL)) {
            return Boolean.FALSE;
        }
        C10894 c10895 = (C10894) abstractC16579;
        C23800 c23800 = this.f73505;
        return Boolean.valueOf(c23800.m52391(c10894, c10895) && ((Boolean) c10894.f53121.mo1928(this, c23800.m52371(c10895.f53121, c10895.f37076, c10894.f37076))).booleanValue());
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6581(C13757 c13757, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        return Boolean.valueOf(this.f73505.m52394((AbstractC16579) c13757, abstractC16579, true) && ((Boolean) c13757.f45368.mo1928(this, abstractC16579.mo16235())).booleanValue());
    }

    public C22534(C23800 c23800) {
        this.f73505 = c23800;
    }
}
