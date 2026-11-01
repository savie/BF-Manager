package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۢ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9268 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Runnable f31496;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f31497;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23229 f31498;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f31499;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Handler f31500;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f31501;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17485 f31502;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f31503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f31504;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C6111 f31505;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f31506;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f31507;

    public C9268(C6111 c6111, AbstractActivityC12483 abstractActivityC12483, int i, BooleanSupplier booleanSupplier) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f31500 = handler;
        RunnableC1505 runnableC1505 = new RunnableC1505(this);
        this.f31496 = runnableC1505;
        this.f31505 = c6111;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        this.f31501 = interfaceC2916M17000;
        this.f31507 = interfaceC2916M17000.mo2395();
        this.f31506 = c6111.f20745;
        this.f31498 = C23229.m51234(c6111);
        this.f31503 = booleanSupplier;
        C17485 c17485 = abstractActivityC12483 == null ? null : new C17485(abstractActivityC12483, i);
        this.f31502 = c17485;
        if (c17485 != null) {
            c17485.m40697(new RunnableC16260(2, this));
            handler.postDelayed(new Runnable() { // from class: l.ܳ֫ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    C9268.m23803(this.f46592);
                }
            }, 300L);
        }
        handler.postDelayed(runnableC1505, 200L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23803(C9268 c9268) {
        if (c9268.f31497 || !c9268.m23806()) {
            return;
        }
        c9268.f31502.m40704();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m23806() {
        if (this.f31499 || !this.f31498.m51236()) {
            return false;
        }
        InterfaceC2916 interfaceC2916M17000 = this.f31505.m17000();
        InterfaceC2916 interfaceC2916 = this.f31501;
        return interfaceC2916M17000 == interfaceC2916 && interfaceC2916.mo2395() == this.f31507 && this.f31505.f20745 == this.f31506 && this.f31503.getAsBoolean();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m23811() {
        if (this.f31499 || !this.f31498.m51236()) {
            return false;
        }
        return this.f31504 || m23806();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m23812() {
        return this.f31499;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m23807() {
        if (this.f31499 || Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Editor search canceled");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23810() {
        if (this.f31504) {
            return;
        }
        this.f31499 = true;
        m23809();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23808() {
        if (!m23806()) {
            return false;
        }
        this.f31504 = true;
        m23809();
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m23809() {
        this.f31497 = true;
        this.f31500.removeCallbacksAndMessages(null);
        C17485 c17485 = this.f31502;
        if (c17485 != null) {
            c17485.m40694();
        }
    }
}
