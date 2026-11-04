package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes4.dex */
public final class C11303 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Uri f35632;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0851 f35633;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3846 f35634;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f35635;

    public C11303(ActivityC3846 activityC3846, C0851 c0851, Uri uri) {
        this.f35634 = activityC3846;
        this.f35633 = c0851;
        this.f35632 = uri;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ActivityC3846 activityC3846 = this.f35634;
        m8194(activityC3846, C11555.m29068(activityC3846));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        String strM3478;
        ActivityC3846 activityC3846 = this.f35634;
        if (activityC3846.f13140.f77608) {
            strM3478 = activityC3846.f13140.f77625;
        } else {
            strM3478 = this.f35633.m3478(this.f35632.getPath(), activityC3846.f13140.f77610 >= 0 ? new String[]{"index.md", "index.markdown", "index.html", "index.htm"} : new String[]{"index.html"});
        }
        if (!activityC3846.f13140.f77608 && strM3478 != null) {
            strM3478 = C18004.m41987(activityC3846.f13140.f77613, strM3478);
        }
        if (strM3478 != null) {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(strM3478, new String[0]);
            this.f35635 = abstractC22044M35193;
            if (abstractC22044M35193.mo4304()) {
                return;
            }
        }
        throw new IOException("Preview source is unavailable");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ActivityC3846 activityC3846 = this.f35634;
        if (activityC3846.isFinishing() || activityC3846.isDestroyed() || !this.f35632.equals(activityC3846.m12446())) {
            return;
        }
        Intent data = new Intent(activityC3846, (Class<?>) ActivityC18143.class).setAction("android.intent.action.VIEW").setData(this.f35635.m49836());
        if (activityC3846.f13140.f77603 != EnumC15778.STANDALONE) {
            activityC3846.setResult(-1, data);
        } else {
            activityC3846.startActivity(data);
        }
        activityC3846.finish();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC3846 activityC3846 = this.f35634;
        if (activityC3846.isFinishing() || activityC3846.isDestroyed()) {
            return;
        }
        activityC3846.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
