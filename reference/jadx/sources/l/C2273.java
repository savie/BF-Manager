package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes3.dex */
public final class C2273 implements InterfaceC16200 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11967 f7409;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16946 f7410;

    public C2273(C11967 c11967, C16946 c16946) {
        this.f7409 = c11967;
        C17359.requireNonNull(c16946);
        this.f7410 = c16946;
    }

    @Override // l.InterfaceC16200
    public final String getPath() {
        return this.f7410.f55358;
    }

    @Override // l.InterfaceC16200
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo7710() {
        try {
            return C11967.m29945(this.f7410);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2008 m7712() {
        byte[] bArrM53627;
        C16946 c16946 = this.f7410;
        C9378 c9378 = c16946.f55357;
        if (c9378 == null) {
            C9378 c9379 = c16946.f55363;
            C17359.requireNonNull(c9379);
            C24078 c24078 = new C24078(c9379.m24699());
            try {
                c24078.seek(c16946.f55360);
                if (c16946.f55356) {
                    byte[] bArrM53628 = c24078.m53627();
                    bArrM53627 = C15768.m37707(bArrM53628, bArrM53628.length);
                } else {
                    bArrM53627 = c24078.m53627();
                }
                c24078.close();
                return C2008.m6851(new C20348(bArrM53627));
            } catch (Throwable th) {
                try {
                    c24078.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C9378 c9378M29965 = this.f7409.m29965(c9378);
        C2008 c2008M29963 = C11967.m29963(c9378, c9378M29965);
        return c2008M29963 != null ? c2008M29963 : C11967.m29947(c9378M29965);
    }

    @Override // l.InterfaceC16200
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7711(String str) {
        C11967 c11967 = this.f7409;
        try {
            c11967.m29980(this.f7410, str);
        } catch (Exception e) {
            c11967.f38527.mo40348(e);
        }
    }
}
