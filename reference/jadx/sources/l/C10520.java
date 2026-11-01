package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.ۤ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10520 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f36014;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C2414 f36015;

    public C10520(ActivityC3588 activityC3588) {
        this.f36014 = activityC3588;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f36014);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C12063 c12063 = new C12063();
        this.f36014.f13204.f7907.m33766(c12063);
        c12063.m29981();
        byte[] bArr = new byte[c12063.m29979()];
        c12063.m29977(new C4651(bArr));
        this.f36015 = C21444.m48031("", bArr, ApplicationC0716.f2992.mo16345((byte) 0, "dex_decompile_engine"));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        boolean zM4686 = this.f36015.f9691.m4686();
        ActivityC3588 activityC3588 = this.f36014;
        if (!zM4686) {
            C1313 c1313 = this.f36015.f9691;
            c1313.getClass();
            activityC3588.m31000(C4820.m13401(c1313, R.string.MT_Protector), false);
            return;
        }
        C9101 c9101 = activityC3588.f13202;
        C2414 c2414 = this.f36015;
        String strM50267 = C22697.m50267(new StringBuilder(), activityC3588.f13204.f7908, ".java");
        int i = ActivityC21135.f68820;
        C12670.m31503(ActivityC3588.class, c2414, "textViewer_dec");
        Intent intent = new Intent(C16737.m39277(), (Class<?>) ActivityC21135.class);
        intent.putExtra(e.s, 2);
        intent.putExtra("title", strM50267);
        intent.putExtra("saveStateOnResult", true);
        c9101.m23450(intent);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f36014.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
