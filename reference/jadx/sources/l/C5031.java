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

/* JADX INFO: renamed from: l.ۙܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5031 extends AbstractC16941 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f17435;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC24329 f17436;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC24329 f17437;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19179 f17438;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5031(C22185 c22185) {
        super(EnumC6282.SYSTEM_MODULES, EnumC7687.f25327);
        this.f17435 = c22185;
        this.f17436 = C22185.f71476;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4671(EnumC7687 enumC7687, String str) {
        if (!this.f55347.contains(enumC7687)) {
            return false;
        }
        this.f55346 = true;
        if (str == null) {
            this.f17436 = C22185.f71476;
        } else if (str.equals("none")) {
            this.f17436 = null;
        } else {
            m15258(this.f17435.m50194(str, new String[0]));
        }
        this.f17437 = null;
        return true;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public final Collection mo4675() {
        InterfaceC24329 interfaceC24329 = this.f17436;
        if (interfaceC24329 == null) {
            return null;
        }
        return Collections.singleton(interfaceC24329);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4669(Iterable iterable) {
        if (iterable == null) {
            this.f17436 = null;
        } else {
            this.f55346 = true;
            m15258(AbstractC16941.m39917(iterable));
        }
    }

    @Override // l.AbstractC16941, l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4670(Iterable iterable, String str) throws IOException {
        C17359.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC24329 interfaceC24329 = (InterfaceC24329) it.next();
            AbstractC16941.m39916(interfaceC24329);
            arrayList.add(interfaceC24329);
        }
        m15257();
        C3517 c3517M44442 = this.f17438.m44442(str);
        if (c3517M44442 == null) {
            this.f17438.m44444(new C3517(this.f17435, this, this.f55348.getName() + "[" + str + "]", str, arrayList, true));
        } else {
            c3517M44442.f12094 = arrayList;
            this.f17438.m44449(c3517M44442);
        }
        this.f55346 = true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m15258(InterfaceC24329 interfaceC24329) {
        try {
            if (!C3445.isSameFile(interfaceC24329, C22185.f71476) && !C3445.exists(interfaceC24329.resolve("lib").resolve("jrt-fs.jar"), new EnumC20599[0]) && !C3445.exists(this.f17436.resolve("modules"), new EnumC20599[0])) {
                throw new IllegalArgumentException(interfaceC24329.toString());
            }
            this.f17436 = interfaceC24329;
            this.f17437 = null;
        } catch (IOException e) {
            throw new IllegalArgumentException(interfaceC24329.toString(), e);
        }
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC24928 mo4668(String str) throws IOException {
        m15257();
        return this.f17438.m44442(str);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24928 mo4676(InterfaceC24329 interfaceC24329) throws IOException {
        m15257();
        return this.f17438.m44448(interfaceC24329);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo4673() throws IOException {
        m15257();
        return Collections.singleton(this.f17438.m44450());
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4672(InterfaceC24329 interfaceC24329) throws IOException {
        m15257();
        return this.f17438.m44445(interfaceC24329);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m15257() throws IOException {
        InterfaceC24329 interfaceC24329Resolve;
        AbstractC25075 abstractC25075NewFileSystem;
        AbstractC25075 fileSystem;
        C22185 c22185 = this.f17435;
        ArrayList arrayList = c22185.f71479;
        if (this.f17438 != null) {
            return;
        }
        if (this.f17436 == null) {
            this.f17438 = new C19179(c22185);
            return;
        }
        if (this.f17437 == null) {
            try {
                try {
                    URI uriCreate = URI.create("jrt:/");
                    InterfaceC24329 interfaceC24329 = this.f17436;
                    try {
                        if (C3445.isSameFile(interfaceC24329, C22185.f71476)) {
                            fileSystem = C16869.getFileSystem(uriCreate);
                        } else {
                            try {
                                abstractC25075NewFileSystem = C16869.newFileSystem(uriCreate, Collections.singletonMap("java.home", this.f17436.toString()));
                            } catch (ProviderNotFoundException unused) {
                                URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{this.f17436.resolve("jrt-fs.jar").toUri().toURL()}, C22185.class.getClassLoader());
                                abstractC25075NewFileSystem = C16869.newFileSystem(uriCreate, Collections.EMPTY_MAP, uRLClassLoader);
                                arrayList.add(uRLClassLoader);
                            }
                            arrayList.add(abstractC25075NewFileSystem);
                            fileSystem = abstractC25075NewFileSystem;
                        }
                        this.f17437 = fileSystem.getPath("/modules", new String[0]);
                    } catch (IOException e) {
                        throw new IllegalArgumentException(interfaceC24329.toString(), e);
                    }
                } catch (ProviderNotFoundException e2) {
                    e = e2;
                    interfaceC24329Resolve = this.f17436.resolve("modules");
                    this.f17437 = interfaceC24329Resolve;
                    if (!C3445.exists(interfaceC24329Resolve, new EnumC20599[0])) {
                        throw new IOException("can't find system classes", e);
                    }
                }
            } catch (FileSystemNotFoundException e3) {
                e = e3;
                interfaceC24329Resolve = this.f17436.resolve("modules");
                this.f17437 = interfaceC24329Resolve;
                if (!C3445.exists(interfaceC24329Resolve, new EnumC20599[0])) {
                    throw new IOException("can't find system classes", e);
                }
            }
        }
        this.f17438 = new C19179(c22185);
        DirectoryStream<InterfaceC24329> directoryStreamNewDirectoryStream = C3445.newDirectoryStream(this.f17437, new C13957());
        try {
            for (InterfaceC24329 interfaceC243210 : directoryStreamNewDirectoryStream) {
                String string = interfaceC243210.getFileName().toString();
                this.f17438.m44444(new C3517(c22185, this, this.f55348.getName() + "[" + string + "]", string, Collections.singletonList(interfaceC243210), false));
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
