package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U9PR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16150 implements InterfaceC6667 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC5297 f52208;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23206 f52209;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f52210;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC5524 f52211;

    public C16150(AbstractC5297 abstractC5297, AbstractC5524 abstractC5524, InterfaceC23206 interfaceC23206) {
        this.f52208 = abstractC5297;
        this.f52210 = abstractC5524.mo4623(interfaceC23206);
        this.f52211 = abstractC5524;
        this.f52209 = interfaceC23206;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16150 m38234(AbstractC5297 abstractC5297, AbstractC5524 abstractC5524, InterfaceC23206 interfaceC23206) {
        return new C16150(abstractC5297, abstractC5524, interfaceC23206);
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18054() {
        InterfaceC23206 interfaceC23206 = this.f52209;
        if (!(interfaceC23206 instanceof AbstractC16129)) {
            return interfaceC23206.newBuilderForType().buildPartial();
        }
        EnumC7662 enumC7662 = EnumC7662.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC16129) ((AbstractC16129) interfaceC23206).m38184();
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18059(AbstractC16129 abstractC16129, AbstractC16129 abstractC161210) {
        AbstractC5297 abstractC5297 = this.f52208;
        if (!abstractC5297.mo14687(abstractC16129).equals(abstractC5297.mo14687(abstractC161210))) {
            return false;
        }
        if (!this.f52210) {
            return true;
        }
        AbstractC5524 abstractC5524 = this.f52211;
        return abstractC5524.mo4619((Object) abstractC16129).equals(abstractC5524.mo4619((Object) abstractC161210));
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final int mo18052(AbstractC16129 abstractC16129) {
        int iHashCode = this.f52208.mo14687(abstractC16129).hashCode();
        return this.f52210 ? (iHashCode * 53) + this.f52211.mo4619((Object) abstractC16129).hashCode() : iHashCode;
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final void mo18056(Object obj, Object obj2) {
        int i = C22896.f74441;
        AbstractC5297 abstractC5297 = this.f52208;
        abstractC5297.mo14686(obj, abstractC5297.mo14676(abstractC5297.mo14687(obj), abstractC5297.mo14687(obj2)));
        if (this.f52210) {
            AbstractC5524 abstractC5524 = this.f52211;
            C8347 c8347Mo4619 = abstractC5524.mo4619(obj2);
            if (c8347Mo4619.m21845()) {
                return;
            }
            abstractC5524.mo4625(obj).m21840(c8347Mo4619);
        }
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final void mo18057(Object obj, InterfaceC12976 interfaceC12976) {
        Iterator itM21847 = this.f52211.mo4619(obj).m21847();
        while (itM21847.hasNext()) {
            Map.Entry entry = (Map.Entry) itM21847.next();
            InterfaceC18930 interfaceC18930 = (InterfaceC18930) entry.getKey();
            if (interfaceC18930.mo23410() != EnumC4508.MESSAGE || interfaceC18930.mo23408() || interfaceC18930.mo23406()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C3823) {
                ((C0876) interfaceC12976).m3534(interfaceC18930.getNumber(), ((C3823) entry).m11117().m36207());
            } else {
                ((C0876) interfaceC12976).m3534(interfaceC18930.getNumber(), entry.getValue());
            }
        }
        AbstractC5297 abstractC5297 = this.f52208;
        abstractC5297.mo14681(abstractC5297.mo14687(obj), interfaceC12976);
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final void mo18058(Object obj, InterfaceC13724 interfaceC13724, C2701 c2701) {
        AbstractC5297 abstractC5297 = this.f52208;
        Object objMo14675 = abstractC5297.mo14675(obj);
        AbstractC5524 abstractC5524 = this.f52211;
        C8347 c8347Mo4625 = abstractC5524.mo4625(obj);
        while (interfaceC13724.mo12311() != Integer.MAX_VALUE) {
            try {
                if (!m38235(interfaceC13724, c2701, abstractC5524, c8347Mo4625, abstractC5297, objMo14675)) {
                    return;
                }
            } finally {
                abstractC5297.mo14689(obj, objMo14675);
            }
        }
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final void mo18055(Object obj) {
        this.f52208.mo14684(obj);
        this.f52211.mo4624(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m38235(InterfaceC13724 interfaceC13724, C2701 c2701, AbstractC5524 abstractC5524, C8347 c8347, AbstractC5297 abstractC5297, Object obj) throws C4529 {
        int tag = interfaceC13724.getTag();
        InterfaceC23206 interfaceC23206 = this.f52209;
        if (tag != 11) {
            if ((tag & 7) == 2) {
                Object objMo4618 = abstractC5524.mo4618(c2701, interfaceC23206, tag >>> 3);
                if (objMo4618 != null) {
                    abstractC5524.mo4621(interfaceC13724, objMo4618, c2701, c8347);
                    return true;
                }
                return abstractC5297.m14682(obj, interfaceC13724);
            }
            return interfaceC13724.mo12297();
        }
        Object objMo4619 = null;
        AbstractC23725 abstractC23725Mo12302 = null;
        int iMo12282 = 0;
        while (interfaceC13724.mo12311() != Integer.MAX_VALUE) {
            int tag2 = interfaceC13724.getTag();
            if (tag2 == 16) {
                iMo12282 = interfaceC13724.mo12282();
                objMo4619 = abstractC5524.mo4618(c2701, interfaceC23206, iMo12282);
            } else if (tag2 == 26) {
                if (objMo4619 != null) {
                    abstractC5524.mo4621(interfaceC13724, objMo4619, c2701, c8347);
                } else {
                    abstractC23725Mo12302 = interfaceC13724.mo12302();
                }
            } else if (!interfaceC13724.mo12297()) {
                break;
            }
        }
        if (interfaceC13724.getTag() != 12) {
            throw C4529.m12648();
        }
        if (abstractC23725Mo12302 != null) {
            if (objMo4619 != null) {
                abstractC5524.mo4622(abstractC23725Mo12302, objMo4619, c2701, c8347);
                return true;
            }
            abstractC5297.mo14680(obj, iMo12282, abstractC23725Mo12302);
        }
        return true;
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo18060(Object obj) {
        return this.f52211.mo4619(obj).m21835();
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final int mo18053(AbstractC18079 abstractC18079) {
        AbstractC5297 abstractC5297 = this.f52208;
        int iMo14673 = abstractC5297.mo14673(abstractC5297.mo14687(abstractC18079));
        return this.f52210 ? iMo14673 + this.f52211.mo4619((Object) abstractC18079).m21846() : iMo14673;
    }
}
