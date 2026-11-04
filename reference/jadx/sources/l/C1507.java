package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AFA */
/* JADX INFO: loaded from: classes2.dex */
public final class C1507 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C16378 f5240 = new C16378(new C10455(), new C21622());

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m5362(C9864 c9864) {
        f5240.m38872(c9864);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0916 m5359(C9864 c9864) {
        try {
            return (InterfaceC0916) f5240.m38870(c9864);
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                IOException iOException = (IOException) cause;
                C22327.m50389(iOException);
                throw iOException;
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m5361(InterfaceC0916 interfaceC0916) {
        try {
            f5240.m38873(interfaceC0916.getKey(), interfaceC0916);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5360(InterfaceC0916 interfaceC0916) {
        try {
            f5240.m38871(interfaceC0916.getKey(), interfaceC0916);
        } catch (Exception unused) {
        }
    }
}
