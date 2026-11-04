package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6S3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20006 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22990 f64282;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile boolean f64283;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f64284;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final FileChannel f64285;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11055 f64286;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f64287;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final FileLock f64288;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f64289;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f64287) {
            return;
        }
        if (this.f64286 != null) {
            throw new IllegalStateException("Recovery generation candidate is still active");
        }
        this.f64287 = true;
        try {
            this.f64288.release();
            this.f64285.close();
        } catch (Throwable th) {
            this.f64285.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C11055 m46034(C0352 c0352, UUID uuid) {
        InterfaceC24329 interfaceC24329Resolve;
        InterfaceC24329 interfaceC24329Resolve2;
        C11055 c11055;
        C7064 c7064M22963;
        m46021();
        if (this.f64282 != null || this.f64286 != null) {
            throw new IllegalStateException("Migration entry already exists");
        }
        C22990 c22990 = new C22990(uuid, uuid, 1L, 0L);
        InterfaceC24329 interfaceC24329M46037 = m46037(c22990);
        EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
        if (!C3445.exists(interfaceC24329M46037, enumC20599)) {
            interfaceC24329Resolve = this.f64284.resolve("entry.tmp");
            if (C3445.exists(interfaceC24329Resolve, enumC20599)) {
                InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
                interfaceC22465.mo26984(interfaceC24329Resolve);
                interfaceC22465.mo26981(this.f64284);
            }
            interfaceC24329Resolve2 = this.f64284.resolve("migration-state.bin");
            if (C3445.exists(interfaceC24329Resolve2, enumC20599)) {
                if (C3445.isRegularFile(interfaceC24329Resolve2, enumC20599)) {
                    throw new IOException("Migration state candidate is not a regular file");
                }
                c7064M22963 = C8555.m22963(interfaceC24329Resolve2);
                try {
                    InterfaceC22465 interfaceC22466 = InterfaceC22465.f72702;
                    interfaceC22466.mo26984(interfaceC24329Resolve2);
                    interfaceC22466.mo26981(this.f64284);
                    c7064M22963.close();
                } catch (Throwable th) {
                    try {
                        c7064M22963.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c11055 = new C11055(this, C10046.m25955(interfaceC24329M46037, c0352, uuid), c22990);
            this.f64286 = c11055;
        } else {
            if (!C3445.isRegularFile(interfaceC24329M46037, enumC20599)) {
                throw new IOException("Migration candidate is not a regular file");
            }
            C7064 c7064M22964 = C8555.m22963(interfaceC24329M46037);
            try {
                InterfaceC22465 interfaceC22467 = InterfaceC22465.f72702;
                interfaceC22467.mo26984(interfaceC24329M46037);
                interfaceC22467.mo26981(this.f64284);
                c7064M22964.close();
                interfaceC24329Resolve = this.f64284.resolve("entry.tmp");
                if (C3445.exists(interfaceC24329Resolve, enumC20599)) {
                    InterfaceC22465 interfaceC22468 = InterfaceC22465.f72702;
                    interfaceC22468.mo26984(interfaceC24329Resolve);
                    interfaceC22468.mo26981(this.f64284);
                }
                interfaceC24329Resolve2 = this.f64284.resolve("migration-state.bin");
                if (C3445.exists(interfaceC24329Resolve2, enumC20599)) {
                    if (C3445.isRegularFile(interfaceC24329Resolve2, enumC20599)) {
                        throw new IOException("Migration state candidate is not a regular file");
                    }
                    c7064M22963 = C8555.m22963(interfaceC24329Resolve2);
                    InterfaceC22465 interfaceC22469 = InterfaceC22465.f72702;
                    interfaceC22469.mo26984(interfaceC24329Resolve2);
                    interfaceC22469.mo26981(this.f64284);
                    c7064M22963.close();
                }
                c11055 = new C11055(this, C10046.m25955(interfaceC24329M46037, c0352, uuid), c22990);
                this.f64286 = c11055;
            } catch (Throwable th3) {
                try {
                    c7064M22964.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        throw th;
        return c11055;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C11055 m46035(C10046 c10046) {
        C11055 c11055;
        m46021();
        C22990 c22990M46036 = m46036();
        if (this.f64286 != null) {
            throw new IllegalStateException("Recovery generation copy is already active");
        }
        if (c22990M46036.f74638.equals(c10046.f32223)) {
            long j = c22990M46036.f74637;
            long j2 = c10046.f32210;
            if (j == j2) {
                if (j2 == C25227.FOREVER_NS) {
                    throw new IOException("Recovery generation exhausted");
                }
                if (m46022(c10046.f32208) != 0) {
                    throw new IOException("Previous recovery generation is still in use or cannot be reclaimed", this.f64289);
                }
                C22990 c22990 = new C22990(c10046.f32223, UUID.randomUUID(), c10046.f32210 + 1, c22990M46036.f74636);
                c11055 = new C11055(this, C10046.m25953(c10046, m46037(c22990)), c22990);
                this.f64286 = c11055;
            }
        }
        throw new IOException("Source does not match current recovery generation");
        return c11055;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C22990 m46036() {
        C22990 c22990;
        if (this.f64287) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        c22990 = this.f64282;
        if (c22990 == null) {
            throw new IllegalStateException("Recovery directory has no published generation");
        }
        return c22990;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m46039(C11055 c11055, long j) {
        m46040(c11055, j);
        m46045(c11055, j);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized C22990 m46042() {
        C22990 c22990M46028;
        C22990 c22990M46036 = m46036();
        c22990M46028 = m46028(m46025(this.f64284.resolve("current")));
        if (!c22990M46036.f74638.equals(c22990M46028.f74638) || !c22990M46036.f74635.equals(c22990M46028.f74635) || c22990M46036.f74637 != c22990M46028.f74637 || c22990M46036.f74636 != c22990M46028.f74636) {
            throw new IOException("Published recovery entry changed outside its owner");
        }
        return c22990M46028;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m46044(C0352 c0352) {
        if (this.f64287 || this.f64283 || this.f64286 != null) {
            return;
        }
        try {
            m46022(c0352);
        } catch (IOException e) {
            this.f64289 = e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m46045(C11055 c11055, long j) {
        C22990 c22990;
        m46021();
        if (c11055 != this.f64286 || c11055.f34881 || j < 0 || c11055.f34883 != j || c11055.f34880 != c11055.f34879.m25979() || ((c22990 = this.f64282) != null && j < c22990.f74636)) {
            throw new IOException("Recovery candidate validation is missing or stale");
        }
        C22990 c22991 = new C22990(c11055.f34884.f74638, c11055.f34884.f74635, c11055.f34884.f74637, j);
        InterfaceC24329 interfaceC24329Resolve = this.f64284.resolve("entry.tmp");
        if (C3445.exists(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS)) {
            throw new IOException("Recovery temporary entry requires cleanup");
        }
        try {
            InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
            interfaceC22465.mo26983(interfaceC24329Resolve, m46030(c22991));
            this.f64283 = true;
            interfaceC22465.mo26982(interfaceC24329Resolve, this.f64284.resolve("current"));
            interfaceC22465.mo26981(this.f64284);
            this.f64282 = c22991;
            c11055.f34884 = c22991;
            this.f64283 = false;
        } catch (IOException | Error | RuntimeException e) {
            try {
                if (C3445.exists(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS)) {
                    InterfaceC22465.f72702.mo26984(interfaceC24329Resolve);
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m46046() {
        if (this.f64287) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        return this.f64282 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C11055 m46033(C0352 c0352) {
        C11055 c11055;
        m46021();
        if (this.f64282 != null || this.f64286 != null) {
            throw new IllegalStateException("Recovery generation already exists");
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        C10046 c10046M25951 = C10046.m25951(InterfaceC22465.f72702.mo26979(this.f64284.resolve("generation-1-" + uuidRandomUUID + ".mt2"), true), c0352);
        c11055 = new C11055(this, c10046M25951, new C22990(c10046M25951.f32223, uuidRandomUUID, 1L, 0L));
        this.f64286 = c11055;
        return c11055;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20006 m46016(InterfaceC24329 interfaceC24329) {
        InterfaceC24329 absolutePath = interfaceC24329.toAbsolutePath();
        C3445.createDirectory(absolutePath, new InterfaceC13885[0]);
        InterfaceC24329 parent = absolutePath.getParent();
        InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
        interfaceC22465.mo26981(parent);
        C20006 c20006 = new C20006(absolutePath, true);
        try {
            c20006.f64285.force(true);
            interfaceC22465.mo26981(absolutePath);
            return c20006;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c20006.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C20006 m46031(InterfaceC24329 interfaceC24329) {
        InterfaceC24329 absolutePath = interfaceC24329.toAbsolutePath();
        C20006 c20006 = new C20006(absolutePath, false);
        try {
            c20006.f64282 = m46028(m46025(absolutePath.resolve("current")));
            return c20006;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c20006.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m46029(InterfaceC24329 interfaceC24329) {
        InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
        InterfaceC24329 absolutePath = interfaceC24329.toAbsolutePath();
        EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
        if (C3445.exists(absolutePath, enumC20599)) {
            if (!C3445.isDirectory(absolutePath, enumC20599) || !C3445.isRegularFile(absolutePath.resolve("session.lock"), enumC20599)) {
                throw new IOException("Recovery deletion requires an owned directory");
            }
            InterfaceC24329 interfaceC24329ResolveSibling = absolutePath.resolveSibling(absolutePath.getFileName() + "-deleted-" + UUID.randomUUID());
            C20006 c20006 = new C20006(absolutePath, false);
            try {
                C3445.move(absolutePath, interfaceC24329ResolveSibling, EnumC18361.ATOMIC_MOVE);
                interfaceC22465.mo26981(absolutePath.getParent());
                c20006.close();
                InterfaceC20670 interfaceC20670Walk = C3445.walk(interfaceC24329ResolveSibling, new EnumC17615[0]);
                try {
                    Iterator it = interfaceC20670Walk.sorted(C2661.reverseOrder()).toList().iterator();
                    while (it.hasNext()) {
                        C3445.delete((InterfaceC24329) it.next());
                    }
                    interfaceC20670Walk.close();
                    interfaceC22465.mo26981(absolutePath.getParent());
                } catch (Throwable th) {
                    if (interfaceC20670Walk != null) {
                        try {
                            interfaceC20670Walk.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c20006.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C20006 m46026(InterfaceC24329 interfaceC24329) throws IOException {
        InterfaceC24329 absolutePath = interfaceC24329.toAbsolutePath();
        try {
            C3445.createDirectory(absolutePath, new InterfaceC13885[0]);
        } catch (FileAlreadyExistsException e) {
            if (!C3445.isDirectory(absolutePath, EnumC20599.NOFOLLOW_LINKS)) {
                throw new IOException("Migration path is not a directory", e);
            }
        }
        InterfaceC24329 parent = absolutePath.getParent();
        InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
        interfaceC22465.mo26981(parent);
        InterfaceC24329 interfaceC24329Resolve = absolutePath.resolve("session.lock");
        if (!C3445.exists(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS)) {
            DirectoryStream directoryStreamNewDirectoryStream = C3445.newDirectoryStream(absolutePath);
            try {
                if (directoryStreamNewDirectoryStream.iterator().hasNext()) {
                    throw new IOException("Migration directory has no ownership lock");
                }
                directoryStreamNewDirectoryStream.close();
                try {
                    C3445.createFile(interfaceC24329Resolve, new InterfaceC13885[0]);
                } catch (FileAlreadyExistsException unused) {
                }
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
        EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
        if (!C3445.isRegularFile(interfaceC24329Resolve, enumC20599)) {
            throw new IOException("Migration ownership lock is not a regular file");
        }
        C20006 c20006 = new C20006(absolutePath, false);
        try {
            c20006.f64285.force(true);
            interfaceC22465.mo26981(absolutePath);
            if (C3445.exists(absolutePath.resolve("current"), enumC20599)) {
                c20006.f64282 = m46028(m46025(absolutePath.resolve("current")));
            }
            return c20006;
        } catch (IOException | Error | RuntimeException e2) {
            try {
                c20006.close();
            } catch (IOException e3) {
                e2.addSuppressed(e3);
            }
            throw e2;
        }
    }

    public C20006(InterfaceC24329 interfaceC24329, boolean z) throws Throwable {
        this.f64284 = interfaceC24329;
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329.resolve("session.lock");
        FileChannel fileChannelOpen = z ? C19853.open(interfaceC24329Resolve, EnumC0462.CREATE_NEW, EnumC0462.READ, EnumC0462.WRITE) : C19853.open(interfaceC24329Resolve, EnumC0462.READ, EnumC0462.WRITE);
        this.f64285 = fileChannelOpen;
        try {
            try {
                FileLock fileLockTryLock = fileChannelOpen.tryLock();
                this.f64288 = fileLockTryLock;
                if (fileLockTryLock == null) {
                    throw new IOException("Recovery directory is already in use");
                }
            } catch (OverlappingFileLockException e) {
                throw new IOException("Recovery directory is already in use", e);
            }
        } catch (IOException e2) {
            e = e2;
            try {
                this.f64285.close();
            } catch (IOException e3) {
                e.addSuppressed(e3);
            }
            throw e;
        } catch (Error e4) {
            e = e4;
            this.f64285.close();
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            this.f64285.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m46041() {
        return this.f64283;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 m46037(C22990 c22990) {
        return this.f64284.resolve("generation-" + c22990.f74637 + "-" + c22990.f74635 + ".mt2");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m46022(C0352 c0352) throws IOException {
        InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
        this.f64289 = null;
        InterfaceC24329 interfaceC24329 = this.f64284;
        DirectoryStream<InterfaceC24329> directoryStreamNewDirectoryStream = C3445.newDirectoryStream(interfaceC24329);
        try {
            int i = 0;
            int i2 = 0;
            for (InterfaceC24329 interfaceC243210 : directoryStreamNewDirectoryStream) {
                i2++;
                if (i2 > 1024) {
                    throw new IOException("Recovery directory cleanup scan limit exceeded");
                }
                if (interfaceC243210.getFileName().toString().equals("entry.tmp")) {
                    try {
                        interfaceC22465.mo26984(interfaceC243210);
                        interfaceC22465.mo26981(interfaceC24329);
                    } catch (IOException e) {
                        this.f64289 = e;
                        i++;
                    }
                } else {
                    C22990 c22990M46023 = m46023(interfaceC243210);
                    if (c22990M46023 != null) {
                        try {
                            m46018(c22990M46023, c0352);
                        } catch (IOException e2) {
                            this.f64289 = e2;
                            i++;
                        }
                    }
                }
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                throw th;
            }
            directoryStreamNewDirectoryStream.close();
            return i;
        } catch (Throwable th2) {
            if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C22990 m46023(InterfaceC24329 interfaceC24329) {
        int iIndexOf;
        if (!C3445.isRegularFile(interfaceC24329, EnumC20599.NOFOLLOW_LINKS)) {
            return null;
        }
        String string = interfaceC24329.getFileName().toString();
        if (!string.startsWith("generation-") || (iIndexOf = string.indexOf(45, 11)) < 0 || !string.endsWith(".mt2")) {
            return null;
        }
        try {
            long j = Long.parseLong(string.substring(11, iIndexOf));
            UUID uuidFromString = UUID.fromString(string.substring(iIndexOf + 1, string.length() - 4));
            if (j >= 1 && !uuidFromString.equals(this.f64282.f74635)) {
                C22990 c22990 = new C22990(this.f64282.f74638, uuidFromString, j, 0L);
                if (m46037(c22990).equals(interfaceC24329)) {
                    return c22990;
                }
                return null;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46018(C22990 c22990, C0352 c0352) throws IOException {
        InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
        InterfaceC24329 interfaceC24329M46037 = m46037(c22990);
        EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
        if (C3445.exists(interfaceC24329M46037, enumC20599)) {
            if (!C3445.isRegularFile(interfaceC24329M46037, enumC20599)) {
                throw new IOException("Recovery generation is not a regular file");
            }
            C10046 c10046M25954 = C10046.m25954(interfaceC24329M46037, c0352);
            try {
                if (!c22990.f74638.equals(c10046M25954.f32223) || c22990.f74637 != c10046M25954.f32210) {
                    throw new IOException("Obsolete recovery generation identity does not match");
                }
                interfaceC22465.mo26984(interfaceC24329M46037);
                interfaceC22465.mo26981(this.f64284);
                c10046M25954.close();
            } catch (Throwable th) {
                try {
                    c10046M25954.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46017(C20006 c20006, C22990 c22990, C10046 c10046, Throwable th) {
        C22990 c22991;
        synchronized (c20006) {
            if (!c20006.f64287 && !c20006.f64283 && ((c22991 = c20006.f64282) == null || !c22991.f74635.equals(c22990.f74635))) {
                if (th != null) {
                    c20006.f64289 = new IOException("Obsolete recovery generation failed to close", th);
                    return;
                }
                try {
                    c20006.m46018(c22990, c10046.f32208);
                } catch (IOException e) {
                    c20006.f64289 = e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m46040(C11055 c11055, long j) {
        m46038(j, c11055, new RunnableC10858(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m46038(long j, C11055 c11055, Runnable runnable) {
        C22990 c22990;
        m46021();
        if (c11055 != this.f64286 || c11055.f34881 || j < 0 || ((c22990 = this.f64282) != null && j < c22990.f74636)) {
            throw new IllegalArgumentException("Invalid recovery generation publication");
        }
        C22990 c22991 = new C22990(c11055.f34884.f74638, c11055.f34884.f74635, c11055.f34884.f74637, j);
        long jM25979 = c11055.f34879.m25979();
        m46019(c22991, c11055.f34879.f32208, runnable);
        if (jM25979 != c11055.f34879.m25979()) {
            throw new IOException("Recovery candidate changed during validation");
        }
        c11055.f34883 = j;
        c11055.f34880 = jM25979;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46019(C22990 c22990, C0352 c0352, Runnable runnable) throws Exception {
        C10046 c10046M25961 = C10046.m25961(C8555.m22964(m46037(c22990)), c0352);
        try {
            C23736 c23736M11663 = new C3598(c10046M25961, runnable).m11663(C16276.f52867);
            try {
                long j = c23736M11663.f76937;
                m46020(c22990, c10046M25961, j);
                if (j != c22990.f74636 || c23736M11663.f76942 != 0 || c23736M11663.f76932 != null) {
                    throw new IOException("Recovery candidate is not an exact complete commit");
                }
                c23736M11663.close();
                c10046M25961.close();
                return;
            } catch (Throwable th) {
                try {
                    c23736M11663.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c10046M25961.close();
            throw th3;
        }
        try {
            c10046M25961.close();
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m46043() {
        return C3445.getFileStore(this.f64284).getUsableSpace();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46020(C22990 c22990, C10046 c10046, long j) throws IOException {
        if (!c22990.f74638.equals(c10046.f32223) || c22990.f74637 != c10046.f32210 || j < c22990.f74636) {
            throw new IOException("Recovery generation identity or acknowledged revision does not match entry");
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m46021() throws IOException {
        if (this.f64287) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        if (this.f64283) {
            throw new IOException("Recovery entry publication requires reopening");
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static byte[] m46025(InterfaceC24329 interfaceC24329) throws IOException {
        FileChannel fileChannelOpen = C19853.open(interfaceC24329, EnumC0462.READ);
        try {
            if (fileChannelOpen.size() != 80) {
                throw new IOException("Invalid recovery entry length");
            }
            byte[] bArr = new byte[80];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            while (byteBufferWrap.hasRemaining()) {
                if (fileChannelOpen.read(byteBufferWrap) <= 0) {
                    throw new IOException("Truncated recovery entry");
                }
            }
            if (fileChannelOpen.size() != 80) {
                throw new IOException("Recovery entry changed during reading");
            }
            fileChannelOpen.close();
            return bArr;
        } catch (Throwable th) {
            if (fileChannelOpen != null) {
                try {
                    fileChannelOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m46030(C22990 c22990) {
        C6178 c6178 = new C6178(80);
        c6178.writeInt(1162097229);
        c6178.writeInt(1);
        UUID uuid = c22990.f74638;
        c6178.m17803(uuid.getMostSignificantBits());
        c6178.m17803(uuid.getLeastSignificantBits());
        UUID uuid2 = c22990.f74635;
        c6178.m17803(uuid2.getMostSignificantBits());
        c6178.m17803(uuid2.getLeastSignificantBits());
        c6178.m17803(c22990.f74637);
        c6178.m17803(c22990.f74636);
        while (c6178.size() < 76) {
            c6178.writeByte(0);
        }
        c6178.writeInt(C12768.m31649(0, c6178.size(), c6178.m17808()));
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C22990 m46028(byte[] bArr) throws IOException {
        if (bArr.length != 80) {
            throw new IOException("Invalid recovery entry length");
        }
        C20348 c20348 = new C20348(bArr);
        if (c20348.readInt() != 1162097229 || c20348.readInt() != 1) {
            throw new IOException("Unsupported recovery entry");
        }
        UUID uuid = new UUID(c20348.readLong(), c20348.readLong());
        UUID uuid2 = new UUID(c20348.readLong(), c20348.readLong());
        long j = c20348.readLong();
        long j2 = c20348.readLong();
        if (j <= 0 || j2 < 0) {
            throw new IOException("Invalid recovery entry generation");
        }
        while (c20348.available() > 4) {
            if (c20348.readByte() != 0) {
                throw new IOException("Unsupported recovery entry fields");
            }
        }
        if (c20348.readInt() != C12768.m31649(0, 76, bArr)) {
            throw new IOException("Invalid recovery entry checksum");
        }
        return new C22990(uuid, uuid2, j, j2);
    }
}
