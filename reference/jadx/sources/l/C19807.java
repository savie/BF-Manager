package l;

import android.app.Notification;

/* JADX INFO: renamed from: l.᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes5.dex */
public final class C19807 implements InterfaceC16984 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Notification f63589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f63590;

    public C19807(String str, Notification notification) {
        this.f63590 = str;
        this.f63589 = notification;
    }

    @Override // l.InterfaceC16984
    /* JADX INFO: renamed from: ۙ */
    public final void mo39770(InterfaceC11339 interfaceC11339) {
        interfaceC11339.mo12086(this.f63590, this.f63589);
    }

    public final String toString() {
        return C22697.m50267(new StringBuilder("NotifyTask[packageName:"), this.f63590, ", id:1006, tag:null]");
    }
}
