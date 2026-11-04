package l;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* JADX INFO: renamed from: l.ܺۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16620 implements InterfaceC2668 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24363 f53743;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11573 f53744;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19076 f53745;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f53746 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f53747 = 262144;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC25000 f53748;

    public C16620(C24363 c24363, C19076 c19076, InterfaceC25000 interfaceC25000, InterfaceC11573 interfaceC11573) {
        this.f53743 = c24363;
        this.f53745 = c19076;
        this.f53748 = interfaceC25000;
        this.f53744 = interfaceC11573;
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7099 mo8828(C7954 c7954, long j) {
        if ("chunked".equalsIgnoreCase(c7954.m21646("Transfer-Encoding"))) {
            if (this.f53746 != 1) {
                throw new IllegalStateException("state: " + this.f53746);
            }
            this.f53746 = 2;
            return new C12891(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f53746 != 1) {
            throw new IllegalStateException("state: " + this.f53746);
        }
        this.f53746 = 2;
        return new C1705(this, j);
    }

    @Override // l.InterfaceC2668
    public final void cancel() {
        C14600 c14600M44182 = this.f53745.m44182();
        if (c14600M44182 != null) {
            c14600M44182.m35242();
        }
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ۙ */
    public final void mo8831(C7954 c7954) {
        Proxy.Type type = this.f53745.m44182().m35250().m19795().type();
        StringBuilder sb = new StringBuilder();
        sb.append(c7954.m21651());
        sb.append(' ');
        if (c7954.m21653() || type != Proxy.Type.HTTP) {
            C16903 c16903M21649 = c7954.m21649();
            String strM39877 = c16903M21649.m39877();
            String strM39878 = c16903M21649.m39878();
            if (strM39878 != null) {
                strM39877 = C8008.m21875('?', strM39877, strM39878);
            }
            sb.append(strM39877);
        } else {
            sb.append(c7954.m21649());
        }
        sb.append(" HTTP/1.1");
        m39319(c7954.m21648(), sb.toString());
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ۙ */
    public final C21842 mo8829(C9444 c9444) {
        C19076 c19076 = this.f53745;
        c19076.f61770.getClass();
        String strM24817 = c9444.m24817("Content-Type");
        if (!C13854.m33802(c9444)) {
            return new C21842(strM24817, 0L, C14556.m35108(m39318(0L)));
        }
        if ("chunked".equalsIgnoreCase(c9444.m24817("Transfer-Encoding"))) {
            C16903 c16903M21649 = c9444.m24826().m21649();
            if (this.f53746 != 4) {
                throw new IllegalStateException("state: " + this.f53746);
            }
            this.f53746 = 5;
            return new C21842(strM24817, -1L, C14556.m35108(new C5434(this, c16903M21649)));
        }
        long jM33800 = C13854.m33800(c9444);
        if (jM33800 != -1) {
            return new C21842(strM24817, jM33800, C14556.m35108(m39318(jM33800)));
        }
        if (this.f53746 != 4) {
            throw new IllegalStateException("state: " + this.f53746);
        }
        this.f53746 = 5;
        c19076.m44185();
        return new C21842(strM24817, -1L, C14556.m35108(new C24826(this)));
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8832() {
        this.f53744.flush();
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ۙ */
    public final void mo8830() {
        this.f53744.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39319(C11682 c11682, String str) {
        if (this.f53746 != 0) {
            throw new IllegalStateException("state: " + this.f53746);
        }
        InterfaceC11573 interfaceC11573 = this.f53744;
        interfaceC11573.mo6442(str).mo6442("\r\n");
        int iM29363 = c11682.m29363();
        for (int i = 0; i < iM29363; i++) {
            interfaceC11573.mo6442(c11682.m29360(i)).mo6442(": ").mo6442(c11682.m29364(i)).mo6442("\r\n");
        }
        interfaceC11573.mo6442("\r\n");
        this.f53746 = 1;
    }

    @Override // l.InterfaceC2668
    /* JADX INFO: renamed from: ۙ */
    public final C1242 mo8827(boolean z) {
        int i = this.f53746;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f53746);
        }
        try {
            String strMo4176 = this.f53748.mo4176(this.f53747);
            this.f53747 -= (long) strMo4176.length();
            C22588 c22588M50912 = C22588.m50912(strMo4176);
            int i2 = c22588M50912.f73024;
            C1242 c1242 = new C1242();
            c1242.m4483(c22588M50912.f73025);
            c1242.m4480(i2);
            c1242.m4492(c22588M50912.f73026);
            c1242.m4488(m39320());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f53746 = 3;
                return c1242;
            }
            this.f53746 = 4;
            return c1242;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f53745);
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11682 m39320() {
        C1988 c1988 = new C1988();
        while (true) {
            String strMo4176 = this.f53748.mo4176(this.f53747);
            this.f53747 -= (long) strMo4176.length();
            if (strMo4176.length() != 0) {
                AbstractC4906.f17137.mo15056(c1988, strMo4176);
            } else {
                return c1988.m6809();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13810 m39318(long j) {
        if (this.f53746 != 4) {
            throw new IllegalStateException("state: " + this.f53746);
        }
        this.f53746 = 5;
        return new C11399(this, j);
    }
}
