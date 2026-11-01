package l;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.֨ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1040 implements ObjLongConsumer, LongBinaryOperator, ToLongFunction, BiConsumer, IntFunction, LongFunction, Consumer, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ C1040(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 3:
                break;
        }
        return C2866.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 13:
                break;
            case 15:
                break;
            case 17:
                break;
        }
        return C5689.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 10:
                break;
            case 23:
                break;
        }
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 5:
                return Long.valueOf(j);
            case 12:
                return AbstractC22686.O(j);
            case 14:
                return AbstractC22686.X(j);
            default:
                return AbstractC22686.Y(j);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 1:
                return Math.min(j, j2);
            case 8:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 4:
                return new Long[i];
            case 11:
                return new Object[i];
            case 19:
                return new Object[i];
            case 20:
                return new Integer[i];
            case 21:
                return new Long[i];
            case 22:
                return new Double[i];
            case 25:
                return new Integer[i];
            case 26:
                return new Integer[i];
            case 27:
                return new Long[i];
            case 28:
                return new Long[i];
            default:
                return new Double[i];
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (this.a) {
            case 0:
                ((C14813) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                ((C14813) obj).a((C14813) obj2);
                break;
            default:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 13:
                return new C17385((InterfaceC7163) obj, (InterfaceC7163) obj2);
            case 14:
            case 16:
            default:
                return new C11410((InterfaceC8616) obj, (InterfaceC8616) obj2);
            case 15:
                return new C2505((InterfaceC13036) obj, (InterfaceC13036) obj2);
            case 17:
                return new C18734((InterfaceC23620) obj, (InterfaceC23620) obj2);
        }
    }
}
