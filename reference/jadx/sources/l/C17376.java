package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17376 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6087 f55273;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55274;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10946 f55275;

    public C17376(C6087 c6087, int i) {
        this.f55273 = c6087;
        this.f55274 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f55273.f20602);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C15829.m37613((CharSequence) this.f55275.f37218);
        if (((Boolean) this.f55275.f37217).booleanValue()) {
            C6087 c6087 = this.f55273;
            ActivityC14555 activityC14555 = c6087.f20602;
            C16609 c16609 = ActivityC14555.f47653;
            new C11027(activityC14555, true).m10243();
            c6087.m40364();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f55273.f20602.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C8142 {
        C2724 c2724M8305 = C2724.m8305(4210);
        c2724M8305.m8323(this.f55274);
        C1313 c1313M8314 = C1709.m5692() ? c2724M8305.m8314() : c2724M8305.m8313();
        if (c1313M8314.m4686()) {
            this.f55275 = new C10946(Boolean.valueOf(c1313M8314.m4671()), c1313M8314.m4683());
            return;
        }
        throw new C8142(C4820.m13401(c1313M8314, R.string.MT_Protector));
    }
}
