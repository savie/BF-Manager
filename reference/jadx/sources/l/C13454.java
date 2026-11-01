package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.۬᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13454 extends AbstractC4306 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC4280 f44506;

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۙ */
    public final void mo10348(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13454(RunnableC4280 runnableC4280, C21920 c21920) {
        super(c21920);
        this.f44506 = runnableC4280;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۘ */
    public final void mo11186(int i) {
        RunnableC4280 runnableC4280 = this.f44506;
        runnableC4280.f15425 = (InterfaceC2557) runnableC4280.f15423.get(i);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩹ */
    public final ISequentialOutStream mo11194() {
        RunnableC4280 runnableC4280 = this.f44506;
        final InterfaceC2557 interfaceC2557 = runnableC4280.f15425;
        int iMin = (int) Math.min(1048576L, interfaceC2557.getSize());
        if (iMin < 1024) {
            iMin = 1024;
        }
        final C6479 c6479 = new C6479(iMin);
        InterfaceC10983 interfaceC10983M3436 = C0834.m3436(c6479.m17673());
        runnableC4280.f15426 = interfaceC10983M3436;
        ExecutorService executorService = runnableC4280.f15422;
        final InterfaceC1914 interfaceC1914 = runnableC4280.f15427;
        runnableC4280.f15421 = executorService.submit(new Runnable() { // from class: l.֨᩻᩹
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1914 interfaceC1915 = interfaceC1914;
                InterfaceC2557 interfaceC2558 = interfaceC2557;
                InputStream inputStreamMo16433 = C0834.m3437(c6479.m17674()).mo16433();
                try {
                    interfaceC1915.mo6226(interfaceC2558, inputStreamMo16433);
                } catch (Throwable th) {
                    C19431.m44468(inputStreamMo16433);
                    if (interfaceC1915.mo6227(th instanceof IOException ? th : new IOException(th))) {
                        return;
                    }
                    this.f5945.f44506.f15428 = true;
                }
            }
        });
        return new C1188(interfaceC10983M3436);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩶ */
    public final void mo11193() {
        RunnableC4280 runnableC4280 = this.f44506;
        InterfaceC10983 interfaceC10983 = runnableC4280.f15426;
        if (interfaceC10983 != null) {
            C19431.m44468(interfaceC10983);
            runnableC4280.f15426 = null;
        }
        Future future = runnableC4280.f15421;
        if (future != null) {
            try {
                future.get(1L, TimeUnit.HOURS);
            } catch (Exception unused) {
            }
            runnableC4280.f15421 = null;
        }
    }

    @Override // l.AbstractC4306, l.InterfaceC9868
    /* JADX INFO: renamed from: ۧ */
    public final void mo11188() {
        mo11193();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۨ */
    public final void mo10349() {
        this.f44506.f15428 = true;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        RunnableC4280 runnableC4280 = this.f44506;
        return runnableC4280.f15428 || runnableC4280.f15427.mo2357();
    }
}
