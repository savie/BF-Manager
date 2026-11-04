package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10596 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22531 f33639;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f33640;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C15071 f33641;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C12303 f33642;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f33643;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21785 f33644;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3180 f33645;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22531 f33646;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C3510 f33647;

    public C10596(byte[] bArr, C18251 c18251, C15071 c15071, C3510 c3510, C12303 c12303, C3180 c3180, C22531 c22531, C22531 c22532, long j, int i) {
        this.f33644 = new C21785(bArr, c18251);
        if (c15071 == null) {
            c15071 = null;
        } else {
            c15071.m36333();
        }
        this.f33641 = c15071;
        this.f33647 = c3510;
        this.f33642 = c12303;
        this.f33645 = c3180;
        this.f33646 = c22531;
        this.f33639 = c22532;
        this.f33640 = j;
        this.f33643 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m27046() {
        C21785 c21785 = this.f33644;
        if (c21785 == null) {
            throw new IllegalStateException("Fragment record is closed");
        }
        return c21785.m49405();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12834 m27045(C7305 c7305, int i) throws Throwable {
        boolean z;
        byte[] bArrM27046 = m27046();
        if (i < 0 || bArrM27046.length > i) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        if (c7305.m19989() != this.f33640 || c7305.length() != this.f33643) {
            throw new IOException("Fragment state belongs to another text revision");
        }
        int length = bArrM27046.length;
        C22531 c22531 = this.f33646;
        long j = length - c22531.f72875;
        C18251 c18251M19990 = c7305.m19990((16 * j) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        C15071 c15071M36330 = null;
        try {
            C18251 c18251M19991 = c7305.m19990((j * 4) + 8192);
            try {
                C15071 c15071 = this.f33641;
                if (c15071 == null) {
                    c15071M36330 = C15071.m36330(this.f33644, c22531, i, c7305);
                } else {
                    c15071.m36333();
                    c15071M36330 = c15071;
                }
                C3180 c3180M10382 = this.f33645;
                C22531 c22532 = this.f33639;
                if (c3180M10382 == null) {
                    c22532.getClass();
                    int i2 = c22532.f72875;
                    c3180M10382 = C3180.m10382(new ByteArrayInputStream(bArrM27046, c22532.f72876, i2), i2, i);
                }
                C3510 c3510 = this.f33647;
                C12303 c12303 = this.f33642;
                C20334 c20334 = c15071M36330.f49217;
                long j2 = this.f33640;
                int i3 = this.f33643;
                int i4 = c22532.f72876;
                C12834 c12834 = new C12834(c3510, c12303, c20334, c3180M10382, j2, i3, Arrays.copyOfRange(bArrM27046, i4, c22532.f72875 + i4));
                c12834.f41125 = c18251M19990;
                c12834.f41122 = c15071M36330;
                if (c18251M19991 == null) {
                    return c12834;
                }
                try {
                    c18251M19991.close();
                    return c12834;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        if (c15071M36330 != null) {
                            c15071M36330.close();
                        }
                        if (c18251M19990 != null) {
                            c18251M19990.close();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (c18251M19991 == null) {
                    throw th2;
                }
                try {
                    c18251M19991.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
                if (!z) {
                    if (c15071M36330 != null) {
                        c15071M36330.close();
                    }
                    if (c18251M19990 != null) {
                        c18251M19990.close();
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18251 m27047(long j) {
        m27046();
        C18251 c18251 = this.f33644.f69473;
        if (c18251 == null) {
            return null;
        }
        return c18251.m42404(j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f33647 = null;
        this.f33642 = null;
        this.f33645 = null;
        C15071 c15071 = this.f33641;
        if (c15071 != null) {
            c15071.close();
            this.f33641 = null;
        }
        C21785 c21785 = this.f33644;
        if (c21785 != null) {
            c21785.close();
            this.f33644 = null;
        }
    }
}
