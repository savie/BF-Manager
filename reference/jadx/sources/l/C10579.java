package l;

import java.io.IOException;
import java.nio.file.ProviderNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10579 extends LinkedHashSet {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f36194;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f36192 = false;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final transient HashSet f36193 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC3800 f36195 = null;

    public C10579(C20456 c20456) {
        this.f36194 = c20456;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m26758() {
        this.f36192 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26756(InterfaceC3800 interfaceC3800) {
        this.f36195 = interfaceC3800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26755(String str, boolean z) {
        boolean z2 = this.f36192;
        this.f36192 = true;
        if (str != null) {
            try {
                Iterator it = C20456.m46263(this.f36194, str).iterator();
                while (it.hasNext()) {
                    m26752((InterfaceC3800) it.next(), z);
                }
            } catch (Throwable th) {
                this.f36192 = z2;
                throw th;
            }
        }
        this.f36192 = z2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m26752(InterfaceC3800 interfaceC3800, final boolean z) {
        boolean zIsDirectory = C5212.isDirectory(interfaceC3800, new EnumC22146[0]);
        final C20456 c20456 = this.f36194;
        if (!zIsDirectory) {
            if (z) {
                C20414 c20414 = c20456.f66387;
                EnumC0597 enumC0597 = EnumC0597.PATH;
                C14065 c14065 = C9768.f32836;
                c20414.m48195(enumC0597, new C14065("compiler", "dir.path.element.not.found", interfaceC3800));
                return;
            }
            return;
        }
        try {
            InterfaceC5046 list = C5212.list(interfaceC3800);
            try {
                list.filter(new Predicate() { // from class: l.᩵᩹۟
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return C20456.m46267(c20456, (InterfaceC3800) obj);
                    }
                }).forEach(new Consumer() { // from class: l.ۡ᩹۟
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C1455.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        boolean z2 = z;
                        this.f31211.m26757((InterfaceC3800) obj, z2);
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26759(String str, boolean z) {
        if (str != null) {
            m26753(this.f36194.m46262(str, this.f36195), z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26754(String str) {
        m26759(str, this.f36194.f66389);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26753(Iterable iterable, boolean z) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m26757((InterfaceC3800) it.next(), z);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26757(InterfaceC3800 interfaceC3800, boolean z) {
        if (contains(interfaceC3800)) {
            return;
        }
        C20456 c20456 = this.f36194;
        if (!c20456.f66388.mo36009(interfaceC3800)) {
            if (z) {
                C20414 c20414 = c20456.f66387;
                EnumC0597 enumC0597 = EnumC0597.PATH;
                C14065 c14065 = C9768.f32836;
                c20414.m48195(enumC0597, new C14065("compiler", "path.element.not.found", interfaceC3800));
            }
            add(interfaceC3800);
            return;
        }
        InterfaceC3800 interfaceC3800Mo36011 = c20456.f66388.mo36011(interfaceC3800);
        HashSet hashSet = this.f36193;
        if (hashSet.contains(interfaceC3800Mo36011)) {
            return;
        }
        if (c20456.f66388.mo36008(interfaceC3800) && !interfaceC3800.getFileName().toString().endsWith(".jmod") && !interfaceC3800.endsWith("modules")) {
            if (!C20456.m46267(c20456, interfaceC3800)) {
                try {
                    C4506.newFileSystem(interfaceC3800, (ClassLoader) null).close();
                    if (z) {
                        C20414 c20415 = c20456.f66387;
                        EnumC0597 enumC0598 = EnumC0597.PATH;
                        C14065 c14066 = C9768.f32836;
                        c20415.m48195(enumC0598, new C14065("compiler", "unexpected.archive.file", interfaceC3800));
                    }
                } catch (IOException | ProviderNotFoundException unused) {
                    if (z) {
                        C20414 c20416 = c20456.f66387;
                        EnumC0597 enumC0599 = EnumC0597.PATH;
                        C14065 c14067 = C9768.f32836;
                        c20416.m48195(enumC0599, new C14065("compiler", "invalid.archive.file", interfaceC3800));
                        return;
                    }
                    return;
                }
            } else if (c20456.f66388.m47900() == null) {
                C20414 c20417 = c20456.f66387;
                C5909 c5909 = C23879.f77204;
                c20417.m48197(new C5909("compiler", "no.zipfs.for.archive", interfaceC3800));
                return;
            }
        }
        add(interfaceC3800);
        hashSet.add(interfaceC3800Mo36011);
        if (this.f36192 && c20456.f66388.mo36008(interfaceC3800) && !interfaceC3800.endsWith("modules")) {
            try {
                Iterator it = c20456.f66388.mo36010(interfaceC3800).iterator();
                while (it.hasNext()) {
                    m26757((InterfaceC3800) it.next(), z);
                }
            } catch (IOException e) {
                C20414 c20418 = c20456.f66387;
                int i = C14315.f46886;
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                    localizedMessage = e.toString();
                }
                C5909 c59010 = C23879.f77204;
                c20418.m48197(new C5909("compiler", "error.reading.file", interfaceC3800, localizedMessage));
            }
        }
    }
}
