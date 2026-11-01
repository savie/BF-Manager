package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۨ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12030 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f40290;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f40291;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f40292;

    public C12030(C11545 c11545, AbstractC20745 abstractC20745) {
        this.f40291 = c11545;
        this.f40290 = abstractC20745;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f40291.m28824(), R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws XmlPullParserException {
        C6037 c6037;
        AbstractC20745 abstractC20745 = this.f40290;
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
        C21111 c21111M47538 = C21111.m47538(C20945.m47103(abstractC20745.m46727()).m47106(), c6037, true);
        AbstractC20745 abstractC20745M46693 = this.f40291.m28771(abstractC20745.m46718() + ".svg", false).m46693(true);
        this.f40292 = abstractC20745M46693;
        abstractC20745M46693.m46735(c21111M47538.m47540());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f40291.m28787(this.f40292);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f40291.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        C21094.m47530();
    }
}
