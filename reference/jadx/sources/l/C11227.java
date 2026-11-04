package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C11227 extends AbstractC20178 implements Consumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0747 f35417;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f35418;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11227(InterfaceC8409 interfaceC8409, long j, C0747 c0747) {
        super(interfaceC8409, j);
        this.f35417 = c0747;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f35418 = obj;
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        if (!this.f64809.tryAdvance(this)) {
            return false;
        }
        try {
            C0747 c0747 = this.f35417;
            Object obj = this.f35418;
            long j = this.f64810;
            this.f64810 = 1 + j;
            if (!((C14912) c0747.f2725).apply(obj)) {
                j = -1;
            }
            consumer.accept(Long.valueOf(j));
            return true;
        } finally {
            this.f35418 = null;
        }
    }
}
