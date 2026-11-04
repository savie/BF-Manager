package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C2854 extends AbstractC1100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f9426;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        return (Void) c2832.f9333.mo9324(this, (Set) obj);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        final Set set = (Set) obj;
        if (c10510.mo18914()) {
            C4937.forEach(this.f9426.m55135(c10510), new Consumer() { // from class: l.֨ᩳ᩺
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj2) {
                    ((AbstractC22664) obj2).mo9324(this.f4853, set);
                }
            });
            return null;
        }
        C4937.forEach(c10510.mo9323(), new Consumer() { // from class: l.ۡᩳ᩺
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj2) {
                ((AbstractC22664) obj2).mo9324(this.f30960, set);
            }
        });
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        c10729.f34074.mo9324(this, (Set) obj);
        return null;
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1770(C14018 c14018, Object obj) {
        Set set = (Set) obj;
        if (!set.add(c14018)) {
            return null;
        }
        c14018.mo19992().mo9324(this, set);
        c14018.f58893.mo9324(this, set);
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        Set set = (Set) obj;
        if ((c17969.f73596.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || !set.add(c17969)) {
            return null;
        }
        c17969.mo19992().mo9324(this, set);
        return null;
    }

    public C2854(C24705 c24705) {
        this.f9426 = c24705;
    }
}
