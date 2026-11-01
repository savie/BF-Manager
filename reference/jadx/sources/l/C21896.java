package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩸᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7TX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21896 extends AbstractC7079 {
    @Override // l.AbstractC7079
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18953(C3073 c3073) {
        C14904 c14904;
        int i;
        super.mo18953(c3073);
        byte[] bytes = c3073.f11622;
        String str = this.f23748 + "@" + c3073.f11611;
        if (c3073.f11624 != 22) {
            C3012.m8976(str, ":").append(c3073.f11624);
        }
        while (c3073.f11613 < c3073.f11636) {
            try {
                if (bytes == null) {
                    InterfaceC19074 interfaceC19074 = this.f23750;
                    if (interfaceC19074 == null) {
                        if (bytes != null) {
                            C8491.m22182(bytes);
                        }
                        return false;
                    }
                    if (!interfaceC19074.mo26448()) {
                        throw new C12164("password");
                    }
                    String password = this.f23750.getPassword();
                    if (password == null) {
                        throw new C12164("password");
                    }
                    bytes = password.getBytes(StandardCharsets.UTF_8);
                }
                String str2 = this.f23748;
                Charset charset = StandardCharsets.UTF_8;
                byte[] bArrM22175 = C8491.m22175(str2, charset);
                this.f23751.m19501();
                this.f23749.m35630((byte) 50);
                this.f23749.m35627(bArrM22175);
                this.f23749.m35627("ssh-connection".getBytes(charset));
                this.f23749.m35627("password".getBytes(charset));
                this.f23749.m35630((byte) 0);
                this.f23749.m35627(bytes);
                c3073.m9249(this.f23751);
                while (true) {
                    c14904 = this.f23749;
                    c3073.m9239(c14904);
                    this.f23749 = c14904;
                    i = c14904.f48679[5] & 255;
                    if (i == 52) {
                        C8491.m22182(bytes);
                        return true;
                    }
                    if (i == 53) {
                        c14904.m35638();
                        this.f23749.m35629();
                        this.f23749.m35629();
                        byte[] bArrM35628 = this.f23749.m35628();
                        this.f23749.m35628();
                        new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8);
                    } else if (i == 60) {
                        c14904.m35638();
                        this.f23749.m35629();
                        this.f23749.m35629();
                        byte[] bArrM35629 = this.f23749.m35628();
                        this.f23749.m35628();
                        InterfaceC19074 interfaceC19075 = this.f23750;
                        if (interfaceC19075 != null && (interfaceC19075 instanceof InterfaceC4256)) {
                            int length = bArrM35629.length;
                            Charset charset2 = StandardCharsets.UTF_8;
                            new String(bArrM35629, 0, length, charset2);
                            String[] strArrMo12020 = ((InterfaceC4256) interfaceC19075).mo12020(new String[]{"New Password: "});
                            if (strArrMo12020 == null) {
                                throw new C12164("password");
                            }
                            String str3 = strArrMo12020[0];
                            byte[] bytes2 = str3 != null ? str3.getBytes(charset2) : C8491.f29422;
                            this.f23751.m19501();
                            this.f23749.m35630((byte) 50);
                            C14904 c14905 = this.f23749;
                            c14905.getClass();
                            c14905.m35640(0, bArrM22175.length, bArrM22175);
                            this.f23749.m35627("ssh-connection".getBytes(charset2));
                            this.f23749.m35627("password".getBytes(charset2));
                            this.f23749.m35630((byte) 1);
                            C14904 c14906 = this.f23749;
                            c14906.getClass();
                            c14906.m35640(0, bytes.length, bytes);
                            this.f23749.m35627(bytes2);
                            C8491.m22182(bytes2);
                            c3073.m9249(this.f23751);
                        }
                        C8491.m22182(bytes);
                        return false;
                    }
                }
                if (i != 51) {
                    C8491.m22182(bytes);
                    return false;
                }
                c14904.m35638();
                this.f23749.m35629();
                this.f23749.m35629();
                byte[] bArrM356210 = this.f23749.m35628();
                if (this.f23749.m35629() != 0) {
                    throw new C23453(new String(bArrM356210, 0, bArrM356210.length, StandardCharsets.UTF_8));
                }
                c3073.f11613++;
                C8491.m22182(bytes);
                bytes = null;
            } catch (Throwable th) {
                if (bytes != null) {
                    C8491.m22182(bytes);
                }
                throw th;
            }
        }
        if (bytes != null) {
            C8491.m22182(bytes);
            return false;
        }
        return false;
    }
}
