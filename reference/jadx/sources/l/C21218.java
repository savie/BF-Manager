package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V8BV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21218 implements InterfaceC1914 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f69120;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18396 f69121;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22918 f69122;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IOException[] f69123;

    public C21218(C18396 c18396, HashMap map, C22918 c22918, IOException[] iOExceptionArr) {
        this.f69121 = c18396;
        this.f69120 = map;
        this.f69122 = c22918;
        this.f69123 = iOExceptionArr;
    }

    @Override // l.InterfaceC1914
    /* JADX INFO: renamed from: ۙ */
    public final void mo6226(InterfaceC2557 interfaceC2557, InputStream inputStream) throws IOException {
        C18396 c18396 = this.f69121;
        c18396.f58644.m10992();
        if (inputStream == null) {
            return;
        }
        C9033 c9033 = (C9033) this.f69120.get(interfaceC2557);
        C13638.requireNonNull(c9033);
        InterfaceC17690 interfaceC17690 = c18396.f58642;
        c18396.f58644.m10991();
        c18396.f58644.getClass();
        interfaceC17690.mo38357(c9033);
        c18396.f58642.getClass();
        c18396.f58642.setProgress(c18396.f58644.m10996());
        C12107 c12107 = new C12107(c9033.m26385());
        c12107.setTime(c9033.m26392());
        C18396.m42671(c12107, c9033);
        C22918 c22918 = this.f69122;
        c22918.m50727(c12107);
        try {
            C22487.m49992(inputStream, c22918.m50720(), interfaceC2557.getSize(), new C14869(this));
            inputStream.close();
            if (c18396.f58642.mo2357()) {
                return;
            }
            c18396.f58644.m10994(c9033.m26359());
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC1914
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6227(IOException iOException) {
        System.out.println("onError");
        this.f69123[0] = iOException;
        return false;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f69121.f58642.mo2357();
    }
}
