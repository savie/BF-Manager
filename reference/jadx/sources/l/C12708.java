package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۨ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes4.dex */
public final class C12708 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f40698;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m31496(int i) {
        ByteBuffer byteBufferAllocate;
        if (i < 20480) {
            i = UMModuleRegister.PUSH_EVENT_VALUE_HIGH;
        }
        ByteBuffer byteBuffer = this.f40698;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            byteBufferAllocate = (ByteBuffer) this.f40698.clear();
        } else {
            byteBufferAllocate = ByteBuffer.allocate((i + i) >> 1);
        }
        this.f40698 = null;
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31497(ByteBuffer byteBuffer) {
        this.f40698 = byteBuffer;
    }
}
