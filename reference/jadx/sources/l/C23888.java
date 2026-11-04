package l;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: l.᩹᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H9VO */
/* JADX INFO: loaded from: classes2.dex */
public final class C23888 extends AbstractC6209 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public String f77363;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23032 f77364;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public byte[] f77365;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public C21125 f77366;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f77367;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C23888(InterfaceC23032 interfaceC23032, C21125 c21125, String str, String str2, AbstractC3971 abstractC3971) {
        super(interfaceC23032.mo2875(), (byte) 117, abstractC3971);
        this.f77364 = interfaceC23032;
        this.f77366 = c21125;
        this.f13608 = str;
        this.f77363 = str2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        C21125 c21125 = this.f77366;
        if (c21125.f67485 == 0) {
            InterfaceC23032 interfaceC23032 = this.f77364;
            if (interfaceC23032.mo22000() instanceof C19982) {
                C19982 c19982 = (C19982) interfaceC23032.mo22000();
                if ((c19982 instanceof C11031) && !((C11031) c19982).m27890() && c19982.getPassword().isEmpty()) {
                    this.f77367 = 1;
                } else if (c21125.f67482) {
                    try {
                        byte[] bArrM45912 = c19982.m45912(interfaceC23032, c21125.f67493);
                        this.f77365 = bArrM45912;
                        this.f77367 = bArrM45912.length;
                    } catch (GeneralSecurityException e) {
                        throw new C3640("Failed to encrypt password", e);
                    }
                } else {
                    if (((C14826) interfaceC23032.mo2875()).m35726()) {
                        throw new C3640("Plain text passwords are disabled");
                    }
                    this.f77365 = new byte[(c19982.getPassword().length() + 1) * 2];
                    this.f77367 = m12758(c19982.getPassword(), 0, this.f77365);
                }
            } else {
                this.f77367 = 1;
            }
        } else {
            this.f77367 = 1;
        }
        bArr[i] = 0;
        bArr[i + 1] = 0;
        C0481.m2319(this.f77367, i + 2, bArr);
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        int i2;
        String str = this.f77363;
        if (this.f77366.f67485 == 0) {
            InterfaceC23032 interfaceC23032 = this.f77364;
            if (interfaceC23032.mo22000() instanceof C19982) {
                C19982 c19982 = (C19982) interfaceC23032.mo22000();
                if ((c19982 instanceof C11031) && !((C11031) c19982).m27890() && c19982.getPassword().isEmpty()) {
                    i2 = i + 1;
                    bArr[i] = 0;
                } else {
                    System.arraycopy(this.f77365, 0, bArr, i, this.f77367);
                    i2 = this.f77367 + i;
                }
            } else {
                i2 = i + 1;
                bArr[i] = 0;
            }
        } else {
            i2 = i + 1;
            bArr[i] = 0;
        }
        int iM12758 = i2 + m12758(this.f13608, i2, bArr);
        try {
            System.arraycopy(str.getBytes("ASCII"), 0, bArr, iM12758, str.length());
            int length = str.length() + iM12758;
            bArr[length] = 0;
            return (length + 1) - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComTreeConnectAndX[");
        sb.append(super.toString());
        sb.append(",disconnectTid=false,passwordLength=");
        sb.append(this.f77367);
        sb.append(",password=");
        sb.append(C6033.m17504(this.f77365, this.f77367, 0));
        sb.append(",path=");
        sb.append(this.f13608);
        sb.append(",service=");
        return new String(C8947.m23910(sb, this.f77363, "]"));
    }
}
