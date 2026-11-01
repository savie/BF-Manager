package l;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: l.ۜ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 098W */
/* JADX INFO: loaded from: classes.dex */
public class C6753 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f22770;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteArrayOutputStream f22771;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f22772;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f22773;

    static {
        ApplicationC6132.m17119(88);
    }

    public native C6753(boolean z);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private native void m18255();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18256(int i) {
        if (this.f22772) {
            return;
        }
        int i2 = this.f22770;
        int i3 = i2 + 1;
        this.f22770 = i3;
        byte[] bArr = this.f22773;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m18255();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18259(int i) {
        m18256((byte) (i & 255));
        m18256((byte) ((i >>> 8) & 255));
        m18256((byte) ((i >>> 16) & 255));
        m18256((byte) ((i >>> 24) & 255));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18258(int i) {
        m18256((byte) ((i >>> 24) & 255));
        m18256((byte) ((i >>> 16) & 255));
        m18256((byte) ((i >>> 8) & 255));
        m18256((byte) (i & 255));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m18257() {
        if (this.f22772) {
            throw new RuntimeException();
        }
        m18255();
        return this.f22771.toByteArray();
    }
}
