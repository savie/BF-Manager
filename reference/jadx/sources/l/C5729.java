package l;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: renamed from: l.ۛ֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5729 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DisplayManager f19495;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23369 f19496;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public C5729(C23369 c23369, DisplayManager displayManager) {
        this.f19496 = c23369;
        this.f19495 = displayManager;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15782() {
        this.f19495.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C23369.m51482(this.f19496, this.f19495.getDisplay(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15781() {
        Handler handlerM41832 = C17983.m41832((Handler.Callback) null);
        DisplayManager displayManager = this.f19495;
        displayManager.registerDisplayListener(this, handlerM41832);
        C23369.m51482(this.f19496, displayManager.getDisplay(0));
    }
}
