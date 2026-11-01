package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۚᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5518 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f18936;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f18937;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Charset f18938;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f18939;

    public C5518(Charset charset, String str, int i, byte[] bArr) {
        this.f18938 = charset;
        this.f18936 = str;
        this.f18939 = i;
        this.f18937 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m15222() {
        byte[] bArr = this.f18937;
        return bArr == null ? new byte[0] : (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15221(byte[] bArr) {
        return C22452.m49944(bArr) == C22452.m49940(this.f18936);
    }
}
