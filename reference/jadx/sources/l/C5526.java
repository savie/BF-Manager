package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۚ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5526 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f19219;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f19220;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f19221;

    public C5526(C8614 c8614, AbstractC22044 abstractC22044) {
        this.f19219 = c8614;
        this.f19220 = abstractC22044;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f19219.m23233(), R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws XmlPullParserException {
        C21246 c21246;
        AbstractC22044 abstractC22044 = this.f19220;
        AbstractC22044 abstractC22044M49868 = abstractC22044.m49868("resources.arsc");
        if (abstractC22044M49868.mo2934()) {
            try {
                c21246 = new C21246(abstractC22044M49868);
            } catch (Exception unused) {
                c21246 = null;
            }
        } else {
            c21246 = null;
        }
        if (c21246 == null) {
            c21246 = new C21246();
        }
        C24236 c24236M54217 = C24236.m54217(C14955.m35982(abstractC22044.m49865()).m35991(), c21246, true);
        AbstractC22044 abstractC22044M49839 = this.f19219.m23170(abstractC22044.m49874() + ".svg", false).m49839(true);
        this.f19221 = abstractC22044M49839;
        abstractC22044M49839.m49879(c24236M54217.m54219());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f19219.m23186(this.f19221);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f19219.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
        C6331.m18055();
    }
}
