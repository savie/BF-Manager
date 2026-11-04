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

/* JADX INFO: renamed from: l.᩵۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20568 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f65867 = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final File f65868;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f65869;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final File f65870;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f65871;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC11573 f65872;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f65873;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final File f65874;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final File f65875;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f65876;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f65877;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int f65878;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f65880;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f65882;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f65884;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65886;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public long f65881 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f65879 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public long f65887 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Runnable f65885 = new RunnableC25044(this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6070 f65883 = InterfaceC6070.f20720;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private synchronized void m47150() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f65869 && !this.f65882) {
            for (C23552 c23552 : (C23552[]) this.f65879.values().toArray(new C23552[this.f65879.size()])) {
                C16092 c16092 = c23552.f76083;
                if (c16092 != null) {
                    c16092.m38247();
                }
            }
            m47160();
            this.f65872.close();
            this.f65872 = null;
            this.f65882 = true;
            return;
        }
        this.f65882 = true;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f65869) {
            m47150();
            m47160();
            this.f65872.flush();
        }
    }

    public final synchronized boolean isClosed() {
        return this.f65882;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47157(C16092 c16092, boolean z) {
        C23552 c23552 = c16092.f52135;
        if (c23552.f76083 != c16092) {
            throw new IllegalStateException();
        }
        if (z && !c23552.f76081) {
            for (int i = 0; i < this.f65878; i++) {
                if (!c16092.f52136[i]) {
                    c16092.m38247();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f65883.mo17582(c23552.f76079[i])) {
                    c16092.m38247();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f65878; i2++) {
            File file = c23552.f76079[i2];
            if (!z) {
                this.f65883.mo17579(file);
            } else if (this.f65883.mo17582(file)) {
                File file2 = c23552.f76077[i2];
                this.f65883.mo17577(file, file2);
                long j = c23552.f76082[i2];
                long jMo17583 = this.f65883.mo17583(file2);
                c23552.f76082[i2] = jMo17583;
                this.f65881 = (this.f65881 - j) + jMo17583;
            }
        }
        this.f65884++;
        c23552.f76083 = null;
        if (c23552.f76081 || z) {
            c23552.f76081 = true;
            InterfaceC11573 interfaceC11573 = this.f65872;
            interfaceC11573.mo6442("CLEAN");
            interfaceC11573.writeByte(32);
            this.f65872.mo6442(c23552.f76084);
            InterfaceC11573 interfaceC11574 = this.f65872;
            for (long j2 : c23552.f76082) {
                interfaceC11574.writeByte(32);
                interfaceC11574.mo6447(j2);
            }
            this.f65872.writeByte(10);
            if (z) {
                long j3 = this.f65887;
                this.f65887 = 1 + j3;
                c23552.f76080 = j3;
            }
        } else {
            this.f65879.remove(c23552.f76084);
            InterfaceC11573 interfaceC11575 = this.f65872;
            interfaceC11575.mo6442("REMOVE");
            interfaceC11575.writeByte(32);
            this.f65872.mo6442(c23552.f76084);
            this.f65872.writeByte(10);
        }
        this.f65872.flush();
        if (this.f65881 > this.f65871 || m47162()) {
            this.f65873.execute(this.f65885);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47159() {
        try {
            InterfaceC11573 interfaceC11573 = this.f65872;
            if (interfaceC11573 != null) {
                interfaceC11573.close();
            }
            InterfaceC11573 interfaceC11573M35106 = C14556.m35106(this.f65883.mo17580(this.f65874));
            try {
                interfaceC11573M35106.mo6442("libcore.io.DiskLruCache");
                interfaceC11573M35106.writeByte(10);
                interfaceC11573M35106.mo6442("1");
                interfaceC11573M35106.writeByte(10);
                interfaceC11573M35106.mo6447(this.f65880);
                interfaceC11573M35106.writeByte(10);
                interfaceC11573M35106.mo6447(this.f65878);
                interfaceC11573M35106.writeByte(10);
                interfaceC11573M35106.writeByte(10);
                Iterator it = this.f65879.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C23552 c23552 = (C23552) it.next();
                    if (c23552.f76083 != null) {
                        interfaceC11573M35106.mo6442("DIRTY");
                        interfaceC11573M35106.writeByte(32);
                        interfaceC11573M35106.mo6442(c23552.f76084);
                        interfaceC11573M35106.writeByte(10);
                    } else {
                        interfaceC11573M35106.mo6442("CLEAN");
                        interfaceC11573M35106.writeByte(32);
                        interfaceC11573M35106.mo6442(c23552.f76084);
                        for (long j : c23552.f76082) {
                            interfaceC11573M35106.writeByte(32);
                            interfaceC11573M35106.mo6447(j);
                        }
                        interfaceC11573M35106.writeByte(10);
                    }
                }
                interfaceC11573M35106.close();
                if (this.f65883.mo17582(this.f65875)) {
                    this.f65883.mo17577(this.f65875, this.f65870);
                }
                this.f65883.mo17577(this.f65874, this.f65875);
                this.f65883.mo17579(this.f65870);
                this.f65872 = C14556.m35106(new C16838(this, this.f65883.mo17578(this.f65875)));
                this.f65876 = false;
                this.f65886 = false;
            } catch (Throwable th) {
                interfaceC11573M35106.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C3414 m47161(String str) {
        m47156();
        m47150();
        m47151(str);
        C23552 c23552 = (C23552) this.f65879.get(str);
        if (c23552 != null && c23552.f76081) {
            C3414 c3414M52755 = c23552.m52755();
            if (c3414M52755 == null) {
                return null;
            }
            this.f65884++;
            InterfaceC11573 interfaceC11573 = this.f65872;
            interfaceC11573.mo6442("READ");
            interfaceC11573.writeByte(32);
            interfaceC11573.mo6442(str);
            interfaceC11573.writeByte(10);
            if (m47162()) {
                this.f65873.execute(this.f65885);
            }
            return c3414M52755;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m47163(String str) {
        m47156();
        m47150();
        m47151(str);
        C23552 c23552 = (C23552) this.f65879.get(str);
        if (c23552 == null) {
            return;
        }
        m47158(c23552);
        if (this.f65881 <= this.f65871) {
            this.f65877 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47156() {
        if (this.f65869) {
            return;
        }
        if (this.f65883.mo17582(this.f65870)) {
            if (this.f65883.mo17582(this.f65875)) {
                this.f65883.mo17579(this.f65870);
            } else {
                this.f65883.mo17577(this.f65870, this.f65875);
            }
        }
        if (this.f65883.mo17582(this.f65875)) {
            try {
                m47152();
                m47149();
                this.f65869 = true;
                return;
            } catch (IOException e) {
                C9052.m24178().mo24180(5, "DiskLruCache " + this.f65868 + " is corrupt: " + e.getMessage() + ", removing", e);
                try {
                    close();
                    this.f65883.mo17576(this.f65868);
                    this.f65882 = false;
                    m47159();
                    this.f65869 = true;
                } catch (Throwable th) {
                    this.f65882 = false;
                    throw th;
                }
            }
        }
        m47159();
        this.f65869 = true;
    }

    public C20568(File file, int i, int i2, long j, ThreadPoolExecutor threadPoolExecutor) {
        this.f65868 = file;
        this.f65880 = i;
        this.f65875 = new File(file, "journal");
        this.f65874 = new File(file, "journal.tmp");
        this.f65870 = new File(file, "journal.bkp");
        this.f65878 = i2;
        this.f65871 = j;
        this.f65873 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20568 m47148(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        return new C20568(file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C19822.m45599("OkHttp DiskLruCache", true)));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m47152() {
        InterfaceC6070 interfaceC6070 = this.f65883;
        File file = this.f65875;
        InterfaceC25000 interfaceC25000M35108 = C14556.m35108(interfaceC6070.mo17581(file));
        try {
            String strMo4185 = interfaceC25000M35108.mo4185();
            String strMo4186 = interfaceC25000M35108.mo4185();
            String strMo4187 = interfaceC25000M35108.mo4185();
            String strMo4188 = interfaceC25000M35108.mo4185();
            String strMo4189 = interfaceC25000M35108.mo4185();
            if (!"libcore.io.DiskLruCache".equals(strMo4185) || !"1".equals(strMo4186) || !Integer.toString(this.f65880).equals(strMo4187) || !Integer.toString(this.f65878).equals(strMo4188) || !"".equals(strMo4189)) {
                throw new IOException("unexpected journal header: [" + strMo4185 + ", " + strMo4186 + ", " + strMo4188 + ", " + strMo4189 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m47153(interfaceC25000M35108.mo4185());
                    i++;
                } catch (EOFException unused) {
                    this.f65884 = i - this.f65879.size();
                    if (!interfaceC25000M35108.mo4182()) {
                        m47159();
                    } else {
                        this.f65872 = C14556.m35106(new C16838(this, interfaceC6070.mo17578(file)));
                    }
                    C19822.m45601(interfaceC25000M35108);
                    return;
                }
            }
        } catch (Throwable th) {
            C19822.m45601(interfaceC25000M35108);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m47153(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f65879;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C23552 c23552 = (C23552) linkedHashMap.get(strSubstring);
        if (c23552 == null) {
            c23552 = new C23552(this, strSubstring);
            linkedHashMap.put(strSubstring, c23552);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            c23552.f76081 = true;
            c23552.f76083 = null;
            if (strArrSplit.length != c23552.f76078.f65878) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                try {
                    c23552.f76082[i2] = Long.parseLong(strArrSplit[i2]);
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                }
            }
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c23552.f76083 = new C16092(this, c23552);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m47149() {
        File file = this.f65874;
        InterfaceC6070 interfaceC6070 = this.f65883;
        interfaceC6070.mo17579(file);
        Iterator it = this.f65879.values().iterator();
        while (it.hasNext()) {
            C23552 c23552 = (C23552) it.next();
            C16092 c16092 = c23552.f76083;
            int i = this.f65878;
            int i2 = 0;
            if (c16092 == null) {
                while (i2 < i) {
                    this.f65881 += c23552.f76082[i2];
                    i2++;
                }
            } else {
                c23552.f76083 = null;
                while (i2 < i) {
                    interfaceC6070.mo17579(c23552.f76077[i2]);
                    interfaceC6070.mo17579(c23552.f76079[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16092 m47155(String str) {
        return m47154(-1L, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C16092 m47154(long j, String str) {
        m47156();
        m47150();
        m47151(str);
        C23552 c23552 = (C23552) this.f65879.get(str);
        if (j != -1 && (c23552 == null || c23552.f76080 != j)) {
            return null;
        }
        if (c23552 != null && c23552.f76083 != null) {
            return null;
        }
        if (!this.f65877 && !this.f65886) {
            InterfaceC11573 interfaceC11573 = this.f65872;
            interfaceC11573.mo6442("DIRTY");
            interfaceC11573.writeByte(32);
            interfaceC11573.mo6442(str);
            interfaceC11573.writeByte(10);
            this.f65872.flush();
            if (this.f65876) {
                return null;
            }
            if (c23552 == null) {
                c23552 = new C23552(this, str);
                this.f65879.put(str, c23552);
            }
            C16092 c16092 = new C16092(this, c23552);
            c23552.f76083 = c16092;
            return c16092;
        }
        this.f65873.execute(this.f65885);
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m47162() {
        int i = this.f65884;
        return i >= 2000 && i >= this.f65879.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47158(C23552 c23552) {
        C16092 c16092 = c23552.f76083;
        String str = c23552.f76084;
        if (c16092 != null) {
            c16092.m38248();
        }
        for (int i = 0; i < this.f65878; i++) {
            this.f65883.mo17579(c23552.f76077[i]);
            long j = this.f65881;
            long[] jArr = c23552.f76082;
            this.f65881 = j - jArr[i];
            jArr[i] = 0;
        }
        this.f65884++;
        InterfaceC11573 interfaceC11573 = this.f65872;
        interfaceC11573.mo6442("REMOVE");
        interfaceC11573.writeByte(32);
        interfaceC11573.mo6442(str);
        interfaceC11573.writeByte(10);
        this.f65879.remove(str);
        if (m47162()) {
            this.f65873.execute(this.f65885);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m47160() {
        while (this.f65881 > this.f65871) {
            m47158((C23552) this.f65879.values().iterator().next());
        }
        this.f65877 = false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m47151(String str) {
        if (!f65867.matcher(str).matches()) {
            throw new IllegalArgumentException(C14442.m34865("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }
}
