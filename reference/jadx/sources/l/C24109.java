package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩺ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P9WB */
/* JADX INFO: loaded from: classes.dex */
public final class C24109 implements InterfaceC10110 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f77936 = C16980.m40037(C24109.class);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77937 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f77938;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f77939;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f77940;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f77941;

    public C24109(byte[] bArr, int i) {
        this.f77938 = C3049.m9907();
        this.f77940 = bArr;
        this.f77939 = 0;
        InterfaceC25186 interfaceC25186 = f77936;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("macSigningKey:");
            interfaceC25186.mo13717(C6033.m17504(bArr, 0, bArr.length));
        }
    }

    public C24109(byte[] bArr) {
        this.f77938 = C3049.m9907();
        this.f77940 = bArr;
    }

    public C24109(byte[] bArr, Object obj) {
        this.f77938 = C3049.m9907();
        this.f77940 = bArr;
        this.f77939 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53658(byte[] bArr, int i, int i2) {
        InterfaceC25186 interfaceC25186 = f77936;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("update: " + this.f77941 + " " + i + ":" + i2);
            interfaceC25186.mo13717(C6033.m17504(bArr, i, Math.min(i2, 256)));
        }
        if (i2 == 0) {
            return;
        }
        this.f77938.update(bArr, i, i2);
        this.f77941++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m53661() {
        byte[] bArrDigest = this.f77938.digest();
        InterfaceC25186 interfaceC25186 = f77936;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("digest: ");
            interfaceC25186.mo13717(C6033.m17504(bArrDigest, 0, bArrDigest.length));
        }
        this.f77941 = 0;
        return bArrDigest;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53659(byte[] bArr, int i, int i2, InterfaceC14585 interfaceC14585, InterfaceC14585 interfaceC14586) {
        InterfaceC25186 interfaceC25186 = f77936;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Signing with seq " + this.f77939);
        }
        ((AbstractC3971) interfaceC14585).m12753(this.f77939);
        if (interfaceC14586 != null) {
            ((AbstractC3971) interfaceC14586).m12753(this.f77939 + 1);
        }
        try {
            try {
                byte[] bArr2 = this.f77940;
                m53658(bArr2, 0, bArr2.length);
                int i3 = i + 14;
                for (int i4 = 0; i4 < 8; i4++) {
                    bArr[i3 + i4] = 0;
                }
                C0481.m2323(this.f77939, i3, bArr);
                m53658(bArr, i, i2);
                System.arraycopy(m53661(), 0, bArr, i3, 8);
            } catch (Exception e) {
                interfaceC25186.mo13724("Signature failed", (Throwable) e);
            }
        } finally {
            this.f77939 += 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53660(byte[] bArr, int i, int i2, InterfaceC14585 interfaceC14585) {
        AbstractC3971 abstractC3971 = (AbstractC3971) interfaceC14585;
        int i3 = abstractC3971.f13591 & 4;
        InterfaceC25186 interfaceC25186 = f77936;
        if (i3 == 0) {
            interfaceC25186.mo13729("Expected signed response, but is not signed");
            return false;
        }
        byte[] bArr2 = this.f77940;
        m53658(bArr2, 0, bArr2.length);
        m53658(bArr, 4, 14);
        byte[] bArr3 = new byte[8];
        C0481.m2323(abstractC3971.m12796(), 0, bArr3);
        m53658(bArr3, 0, 8);
        if (abstractC3971.mo10330() == 46) {
            C13445 c13445 = (C13445) abstractC3971;
            m53658(bArr, 26, (abstractC3971.f13607 - c13445.m33089()) - 22);
            m53658(c13445.m33088(), c13445.m33090(), c13445.m33089());
        } else {
            m53658(bArr, 26, abstractC3971.f13607 - 22);
        }
        byte[] bArrM53661 = m53661();
        for (int i4 = 0; i4 < 8; i4++) {
            if (bArrM53661[i4] != bArr[i4 + 18]) {
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("signature verification failure");
                    interfaceC25186.mo13721("Expect: ".concat(C6033.m17504(bArrM53661, 0, 8)));
                    interfaceC25186.mo13721("Have: ".concat(C6033.m17504(bArr, 18, 8)));
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        byte[] bArr = this.f77940;
        return "MacSigningKey=".concat(C6033.m17504(bArr, 0, bArr.length));
    }
}
