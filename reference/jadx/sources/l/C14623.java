package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F99O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14623 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile IOException f47849;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC16739 f47850;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile RuntimeException f47851;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile C7817 f47852;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f47853;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile Error f47854;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m35133() {
        this.f47853 = true;
        if (this.f47852 != null) {
            this.f47852.m20577();
            return;
        }
        if (this.f47850 != null) {
            C19431.m44468(this.f47850);
            this.f47850 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m35134(IOException iOException) {
        if (!this.f47853) {
            this.f47849 = iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m35135(Error error) {
        if (!this.f47853) {
            this.f47854 = error;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m35136(RuntimeException runtimeException) {
        if (!this.f47853) {
            this.f47851 = runtimeException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m35137(C7817 c7817) {
        this.f47850 = null;
        if (this.f47853) {
            c7817.m20577();
        } else {
            this.f47852 = c7817;
        }
    }
}
