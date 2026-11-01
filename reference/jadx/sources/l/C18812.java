package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18812 implements InterfaceC9974 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8229 f60976;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19146 f60977;

    public C18812(C8229 c8229, C19146 c19146) {
        this.f60976 = c8229;
        C13638.requireNonNull(c19146);
        this.f60977 = c19146;
    }

    @Override // l.InterfaceC9974
    public final String getPath() {
        return this.f60977.f61840;
    }

    @Override // l.InterfaceC9974
    /* JADX INFO: renamed from: ۙ */
    public final String mo25238() {
        try {
            return C8229.m21545(this.f60977);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8340 m43415() {
        byte[] bArrM35012;
        C19146 c19146 = this.f60977;
        C13626 c13626 = c19146.f61839;
        if (c13626 == null) {
            C13626 c13627 = c19146.f61844;
            C13638.requireNonNull(c13627);
            C14546 c14546 = new C14546(c13627.m33318());
            try {
                c14546.seek(c19146.f61841);
                if (c19146.f61842) {
                    byte[] bArrM35013 = c14546.m35012();
                    bArrM35012 = C18019.m41969(bArrM35013, bArrM35013.length);
                } else {
                    bArrM35012 = c14546.m35012();
                }
                c14546.close();
                return C8340.m21776(new C17367(bArrM35012));
            } catch (Throwable th) {
                try {
                    c14546.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C13626 c13626M21565 = this.f60976.m21565(c13626);
        C8340 c8340M21563 = C8229.m21563(c13626, c13626M21565);
        return c8340M21563 != null ? c8340M21563 : C8229.m21547(c13626M21565);
    }

    @Override // l.InterfaceC9974
    /* JADX INFO: renamed from: ۙ */
    public final void mo25239(String str) {
        C8229 c8229 = this.f60976;
        try {
            c8229.m21584(this.f60977, str);
        } catch (Exception e) {
            c8229.f28647.mo23641(e);
        }
    }
}
