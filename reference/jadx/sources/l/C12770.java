package l;

import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12770 extends C13777 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashSet f40865 = new HashSet();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14769 f40866;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f40867;

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        AbstractC22664 abstractC22664 = c2832.f9333;
        AbstractC22664 abstractC22665 = (AbstractC22664) abstractC22664.mo9324(this, (EnumC0354) obj);
        if (abstractC22665 == abstractC22664) {
            return c2832;
        }
        if (abstractC22665.m51067(EnumC21172.BOT)) {
            return this.f40867.f79947.f48241;
        }
        return new C22467(abstractC22665, c2832.f73596, c2832.f73595);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        final EnumC0354 enumC0354 = (EnumC0354) obj;
        boolean zMo18914 = c10510.mo18914();
        C24705 c24705 = this.f40867;
        if (zMo18914) {
            C14769 c14769M55135 = c24705.m55135(c10510);
            C14769 c14769M35547 = c14769M55135.m35547(new Function() { // from class: l.᩷֨᩺
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo10608andThen(Function function) {
                    return C24247.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C24247.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    AbstractC22664 abstractC22664 = (AbstractC22664) obj2;
                    abstractC22664.getClass();
                    return (AbstractC22664) abstractC22664.mo9324(this.f69314, enumC0354);
                }
            });
            if (c14769M55135 != c14769M35547) {
                return c24705.m55138(c14769M35547);
            }
        } else {
            AbstractC22664 abstractC22664Mo23449 = c10510.mo23449();
            AbstractC22664 abstractC22664 = (AbstractC22664) abstractC22664Mo23449.mo9324(this, enumC0354);
            C14769<AbstractC22664> c14769Mo15882 = c10510.mo15882();
            C14769 c14769Mo15883 = c10510.f73596.f38067.mo15882();
            C18499 c18499 = new C18499();
            boolean z = false;
            for (AbstractC22664 abstractC22665 : c14769Mo15882) {
                AbstractC22664 abstractC22666 = abstractC22665.m51073(this.f40866) ? (AbstractC22664) abstractC22665.mo9324(new C15007(this, c10510, ((AbstractC22664) c14769Mo15883.f48335).mo19992()), enumC0354) : abstractC22665;
                if (!abstractC22666.m51067(EnumC21172.BOT)) {
                    c18499.m43089(abstractC22666);
                    z |= abstractC22665 != abstractC22666;
                    c14769Mo15883 = c14769Mo15883.f48336;
                } else {
                    return c24705.f79947.f48241;
                }
            }
            if (abstractC22664 != abstractC22664Mo23449 || z) {
                return new C10532(abstractC22664, c18499.m43093(), c10510.f73596, c10510.f73595);
            }
        }
        return c10510;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        AbstractC22664 abstractC22664Mo19992;
        EnumC0354 enumC0354 = (EnumC0354) obj;
        C14764 c14764 = this.f40867.f79947;
        if (!this.f40866.contains(c17969)) {
            return c17969;
        }
        HashSet hashSet = this.f40865;
        if (!hashSet.add(c17969)) {
            return enumC0354 == EnumC0354.f1861 ? c14764.f48286 : c14764.f48241;
        }
        try {
            int iOrdinal = enumC0354.ordinal();
            if (iOrdinal == 0) {
                abstractC22664Mo19992 = c17969.mo19992();
            } else {
                if (iOrdinal != 1) {
                    C11972.m30019();
                    throw null;
                }
                abstractC22664Mo19992 = c17969.f58893;
                if (abstractC22664Mo19992 == null) {
                    abstractC22664Mo19992 = c14764.f48241;
                }
            }
            abstractC22664Mo19992.getClass();
            AbstractC22664 abstractC22664 = (AbstractC22664) abstractC22664Mo19992.mo9324(this, enumC0354);
            hashSet.remove(c17969);
            return abstractC22664;
        } catch (Throwable th) {
            hashSet.remove(c17969);
            throw th;
        }
    }

    public C12770(C24705 c24705, C14769 c14769) {
        this.f40867 = c24705;
        this.f40866 = c14769;
    }
}
