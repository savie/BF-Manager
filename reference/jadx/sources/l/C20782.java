package l;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.᩵᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8D9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20782 {
    @Pure
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47565(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47564(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47561(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Pure
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m47568(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m47567(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m47566(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47562(Object obj) {
        obj.getClass();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47563(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
