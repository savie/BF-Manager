package l;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2J5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18549 implements FileFilter, FilenameFilter, InterfaceC4191, Serializable {
    public static final long serialVersionUID = 8782512160909720199L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String f60268 = Boolean.TRUE.toString();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C18549 f60267 = new C18549();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return true;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return true;
    }

    @Override // l.InterfaceC4191
    public final boolean matches(InterfaceC24329 interfaceC24329) {
        EnumC16123 enumC16123 = EnumC16123.CONTINUE;
        EnumC16123 enumC16124 = EnumC16123.TERMINATE;
        return true;
    }

    public final String toString() {
        return f60268;
    }
}
