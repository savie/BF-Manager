package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18243 extends AbstractC0315 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18949 f58232;

    @Override // l.AbstractC20777, l.InterfaceC20693
    public final int characteristics() {
        return 16465;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18243(C18949 c18949, int i, int i2) {
        super(i, i2);
        this.f58232 = c18949;
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13685(int i) {
        return this.f58232.f61363.f25323[i];
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7371 mo13686(int i, int i2) {
        return new C18243(this.f58232, i, i2);
    }

    @Override // l.AbstractC20777, l.AbstractC1309, l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C7660 c7660 = this.f58232.f61363;
        Object[] objArr = c7660.f25323;
        int i = c7660.f25321;
        while (true) {
            int i2 = this.f67579;
            if (i2 >= i) {
                return;
            }
            this.f67579 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
