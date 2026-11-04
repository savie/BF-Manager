package l;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13405 extends AbstractC11167 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22824 f42710;

    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #4 {all -> 0x00a7, blocks: (B:38:0x00b8, B:40:0x00c8, B:28:0x0098, B:37:0x00af), top: B:46:0x0002 }] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized int m33046() {
        int iM14631;
        try {
            try {
                Iterator it = this.f56602.iterator();
                iM14631 = 0;
                while (it.hasNext()) {
                    try {
                        ((C1122) this.f56600).mo4161((InterfaceC18152) it.next());
                        C16168 c16168 = new C16168((C1122) this.f56600, this.f42710);
                        c16168.m38384();
                        c16168.m38400();
                        if (((C4728) ((C1122) this.f56600).m32312()).m14630(EnumC19644.ERROR) > 0) {
                            break;
                        }
                        for (C17355 c17355 : c16168.m38391()) {
                            String str = c17355.f56476;
                            InterfaceC13676 interfaceC13676M32306 = ((C1122) this.f56600).m32306();
                            interfaceC13676M32306.mo3880(str, C15867.of(c17355.f56490), this.f56600);
                            c17355.m40766(interfaceC13676M32306);
                            interfaceC13676M32306.mo3883(str);
                        }
                        if (!((C4728) ((C1122) this.f56600).m32312()).m14633()) {
                            iM14631 += ((C4728) ((C1122) this.f56600).m32312()).m14631();
                        }
                    } catch (IOException e) {
                        e = e;
                        ((C1122) this.f56600).m32313(e);
                        iM14631++;
                    } catch (Error e2) {
                        e = e2;
                        ((C1122) this.f56600).m32313(e);
                        iM14631++;
                    } catch (URISyntaxException e3) {
                        e = e3;
                        ((C1122) this.f56600).m32313(e);
                        iM14631++;
                    } catch (Throwable th) {
                        th = th;
                        ((C1122) this.f56600).m32313(th);
                        ((C1122) this.f56600).m32298(th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (IOException e4) {
            e = e4;
            iM14631 = 0;
            ((C1122) this.f56600).m32313(e);
            iM14631++;
            if (!((C4728) ((C1122) this.f56600).m32312()).m14633()) {
                iM14631 += ((C4728) ((C1122) this.f56600).m32312()).m14631();
            }
            return iM14631;
        } catch (Error e5) {
            e = e5;
            iM14631 = 0;
            ((C1122) this.f56600).m32313(e);
            iM14631++;
            if (!((C4728) ((C1122) this.f56600).m32312()).m14633()) {
                iM14631 += ((C4728) ((C1122) this.f56600).m32312()).m14631();
            }
            return iM14631;
        } catch (URISyntaxException e6) {
            e = e6;
            iM14631 = 0;
            ((C1122) this.f56600).m32313(e);
            iM14631++;
            if (!((C4728) ((C1122) this.f56600).m32312()).m14633()) {
                iM14631 += ((C4728) ((C1122) this.f56600).m32312()).m14631();
            }
            return iM14631;
        } catch (Throwable th3) {
            th = th3;
            iM14631 = 0;
        }
        if (!((C4728) ((C1122) this.f56600).m32312()).m14633()) {
            iM14631 += ((C4728) ((C1122) this.f56600).m32312()).m14631();
        }
        return iM14631;
    }

    public C13405(C7711 c7711, C10889 c10889, C14422 c14422) {
        super(c7711, c10889);
        this.f42710 = new C22824();
        this.f56602.add(c14422);
    }
}
