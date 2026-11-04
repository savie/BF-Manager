package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.bouncycastle.util.encoders.Base32Encoder;

/* JADX INFO: renamed from: l.֡֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7ZR */
/* JADX INFO: loaded from: classes3.dex */
public final class C0062 extends AbstractC17961 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC17961
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1029(C15723 c15723) throws IOException {
        C9866 c9866;
        InterfaceC0808 interfaceC0808;
        String[] strArrMo18443;
        super.mo1029(c15723);
        InterfaceC0808 interfaceC0809 = this.f58831;
        if (interfaceC0809 == null || (interfaceC0809 instanceof InterfaceC20945)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f58833);
            sb.append("@");
            sb.append(c15723.f51092);
            byte[] bArr = c15723.f51129;
            byte[] bArrM24055 = C9011.m24055(this.f58833, StandardCharsets.UTF_8);
            boolean z = false;
            loop0: while (c15723.f51130 < c15723.f51153) {
                this.f58832.m34100();
                this.f58830.m25651((byte) 50);
                this.f58830.m25673(bArrM24055);
                C9866 c9867 = this.f58830;
                Charset charset = StandardCharsets.UTF_8;
                c9867.m25673("ssh-connection".getBytes(charset));
                this.f58830.m25673("keyboard-interactive".getBytes(charset));
                C9866 c9868 = this.f58830;
                byte[] bArr2 = C9011.f29358;
                c9868.m25673(bArr2);
                C9866 c9869 = this.f58830;
                c9869.getClass();
                c9869.m25660(0, bArr2.length, bArr2);
                c15723.m37627(this.f58832);
                boolean z2 = true;
                boolean z3 = true;
                while (true) {
                    c9866 = this.f58830;
                    c15723.m37613(c9866);
                    this.f58830 = c9866;
                    boolean z4 = c9866.f31750[5] & 255;
                    if (z4 == 52) {
                        return z2;
                    }
                    if (z4 == 53) {
                        c9866.m25658();
                        this.f58830.m25650();
                        this.f58830.m25650();
                        byte[] bArrM25649 = this.f58830.m25649();
                        this.f58830.m25649();
                        new String(bArrM25649, 0, bArrM25649.length, StandardCharsets.UTF_8);
                    } else {
                        if (z4 == 51) {
                            break;
                        }
                        if (z4 != 60) {
                            break loop0;
                        }
                        c9866.m25658();
                        this.f58830.m25650();
                        this.f58830.m25650();
                        byte[] bArrM256410 = this.f58830.m25649();
                        int length = bArrM256410.length;
                        Charset charset2 = StandardCharsets.UTF_8;
                        String str = new String(bArrM256410, 0, length, charset2);
                        byte[] bArrM256411 = this.f58830.m25649();
                        String str2 = new String(bArrM256411, 0, bArrM256411.length, charset2);
                        C9011.m24051(this.f58830.m25649());
                        int iM25658 = this.f58830.m25658();
                        String[] strArr = new String[iM25658];
                        boolean[] zArr = new boolean[iM25658];
                        int i = 0;
                        while (i < iM25658) {
                            byte[] bArrM256412 = this.f58830.m25649();
                            byte[] bArr3 = bArrM24055;
                            strArr[i] = new String(bArrM256412, 0, bArrM256412.length, StandardCharsets.UTF_8);
                            zArr[i] = this.f58830.m25650() != 0;
                            i++;
                            bArrM24055 = bArr3;
                        }
                        byte[] bArr4 = bArrM24055;
                        byte[][] bArr5 = null;
                        if (bArr != null && iM25658 == 1 && !zArr[0] && strArr[0].toLowerCase(Locale.ROOT).indexOf("password:") >= 0) {
                            byte[][] bArr6 = {bArr};
                            bArr = null;
                            bArr5 = bArr6;
                        } else if ((iM25658 > 0 || str.length() > 0 || str2.length() > 0) && (interfaceC0808 = this.f58831) != null && (strArrMo18443 = ((InterfaceC20945) interfaceC0808).mo18443(strArr)) != null) {
                            bArr5 = new byte[strArrMo18443.length][];
                            for (int i2 = 0; i2 < strArrMo18443.length; i2++) {
                                String str3 = strArrMo18443[i2];
                                bArr5[i2] = str3 != null ? str3.getBytes(StandardCharsets.UTF_8) : C9011.f29358;
                            }
                        }
                        this.f58832.m34100();
                        this.f58830.m25651(Base32Encoder.DEFAULT_PADDING);
                        if (iM25658 <= 0 || (bArr5 != null && iM25658 == bArr5.length)) {
                            this.f58830.m25669(iM25658);
                            for (int i3 = 0; i3 < iM25658; i3++) {
                                this.f58830.m25673(bArr5[i3]);
                            }
                        } else {
                            if (bArr5 == null) {
                                this.f58830.m25669(iM25658);
                                for (int i4 = 0; i4 < iM25658; i4++) {
                                    this.f58830.m25673(C9011.f29358);
                                }
                            } else {
                                this.f58830.m25669(0);
                            }
                            if (bArr5 == null) {
                                z = true;
                            }
                        }
                        c15723.m37627(this.f58832);
                        z3 = false;
                        bArrM24055 = bArr4;
                        z2 = true;
                    }
                }
                c9866.m25658();
                this.f58830.m25650();
                this.f58830.m25650();
                byte[] bArrM256413 = this.f58830.m25649();
                if (this.f58830.m25650() != 0) {
                    throw new C25200(new String(bArrM256413, 0, bArrM256413.length, StandardCharsets.UTF_8));
                }
                if (z3) {
                    break;
                }
                c15723.f51130 += z2 ? 1 : 0;
                if (z) {
                    throw new C13265("keyboard-interactive");
                }
            }
        }
        return false;
    }
}
