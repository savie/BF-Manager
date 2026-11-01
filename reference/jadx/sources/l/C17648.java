package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AFA */
/* JADX INFO: loaded from: classes4.dex */
public final class C17648 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C18724 f56090 = new C18724(new C12710(), new C23978());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m41121(C12481 c12481) {
        f56090.m43259(c12481);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17419 m41119(C12481 c12481) {
        try {
            return (InterfaceC17419) f56090.m43257(c12481);
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m41122(InterfaceC17419 interfaceC17419) {
        try {
            f56090.m43260(interfaceC17419.getKey(), interfaceC17419);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41120(InterfaceC17419 interfaceC17419) {
        try {
            f56090.m43258(interfaceC17419.getKey(), interfaceC17419);
        } catch (Exception unused) {
        }
    }
}
