package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3555 implements InterfaceC13911 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f13098;

    @Override // l.InterfaceC13911
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream mo10545() {
        return C4737.m13105(this);
    }

    @Override // l.InterfaceC13911
    public final InputStream getInputStream() {
        return new C7033(this.f13098);
    }

    public C3555(byte[] bArr) {
        this.f13098 = bArr;
    }

    @Override // l.InterfaceC13911
    public final long length() {
        return this.f13098.length;
    }
}
