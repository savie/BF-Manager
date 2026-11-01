package l;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16955 extends AbstractC21188 {
    @Override // l.AbstractC21188
    /* JADX INFO: renamed from: ۙ */
    public final C0987 mo15037(C7783 c7783, ByteBuffer byteBuffer) {
        return new C0987(m39738(new C2460(byteBuffer.array(), byteBuffer.limit())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0726 m39738(C2460 c2460) {
        String strM7514 = c2460.m7514();
        strM7514.getClass();
        String strM7515 = c2460.m7514();
        strM7515.getClass();
        return new C0726(strM7514, strM7515, c2460.m7529(), c2460.m7529(), Arrays.copyOfRange(c2460.m7518(), c2460.m7500(), c2460.m7509()));
    }
}
