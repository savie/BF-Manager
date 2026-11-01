package l;

import android.media.projection.MediaProjectionManager;

/* JADX INFO: renamed from: l.ۤ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O945 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC9932 extends AbstractActivityC19104 implements InterfaceC7658 {

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33913 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public boolean f33914 = true;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C9101 f33915;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "ColorPickerActivity";
    }

    @Override // l.AbstractActivityC19104
    /* JADX INFO: renamed from: ܳ */
    public final void mo19000() {
        this.f33915 = C7689.m20320(this, new C8521(this));
        if (ServiceC12465.m30944()) {
            ServiceC12465.m30963(this);
        } else {
            m25136();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m25136() {
        if (C6696.m18094(this)) {
            this.f33915.m23450(((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent());
            this.f33914 = false;
        } else {
            try {
                C16125.m38167(this, null);
            } catch (Throwable th) {
                m31003(th, true);
            }
        }
    }

    @Override // l.AbstractActivityC19104
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18997() {
        return this.f33914;
    }
}
