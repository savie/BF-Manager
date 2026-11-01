package l;

import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes5.dex */
public final class C19108 implements DirectoryStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7113 f61738;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f61739 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DirectoryStream.Filter f61740;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8525 f61741;

    public C19108(C8525 c8525, DirectoryStream.Filter filter, C7113 c7113) {
        this.f61741 = c8525;
        this.f61740 = filter;
        this.f61738 = c7113;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f61739 = true;
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        if (this.f61739) {
            throw new IllegalStateException("DirectoryStream is closed");
        }
        DirectoryStream.Filter filter = this.f61740;
        return C9030.stream(this.f61741.f29514.m25252(this.f61738.f48629.substring(1))).map(new Function() { // from class: l.۠֡۟
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
                return this.f25740.f61741.getPath("/" + ((C12107) obj).getName(), new String[0]);
            }
        }).filter(filter == null ? new C17696(0) : new C18402(0, filter)).iterator();
    }
}
