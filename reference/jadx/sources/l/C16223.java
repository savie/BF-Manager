package l;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C16223 extends AbstractC9376 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f52349;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C18339 f52350;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC3800 f52351;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC3800 f52352;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16223(C20456 c20456) {
        super(EnumC3584.SYSTEM_MODULES, EnumC19730.f63378);
        this.f52349 = c20456;
        this.f52352 = C20456.f66385;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4921(EnumC19730 enumC19730, String str) {
        if (!this.f31746.contains(enumC19730)) {
            return false;
        }
        this.f31745 = true;
        if (str == null) {
            this.f52352 = C20456.f66385;
        } else if (str.equals("none")) {
            this.f52352 = null;
        } else {
            m38339(this.f52349.m46271(str, new String[0]));
        }
        this.f52351 = null;
        return true;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۨ */
    public final Collection mo9021() {
        InterfaceC3800 interfaceC3800 = this.f52352;
        if (interfaceC3800 == null) {
            return null;
        }
        return Collections.singleton(interfaceC3800);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4918(Iterable iterable) {
        if (iterable == null) {
            this.f52352 = null;
        } else {
            this.f31745 = true;
            m38339(AbstractC9376.m24053(iterable));
        }
    }

    @Override // l.AbstractC9376, l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4919(Iterable iterable, String str) throws IOException {
        C13638.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC3800 interfaceC3800 = (InterfaceC3800) it.next();
            AbstractC9376.m24052(interfaceC3800);
            arrayList.add(interfaceC3800);
        }
        m38338();
        C11990 c11990M42588 = this.f52350.m42588(str);
        if (c11990M42588 == null) {
            this.f52350.m42590(new C11990(this.f52349, this, this.f31747.getName() + "[" + str + "]", str, arrayList, true));
        } else {
            c11990M42588.f40189 = arrayList;
            this.f52350.m42595(c11990M42588);
        }
        this.f31745 = true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m38339(InterfaceC3800 interfaceC3800) {
        try {
            if (!C5212.isSameFile(interfaceC3800, C20456.f66385) && !C5212.exists(interfaceC3800.resolve("lib").resolve("jrt-fs.jar"), new EnumC22146[0]) && !C5212.exists(this.f52352.resolve("modules"), new EnumC22146[0])) {
                throw new IllegalArgumentException(interfaceC3800.toString());
            }
            this.f52352 = interfaceC3800;
            this.f52351 = null;
        } catch (IOException e) {
            throw new IllegalArgumentException(interfaceC3800.toString(), e);
        }
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4290 mo4917(String str) throws IOException {
        m38338();
        return this.f52350.m42588(str);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4290 mo4922(InterfaceC3800 interfaceC3800) throws IOException {
        m38338();
        return this.f52350.m42594(interfaceC3800);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ᩹ */
    public final Iterable mo4923() throws IOException {
        m38338();
        return Collections.singleton(this.f52350.m42587());
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4920(InterfaceC3800 interfaceC3800) throws IOException {
        m38338();
        return this.f52350.m42591(interfaceC3800);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m38338() throws IOException {
        InterfaceC3800 interfaceC3800Resolve;
        AbstractC3178 abstractC3178NewFileSystem;
        AbstractC3178 fileSystem;
        C20456 c20456 = this.f52349;
        ArrayList arrayList = c20456.f66390;
        if (this.f52350 != null) {
            return;
        }
        if (this.f52352 == null) {
            this.f52350 = new C18339(c20456);
            return;
        }
        if (this.f52351 == null) {
            try {
                try {
                    URI uriCreate = URI.create("jrt:/");
                    InterfaceC3800 interfaceC3800 = this.f52352;
                    try {
                        if (C5212.isSameFile(interfaceC3800, C20456.f66385)) {
                            fileSystem = C4506.getFileSystem(uriCreate);
                        } else {
                            try {
                                abstractC3178NewFileSystem = C4506.newFileSystem(uriCreate, Collections.singletonMap("java.home", this.f52352.toString()));
                            } catch (ProviderNotFoundException unused) {
                                URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{this.f52352.resolve("jrt-fs.jar").toUri().toURL()}, C20456.class.getClassLoader());
                                abstractC3178NewFileSystem = C4506.newFileSystem(uriCreate, Collections.EMPTY_MAP, uRLClassLoader);
                                arrayList.add(uRLClassLoader);
                            }
                            arrayList.add(abstractC3178NewFileSystem);
                            fileSystem = abstractC3178NewFileSystem;
                        }
                        this.f52351 = fileSystem.getPath("/modules", new String[0]);
                    } catch (IOException e) {
                        throw new IllegalArgumentException(interfaceC3800.toString(), e);
                    }
                } catch (ProviderNotFoundException e2) {
                    e = e2;
                    interfaceC3800Resolve = this.f52352.resolve("modules");
                    this.f52351 = interfaceC3800Resolve;
                    if (!C5212.exists(interfaceC3800Resolve, new EnumC22146[0])) {
                        throw new IOException("can't find system classes", e);
                    }
                }
            } catch (FileSystemNotFoundException e3) {
                e = e3;
                interfaceC3800Resolve = this.f52352.resolve("modules");
                this.f52351 = interfaceC3800Resolve;
                if (!C5212.exists(interfaceC3800Resolve, new EnumC22146[0])) {
                    throw new IOException("can't find system classes", e);
                }
            }
        }
        this.f52350 = new C18339(c20456);
        DirectoryStream<InterfaceC3800> directoryStreamNewDirectoryStream = C5212.newDirectoryStream(this.f52351, new C21161());
        try {
            for (InterfaceC3800 interfaceC3801 : directoryStreamNewDirectoryStream) {
                String string = interfaceC3801.getFileName().toString();
                this.f52350.m42590(new C11990(c20456, this, this.f31747.getName() + "[" + string + "]", string, Collections.singletonList(interfaceC3801), false));
            }
            directoryStreamNewDirectoryStream.close();
        } catch (Throwable th) {
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    directoryStreamNewDirectoryStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
