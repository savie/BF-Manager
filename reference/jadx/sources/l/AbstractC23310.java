package l;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 92JU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23310 implements FileFilter, FilenameFilter, InterfaceC6623, InterfaceC2389 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC11563 f75561;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC11563 f75562;

    @Override // java.io.FileFilter
    public abstract boolean accept(File file);

    /* JADX INFO: renamed from: ۙ */
    public abstract EnumC11563 mo37189(InterfaceC3800 interfaceC3800);

    @Override // l.InterfaceC2389
    public final EnumC11563 postVisitDirectory(Object obj, IOException iOException) {
        return EnumC11563.CONTINUE;
    }

    @Override // l.InterfaceC2389
    public final EnumC11563 preVisitDirectory(Object obj, InterfaceC20735 interfaceC20735) {
        return mo37189((InterfaceC3800) obj);
    }

    @Override // l.InterfaceC2389
    public final EnumC11563 visitFile(Object obj, InterfaceC20735 interfaceC20735) {
        return mo37189((InterfaceC3800) obj);
    }

    @Override // l.InterfaceC2389
    public final EnumC11563 visitFileFailed(Object obj, IOException iOException) {
        return EnumC11563.CONTINUE;
    }

    public AbstractC23310(EnumC11563 enumC11563, EnumC11563 enumC11564) {
        this.f75561 = enumC11563;
        this.f75562 = enumC11564;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        C13638.requireNonNull(str, "name");
        return accept(new File(file, str));
    }

    @Override // l.InterfaceC6623
    public final boolean matches(InterfaceC3800 interfaceC3800) {
        return ((C15549) this).mo37189(interfaceC3800) != EnumC11563.TERMINATE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC11563 m51384(boolean z) {
        return z ? this.f75561 : this.f75562;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
