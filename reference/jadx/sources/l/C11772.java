package l;

import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.ۨܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes3.dex */
public final class C11772 extends GZIPOutputStream {
    public C11772(OutputStream outputStream, int i) {
        super(outputStream, 65536);
        ((GZIPOutputStream) this).def.setLevel(C2598.f10186[i]);
    }
}
