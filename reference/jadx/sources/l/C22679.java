package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9PR */
/* JADX INFO: loaded from: classes.dex */
public final class C22679 implements InterfaceC7762 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18775 f73642;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f73643;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC4077 f73644;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC3990 f73645;

    public C22679(AbstractC3990 abstractC3990, AbstractC4077 abstractC4077, InterfaceC18775 interfaceC18775) {
        this.f73645 = abstractC3990;
        this.f73643 = abstractC4077.mo2101(interfaceC18775);
        this.f73644 = abstractC4077;
        this.f73642 = interfaceC18775;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22679 m51164(AbstractC3990 abstractC3990, AbstractC4077 abstractC4077, InterfaceC18775 interfaceC18775) {
        return new C22679(abstractC3990, abstractC4077, interfaceC18775);
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final Object mo21139() {
        InterfaceC18775 interfaceC18775 = this.f73642;
        if (!(interfaceC18775 instanceof AbstractC22701)) {
            return interfaceC18775.newBuilderForType().buildPartial();
        }
        EnumC21955 enumC21955 = EnumC21955.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC22701) ((AbstractC22701) interfaceC18775).m51177();
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21144(AbstractC22701 abstractC22701, AbstractC22701 abstractC22702) {
        AbstractC3990 abstractC3990 = this.f73645;
        if (!abstractC3990.mo3901(abstractC22701).equals(abstractC3990.mo3901(abstractC22702))) {
            return false;
        }
        if (!this.f73643) {
            return true;
        }
        AbstractC4077 abstractC4077 = this.f73644;
        return abstractC4077.mo2097((Object) abstractC22701).equals(abstractC4077.mo2097((Object) abstractC22702));
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final int mo21138(AbstractC22701 abstractC22701) {
        int iHashCode = this.f73645.mo3901(abstractC22701).hashCode();
        return this.f73643 ? (iHashCode * 53) + this.f73644.mo2097((Object) abstractC22701).hashCode() : iHashCode;
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final void mo21141(Object obj, Object obj2) {
        int i = C18949.f61453;
        AbstractC3990 abstractC3990 = this.f73645;
        abstractC3990.mo3898(obj, abstractC3990.mo3890(abstractC3990.mo3901(obj), abstractC3990.mo3901(obj2)));
        if (this.f73643) {
            AbstractC4077 abstractC4077 = this.f73644;
            C8551 c8551Mo2097 = abstractC4077.mo2097(obj2);
            if (c8551Mo2097.m22908()) {
                return;
            }
            abstractC4077.mo2103(obj).m22901(c8551Mo2097);
        }
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final void mo21143(Object obj, InterfaceC18356 interfaceC18356) {
        Iterator itM22904 = this.f73644.mo2097(obj).m22904();
        while (itM22904.hasNext()) {
            Map.Entry entry = (Map.Entry) itM22904.next();
            InterfaceC2585 interfaceC2585 = (InterfaceC2585) entry.getKey();
            if (interfaceC2585.mo8651() != EnumC20594.MESSAGE || interfaceC2585.mo8649() || interfaceC2585.mo8650()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C0326) {
                ((C21560) interfaceC18356).m49006(interfaceC2585.getNumber(), ((C0326) entry).m2020().m25871());
            } else {
                ((C21560) interfaceC18356).m49006(interfaceC2585.getNumber(), entry.getValue());
            }
        }
        AbstractC3990 abstractC3990 = this.f73645;
        abstractC3990.mo3895(abstractC3990.mo3901(obj), interfaceC18356);
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final void mo21142(Object obj, InterfaceC12236 interfaceC12236, C24215 c24215) {
        AbstractC3990 abstractC3990 = this.f73645;
        Object objMo3889 = abstractC3990.mo3889(obj);
        AbstractC4077 abstractC4077 = this.f73644;
        C8551 c8551Mo2103 = abstractC4077.mo2103(obj);
        while (interfaceC12236.mo30549() != Integer.MAX_VALUE) {
            try {
                if (!m51165(interfaceC12236, c24215, abstractC4077, c8551Mo2103, abstractC3990, objMo3889)) {
                    return;
                }
            } finally {
                abstractC3990.mo3903(obj, objMo3889);
            }
        }
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final void mo21140(Object obj) {
        this.f73645.mo3900(obj);
        this.f73644.mo2102(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m51165(InterfaceC12236 interfaceC12236, C24215 c24215, AbstractC4077 abstractC4077, C8551 c8551, AbstractC3990 abstractC3990, Object obj) throws C20463 {
        int tag = interfaceC12236.getTag();
        InterfaceC18775 interfaceC18775 = this.f73642;
        if (tag != 11) {
            if ((tag & 7) == 2) {
                Object objMo2096 = abstractC4077.mo2096(c24215, interfaceC18775, tag >>> 3);
                if (objMo2096 != null) {
                    abstractC4077.mo2098(interfaceC12236, objMo2096, c24215, c8551);
                    return true;
                }
                return abstractC3990.m12908(obj, interfaceC12236);
            }
            return interfaceC12236.mo30531();
        }
        Object objMo2097 = null;
        AbstractC17084 abstractC17084Mo30537 = null;
        int iMo30564 = 0;
        while (interfaceC12236.mo30549() != Integer.MAX_VALUE) {
            int tag2 = interfaceC12236.getTag();
            if (tag2 == 16) {
                iMo30564 = interfaceC12236.mo30564();
                objMo2097 = abstractC4077.mo2096(c24215, interfaceC18775, iMo30564);
            } else if (tag2 == 26) {
                if (objMo2097 != null) {
                    abstractC4077.mo2098(interfaceC12236, objMo2097, c24215, c8551);
                } else {
                    abstractC17084Mo30537 = interfaceC12236.mo30537();
                }
            } else if (!interfaceC12236.mo30531()) {
                break;
            }
        }
        if (interfaceC12236.getTag() != 12) {
            throw C20463.m46969();
        }
        if (abstractC17084Mo30537 != null) {
            if (objMo2097 != null) {
                abstractC4077.mo2099(abstractC17084Mo30537, objMo2097, c24215, c8551);
                return true;
            }
            abstractC3990.mo3894(obj, iMo30564, abstractC17084Mo30537);
        }
        return true;
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo21145(Object obj) {
        return this.f73644.mo2097(obj).m22906();
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final int mo21137(AbstractC9427 abstractC9427) {
        AbstractC3990 abstractC3990 = this.f73645;
        int iMo3905 = abstractC3990.mo3905(abstractC3990.mo3901(abstractC9427));
        return this.f73643 ? iMo3905 + this.f73644.mo2097((Object) abstractC9427).m22905() : iMo3905;
    }
}
