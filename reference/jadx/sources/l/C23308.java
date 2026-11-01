package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.bouncycastle.util.encoders.Base32Encoder;

/* JADX INFO: renamed from: l.᩺᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7ZR */
/* JADX INFO: loaded from: classes.dex */
public final class C23308 extends AbstractC7079 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC7079
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18953(C3073 c3073) throws IOException {
        C14904 c14904;
        InterfaceC19074 interfaceC19074;
        String[] strArrMo12020;
        super.mo18953(c3073);
        InterfaceC19074 interfaceC19075 = this.f23750;
        if (interfaceC19075 == null || (interfaceC19075 instanceof InterfaceC4256)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f23748);
            sb.append("@");
            sb.append(c3073.f11611);
            byte[] bArr = c3073.f11622;
            byte[] bArrM22175 = C8491.m22175(this.f23748, StandardCharsets.UTF_8);
            boolean z = false;
            loop0: while (c3073.f11613 < c3073.f11636) {
                this.f23751.m19501();
                this.f23749.m35630((byte) 50);
                this.f23749.m35627(bArrM22175);
                C14904 c14905 = this.f23749;
                Charset charset = StandardCharsets.UTF_8;
                c14905.m35627("ssh-connection".getBytes(charset));
                this.f23749.m35627("keyboard-interactive".getBytes(charset));
                C14904 c14906 = this.f23749;
                byte[] bArr2 = C8491.f29422;
                c14906.m35627(bArr2);
                C14904 c14907 = this.f23749;
                c14907.getClass();
                c14907.m35640(0, bArr2.length, bArr2);
                c3073.m9249(this.f23751);
                boolean z2 = true;
                boolean z3 = true;
                while (true) {
                    c14904 = this.f23749;
                    c3073.m9239(c14904);
                    this.f23749 = c14904;
                    boolean z4 = c14904.f48679[5] & 255;
                    if (z4 == 52) {
                        return z2;
                    }
                    if (z4 == 53) {
                        c14904.m35638();
                        this.f23749.m35629();
                        this.f23749.m35629();
                        byte[] bArrM35628 = this.f23749.m35628();
                        this.f23749.m35628();
                        new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8);
                    } else {
                        if (z4 == 51) {
                            break;
                        }
                        if (z4 != 60) {
                            break loop0;
                        }
                        c14904.m35638();
                        this.f23749.m35629();
                        this.f23749.m35629();
                        byte[] bArrM35629 = this.f23749.m35628();
                        int length = bArrM35629.length;
                        Charset charset2 = StandardCharsets.UTF_8;
                        String str = new String(bArrM35629, 0, length, charset2);
                        byte[] bArrM356210 = this.f23749.m35628();
                        String str2 = new String(bArrM356210, 0, bArrM356210.length, charset2);
                        C8491.m22171(this.f23749.m35628());
                        int iM35638 = this.f23749.m35638();
                        String[] strArr = new String[iM35638];
                        boolean[] zArr = new boolean[iM35638];
                        int i = 0;
                        while (i < iM35638) {
                            byte[] bArrM356211 = this.f23749.m35628();
                            byte[] bArr3 = bArrM22175;
                            strArr[i] = new String(bArrM356211, 0, bArrM356211.length, StandardCharsets.UTF_8);
                            zArr[i] = this.f23749.m35629() != 0;
                            i++;
                            bArrM22175 = bArr3;
                        }
                        byte[] bArr4 = bArrM22175;
                        byte[][] bArr5 = null;
                        if (bArr != null && iM35638 == 1 && !zArr[0] && strArr[0].toLowerCase(Locale.ROOT).indexOf("password:") >= 0) {
                            byte[][] bArr6 = {bArr};
                            bArr = null;
                            bArr5 = bArr6;
                        } else if ((iM35638 > 0 || str.length() > 0 || str2.length() > 0) && (interfaceC19074 = this.f23750) != null && (strArrMo12020 = ((InterfaceC4256) interfaceC19074).mo12020(strArr)) != null) {
                            bArr5 = new byte[strArrMo12020.length][];
                            for (int i2 = 0; i2 < strArrMo12020.length; i2++) {
                                String str3 = strArrMo12020[i2];
                                bArr5[i2] = str3 != null ? str3.getBytes(StandardCharsets.UTF_8) : C8491.f29422;
                            }
                        }
                        this.f23751.m19501();
                        this.f23749.m35630(Base32Encoder.DEFAULT_PADDING);
                        if (iM35638 <= 0 || (bArr5 != null && iM35638 == bArr5.length)) {
                            this.f23749.m35644(iM35638);
                            for (int i3 = 0; i3 < iM35638; i3++) {
                                this.f23749.m35627(bArr5[i3]);
                            }
                        } else {
                            if (bArr5 == null) {
                                this.f23749.m35644(iM35638);
                                for (int i4 = 0; i4 < iM35638; i4++) {
                                    this.f23749.m35627(C8491.f29422);
                                }
                            } else {
                                this.f23749.m35644(0);
                            }
                            if (bArr5 == null) {
                                z = true;
                            }
                        }
                        c3073.m9249(this.f23751);
                        z3 = false;
                        bArrM22175 = bArr4;
                        z2 = true;
                    }
                }
                c14904.m35638();
                this.f23749.m35629();
                this.f23749.m35629();
                byte[] bArrM356212 = this.f23749.m35628();
                if (this.f23749.m35629() != 0) {
                    throw new C23453(new String(bArrM356212, 0, bArrM356212.length, StandardCharsets.UTF_8));
                }
                if (z3) {
                    break;
                }
                c3073.f11613 += z2 ? 1 : 0;
                if (z) {
                    throw new C12164("keyboard-interactive");
                }
            }
        }
        return false;
    }
}
