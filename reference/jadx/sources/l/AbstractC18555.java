package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N989 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18555 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21539 f60284;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f60285;

    /* JADX INFO: renamed from: ۙ */
    public abstract long mo23590();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23591(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23592(long j);

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo23593();

    public AbstractC18555(AbstractC22044 abstractC22044, InterfaceC21539 interfaceC21539) {
        this.f60285 = abstractC22044;
        this.f60284 = interfaceC21539;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035 A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43134() {
        int iMo23593;
        long jMo23590;
        AbstractC22044 abstractC22044 = this.f60285;
        InterfaceC21539 interfaceC21539 = this.f60284;
        try {
            interfaceC21539.mo15009(abstractC22044, 0);
        } catch (IOException e) {
            if (!abstractC22044.mo2934() || !interfaceC21539.mo15010(e)) {
                throw e;
            }
            try {
                iMo23593 = mo23593();
                int i = iMo23593 | 146;
                if (iMo23593 != i) {
                    try {
                        mo23591(i);
                        interfaceC21539.mo15009(abstractC22044, 1);
                        mo23591(iMo23593);
                        return;
                    } catch (IOException unused) {
                        jMo23590 = mo23590();
                        if (abstractC22044.mo4287()) {
                            throw e;
                        }
                        interfaceC21539.mo15009(abstractC22044, 2);
                        if (iMo23593 != -1) {
                            mo23591(iMo23593);
                        }
                        if (jMo23590 != -1) {
                            mo23592(jMo23590);
                        }
                        C14584.m35196(abstractC22044);
                    }
                }
            } catch (IOException unused2) {
                iMo23593 = -1;
            }
            try {
                jMo23590 = mo23590();
                if (abstractC22044.mo4287()) {
                    throw e;
                }
                interfaceC21539.mo15009(abstractC22044, 2);
                if (iMo23593 != -1) {
                    mo23591(iMo23593);
                }
                if (jMo23590 != -1) {
                    mo23592(jMo23590);
                }
                C14584.m35196(abstractC22044);
            } catch (IOException unused3) {
                throw e;
            }
        }
    }
}
