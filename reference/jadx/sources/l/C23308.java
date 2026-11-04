package l;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: l.᩹ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 098W */
/* JADX INFO: loaded from: classes.dex */
public class C23308 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteArrayOutputStream f75503;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f75504;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f75505;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f75506;

    static {
        ApplicationC23172.m52091(166);
    }

    public native C23308(boolean z);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private native void m52449();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52450(int i) {
        if (this.f75504) {
            return;
        }
        int i2 = this.f75506;
        int i3 = i2 + 1;
        this.f75506 = i3;
        byte[] bArr = this.f75505;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m52449();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52453(int i) {
        m52450((byte) (i & 255));
        m52450((byte) ((i >>> 8) & 255));
        m52450((byte) ((i >>> 16) & 255));
        m52450((byte) ((i >>> 24) & 255));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m52452(int i) {
        m52450((byte) ((i >>> 24) & 255));
        m52450((byte) ((i >>> 16) & 255));
        m52450((byte) ((i >>> 8) & 255));
        m52450((byte) (i & 255));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m52451() {
        if (this.f75504) {
            throw new RuntimeException();
        }
        m52449();
        return this.f75503.toByteArray();
    }
}
