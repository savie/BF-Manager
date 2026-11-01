package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC2545 extends C22302 implements Runnable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 f10062;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f10063;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 f10064;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21825 f10065;

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC2545(C0429 c0429, AbstractC23903 abstractC23903, C21825 c21825) {
        this.f10063 = c0429;
        AbstractC23903 abstractC23904 = c0429.f1964;
        super(c0429, abstractC23904.f77452 == EnumC10477.f35879 ? abstractC23904.m52720() : (C22492) abstractC23904);
        if (abstractC23903.f77452 == EnumC10477.f35865) {
            AbstractC23903 abstractC23905 = abstractC23903.f77448;
            if (abstractC23905.f77452 == EnumC10477.f35868) {
                this.f10062 = abstractC23905;
            } else {
                this.f10062 = abstractC23903;
            }
        } else {
            this.f10062 = abstractC23903;
        }
        this.f10065 = c21825;
        this.f10064 = c0429.f1975;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC23903 abstractC23903;
        C0429 c0429 = this.f10063;
        InterfaceC2173 interfaceC2173 = c0429.f1975;
        C3836 c3836 = c0429.f1991;
        try {
            c0429.f1975 = this.f10064;
            C19003 c19003 = new C19003();
            for (C21825 c21825 = this.f10065; c21825.m48595(); c21825 = c21825.f70877) {
                c19003.m43723(m49464((C21596) c21825.f70876));
            }
            C21825 c21825M43726 = c19003.m43726();
            Iterator it = c21825M43726.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                abstractC23903 = this.f10062;
                if (!zHasNext) {
                    break;
                }
                C11867 c11867 = (C11867) it.next();
                if (c11867.f75167.f53222 == c3836.f14253.f53222) {
                    abstractC23903.f77447 |= 18014398509613056L;
                    AbstractC23156 abstractC23156M29574 = c11867.m29574(c0429.f1987.f77568);
                    if (abstractC23156M29574 instanceof C2693) {
                        C2693 c2693 = (C2693) abstractC23156M29574;
                        if (c2693.f75167 == c3836.f14263 && ((Integer) c2693.f10382).intValue() != 0) {
                            abstractC23903.f77447 |= 36028797018963968L;
                        }
                    }
                }
            }
            if (abstractC23903.m52723()) {
                abstractC23903.m52726(c21825M43726);
            } else {
                abstractC23903.m52703(c21825M43726);
            }
            c0429.f1975 = interfaceC2173;
        } catch (Throwable th) {
            c0429.f1975 = interfaceC2173;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" ClassReader annotate ");
        AbstractC23903 abstractC23903 = this.f10062;
        sb.append(abstractC23903.f77448);
        sb.append(".");
        sb.append(abstractC23903);
        sb.append(" with ");
        sb.append(this.f10065);
        return sb.toString();
    }
}
