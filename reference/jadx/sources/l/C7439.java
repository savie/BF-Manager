package l;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes4.dex */
public final class C7439 extends C14618 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C17880 f24480;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C20864 f24481;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23848 f24482;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3710 f24483;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C12659 f24484;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C17134 f24485;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C16388 f24486;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C24594 f24487;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7856 f24488;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6694 f24489;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20387(C7439 c7439, C7110 c7110, Set set) {
        C1144 c1144 = (C1144) c7110;
        c7439.f24488.m21389(new C10092(c1144.m34370(), (String) c1144.f61429, c1144.m4217()), set);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20384(C7439 c7439, C7110 c7110, Set set) {
        C1144 c1144 = (C1144) c7110;
        c7439.f24488.m21387(new C2635(c1144.m34370(), (String) c1144.f61429, c1144.m4217()), set);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m20386(C7439 c7439, C7110 c7110, Set set) {
        c7439.f24488.m21388(new C8601(c7110.m34370(), (String) c7110.f61429), set);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20383(C7439 c7439, C7110 c7110) {
        c7439.f24488.m21390(new C13821(c7110.m34370(), (String) c7110.f61429));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.᩺᩸᩺] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ܽ᩸᩺] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ܶ᩸᩺] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.᩹᩸᩺] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ۨ᩸᩺] */
    public C7439(final C17355 c17355) {
        super(c17355.f20376, EnumC13127.f41960);
        this.f24485 = new C17134(this);
        this.f24480 = new BiConsumer() { // from class: l.ܽ᩸᩺
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C7439.m20387(this.f58607, (C7110) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C23501.$default$andThen(this, biConsumer);
            }
        };
        this.f24486 = new BiConsumer() { // from class: l.ܶ᩸᩺
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C7439.m20384(this.f53180, (C7110) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C23501.$default$andThen(this, biConsumer);
            }
        };
        this.f24482 = new BiConsumer() { // from class: l.᩹᩸᩺
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C7439.m20386(this.f77224, (C7110) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C23501.$default$andThen(this, biConsumer);
            }
        };
        this.f24483 = new C3710(0, this);
        this.f24488 = new C7856();
        this.f24481 = new C20864(c17355);
        this.f24484 = new Function() { // from class: l.ۨ᩸᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C15291 c15291 = c17355.f20376;
                c15291.getClass();
                return c15291.m36706(EnumC3185.f10346, (C7110) obj);
            }
        };
        this.f24489 = new C6694(c17355);
        this.f24487 = new Function() { // from class: l.᩺᩸᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C15291 c15291 = c17355.f20376;
                c15291.getClass();
                return c15291.m36706(EnumC3185.f10333, (C7110) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m20390() {
        this.f24488.m21392(EnumC16856.f54383.m39816());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20389(String str) {
        this.f24488.m21386(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20388(int i) {
        this.f24488.m21382(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m20391() {
        C22422 c22422M21381 = this.f24488.m21381();
        EnumC14896 enumC14896 = EnumC14896.f48655;
        C9346 c9346 = c22422M21381.f72615;
        C6694 c6694 = this.f24489;
        C20864 c20864 = this.f24481;
        enumC14896.f48662 = new C21610(c9346, c6694, c20864);
        enumC14896.f48658 = new C8930(c22422M21381.f72614, c6694, c20864);
        Map map = c22422M21381.f72613;
        C24594 c24594 = this.f24487;
        enumC14896.f48659 = new C9675(map, c24594, c6694);
        enumC14896.f48660 = new C9675(c22422M21381.f72618, c24594, c6694);
        Set set = c22422M21381.f72616;
        C12659 c12659 = this.f24484;
        enumC14896.f48661 = new C8930(set, c12659, null);
        enumC14896.f48657 = new C9675(c22422M21381.f72617, c12659, c12659);
    }

    @Override // l.C14618
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1603() {
        return EnumC14896.f48655.getLength();
    }

    @Override // l.C14618, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo1599(interfaceC9397);
        EnumC14896.f48655.mo1599(interfaceC9397);
    }
}
