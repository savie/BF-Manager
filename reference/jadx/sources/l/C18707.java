package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ᩳ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7TX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18707 extends AbstractC17961 {
    @Override // l.AbstractC17961
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1029(C15723 c15723) {
        C9866 c9866;
        int i;
        super.mo1029(c15723);
        byte[] bytes = c15723.f51129;
        String str = this.f58833 + "@" + c15723.f51092;
        if (c15723.f51149 != 22) {
            C3188.m10405(str, ":").append(c15723.f51149);
        }
        while (c15723.f51130 < c15723.f51153) {
            try {
                if (bytes == null) {
                    InterfaceC0808 interfaceC0808 = this.f58831;
                    if (interfaceC0808 == null) {
                        if (bytes != null) {
                            C9011.m24062(bytes);
                        }
                        return false;
                    }
                    if (!interfaceC0808.mo3248()) {
                        throw new C13265("password");
                    }
                    String password = this.f58831.getPassword();
                    if (password == null) {
                        throw new C13265("password");
                    }
                    bytes = password.getBytes(StandardCharsets.UTF_8);
                }
                String str2 = this.f58833;
                Charset charset = StandardCharsets.UTF_8;
                byte[] bArrM24055 = C9011.m24055(str2, charset);
                this.f58832.m34100();
                this.f58830.m25651((byte) 50);
                this.f58830.m25673(bArrM24055);
                this.f58830.m25673("ssh-connection".getBytes(charset));
                this.f58830.m25673("password".getBytes(charset));
                this.f58830.m25651((byte) 0);
                this.f58830.m25673(bytes);
                c15723.m37627(this.f58832);
                while (true) {
                    c9866 = this.f58830;
                    c15723.m37613(c9866);
                    this.f58830 = c9866;
                    i = c9866.f31750[5] & 255;
                    if (i == 52) {
                        C9011.m24062(bytes);
                        return true;
                    }
                    if (i == 53) {
                        c9866.m25658();
                        this.f58830.m25650();
                        this.f58830.m25650();
                        byte[] bArrM25649 = this.f58830.m25649();
                        this.f58830.m25649();
                        new String(bArrM25649, 0, bArrM25649.length, StandardCharsets.UTF_8);
                    } else if (i == 60) {
                        c9866.m25658();
                        this.f58830.m25650();
                        this.f58830.m25650();
                        byte[] bArrM256410 = this.f58830.m25649();
                        this.f58830.m25649();
                        InterfaceC0808 interfaceC0809 = this.f58831;
                        if (interfaceC0809 != null && (interfaceC0809 instanceof InterfaceC20945)) {
                            int length = bArrM256410.length;
                            Charset charset2 = StandardCharsets.UTF_8;
                            new String(bArrM256410, 0, length, charset2);
                            String[] strArrMo18443 = ((InterfaceC20945) interfaceC0809).mo18443(new String[]{"New Password: "});
                            if (strArrMo18443 == null) {
                                throw new C13265("password");
                            }
                            String str3 = strArrMo18443[0];
                            byte[] bytes2 = str3 != null ? str3.getBytes(charset2) : C9011.f29358;
                            this.f58832.m34100();
                            this.f58830.m25651((byte) 50);
                            C9866 c9867 = this.f58830;
                            c9867.getClass();
                            c9867.m25660(0, bArrM24055.length, bArrM24055);
                            this.f58830.m25673("ssh-connection".getBytes(charset2));
                            this.f58830.m25673("password".getBytes(charset2));
                            this.f58830.m25651((byte) 1);
                            C9866 c9868 = this.f58830;
                            c9868.getClass();
                            c9868.m25660(0, bytes.length, bytes);
                            this.f58830.m25673(bytes2);
                            C9011.m24062(bytes2);
                            c15723.m37627(this.f58832);
                        }
                        C9011.m24062(bytes);
                        return false;
                    }
                }
                if (i != 51) {
                    C9011.m24062(bytes);
                    return false;
                }
                c9866.m25658();
                this.f58830.m25650();
                this.f58830.m25650();
                byte[] bArrM256411 = this.f58830.m25649();
                if (this.f58830.m25650() != 0) {
                    throw new C25200(new String(bArrM256411, 0, bArrM256411.length, StandardCharsets.UTF_8));
                }
                c15723.f51130++;
                C9011.m24062(bytes);
                bytes = null;
            } catch (Throwable th) {
                if (bytes != null) {
                    C9011.m24062(bytes);
                }
                throw th;
            }
        }
        if (bytes != null) {
            C9011.m24062(bytes);
            return false;
        }
        return false;
    }
}
