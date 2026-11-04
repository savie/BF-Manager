package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺ᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C24484 extends AbstractC5313 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f79457;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22665 = (AbstractC22664) obj;
        if (abstractC22664.m51074(abstractC22665)) {
            return Boolean.TRUE;
        }
        if (abstractC22665.mo18049()) {
            return (Boolean) abstractC22665.mo9324(this, abstractC22664);
        }
        switch (C3600.f12307[abstractC22664.mo9097().ordinal()]) {
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
                return Boolean.valueOf(abstractC22664.m51067(abstractC22665.mo9097()));
            case 12:
                boolean z = false;
                if (abstractC22665.m51067(EnumC21172.TYPEVAR)) {
                    return Boolean.valueOf(abstractC22664 == abstractC22665);
                }
                if (abstractC22665.mo27320() && !abstractC22665.mo27317() && ((Boolean) abstractC22664.mo9324(this, this.f79457.m55123(abstractC22665))).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
            default:
                throw new AssertionError("isSameType " + abstractC22664.mo9097());
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        boolean z;
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (c2832 == abstractC22664) {
            return Boolean.TRUE;
        }
        if (abstractC22664.mo18049()) {
            return (Boolean) abstractC22664.mo9324(this, c2832);
        }
        if (abstractC22664.m51067(EnumC21172.ARRAY)) {
            AbstractC22664 abstractC22665 = c2832.f9333;
            C24705 c24705 = this.f79457;
            AbstractC22664 abstractC22664M55120 = c24705.m55120(abstractC22664);
            if (c24705.m55149(abstractC22665, abstractC22664M55120) || (c24705.m55163(abstractC22665, abstractC22664M55120) && c24705.m55163(abstractC22664M55120, abstractC22665))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4102(C5291 c5291, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (!abstractC22664.m51067(EnumC21172.FORALL)) {
            return Boolean.FALSE;
        }
        C5291 c5292 = (C5291) abstractC22664;
        C24705 c24705 = this.f79457;
        return Boolean.valueOf(c24705.m55112(c5291, c5292) && ((Boolean) c5291.f72657.mo9324(this, c24705.m55103(c5292.f72657, c5292.f18620, c5291.f18620))).booleanValue());
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1125(C8274 c8274, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (abstractC22664.m51067(EnumC21172.WILDCARD)) {
            return Boolean.FALSE;
        }
        if (c8274 == abstractC22664 || c8274.f72657 == abstractC22664 || abstractC22664.m51067(EnumC21172.ERROR) || abstractC22664.m51067(EnumC21172.UNKNOWN)) {
            return Boolean.TRUE;
        }
        c8274.m22334(EnumC0816.f3094, abstractC22664, this.f79457);
        return Boolean.TRUE;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (c10510 == abstractC22664) {
            return Boolean.TRUE;
        }
        if (abstractC22664.mo18049()) {
            return (Boolean) abstractC22664.mo9324(this, c10510);
        }
        boolean zMo27320 = abstractC22664.mo27320();
        boolean z = false;
        C24705 c24705 = this.f79457;
        if (zMo27320 && !abstractC22664.mo27317()) {
            if (((Boolean) c10510.mo9324(this, c24705.m55123(abstractC22664))).booleanValue() && ((Boolean) c10510.mo9324(this, c24705.m55084(abstractC22664))).booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (!c10510.mo18914() || !abstractC22664.mo18914()) {
            if (c10510.f73596 == abstractC22664.f73596 && ((Boolean) c10510.mo23449().mo9324(this, abstractC22664.mo23449())).booleanValue() && c24705.m55162(c10510.mo15882(), abstractC22664.mo15882())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (!((Boolean) c24705.m55137(c10510).mo9324(this, c24705.m55137(abstractC22664))).booleanValue()) {
            return Boolean.FALSE;
        }
        HashMap map = new HashMap();
        for (AbstractC22664 abstractC22665 : c24705.m55144(c10510)) {
            if (map.containsKey(abstractC22665)) {
                throw new AssertionError("Malformed intersection");
            }
            map.put(abstractC22665.f73596, abstractC22665);
        }
        for (AbstractC22664 abstractC22666 : c24705.m55144(abstractC22664)) {
            if (!map.containsKey(abstractC22666.f73596)) {
                return Boolean.FALSE;
            }
            if (!((Boolean) ((AbstractC22664) map.remove(abstractC22666.f73596)).mo9324(this, abstractC22666)).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.valueOf(map.isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        boolean z;
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (!abstractC22664.m51067(EnumC21172.WILDCARD)) {
            return Boolean.FALSE;
        }
        C10729 c107210 = (C10729) abstractC22664;
        if (c10729.f34073 == c107210.f34073 || (c10729.mo27317() && abstractC22664.mo27317())) {
            if (this.f79457.m55149(c10729.f34074, c107210.f34074)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo10772(C12748 c12748, Object obj) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10773(C20207 c20207, Object obj) {
        return Boolean.valueOf(c20207 == ((AbstractC22664) obj));
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2231(C23191 c23191, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        return Boolean.valueOf(this.f79457.m55117((AbstractC22664) c23191, abstractC22664, true) && ((Boolean) c23191.f75156.mo9324(this, abstractC22664.mo31585())).booleanValue());
    }

    public C24484(C24705 c24705) {
        this.f79457 = c24705;
    }
}
