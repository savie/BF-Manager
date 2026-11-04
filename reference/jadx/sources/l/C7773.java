package l;

import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes4.dex */
public final class C7773 implements DirectoryStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DirectoryStream.Filter f25579;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f25580 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1061 f25581;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18960 f25582;

    public C7773(C18960 c18960, DirectoryStream.Filter filter, C1061 c1061) {
        this.f25582 = c18960;
        this.f25579 = filter;
        this.f25581 = c1061;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25580 = true;
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        if (this.f25580) {
            throw new IllegalStateException("DirectoryStream is closed");
        }
        DirectoryStream.Filter filter = this.f25579;
        return C1170.stream(this.f25582.f61477.m18371(this.f25581.f45594.substring(1))).map(new Function() { // from class: l.֡ۡۘ
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
                return this.f1717.f25582.getPath("/" + ((C8002) obj).getName(), new String[0]);
            }
        }).filter(filter == null ? new C18214(0) : new C23941(3, filter)).iterator();
    }
}
