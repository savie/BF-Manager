package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.cb;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.᩵֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7VX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19137 extends AbstractC7848 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14904 f61810;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C14904 f61811;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14904 f61812 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7307 f61813 = null;

    public C19137() {
        this.f61811 = null;
        this.f61810 = null;
        this.f25812 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f25819 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f25810 = 16384;
        byte[] bArr = C8491.f29422;
        this.f25817 = C8491.m22175("auth-agent@openssh.com", StandardCharsets.UTF_8);
        C14904 c14904 = new C14904();
        this.f61811 = c14904;
        c14904.m35650();
        this.f61810 = new C14904();
        this.f25818 = true;
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ᩺ */
    public final void mo19047() {
        try {
            m20742();
        } catch (Exception unused) {
            this.f25813 = true;
            m20737();
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x013e A[SYNTHETIC] */
    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ۙ */
    public final void mo20734(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArrMo22441;
        InterfaceC19219 interfaceC19219;
        String strMo26446;
        if (this.f61813 == null) {
            C14904 c14904 = new C14904(this.f25822);
            this.f61812 = c14904;
            this.f61813 = new C7307(c14904);
        }
        this.f61811.m35650();
        C14904 c14905 = this.f61811;
        byte[] bArr2 = c14905.f48679;
        if (bArr2.length < c14905.f48681 + i2) {
            byte[] bArr3 = new byte[c14905.f48680 + i2];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            this.f61811.f48679 = bArr3;
        }
        this.f61811.m35645(i, i2, bArr);
        if (this.f61811.m35638() > this.f61811.m35626()) {
            this.f61811.f48680 -= 4;
            return;
        }
        int iM35629 = this.f61811.m35629();
        try {
            C3073 c3073M20728 = m20728();
            InterfaceC10047 interfaceC10047M1334 = c3073M20728.f11634.m1334();
            InterfaceC19074 interfaceC19074M9229 = c3073M20728.m9229();
            this.f61810.m35650();
            if (iM35629 == 11) {
                this.f61810.m35630((byte) 12);
                Vector vectorMo19220 = interfaceC10047M1334.mo19220();
                synchronized (vectorMo19220) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < vectorMo19220.size(); i4++) {
                        if (((InterfaceC19219) vectorMo19220.elementAt(i4)).mo22440() != null) {
                            i3++;
                        }
                    }
                    this.f61810.m35644(i3);
                    for (int i5 = 0; i5 < vectorMo19220.size(); i5++) {
                        byte[] bArrMo22440 = ((InterfaceC19219) vectorMo19220.elementAt(i5)).mo22440();
                        if (bArrMo22440 != null) {
                            C14904 c14906 = this.f61810;
                            c14906.getClass();
                            c14906.m35640(0, bArrMo22440.length, bArrMo22440);
                            this.f61810.m35627(C8491.f29422);
                        }
                    }
                }
            } else if (iM35629 == 1) {
                this.f61810.m35630((byte) 2);
                this.f61810.m35644(0);
            } else if (iM35629 == 13) {
                byte[] bArrM35628 = this.f61811.m35628();
                byte[] bArrM35629 = this.f61811.m35628();
                int iM35638 = this.f61811.m35638();
                Vector vectorMo19221 = interfaceC10047M1334.mo19220();
                synchronized (vectorMo19221) {
                    int i6 = 0;
                    while (true) {
                        bArrMo22441 = null;
                        if (i6 >= vectorMo19221.size()) {
                            interfaceC19219 = null;
                            break;
                        }
                        interfaceC19219 = (InterfaceC19219) vectorMo19221.elementAt(i6);
                        if (interfaceC19219.mo22440() != null && C8491.m22174(bArrM35628, interfaceC19219.mo22440())) {
                            if (!interfaceC19219.mo22442()) {
                                if (!interfaceC19219.mo22442()) {
                                    break;
                                }
                            } else if (interfaceC19074M9229 != null) {
                                while (interfaceC19219.mo22442() && interfaceC19074M9229.mo26447() && (strMo26446 = interfaceC19074M9229.mo26446()) != null) {
                                    try {
                                        if (interfaceC19219.mo22437(strMo26446.getBytes(StandardCharsets.UTF_8))) {
                                            break;
                                        }
                                    } catch (C5813 unused) {
                                    }
                                }
                                if (!interfaceC19219.mo22442()) {
                                    break;
                                    break;
                                }
                            }
                        }
                        i6++;
                    }
                }
                if (interfaceC19219 != null) {
                    byte[] bArrM356210 = new C14904(bArrM35628).m35628();
                    if (!new String(bArrM356210, 0, bArrM356210.length, StandardCharsets.UTF_8).equals(OpenSSHPublicKeyUtil.RSA)) {
                        bArrMo22441 = interfaceC19219.mo22441(bArrM35629);
                    } else if ((iM35638 & 2) != 0) {
                        bArrMo22441 = interfaceC19219.mo22438("rsa-sha2-256", bArrM35629);
                    } else if ((iM35638 & 4) != 0) {
                        bArrMo22441 = interfaceC19219.mo22438("rsa-sha2-512", bArrM35629);
                    } else {
                        bArrMo22441 = interfaceC19219.mo22438(OpenSSHPublicKeyUtil.RSA, bArrM35629);
                    }
                }
                if (bArrMo22441 == null) {
                    this.f61810.m35630((byte) 30);
                } else {
                    this.f61810.m35630(cb.f77931l);
                    C14904 c14907 = this.f61810;
                    c14907.getClass();
                    c14907.m35640(0, bArrMo22441.length, bArrMo22441);
                }
            } else if (iM35629 == 18) {
                interfaceC10047M1334.mo19225(this.f61811.m35628());
                this.f61810.m35630((byte) 6);
            } else if (iM35629 == 9) {
                this.f61810.m35630((byte) 6);
            } else if (iM35629 == 19) {
                interfaceC10047M1334.mo19224();
                this.f61810.m35630((byte) 6);
            } else if (iM35629 == 17) {
                int iM35626 = this.f61811.m35626();
                byte[] bArr4 = new byte[iM35626];
                C14904 c14908 = this.f61811;
                c14908.getClass();
                c14908.m35632(0, iM35626, bArr4);
                this.f61810.m35630(interfaceC10047M1334.mo19222(bArr4) ? (byte) 6 : (byte) 5);
            } else {
                C14904 c14909 = this.f61811;
                c14909.m35639(c14909.m35626() - 1);
                this.f61810.m35630((byte) 5);
            }
            int iM35627 = this.f61810.m35626();
            byte[] bArr5 = new byte[iM35627];
            C14904 c149010 = this.f61810;
            c149010.getClass();
            c149010.m35632(0, iM35627, bArr5);
            this.f61813.m19501();
            this.f61812.m35630((byte) 94);
            this.f61812.m35644(this.f25821);
            int i7 = iM35627 + 4;
            this.f61812.m35644(i7);
            C14904 c149011 = this.f61812;
            c149011.getClass();
            c149011.m35640(0, iM35627, bArr5);
            try {
                m20728().m9237(this.f61813, this, i7);
            } catch (Exception unused2) {
            }
        } catch (C5813 e) {
            throw new IOException(e.toString(), e);
        }
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ۖ */
    public final void mo20729() {
        super.mo20729();
        m20736();
    }
}
