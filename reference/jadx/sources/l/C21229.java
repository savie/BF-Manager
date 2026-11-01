package l;

import android.content.Intent;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.᩸֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21229 extends AbstractC16403 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC17701 f69151;

    public C21229(ServiceC17701 serviceC17701) {
        this.f69151 = serviceC17701;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C12763 m47703() {
        C12763 c12763M10654 = C3589.m10654();
        if (this.f69151.m41231(c12763M10654)) {
            return c12763M10654;
        }
        return null;
    }

    @Override // l.AbstractC16403
    /* JADX INFO: renamed from: ܰ */
    public final void mo38614() {
        C12763 c12763M47703 = m47703();
        if (c12763M47703 != null) {
            c12763M47703.m31733();
        }
    }

    @Override // l.AbstractC16403
    /* JADX INFO: renamed from: ۙ */
    public final void mo38609() {
        C12763 c12763M47703 = m47703();
        if (c12763M47703 != null) {
            c12763M47703.m31739();
        }
    }

    @Override // l.AbstractC16403
    /* JADX INFO: renamed from: ۨ */
    public final void mo38613() {
        C12763 c12763M47703 = m47703();
        if (c12763M47703 != null) {
            c12763M47703.m31737();
        }
    }

    @Override // l.AbstractC16403
    /* JADX INFO: renamed from: ۖ */
    public final void mo38608() {
        C12763 c12763M47703 = m47703();
        if (c12763M47703 != null) {
            c12763M47703.m31741();
        }
    }

    @Override // l.AbstractC16403
    /* JADX INFO: renamed from: ۙ */
    public final void mo38610(long j) {
        C12763 c12763M47703 = m47703();
        if (c12763M47703 != null) {
            c12763M47703.f42572 = true;
            c12763M47703.m31735((int) j);
        }
    }

    @Override // l.AbstractC16403
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo38612(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            C12763 c12763M47703 = m47703();
            if (c12763M47703 == null) {
                return true;
            }
            c12763M47703.m31738();
            return true;
        }
        return super.mo38612(intent);
    }
}
