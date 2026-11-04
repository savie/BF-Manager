package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: F99O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10284 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC14759 f32846;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C15945 f32847;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile Error f32848;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile RuntimeException f32849;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f32850;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile IOException f32851;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26514() {
        this.f32850 = true;
        if (this.f32847 != null) {
            this.f32847.m38022();
            return;
        }
        if (this.f32846 != null) {
            C20244.m46520(this.f32846);
            this.f32846 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26515(IOException iOException) {
        if (!this.f32850) {
            this.f32851 = iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26516(Error error) {
        if (!this.f32850) {
            this.f32848 = error;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26517(RuntimeException runtimeException) {
        if (!this.f32850) {
            this.f32849 = runtimeException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26518(C15945 c15945) {
        this.f32846 = null;
        if (this.f32850) {
            c15945.m38022();
        } else {
            this.f32847 = c15945;
        }
    }
}
