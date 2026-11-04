package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.cb;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۜۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6884 extends AbstractC8375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9866 f22843;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C9866 f22845;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9866 f22844 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C14010 f22842 = null;

    public C6884() {
        this.f22843 = null;
        this.f22845 = null;
        this.f27468 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f27471 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f27475 = 16384;
        byte[] bArr = C9011.f29358;
        this.f27474 = C9011.m24055("auth-agent@openssh.com", StandardCharsets.UTF_8);
        C9866 c9866 = new C9866();
        this.f22843 = c9866;
        c9866.m25674();
        this.f22845 = new C9866();
        this.f27472 = true;
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ᩻ */
    public final void mo6777() {
        try {
            m22546();
        } catch (Exception unused) {
            this.f27470 = true;
            m22548();
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x013e A[SYNTHETIC] */
    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19148(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArrMo20291;
        InterfaceC7387 interfaceC7387;
        String strMo3246;
        if (this.f22842 == null) {
            C9866 c9866 = new C9866(this.f27477);
            this.f22844 = c9866;
            this.f22842 = new C14010(c9866);
        }
        this.f22843.m25674();
        C9866 c9867 = this.f22843;
        byte[] bArr2 = c9867.f31750;
        if (bArr2.length < c9867.f31752 + i2) {
            byte[] bArr3 = new byte[c9867.f31751 + i2];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            this.f22843.f31750 = bArr3;
        }
        this.f22843.m25670(i, i2, bArr);
        if (this.f22843.m25658() > this.f22843.m25672()) {
            this.f22843.f31751 -= 4;
            return;
        }
        int iM25650 = this.f22843.m25650();
        try {
            C15723 c15723M22542 = m22542();
            InterfaceC5062 interfaceC5062M45900 = c15723M22542.f51127.m45900();
            InterfaceC0808 interfaceC0808M37605 = c15723M22542.m37605();
            this.f22845.m25674();
            if (iM25650 == 11) {
                this.f22845.m25651((byte) 12);
                Vector vectorMo9294 = interfaceC5062M45900.mo9294();
                synchronized (vectorMo9294) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < vectorMo9294.size(); i4++) {
                        if (((InterfaceC7387) vectorMo9294.elementAt(i4)).mo20290() != null) {
                            i3++;
                        }
                    }
                    this.f22845.m25669(i3);
                    for (int i5 = 0; i5 < vectorMo9294.size(); i5++) {
                        byte[] bArrMo20290 = ((InterfaceC7387) vectorMo9294.elementAt(i5)).mo20290();
                        if (bArrMo20290 != null) {
                            C9866 c9868 = this.f22845;
                            c9868.getClass();
                            c9868.m25660(0, bArrMo20290.length, bArrMo20290);
                            this.f22845.m25673(C9011.f29358);
                        }
                    }
                }
            } else if (iM25650 == 1) {
                this.f22845.m25651((byte) 2);
                this.f22845.m25669(0);
            } else if (iM25650 == 13) {
                byte[] bArrM25649 = this.f22843.m25649();
                byte[] bArrM256410 = this.f22843.m25649();
                int iM25658 = this.f22843.m25658();
                Vector vectorMo9295 = interfaceC5062M45900.mo9294();
                synchronized (vectorMo9295) {
                    int i6 = 0;
                    while (true) {
                        bArrMo20291 = null;
                        if (i6 >= vectorMo9295.size()) {
                            interfaceC7387 = null;
                            break;
                        }
                        interfaceC7387 = (InterfaceC7387) vectorMo9295.elementAt(i6);
                        if (interfaceC7387.mo20290() != null && C9011.m24054(bArrM25649, interfaceC7387.mo20290())) {
                            if (!interfaceC7387.mo20292()) {
                                if (!interfaceC7387.mo20292()) {
                                    break;
                                }
                            } else if (interfaceC0808M37605 != null) {
                                while (interfaceC7387.mo20292() && interfaceC0808M37605.mo3247() && (strMo3246 = interfaceC0808M37605.mo3246()) != null) {
                                    try {
                                        if (interfaceC7387.mo20288(strMo3246.getBytes(StandardCharsets.UTF_8))) {
                                            break;
                                        }
                                    } catch (C2079 unused) {
                                    }
                                }
                                if (!interfaceC7387.mo20292()) {
                                    break;
                                    break;
                                }
                            }
                        }
                        i6++;
                    }
                }
                if (interfaceC7387 != null) {
                    byte[] bArrM256411 = new C9866(bArrM25649).m25649();
                    if (!new String(bArrM256411, 0, bArrM256411.length, StandardCharsets.UTF_8).equals(OpenSSHPublicKeyUtil.RSA)) {
                        bArrMo20291 = interfaceC7387.mo20291(bArrM256410);
                    } else if ((iM25658 & 2) != 0) {
                        bArrMo20291 = interfaceC7387.mo20289("rsa-sha2-256", bArrM256410);
                    } else if ((iM25658 & 4) != 0) {
                        bArrMo20291 = interfaceC7387.mo20289("rsa-sha2-512", bArrM256410);
                    } else {
                        bArrMo20291 = interfaceC7387.mo20289(OpenSSHPublicKeyUtil.RSA, bArrM256410);
                    }
                }
                if (bArrMo20291 == null) {
                    this.f22845.m25651((byte) 30);
                } else {
                    this.f22845.m25651(cb.f82047l);
                    C9866 c9869 = this.f22845;
                    c9869.getClass();
                    c9869.m25660(0, bArrMo20291.length, bArrMo20291);
                }
            } else if (iM25650 == 18) {
                interfaceC5062M45900.mo9298(this.f22843.m25649());
                this.f22845.m25651((byte) 6);
            } else if (iM25650 == 9) {
                this.f22845.m25651((byte) 6);
            } else if (iM25650 == 19) {
                interfaceC5062M45900.mo9297();
                this.f22845.m25651((byte) 6);
            } else if (iM25650 == 17) {
                int iM25672 = this.f22843.m25672();
                byte[] bArr4 = new byte[iM25672];
                C9866 c98610 = this.f22843;
                c98610.getClass();
                c98610.m25653(0, iM25672, bArr4);
                this.f22845.m25651(interfaceC5062M45900.mo9296(bArr4) ? (byte) 6 : (byte) 5);
            } else {
                C9866 c98611 = this.f22843;
                c98611.m25659(c98611.m25672() - 1);
                this.f22845.m25651((byte) 5);
            }
            int iM25673 = this.f22845.m25672();
            byte[] bArr5 = new byte[iM25673];
            C9866 c98612 = this.f22845;
            c98612.getClass();
            c98612.m25653(0, iM25673, bArr5);
            this.f22842.m34100();
            this.f22844.m25651((byte) 94);
            this.f22844.m25669(this.f27478);
            int i7 = iM25673 + 4;
            this.f22844.m25669(i7);
            C9866 c98613 = this.f22844;
            c98613.getClass();
            c98613.m25660(0, iM25673, bArr5);
            try {
                m22542().m37615(this.f22842, this, i7);
            } catch (Exception unused2) {
            }
        } catch (C2079 e) {
            throw new IOException(e.toString(), e);
        }
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo19149() {
        super.mo19149();
        m22540();
    }
}
