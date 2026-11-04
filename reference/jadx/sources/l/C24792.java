package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes2.dex */
public final class C24792 extends AbstractC3162 implements InterfaceC6036, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f80241;

    @Override // l.AbstractC3162, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC3162
    /* JADX INFO: renamed from: ۙ */
    public final void mo10343(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f80241.f77781[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24792(C24046 c24046) {
        super(c24046);
        this.f80241 = c24046;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        return this.f80241.f77781[m10342()];
    }
}
