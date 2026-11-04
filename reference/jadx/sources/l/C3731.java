package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C3731 extends AbstractC18647 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f12814;

    @Override // l.InterfaceC8409
    public /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC18647
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12139(int i, Object obj) {
        ((Consumer) obj).accept(new C4477(this.f12814, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3731(C19393 c19393) {
        super(c19393);
        this.f12814 = c19393;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3731(C19393 c19393, int i, int i2, boolean z) {
        super(c19393, i, i2, z);
        this.f12814 = c19393;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f60639 ? 1 : 65;
    }

    @Override // l.AbstractC18647
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18647 mo12138(int i, int i2, boolean z) {
        return new C3731(this.f12814, i, i2, z);
    }
}
