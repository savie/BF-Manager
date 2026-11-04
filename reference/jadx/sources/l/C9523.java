package l;

import android.app.Notification;

/* JADX INFO: renamed from: l.ۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes4.dex */
public final class C9523 implements InterfaceC13998 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Notification f30845;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f30846;

    public C9523(String str, Notification notification) {
        this.f30846 = str;
        this.f30845 = notification;
    }

    @Override // l.InterfaceC13998
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24916(InterfaceC10489 interfaceC10489) {
        interfaceC10489.mo14246(this.f30846, this.f30845);
    }

    public final String toString() {
        return C8947.m23910(new StringBuilder("NotifyTask[packageName:"), this.f30846, ", id:1006, tag:null]");
    }
}
