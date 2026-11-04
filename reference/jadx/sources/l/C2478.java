package l;

import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۖۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2478 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10745 f7937;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21649 f7938;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6733 f7939;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1790 f7940;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23887 f7941 = new C23887();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f7942;

    public C2478(C6733 c6733, AbstractC22044 abstractC22044) {
        this.f7939 = c6733;
        this.f7942 = abstractC22044;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C6733 c6733 = this.f7939;
        C10745 c10745 = new C10745(c6733.f22436);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393(c6733.getFileName());
        c10745.mo25915(new View.OnClickListener() { // from class: l.֨ۛᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3584.f7937.m27405();
            }
        });
        c10745.mo25931();
        this.f7937 = c10745;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0221  */
    /* JADX WARN: Code duplicated, block: B:72:0x0225  */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws InterruptedException, IOException, C4866 {
        C21649 c21649;
        C11381 c11381M55329;
        C23887 c23887 = this.f7941;
        C6733 c6733 = this.f7939;
        C8224.m22125(c6733.f22440, c6733.f22438);
        boolean z = false;
        String strM44123 = C19036.m44123(false);
        if (strM44123 == null) {
            strM44123 = "su";
        }
        C1790 c1790 = new C1790(strM44123, false);
        this.f7940 = c1790;
        C17394.m40857(c1790, "0", c6733.f22437);
        AbstractC22044 abstractC22044 = this.f7942;
        abstractC22044.m49853();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C11138.f35105);
        try {
            C22941 c22941 = new C22941(c6733.f22440);
            try {
                c23887.m53390(c22941, c6733.f22438);
                ArrayList<C8002> arrayList = c23887.f77359;
                ArrayList<C8002> arrayList2 = c23887.f77358;
                this.f7937.m27397(R.string.MT_Protector);
                C3374 c3374 = new C3374(c23887.f77361);
                c3374.m11078(new InterfaceC17544() { // from class: l.ۡۛᩴ
                    @Override // l.InterfaceC17544
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo1209(int i) {
                        C2478 c2478 = this.f29966;
                        c2478.f7937.m27403(i);
                        if (i == 100) {
                            c2478.f7937.m27394(true);
                        }
                    }
                });
                this.f7938 = new C21649(c22941.m51723(), c3374);
                for (C8002 c8002 : arrayList2) {
                    executorServiceNewFixedThreadPool.submit(new RunnableC18665(this.f7938, c8002, abstractC22044.m49876(C14584.m35187(c8002.getName(), z)), true));
                    z = false;
                }
                String strM8333 = m8333("pm install-create -r -d " + C17394.m40859(c6733.f22437));
                if (!strM8333.contains("Success")) {
                    throw new Exception(strM8333);
                }
                Matcher matcher = Pattern.compile("\\[(\\d+)]").matcher(strM8333);
                if (!matcher.find()) {
                    throw new Exception(strM8333);
                }
                int i = Integer.parseInt(matcher.group(1));
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    try {
                        RunnableC18665 runnableC18665 = (RunnableC18665) this.f7938.f69114.poll(500L, TimeUnit.MILLISECONDS);
                        if (runnableC18665 != null) {
                            AbstractC22044 abstractC22045 = runnableC18665.f60696;
                            String strM21098 = C7756.m21098(abstractC22045.mo4294());
                            long jMo4285 = abstractC22045.mo4285();
                            String name = abstractC22045.getName();
                            if (c23887.f77360 == null && (c11381M55329 = C24808.m55329(abstractC22045)) != null) {
                                c23887.f77360 = c11381M55329.m28718();
                            }
                            String strM8334 = m8333("cat " + strM21098 + " | pm install-write -S " + jMo4285 + " " + i + " " + name);
                            abstractC22045.mo4296();
                            if (!strM8334.contains("Success")) {
                                throw new Exception(strM8334);
                            }
                            i2++;
                        } else {
                            C21649 c216410 = this.f7938;
                            if (c216410.f69113) {
                                throw new CancellationException();
                            }
                            c216410.m49175();
                        }
                        arrayList2 = arrayList2;
                    } catch (Exception e) {
                        m8333("pm install-abandon " + i);
                        throw e;
                    }
                }
                this.f7938.m49175();
                C8224.m22121(m8333("pm install-commit " + i));
                if (!arrayList.isEmpty()) {
                    this.f7937.m27394(false);
                    C21649 c216411 = this.f7938;
                    C3374 c3375 = new C3374(c23887.f77362);
                    C10745 c10745 = this.f7937;
                    C17359.requireNonNull(c10745);
                    c3375.m11078(new C21151(c10745));
                    c216411.f69111 = c3375;
                    for (C8002 c8003 : arrayList) {
                        executorServiceNewFixedThreadPool.submit(new RunnableC18665(this.f7938, c8003, C6382.f21566.m49876(C14584.m35187(c8003.getName(), false)), false));
                    }
                    C5261.m15837(executorServiceNewFixedThreadPool);
                    this.f7938.m49175();
                }
                c22941.close();
                if (executorServiceNewFixedThreadPool.isShutdown()) {
                    return;
                }
                C21649 c216412 = this.f7938;
                if (c216412 != null) {
                    c216412.f69113 = true;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
                return;
            } catch (Throwable th) {
                try {
                    c22941.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (!executorServiceNewFixedThreadPool.isShutdown()) {
                c21649 = this.f7938;
                if (c21649 != null) {
                    c21649.f69113 = true;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
            }
            throw th3;
        }
        if (!executorServiceNewFixedThreadPool.isShutdown()) {
            c21649 = this.f7938;
            if (c21649 != null) {
                c21649.f69113 = true;
            }
            executorServiceNewFixedThreadPool.shutdownNow();
            executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m8333(String str) {
        C1790 c1790 = this.f7940;
        c1790.getClass();
        return c1790.mo6261(0L, str).m28854();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f7937.m27399()) {
            return;
        }
        C6733 c6733 = this.f7939;
        C8224.m22122(c6733.f22436, c6733.getFileName(), this.f7941.f77360);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (exc instanceof CancellationException) {
            return;
        }
        this.f7939.m18824(exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f7937.m27405();
        this.f7942.mo4296();
        C1790 c1790 = this.f7940;
        if (c1790 != null) {
            c1790.close();
        }
    }
}
