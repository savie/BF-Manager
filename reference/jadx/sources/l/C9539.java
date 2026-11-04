package l;

import java.security.PrivilegedExceptionAction;

/* JADX INFO: renamed from: l.ۡܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9539 implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16998 f30888;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f30889;

    public C9539(InterfaceC16998 interfaceC16998, byte[] bArr) {
        this.f30888 = interfaceC16998;
        this.f30889 = bArr;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        byte[] bArr = this.f30889;
        return this.f30888.mo5497(bArr == null ? 0 : bArr.length, bArr);
    }
}
