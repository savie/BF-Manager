package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֨ۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes2.dex */
public final class C0907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f3639;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m3623(int i) {
        ByteBuffer byteBufferAllocate;
        if (i < 20480) {
            i = UMModuleRegister.PUSH_EVENT_VALUE_HIGH;
        }
        ByteBuffer byteBuffer = this.f3639;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            byteBufferAllocate = (ByteBuffer) this.f3639.clear();
        } else {
            byteBufferAllocate = ByteBuffer.allocate((i + i) >> 1);
        }
        this.f3639 = null;
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3624(ByteBuffer byteBuffer) {
        this.f3639 = byteBuffer;
    }
}
