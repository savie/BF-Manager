package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public final class C4088 extends C4417 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f13929;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4088(C14528 c14528, C8274 c8274) {
        super(c14528, c8274, EnumC0816.f3093, EnumC0816.f3094, EnumC0816.f3091);
        this.f13929 = c14528;
    }

    @Override // l.C4417, l.C24555, l.AbstractC21988
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21988 mo13163(C8274 c8274) {
        return new C4088(this.f13929, c8274);
    }

    @Override // l.C24555, l.AbstractC21988
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13164(C2596 c2596, C1083 c1083) {
        AbstractC22664 abstractC22664M55167;
        C14528 c14528 = this.f13929;
        C24705 c24705 = c14528.f45697;
        Iterator it = c2596.f8337.iterator();
        while (it.hasNext()) {
            C8274 c8274 = (C8274) ((AbstractC22664) it.next());
            C8274 c8275 = this.f70943;
            c8274.m22336(c24705, C14769.of((Object) c8275.f72657), C14769.of((Object) c8275.m22338()));
            EnumC0816 enumC0816 = EnumC0816.f3091;
            C14769 c14769M51059 = AbstractC22664.m51059(c8274.m22332(enumC0816), new C12620(c2596));
            if (c14769M51059.isEmpty()) {
                abstractC22664M55167 = c14528.f45699.f48286;
            } else if (c14769M51059.f48336.isEmpty()) {
                abstractC22664M55167 = (AbstractC22664) c14769M51059.f48335;
            } else {
                abstractC22664M55167 = c24705.m55167(c14769M51059);
            }
            if (abstractC22664M55167 == null || abstractC22664M55167.mo9329()) {
                c14528.m35064(c8274, enumC0816);
            }
        }
        super.mo13164(c2596, c1083);
    }
}
