package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩻᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: P9WB */
/* JADX INFO: loaded from: classes.dex */
public final class C23964 implements InterfaceC5619 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77699 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f77700 = C13488.m32997(C23964.class);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f77701;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f77702;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f77703;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f77704;

    public C23964(byte[] bArr, int i) {
        this.f77702 = C16577.m38992();
        this.f77704 = bArr;
        this.f77703 = 0;
        InterfaceC4314 interfaceC4314 = f77700;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("macSigningKey:");
            interfaceC4314.mo12127(C5993.m16281(bArr, 0, bArr.length));
        }
    }

    public C23964(byte[] bArr) {
        this.f77702 = C16577.m38992();
        this.f77704 = bArr;
    }

    public C23964(byte[] bArr, Object obj) {
        this.f77702 = C16577.m38992();
        this.f77704 = bArr;
        this.f77703 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52787(byte[] bArr, int i, int i2) {
        InterfaceC4314 interfaceC4314 = f77700;
        if (interfaceC4314.mo12133()) {
            StringBuilder sb = new StringBuilder("update: ");
            C23821.m52500(sb, this.f77701, " ", i, ":");
            sb.append(i2);
            interfaceC4314.mo12127(sb.toString());
            interfaceC4314.mo12127(C5993.m16281(bArr, i, Math.min(i2, 256)));
        }
        if (i2 == 0) {
            return;
        }
        this.f77702.update(bArr, i, i2);
        this.f77701++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m52790() {
        byte[] bArrDigest = this.f77702.digest();
        InterfaceC4314 interfaceC4314 = f77700;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("digest: ");
            interfaceC4314.mo12127(C5993.m16281(bArrDigest, 0, bArrDigest.length));
        }
        this.f77701 = 0;
        return bArrDigest;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52788(byte[] bArr, int i, int i2, InterfaceC9666 interfaceC9666, InterfaceC9666 interfaceC9667) {
        InterfaceC4314 interfaceC4314 = f77700;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Signing with seq " + this.f77703);
        }
        ((AbstractC14792) interfaceC9666).m35437(this.f77703);
        if (interfaceC9667 != null) {
            ((AbstractC14792) interfaceC9667).m35437(this.f77703 + 1);
        }
        try {
            try {
                byte[] bArr2 = this.f77704;
                m52787(bArr2, 0, bArr2.length);
                int i3 = i + 14;
                for (int i4 = 0; i4 < 8; i4++) {
                    bArr[i3 + i4] = 0;
                }
                C4850.m13550(this.f77703, i3, bArr);
                m52787(bArr, i, i2);
                System.arraycopy(m52790(), 0, bArr, i3, 8);
            } catch (Exception e) {
                interfaceC4314.mo12138("Signature failed", (Throwable) e);
            }
        } finally {
            this.f77703 += 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52789(byte[] bArr, int i, int i2, InterfaceC9666 interfaceC9666) {
        AbstractC14792 abstractC14792 = (AbstractC14792) interfaceC9666;
        int i3 = abstractC14792.f48356 & 4;
        InterfaceC4314 interfaceC4314 = f77700;
        if (i3 == 0) {
            interfaceC4314.mo12116("Expected signed response, but is not signed");
            return false;
        }
        byte[] bArr2 = this.f77704;
        m52787(bArr2, 0, bArr2.length);
        m52787(bArr, 4, 14);
        byte[] bArr3 = new byte[8];
        C4850.m13550(abstractC14792.m35436(), 0, bArr3);
        m52787(bArr3, 0, 8);
        if (abstractC14792.mo24564() == 46) {
            C19626 c19626 = (C19626) abstractC14792;
            m52787(bArr, 26, (abstractC14792.f48369 - c19626.m44720()) - 22);
            m52787(c19626.m44717(), c19626.m44719(), c19626.m44720());
        } else {
            m52787(bArr, 26, abstractC14792.f48369 - 22);
        }
        byte[] bArrM52790 = m52790();
        for (int i4 = 0; i4 < 8; i4++) {
            if (bArrM52790[i4] != bArr[i4 + 18]) {
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("signature verification failure");
                    interfaceC4314.mo12135("Expect: ".concat(C5993.m16281(bArrM52790, 0, 8)));
                    interfaceC4314.mo12135("Have: ".concat(C5993.m16281(bArr, 18, 8)));
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        byte[] bArr = this.f77704;
        return "MacSigningKey=".concat(C5993.m16281(bArr, 0, bArr.length));
    }
}
