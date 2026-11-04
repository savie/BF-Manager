package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16941 extends AbstractC23655 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f55346;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumSet f55347;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24928 f55348;

    public AbstractC16941(InterfaceC24928 interfaceC24928, EnumC7687... enumC7687Arr) {
        EnumSet enumSetCopyOf;
        this.f55348 = interfaceC24928;
        if (enumC7687Arr.length == 0) {
            enumSetCopyOf = EnumSet.noneOf(EnumC7687.class);
        } else {
            enumSetCopyOf = EnumSet.copyOf((Collection) Arrays.asList(enumC7687Arr));
        }
        this.f55347 = enumSetCopyOf;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public void mo4670(Iterable iterable, String str) {
        throw new UnsupportedOperationException("not supported for " + this.f55348);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC24329 m39917(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new IllegalArgumentException("empty path for directory");
        }
        InterfaceC24329 interfaceC24329 = (InterfaceC24329) it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("path too long for directory");
        }
        m39916(interfaceC24329);
        return interfaceC24329;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m39916(InterfaceC24329 interfaceC24329) {
        C17359.requireNonNull(interfaceC24329);
        if (!C3445.exists(interfaceC24329, new EnumC20599[0])) {
            throw new FileNotFoundException(interfaceC24329 + ": does not exist");
        }
        if (C3445.isDirectory(interfaceC24329, new EnumC20599[0])) {
            return;
        }
        throw new IOException(interfaceC24329 + ": not a directory");
    }
}
