package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC20649 extends C6479 implements Runnable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f66217;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC15976 f66218;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 f66219;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14769 f66220;

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC20649(C11172 c11172, AbstractC11781 abstractC11781, C14769 c14769) {
        this.f66217 = c11172;
        AbstractC11781 abstractC11782 = c11172.f35192;
        super(c11172, abstractC11782.f38066 == EnumC13603.f43218 ? abstractC11782.m29558() : (C24550) abstractC11782);
        if (abstractC11781.f38066 == EnumC13603.f43213) {
            AbstractC11781 abstractC11783 = abstractC11781.f38069;
            if (abstractC11783.f38066 == EnumC13603.f43214) {
                this.f66219 = abstractC11783;
            } else {
                this.f66219 = abstractC11781;
            }
        } else {
            this.f66219 = abstractC11781;
        }
        this.f66220 = c14769;
        this.f66218 = c11172.f35182;
    }

    public void run() {
        AbstractC11781 abstractC11781;
        C11172 c11172 = this.f66217;
        InterfaceC15976 interfaceC15976 = c11172.f35182;
        C14764 c14764 = c11172.f35200;
        try {
            c11172.f35182 = this.f66218;
            C18499 c18499 = new C18499();
            for (C14769 c14769 = this.f66220; c14769.m35550(); c14769 = c14769.f48336) {
                c18499.m43089(m18311((C7970) c14769.f48335));
            }
            C14769 c14769M43093 = c18499.m43093();
            Iterator it = c14769M43093.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                abstractC11781 = this.f66219;
                if (!zHasNext) {
                    break;
                }
                C23892 c23892 = (C23892) it.next();
                if (c23892.f69124.f73596 == c14764.f48258.f73596) {
                    abstractC11781.f38071 |= 18014398509613056L;
                    AbstractC21654 abstractC21654M53392 = c23892.m53392(c11172.f35209.f49803);
                    if (abstractC21654M53392 instanceof C3754) {
                        C3754 c3754 = (C3754) abstractC21654M53392;
                        if (c3754.f69124 == c14764.f48255 && ((Integer) c3754.f12872).intValue() != 0) {
                            abstractC11781.f38071 |= 36028797018963968L;
                        }
                    }
                }
            }
            if (abstractC11781.m29563()) {
                abstractC11781.m29585(c14769M43093);
            } else {
                abstractC11781.m29566(c14769M43093);
            }
            c11172.f35182 = interfaceC15976;
        } catch (Throwable th) {
            c11172.f35182 = interfaceC15976;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" ClassReader annotate ");
        AbstractC11781 abstractC11781 = this.f66219;
        sb.append(abstractC11781.f38069);
        sb.append(".");
        sb.append(abstractC11781);
        sb.append(" with ");
        sb.append(this.f66220);
        return sb.toString();
    }
}
