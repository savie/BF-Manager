package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V8BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6224 implements InterfaceC0171 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25179 f21146;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3986 f21147;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f21148;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IOException[] f21149;

    public C6224(C3986 c3986, HashMap map, C25179 c25179, IOException[] iOExceptionArr) {
        this.f21147 = c3986;
        this.f21148 = map;
        this.f21146 = c25179;
        this.f21149 = iOExceptionArr;
    }

    @Override // l.InterfaceC0171
    /* JADX INFO: renamed from: ۙ */
    public final void mo1452(InterfaceC2386 interfaceC2386, InputStream inputStream) throws IOException {
        C3986 c3986 = this.f21147;
        c3986.f13636.m6376();
        if (inputStream == null) {
            return;
        }
        C12627 c12627 = (C12627) this.f21148.get(interfaceC2386);
        C17359.requireNonNull(c12627);
        InterfaceC24124 interfaceC24124 = c3986.f13634;
        c3986.f13636.m6385();
        c3986.f13636.getClass();
        interfaceC24124.mo43420(c12627);
        c3986.f13634.getClass();
        c3986.f13634.setProgress(c3986.f13636.m6380());
        C8002 c8002 = new C8002(c12627.m18626());
        c8002.setTime(c12627.m18627());
        C3986.m12839(c8002, c12627);
        C25179 c25179 = this.f21146;
        c25179.m56125(c8002);
        try {
            C21298.m48534(inputStream, c25179.m56119(), interfaceC2386.getSize(), new C12189(this));
            inputStream.close();
            if (c3986.f13634.mo924()) {
                return;
            }
            c3986.f13636.m6378(c12627.m18622());
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC0171
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1453(IOException iOException) {
        System.out.println("onError");
        this.f21149[0] = iOException;
        return false;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f21147.f13634.mo924();
    }
}
