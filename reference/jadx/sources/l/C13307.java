package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.۫ᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13307 extends AbstractC7217 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC5850 f42480;

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۙ */
    public final void mo7309(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13307(RunnableC5850 runnableC5850, C17036 c17036) {
        super(c17036);
        this.f42480 = runnableC5850;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ֫ */
    public final void mo7308(int i) {
        RunnableC5850 runnableC5850 = this.f42480;
        runnableC5850.f20083 = (InterfaceC2386) runnableC5850.f20080.get(i);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo7311() {
        RunnableC5850 runnableC5850 = this.f42480;
        final InterfaceC2386 interfaceC2386 = runnableC5850.f20083;
        int iMin = (int) Math.min(1048576L, interfaceC2386.getSize());
        if (iMin < 1024) {
            iMin = 1024;
        }
        final C0387 c0387 = new C0387(iMin);
        InterfaceC11573 interfaceC11573M35106 = C14556.m35106(c0387.m2193());
        runnableC5850.f20079 = interfaceC11573M35106;
        ExecutorService executorService = runnableC5850.f20082;
        final InterfaceC0171 interfaceC0171 = runnableC5850.f20085;
        runnableC5850.f20084 = executorService.submit(new Runnable() { // from class: l.ܳᩴ۫
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC0171 interfaceC0172 = interfaceC0171;
                InterfaceC2386 interfaceC2387 = interfaceC2386;
                InputStream inputStreamMo4183 = C14556.m35108(c0387.m2194()).mo4183();
                try {
                    interfaceC0172.mo1452(interfaceC2387, inputStreamMo4183);
                } catch (Throwable th) {
                    C20244.m46520(inputStreamMo4183);
                    if (interfaceC0172.mo1453(th instanceof IOException ? th : new IOException(th))) {
                        return;
                    }
                    this.f50562.f42480.f20086 = true;
                }
            }
        });
        return new C6007(4, interfaceC11573M35106);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩶ */
    public final void mo7312() {
        RunnableC5850 runnableC5850 = this.f42480;
        InterfaceC11573 interfaceC11573 = runnableC5850.f20079;
        if (interfaceC11573 != null) {
            C20244.m46520(interfaceC11573);
            runnableC5850.f20079 = null;
        }
        Future future = runnableC5850.f20084;
        if (future != null) {
            try {
                future.get(1L, TimeUnit.HOURS);
            } catch (Exception unused) {
            }
            runnableC5850.f20084 = null;
        }
    }

    @Override // l.AbstractC7217, l.InterfaceC2742
    /* JADX INFO: renamed from: ֨ */
    public final void mo9088() {
        mo7312();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7313() {
        this.f42480.f20086 = true;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        RunnableC5850 runnableC5850 = this.f42480;
        return runnableC5850.f20086 || runnableC5850.f20085.mo924();
    }
}
