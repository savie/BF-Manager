package l;

import java.security.PrivilegedExceptionAction;

/* JADX INFO: renamed from: l.ۚۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5287 implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20769 f18297;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f18298;

    public C5287(InterfaceC20769 interfaceC20769, byte[] bArr) {
        this.f18297 = interfaceC20769;
        this.f18298 = bArr;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        byte[] bArr = this.f18298;
        return this.f18297.mo22944(bArr == null ? 0 : bArr.length, bArr);
    }
}
