package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.ܶ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16331 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f53017;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6806 f53018;

    public C16331(ActivityC22957 activityC22957) {
        this.f53017 = activityC22957;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f53017);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C24738 c24738 = new C24738();
        this.f53017.f74569.f24319.m13152(c24738);
        c24738.m55244();
        byte[] bArr = new byte[c24738.m55243()];
        c24738.m55242(new C24166(bArr));
        this.f53018 = C11650.m29284("", bArr, ApplicationC17729.f58258.mo7901((byte) 0, "dex_decompile_engine"));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        boolean zM33676 = this.f53018.f22668.m33676();
        ActivityC22957 activityC22957 = this.f53017;
        if (!zM33676) {
            C13778 c13778 = this.f53018.f22668;
            c13778.getClass();
            activityC22957.m40400(C1364.m5010(c13778, R.string.MT_Protector), false);
            return;
        }
        C3347 c3347 = activityC22957.f74571;
        C6806 c6806 = this.f53018;
        String strM23910 = C8947.m23910(new StringBuilder(), activityC22957.f74569.f24298, ".java");
        int i = ActivityC4300.f15587;
        C23391.m52569(ActivityC22957.class, c6806, "textViewer_dec");
        Intent intent = new Intent(C21576.m49084(), (Class<?>) ActivityC4300.class);
        intent.putExtra(e.s, 2);
        intent.putExtra("title", strM23910);
        intent.putExtra("saveStateOnResult", true);
        c3347.m10999(intent);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f53017.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
