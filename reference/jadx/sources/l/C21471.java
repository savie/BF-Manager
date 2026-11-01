package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩸ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21471 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C17239 f69783;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C1777 f69784;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13752 f69785;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C22218 f69786;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1715 f69787 = new C1715();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f69788;

    public C21471(C13752 c13752, AbstractC20745 abstractC20745) {
        this.f69785 = c13752;
        this.f69788 = abstractC20745;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C13752 c13752 = this.f69785;
        C1777 c1777 = new C1777(c13752.f45340);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832(c13752.getFileName());
        c1777.mo5827(new View.OnClickListener() { // from class: l.᩺ۡۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74421.f69784.m5825();
            }
        });
        c1777.mo5843();
        this.f69784 = c1777;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0221  */
    /* JADX WARN: Code duplicated, block: B:72:0x0225  */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987, InterruptedException {
        C22218 c22218;
        C18310 c18310M43738;
        C1715 c1715 = this.f69787;
        C13752 c13752 = this.f69785;
        C3872.m11212(c13752.f45343, c13752.f45344);
        boolean z = false;
        String strM41209 = C17687.m41209(false);
        if (strM41209 == null) {
            strM41209 = "su";
        }
        C17239 c17239 = new C17239(strM41209, false);
        this.f69783 = c17239;
        C14726.m35255(c17239, "0", c13752.f45342);
        AbstractC20745 abstractC20745 = this.f69788;
        abstractC20745.m46739();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C5464.f18831);
        try {
            C2455 c2455 = new C2455(c13752.f45343);
            try {
                c1715.m5709(c2455, c13752.f45344);
                ArrayList<C12107> arrayList = c1715.f6777;
                ArrayList<C12107> arrayList2 = c1715.f6775;
                this.f69784.m5837(R.string.MT_Protector);
                C8516 c8516 = new C8516(c1715.f6778);
                c8516.m22241(new InterfaceC21921() { // from class: l.ܶۡۚ
                    @Override // l.InterfaceC21921
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo1855(int i) {
                        C21471 c21471 = this.f49395;
                        c21471.f69784.m5840(i);
                        if (i == 100) {
                            c21471.f69784.m5833(true);
                        }
                    }
                });
                this.f69786 = new C22218(c2455.m7483(), c8516);
                for (C12107 c12107 : arrayList2) {
                    executorServiceNewFixedThreadPool.submit(new RunnableC1050(this.f69786, c12107, abstractC20745.m46690(C5553.m15307(c12107.getName(), z)), true));
                    z = false;
                }
                String strM48090 = m48090("pm install-create -r -d " + C14726.m35257(c13752.f45342));
                if (!strM48090.contains("Success")) {
                    throw new Exception(strM48090);
                }
                Matcher matcher = Pattern.compile("\\[(\\d+)]").matcher(strM48090);
                if (!matcher.find()) {
                    throw new Exception(strM48090);
                }
                int i = Integer.parseInt(matcher.group(1));
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    try {
                        RunnableC1050 runnableC1050 = (RunnableC1050) this.f69786.f72656.poll(500L, TimeUnit.MILLISECONDS);
                        if (runnableC1050 != null) {
                            AbstractC20745 abstractC20746 = runnableC1050.f4861;
                            String strM18085 = C6696.m18085(abstractC20746.mo33986());
                            long jMo33964 = abstractC20746.mo33964();
                            String name = abstractC20746.getName();
                            if (c1715.f6776 == null && (c18310M43738 = C19016.m43738(abstractC20746)) != null) {
                                c1715.f6776 = c18310M43738.m42535();
                            }
                            String strM48091 = m48090("cat " + strM18085 + " | pm install-write -S " + jMo33964 + " " + i + " " + name);
                            abstractC20746.mo24647();
                            if (!strM48091.contains("Success")) {
                                throw new Exception(strM48091);
                            }
                            i2++;
                        } else {
                            C22218 c22219 = this.f69786;
                            if (c22219.f72660) {
                                throw new CancellationException();
                            }
                            c22219.m49333();
                        }
                        arrayList2 = arrayList2;
                    } catch (Exception e) {
                        m48090("pm install-abandon " + i);
                        throw e;
                    }
                }
                this.f69786.m49333();
                C3872.m11208(m48090("pm install-commit " + i));
                if (!arrayList.isEmpty()) {
                    this.f69784.m5833(false);
                    C22218 c222110 = this.f69786;
                    C8516 c8517 = new C8516(c1715.f6774);
                    C1777 c1777 = this.f69784;
                    C13638.requireNonNull(c1777);
                    c8517.m22241(new C1438(c1777));
                    c222110.f72659 = c8517;
                    for (C12107 c12108 : arrayList) {
                        executorServiceNewFixedThreadPool.submit(new RunnableC1050(this.f69786, c12108, C11904.f39934.m46690(C5553.m15307(c12108.getName(), false)), false));
                    }
                    C4716.m13052(executorServiceNewFixedThreadPool);
                    this.f69786.m49333();
                }
                c2455.close();
                if (executorServiceNewFixedThreadPool.isShutdown()) {
                    return;
                }
                C22218 c222111 = this.f69786;
                if (c222111 != null) {
                    c222111.f72660 = true;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
                return;
            } catch (Throwable th) {
                try {
                    c2455.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (!executorServiceNewFixedThreadPool.isShutdown()) {
                c22218 = this.f69786;
                if (c22218 != null) {
                    c22218.f72660 = true;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
            }
            throw th3;
        }
        if (!executorServiceNewFixedThreadPool.isShutdown()) {
            c22218 = this.f69786;
            if (c22218 != null) {
                c22218.f72660 = true;
            }
            executorServiceNewFixedThreadPool.shutdownNow();
            executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m48090(String str) {
        C17239 c17239 = this.f69783;
        c17239.getClass();
        return c17239.mo2026(0L, str).m16220();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f69784.m5824()) {
            return;
        }
        C13752 c13752 = this.f69785;
        C3872.m11209(c13752.f45340, c13752.getFileName(), this.f69787.f6776);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (exc instanceof CancellationException) {
            return;
        }
        this.f69785.m33509(exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f69784.m5825();
        this.f69788.mo24647();
        C17239 c17239 = this.f69783;
        if (c17239 != null) {
            c17239.close();
        }
    }
}
