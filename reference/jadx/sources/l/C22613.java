package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22613 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f73690;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f73691;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f73692;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f73693;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21111 f73694;

    public C22613(Main main, AbstractC20745 abstractC20745, C11545 c11545) {
        this.f73693 = main;
        this.f73691 = abstractC20745;
        this.f73692 = c11545;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f73693, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C6037 c6037;
        AbstractC20745 abstractC20745 = this.f73691;
        AbstractC20745 abstractC20745M46706 = abstractC20745.m46706("resources.arsc");
        if (abstractC20745M46706.mo33975()) {
            try {
                c6037 = new C6037(abstractC20745M46706);
            } catch (Exception unused) {
                c6037 = null;
            }
        } else {
            c6037 = null;
        }
        if (c6037 == null) {
            c6037 = new C6037();
        }
        this.f73694 = C21111.m47538(C20945.m47103(abstractC20745.m46727()).m47106(), c6037, false);
        this.f73690 = this.f73692.m28771(abstractC20745.m46718() + ".png", false).m46693(true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        new C5679(this, this.f73693, this.f73694.getIntrinsicWidth(), this.f73694.getIntrinsicHeight());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f73693.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
