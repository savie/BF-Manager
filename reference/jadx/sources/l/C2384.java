package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2384 implements AutoCloseable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9095 f7676;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C2384 f7677;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f7678;

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۡۗۨ] */
    static {
        final C0893 c0893 = new C0893();
        f7676 = new ThreadLocal() { // from class: l.ۡۗۨ
            @Override // java.lang.ThreadLocal
            public final /* synthetic */ Object initialValue() {
                return c0893.get();
            }
        };
        f7677 = new C2384(null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2384 m8086() {
        Object[] objArr = (Object[]) f7676.get();
        if (((Boolean) objArr[0]).booleanValue()) {
            byte[] bArr = C5125.f17846;
            return new C2384(new byte[8192]);
        }
        objArr[0] = Boolean.TRUE;
        return f7677;
    }

    public C2384(byte[] bArr) {
        this.f7678 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m8087() {
        byte[] bArr = this.f7678;
        return bArr != null ? bArr : (byte[]) ((Object[]) f7676.get())[1];
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f7678 == null) {
            Object[] objArr = (Object[]) f7676.get();
            Arrays.fill((byte[]) objArr[1], (byte) 0);
            objArr[0] = Boolean.FALSE;
        }
    }
}
