package l;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֡ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0148 extends AbstractC19939 implements InterfaceC10110 {
    public abstract void g(Object obj);

    @Override // l.InterfaceC20693
    public final /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    public abstract AbstractC1862 j(int i);

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        C13638.requireNonNull(obj);
        while (e() != EnumC15000.NO_MORE && ((InterfaceC10110) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                g(obj);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(Object obj) {
        C13638.requireNonNull(obj);
        AbstractC1862 abstractC1862J = null;
        while (true) {
            EnumC15000 enumC15000E = e();
            if (enumC15000E == EnumC15000.NO_MORE) {
                return;
            }
            EnumC15000 enumC15000 = EnumC15000.MAYBE_MORE;
            InterfaceC20693 interfaceC20693 = this.a;
            if (enumC15000E == enumC15000) {
                int i = this.c;
                if (abstractC1862J == null) {
                    abstractC1862J = j(i);
                } else {
                    abstractC1862J.b = 0;
                }
                long j = 0;
                while (((InterfaceC10110) interfaceC20693).tryAdvance(abstractC1862J)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    abstractC1862J.a(obj, a(j));
                }
            } else {
                ((InterfaceC10110) interfaceC20693).forEachRemaining(obj);
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
