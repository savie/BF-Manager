package l;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3079 extends InterfaceC16613 {
    @Override // l.InterfaceC16613
    Object compute(Object obj, BiFunction biFunction);

    @Override // l.InterfaceC16613
    Object computeIfAbsent(Object obj, Function function);

    @Override // l.InterfaceC16613
    Object computeIfPresent(Object obj, BiFunction biFunction);

    @Override // l.InterfaceC16613
    void forEach(BiConsumer biConsumer);

    @Override // l.InterfaceC16613
    Object getOrDefault(Object obj, Object obj2);

    @Override // l.InterfaceC16613
    Object merge(Object obj, Object obj2, BiFunction biFunction);

    @Override // l.InterfaceC16613
    void replaceAll(BiFunction biFunction);
}
