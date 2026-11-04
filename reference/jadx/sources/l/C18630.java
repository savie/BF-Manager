package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18630 extends AbstractC16547 implements InterfaceC8409, Consumer {
    public Object f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        C17359.requireNonNull(consumer);
        while (e() != EnumC4615.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C17359.requireNonNull(consumer);
        C8846 c8846 = null;
        while (true) {
            EnumC4615 enumC4615E = e();
            if (enumC4615E == EnumC4615.NO_MORE) {
                return;
            }
            EnumC4615 enumC4615 = EnumC4615.MAYBE_MORE;
            InterfaceC8409 interfaceC8409 = this.a;
            if (enumC4615E == enumC4615) {
                int i = this.c;
                if (c8846 == null) {
                    c8846 = new C8846(i);
                } else {
                    c8846.a = 0;
                }
                long j = 0;
                while (interfaceC8409.tryAdvance(c8846)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long jA = a(j);
                for (int i2 = 0; i2 < jA; i2++) {
                    consumer.accept(c8846.b[i2]);
                }
            } else {
                interfaceC8409.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // l.AbstractC16547
    public final InterfaceC8409 b(InterfaceC8409 interfaceC8409) {
        return new C18630(interfaceC8409, this);
    }
}
