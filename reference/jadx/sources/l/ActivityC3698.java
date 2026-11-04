package l;

import android.media.projection.MediaProjectionManager;

/* JADX INFO: renamed from: l.ۗ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O945 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3698 extends AbstractActivityC23836 implements InterfaceC17984 {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12705 = 0;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C3347 f12706;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public boolean f12707 = true;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "ColorPickerActivity";
    }

    @Override // l.AbstractActivityC23836
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12017() {
        this.f12706 = C12296.m30693(this, new C22200(this));
        if (ServiceC10702.m27293()) {
            ServiceC10702.m27292(this);
        } else {
            m12018();
        }
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void m12018() {
        if (C7756.m21107(this)) {
            this.f12706.m10999(((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent());
            this.f12707 = false;
        } else {
            try {
                C7543.m20612(this, null);
            } catch (Throwable th) {
                m40402(th, true);
            }
        }
    }

    @Override // l.AbstractActivityC23836
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo12016() {
        return this.f12707;
    }
}
