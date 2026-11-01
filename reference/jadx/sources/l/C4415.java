package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4415 extends AbstractC19939 implements InterfaceC20693, Consumer {
    public Object f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

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

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        C13638.requireNonNull(consumer);
        while (e() != EnumC15000.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C13638.requireNonNull(consumer);
        C3916 c3916 = null;
        while (true) {
            EnumC15000 enumC15000E = e();
            if (enumC15000E == EnumC15000.NO_MORE) {
                return;
            }
            EnumC15000 enumC15000 = EnumC15000.MAYBE_MORE;
            InterfaceC20693 interfaceC20693 = this.a;
            if (enumC15000E == enumC15000) {
                int i = this.c;
                if (c3916 == null) {
                    c3916 = new C3916(i);
                } else {
                    c3916.a = 0;
                }
                long j = 0;
                while (interfaceC20693.tryAdvance(c3916)) {
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
                    consumer.accept(c3916.b[i2]);
                }
            } else {
                interfaceC20693.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // l.AbstractC19939
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        return new C4415(interfaceC20693, this);
    }
}
