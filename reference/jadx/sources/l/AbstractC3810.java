package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N989 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3810 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12984 f14143;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f14144;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract long mo11096();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo11097(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo11098(long j);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract int mo11100();

    public AbstractC3810(AbstractC20745 abstractC20745, InterfaceC12984 interfaceC12984) {
        this.f14144 = abstractC20745;
        this.f14143 = interfaceC12984;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035 A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[Catch: IOException -> 0x004b, TryCatch #2 {IOException -> 0x004b, blocks: (B:17:0x002b, B:19:0x0035, B:21:0x003b, B:24:0x0044, B:25:0x0047), top: B:35:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m11099() {
        int iMo11100;
        long jMo11096;
        AbstractC20745 abstractC20745 = this.f14144;
        InterfaceC12984 interfaceC12984 = this.f14143;
        try {
            interfaceC12984.mo19602(abstractC20745, 0);
        } catch (IOException e) {
            if (!abstractC20745.mo33975() || !interfaceC12984.mo19603(e)) {
                throw e;
            }
            try {
                iMo11100 = mo11100();
                int i = iMo11100 | 146;
                if (iMo11100 != i) {
                    try {
                        mo11097(i);
                        interfaceC12984.mo19602(abstractC20745, 1);
                        mo11097(iMo11100);
                        return;
                    } catch (IOException unused) {
                        jMo11096 = mo11096();
                        if (abstractC20745.mo24644()) {
                            throw e;
                        }
                        interfaceC12984.mo19602(abstractC20745, 2);
                        if (iMo11100 != -1) {
                            mo11097(iMo11100);
                        }
                        if (jMo11096 != -1) {
                            mo11098(jMo11096);
                        }
                        C5553.m15317(abstractC20745);
                    }
                }
            } catch (IOException unused2) {
                iMo11100 = -1;
            }
            try {
                jMo11096 = mo11096();
                if (abstractC20745.mo24644()) {
                    throw e;
                }
                interfaceC12984.mo19602(abstractC20745, 2);
                if (iMo11100 != -1) {
                    mo11097(iMo11100);
                }
                if (jMo11096 != -1) {
                    mo11098(jMo11096);
                }
                C5553.m15317(abstractC20745);
            } catch (IOException unused3) {
                throw e;
            }
        }
    }
}
