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

/* JADX INFO: renamed from: l.ۗܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6S3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3350 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f12387;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final FileChannel f12388;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f12389;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f12390;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1939 f12391;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9702 f12392;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final FileLock f12393;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f12394;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f12387) {
            return;
        }
        if (this.f12391 != null) {
            throw new IllegalStateException("Recovery generation candidate is still active");
        }
        this.f12387 = true;
        try {
            this.f12393.release();
            this.f12388.close();
        } catch (Throwable th) {
            this.f12388.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized C9702 m9978() {
        C9702 c9702M9974;
        C9702 c9702M9984 = m9984();
        c9702M9974 = m9974(m9977(this.f12390.resolve("current")));
        if (!c9702M9984.f32686.equals(c9702M9974.f32686) || !c9702M9984.f32687.equals(c9702M9974.f32687) || c9702M9984.f32689 != c9702M9974.f32689 || c9702M9984.f32688 != c9702M9974.f32688) {
            throw new IOException("Published recovery entry changed outside its owner");
        }
        return c9702M9974;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C1939 m9981(C10428 c10428, UUID uuid) {
        InterfaceC3800 interfaceC3800Resolve;
        InterfaceC3800 interfaceC3800Resolve2;
        C1939 c1939;
        C17482 c17482M31203;
        m9972();
        if (this.f12392 != null || this.f12391 != null) {
            throw new IllegalStateException("Migration entry already exists");
        }
        C9702 c9702 = new C9702(uuid, uuid, 1L, 0L);
        InterfaceC3800 interfaceC3800M9983 = m9983(c9702);
        EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
        if (!C5212.exists(interfaceC3800M9983, enumC22146)) {
            interfaceC3800Resolve = this.f12390.resolve("entry.tmp");
            if (C5212.exists(interfaceC3800Resolve, enumC22146)) {
                InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
                interfaceC1959.mo6330(interfaceC3800Resolve);
                interfaceC1959.mo6327(this.f12390);
            }
            interfaceC3800Resolve2 = this.f12390.resolve("migration-state.bin");
            if (C5212.exists(interfaceC3800Resolve2, enumC22146)) {
                if (C5212.isRegularFile(interfaceC3800Resolve2, enumC22146)) {
                    throw new IOException("Migration state candidate is not a regular file");
                }
                c17482M31203 = C12544.m31203(interfaceC3800Resolve2);
                try {
                    InterfaceC1959 interfaceC19510 = InterfaceC1959.f7372;
                    interfaceC19510.mo6330(interfaceC3800Resolve2);
                    interfaceC19510.mo6327(this.f12390);
                    c17482M31203.close();
                } catch (Throwable th) {
                    try {
                        c17482M31203.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c1939 = new C1939(this, C16072.m38076(interfaceC3800M9983, c10428, uuid), c9702);
            this.f12391 = c1939;
        } else {
            if (!C5212.isRegularFile(interfaceC3800M9983, enumC22146)) {
                throw new IOException("Migration candidate is not a regular file");
            }
            C17482 c17482M31204 = C12544.m31203(interfaceC3800M9983);
            try {
                InterfaceC1959 interfaceC19511 = InterfaceC1959.f7372;
                interfaceC19511.mo6330(interfaceC3800M9983);
                interfaceC19511.mo6327(this.f12390);
                c17482M31204.close();
                interfaceC3800Resolve = this.f12390.resolve("entry.tmp");
                if (C5212.exists(interfaceC3800Resolve, enumC22146)) {
                    InterfaceC1959 interfaceC19512 = InterfaceC1959.f7372;
                    interfaceC19512.mo6330(interfaceC3800Resolve);
                    interfaceC19512.mo6327(this.f12390);
                }
                interfaceC3800Resolve2 = this.f12390.resolve("migration-state.bin");
                if (C5212.exists(interfaceC3800Resolve2, enumC22146)) {
                    if (C5212.isRegularFile(interfaceC3800Resolve2, enumC22146)) {
                        throw new IOException("Migration state candidate is not a regular file");
                    }
                    c17482M31203 = C12544.m31203(interfaceC3800Resolve2);
                    InterfaceC1959 interfaceC19513 = InterfaceC1959.f7372;
                    interfaceC19513.mo6330(interfaceC3800Resolve2);
                    interfaceC19513.mo6327(this.f12390);
                    c17482M31203.close();
                }
                c1939 = new C1939(this, C16072.m38076(interfaceC3800M9983, c10428, uuid), c9702);
                this.f12391 = c1939;
            } catch (Throwable th3) {
                try {
                    c17482M31204.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        throw th;
        return c1939;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C1939 m9982(C16072 c16072) {
        C1939 c1939;
        m9972();
        C9702 c9702M9984 = m9984();
        if (this.f12391 != null) {
            throw new IllegalStateException("Recovery generation copy is already active");
        }
        if (c9702M9984.f32686.equals(c16072.f51979)) {
            long j = c9702M9984.f32689;
            long j2 = c16072.f51980;
            if (j == j2) {
                if (j2 == C17492.FOREVER_NS) {
                    throw new IOException("Recovery generation exhausted");
                }
                if (m9969(c16072.f51982) != 0) {
                    throw new IOException("Previous recovery generation is still in use or cannot be reclaimed", this.f12394);
                }
                C9702 c9702 = new C9702(c16072.f51979, UUID.randomUUID(), c16072.f51980 + 1, c9702M9984.f32688);
                c1939 = new C1939(this, C16072.m38079(c16072, m9983(c9702)), c9702);
                this.f12391 = c1939;
            }
        }
        throw new IOException("Source does not match current recovery generation");
        return c1939;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9702 m9984() {
        C9702 c9702;
        if (this.f12387) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        c9702 = this.f12392;
        if (c9702 == null) {
            throw new IllegalStateException("Recovery directory has no published generation");
        }
        return c9702;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9986(C1939 c1939, long j) {
        m9987(c1939, j);
        m9989(c1939, j);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m9988() {
        if (this.f12387) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        return this.f12392 != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9989(C1939 c1939, long j) {
        C9702 c9702;
        m9972();
        if (c1939 != this.f12391 || c1939.f7321 || j < 0 || c1939.f7323 != j || c1939.f7320 != c1939.f7322.m38098() || ((c9702 = this.f12392) != null && j < c9702.f32688)) {
            throw new IOException("Recovery candidate validation is missing or stale");
        }
        C9702 c9703 = new C9702(c1939.f7324.f32686, c1939.f7324.f32687, c1939.f7324.f32689, j);
        InterfaceC3800 interfaceC3800Resolve = this.f12390.resolve("entry.tmp");
        if (C5212.exists(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS)) {
            throw new IOException("Recovery temporary entry requires cleanup");
        }
        try {
            InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
            interfaceC1959.mo6329(interfaceC3800Resolve, m9976(c9703));
            this.f12389 = true;
            interfaceC1959.mo6328(interfaceC3800Resolve, this.f12390.resolve("current"));
            interfaceC1959.mo6327(this.f12390);
            this.f12392 = c9703;
            c1939.f7324 = c9703;
            this.f12389 = false;
        } catch (IOException | Error | RuntimeException e) {
            try {
                if (C5212.exists(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS)) {
                    InterfaceC1959.f7372.mo6330(interfaceC3800Resolve);
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9990(C10428 c10428) {
        if (this.f12387 || this.f12389 || this.f12391 != null) {
            return;
        }
        try {
            m9969(c10428);
        } catch (IOException e) {
            this.f12394 = e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C1939 m9980(C10428 c10428) {
        C1939 c1939;
        m9972();
        if (this.f12392 != null || this.f12391 != null) {
            throw new IllegalStateException("Recovery generation already exists");
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        C16072 c16072M38077 = C16072.m38077(InterfaceC1959.f7372.mo6325(this.f12390.resolve("generation-1-" + uuidRandomUUID + ".mt2"), true), c10428);
        c1939 = new C1939(this, c16072M38077, new C9702(c16072M38077.f51979, uuidRandomUUID, 1L, 0L));
        this.f12391 = c1939;
        return c1939;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3350 m9963(InterfaceC3800 interfaceC3800) {
        InterfaceC3800 absolutePath = interfaceC3800.toAbsolutePath();
        C5212.createDirectory(absolutePath, new InterfaceC20030[0]);
        InterfaceC3800 parent = absolutePath.getParent();
        InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
        interfaceC1959.mo6327(parent);
        C3350 c3350 = new C3350(absolutePath, true);
        try {
            c3350.f12388.force(true);
            interfaceC1959.mo6327(absolutePath);
            return c3350;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c3350.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C3350 m9960(InterfaceC3800 interfaceC3800) {
        InterfaceC3800 absolutePath = interfaceC3800.toAbsolutePath();
        C3350 c3350 = new C3350(absolutePath, false);
        try {
            c3350.f12392 = m9974(m9977(absolutePath.resolve("current")));
            return c3350;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c3350.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m9975(InterfaceC3800 interfaceC3800) throws IOException {
        InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
        InterfaceC3800 absolutePath = interfaceC3800.toAbsolutePath();
        EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
        if (C5212.exists(absolutePath, enumC22146)) {
            if (!C5212.isDirectory(absolutePath, enumC22146) || !C5212.isRegularFile(absolutePath.resolve("session.lock"), enumC22146)) {
                throw new IOException("Recovery deletion requires an owned directory");
            }
            InterfaceC3800 interfaceC3800ResolveSibling = absolutePath.resolveSibling(absolutePath.getFileName() + "-deleted-" + UUID.randomUUID());
            C3350 c3350 = new C3350(absolutePath, false);
            try {
                C5212.move(absolutePath, interfaceC3800ResolveSibling, EnumC21440.ATOMIC_MOVE);
                interfaceC1959.mo6327(absolutePath.getParent());
                c3350.close();
                InterfaceC5046 interfaceC5046Walk = C5212.walk(interfaceC3800ResolveSibling, new EnumC13680[0]);
                try {
                    Iterator it = interfaceC5046Walk.sorted(C7618.reverseOrder()).toList().iterator();
                    while (it.hasNext()) {
                        C5212.delete((InterfaceC3800) it.next());
                    }
                    interfaceC5046Walk.close();
                    interfaceC1959.mo6327(absolutePath.getParent());
                } catch (Throwable th) {
                    if (interfaceC5046Walk != null) {
                        try {
                            interfaceC5046Walk.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c3350.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C3350 m9968(InterfaceC3800 interfaceC3800) throws IOException {
        InterfaceC3800 absolutePath = interfaceC3800.toAbsolutePath();
        try {
            C5212.createDirectory(absolutePath, new InterfaceC20030[0]);
        } catch (FileAlreadyExistsException e) {
            if (!C5212.isDirectory(absolutePath, EnumC22146.NOFOLLOW_LINKS)) {
                throw new IOException("Migration path is not a directory", e);
            }
        }
        InterfaceC3800 parent = absolutePath.getParent();
        InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
        interfaceC1959.mo6327(parent);
        InterfaceC3800 interfaceC3800Resolve = absolutePath.resolve("session.lock");
        if (!C5212.exists(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS)) {
            DirectoryStream directoryStreamNewDirectoryStream = C5212.newDirectoryStream(absolutePath);
            try {
                if (directoryStreamNewDirectoryStream.iterator().hasNext()) {
                    throw new IOException("Migration directory has no ownership lock");
                }
                directoryStreamNewDirectoryStream.close();
                try {
                    C5212.createFile(interfaceC3800Resolve, new InterfaceC20030[0]);
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
        EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
        if (!C5212.isRegularFile(interfaceC3800Resolve, enumC22146)) {
            throw new IOException("Migration ownership lock is not a regular file");
        }
        C3350 c3350 = new C3350(absolutePath, false);
        try {
            c3350.f12388.force(true);
            interfaceC1959.mo6327(absolutePath);
            if (C5212.exists(absolutePath.resolve("current"), enumC22146)) {
                c3350.f12392 = m9974(m9977(absolutePath.resolve("current")));
            }
            return c3350;
        } catch (IOException | Error | RuntimeException e2) {
            try {
                c3350.close();
            } catch (IOException e3) {
                e2.addSuppressed(e3);
            }
            throw e2;
        }
    }

    public C3350(InterfaceC3800 interfaceC3800, boolean z) throws Throwable {
        this.f12390 = interfaceC3800;
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800.resolve("session.lock");
        FileChannel fileChannelOpen = z ? C6001.open(interfaceC3800Resolve, EnumC17912.CREATE_NEW, EnumC17912.READ, EnumC17912.WRITE) : C6001.open(interfaceC3800Resolve, EnumC17912.READ, EnumC17912.WRITE);
        this.f12388 = fileChannelOpen;
        try {
            try {
                FileLock fileLockTryLock = fileChannelOpen.tryLock();
                this.f12393 = fileLockTryLock;
                if (fileLockTryLock == null) {
                    throw new IOException("Recovery directory is already in use");
                }
            } catch (OverlappingFileLockException e) {
                throw new IOException("Recovery directory is already in use", e);
            }
        } catch (IOException e2) {
            e = e2;
            try {
                this.f12388.close();
            } catch (IOException e3) {
                e.addSuppressed(e3);
            }
            throw e;
        } catch (Error e4) {
            e = e4;
            this.f12388.close();
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            this.f12388.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m9979() {
        return this.f12389;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 m9983(C9702 c9702) {
        return this.f12390.resolve("generation-" + c9702.f32689 + "-" + c9702.f32687 + ".mt2");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m9969(C10428 c10428) throws IOException {
        InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
        this.f12394 = null;
        InterfaceC3800 interfaceC3800 = this.f12390;
        DirectoryStream<InterfaceC3800> directoryStreamNewDirectoryStream = C5212.newDirectoryStream(interfaceC3800);
        try {
            int i = 0;
            int i2 = 0;
            for (InterfaceC3800 interfaceC3801 : directoryStreamNewDirectoryStream) {
                i2++;
                if (i2 > 1024) {
                    throw new IOException("Recovery directory cleanup scan limit exceeded");
                }
                if (interfaceC3801.getFileName().toString().equals("entry.tmp")) {
                    try {
                        interfaceC1959.mo6330(interfaceC3801);
                        interfaceC1959.mo6327(interfaceC3800);
                    } catch (IOException e) {
                        this.f12394 = e;
                        i++;
                    }
                } else {
                    C9702 c9702M9970 = m9970(interfaceC3801);
                    if (c9702M9970 != null) {
                        try {
                            m9965(c9702M9970, c10428);
                        } catch (IOException e2) {
                            this.f12394 = e2;
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C9702 m9970(InterfaceC3800 interfaceC3800) {
        int iIndexOf;
        if (!C5212.isRegularFile(interfaceC3800, EnumC22146.NOFOLLOW_LINKS)) {
            return null;
        }
        String string = interfaceC3800.getFileName().toString();
        if (!string.startsWith("generation-") || (iIndexOf = string.indexOf(45, 11)) < 0 || !string.endsWith(".mt2")) {
            return null;
        }
        try {
            long j = Long.parseLong(string.substring(11, iIndexOf));
            UUID uuidFromString = UUID.fromString(string.substring(iIndexOf + 1, string.length() - 4));
            if (j >= 1 && !uuidFromString.equals(this.f12392.f32687)) {
                C9702 c9702 = new C9702(this.f12392.f32686, uuidFromString, j, 0L);
                if (m9983(c9702).equals(interfaceC3800)) {
                    return c9702;
                }
                return null;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9965(C9702 c9702, C10428 c10428) throws IOException {
        InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
        InterfaceC3800 interfaceC3800M9983 = m9983(c9702);
        EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
        if (C5212.exists(interfaceC3800M9983, enumC22146)) {
            if (!C5212.isRegularFile(interfaceC3800M9983, enumC22146)) {
                throw new IOException("Recovery generation is not a regular file");
            }
            C16072 c16072M38075 = C16072.m38075(interfaceC3800M9983, c10428);
            try {
                if (!c9702.f32686.equals(c16072M38075.f51979) || c9702.f32689 != c16072M38075.f51980) {
                    throw new IOException("Obsolete recovery generation identity does not match");
                }
                interfaceC1959.mo6330(interfaceC3800M9983);
                interfaceC1959.mo6327(this.f12390);
                c16072M38075.close();
            } catch (Throwable th) {
                try {
                    c16072M38075.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9964(C3350 c3350, C9702 c9702, C16072 c16072, Throwable th) {
        C9702 c9703;
        synchronized (c3350) {
            if (!c3350.f12387 && !c3350.f12389 && ((c9703 = c3350.f12392) == null || !c9703.f32687.equals(c9702.f32687))) {
                if (th != null) {
                    c3350.f12394 = new IOException("Obsolete recovery generation failed to close", th);
                    return;
                }
                try {
                    c3350.m9965(c9702, c16072.f51982);
                } catch (IOException e) {
                    c3350.f12394 = e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9987(C1939 c1939, long j) {
        m9985(j, c1939, new RunnableC19683());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9985(long j, C1939 c1939, Runnable runnable) {
        C9702 c9702;
        m9972();
        if (c1939 != this.f12391 || c1939.f7321 || j < 0 || ((c9702 = this.f12392) != null && j < c9702.f32688)) {
            throw new IllegalArgumentException("Invalid recovery generation publication");
        }
        C9702 c9703 = new C9702(c1939.f7324.f32686, c1939.f7324.f32687, c1939.f7324.f32689, j);
        long jM38098 = c1939.f7322.m38098();
        m9966(c9703, c1939.f7322.f51982, runnable);
        if (jM38098 != c1939.f7322.m38098()) {
            throw new IOException("Recovery candidate changed during validation");
        }
        c1939.f7323 = j;
        c1939.f7320 = jM38098;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9966(C9702 c9702, C10428 c10428, Runnable runnable) throws Exception {
        C16072 c16072M38086 = C16072.m38086(C12544.m31204(m9983(c9702)), c10428);
        try {
            C6754 c6754M50850 = new C22983(c16072M38086, runnable).m50850(C3931.f14649);
            try {
                long j = c6754M50850.f22785;
                m9967(c9702, c16072M38086, j);
                if (j != c9702.f32688 || c6754M50850.f22784 != 0 || c6754M50850.f22778 != null) {
                    throw new IOException("Recovery candidate is not an exact complete commit");
                }
                c6754M50850.close();
                c16072M38086.close();
                return;
            } catch (Throwable th) {
                try {
                    c6754M50850.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c16072M38086.close();
            throw th3;
        }
        try {
            c16072M38086.close();
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m9991() {
        return C5212.getFileStore(this.f12390).getUsableSpace();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9967(C9702 c9702, C16072 c16072, long j) throws IOException {
        if (!c9702.f32686.equals(c16072.f51979) || c9702.f32689 != c16072.f51980 || j < c9702.f32688) {
            throw new IOException("Recovery generation identity or acknowledged revision does not match entry");
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m9972() throws IOException {
        if (this.f12387) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        if (this.f12389) {
            throw new IOException("Recovery entry publication requires reopening");
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static byte[] m9977(InterfaceC3800 interfaceC3800) throws IOException {
        FileChannel fileChannelOpen = C6001.open(interfaceC3800, EnumC17912.READ);
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m9976(C9702 c9702) {
        C11018 c11018 = new C11018(80);
        c11018.writeInt(1162097229);
        c11018.writeInt(1);
        UUID uuid = c9702.f32686;
        c11018.m27791(uuid.getMostSignificantBits());
        c11018.m27791(uuid.getLeastSignificantBits());
        UUID uuid2 = c9702.f32687;
        c11018.m27791(uuid2.getMostSignificantBits());
        c11018.m27791(uuid2.getLeastSignificantBits());
        c11018.m27791(c9702.f32689);
        c11018.m27791(c9702.f32688);
        while (c11018.size() < 76) {
            c11018.writeByte(0);
        }
        c11018.writeInt(C4451.m12403(0, c11018.size(), c11018.m27788()));
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9702 m9974(byte[] bArr) throws IOException {
        if (bArr.length != 80) {
            throw new IOException("Invalid recovery entry length");
        }
        C17367 c17367 = new C17367(bArr);
        if (c17367.readInt() != 1162097229 || c17367.readInt() != 1) {
            throw new IOException("Unsupported recovery entry");
        }
        UUID uuid = new UUID(c17367.readLong(), c17367.readLong());
        UUID uuid2 = new UUID(c17367.readLong(), c17367.readLong());
        long j = c17367.readLong();
        long j2 = c17367.readLong();
        if (j <= 0 || j2 < 0) {
            throw new IOException("Invalid recovery entry generation");
        }
        while (c17367.available() > 4) {
            if (c17367.readByte() != 0) {
                throw new IOException("Unsupported recovery entry fields");
            }
        }
        if (c17367.readInt() != C4451.m12403(0, 76, bArr)) {
            throw new IOException("Invalid recovery entry checksum");
        }
        return new C9702(uuid, uuid2, j, j2);
    }
}
