package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23114 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f74968;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20130 f74969;

    public C23114(C20130 c20130, String str) {
        this.f74969 = c20130;
        this.f74968 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f74969.f64691.m31979(), R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C20130 c20130 = this.f74969;
        AbstractC18881 abstractC18881 = c20130.f64694;
        InterfaceC2386 interfaceC2386 = c20130.f64692;
        String path = interfaceC2386.getPath();
        String parent = interfaceC2386.getParent();
        String str = this.f74968;
        String strM28549 = C11293.m28549(parent, str);
        if (c20130.f64689 && str.equalsIgnoreCase(c20130.f64693)) {
            String strM285410 = C11293.m28549(interfaceC2386.getParent(), System.currentTimeMillis() + ".tmp");
            abstractC18881.mo35571(path, strM285410);
            abstractC18881.mo35571(strM285410, strM28549);
            return;
        }
        abstractC18881.mo35571(path, strM28549);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C20130 c20130 = this.f74969;
        c20130.f64691.m31975(this.f74968);
        c20130.m22951();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f74969.f64691.m31979().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
        C6331.m18054(this.f74969.f64694.mo35579());
    }
}
