package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C17687 extends AbstractC16941 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f58147;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Collection f58148;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumMap f58149;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f58150;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17687(C22185 c22185) {
        super(EnumC6282.PLATFORM_CLASS_PATH, EnumC7687.f25354, EnumC7687.f25309, EnumC7687.f25307, EnumC7687.f25287, EnumC7687.f25318, EnumC7687.f25331, EnumC7687.f25298, EnumC7687.f25357);
        this.f58147 = c22185;
        this.f58149 = new EnumMap(EnumC7687.class);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4671(EnumC7687 enumC7687, String str) {
        if (!this.f55347.contains(enumC7687)) {
            return false;
        }
        this.f55346 = true;
        int i = C25147.f81283[enumC7687.ordinal()];
        if (i == 1) {
            enumC7687 = EnumC7687.f25354;
        } else if (i == 2) {
            enumC7687 = EnumC7687.f25318;
        } else if (i == 3) {
            enumC7687 = EnumC7687.f25298;
        }
        EnumMap enumMap = this.f58149;
        enumMap.put(enumC7687, str);
        if (enumC7687 == EnumC7687.f25354) {
            enumMap.remove(EnumC7687.f25307);
            enumMap.remove(EnumC7687.f25287);
        }
        this.f58148 = null;
        return true;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4669(Iterable iterable) {
        if (iterable == null) {
            this.f58148 = null;
            return;
        }
        this.f58150 = false;
        this.f55346 = true;
        C8737 c8737 = new C8737(this.f58147);
        c8737.m23421(iterable, false);
        this.f58148 = C4681.unmodifiableCollection(c8737);
        this.f58149.clear();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C8737 m41393() {
        Iterable iterableSingleton;
        C22185 c22185 = this.f58147;
        C8737 c8737 = new C8737(c22185);
        EnumC7687 enumC7687 = EnumC7687.f25354;
        EnumMap enumMap = this.f58149;
        String str = (String) enumMap.get(enumC7687);
        String str2 = (String) enumMap.get(EnumC7687.f25318);
        String str3 = (String) enumMap.get(EnumC7687.f25298);
        String str4 = (String) enumMap.get(EnumC7687.f25307);
        String str5 = (String) enumMap.get(EnumC7687.f25287);
        c8737.m23422(str4);
        boolean z = false;
        if (str2 != null) {
            c8737.m23423(str2, c22185.f71478);
        } else {
            c8737.m23423(System.getProperty("java.endorsed.dirs"), false);
        }
        if (str != null) {
            c8737.m23422(str);
        } else {
            InterfaceC24329 interfaceC24329 = C22185.f71477;
            if (C3445.isRegularFile(interfaceC24329, new EnumC20599[0])) {
                iterableSingleton = Collections.singleton(interfaceC24329);
            } else {
                InterfaceC24329 interfaceC24329Resolve = C22185.f71476.resolve("modules");
                if (C3445.isDirectory(interfaceC24329Resolve.resolve("java.base"), new EnumC20599[0])) {
                    InterfaceC20670 list = C3445.list(interfaceC24329Resolve);
                    try {
                        List list2 = list.toList();
                        list.close();
                        iterableSingleton = list2;
                    } catch (Throwable th) {
                        if (list != null) {
                            try {
                                list.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } else {
                    iterableSingleton = null;
                }
            }
            if (iterableSingleton != null) {
                c8737.m23421(iterableSingleton, false);
            } else {
                c8737.m23427(System.getProperty("sun.boot.class.path"), false);
            }
        }
        c8737.m23422(str5);
        if (str3 != null) {
            c8737.m23423(str3, c22185.f71478);
        } else {
            InterfaceC24329 interfaceC24329Resolve2 = C22185.f71476.resolve("lib/jfxrt.jar");
            if (C3445.exists(interfaceC24329Resolve2, new EnumC20599[0])) {
                c8737.m23425(interfaceC24329Resolve2, false);
            }
            c8737.m23423(System.getProperty("java.ext.dirs"), false);
        }
        if (str4 == null && str == null && str5 == null) {
            z = true;
        }
        this.f58150 = z;
        return c8737;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m41392() {
        if (this.f58148 == null) {
            try {
                this.f58148 = C4681.unmodifiableCollection(m41393());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        return this.f58150;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public final Collection mo4675() {
        if (this.f58148 == null) {
            try {
                this.f58148 = C4681.unmodifiableCollection(m41393());
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        return this.f58148;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4672(InterfaceC24329 interfaceC24329) {
        return C22185.m50187(this.f58147, this.f58148, interfaceC24329);
    }
}
