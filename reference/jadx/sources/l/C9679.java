package l;

import java.util.Deque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9679 extends AbstractC12818 {
    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC13409 interfaceC13409A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.c == null && (interfaceC13409A = AbstractC12818.a(this.e)) != null) {
                InterfaceC8409 interfaceC8409Spliterator = interfaceC13409A.spliterator();
                this.d = interfaceC8409Spliterator;
                return interfaceC8409Spliterator.tryAdvance(consumer);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            InterfaceC8409 interfaceC8409 = this.c;
            if (interfaceC8409 == null) {
                Deque dequeB = b();
                while (true) {
                    InterfaceC13409 interfaceC13409A = AbstractC12818.a(dequeB);
                    if (interfaceC13409A != null) {
                        interfaceC13409A.forEach(consumer);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                interfaceC8409.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
