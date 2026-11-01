package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩻֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23363 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f75685;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23363(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f75685 = c0429;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        C0429 c0429 = this.f75685;
        if (!c0429.f1953) {
            c0429.f1990 += i;
            return;
        }
        c0429.m2248();
        c0429.m2248();
        c0429.f1990 += c0429.m2245();
        c0429.f1990 = (c0429.m2248() * '\b') + c0429.f1990;
        c0429.m2240(abstractC23903, EnumC13130.MEMBER);
        ((C18258) abstractC23903).f58261 = null;
    }
}
