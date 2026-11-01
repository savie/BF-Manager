package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23751 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C17565 f76838;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f76839;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5366 f76840;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23229 f76841;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3329 f76842;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f76843;

    public C23751(C6111 c6111, AbstractActivityC12483 abstractActivityC12483, InterfaceC5366 interfaceC5366) {
        this.f76843 = c6111;
        this.f76839 = abstractActivityC12483;
        this.f76840 = interfaceC5366;
        this.f76841 = C23229.m51234(c6111);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f76842 = this.f76843.m17000().mo2398();
        AbstractActivityC12483 abstractActivityC12483 = this.f76839;
        if (abstractActivityC12483 != null) {
            m10246(abstractActivityC12483, R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C6111 c6111 = this.f76843;
        C3329 c3329 = this.f76842;
        try {
            C18503 c18503 = new C18503(C7412.toPath(c6111.getContext().getCacheDir()).resolve("format-output"), C13312.m32819());
            try {
                this.f76840.mo7927(c6111, c3329, c18503);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                this.f76838 = c18503.finish();
                c18503.close();
                if (c3329 != null) {
                    c3329.close();
                }
            } catch (Throwable th) {
                try {
                    c18503.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c3329 != null) {
                try {
                    c3329.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f76841.m51236()) {
            C1877.m6118(this.f76843, this.f76838);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f76841.m51236()) {
            if (this.f76840 == InterfaceC5366.f18527 && (exc instanceof C22085)) {
                C22085 c22085 = (C22085) exc;
                C8500.m22223(c22085.f71538, c22085.f71540).m22227(this.f76843);
            }
            AbstractActivityC12483 abstractActivityC12483 = this.f76839;
            if (abstractActivityC12483 != null) {
                abstractActivityC12483.m31002(exc, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        try {
            C17565 c17565 = this.f76838;
            if (c17565 != null) {
                c17565.close();
            }
        } finally {
            C3329 c3329 = this.f76842;
            if (c3329 != null) {
                c3329.close();
            }
            m10251();
        }
    }
}
