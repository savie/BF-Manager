package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14579 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C17565 f47694;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f47695;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13128 f47696;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23229 f47697;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3329 f47698;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f47699;

    public C14579(C6111 c6111, AbstractActivityC12483 abstractActivityC12483, InterfaceC13128 interfaceC13128) {
        this.f47699 = c6111;
        this.f47695 = abstractActivityC12483;
        this.f47696 = interfaceC13128;
        this.f47697 = C23229.m51234(c6111);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f47698 = this.f47699.m17000().mo2398();
        AbstractActivityC12483 abstractActivityC12483 = this.f47695;
        if (abstractActivityC12483 != null) {
            m10246(abstractActivityC12483, R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C6111 c6111 = this.f47699;
        C3329 c3329 = this.f47698;
        try {
            C18503 c18503 = new C18503(C7412.toPath(c6111.getContext().getCacheDir()).resolve("format-output"), C13312.m32819());
            try {
                this.f47696.mo4165(c3329, c18503);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                this.f47694 = c18503.finish();
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
        if (this.f47697.m51236()) {
            C1877.m6118(this.f47699, this.f47694);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        AbstractActivityC12483 abstractActivityC12483;
        if (this.f47697.m51236() && (abstractActivityC12483 = this.f47695) != null) {
            abstractActivityC12483.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        try {
            C17565 c17565 = this.f47694;
            if (c17565 != null) {
                c17565.close();
            }
        } finally {
            C3329 c3329 = this.f47698;
            if (c3329 != null) {
                c3329.close();
            }
            m10251();
        }
    }
}
