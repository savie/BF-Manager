package l;

import java.security.PrivilegedExceptionAction;

/* JADX INFO: renamed from: l.᩹ۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZA */
/* JADX INFO: loaded from: classes.dex */
public final class C22221 implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12282 f72662;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1053 f72663;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f72664;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f72665;

    public C22221(C1053 c1053, String str, String str2, C12282 c12282, boolean z) {
        this.f72663 = c1053;
        this.f72664 = str2;
        this.f72662 = c12282;
        this.f72665 = z;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        C1053 c1053 = this.f72663;
        return c1053.m3972().mo43141(c1053.getContext(), this.f72664, this.f72662.m30521(), this.f72665);
    }
}
