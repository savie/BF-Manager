package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13570 implements AutoCloseable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C6859 f43078;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C13570 f43079;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f43080;

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۜۗۨ] */
    static {
        final C8350 c8350 = new C8350();
        f43078 = new ThreadLocal() { // from class: l.ۜۗۨ
            @Override // java.lang.ThreadLocal
            public final /* synthetic */ Object initialValue() {
                return c8350.get();
            }
        };
        f43079 = new C13570(null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13570 m33276() {
        Object[] objArr = (Object[]) f43078.get();
        if (((Boolean) objArr[0]).booleanValue()) {
            byte[] bArr = C5125.f17846;
            return new C13570(new char[8192]);
        }
        objArr[0] = Boolean.TRUE;
        return f43079;
    }

    public C13570(char[] cArr) {
        this.f43080 = cArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m33277() {
        char[] cArr = this.f43080;
        return cArr != null ? cArr : (char[]) ((Object[]) f43078.get())[1];
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f43080 == null) {
            Object[] objArr = (Object[]) f43078.get();
            Arrays.fill((char[]) objArr[1], (char) 0);
            objArr[0] = Boolean.FALSE;
        }
    }
}
