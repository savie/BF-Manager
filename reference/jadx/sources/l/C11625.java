package l;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: renamed from: l.ۧ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11625 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DisplayManager f36466;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16846 f36467;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public C11625(C16846 c16846, DisplayManager displayManager) {
        this.f36467 = c16846;
        this.f36466 = displayManager;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29196() {
        this.f36466.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C16846.m39752(this.f36467, this.f36466.getDisplay(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29195() {
        Handler handlerM19479 = C7116.m19479((Handler.Callback) null);
        DisplayManager displayManager = this.f36466;
        displayManager.registerDisplayListener(this, handlerM19479);
        C16846.m39752(this.f36467, displayManager.getDisplay(0));
    }
}
