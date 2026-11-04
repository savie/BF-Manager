package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5411 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f18899;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16597 f18900;

    public C5411(ActivityC16597 activityC16597, boolean z) {
        this.f18900 = activityC16597;
        this.f18899 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8192(this.f18900, R.string.MT_Protector, 100);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        ActivityC16597 activityC16597 = this.f18900;
        final C15425 c15425 = new C15425(activityC16597.f53682.m49865());
        activityC16597.f53686.m4752(c15425);
        activityC16597.f53685.m49843(new InterfaceC1733() { // from class: l.۫ۙۧ
            @Override // l.InterfaceC11427
            /* JADX INFO: renamed from: ۙ */
            public final void mo14029(AbstractC22044 abstractC22044) throws IOException {
                C15425 c15426 = c15425;
                BufferedOutputStream bufferedOutputStreamM49869 = abstractC22044.m49869();
                try {
                    c15426.m36947(bufferedOutputStreamM49869);
                    bufferedOutputStreamM49869.close();
                } catch (Throwable th) {
                    try {
                        bufferedOutputStreamM49869.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        activityC16597.f53688 = false;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C22673.m51152(R.string.MT_Protector);
        boolean z = this.f18899;
        ActivityC16597 activityC16597 = this.f18900;
        if (z) {
            activityC16597.finish();
        } else {
            activityC16597.f53686.m4753(false);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f18900.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
