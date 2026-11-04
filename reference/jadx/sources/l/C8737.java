package l;

import java.io.IOException;
import java.nio.file.ProviderNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8737 extends LinkedHashSet {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f28412;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f28414 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final transient HashSet f28413 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC24329 f28415 = null;

    public C8737(C22185 c22185) {
        this.f28412 = c22185;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23426() {
        this.f28414 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23424(InterfaceC24329 interfaceC24329) {
        this.f28415 = interfaceC24329;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23423(String str, boolean z) {
        boolean z2 = this.f28414;
        this.f28414 = true;
        if (str != null) {
            try {
                Iterator it = C22185.m50183(this.f28412, str).iterator();
                while (it.hasNext()) {
                    m23420((InterfaceC24329) it.next(), z);
                }
            } catch (Throwable th) {
                this.f28414 = z2;
                throw th;
            }
        }
        this.f28414 = z2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m23420(InterfaceC24329 interfaceC24329, final boolean z) {
        boolean zIsDirectory = C3445.isDirectory(interfaceC24329, new EnumC20599[0]);
        final C22185 c22185 = this.f28412;
        if (!zIsDirectory) {
            if (z) {
                C7312 c7312 = c22185.f71482;
                EnumC19876 enumC19876 = EnumC19876.PATH;
                C25213 c25213 = C13146.f42046;
                c7312.m34528(enumC19876, new C25213("compiler", "dir.path.element.not.found", interfaceC24329));
                return;
            }
            return;
        }
        try {
            InterfaceC20670 list = C3445.list(interfaceC24329);
            try {
                list.filter(new Predicate() { // from class: l.ۡܺۘ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19025.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo7134negate() {
                        return C19025.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19025.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return C22185.m50188(c22185, (InterfaceC24329) obj);
                    }
                }).forEach(new Consumer() { // from class: l.ۖܺۘ
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C12312.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        boolean z2 = z;
                        this.f9144.m23425((InterfaceC24329) obj, z2);
                    }
                });
                list.close();
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
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23427(String str, boolean z) {
        if (str != null) {
            m23421(this.f28412.m50182(str, this.f28415), z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23422(String str) {
        m23427(str, this.f28412.f71478);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23421(Iterable iterable, boolean z) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m23425((InterfaceC24329) it.next(), z);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23425(InterfaceC24329 interfaceC24329, boolean z) {
        if (contains(interfaceC24329)) {
            return;
        }
        C22185 c22185 = this.f28412;
        if (!c22185.f71486.mo3173(interfaceC24329)) {
            if (z) {
                C7312 c7312 = c22185.f71482;
                EnumC19876 enumC19876 = EnumC19876.PATH;
                C25213 c25213 = C13146.f42046;
                c7312.m34528(enumC19876, new C25213("compiler", "path.element.not.found", interfaceC24329));
            }
            add(interfaceC24329);
            return;
        }
        InterfaceC24329 interfaceC24329Mo3175 = c22185.f71486.mo3175(interfaceC24329);
        HashSet hashSet = this.f28413;
        if (hashSet.contains(interfaceC24329Mo3175)) {
            return;
        }
        if (c22185.f71486.mo3176(interfaceC24329) && !interfaceC24329.getFileName().toString().endsWith(".jmod") && !interfaceC24329.endsWith("modules")) {
            if (!C22185.m50188(c22185, interfaceC24329)) {
                try {
                    C16869.newFileSystem(interfaceC24329, (ClassLoader) null).close();
                    if (z) {
                        C7312 c7313 = c22185.f71482;
                        EnumC19876 enumC19877 = EnumC19876.PATH;
                        C25213 c25214 = C13146.f42046;
                        c7313.m34528(enumC19877, new C25213("compiler", "unexpected.archive.file", interfaceC24329));
                    }
                } catch (IOException | ProviderNotFoundException unused) {
                    if (z) {
                        C7312 c7314 = c22185.f71482;
                        EnumC19876 enumC19878 = EnumC19876.PATH;
                        C25213 c25215 = C13146.f42046;
                        c7314.m34528(enumC19878, new C25213("compiler", "invalid.archive.file", interfaceC24329));
                        return;
                    }
                    return;
                }
            } else if (c22185.f71486.m3172() == null) {
                C7312 c7315 = c22185.f71482;
                C11040 c11040 = C22843.f74058;
                c7315.m34525(new C11040("compiler", "no.zipfs.for.archive", interfaceC24329));
                return;
            }
        }
        add(interfaceC24329);
        hashSet.add(interfaceC24329Mo3175);
        if (this.f28414 && c22185.f71486.mo3176(interfaceC24329) && !interfaceC24329.endsWith("modules")) {
            try {
                Iterator it = c22185.f71486.mo3174(interfaceC24329).iterator();
                while (it.hasNext()) {
                    m23425((InterfaceC24329) it.next(), z);
                }
            } catch (IOException e) {
                C7312 c7316 = c22185.f71482;
                int i = C2026.f6742;
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                    localizedMessage = e.toString();
                }
                C11040 c11041 = C22843.f74058;
                c7316.m34525(new C11040("compiler", "error.reading.file", interfaceC24329, localizedMessage));
            }
        }
    }
}
