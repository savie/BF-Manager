package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19760 extends AbstractC19054 implements InterfaceC4567 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f63496;

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC19054, l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC0106 c16335;
        if (consumer instanceof InterfaceC0106) {
            c16335 = (InterfaceC0106) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c16335 = new C16335(consumer);
        }
        return tryAdvance((Object) c16335);
    }

    @Override // l.AbstractC19054, l.InterfaceC20693
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

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC19054
    /* JADX INFO: renamed from: ۙ */
    public final void mo4947(int i, Object obj) {
        ((InterfaceC0106) obj).mo1138(this.f63496.f31233[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19760(C9177 c9177) {
        super(c9177);
        this.f63496 = c9177;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19760(C9177 c9177, int i, int i2, boolean z) {
        super(c9177, i, i2, z);
        this.f63496 = c9177;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f61617 ? 256 : 320;
    }

    @Override // l.AbstractC19054
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC19054 mo4946(int i, int i2, boolean z) {
        return new C19760(this.f63496, i, i2, z);
    }
}
