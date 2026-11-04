package l;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.֡֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9US */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC0066 implements Runnable, AutoCloseable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f965 = C16980.m40037(AbstractRunnableC0066.class);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int f966;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f967;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AtomicLong f968;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile int f969 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile Thread f970;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f971;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f972;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile C7524 f973;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f974;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private synchronized void m1080(long j) {
        Thread thread = this.f970;
        if (thread != null && Thread.currentThread() != thread) {
            this.f970 = null;
            try {
                InterfaceC25186 interfaceC25186 = f965;
                interfaceC25186.mo13721("Interrupting transport thread");
                thread.interrupt();
                interfaceC25186.mo13721("Joining transport thread");
                thread.join(j);
                interfaceC25186.mo13721("Joined transport thread");
            } catch (InterruptedException e) {
                throw new C7524("Failed to join transport thread", e);
            }
        } else if (thread != null) {
            this.f970 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo1085(Long l2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo1086(InterfaceC17965 interfaceC17965);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo1087(InterfaceC21299 interfaceC21299);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo1088(InterfaceC21299 interfaceC21299, InterfaceC17965 interfaceC17965) {
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract long mo1091(InterfaceC21299 interfaceC21299);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract void mo1092();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract Long mo1096();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo1097(InterfaceC21299 interfaceC21299);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract boolean mo1100(boolean z, boolean z2);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m1099(long j) {
        int i = this.f969;
        try {
            try {
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 3) {
                                int i2 = this.f969;
                                if (i2 != 0 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6) {
                                    f965.mo13699("Invalid state: " + i2);
                                    this.f969 = 6;
                                    m1080(j);
                                }
                                return true;
                            }
                            if (i == 4) {
                                this.f969 = 6;
                                throw new C7524("Connection in error", this.f973);
                            }
                            if (i != 5 && i != 6) {
                                throw new C7524("Invalid state: " + i);
                            }
                            InterfaceC25186 interfaceC25186 = f965;
                            interfaceC25186.mo13721("Trying to connect a disconnected transport");
                            int i3 = this.f969;
                            if (i3 != 0 && i3 != 3 && i3 != 4 && i3 != 5 && i3 != 6) {
                                interfaceC25186.mo13699("Invalid state: " + i3);
                                this.f969 = 6;
                                m1080(j);
                            }
                            return false;
                        }
                        this.f970.wait(j);
                        int i4 = this.f969;
                        if (i4 == 1) {
                            this.f969 = 6;
                            m1080(j);
                            throw new C3795("Connection timeout");
                        }
                        if (i4 == 2) {
                            if (this.f973 != null) {
                                this.f969 = 4;
                                m1080(j);
                                throw this.f973;
                            }
                            this.f969 = 3;
                            int i5 = this.f969;
                            if (i5 != 0 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6) {
                                f965.mo13699("Invalid state: " + i5);
                                this.f969 = 6;
                                m1080(j);
                            }
                            return true;
                        }
                    }
                    InterfaceC25186 interfaceC25187 = f965;
                    if (interfaceC25187.mo13707()) {
                        interfaceC25187.mo13721("Connecting " + this.f974);
                    }
                    this.f969 = 1;
                    this.f973 = null;
                    Thread thread = new Thread(this, this.f974);
                    thread.setDaemon(true);
                    this.f970 = thread;
                    synchronized (this.f970) {
                        thread.start();
                        thread.wait(j);
                        int i6 = this.f969;
                        if (i6 == 1) {
                            this.f969 = 6;
                            throw new C3795("Connection timeout");
                        }
                        if (i6 == 2) {
                            if (this.f973 != null) {
                                this.f969 = 4;
                                throw this.f973;
                            }
                            this.f969 = 3;
                            int i7 = this.f969;
                            if (i7 != 0 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
                                interfaceC25187.mo13699("Invalid state: " + i7);
                                this.f969 = 6;
                                m1080(j);
                            }
                            return true;
                        }
                        if (i6 != 3) {
                            int i8 = this.f969;
                            if (i8 != 0 && i8 != 3 && i8 != 4 && i8 != 5 && i8 != 6) {
                                interfaceC25187.mo13699("Invalid state: " + i8);
                                this.f969 = 6;
                                m1080(j);
                            }
                            return false;
                        }
                        int i9 = this.f969;
                        if (i9 != 0 && i9 != 3 && i9 != 4 && i9 != 5 && i9 != 6) {
                            interfaceC25187.mo13699("Invalid state: " + i9);
                            this.f969 = 6;
                            m1080(j);
                        }
                        return true;
                    }
                } catch (C3795 e) {
                    m1080(j);
                    this.f969 = 0;
                    throw e;
                }
            } catch (InterruptedException e2) {
                this.f969 = 6;
                m1080(j);
                throw new C7524(e2);
            } catch (C7524 e3) {
                m1080(j);
                throw e3;
            }
        } catch (Throwable th) {
            int i10 = this.f969;
            if (i10 != 0 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
                f965.mo13699("Invalid state: " + i10);
                this.f969 = 6;
                m1080(j);
            }
            throw th;
        }
    }

    public AbstractRunnableC0066() {
        StringBuilder sb = new StringBuilder("Transport");
        int i = f966;
        f966 = i + 1;
        sb.append(i);
        this.f974 = sb.toString();
        this.f971 = new Object();
        this.f972 = new Object();
        this.f967 = new ConcurrentMapC17249(10);
        this.f968 = new AtomicLong(1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m1078(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
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
    public final void m1084() {
        long jIncrementAndGet = this.f968.incrementAndGet();
        InterfaceC25186 interfaceC25186 = f965;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Acquire transport " + jIncrementAndGet + " " + this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m1095();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m1095() {
        long jDecrementAndGet = this.f968.decrementAndGet();
        InterfaceC25186 interfaceC25186 = f965;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Release transport " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new C3640("Usage count dropped below zero");
            }
        } else if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("Transport usage dropped to zero " + this);
        }
    }

    public final void finalize() {
        if (mo1093() || this.f968.get() == 0) {
            return;
        }
        f965.mo13729("Session was not properly released");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m1094() {
        return this.f968.get();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean mo1093() {
        return this.f969 == 4 || this.f969 == 5 || this.f969 == 6 || this.f969 == 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean mo1090() {
        return this.f969 == 5 || this.f969 == 6;
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
    public final InterfaceC17965 mo1083(InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315, Set set) throws C7524 {
        if (mo1093() && this.f969 != 5) {
            throw new C7524("Transport is disconnected " + this.f974);
        }
        try {
            try {
                try {
                    long jMo1097 = !set.contains(EnumC13269.NO_TIMEOUT) ? mo1097(interfaceC21299) : 0L;
                    long jM1082 = m1082(interfaceC21299, interfaceC18315, set, jMo1097);
                    if (Thread.currentThread() == this.f970) {
                        synchronized (this.f971) {
                            Long lMo1096 = mo1096();
                            if (lMo1096.longValue() == jM1082) {
                                mo1086(interfaceC18315);
                                interfaceC18315.mo12752();
                                InterfaceC17965 interfaceC17965Mo1727 = interfaceC18315;
                                while (interfaceC17965Mo1727 != null) {
                                    this.f967.remove(Long.valueOf(interfaceC17965Mo1727.mo12771()));
                                    interfaceC21299 = interfaceC21299.mo12790();
                                    if (interfaceC21299 == null) {
                                        break;
                                    }
                                    interfaceC17965Mo1727 = interfaceC21299.mo1727();
                                }
                                return interfaceC18315;
                            }
                            mo1085(lMo1096);
                        }
                    }
                    m1079(interfaceC21299, interfaceC18315, jMo1097);
                    InterfaceC17965 interfaceC17965Mo1728 = interfaceC18315;
                    while (interfaceC17965Mo1728 != null) {
                        this.f967.remove(Long.valueOf(interfaceC17965Mo1728.mo12771()));
                        interfaceC21299 = interfaceC21299.mo12790();
                        if (interfaceC21299 == null) {
                            break;
                        }
                        interfaceC17965Mo1728 = interfaceC21299.mo1727();
                    }
                    return interfaceC18315;
                } catch (InterruptedException e) {
                    throw new C7524(e);
                }
            } catch (IOException e2) {
                f965.mo13702("sendrecv failed", (Throwable) e2);
                try {
                    m1098();
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                    f965.mo13700("disconnect failed", (Exception) e3);
                }
                throw e2;
            }
        } catch (Throwable th) {
            InterfaceC17965 interfaceC17965Mo1729 = interfaceC18315;
            while (interfaceC17965Mo1729 != null) {
                this.f967.remove(Long.valueOf(interfaceC17965Mo1729.mo12771()));
                interfaceC21299 = interfaceC21299.mo12790();
                if (interfaceC21299 == null) {
                    break;
                }
                interfaceC17965Mo1729 = interfaceC21299.mo1727();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m1082(InterfaceC21299 interfaceC21299, InterfaceC17965 interfaceC17965, Set set, long j) {
        InterfaceC21299 interfaceC21299Mo12790 = interfaceC21299;
        long j2 = 0;
        while (interfaceC17965 != null) {
            interfaceC17965.reset();
            if (set.contains(EnumC13269.RETAIN_PAYLOAD)) {
                interfaceC17965.mo10333();
            }
            long jMo1091 = mo1091(interfaceC21299Mo12790);
            if (j2 == 0) {
                j2 = jMo1091;
            }
            if (j > 0) {
                interfaceC17965.mo12765(Long.valueOf(System.currentTimeMillis() + j));
            } else {
                interfaceC17965.mo12765((Long) null);
            }
            interfaceC17965.m41923(jMo1091);
            this.f967.put(Long.valueOf(jMo1091), interfaceC17965);
            interfaceC21299Mo12790 = interfaceC21299Mo12790.mo12790();
            if (interfaceC21299Mo12790 == null) {
                break;
            }
            interfaceC17965 = interfaceC21299Mo12790.mo1727();
        }
        mo1087(interfaceC21299);
        return j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1079(InterfaceC21299 interfaceC21299, InterfaceC17965 interfaceC17965, long j) {
        InterfaceC21299 interfaceC21299Mo12790 = interfaceC21299;
        while (interfaceC17965 != null) {
            synchronized (interfaceC17965) {
                if (interfaceC17965.mo12784()) {
                    interfaceC21299Mo12790 = interfaceC21299Mo12790.mo12790();
                    if (interfaceC21299Mo12790 == null) {
                        return;
                    } else {
                        interfaceC17965 = interfaceC21299Mo12790.mo1727();
                    }
                } else if (j > 0) {
                    interfaceC17965.wait(j);
                    if (interfaceC17965.mo12784() || !mo1088(interfaceC21299Mo12790, interfaceC17965)) {
                        if (interfaceC17965.mo12788()) {
                            throw new C7524(this.f974 + " error reading response to " + interfaceC21299Mo12790, interfaceC17965.getException());
                        }
                        if (mo1093() && this.f969 != 5) {
                            throw new C7524(String.format("Transport was disconnected while waiting for a response (transport: %s state: %d),", this.f974, Integer.valueOf(this.f969)));
                        }
                        j = interfaceC17965.mo12777().longValue() - System.currentTimeMillis();
                        if (j <= 0) {
                            InterfaceC25186 interfaceC25186 = f965;
                            if (interfaceC25186.mo13707()) {
                                interfaceC25186.mo13721("State is " + this.f969);
                            }
                            throw new C20949(this.f974 + " timedout waiting for response to " + interfaceC21299Mo12790);
                        }
                    }
                } else {
                    interfaceC17965.wait();
                    if (!mo1088(interfaceC21299, interfaceC17965)) {
                        InterfaceC25186 interfaceC25187 = f965;
                        if (interfaceC25187.mo13707()) {
                            interfaceC25187.mo13721("Wait returned state is " + this.f969);
                        }
                        if (mo1093()) {
                            throw new InterruptedException("Transport was disconnected while waiting for a response");
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m1081() {
        while (this.f970 == Thread.currentThread()) {
            try {
                synchronized (this.f971) {
                    try {
                        try {
                            Long lMo1096 = mo1096();
                            if (lMo1096 == null) {
                                synchronized (this) {
                                    Iterator it = this.f967.values().iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC17965) it.next()).mo12775();
                                    }
                                }
                                throw new IOException("end of stream");
                            }
                            InterfaceC17965 interfaceC17965 = (InterfaceC17965) this.f967.get(lMo1096);
                            if (interfaceC17965 == null) {
                                InterfaceC25186 interfaceC25186 = f965;
                                if (interfaceC25186.mo13707()) {
                                    interfaceC25186.mo13721("Unexpected message id, skipping message " + lMo1096);
                                }
                                mo1085(lMo1096);
                            } else {
                                mo1086(interfaceC17965);
                                interfaceC17965.mo12752();
                            }
                        } catch (SocketTimeoutException e) {
                            f965.mo13722("Socket timeout during peekKey", (Exception) e);
                            if (this.f968.get() > 0) {
                                InterfaceC25186 interfaceC25187 = f965;
                                if (interfaceC25187.mo13707()) {
                                    interfaceC25187.mo13721("Transport still in use, no idle timeout " + this);
                                }
                                for (InterfaceC17965 interfaceC17966 : this.f967.values()) {
                                    synchronized (interfaceC17966) {
                                        interfaceC17966.notifyAll();
                                    }
                                }
                            } else {
                                InterfaceC25186 interfaceC25188 = f965;
                                if (interfaceC25188.mo13707()) {
                                    interfaceC25188.mo13721("Idle timeout on " + this.f974);
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
                    f965.mo13717("Remote closed connection");
                } else if (z2) {
                    f965.mo13711("socket timeout in non peek state", e2);
                } else {
                    f965.mo13711("recv failed", e2);
                }
                synchronized (this) {
                    try {
                        m1089(!z2, false);
                    } catch (IOException e3) {
                        e2.addSuppressed(e3);
                        f965.mo13702("Failed to disconnect", (Throwable) e3);
                    }
                    f965.mo13721("Disconnected");
                    Iterator it2 = this.f967.entrySet().iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC17965) ((Map.Entry) it2.next()).getValue()).mo12764(e2);
                        it2.remove();
                        z = true;
                    }
                    if (z) {
                        f965.mo13721("Notified clients");
                    } else {
                        f965.mo13711("Exception without a request pending", e2);
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m1098() {
        m1089(true, true);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:14:0x0019, B:32:0x0057, B:27:0x004e, B:17:0x0034, B:22:0x0041, B:26:0x004c), top: B:38:0x0004, inners: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0055, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m1089(boolean z, boolean z2) {
        int i = this.f969;
        if (i != 0) {
            IOException iOException = null;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        e = null;
                        this.f970 = null;
                        this.f969 = 6;
                        iOException = e;
                    } else if (i != 5 && i != 6) {
                        f965.mo13699("Invalid state: " + this.f969);
                        this.f970 = null;
                        this.f969 = 6;
                    }
                }
                if (iOException == null) {
                    return false;
                }
                throw iOException;
            }
            z = true;
            if (this.f967.size() == 0 || z || !z2) {
                try {
                    this.f969 = 5;
                    boolean zMo1100 = mo1100(z, z2);
                    this.f969 = 6;
                    return zMo1100;
                } catch (IOException e) {
                    e = e;
                    this.f969 = 6;
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
            if (this.f969 != 5 && this.f969 != 6) {
                mo1092();
            }
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f970) {
                    return;
                }
                this.f969 = 2;
                threadCurrentThread.notify();
                m1081();
            }
        } catch (Exception e) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f970) {
                    if (e instanceof SocketTimeoutException) {
                        f965.mo13711("Timeout connecting", e);
                    } else {
                        f965.mo13702("Exception in transport thread", (Throwable) e);
                    }
                } else {
                    if (e instanceof SocketTimeoutException) {
                        this.f973 = new C3795(e);
                    } else {
                        this.f973 = new C7524(e);
                    }
                    this.f969 = 2;
                    threadCurrentThread.notify();
                }
            }
        } catch (Throwable th) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f970) {
                    return;
                }
                this.f969 = 2;
                threadCurrentThread.notify();
                throw th;
            }
        }
    }

    public String toString() {
        return this.f974;
    }
}
