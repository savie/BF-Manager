package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B8K8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13468 {
    /* JADX INFO: renamed from: ۙ */
    public abstract C19378 mo7730(C15705 c15705, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19378 m33129(C15705 c15705) {
        ByteBuffer byteBuffer = c15705.f19651;
        byteBuffer.getClass();
        C20782.m47565(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo7730(c15705, byteBuffer);
    }
}
