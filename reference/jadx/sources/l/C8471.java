package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8471 extends AbstractC18348 implements InterfaceC17040, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f29376;

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(nextByte());
    }

    @Override // l.AbstractC18348, l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC0106 c16335;
        if (consumer instanceof InterfaceC0106) {
            c16335 = (InterfaceC0106) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c16335 = new C16335(consumer);
        }
        forEachRemaining((Object) c16335);
    }

    @Override // l.AbstractC18348
    /* JADX INFO: renamed from: ۙ */
    public final void mo11891(int i, Object obj) {
        ((InterfaceC0106) obj).mo1138(this.f29376.f31233[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8471(C9177 c9177) {
        super(c9177);
        this.f29376 = c9177;
    }

    @Override // l.InterfaceC17040
    public final byte nextByte() {
        return this.f29376.f31233[m42607()];
    }
}
