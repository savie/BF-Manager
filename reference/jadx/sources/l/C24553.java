package l;

import android.content.Intent;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.᩺᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes.dex */
public final class C24553 extends AbstractC0182 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC4415 f79587;

    public C24553(ServiceC4415 serviceC4415) {
        this.f79587 = serviceC4415;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C23807 m54838() {
        C23807 c23807M11951 = C3669.m11951();
        if (this.f79587.m14038(c23807M11951)) {
            return c23807M11951;
        }
        return null;
    }

    @Override // l.AbstractC0182
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1483() {
        C23807 c23807M54838 = m54838();
        if (c23807M54838 != null) {
            c23807M54838.m53132();
        }
    }

    @Override // l.AbstractC0182
    /* JADX INFO: renamed from: ۙ */
    public final void mo1478() {
        C23807 c23807M54838 = m54838();
        if (c23807M54838 != null) {
            c23807M54838.m53130();
        }
    }

    @Override // l.AbstractC0182
    /* JADX INFO: renamed from: ۤ */
    public final void mo1482() {
        C23807 c23807M54838 = m54838();
        if (c23807M54838 != null) {
            c23807M54838.m53129();
        }
    }

    @Override // l.AbstractC0182
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1485() {
        C23807 c23807M54838 = m54838();
        if (c23807M54838 != null) {
            c23807M54838.m53128();
        }
    }

    @Override // l.AbstractC0182
    /* JADX INFO: renamed from: ۙ */
    public final void mo1479(long j) {
        C23807 c23807M54838 = m54838();
        if (c23807M54838 != null) {
            c23807M54838.f77122 = true;
            c23807M54838.m53125((int) j);
        }
    }

    @Override // l.AbstractC0182
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1481(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            C23807 c23807M54838 = m54838();
            if (c23807M54838 == null) {
                return true;
            }
            c23807M54838.m53127();
            return true;
        }
        return super.mo1481(intent);
    }
}
