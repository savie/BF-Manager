package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩷᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8K8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21188 {
    /* JADX INFO: renamed from: ۙ */
    public abstract C0987 mo15037(C7783 c7783, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0987 m47639(C7783 c7783) {
        ByteBuffer byteBuffer = c7783.f51912;
        byteBuffer.getClass();
        C2023.m6507(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo15037(c7783, byteBuffer);
    }
}
