package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۨۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J9EH */
/* JADX INFO: loaded from: classes3.dex */
public final class C11627 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Charset f39051 = C7393.f24570;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28968(C21356 c21356, byte[] bArr, byte[]... bArr2) {
        try {
            c21356.getClass();
            InterfaceC8618 interfaceC8618M47886 = C21356.m47886("HMACT64");
            interfaceC8618M47886.init(bArr);
            for (byte[] bArr3 : bArr2) {
                interfaceC8618M47886.update(bArr3);
            }
            return interfaceC8618M47886.mo3570();
        } catch (C7206 e) {
            throw new C16338(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28969(C21356 c21356, byte[]... bArr) {
        try {
            c21356.getClass();
            C15007 c15007M47885 = C21356.m47885("MD5");
            for (byte[] bArr2 : bArr) {
                c15007M47885.m35984(bArr2);
            }
            return c15007M47885.m35986();
        } catch (C7206 e) {
            throw new C16338(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28967(C21356 c21356, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        try {
            c21356.getClass();
            InterfaceC7912 interfaceC7912M23969 = C9324.m23969();
            interfaceC7912M23969.mo5340(EnumC18495.ENCRYPT, bArr);
            interfaceC7912M23969.doFinal(bArr3, interfaceC7912M23969.mo5339(bArr2.length, bArr2, bArr3));
            return bArr3;
        } catch (C7206 e) {
            throw new C16338(e);
        }
    }
}
