package l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.ܰܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9UW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14760 extends C12523 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f48223;

    @Override // l.C12523
    /* JADX INFO: renamed from: ۫ */
    public final int mo31102() {
        return 16;
    }

    public C14760(String str, InterfaceC23032 interfaceC23032) throws MalformedURLException {
        super(str, interfaceC23032);
        this.f48223 = 27198979;
        m31105();
        if (!this.f40200.m4925()) {
            throw new MalformedURLException("Named pipes are only valid on IPC$");
        }
        this.f40200.m4918(16);
    }

    @Override // l.C12523
    /* JADX INFO: renamed from: ۙ */
    public final void mo31094(C8445 c8445, C6954 c6954) {
        c8445.m22631();
        c6954.m19251();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m35494() {
        return this.f48223;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18490 m35493() {
        return new C21474(this);
    }
}
