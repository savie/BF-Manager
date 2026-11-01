package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8555 extends AbstractC12083 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10672 f29586;

    @Override // l.InterfaceC20693
    public /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC12083
    /* JADX INFO: renamed from: ۙ */
    public final void mo15785(int i, Object obj) {
        ((Consumer) obj).accept(new C19844(this.f29586, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8555(C10672 c10672) {
        super(c10672);
        this.f29586 = c10672;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8555(C10672 c10672, int i, int i2, boolean z) {
        super(c10672, i, i2, z);
        this.f29586 = c10672;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f40440 ? 1 : 65;
    }

    @Override // l.AbstractC12083
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12083 mo15784(int i, int i2, boolean z) {
        return new C8555(this.f29586, i, i2, z);
    }
}
