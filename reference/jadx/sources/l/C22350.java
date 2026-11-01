package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes.dex */
public final class C22350 extends AbstractC13178 implements Consumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f73020;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4328 f73021;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22350(InterfaceC20693 interfaceC20693, long j, C4328 c4328) {
        super(interfaceC20693, j);
        this.f73021 = c4328;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f73020 = obj;
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        if (!this.f43873.tryAdvance(this)) {
            return false;
        }
        try {
            C4328 c4328 = this.f73021;
            Object obj = this.f73020;
            long j = this.f43874;
            this.f43874 = 1 + j;
            if (!((C12188) c4328.f15523).apply(obj)) {
                j = -1;
            }
            consumer.accept(Long.valueOf(j));
            return true;
        } finally {
            this.f73020 = null;
        }
    }
}
