package l;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17406 extends AbstractC20229 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20311 f55390;

    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #4 {all -> 0x00a7, blocks: (B:38:0x00b8, B:40:0x00c8, B:28:0x0098, B:37:0x00af), top: B:46:0x0002 }] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized int m40574() {
        int iM23028;
        try {
            try {
                Iterator it = this.f76671.iterator();
                iM23028 = 0;
                while (it.hasNext()) {
                    try {
                        ((C18111) this.f76669).mo2153((InterfaceC1260) it.next());
                        C14441 c14441 = new C14441((C18111) this.f76669, this.f55390);
                        c14441.m34788();
                        c14441.m34787();
                        if (((C8878) ((C18111) this.f76669).m2163()).m23026(EnumC15934.ERROR) > 0) {
                            break;
                        }
                        for (C9398 c9398 : c14441.m34795()) {
                            String str = c9398.f31843;
                            InterfaceC10434 interfaceC10434M2144 = ((C18111) this.f76669).m2144();
                            interfaceC10434M2144.mo18525(str, C11521.of(c9398.f31838), this.f76669);
                            c9398.m24126(interfaceC10434M2144);
                            interfaceC10434M2144.mo18529(str);
                        }
                        if (!((C8878) ((C18111) this.f76669).m2163()).m23024()) {
                            iM23028 += ((C8878) ((C18111) this.f76669).m2163()).m23028();
                        }
                    } catch (IOException e) {
                        e = e;
                        ((C18111) this.f76669).m2165(e);
                        iM23028++;
                    } catch (Error e2) {
                        e = e2;
                        ((C18111) this.f76669).m2165(e);
                        iM23028++;
                    } catch (URISyntaxException e3) {
                        e = e3;
                        ((C18111) this.f76669).m2165(e);
                        iM23028++;
                    } catch (Throwable th) {
                        th = th;
                        ((C18111) this.f76669).m2165(th);
                        ((C18111) this.f76669).m2151(th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (IOException e4) {
            e = e4;
            iM23028 = 0;
            ((C18111) this.f76669).m2165(e);
            iM23028++;
            if (!((C8878) ((C18111) this.f76669).m2163()).m23024()) {
                iM23028 += ((C8878) ((C18111) this.f76669).m2163()).m23028();
            }
            return iM23028;
        } catch (Error e5) {
            e = e5;
            iM23028 = 0;
            ((C18111) this.f76669).m2165(e);
            iM23028++;
            if (!((C8878) ((C18111) this.f76669).m2163()).m23024()) {
                iM23028 += ((C8878) ((C18111) this.f76669).m2163()).m23028();
            }
            return iM23028;
        } catch (URISyntaxException e6) {
            e = e6;
            iM23028 = 0;
            ((C18111) this.f76669).m2165(e);
            iM23028++;
            if (!((C8878) ((C18111) this.f76669).m2163()).m23024()) {
                iM23028 += ((C8878) ((C18111) this.f76669).m2163()).m23028();
            }
            return iM23028;
        } catch (Throwable th3) {
            th = th3;
            iM23028 = 0;
        }
        if (!((C8878) ((C18111) this.f76669).m2163()).m23024()) {
            iM23028 += ((C8878) ((C18111) this.f76669).m2163()).m23028();
        }
        return iM23028;
    }

    public C17406(C6905 c6905, C16078 c16078, C5494 c5494) {
        super(c6905, c16078);
        this.f55390 = new C20311();
        this.f76671.add(c5494);
    }
}
