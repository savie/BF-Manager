package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܶᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72R */
/* JADX INFO: loaded from: classes5.dex */
public class C16269 extends AbstractC16610 implements InterfaceC6028 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final Semaphore f52858 = new Semaphore(1, true);

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final C16503 f52859 = ConcurrentMapC17249.newKeySet();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public volatile long f52860;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f52861 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public volatile String f52862;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2530(AbstractActivityC17204 abstractActivityC17204, C12187 c12187, boolean z) {
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46049;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        String str = this.f52862;
        return str == null ? m43865("archiveName") : str;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        m43859(R.string.MT_Protector);
        mo16839(0);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() {
        C12187 c12187M30468;
        String strM49088;
        try {
            if (m43830().containsKey("sourceTempLease")) {
                this.f52860 = m43855("sourceTempLease");
            }
            AbstractC7629 abstractC7629M43838 = m43838();
            String strM22298 = C8265.m22298(abstractC7629M43838);
            C16503 c16503 = f52859;
            if (!c16503.add(strM22298)) {
                String strM49089 = C21576.m49088(R.string.MT_Protector);
                this.f52862 = strM49089;
                C12187 c12187M30466 = C12187.m30466(strM49089);
                m38600();
                return c12187M30466;
            }
            try {
                Semaphore semaphore = f52858;
                boolean zTryAcquire = semaphore.tryAcquire();
                if (!zTryAcquire) {
                    String strM490810 = C21576.m49088(R.string.MT_Protector);
                    this.f52862 = strM490810;
                    C12187 c12187M30467 = C12187.m30466(strM490810);
                    if (zTryAcquire) {
                        semaphore.release();
                    }
                    c16503.remove(strM22298);
                    m38600();
                    return c12187M30467;
                }
                try {
                    C9755 c9755M22301 = C8265.m22301(abstractC7629M43838);
                    C20944 c20944M22287 = C8265.m22287(abstractC7629M43838, this);
                    if (c20944M22287.m47879() != EnumC0807.CANCELED && !m38601()) {
                        if (!c9755M22301.m25430(abstractC7629M43838)) {
                            String strM490811 = C21576.m49088(R.string.MT_Protector);
                            this.f52862 = strM490811;
                            C12187 c12187M30469 = C12187.m30466(strM490811);
                            if (zTryAcquire) {
                                semaphore.release();
                            }
                            c16503.remove(strM22298);
                            m38600();
                            return c12187M30469;
                        }
                        int i = C17761.f58327[c20944M22287.m47879().ordinal()];
                        if (i == 1) {
                            c12187M30468 = C12187.m30468();
                        } else if (i != 2) {
                            if (i == 3) {
                                strM49088 = c20944M22287.m47878() == null ? C21576.m49088(R.string.MT_Protector) : C21576.m49059(R.string.MT_Protector, c20944M22287.m47878());
                                this.f52862 = strM49088;
                            } else if (i == 4) {
                                strM49088 = C21576.m49088(R.string.MT_Protector);
                                this.f52862 = strM49088;
                            } else {
                                if (i != 5) {
                                    throw new IncompatibleClassChangeError();
                                }
                                Exception iOException = c20944M22287.m47880() == null ? new IOException("Archive test failed") : c20944M22287.m47880();
                                this.f52862 = iOException.getMessage();
                                c12187M30468 = C12187.m30465(iOException);
                            }
                            c12187M30468 = C12187.m30466(strM49088);
                        } else {
                            c12187M30468 = C12187.m30469();
                        }
                        if (zTryAcquire) {
                            semaphore.release();
                        }
                        c16503.remove(strM22298);
                        m38600();
                        return c12187M30468;
                    }
                    C12187 c12187M304610 = C12187.m30469();
                    if (zTryAcquire) {
                        semaphore.release();
                    }
                    c16503.remove(strM22298);
                    m38600();
                    return c12187M304610;
                } catch (IOException unused) {
                    String strM490812 = C21576.m49088(R.string.MT_Protector);
                    this.f52862 = strM490812;
                    C12187 c12187M304611 = C12187.m30466(strM490812);
                    if (zTryAcquire) {
                        f52858.release();
                    }
                    f52859.remove(strM22298);
                    m38600();
                    return c12187M304611;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    f52858.release();
                }
                f52859.remove(strM22298);
                throw th;
            }
        } catch (Throwable th2) {
            m38600();
            throw th2;
        }
    }

    @Override // l.AbstractC18900
    public final void cancel() {
        this.f52861.set(true);
        super.cancel();
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38601() {
        return this.f52861.get() || mo924();
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    private void m38600() {
        long j = this.f52860;
        if (j != 0) {
            this.f52860 = 0L;
            AbstractC7364.m20184(j);
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        m38600();
        if (c12187.m30474()) {
            C22673.m51152(R.string.MT_Protector);
        }
    }
}
