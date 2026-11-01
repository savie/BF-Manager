package l;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3883 implements Iterator {
    public final DirectoryStream.Filter a;
    public final File[] b;
    public int c = 0;
    public final /* synthetic */ C6706 d;

    public C3883(C6706 c6706, InterfaceC3800 interfaceC3800, DirectoryStream.Filter filter) {
        this.d = c6706;
        File[] fileArrListFiles = interfaceC3800.toFile().listFiles();
        this.b = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        this.a = filter;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.c--;
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C15174 next() {
        C15174 c15174;
        do {
            int i = this.c;
            File[] fileArr = this.b;
            if (i >= fileArr.length) {
                return null;
            }
            this.c = i + 1;
            File file = fileArr[i];
            C22229 c22229 = this.d.g;
            String path = file.getPath();
            C6706 c6706 = this.d;
            c15174 = new C15174(c22229, path, c6706.e, c6706.f);
            try {
            } catch (IOException e) {
                throw new DirectoryIteratorException(e);
            }
        } while (!this.a.mo14669accept(c15174));
        return c15174;
    }
}
