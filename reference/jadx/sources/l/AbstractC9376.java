package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9376 extends AbstractC14107 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31745;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumSet f31746;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4290 f31747;

    public AbstractC9376(InterfaceC4290 interfaceC4290, EnumC19730... enumC19730Arr) {
        EnumSet enumSetCopyOf;
        this.f31747 = interfaceC4290;
        if (enumC19730Arr.length == 0) {
            enumSetCopyOf = EnumSet.noneOf(EnumC19730.class);
        } else {
            enumSetCopyOf = EnumSet.copyOf((Collection) Arrays.asList(enumC19730Arr));
        }
        this.f31746 = enumSetCopyOf;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public void mo4919(Iterable iterable, String str) {
        throw new UnsupportedOperationException("not supported for " + this.f31747);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3800 m24053(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new IllegalArgumentException("empty path for directory");
        }
        InterfaceC3800 interfaceC3800 = (InterfaceC3800) it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("path too long for directory");
        }
        m24052(interfaceC3800);
        return interfaceC3800;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m24052(InterfaceC3800 interfaceC3800) {
        C13638.requireNonNull(interfaceC3800);
        if (!C5212.exists(interfaceC3800, new EnumC22146[0])) {
            throw new FileNotFoundException(interfaceC3800 + ": does not exist");
        }
        if (C5212.isDirectory(interfaceC3800, new EnumC22146[0])) {
            return;
        }
        throw new IOException(interfaceC3800 + ": not a directory");
    }
}
