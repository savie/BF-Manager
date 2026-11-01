package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 27L2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8005 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7299[] f26253;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7299 f26254;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 f26255;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f26256;

    public C8005(final C23800 c23800, InterfaceC7299 interfaceC7299, InterfaceC7299[] interfaceC7299Arr) {
        this.f26254 = interfaceC7299;
        this.f26256 = interfaceC7299.mo18742(c23800);
        this.f26253 = interfaceC7299Arr;
        this.f26255 = (C21825) C11397.of((Object[]) interfaceC7299Arr).map(new Function() { // from class: l.ᩴۜ۟
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
                return ((InterfaceC7299) obj).mo18742(c23800);
            }
        }).collect(C21825.m48587());
    }

    public final int hashCode() {
        return this.f26255.hashCode() + this.f26256.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8005)) {
            return false;
        }
        C8005 c8005 = (C8005) obj;
        return C13638.equals(this.f26256, c8005.f26256) && C13638.equals(this.f26255, c8005.f26255);
    }
}
