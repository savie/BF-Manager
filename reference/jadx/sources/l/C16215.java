package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ܶܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes5.dex */
public final class C16215 implements InterfaceC12789 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12789 f52697;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Uri f52698;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC9480 f52699;

    public C16215(InterfaceC12789 interfaceC12789, InterfaceC9480 interfaceC9480, Uri uri) {
        this.f52697 = interfaceC12789;
        this.f52699 = interfaceC9480;
        this.f52698 = uri;
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22024 mo16658(int i, int i2) {
        return this.f52697.mo16658(i, i2);
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ܳ */
    public final void mo16661() {
        this.f52697.mo16661();
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ۙ */
    public final void mo16659(InterfaceC9060 interfaceC9060) {
        Uri uri;
        C18866 c18866M45871;
        boolean z = interfaceC9060 instanceof C0857;
        InterfaceC12789 interfaceC12789 = this.f52697;
        if (!z || (uri = this.f52698) == null) {
            interfaceC12789.mo16659(interfaceC9060);
            return;
        }
        C18866 c18866 = null;
        try {
            InterfaceC1278 interfaceC1278M25470 = ((C9771) this.f52699).m25470(uri);
            if (interfaceC1278M25470 == null) {
                c18866M45871 = null;
            } else {
                try {
                    int i = C16961.f55433;
                    try {
                        c18866M45871 = new C19945(interfaceC1278M25470).m45871();
                    } catch (ArithmeticException | IllegalArgumentException | IndexOutOfBoundsException | C25167 unused) {
                        c18866M45871 = null;
                    }
                } catch (Throwable th) {
                    try {
                        interfaceC1278M25470.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (interfaceC1278M25470 != null) {
                interfaceC1278M25470.close();
            }
            c18866 = c18866M45871;
        } catch (Exception unused2) {
        }
        if (c18866 != null) {
            interfaceC9060 = c18866;
        }
        interfaceC12789.mo16659(interfaceC9060);
    }
}
