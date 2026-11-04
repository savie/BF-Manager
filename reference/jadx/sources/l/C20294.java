package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: SATH */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20294 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46630(InterfaceC12089 interfaceC12089, int i) {
        interfaceC12089.mo10258(C8485.m22804(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46631(InterfaceC12089 interfaceC12089, Character ch) {
        interfaceC12089.mo10258(ch.charValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC12089 m46629(InterfaceC12089 interfaceC12089, final IntConsumer intConsumer) {
        InterfaceC12089 interfaceC120810;
        if (intConsumer instanceof InterfaceC12089) {
            interfaceC120810 = (InterfaceC12089) intConsumer;
        } else {
            C17359.requireNonNull(intConsumer);
            interfaceC120810 = new InterfaceC12089() { // from class: l.᩹ۗ᩹
                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    C20294.m46630(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo10259((Character) obj);
                }

                @Override // l.InterfaceC12089
                /* JADX INFO: renamed from: ۤ */
                public final void mo10258(char c) {
                    intConsumer.accept(c);
                }

                @Override // l.InterfaceC12089
                /* JADX INFO: renamed from: ᩷ */
                public final /* synthetic */ void mo10259(Character ch) {
                    C20294.m46631((InterfaceC12089) this, ch);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return C20294.m46629((InterfaceC12089) this, intConsumer2);
                }

                @Override // l.InterfaceC12089
                /* JADX INFO: renamed from: ۤ */
                public final C3140 mo10257(InterfaceC12089 interfaceC120811) {
                    return new C3140(this, interfaceC120811);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC12089.mo10257(interfaceC120810);
    }
}
