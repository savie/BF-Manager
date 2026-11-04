package l;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public final class C24226 extends AbstractC21988 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f78474;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC0816 f78475;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24226(C14528 c14528, C8274 c8274, AbstractC22664 abstractC22664, EnumC0816 enumC0816) {
        super(c14528, c8274, abstractC22664);
        this.f78474 = c14528;
        this.f78475 = enumC0816;
    }

    @Override // l.AbstractC21988
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC21988 mo13163(C8274 c8274) {
        return new C24226(this.f78474, c8274, this.f70942, this.f78475);
    }

    @Override // l.AbstractC21988
    /* JADX INFO: renamed from: ۙ */
    public final void mo13164(C2596 c2596, C1083 c1083) {
        AbstractC22664 abstractC22664M8710 = c2596.m8710(this.f70942);
        boolean zM51067 = abstractC22664M8710.m51067(EnumC21172.UNDETVAR);
        C14528 c14528 = this.f78474;
        C8274 c8274 = this.f70943;
        EnumC0816 enumC0816 = this.f78475;
        if (zM51067) {
            C8274 c8275 = (C8274) abstractC22664M8710;
            if (!c8275.m22330()) {
                c8275.m22334(enumC0816.mo3284(), c8274, c14528.f45697);
                for (EnumC0816 enumC0817 : enumC0816 == EnumC0816.f3094 ? EnumSet.allOf(EnumC0816.class) : EnumSet.of(enumC0816)) {
                    Iterator it = c8275.m22332(enumC0817).iterator();
                    while (it.hasNext()) {
                        c8274.m22334(enumC0817, (AbstractC22664) it.next(), c14528.f45697);
                    }
                }
            }
        }
        EnumC0816 enumC0818 = EnumC0816.f3094;
        Iterator it2 = (enumC0816 == enumC0818 ? EnumSet.of(enumC0818) : EnumSet.complementOf(EnumSet.of(enumC0816))).iterator();
        while (it2.hasNext()) {
            Iterator it3 = c8274.m22332((EnumC0816) it2.next()).iterator();
            while (it3.hasNext()) {
                AbstractC22664 abstractC22664M8711 = c2596.m8710((AbstractC22664) it3.next());
                if (abstractC22664M8711.m51067(EnumC21172.UNDETVAR)) {
                    C8274 c8276 = (C8274) abstractC22664M8711;
                    if (!c8276.m22330()) {
                        c8276.m22334(enumC0816, c2596.m8696(this.f70942), c14528.f45697);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC21988
    public final String toString() {
        return String.format("%s[undet=%s,t=%s,bound=%s]", C24226.class.getSimpleName(), this.f70943.f72657, this.f70942, this.f78475);
    }
}
