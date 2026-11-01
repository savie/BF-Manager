package l;

import java.util.Deque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0887 extends AbstractC8650 {
    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC8616 interfaceC8616A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.c == null && (interfaceC8616A = AbstractC8650.a(this.e)) != null) {
                InterfaceC20693 interfaceC20693Spliterator = interfaceC8616A.spliterator();
                this.d = interfaceC20693Spliterator;
                return interfaceC20693Spliterator.tryAdvance(consumer);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            InterfaceC20693 interfaceC20693 = this.c;
            if (interfaceC20693 == null) {
                Deque dequeB = b();
                while (true) {
                    InterfaceC8616 interfaceC8616A = AbstractC8650.a(dequeB);
                    if (interfaceC8616A != null) {
                        interfaceC8616A.forEach(consumer);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                interfaceC20693.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
