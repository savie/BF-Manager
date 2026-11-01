package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public final class C1178 extends C1449 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f5249;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1178(C13174 c13174, C10229 c10229) {
        super(c13174, c10229, EnumC8112.f28425, EnumC8112.f28428, EnumC8112.f28427);
        this.f5249 = c13174;
    }

    @Override // l.C1449, l.C22617, l.AbstractC16267
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16267 mo4311(C10229 c10229) {
        return new C1178(this.f5249, c10229);
    }

    @Override // l.C22617, l.AbstractC16267
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4312(C19524 c19524, C10391 c10391) {
        AbstractC16579 abstractC16579M52361;
        C13174 c13174 = this.f5249;
        C23800 c23800 = c13174.f43867;
        Iterator it = c19524.f62776.iterator();
        while (it.hasNext()) {
            C10229 c10229 = (C10229) ((AbstractC16579) it.next());
            C10229 c102210 = this.f52428;
            c10229.m26016(c23800, C21825.of((Object) c102210.f53121), C21825.of((Object) c102210.m26017()));
            EnumC8112 enumC8112 = EnumC8112.f28427;
            C21825 c21825M38995 = AbstractC16579.m38995(c10229.m26012(enumC8112), new C2860(c19524));
            if (c21825M38995.isEmpty()) {
                abstractC16579M52361 = c13174.f43868.f14275;
            } else if (c21825M38995.f70877.isEmpty()) {
                abstractC16579M52361 = (AbstractC16579) c21825M38995.f70876;
            } else {
                abstractC16579M52361 = c23800.m52361(c21825M38995);
            }
            if (abstractC16579M52361 == null || abstractC16579M52361.mo1926()) {
                c13174.m32582(c10229, enumC8112);
            }
        }
        super.mo4312(c19524, c10391);
    }
}
