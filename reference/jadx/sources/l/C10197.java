package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۤۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72R */
/* JADX INFO: loaded from: classes4.dex */
public class C10197 extends AbstractC23941 implements InterfaceC12293 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final Semaphore f34829 = new Semaphore(1, true);

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final C4609 f34830 = ConcurrentMapC13783.newKeySet();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f34831 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public volatile long f34832;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public volatile String f34833;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo16350(AbstractActivityC12483 abstractActivityC12483, C5202 c5202, boolean z) {
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5719;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        String str = this.f34833;
        return str == null ? m41585("archiveName") : str;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        m41562(R.string.MT_Protector);
        mo21455(0);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() {
        C5202 c5202M14379;
        String strM39288;
        try {
            if (m41580().containsKey("sourceTempLease")) {
                this.f34832 = m41590("sourceTempLease");
            }
            AbstractC9677 abstractC9677M41560 = m41560();
            String strM15373 = C5567.m15373(abstractC9677M41560);
            C4609 c4609 = f34830;
            if (!c4609.add(strM15373)) {
                String strM39289 = C16737.m39288(R.string.MT_Protector);
                this.f34833 = strM39289;
                C5202 c5202M14376 = C5202.m14376(strM39289);
                m25971();
                return c5202M14376;
            }
            try {
                Semaphore semaphore = f34829;
                boolean zTryAcquire = semaphore.tryAcquire();
                if (!zTryAcquire) {
                    String strM392810 = C16737.m39288(R.string.MT_Protector);
                    this.f34833 = strM392810;
                    C5202 c5202M14377 = C5202.m14376(strM392810);
                    if (zTryAcquire) {
                        semaphore.release();
                    }
                    c4609.remove(strM15373);
                    m25971();
                    return c5202M14377;
                }
                try {
                    C4861 c4861M15376 = C5567.m15376(abstractC9677M41560);
                    C23582 c23582M15363 = C5567.m15363(abstractC9677M41560, this);
                    if (c23582M15363.m52007() != EnumC14035.CANCELED && !m25972()) {
                        if (!c4861M15376.m13560(abstractC9677M41560)) {
                            String strM392811 = C16737.m39288(R.string.MT_Protector);
                            this.f34833 = strM392811;
                            C5202 c5202M14378 = C5202.m14376(strM392811);
                            if (zTryAcquire) {
                                semaphore.release();
                            }
                            c4609.remove(strM15373);
                            m25971();
                            return c5202M14378;
                        }
                        int i = C8786.f30208[c23582M15363.m52007().ordinal()];
                        if (i == 1) {
                            c5202M14379 = C5202.m14379();
                        } else if (i != 2) {
                            if (i == 3) {
                                strM39288 = c23582M15363.m52008() == null ? C16737.m39288(R.string.MT_Protector) : C16737.m39264(R.string.MT_Protector, c23582M15363.m52008());
                                this.f34833 = strM39288;
                            } else if (i == 4) {
                                strM39288 = C16737.m39288(R.string.MT_Protector);
                                this.f34833 = strM39288;
                            } else {
                                if (i != 5) {
                                    throw new IncompatibleClassChangeError();
                                }
                                Exception iOException = c23582M15363.m52009() == null ? new IOException("Archive test failed") : c23582M15363.m52009();
                                this.f34833 = iOException.getMessage();
                                c5202M14379 = C5202.m14375(iOException);
                            }
                            c5202M14379 = C5202.m14376(strM39288);
                        } else {
                            c5202M14379 = C5202.m14378();
                        }
                        if (zTryAcquire) {
                            semaphore.release();
                        }
                        c4609.remove(strM15373);
                        m25971();
                        return c5202M14379;
                    }
                    C5202 c5202M143710 = C5202.m14378();
                    if (zTryAcquire) {
                        semaphore.release();
                    }
                    c4609.remove(strM15373);
                    m25971();
                    return c5202M143710;
                } catch (IOException unused) {
                    String strM392812 = C16737.m39288(R.string.MT_Protector);
                    this.f34833 = strM392812;
                    C5202 c5202M143711 = C5202.m14376(strM392812);
                    if (zTryAcquire) {
                        f34829.release();
                    }
                    f34830.remove(strM15373);
                    m25971();
                    return c5202M143711;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    f34829.release();
                }
                f34830.remove(strM15373);
                throw th;
            }
        } catch (Throwable th2) {
            m25971();
            throw th2;
        }
    }

    @Override // l.AbstractC17902
    public final void cancel() {
        this.f34831.set(true);
        super.cancel();
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25972() {
        return this.f34831.get() || mo2357();
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    private void m25971() {
        long j = this.f34832;
        if (j != 0) {
            this.f34832 = 0L;
            AbstractC11462.m28611(j);
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        m25971();
        if (c5202.m14380()) {
            C15829.m37611(R.string.MT_Protector);
        }
    }
}
