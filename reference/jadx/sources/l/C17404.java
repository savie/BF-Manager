package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܽۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8M6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17404 extends C5690 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f56585;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f56586;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f56587;

    @Override // l.C5690, l.AbstractC13587
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7() {
        super.mo7();
        this.f56586 = 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m40876(int i) {
        C20782.m47565(i > 0);
        this.f56587 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m40875() {
        return this.f56585;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m40874() {
        return this.f56586;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m40877() {
        return this.f56586 > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40873(C5690 c5690) {
        ByteBuffer byteBuffer;
        C20782.m47565(!c5690.m16712());
        C20782.m47565(!c5690.m33308());
        C20782.m47565(!c5690.m33305());
        if (m40877()) {
            if (this.f56586 >= this.f56587) {
                return false;
            }
            ByteBuffer byteBuffer2 = c5690.f19651;
            if (byteBuffer2 != null && (byteBuffer = this.f19651) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f56586;
        this.f56586 = i + 1;
        if (i == 0) {
            this.f19652 = c5690.f19652;
            if (c5690.m33304()) {
                m33307(1);
            }
        }
        ByteBuffer byteBuffer3 = c5690.f19651;
        if (byteBuffer3 != null) {
            m16711(byteBuffer3.remaining());
            this.f19651.put(byteBuffer3);
        }
        this.f56585 = c5690.f19652;
        return true;
    }

    public C17404() {
        super(2, 0);
        this.f56587 = 32;
    }
}
