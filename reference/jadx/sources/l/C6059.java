package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes3.dex */
public final class C6059 extends AbstractC7550 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0838 f20705;

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ۙ */
    public final void mo12356(AbstractC8036 abstractC8036, AbstractC8036 abstractC8037, boolean z) {
        C14769 c14769Mo15882;
        C14769 c14769Mo15883;
        C18565 c18565 = (C18565) abstractC8036;
        C18565 c18566 = (C18565) abstractC8037;
        if (z) {
            return;
        }
        if (c18565.f60319 != null) {
            if (c18566.f60319.f26347.m35550()) {
                c14769Mo15882 = ((AbstractC22295) c18566.f60319.f26347.get(0)).f26659.mo15882();
            } else {
                c14769Mo15882 = c18566.f60319.f26348.f26659.mo15882();
            }
            if (c18565.f60319.f26347.m35550()) {
                c14769Mo15883 = ((AbstractC22295) c18565.f60319.f26347.get(0)).f26659.mo15882();
            } else {
                c14769Mo15883 = c18565.f60319.f26348.f26659.mo15882();
            }
        } else {
            c14769Mo15882 = c18566.f26659.mo15882();
            c14769Mo15883 = c18565.f26659.mo15882();
        }
        Iterator it = c14769Mo15882.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C0838 c0838 = this.f20705;
            if (zHasNext) {
                if (!c0838.f3154.m55149((AbstractC22664) it.next(), (AbstractC22664) c14769Mo15883.f48335)) {
                    return;
                } else {
                    c14769Mo15883 = c14769Mo15883.f48336;
                }
            } else {
                c0838.f3151.m34531(c18565.f60323, C13146.f42049);
                return;
            }
        }
    }

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12357(AbstractC8036 abstractC8036) {
        C18565 c18565 = (C18565) abstractC8036;
        if (!c18565.f60323.m21911(EnumC21461.f68496) || C11239.m28349(c18565)) {
            return false;
        }
        return c18565.f60319 == null || this.f20705.f3148;
    }

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ᩷ */
    public final C14769 mo12358(AbstractC8036 abstractC8036) {
        C18565 c18565 = (C18565) abstractC8036;
        if (c18565.f60323.m21911(EnumC21461.f68496)) {
            C18565 c18566 = (C18565) this.f20705.f3153.mo23491((AbstractC8036) c18565, (Object) null);
            ((C25191) c18566.f60323).f81424 = C14769.m35543();
            return C14769.of((Object) c18566);
        }
        return C14769.of((Object) c18565);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6059(C0838 c0838) {
        super(c0838, EnumC20229.DIAMOND, EnumC21461.f68518);
        this.f20705 = c0838;
    }
}
