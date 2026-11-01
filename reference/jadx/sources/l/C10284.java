package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10284 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f35032;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7461 f35033;

    public C10284(C7461 c7461, String str) {
        this.f35033 = c7461;
        this.f35032 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f35033.f24858, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        long jM9393 = this.f35033.f24859.m9393();
        C2724 c2724M8305 = C2724.m8305(4198);
        c2724M8305.m8316(jM9393);
        c2724M8305.m8326(this.f35032);
        C1313 c1313M8321 = c2724M8305.m8321();
        if (!c1313M8321.m4686()) {
            throw new C4987(C4820.m13401(c1313M8321, R.string.MT_Protector));
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C7461 c7461 = this.f35033;
        c7461.m40364();
        c7461.f24860.dismiss();
        c7461.f24857.mo950(c7461.f24858);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f35033.f24858.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
