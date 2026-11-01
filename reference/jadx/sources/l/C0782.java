package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes2.dex */
public final class C0782 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f3359;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f3360;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14895 f3361;

    public C0782(C14895 c14895, ActivityC5677 activityC5677, String str) {
        this.f3361 = c14895;
        this.f3359 = activityC5677;
        this.f3360 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f3359, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        OutputStream outputStreamMo33976 = C5553.m15313(this.f3360, new String[0]).mo33976(false);
        try {
            this.f3361.f48660.m32412(outputStreamMo33976);
            if (outputStreamMo33976 != null) {
                outputStreamMo33976.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo33976 != null) {
                try {
                    outputStreamMo33976.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C15829.m37611(R.string.MT_Protector);
        C22252.m49408(this.f3360, true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f3359.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
