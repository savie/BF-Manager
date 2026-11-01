package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܿۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8M6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17258 extends C16033 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f54990;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f54991;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f54992;

    @Override // l.C16033, l.AbstractC18148
    /* JADX INFO: renamed from: ܰ */
    public final void mo7() {
        super.mo7();
        this.f54991 = 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m40219(int i) {
        C2023.m6507(i > 0);
        this.f54990 = i;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m40222() {
        return this.f54992;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m40223() {
        return this.f54991;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m40221() {
        return this.f54991 > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40220(C16033 c16033) {
        ByteBuffer byteBuffer;
        C2023.m6507(!c16033.m38026());
        C2023.m6507(!c16033.m42268());
        C2023.m6507(!c16033.m42264());
        if (m40221()) {
            if (this.f54991 >= this.f54990) {
                return false;
            }
            ByteBuffer byteBuffer2 = c16033.f51912;
            if (byteBuffer2 != null && (byteBuffer = this.f51912) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f54991;
        this.f54991 = i + 1;
        if (i == 0) {
            this.f51910 = c16033.f51910;
            if (c16033.m42269()) {
                m42267(1);
            }
        }
        ByteBuffer byteBuffer3 = c16033.f51912;
        if (byteBuffer3 != null) {
            m38027(byteBuffer3.remaining());
            this.f51912.put(byteBuffer3);
        }
        this.f54992 = c16033.f51910;
        return true;
    }

    public C17258() {
        super(2, 0);
        this.f54990 = 32;
    }
}
