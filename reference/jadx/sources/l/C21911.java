package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩸᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final class C21911 extends C22617 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f71095;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21911(C13174 c13174, C10229 c10229, AbstractC16579 abstractC16579, EnumC8112 enumC8112) {
        super(c13174, c10229, abstractC16579, new C23323(), new C15562(), enumC8112);
        this.f71095 = c13174;
    }

    @Override // l.C22617, l.AbstractC16267
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16267 mo4311(C10229 c10229) {
        return new C21911(this.f71095, c10229, this.f52427, this.f73697);
    }

    @Override // l.C22617
    /* JADX INFO: renamed from: ۙ */
    public final EnumSet mo5039() {
        EnumC8112 enumC8112 = EnumC8112.f28428;
        if (this.f73697 == enumC8112) {
            return EnumSet.allOf(EnumC8112.class);
        }
        return EnumSet.of(enumC8112);
    }
}
