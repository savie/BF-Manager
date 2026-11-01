package l;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public final class C22346 extends AbstractC16267 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC8112 f72952;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f72953;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22346(C13174 c13174, C10229 c10229, AbstractC16579 abstractC16579, EnumC8112 enumC8112) {
        super(c13174, c10229, abstractC16579);
        this.f72953 = c13174;
        this.f72952 = enumC8112;
    }

    @Override // l.AbstractC16267
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16267 mo4311(C10229 c10229) {
        return new C22346(this.f72953, c10229, this.f52427, this.f72952);
    }

    @Override // l.AbstractC16267
    /* JADX INFO: renamed from: ۙ */
    public final void mo4312(C19524 c19524, C10391 c10391) {
        AbstractC16579 abstractC16579M44602 = c19524.m44602(this.f52427);
        boolean zM39001 = abstractC16579M44602.m39001(EnumC6617.UNDETVAR);
        C13174 c13174 = this.f72953;
        C10229 c10229 = this.f52428;
        EnumC8112 enumC8112 = this.f72952;
        if (zM39001) {
            C10229 c102210 = (C10229) abstractC16579M44602;
            if (!c102210.m26018()) {
                c102210.m26013(enumC8112.mo21371(), c10229, c13174.f43867);
                for (EnumC8112 enumC8113 : enumC8112 == EnumC8112.f28428 ? EnumSet.allOf(EnumC8112.class) : EnumSet.of(enumC8112)) {
                    Iterator it = c102210.m26012(enumC8113).iterator();
                    while (it.hasNext()) {
                        c10229.m26013(enumC8113, (AbstractC16579) it.next(), c13174.f43867);
                    }
                }
            }
        }
        EnumC8112 enumC8114 = EnumC8112.f28428;
        Iterator it2 = (enumC8112 == enumC8114 ? EnumSet.of(enumC8114) : EnumSet.complementOf(EnumSet.of(enumC8112))).iterator();
        while (it2.hasNext()) {
            Iterator it3 = c10229.m26012((EnumC8112) it2.next()).iterator();
            while (it3.hasNext()) {
                AbstractC16579 abstractC16579M44603 = c19524.m44602((AbstractC16579) it3.next());
                if (abstractC16579M44603.m39001(EnumC6617.UNDETVAR)) {
                    C10229 c102211 = (C10229) abstractC16579M44603;
                    if (!c102211.m26018()) {
                        c102211.m26013(enumC8112, c19524.m44587(this.f52427), c13174.f43867);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC16267
    public final String toString() {
        return String.format("%s[undet=%s,t=%s,bound=%s]", C22346.class.getSimpleName(), this.f52428.f53121, this.f52427, this.f72952);
    }
}
