package l;

/* JADX INFO: renamed from: l.ۢۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10026 extends AbstractC6299 {
    /* JADX INFO: renamed from: ۢۙ */
    public abstract AbstractC22664 mo4039();

    /* JADX INFO: renamed from: ۤ */
    public abstract C14479 mo4040(C14479 c14479);

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[Catch: all -> 0x0082, ۫ۤۘ -> 0x0085, TryCatch #0 {all -> 0x0082, blocks: (B:10:0x002c, B:12:0x0034, B:15:0x003e, B:17:0x0049, B:19:0x0051, B:22:0x0063, B:24:0x0070, B:25:0x0076, B:36:0x008b, B:37:0x0097), top: B:44:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[Catch: all -> 0x0082, ۫ۤۘ -> 0x0085, TryCatch #0 {all -> 0x0082, blocks: (B:10:0x002c, B:12:0x0034, B:15:0x003e, B:17:0x0049, B:19:0x0051, B:22:0x0063, B:24:0x0070, B:25:0x0076, B:36:0x008b, B:37:0x0097), top: B:44:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[PHI: r11
      0x007e: PHI (r11v3 l.᩸۟᩺) = (r11v2 l.᩸۟᩺), (r11v5 l.᩸۟᩺) binds: [B:26:0x007c, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0083: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:29:0x0083 */
    @Override // l.AbstractC6299
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC22664 mo8632(C14479 c14479) throws Throwable {
        AbstractC22664 abstractC22664Mo30220;
        C14769 c14769;
        AbstractC22664 abstractC22664Mo31585;
        AbstractC22664 abstractC22664Mo4039 = mo4039();
        C14479 c14479Mo4040 = mo4040(c14479);
        if (abstractC22664Mo4039 != null && abstractC22664Mo4039.m51067(EnumC21172.METHOD) && abstractC22664Mo4039.mo18049()) {
            C6326 c6326 = (C6326) abstractC22664Mo4039;
            C3168 c3168 = c6326.f21435;
            C1083 c1083 = c6326.f21437;
            C14528 c14528 = c6326.f21434;
            C2596 c2596 = c6326.f21436;
            C14769 c147610 = null;
            C1083 c1084 = new C1083(null);
            try {
                try {
                    C14769 c14769M8706 = c2596.m8706();
                    try {
                        boolean zM4084 = c1083.m4084(EnumC19876.UNCHECKED);
                        if (!zM4084) {
                            boolean zM35057 = c14528.m35057(c6326.f75156, c14479Mo4040, c2596);
                            InterfaceC1013 interfaceC1013 = c14479Mo4040.f45571;
                            C2596 c2596M8691 = zM35057 ? c2596.m8691(C14528.m35048(c14528, c6326), false, c1083) : c2596;
                            abstractC22664Mo30220 = c14528.m35061(c3168.f10273, c14479Mo4040, c6326, c2596M8691);
                            if (zM35057) {
                                c2596M8691.m8698(interfaceC1013.mo2276(), interfaceC1013.mo2277().m13378());
                                if (c14769M8706 != null) {
                                    c2596.m8705(c14769M8706);
                                }
                            } else {
                                c2596.m8697(c1084);
                                abstractC22664Mo31585 = c2596.m8696(c6326).mo31585();
                                if (zM4084) {
                                    abstractC22664Mo31585 = c14528.f45697.m55132(abstractC22664Mo31585);
                                }
                                abstractC22664Mo30220 = c14479Mo4040.mo30220(c3168.f10273, abstractC22664Mo31585);
                                if (c14769M8706 != null) {
                                    c2596.m8705(c14769M8706);
                                }
                            }
                        } else {
                            c2596.m8697(c1084);
                            abstractC22664Mo31585 = c2596.m8696(c6326).mo31585();
                            if (zM4084) {
                                abstractC22664Mo31585 = c14528.f45697.m55132(abstractC22664Mo31585);
                            }
                            abstractC22664Mo30220 = c14479Mo4040.mo30220(c3168.f10273, abstractC22664Mo31585);
                            if (c14769M8706 != null) {
                                c2596.m8705(c14769M8706);
                            }
                        }
                    } catch (C13037 e) {
                        e = e;
                        c14479Mo4040.f45571.mo3910(null, e.mo32459());
                        C11972.m30019();
                        throw null;
                    }
                } catch (Throwable th) {
                    th = th;
                    c147610 = c14769;
                    if (c147610 != null) {
                        c2596.m8705(c147610);
                    }
                    throw th;
                }
            } catch (C13037 e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                if (c147610 != null) {
                    c2596.m8705(c147610);
                }
                throw th;
            }
        } else {
            AbstractC22295 abstractC22295 = this.f28301;
            abstractC22295.getClass();
            abstractC22664Mo30220 = c14479Mo4040.mo30220(abstractC22295, this.f21366.f26659);
        }
        this.f21368.put(c14479Mo4040, abstractC22664Mo30220);
        return abstractC22664Mo30220;
    }
}
