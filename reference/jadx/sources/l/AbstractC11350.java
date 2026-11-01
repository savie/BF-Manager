package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۨ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11350 extends C10104 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f38291;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8528 f38292;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public Map f38293;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC11350 mo6775(C4603 c4603, AbstractC5930 abstractC5930);

    /* JADX INFO: renamed from: ܰ */
    public abstract AbstractC16579 mo6776(C1116 c1116);

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC11350(C8528 c8528, AbstractC5930 abstractC5930, C4603 c4603, AbstractC5930 abstractC5931, Map map) {
        this.f38292 = c8528;
        C5870 c5870 = c8528.f29528;
        C13638.requireNonNull(c5870);
        super(c5870, abstractC5930, c4603);
        this.f38291 = abstractC5931;
        this.f38293 = map;
    }

    @Override // l.C10104
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo25714(C1116 c1116, C12926 c12926) {
        AbstractC16579 abstractC16579Mo6776;
        if (c12926.f42954 == EnumC9729.SPECULATIVE) {
            if (c1116.f5036 == AbstractC16579.f53218) {
                abstractC16579Mo6776 = super.mo25714(c1116, c12926);
            } else {
                abstractC16579Mo6776 = mo6776(c1116);
            }
            this.f38293.put(c1116, abstractC16579Mo6776);
            return abstractC16579Mo6776;
        }
        if (!((C22990) this.f34496.f16299).f74713.f12499) {
            C8528 c8528 = this.f38292;
            c8528.f29526.remove(new C19111(c8528, this.f34494));
        }
        return super.mo25714(c1116, c12926);
    }

    @Override // l.C10104
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo25715(AbstractC23903 abstractC23903, EnumC11678 enumC11678) {
        if (this.f34497.contains(abstractC23903)) {
            return super.mo25715(abstractC23903, enumC11678);
        }
        for (Map.Entry entry : this.f38293.entrySet()) {
            C12926 c12926Mo4575 = ((C1116) entry.getKey()).f5037.mo4575();
            if (c12926Mo4575.f42957 == enumC11678 && c12926Mo4575.f42951 == abstractC23903) {
                return (AbstractC16579) entry.getValue();
            }
        }
        return AbstractC16579.f53219;
    }

    @Override // l.C10104
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8774 mo25712(C12926 c12926) {
        if (this.f34497.contains(c12926.f42951)) {
            return super.mo25712(c12926);
        }
        return this.f38291;
    }
}
