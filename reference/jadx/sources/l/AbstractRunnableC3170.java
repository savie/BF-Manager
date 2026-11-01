package l;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۗۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I9US */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC3170 implements Runnable, AutoCloseable {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f11920 = C13488.m32997(AbstractRunnableC3170.class);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int f11921;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f11922;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile Thread f11923;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f11924;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile int f11925 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f11926;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f11927;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile C4498 f11928;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f11929;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private synchronized void m9569(long j) {
        Thread thread = this.f11923;
        if (thread != null && Thread.currentThread() != thread) {
            this.f11923 = null;
            try {
                InterfaceC4314 interfaceC4314 = f11920;
                interfaceC4314.mo12135("Interrupting transport thread");
                thread.interrupt();
                interfaceC4314.mo12135("Joining transport thread");
                thread.join(j);
                interfaceC4314.mo12135("Joined transport thread");
            } catch (InterruptedException e) {
                throw new C4498("Failed to join transport thread", e);
            }
        } else if (thread != null) {
            this.f11923 = null;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract void mo9574();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo9578(Long l2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo9579(InterfaceC3314 interfaceC3314);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo9580(InterfaceC9522 interfaceC9522);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo9581(InterfaceC3314 interfaceC3314, InterfaceC9522 interfaceC9522) {
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract long mo9583(InterfaceC3314 interfaceC3314);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract int mo9586(InterfaceC3314 interfaceC3314);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo9588(boolean z, boolean z2);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract Long mo9590();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m9587(long j) {
        int i = this.f11925;
        try {
            try {
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 3) {
                                int i2 = this.f11925;
                                if (i2 != 0 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6) {
                                    f11920.mo12119("Invalid state: " + i2);
                                    this.f11925 = 6;
                                    m9569(j);
                                }
                                return true;
                            }
                            if (i == 4) {
                                this.f11925 = 6;
                                throw new C4498("Connection in error", this.f11928);
                            }
                            if (i != 5 && i != 6) {
                                throw new C4498("Invalid state: " + i);
                            }
                            InterfaceC4314 interfaceC4314 = f11920;
                            interfaceC4314.mo12135("Trying to connect a disconnected transport");
                            int i3 = this.f11925;
                            if (i3 != 0 && i3 != 3 && i3 != 4 && i3 != 5 && i3 != 6) {
                                interfaceC4314.mo12119("Invalid state: " + i3);
                                this.f11925 = 6;
                                m9569(j);
                            }
                            return false;
                        }
                        this.f11923.wait(j);
                        int i4 = this.f11925;
                        if (i4 == 1) {
                            this.f11925 = 6;
                            m9569(j);
                            throw new C23633("Connection timeout");
                        }
                        if (i4 == 2) {
                            if (this.f11928 != null) {
                                this.f11925 = 4;
                                m9569(j);
                                throw this.f11928;
                            }
                            this.f11925 = 3;
                            int i5 = this.f11925;
                            if (i5 != 0 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6) {
                                f11920.mo12119("Invalid state: " + i5);
                                this.f11925 = 6;
                                m9569(j);
                            }
                            return true;
                        }
                    }
                    InterfaceC4314 interfaceC4315 = f11920;
                    if (interfaceC4315.mo12125()) {
                        interfaceC4315.mo12135("Connecting " + this.f11929);
                    }
                    this.f11925 = 1;
                    this.f11928 = null;
                    Thread thread = new Thread(this, this.f11929);
                    thread.setDaemon(true);
                    this.f11923 = thread;
                    synchronized (this.f11923) {
                        thread.start();
                        thread.wait(j);
                        int i6 = this.f11925;
                        if (i6 == 1) {
                            this.f11925 = 6;
                            throw new C23633("Connection timeout");
                        }
                        if (i6 == 2) {
                            if (this.f11928 != null) {
                                this.f11925 = 4;
                                throw this.f11928;
                            }
                            this.f11925 = 3;
                            int i7 = this.f11925;
                            if (i7 != 0 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
                                interfaceC4315.mo12119("Invalid state: " + i7);
                                this.f11925 = 6;
                                m9569(j);
                            }
                            return true;
                        }
                        if (i6 != 3) {
                            int i8 = this.f11925;
                            if (i8 != 0 && i8 != 3 && i8 != 4 && i8 != 5 && i8 != 6) {
                                interfaceC4315.mo12119("Invalid state: " + i8);
                                this.f11925 = 6;
                                m9569(j);
                            }
                            return false;
                        }
                        int i9 = this.f11925;
                        if (i9 != 0 && i9 != 3 && i9 != 4 && i9 != 5 && i9 != 6) {
                            interfaceC4315.mo12119("Invalid state: " + i9);
                            this.f11925 = 6;
                            m9569(j);
                        }
                        return true;
                    }
                } catch (C4498 e) {
                    m9569(j);
                    throw e;
                }
            } catch (InterruptedException e2) {
                this.f11925 = 6;
                m9569(j);
                throw new C4498(e2);
            } catch (C23633 e3) {
                m9569(j);
                this.f11925 = 0;
                throw e3;
            }
        } catch (Throwable th) {
            int i10 = this.f11925;
            if (i10 != 0 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
                f11920.mo12119("Invalid state: " + i10);
                this.f11925 = 6;
                m9569(j);
            }
            throw th;
        }
    }

    public AbstractRunnableC3170() {
        StringBuilder sb = new StringBuilder("Transport");
        int i = f11921;
        f11921 = i + 1;
        sb.append(i);
        this.f11929 = sb.toString();
        this.f11926 = new Object();
        this.f11922 = new Object();
        this.f11927 = new ConcurrentMapC13783(10);
        this.f11924 = new AtomicLong(1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9570(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i + i2 > bArr.length) {
            throw new IOException("Buffer too short, bufsize " + bArr.length + " read " + i2);
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 <= 0) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9577() {
        long jIncrementAndGet = this.f11924.incrementAndGet();
        InterfaceC4314 interfaceC4314 = f11920;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Acquire transport " + jIncrementAndGet + " " + this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m9589();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m9589() {
        long jDecrementAndGet = this.f11924.decrementAndGet();
        InterfaceC4314 interfaceC4314 = f11920;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Release transport " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new C17655("Usage count dropped below zero");
            }
        } else if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("Transport usage dropped to zero " + this);
        }
    }

    public final void finalize() {
        if (mo9573() || this.f11924.get() == 0) {
            return;
        }
        f11920.mo12116("Session was not properly released");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m9591() {
        return this.f11924.get();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean mo9573() {
        return this.f11925 == 4 || this.f11925 == 5 || this.f11925 == 6 || this.f11925 == 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean mo9585() {
        return this.f11925 == 5 || this.f11925 == 6;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9522 mo9576(InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913, Set set) throws C4498 {
        if (mo9573() && this.f11925 != 5) {
            throw new C4498("Transport is disconnected " + this.f11929);
        }
        try {
            try {
                try {
                    long jMo9586 = !set.contains(EnumC19358.NO_TIMEOUT) ? mo9586(interfaceC3314) : 0L;
                    long jM9575 = m9575(interfaceC3314, interfaceC4913, set, jMo9586);
                    if (Thread.currentThread() == this.f11923) {
                        synchronized (this.f11926) {
                            Long lMo9590 = mo9590();
                            if (lMo9590.longValue() == jM9575) {
                                mo9580(interfaceC4913);
                                interfaceC4913.mo17296();
                                InterfaceC9522 interfaceC9522Mo9821 = interfaceC4913;
                                while (interfaceC9522Mo9821 != null) {
                                    this.f11927.remove(Long.valueOf(interfaceC9522Mo9821.mo24367()));
                                    interfaceC3314 = interfaceC3314.mo9818();
                                    if (interfaceC3314 == null) {
                                        break;
                                    }
                                    interfaceC9522Mo9821 = interfaceC3314.mo9821();
                                }
                                return interfaceC4913;
                            }
                            mo9578(lMo9590);
                        }
                    }
                    m9571(interfaceC3314, interfaceC4913, jMo9586);
                    InterfaceC9522 interfaceC9522Mo9822 = interfaceC4913;
                    while (interfaceC9522Mo9822 != null) {
                        this.f11927.remove(Long.valueOf(interfaceC9522Mo9822.mo24367()));
                        interfaceC3314 = interfaceC3314.mo9818();
                        if (interfaceC3314 == null) {
                            break;
                        }
                        interfaceC9522Mo9822 = interfaceC3314.mo9821();
                    }
                    return interfaceC4913;
                } catch (InterruptedException e) {
                    throw new C4498(e);
                }
            } catch (IOException e2) {
                f11920.mo12122("sendrecv failed", (Throwable) e2);
                try {
                    m9584();
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                    f11920.mo12136("disconnect failed", (Exception) e3);
                }
                throw e2;
            }
        } catch (Throwable th) {
            InterfaceC9522 interfaceC9522Mo9823 = interfaceC4913;
            while (interfaceC9522Mo9823 != null) {
                this.f11927.remove(Long.valueOf(interfaceC9522Mo9823.mo24367()));
                interfaceC3314 = interfaceC3314.mo9818();
                if (interfaceC3314 == null) {
                    break;
                }
                interfaceC9522Mo9823 = interfaceC3314.mo9821();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m9575(InterfaceC3314 interfaceC3314, InterfaceC9522 interfaceC9522, Set set, long j) {
        InterfaceC3314 interfaceC3314Mo9818 = interfaceC3314;
        long j2 = 0;
        while (interfaceC9522 != null) {
            interfaceC9522.reset();
            if (set.contains(EnumC19358.RETAIN_PAYLOAD)) {
                interfaceC9522.mo31361();
            }
            long jMo9583 = mo9583(interfaceC3314Mo9818);
            if (j2 == 0) {
                j2 = jMo9583;
            }
            if (j > 0) {
                interfaceC9522.mo17299(Long.valueOf(System.currentTimeMillis() + j));
            } else {
                interfaceC9522.mo17299((Long) null);
            }
            interfaceC9522.m24366(jMo9583);
            this.f11927.put(Long.valueOf(jMo9583), interfaceC9522);
            interfaceC3314Mo9818 = interfaceC3314Mo9818.mo9818();
            if (interfaceC3314Mo9818 == null) {
                break;
            }
            interfaceC9522 = interfaceC3314Mo9818.mo9821();
        }
        mo9579(interfaceC3314);
        return j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9571(InterfaceC3314 interfaceC3314, InterfaceC9522 interfaceC9522, long j) {
        InterfaceC3314 interfaceC3314Mo9818 = interfaceC3314;
        while (interfaceC9522 != null) {
            synchronized (interfaceC9522) {
                if (interfaceC9522.mo17295()) {
                    interfaceC3314Mo9818 = interfaceC3314Mo9818.mo9818();
                    if (interfaceC3314Mo9818 == null) {
                        return;
                    } else {
                        interfaceC9522 = interfaceC3314Mo9818.mo9821();
                    }
                } else if (j > 0) {
                    interfaceC9522.wait(j);
                    if (interfaceC9522.mo17295() || !mo9581(interfaceC3314Mo9818, interfaceC9522)) {
                        if (interfaceC9522.mo17304()) {
                            throw new C4498(this.f11929 + " error reading response to " + interfaceC3314Mo9818, interfaceC9522.getException());
                        }
                        if (mo9573() && this.f11925 != 5) {
                            throw new C4498(String.format("Transport was disconnected while waiting for a response (transport: %s state: %d),", this.f11929, Integer.valueOf(this.f11925)));
                        }
                        j = interfaceC9522.mo17294().longValue() - System.currentTimeMillis();
                        if (j <= 0) {
                            InterfaceC4314 interfaceC4314 = f11920;
                            if (interfaceC4314.mo12125()) {
                                interfaceC4314.mo12135("State is " + this.f11925);
                            }
                            throw new C1759(this.f11929 + " timedout waiting for response to " + interfaceC3314Mo9818);
                        }
                    }
                } else {
                    interfaceC9522.wait();
                    if (!mo9581(interfaceC3314, interfaceC9522)) {
                        InterfaceC4314 interfaceC4315 = f11920;
                        if (interfaceC4315.mo12125()) {
                            interfaceC4315.mo12135("Wait returned state is " + this.f11925);
                        }
                        if (mo9573()) {
                            throw new InterruptedException("Transport was disconnected while waiting for a response");
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m9572() {
        while (this.f11923 == Thread.currentThread()) {
            try {
                synchronized (this.f11926) {
                    try {
                        try {
                            Long lMo9590 = mo9590();
                            if (lMo9590 == null) {
                                synchronized (this) {
                                    Iterator it = this.f11927.values().iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC9522) it.next()).mo17302();
                                    }
                                }
                                throw new IOException("end of stream");
                            }
                            InterfaceC9522 interfaceC9522 = (InterfaceC9522) this.f11927.get(lMo9590);
                            if (interfaceC9522 == null) {
                                InterfaceC4314 interfaceC4314 = f11920;
                                if (interfaceC4314.mo12125()) {
                                    interfaceC4314.mo12135("Unexpected message id, skipping message " + lMo9590);
                                }
                                mo9578(lMo9590);
                            } else {
                                mo9580(interfaceC9522);
                                interfaceC9522.mo17296();
                            }
                        } catch (SocketTimeoutException e) {
                            f11920.mo12131("Socket timeout during peekKey", e);
                            if (this.f11924.get() > 0) {
                                InterfaceC4314 interfaceC4315 = f11920;
                                if (interfaceC4315.mo12125()) {
                                    interfaceC4315.mo12135("Transport still in use, no idle timeout " + this);
                                }
                                for (InterfaceC9522 interfaceC9523 : this.f11927.values()) {
                                    synchronized (interfaceC9523) {
                                        interfaceC9523.notifyAll();
                                    }
                                }
                            } else {
                                InterfaceC4314 interfaceC4316 = f11920;
                                if (interfaceC4316.mo12125()) {
                                    interfaceC4316.mo12135("Idle timeout on " + this.f11929);
                                }
                                throw e;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                boolean z = false;
                boolean z2 = (e2 instanceof SocketTimeoutException) || (message != null && message.equals("Read timed out"));
                if (message != null && message.equals("Socket closed")) {
                    f11920.mo12127("Remote closed connection");
                } else if (z2) {
                    f11920.mo12120("socket timeout in non peek state", e2);
                } else {
                    f11920.mo12120("recv failed", e2);
                }
                synchronized (this) {
                    try {
                        m9582(!z2, false);
                    } catch (IOException e3) {
                        e2.addSuppressed(e3);
                        f11920.mo12122("Failed to disconnect", (Throwable) e3);
                    }
                    f11920.mo12135("Disconnected");
                    Iterator it2 = this.f11927.entrySet().iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC9522) ((Map.Entry) it2.next()).getValue()).mo17298(e2);
                        it2.remove();
                        z = true;
                    }
                    if (z) {
                        f11920.mo12135("Notified clients");
                    } else {
                        f11920.mo12120("Exception without a request pending", e2);
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9584() {
        m9582(true, true);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:14:0x0019, B:32:0x0057, B:27:0x004e, B:17:0x0034, B:22:0x0041, B:26:0x004c), top: B:38:0x0004, inners: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0055, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m9582(boolean z, boolean z2) {
        int i = this.f11925;
        if (i != 0) {
            IOException iOException = null;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        e = null;
                        this.f11923 = null;
                        this.f11925 = 6;
                        iOException = e;
                    } else if (i != 5 && i != 6) {
                        f11920.mo12119("Invalid state: " + this.f11925);
                        this.f11923 = null;
                        this.f11925 = 6;
                    }
                }
                if (iOException == null) {
                    return false;
                }
                throw iOException;
            }
            z = true;
            if (this.f11927.size() == 0 || z || !z2) {
                try {
                    this.f11925 = 5;
                    boolean zMo9588 = mo9588(z, z2);
                    this.f11925 = 6;
                    return zMo9588;
                } catch (IOException e) {
                    e = e;
                    this.f11925 = 6;
                }
            }
            if (iOException == null) {
                return false;
            }
            throw iOException;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        try {
            if (this.f11925 != 5 && this.f11925 != 6) {
                mo9574();
            }
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f11923) {
                    return;
                }
                this.f11925 = 2;
                threadCurrentThread.notify();
                m9572();
            }
        } catch (Exception e) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f11923) {
                    if (e instanceof SocketTimeoutException) {
                        f11920.mo12120("Timeout connecting", e);
                    } else {
                        f11920.mo12122("Exception in transport thread", (Throwable) e);
                    }
                } else {
                    if (e instanceof SocketTimeoutException) {
                        this.f11928 = new C23633(e);
                    } else {
                        this.f11928 = new C4498(e);
                    }
                    this.f11925 = 2;
                    threadCurrentThread.notify();
                }
            }
        } catch (Throwable th) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f11923) {
                    return;
                }
                this.f11925 = 2;
                threadCurrentThread.notify();
                throw th;
            }
        }
    }

    public String toString() {
        return this.f11929;
    }
}
