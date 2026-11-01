package l;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܰۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C13598 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f44838 = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f44839;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final int f44840;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File f44841;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f44844;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f44845;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f44846;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC10983 f44847;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f44848;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f44849;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f44850;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f44851;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final File f44852;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f44853;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File f44854;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final File f44858;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public long f44857 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f44843 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public long f44842 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Runnable f44856 = new RunnableC23425(this);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2514 f44855 = InterfaceC2514.f9971;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private synchronized void m33220() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f44848 && !this.f44839) {
            for (C2962 c2962 : (C2962[]) this.f44843.values().toArray(new C2962[this.f44843.size()])) {
                C9314 c9314 = c2962.f11097;
                if (c9314 != null) {
                    c9314.m23888();
                }
            }
            m33235();
            this.f44847.close();
            this.f44847 = null;
            this.f44839 = true;
            return;
        }
        this.f44839 = true;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f44848) {
            m33220();
            m33235();
            this.f44847.flush();
        }
    }

    public final synchronized boolean isClosed() {
        return this.f44839;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33226() {
        try {
            InterfaceC10983 interfaceC10983 = this.f44847;
            if (interfaceC10983 != null) {
                interfaceC10983.close();
            }
            InterfaceC10983 interfaceC10983M3436 = C0834.m3436(this.f44855.mo7710(this.f44841));
            try {
                interfaceC10983M3436.mo16418("libcore.io.DiskLruCache");
                interfaceC10983M3436.writeByte(10);
                interfaceC10983M3436.mo16418("1");
                interfaceC10983M3436.writeByte(10);
                interfaceC10983M3436.mo16428(this.f44853);
                interfaceC10983M3436.writeByte(10);
                interfaceC10983M3436.mo16428(this.f44840);
                interfaceC10983M3436.writeByte(10);
                interfaceC10983M3436.writeByte(10);
                Iterator it = this.f44843.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2962 c2962 = (C2962) it.next();
                    if (c2962.f11097 != null) {
                        interfaceC10983M3436.mo16418("DIRTY");
                        interfaceC10983M3436.writeByte(32);
                        interfaceC10983M3436.mo16418(c2962.f11092);
                        interfaceC10983M3436.writeByte(10);
                    } else {
                        interfaceC10983M3436.mo16418("CLEAN");
                        interfaceC10983M3436.writeByte(32);
                        interfaceC10983M3436.mo16418(c2962.f11092);
                        for (long j : c2962.f11094) {
                            interfaceC10983M3436.writeByte(32);
                            interfaceC10983M3436.mo16428(j);
                        }
                        interfaceC10983M3436.writeByte(10);
                    }
                }
                interfaceC10983M3436.close();
                if (this.f44855.mo7709(this.f44858)) {
                    this.f44855.mo7706(this.f44858, this.f44852);
                }
                this.f44855.mo7706(this.f44841, this.f44858);
                this.f44855.mo7703(this.f44852);
                this.f44847 = C0834.m3436(new C14253(this, this.f44855.mo7708(this.f44858)));
                this.f44846 = false;
                this.f44851 = false;
            } catch (Throwable th) {
                interfaceC10983M3436.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33227(String str) {
        m33230();
        m33220();
        m33225(str);
        C2962 c2962 = (C2962) this.f44843.get(str);
        if (c2962 == null) {
            return;
        }
        m33231(c2962);
        if (this.f44857 <= this.f44844) {
            this.f44849 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33232(C9314 c9314, boolean z) {
        C2962 c2962 = c9314.f31588;
        if (c2962.f11097 != c9314) {
            throw new IllegalStateException();
        }
        if (z && !c2962.f11098) {
            for (int i = 0; i < this.f44840; i++) {
                if (!c9314.f31585[i]) {
                    c9314.m23888();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f44855.mo7709(c2962.f11095[i])) {
                    c9314.m23888();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f44840; i2++) {
            File file = c2962.f11095[i2];
            if (!z) {
                this.f44855.mo7703(file);
            } else if (this.f44855.mo7709(file)) {
                File file2 = c2962.f11093[i2];
                this.f44855.mo7706(file, file2);
                long j = c2962.f11094[i2];
                long jMo7704 = this.f44855.mo7704(file2);
                c2962.f11094[i2] = jMo7704;
                this.f44857 = (this.f44857 - j) + jMo7704;
            }
        }
        this.f44845++;
        c2962.f11097 = null;
        if (c2962.f11098 || z) {
            c2962.f11098 = true;
            InterfaceC10983 interfaceC10983 = this.f44847;
            interfaceC10983.mo16418("CLEAN");
            interfaceC10983.writeByte(32);
            this.f44847.mo16418(c2962.f11092);
            InterfaceC10983 interfaceC10984 = this.f44847;
            for (long j2 : c2962.f11094) {
                interfaceC10984.writeByte(32);
                interfaceC10984.mo16428(j2);
            }
            this.f44847.writeByte(10);
            if (z) {
                long j3 = this.f44842;
                this.f44842 = 1 + j3;
                c2962.f11091 = j3;
            }
        } else {
            this.f44843.remove(c2962.f11092);
            InterfaceC10983 interfaceC10985 = this.f44847;
            interfaceC10985.mo16418("REMOVE");
            interfaceC10985.writeByte(32);
            this.f44847.mo16418(c2962.f11092);
            this.f44847.writeByte(10);
        }
        this.f44847.flush();
        if (this.f44857 > this.f44844 || m33233()) {
            this.f44850.execute(this.f44856);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C4424 m33234(String str) {
        m33230();
        m33220();
        m33225(str);
        C2962 c2962 = (C2962) this.f44843.get(str);
        if (c2962 != null && c2962.f11098) {
            C4424 c4424M8784 = c2962.m8784();
            if (c4424M8784 == null) {
                return null;
            }
            this.f44845++;
            InterfaceC10983 interfaceC10983 = this.f44847;
            interfaceC10983.mo16418("READ");
            interfaceC10983.writeByte(32);
            interfaceC10983.mo16418(str);
            interfaceC10983.writeByte(10);
            if (m33233()) {
                this.f44850.execute(this.f44856);
            }
            return c4424M8784;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33230() {
        if (this.f44848) {
            return;
        }
        if (this.f44855.mo7709(this.f44852)) {
            if (this.f44855.mo7709(this.f44858)) {
                this.f44855.mo7703(this.f44852);
            } else {
                this.f44855.mo7706(this.f44852, this.f44858);
            }
        }
        if (this.f44855.mo7709(this.f44858)) {
            try {
                m33224();
                m33223();
                this.f44848 = true;
                return;
            } catch (IOException e) {
                C18743.m43294().mo11390(5, "DiskLruCache " + this.f44854 + " is corrupt: " + e.getMessage() + ", removing", e);
                try {
                    close();
                    this.f44855.mo7705(this.f44854);
                    this.f44839 = false;
                    m33226();
                    this.f44848 = true;
                } catch (Throwable th) {
                    this.f44839 = false;
                    throw th;
                }
            }
        }
        m33226();
        this.f44848 = true;
    }

    public C13598(File file, int i, int i2, long j, ThreadPoolExecutor threadPoolExecutor) {
        this.f44854 = file;
        this.f44853 = i;
        this.f44858 = new File(file, "journal");
        this.f44841 = new File(file, "journal.tmp");
        this.f44852 = new File(file, "journal.bkp");
        this.f44840 = i2;
        this.f44844 = j;
        this.f44850 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13598 m33221(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        return new C13598(file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C0140.m1229("OkHttp DiskLruCache", true)));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m33224() {
        InterfaceC2514 interfaceC2514 = this.f44855;
        File file = this.f44858;
        InterfaceC23683 interfaceC23683M3437 = C0834.m3437(interfaceC2514.mo7707(file));
        try {
            String strMo16426 = interfaceC23683M3437.mo16426();
            String strMo16427 = interfaceC23683M3437.mo16426();
            String strMo16428 = interfaceC23683M3437.mo16426();
            String strMo16429 = interfaceC23683M3437.mo16426();
            String strMo164210 = interfaceC23683M3437.mo16426();
            if (!"libcore.io.DiskLruCache".equals(strMo16426) || !"1".equals(strMo16427) || !Integer.toString(this.f44853).equals(strMo16428) || !Integer.toString(this.f44840).equals(strMo16429) || !"".equals(strMo164210)) {
                throw new IOException("unexpected journal header: [" + strMo16426 + ", " + strMo16427 + ", " + strMo16429 + ", " + strMo164210 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m33222(interfaceC23683M3437.mo16426());
                    i++;
                } catch (EOFException unused) {
                    this.f44845 = i - this.f44843.size();
                    if (!interfaceC23683M3437.mo16415()) {
                        m33226();
                    } else {
                        this.f44847 = C0834.m3436(new C14253(this, interfaceC2514.mo7708(file)));
                    }
                    C0140.m1231(interfaceC23683M3437);
                    return;
                }
            }
        } catch (Throwable th) {
            C0140.m1231(interfaceC23683M3437);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m33222(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f44843;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C2962 c2962 = (C2962) linkedHashMap.get(strSubstring);
        if (c2962 == null) {
            c2962 = new C2962(this, strSubstring);
            linkedHashMap.put(strSubstring, c2962);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            c2962.f11098 = true;
            c2962.f11097 = null;
            if (strArrSplit.length != c2962.f11096.f44840) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                try {
                    c2962.f11094[i2] = Long.parseLong(strArrSplit[i2]);
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                }
            }
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c2962.f11097 = new C9314(this, c2962);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m33223() {
        File file = this.f44841;
        InterfaceC2514 interfaceC2514 = this.f44855;
        interfaceC2514.mo7703(file);
        Iterator it = this.f44843.values().iterator();
        while (it.hasNext()) {
            C2962 c2962 = (C2962) it.next();
            C9314 c9314 = c2962.f11097;
            int i = this.f44840;
            int i2 = 0;
            if (c9314 == null) {
                while (i2 < i) {
                    this.f44857 += c2962.f11094[i2];
                    i2++;
                }
            } else {
                c2962.f11097 = null;
                while (i2 < i) {
                    interfaceC2514.mo7703(c2962.f11093[i2]);
                    interfaceC2514.mo7703(c2962.f11095[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9314 m33229(String str) {
        return m33228(-1L, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9314 m33228(long j, String str) {
        m33230();
        m33220();
        m33225(str);
        C2962 c2962 = (C2962) this.f44843.get(str);
        if (j != -1 && (c2962 == null || c2962.f11091 != j)) {
            return null;
        }
        if (c2962 != null && c2962.f11097 != null) {
            return null;
        }
        if (!this.f44849 && !this.f44851) {
            InterfaceC10983 interfaceC10983 = this.f44847;
            interfaceC10983.mo16418("DIRTY");
            interfaceC10983.writeByte(32);
            interfaceC10983.mo16418(str);
            interfaceC10983.writeByte(10);
            this.f44847.flush();
            if (this.f44846) {
                return null;
            }
            if (c2962 == null) {
                c2962 = new C2962(this, str);
                this.f44843.put(str, c2962);
            }
            C9314 c9314 = new C9314(this, c2962);
            c2962.f11097 = c9314;
            return c9314;
        }
        this.f44850.execute(this.f44856);
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m33233() {
        int i = this.f44845;
        return i >= 2000 && i >= this.f44843.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33231(C2962 c2962) {
        C9314 c9314 = c2962.f11097;
        String str = c2962.f11092;
        if (c9314 != null) {
            c9314.m23889();
        }
        for (int i = 0; i < this.f44840; i++) {
            this.f44855.mo7703(c2962.f11093[i]);
            long j = this.f44857;
            long[] jArr = c2962.f11094;
            this.f44857 = j - jArr[i];
            jArr[i] = 0;
        }
        this.f44845++;
        InterfaceC10983 interfaceC10983 = this.f44847;
        interfaceC10983.mo16418("REMOVE");
        interfaceC10983.writeByte(32);
        interfaceC10983.mo16418(str);
        interfaceC10983.writeByte(10);
        this.f44843.remove(str);
        if (m33233()) {
            this.f44850.execute(this.f44856);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m33235() {
        while (this.f44857 > this.f44844) {
            m33231((C2962) this.f44843.values().iterator().next());
        }
        this.f44849 = false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m33225(String str) {
        if (!f44838.matcher(str).matches()) {
            throw new IllegalArgumentException(C16523.m38890("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }
}
