package l;

import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7259 extends AbstractC14316 implements Consumer {
    public final Predicate e;
    public Object f;
    public final /* synthetic */ int g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7259(InterfaceC20693 interfaceC20693, Predicate predicate, int i) {
        super(interfaceC20693);
        this.g = i;
        this.e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7259(InterfaceC20693 interfaceC20693, C7259 c7259, int i) {
        super(interfaceC20693, c7259);
        this.g = i;
        this.e = c7259.e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d = (this.d + 1) & 63;
        this.f = obj;
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.g) {
            case 0:
                boolean z = this.c;
                InterfaceC20693 interfaceC20693 = this.a;
                if (z) {
                    boolean z2 = false;
                    this.c = false;
                    while (true) {
                        zTryAdvance = interfaceC20693.tryAdvance(this);
                        if (zTryAdvance && a() && this.e.test(this.f)) {
                            z2 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z2) {
                        this.b.set(true);
                    }
                    consumer.accept(this.f);
                    return zTryAdvance;
                }
                return interfaceC20693.tryAdvance(consumer);
            default:
                if (this.c && a() && this.a.tryAdvance(this)) {
                    zTest = this.e.test(this.f);
                    if (zTest) {
                        consumer.accept(this.f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.c = false;
                if (!zTest) {
                    this.b.set(true);
                }
                return false;
        }
    }

    @Override // l.AbstractC14316, l.InterfaceC20693
    public InterfaceC20693 trySplit() {
        switch (this.g) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // l.AbstractC14316
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        switch (this.g) {
            case 0:
                return new C7259(interfaceC20693, this, 0);
            default:
                return new C7259(interfaceC20693, this, 1);
        }
    }
}
