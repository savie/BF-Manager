package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۛܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8J1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6493 extends AbstractC16876 implements InterfaceC4255 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f21811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC24393 mo18329(byte[] bArr, int i, boolean z);

    @Override // l.InterfaceC4255
    /* JADX INFO: renamed from: ۙ */
    public final void mo13583(long j) {
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ۙ */
    public final C15384 mo11(C5690 c5690, AbstractC11655 abstractC11655, boolean z) {
        C0526 c0526 = (C0526) c5690;
        AbstractC7984 abstractC7984 = (AbstractC7984) abstractC11655;
        try {
            ByteBuffer byteBuffer = c0526.f19651;
            byteBuffer.getClass();
            abstractC7984.m21770(c0526.f19652, mo18329(byteBuffer.array(), byteBuffer.limit(), z), c0526.f2225);
            abstractC7984.f37779 = false;
            return null;
        } catch (C14695 e) {
            return e;
        }
    }

    public AbstractC6493(String str) {
        super(new C0526[2], new AbstractC7984[2]);
        this.f21811 = str;
        m39833(1024);
    }

    @Override // l.InterfaceC19860
    public final String getName() {
        return this.f21811;
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ᩸ */
    public final C5690 mo17() {
        return new C0526();
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC11655 mo16() {
        return new C12458(this);
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ۙ */
    public final C15384 mo10(Throwable th) {
        return new C14695("Unexpected decode error", th);
    }
}
