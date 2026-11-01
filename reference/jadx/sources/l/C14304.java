package l;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* JADX INFO: renamed from: l.ܳۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14304 implements InterfaceC7953 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23683 f46864;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5079 f46865;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10983 f46867;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15009 f46869;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f46866 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f46868 = 262144;

    public C14304(C5079 c5079, C15009 c15009, InterfaceC23683 interfaceC23683, InterfaceC10983 interfaceC10983) {
        this.f46865 = c5079;
        this.f46869 = c15009;
        this.f46864 = interfaceC23683;
        this.f46867 = interfaceC10983;
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8597 mo20987(C22719 c22719, long j) {
        if ("chunked".equalsIgnoreCase(c22719.m50357("Transfer-Encoding"))) {
            if (this.f46866 != 1) {
                throw new IllegalStateException("state: " + this.f46866);
            }
            this.f46866 = 2;
            return new C12187(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f46866 != 1) {
            throw new IllegalStateException("state: " + this.f46866);
        }
        this.f46866 = 2;
        return new C5836(this, j);
    }

    @Override // l.InterfaceC7953
    public final void cancel() {
        C0896 c0896M36003 = this.f46869.m36003();
        if (c0896M36003 != null) {
            c0896M36003.m3578();
        }
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ۙ */
    public final void mo20991(C22719 c22719) {
        Proxy.Type type = this.f46869.m36003().m3576().m22385().type();
        StringBuilder sb = new StringBuilder();
        sb.append(c22719.m50359());
        sb.append(' ');
        if (!c22719.m50356() && type == Proxy.Type.HTTP) {
            sb.append(c22719.m50355());
        } else {
            C14440 c14440M50355 = c22719.m50355();
            String strM34743 = c14440M50355.m34743();
            String strM34735 = c14440M50355.m34735();
            if (strM34735 != null) {
                strM34743 = strM34743 + '?' + strM34735;
            }
            sb.append(strM34743);
        }
        sb.append(" HTTP/1.1");
        m34532(c22719.m50360(), sb.toString());
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ۙ */
    public final C20653 mo20989(C18485 c18485) {
        C15009 c15009 = this.f46869;
        c15009.f48950.getClass();
        String strM42859 = c18485.m42859("Content-Type");
        if (!C10070.m25483(c18485)) {
            return new C20653(strM42859, 0L, C0834.m3437(m34531(0L)));
        }
        if ("chunked".equalsIgnoreCase(c18485.m42859("Transfer-Encoding"))) {
            C14440 c14440M50355 = c18485.m42866().m50355();
            if (this.f46866 != 4) {
                throw new IllegalStateException("state: " + this.f46866);
            }
            this.f46866 = 5;
            return new C20653(strM42859, -1L, C0834.m3437(new C17125(this, c14440M50355)));
        }
        long jM25481 = C10070.m25481(c18485);
        if (jM25481 != -1) {
            return new C20653(strM42859, jM25481, C0834.m3437(m34531(jM25481)));
        }
        if (this.f46866 != 4) {
            throw new IllegalStateException("state: " + this.f46866);
        }
        this.f46866 = 5;
        c15009.m36002();
        return new C20653(strM42859, -1L, C0834.m3437(new C23476(this)));
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ܰ */
    public final void mo20992() {
        this.f46867.flush();
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ۙ */
    public final void mo20990() {
        this.f46867.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34532(C10912 c10912, String str) {
        if (this.f46866 != 0) {
            throw new IllegalStateException("state: " + this.f46866);
        }
        InterfaceC10983 interfaceC10983 = this.f46867;
        interfaceC10983.mo16418(str).mo16418("\r\n");
        int iM27347 = c10912.m27347();
        for (int i = 0; i < iM27347; i++) {
            interfaceC10983.mo16418(c10912.m27344(i)).mo16418(": ").mo16418(c10912.m27348(i)).mo16418("\r\n");
        }
        interfaceC10983.mo16418("\r\n");
        this.f46866 = 1;
    }

    @Override // l.InterfaceC7953
    /* JADX INFO: renamed from: ۙ */
    public final C17779 mo20988(boolean z) {
        int i = this.f46866;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f46866);
        }
        try {
            String strMo16402 = this.f46864.mo16402(this.f46868);
            this.f46868 -= (long) strMo16402.length();
            C19948 c19948M45245 = C19948.m45245(strMo16402);
            int i2 = c19948M45245.f63897;
            C17779 c17779 = new C17779();
            c17779.m41348(c19948M45245.f63898);
            c17779.m41341(i2);
            c17779.m41353(c19948M45245.f63899);
            c17779.m41344(m34533());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f46866 = 3;
                return c17779;
            }
            this.f46866 = 4;
            return c17779;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f46869);
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10912 m34533() {
        C5972 c5972 = new C5972();
        while (true) {
            String strMo16402 = this.f46864.mo16402(this.f46868);
            this.f46868 -= (long) strMo16402.length();
            if (strMo16402.length() != 0) {
                AbstractC7196.f24003.mo19137(c5972, strMo16402);
            } else {
                return c5972.m16265();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10008 m34531(long j) {
        if (this.f46866 != 4) {
            throw new IllegalStateException("state: " + this.f46866);
        }
        this.f46866 = 5;
        return new C10776(this, j);
    }
}
