package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֫ᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8J1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1990 extends AbstractC12505 implements InterfaceC3401 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f7443;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC9753 mo6404(byte[] bArr, int i, boolean z);

    @Override // l.InterfaceC3401
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6405(long j) {
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۙ */
    public final C7565 mo13(C16033 c16033, AbstractC0509 abstractC0509, boolean z) {
        C2717 c2717 = (C2717) c16033;
        AbstractC5540 abstractC5540 = (AbstractC5540) abstractC0509;
        try {
            ByteBuffer byteBuffer = c2717.f51912;
            byteBuffer.getClass();
            abstractC5540.m15246(c2717.f51910, mo6404(byteBuffer.array(), byteBuffer.limit(), z), c2717.f10456);
            abstractC5540.f2203 = false;
            return null;
        } catch (C4834 e) {
            return e;
        }
    }

    public AbstractC1990(String str) {
        super(new C2717[2], new AbstractC5540[2]);
        this.f7443 = str;
        m31059(1024);
    }

    @Override // l.InterfaceC10388
    public final String getName() {
        return this.f7443;
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۖ */
    public final C16033 mo11() {
        return new C2717();
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC0509 mo15() {
        return new C14692(this);
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۙ */
    public final C7565 mo12(Throwable th) {
        return new C4834("Unexpected decode error", th);
    }
}
