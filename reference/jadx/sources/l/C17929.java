package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17929 implements InterfaceC14852 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final C13477 f58717 = new C13477();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0310 f58718;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6147 f58719;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final C24705 f58720;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C19991 f58721;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C15714 f58722;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C16437 f58723;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15400 f58724;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C22092 f58725;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C15846 f58726;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC17425 f58727;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C15252 f58729;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C12221 f58730;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7312 f58731;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58732;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public AbstractC11962 f58733;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11518 f58734;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C22756 f58736;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f58737;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C3605 f58738;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C14764 f58739;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f58728 = true;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15691 f58735 = new C15691(this);

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo11630() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10377 m41842(C17929 c17929, AbstractC22970 abstractC22970, AbstractC19728 abstractC19728, C14769 c14769) {
        c17929.getClass();
        AbstractC17836 abstractC17836Mo29571 = abstractC22970.mo29571();
        C18280 c18280 = new C18280();
        abstractC17836Mo29571.getClass();
        for (AbstractC11781 abstractC11781 : abstractC17836Mo29571.mo7473(abstractC19728, c18280, EnumC13908.RECURSIVE)) {
            if (c17929.f58720.m55148(abstractC11781.f38067.mo50621(), c14769)) {
                return (C10377) abstractC11781;
            }
        }
        return null;
    }

    public C17929(C4747 c4747) {
        c4747.m14646(f58717, this);
        this.f58729 = C15252.m36599(c4747);
        this.f58726 = C15846.m37791(c4747);
        this.f58738 = C3605.m11692(c4747);
        this.f58731 = C7312.m20023(c4747);
        this.f58725 = C22092.m49912(c4747);
        this.f58718 = C0310.m1899(c4747);
        this.f58739 = C14764.m35506(c4747);
        this.f58722 = C15714.m37502(c4747);
        this.f58736 = C22756.m51291(c4747);
        this.f58734 = C11518.m28979(c4747);
        this.f58730 = C12221.m30493(c4747);
        this.f58720 = C24705.m55066(c4747);
        this.f58721 = C19991.m45972(c4747);
        this.f58719 = C6147.m17745(c4747);
        this.f58724 = C15400.m36873(c4747);
        this.f58723 = C16437.m38994(c4747);
        this.f58727 = AbstractC17425.m40916(c4747);
        C17638.m41289(c4747);
        EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
        this.f58737 = EnumC3666.f12558.m11915(enumC20820M47625);
        this.f58732 = EnumC3666.f12555.m11915(enumC20820M47625);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41864(C14769 c14769) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            final C19113 c19113 = (C19113) it.next();
            if (!c19113.f61861.m40254()) {
                final C3168 c3168M37798 = this.f58726.m37798(c19113);
                m41865(c19113, new Runnable() { // from class: l.ۨۧۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39581.f58735.m37468(c19113, c3168M37798);
                    }
                });
            }
        }
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public final void mo11629(AbstractC11781 abstractC11781) {
        AbstractC17425 abstractC17425 = this.f58727;
        C11518 c11518 = this.f58734;
        if (!this.f58728) {
            C11972.m30026((abstractC11781.mo29591() & 16777216) == 0);
            abstractC11781.f38070 = this;
            return;
        }
        try {
            c11518.m29004();
            abstractC11781.f38071 |= 268435456;
            abstractC17425.mo39423((C24550) abstractC11781, EnumC10712.MEMBER_ENTER);
            try {
                C14769<C3168> c14769M29938 = this.f58735.m29938(C14769.of((Object) this.f58723.m38995((C24550) abstractC11781)));
                abstractC17425.mo39422();
                if (!c14769M29938.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (C3168 c3168 : c14769M29938) {
                        if (c3168.f10275.f61857.contains(c3168.f10279) && hashSet.add(c3168.f10275)) {
                            m41865(c3168.f10275, new RunnableC6348());
                        }
                    }
                }
                c11518.m29003();
            } catch (Throwable th) {
                abstractC17425.mo39422();
                throw th;
            }
        } catch (Throwable th2) {
            c11518.m29003();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41865(C19113 c19113, Runnable runnable) {
        C22092 c22092 = this.f58725;
        InterfaceC15976 interfaceC15976 = c19113.f61856;
        C7312 c7312 = this.f58731;
        InterfaceC15976 interfaceC15976M34530 = c7312.m34530(interfaceC15976);
        try {
            runnable.run();
            c22092.m50034(c19113);
            c22092.m50052(c19113);
            c22092.m50011(c19113);
            c19113.f61854.mo19770();
            c19113.f61861.mo19770();
        } catch (C21566 e) {
            c22092.m49966(c19113, e);
        } finally {
            c7312.m34530(interfaceC15976M34530);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6633 m41862(C15714 c15714, C7093 c7093) {
        AbstractC22295 abstractC22295M37565;
        AbstractC22664 abstractC22664Mo19436 = c7093.mo19436();
        C10377 c10377Mo19439 = c7093.mo19439();
        C18499 c18499 = new C18499();
        if (c7093.f23400.f38067 != this.f58739.f48286) {
            boolean zM51067 = c7093.mo19437().m51067(EnumC21172.NONE);
            C15252 c15252 = this.f58729;
            if (!zM51067) {
                abstractC22295M37565 = c15714.m37544(c15714.m37508((AbstractC11781) c10377Mo19439.f33013.f48335), c15252.f49851);
            } else {
                abstractC22295M37565 = c15714.m37565(c15252.f49851);
            }
            c18499.m43089(c15714.m37567(c15714.m37550(abstractC22295M37565, abstractC22664Mo19436.mo15882().m35550() ? c15714.m37562(abstractC22664Mo19436.mo15882()) : null, c7093.mo19438().m35547((Function) new C21264(0, c15714)))));
        }
        return c7093.mo19435(c15714.m37512(c10377Mo19439, c10377Mo19439.f38067, c15714.m37506(0L, c18499.m43093())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41863(AbstractC11781 abstractC11781, C14769 c14769, C3168 c3168) {
        C0310 c0310 = this.f58718;
        c0310.getClass();
        for (C14769 c147610 = c14769; c147610.m35550(); c147610 = c147610.f48336) {
            c0310.m1981(((C17621) c147610.f48335).f57962, c3168, AbstractC22664.f73590);
        }
        while (!c14769.isEmpty()) {
            C17621 c17621 = (C17621) c14769.f48335;
            AbstractC22664 abstractC22664 = c17621.f57962.f26659;
            C14764 c14764 = this.f58739;
            AbstractC22664 abstractC22665 = c14764.f48258;
            C15252 c15252 = this.f58729;
            if (abstractC22664 == abstractC22665) {
                abstractC11781.f38071 |= 18014398509613056L;
                m41844(c17621, abstractC11781, c15252.f49803, 36028797018963968L);
            } else if (abstractC22664 == c14764.f48270) {
                abstractC11781.f38071 |= 72057594037927936L;
                m41844(c17621, abstractC11781, c15252.f49755, 288230376151711744L);
            }
            c14769 = c14769.f48336;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41844(C17621 c17621, final AbstractC11781 abstractC11781, AbstractC19728 abstractC19728, final long j) {
        C1170.stream(c17621.f57964).filter(new C24248()).map(new C0652(5)).filter(new C4110(0, abstractC19728)).findFirst().ifPresent(new Consumer() { // from class: l.ܰۧۘ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                AbstractC22295 abstractC22295M28353 = C11239.m28353(((C20605) obj).f66031);
                if (abstractC22295M28353.m21911(EnumC21461.f68484) && Boolean.TRUE.equals(((C23787) abstractC22295M28353).m53058())) {
                    abstractC11781.f38071 |= j;
                }
            }
        });
    }
}
