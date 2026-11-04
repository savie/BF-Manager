package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public final class C8206 extends AbstractC18647 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f27031;

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
    /* JADX INFO: renamed from: ۙ */
    public final void mo12139(int i, Object obj) {
        ((Consumer) obj).accept(this.f27031.f62673[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8206(C19393 c19393) {
        super(c19393);
        this.f27031 = c19393;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8206(C19393 c19393, int i, int i2, boolean z) {
        super(c19393, i, i2, z);
        this.f27031 = c19393;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f60639 ? 0 : 64;
    }

    @Override // l.AbstractC18647
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18647 mo12138(int i, int i2, boolean z) {
        return new C8206(this.f27031, i, i2, z);
    }
}
