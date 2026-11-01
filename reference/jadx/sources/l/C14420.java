package l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.ܳۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T9UW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14420 extends C17241 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f47258;

    @Override // l.C17241
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo34687() {
        return 16;
    }

    public C14420(String str, InterfaceC19067 interfaceC19067) throws MalformedURLException {
        super(str, interfaceC19067);
        this.f47258 = 27198979;
        m40204();
        if (!this.f54929.m7567()) {
            throw new MalformedURLException("Named pipes are only valid on IPC$");
        }
        this.f54929.m7560(16);
    }

    @Override // l.C17241
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34688(C13276 c13276, C4102 c4102) {
        c13276.m32760();
        c4102.m11644();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m34690() {
        return this.f47258;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC9481 m34689() {
        return new C1718(this);
    }
}
