package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۤ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10495 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f33392;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Charset f33393;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33394;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f33395;

    public C10495(Charset charset, String str, int i, byte[] bArr) {
        this.f33393 = charset;
        this.f33395 = str;
        this.f33394 = i;
        this.f33392 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m26955() {
        byte[] bArr = this.f33392;
        return bArr == null ? new byte[0] : (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26954(byte[] bArr) {
        return C22430.m50584(bArr) == C22430.m50580(this.f33395);
    }
}
