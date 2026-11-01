package l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܽۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16349 extends C17759 implements InterfaceC15021 {
    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(int i) {
        AbstractC22686.t();
        throw null;
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(long j) {
        AbstractC22686.u();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC8857
    public final /* synthetic */ void n(Double d) {
        AbstractC22686.n(this, d);
    }

    @Override // l.InterfaceC23280
    public final /* bridge */ /* synthetic */ InterfaceC8616 build() {
        build();
        return this;
    }

    @Override // l.InterfaceC15021, l.InterfaceC23280
    public final InterfaceC7163 build() {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(dArr.length)));
    }

    @Override // l.InterfaceC19171
    public final void c(long j) {
        double[] dArr = this.a;
        if (j != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(dArr.length)));
        }
        this.b = 0;
    }

    @Override // l.InterfaceC19171
    public final void accept(double d) {
        int i = this.b;
        double[] dArr = this.a;
        if (i < dArr.length) {
            this.b = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // l.InterfaceC19171
    public final void end() {
        int i = this.b;
        double[] dArr = this.a;
        if (i < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // l.C17759
    public final String toString() {
        double[] dArr = this.a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }
}
