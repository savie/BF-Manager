package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes2.dex */
public final class C24615 extends AbstractC18647 implements InterfaceC16321 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f79727;

    @Override // l.AbstractC18647, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17813.m41657(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC18647, l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17813.m41658(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16321, l.InterfaceC8409
    public final InterfaceC16564 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC18647
    /* JADX INFO: renamed from: ۙ */
    public final void mo12139(int i, Object obj) {
        ((InterfaceC12089) obj).mo10258(this.f79727.f62668[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24615(C19393 c19393) {
        super(c19393);
        this.f79727 = c19393;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24615(C19393 c19393, int i, int i2, boolean z) {
        super(c19393, i, i2, z);
        this.f79727 = c19393;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f60639 ? 257 : 321;
    }

    @Override // l.AbstractC18647
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18647 mo12138(int i, int i2, boolean z) {
        return new C24615(this.f79727, i, i2, z);
    }
}
