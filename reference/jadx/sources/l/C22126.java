package l;

import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.᩷ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes.dex */
public final class C22126 extends GZIPOutputStream {
    public C22126(OutputStream outputStream, int i) {
        super(outputStream, 65536);
        ((GZIPOutputStream) this).def.setLevel(C10937.f34593[i]);
    }
}
