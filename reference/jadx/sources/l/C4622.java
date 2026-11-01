package l;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۙۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4622 extends AbstractC1094 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4622(AbstractC5752 abstractC5752, InterfaceC19171 interfaceC19171, int i) {
        super(interfaceC19171);
        this.b = i;
        this.c = abstractC5752;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4622(InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.b = 0;
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public void c(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.c(-1L);
                break;
            case 1:
            default:
                super.c(j);
                break;
            case 2:
                this.a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((Set) this.c).contains(obj)) {
                    ((Set) this.c).add(obj);
                    this.a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((C22699) this.c).t).accept(obj);
                this.a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((C22699) this.c).t).test(obj)) {
                    this.a.accept(obj);
                }
                break;
            case 3:
                this.a.accept(((C9509) this.c).t.apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((C2942) this.c).t).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((C15727) this.c).t).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((C15644) this.c).t).applyAsDouble(obj));
                break;
        }
    }
}
