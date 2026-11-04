package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۛۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6299 extends C8666 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f21366;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7044 f21367;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public Map f21368;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC6299 mo4038(C3168 c3168, AbstractC22295 abstractC22295);

    /* JADX INFO: renamed from: ᩷ */
    public abstract AbstractC22664 mo8632(C14479 c14479);

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6299(C7044 c7044, AbstractC22295 abstractC22295, C3168 c3168, AbstractC22295 abstractC22296, Map map) {
        this.f21367 = c7044;
        C12863 c12863 = c7044.f23241;
        C17359.requireNonNull(c12863);
        super(c12863, abstractC22295, c3168);
        this.f21366 = abstractC22296;
        this.f21368 = map;
    }

    @Override // l.C8666
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 mo17985(C14479 c14479, C4192 c4192) {
        AbstractC22664 abstractC22664Mo8632;
        if (c4192.f15331 == EnumC16124.SPECULATIVE) {
            if (c14479.f45575 == AbstractC22664.f73591) {
                abstractC22664Mo8632 = super.mo17985(c14479, c4192);
            } else {
                abstractC22664Mo8632 = mo8632(c14479);
            }
            this.f21368.put(c14479, abstractC22664Mo8632);
            return abstractC22664Mo8632;
        }
        if (!((C7768) this.f28296.f10272).f25555.f76580) {
            C7044 c7044 = this.f21367;
            c7044.f23239.remove(new C8535(c7044, this.f28301));
        }
        return super.mo17985(c14479, c4192);
    }

    @Override // l.C8666
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 mo17984(AbstractC11781 abstractC11781, EnumC20234 enumC20234) {
        if (this.f28297.contains(abstractC11781)) {
            return super.mo17984(abstractC11781, enumC20234);
        }
        for (Map.Entry entry : this.f21368.entrySet()) {
            C4192 c4192Mo2277 = ((C14479) entry.getKey()).f45571.mo2277();
            if (c4192Mo2277.f15333 == enumC20234 && c4192Mo2277.f15336 == abstractC11781) {
                return (AbstractC22664) entry.getValue();
            }
        }
        return AbstractC22664.f73590;
    }

    @Override // l.C8666
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8036 mo17983(C4192 c4192) {
        if (this.f28297.contains(c4192.f15336)) {
            return super.mo17983(c4192);
        }
        return this.f21366;
    }
}
