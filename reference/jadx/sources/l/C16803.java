package l;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: l.ܽᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H9VO */
/* JADX INFO: loaded from: classes5.dex */
public final class C16803 extends AbstractC11264 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public C9853 f53799;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public byte[] f53800;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f53801;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f53802;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f53803;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        return 0;
    }

    public C16803(InterfaceC19067 interfaceC19067, C9853 c9853, String str, String str2, AbstractC14792 abstractC14792) {
        super(interfaceC19067.mo29449(), (byte) 117, abstractC14792);
        this.f53803 = interfaceC19067;
        this.f53799 = c9853;
        this.f48357 = str;
        this.f53801 = str2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        C9853 c9853 = this.f53799;
        if (c9853.f33648 == 0) {
            InterfaceC19067 interfaceC19067 = this.f53803;
            if (interfaceC19067.mo13093() instanceof C18652) {
                C18652 c18652 = (C18652) interfaceC19067.mo13093();
                if ((c18652 instanceof C21474) && !((C21474) c18652).m48092() && c18652.getPassword().isEmpty()) {
                    this.f53802 = 1;
                } else if (c9853.f33646) {
                    try {
                        byte[] bArrM43143 = c18652.m43143(interfaceC19067, c9853.f33652);
                        this.f53800 = bArrM43143;
                        this.f53802 = bArrM43143.length;
                    } catch (GeneralSecurityException e) {
                        throw new C17655("Failed to encrypt password", e);
                    }
                } else {
                    if (((C9895) interfaceC19067.mo29449()).m25081()) {
                        throw new C17655("Plain text passwords are disabled");
                    }
                    this.f53800 = new byte[(c18652.getPassword().length() + 1) * 2];
                    this.f53802 = m35440(c18652.getPassword(), 0, this.f53800);
                }
            } else {
                this.f53802 = 1;
            }
        } else {
            this.f53802 = 1;
        }
        bArr[i] = 0;
        bArr[i + 1] = 0;
        C4850.m13546(this.f53802, i + 2, bArr);
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        int i2;
        String str = this.f53801;
        if (this.f53799.f33648 == 0) {
            InterfaceC19067 interfaceC19067 = this.f53803;
            if (interfaceC19067.mo13093() instanceof C18652) {
                C18652 c18652 = (C18652) interfaceC19067.mo13093();
                if ((c18652 instanceof C21474) && !((C21474) c18652).m48092() && c18652.getPassword().isEmpty()) {
                    i2 = i + 1;
                    bArr[i] = 0;
                } else {
                    System.arraycopy(this.f53800, 0, bArr, i, this.f53802);
                    i2 = this.f53802 + i;
                }
            } else {
                i2 = i + 1;
                bArr[i] = 0;
            }
        } else {
            i2 = i + 1;
            bArr[i] = 0;
        }
        int iM35440 = i2 + m35440(this.f48357, i2, bArr);
        try {
            System.arraycopy(str.getBytes("ASCII"), 0, bArr, iM35440, str.length());
            int length = str.length() + iM35440;
            bArr[length] = 0;
            return (length + 1) - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComTreeConnectAndX[");
        sb.append(super.toString());
        sb.append(",disconnectTid=false,passwordLength=");
        sb.append(this.f53802);
        sb.append(",password=");
        sb.append(C5993.m16281(this.f53800, this.f53802, 0));
        sb.append(",path=");
        sb.append(this.f48357);
        sb.append(",service=");
        return new String(C22697.m50267(sb, this.f53801, "]"));
    }
}
