package l;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩸᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O2J5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21898 implements FileFilter, FilenameFilter, InterfaceC6623, Serializable {
    public static final long serialVersionUID = 8782512160909720199L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String f71028 = Boolean.TRUE.toString();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C21898 f71027 = new C21898();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return true;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return true;
    }

    @Override // l.InterfaceC6623
    public final boolean matches(InterfaceC3800 interfaceC3800) {
        EnumC11563 enumC11563 = EnumC11563.CONTINUE;
        EnumC11563 enumC11564 = EnumC11563.CONTINUE;
        EnumC11563 enumC11565 = EnumC11563.TERMINATE;
        return true;
    }

    public final String toString() {
        return f71028;
    }
}
