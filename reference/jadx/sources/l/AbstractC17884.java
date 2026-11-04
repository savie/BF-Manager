package l;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܽ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17884 extends AbstractC16547 implements InterfaceC9154 {
    public abstract void g(Object obj);

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

    public abstract AbstractC4372 j(int i);

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        C17359.requireNonNull(obj);
        while (e() != EnumC4615.NO_MORE && ((InterfaceC9154) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                g(obj);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(Object obj) {
        C17359.requireNonNull(obj);
        AbstractC4372 abstractC4372J = null;
        while (true) {
            EnumC4615 enumC4615E = e();
            if (enumC4615E == EnumC4615.NO_MORE) {
                return;
            }
            EnumC4615 enumC4615 = EnumC4615.MAYBE_MORE;
            InterfaceC8409 interfaceC8409 = this.a;
            if (enumC4615E == enumC4615) {
                int i = this.c;
                if (abstractC4372J == null) {
                    abstractC4372J = j(i);
                } else {
                    abstractC4372J.b = 0;
                }
                long j = 0;
                while (((InterfaceC9154) interfaceC8409).tryAdvance(abstractC4372J)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    abstractC4372J.a(obj, a(j));
                }
            } else {
                ((InterfaceC9154) interfaceC8409).forEachRemaining(obj);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
