package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ᩳ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final class C19333 extends C24555 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f62448;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19333(C14528 c14528, C8274 c8274, AbstractC22664 abstractC22664, EnumC0816 enumC0816) {
        super(c14528, c8274, abstractC22664, new C0688(), new C8146(), enumC0816);
        this.f62448 = c14528;
    }

    @Override // l.C24555, l.AbstractC21988
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC21988 mo13163(C8274 c8274) {
        return new C19333(this.f62448, c8274, this.f70942, this.f79591);
    }

    @Override // l.C24555
    /* JADX INFO: renamed from: ۙ */
    public final EnumSet mo14041() {
        EnumC0816 enumC0816 = EnumC0816.f3094;
        if (this.f79591 == enumC0816) {
            return EnumSet.allOf(EnumC0816.class);
        }
        return EnumSet.of(enumC0816);
    }
}
