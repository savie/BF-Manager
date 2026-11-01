package l;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes4.dex */
public final class C8568 extends C12925 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7884 f29615;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1883 f29616;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C21973 f29617;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C13507 f29618;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11390 f29619;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2216 f29620;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C4333 f29621;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9646 f29622;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5039 f29623;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3294 f29624;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m22343(C8568 c8568, C19879 c19879, Set set) {
        C10001 c10001 = (C10001) c19879;
        c8568.f29615.m20800(new C8590(c10001.m25242(), (String) c10001.f43680, c10001.m25267()), set);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22341(C8568 c8568, C19879 c19879, Set set) {
        C10001 c10001 = (C10001) c19879;
        c8568.f29615.m20803(new C20584(c10001.m25242(), (String) c10001.f43680, c10001.m25267()), set);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m22342(C8568 c8568, C19879 c19879, Set set) {
        c8568.f29615.m20801(new C15646(c19879.m25242(), (String) c19879.f43680), set);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22340(C8568 c8568, C19879 c19879) {
        c8568.f29615.m20799(new C0122(c19879.m25242(), (String) c19879.f43680));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.᩹֫ۡ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۢܳۡ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ۗܳۡ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۙ֫ۡ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ܰ֫ۡ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ۖ֫ۡ] */
    public C8568(final C9398 c9398) {
        super(c9398.f20884, EnumC16783.f53717);
        this.f29616 = new C1883(this);
        this.f29622 = new BiConsumer() { // from class: l.ۢܳۡ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C8568.m22343(this.f32445, (C19879) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C2866.$default$andThen(this, biConsumer);
            }
        };
        this.f29624 = new BiConsumer() { // from class: l.ۗܳۡ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C8568.m22341(this.f12196, (C19879) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C2866.$default$andThen(this, biConsumer);
            }
        };
        this.f29621 = new BiConsumer() { // from class: l.ۙ֫ۡ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C8568.m22342(this.f15528, (C19879) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C2866.$default$andThen(this, biConsumer);
            }
        };
        this.f29618 = new Consumer() { // from class: l.ܰ֫ۡ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C8568.m22340(this.f44610, (C19879) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }
        };
        this.f29615 = new C7884();
        this.f29619 = new C11390(c9398);
        this.f29620 = new Function() { // from class: l.ۖ֫ۡ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C12738 c12738 = c9398.f20884;
                c12738.getClass();
                return c12738.m31657(EnumC13776.f45400, (C19879) obj);
            }
        };
        this.f29623 = new C5039(c9398);
        this.f29617 = new Function() { // from class: l.᩹֫ۡ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C12738 c12738 = c9398.f20884;
                c12738.getClass();
                return c12738.m31657(EnumC13776.f45424, (C19879) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m22347() {
        this.f29615.m20804(EnumC23839.f77042.m52558());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22345(String str) {
        this.f29615.m20798(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22344(int i) {
        this.f29615.m20794(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22346() {
        C12118 c12118M20793 = this.f29615.m20793();
        EnumC12801 enumC12801 = EnumC12801.f42631;
        C7178 c7178 = c12118M20793.f40577;
        C5039 c5039 = this.f29623;
        C11390 c11390 = this.f29619;
        enumC12801.f42637 = new C3627(c7178, c5039, c11390);
        enumC12801.f42633 = new C19151(c12118M20793.f40576, c5039, c11390);
        Map map = c12118M20793.f40578;
        C21973 c21973 = this.f29617;
        enumC12801.f42634 = new C18445(map, c21973, c5039);
        enumC12801.f42632 = new C18445(c12118M20793.f40579, c21973, c5039);
        Set set = c12118M20793.f40580;
        C2216 c2216 = this.f29620;
        enumC12801.f42636 = new C19151(set, c2216, null);
        enumC12801.f42635 = new C18445(c12118M20793.f40575, c2216, c2216);
    }

    @Override // l.C12925
    /* JADX INFO: renamed from: ۨ */
    public final int mo7125() {
        return EnumC12801.f42631.getLength();
    }

    @Override // l.C12925, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo2341(interfaceC19275);
        EnumC12801.f42631.mo2341(interfaceC19275);
    }
}
