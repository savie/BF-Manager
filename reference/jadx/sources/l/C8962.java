package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes4.dex */
public final class C8962 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f29227;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f29228;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10608 f29229;

    public C8962(C10608 c10608, ActivityC0848 activityC0848, String str) {
        this.f29229 = c10608;
        this.f29228 = activityC0848;
        this.f29227 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f29228, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        OutputStream outputStreamMo4289 = C14584.m35193(this.f29227, new String[0]).mo4289(false);
        try {
            this.f29229.f33681.m41038(outputStreamMo4289);
            if (outputStreamMo4289 != null) {
                outputStreamMo4289.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo4289 != null) {
                try {
                    outputStreamMo4289.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C22673.m51152(R.string.MT_Protector);
        C20108.m46233(this.f29227, true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f29228.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
