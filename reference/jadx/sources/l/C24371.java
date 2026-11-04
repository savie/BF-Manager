package l;

import android.content.ContextWrapper;
import android.os.Handler;

/* JADX INFO: renamed from: l.᩺ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes.dex */
public final class C24371 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f79073;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC6218 f79074;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f79075;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC4168 f79076;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Handler f79077;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f79078;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f79079;

    public C24371(ContextWrapper contextWrapper) {
        this.f79079 = contextWrapper;
        this.f79074 = new C15912(contextWrapper);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54489(InterfaceC6218 interfaceC6218) {
        this.f79074 = interfaceC6218;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54491() {
        this.f79073 = 5000L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54487(Handler handler) {
        this.f79077 = handler;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54488(InterfaceC4168 interfaceC4168) {
        this.f79076 = interfaceC4168;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m54490() {
        this.f79075 = 50;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21387 m54486() {
        C20782.m47568(!this.f79078);
        Handler handler = this.f79077;
        C20782.m47568((handler == null && this.f79076 == null) || !(handler == null || this.f79076 == null));
        this.f79078 = true;
        return new C21387(this);
    }
}
