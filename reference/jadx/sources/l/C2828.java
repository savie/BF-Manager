package l;

import java.security.PrivilegedExceptionAction;

/* JADX INFO: renamed from: l.ۖܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2828 implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8794 f9288;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f9289;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f9290;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3464 f9291;

    public C2828(C8794 c8794, String str, String str2, C3464 c3464, boolean z) {
        this.f9288 = c8794;
        this.f9289 = str2;
        this.f9291 = c3464;
        this.f9290 = z;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        C8794 c8794 = this.f9288;
        return c8794.m23609().mo45910(c8794.getContext(), this.f9289, this.f9291.m11403(), this.f9290);
    }
}
