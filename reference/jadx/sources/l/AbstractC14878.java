package l;

/* JADX INFO: renamed from: l.ܶ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14878 extends AbstractC11350 {
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC16579 mo35572();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract C1116 mo35573(C1116 c1116);

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[Catch: all -> 0x0082, ܿ᩻ۤ -> 0x0085, TryCatch #0 {ܿ᩻ۤ -> 0x0085, blocks: (B:10:0x002c, B:12:0x0034, B:15:0x003e, B:17:0x0049, B:19:0x0051, B:22:0x0063, B:24:0x0070, B:25:0x0076), top: B:44:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[Catch: all -> 0x0082, ܿ᩻ۤ -> 0x0085, TryCatch #0 {ܿ᩻ۤ -> 0x0085, blocks: (B:10:0x002c, B:12:0x0034, B:15:0x003e, B:17:0x0049, B:19:0x0051, B:22:0x0063, B:24:0x0070, B:25:0x0076), top: B:44:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[PHI: r11
      0x007e: PHI (r11v3 l.ܽۤۤ) = (r11v2 l.ܽۤۤ), (r11v5 l.ܽۤۤ) binds: [B:26:0x007c, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0083: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:29:0x0083 */
    @Override // l.AbstractC11350
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC16579 mo6776(C1116 c1116) throws Throwable {
        AbstractC16579 abstractC16579Mo4137;
        C21825 c21825;
        AbstractC16579 abstractC16579Mo16235;
        AbstractC16579 abstractC16579Mo35572 = mo35572();
        C1116 c1116Mo35573 = mo35573(c1116);
        if (abstractC16579Mo35572 != null && abstractC16579Mo35572.m39001(EnumC6617.METHOD) && abstractC16579Mo35572.mo14987()) {
            C5412 c5412 = (C5412) abstractC16579Mo35572;
            C4603 c4603 = c5412.f18690;
            C10391 c10391 = c5412.f18691;
            C13174 c13174 = c5412.f18689;
            C19524 c19524 = c5412.f18688;
            C21825 c21826 = null;
            C10391 c10392 = new C10391(null);
            try {
                try {
                    C21825 c21825M44597 = c19524.m44597();
                    try {
                        boolean zM26293 = c10391.m26293(EnumC0597.UNCHECKED);
                        if (!zM26293) {
                            boolean zM32576 = c13174.m32576(c5412.f45368, c1116Mo35573, c19524);
                            InterfaceC18195 interfaceC18195 = c1116Mo35573.f5037;
                            C19524 c19524M44588 = zM32576 ? c19524.m44588(C13174.m32569(c13174, c5412), false, c10391) : c19524;
                            abstractC16579Mo4137 = c13174.m32580(c4603.f16296, c1116Mo35573, c5412, c19524M44588);
                            if (zM32576) {
                                c19524M44588.m44593(interfaceC18195.mo4574(), interfaceC18195.mo4575().m32015());
                                if (c21825M44597 != null) {
                                    c19524.m44606(c21825M44597);
                                }
                            } else {
                                c19524.m44592(c10392);
                                abstractC16579Mo16235 = c19524.m44587(c5412).mo16235();
                                if (zM26293) {
                                    abstractC16579Mo16235 = c13174.f43867.m52402(abstractC16579Mo16235);
                                }
                                abstractC16579Mo4137 = c1116Mo35573.mo4137(c4603.f16296, abstractC16579Mo16235);
                                if (c21825M44597 != null) {
                                    c19524.m44606(c21825M44597);
                                }
                            }
                        } else {
                            c19524.m44592(c10392);
                            abstractC16579Mo16235 = c19524.m44587(c5412).mo16235();
                            if (zM26293) {
                                abstractC16579Mo16235 = c13174.f43867.m52402(abstractC16579Mo16235);
                            }
                            abstractC16579Mo4137 = c1116Mo35573.mo4137(c4603.f16296, abstractC16579Mo16235);
                            if (c21825M44597 != null) {
                                c19524.m44606(c21825M44597);
                            }
                        }
                    } catch (C17677 e) {
                        e = e;
                        c1116Mo35573.f5037.mo2545(null, e.mo4255());
                        C6171.m17170();
                        throw null;
                    }
                } catch (Throwable th) {
                    th = th;
                    c21826 = c21825;
                    if (c21826 != null) {
                        c19524.m44606(c21826);
                    }
                    throw th;
                }
            } catch (C17677 e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                if (c21826 != null) {
                    c19524.m44606(c21826);
                }
                throw th;
            }
        } else {
            AbstractC5930 abstractC5930 = this.f34494;
            abstractC5930.getClass();
            abstractC16579Mo4137 = c1116Mo35573.mo4137(abstractC5930, this.f38291.f30190);
        }
        this.f38293.put(c1116Mo35573, abstractC16579Mo4137);
        return abstractC16579Mo4137;
    }
}
