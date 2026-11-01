package l;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ܶܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74O */
/* JADX INFO: loaded from: classes4.dex */
public final class C15327 implements InterfaceC16178 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final HashSet f49914 = new HashSet();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Random f49915;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23939 f49916;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f49917;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f49918;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7711 f49919;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f49920;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4036 f49921;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f49922;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5448 f49923;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f49924;

    @Override // l.InterfaceC16178
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized long mo36696(String str, long j, long j2) {
        C4742 c4742M15103;
        C2023.m6510(!this.f49922);
        if (j2 == -1) {
            j2 = C17492.FOREVER_NS;
        }
        c4742M15103 = this.f49923.m15103(str);
        return c4742M15103 != null ? c4742M15103.m13108(j, j2) : -j2;
    }

    @Override // l.InterfaceC16178
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized File mo36697(String str, long j, long j2) {
        C4742 c4742M15103;
        File file;
        C2023.m6510(!this.f49922);
        m36699();
        c4742M15103 = this.f49923.m15103(str);
        c4742M15103.getClass();
        C2023.m6510(c4742M15103.m13116(j, j2));
        if (!this.f49918.exists()) {
            m36688(this.f49918);
            m36691();
        }
        this.f49921.m11542(this, j2);
        file = new File(this.f49918, Integer.toString(this.f49915.nextInt(10)));
        if (!file.exists()) {
            m36688(file);
        }
        return C21676.m48409(file, c4742M15103.f16689, j, System.currentTimeMillis());
    }

    @Override // l.InterfaceC16178
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C13210 mo36698(String str) {
        C4742 c4742M15103;
        C2023.m6510(!this.f49922);
        c4742M15103 = this.f49923.m15103(str);
        return c4742M15103 != null ? c4742M15103.m13109() : C13210.f43962;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36699() {
        C7711 c7711 = this.f49919;
        if (c7711 != null) {
            throw c7711;
        }
    }

    @Override // l.InterfaceC16178
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo36700(File file, long j) {
        boolean z = true;
        C2023.m6510(!this.f49922);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C21676 c21676M48410 = C21676.m48410(file, j, -9223372036854775807L, this.f49923);
            c21676M48410.getClass();
            C4742 c4742M15103 = this.f49923.m15103(c21676M48410.f7656);
            c4742M15103.getClass();
            C2023.m6510(c4742M15103.m13116(c21676M48410.f7660, c21676M48410.f7657));
            long jM40151 = C17214.m40151(c4742M15103.m13109());
            if (jM40151 != -1) {
                if (c21676M48410.f7660 + c21676M48410.f7657 > jM40151) {
                    z = false;
                }
                C2023.m6510(z);
            }
            if (this.f49916 == null) {
                m36690(c21676M48410);
                this.f49923.m15106();
                notifyAll();
                return;
            }
            try {
                this.f49916.m52773(file.getName(), c21676M48410.f7657, c21676M48410.f7659);
                m36690(c21676M48410);
                try {
                    this.f49923.m15106();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new C7711(e);
                }
            } catch (IOException e2) {
                throw new C7711(e2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC16178
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo36701(String str, C1214 c1214) {
        C2023.m6510(!this.f49922);
        m36699();
        this.f49923.m15105(str, c1214);
        try {
            this.f49923.m15106();
        } catch (IOException e) {
            throw new C7711(e);
        }
    }

    @Override // l.InterfaceC16178
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo36702(C2065 c2065) {
        C2023.m6510(!this.f49922);
        C4742 c4742M15103 = this.f49923.m15103(c2065.f7656);
        c4742M15103.getClass();
        c4742M15103.m13111(c2065.f7660);
        this.f49923.m15107(c4742M15103.f16688);
        notifyAll();
    }

    @Override // l.InterfaceC16178
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized C2065 mo36703(String str, long j, long j2) {
        C2065 c2065Mo36704;
        C2023.m6510(!this.f49922);
        m36699();
        while (true) {
            c2065Mo36704 = mo36704(str, j, j2);
            if (c2065Mo36704 == null) {
                wait();
            }
        }
        return c2065Mo36704;
    }

    @Override // l.InterfaceC16178
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized C2065 mo36704(String str, long j, long j2) {
        C21676 c21676M13118;
        C2023.m6510(!this.f49922);
        m36699();
        C4742 c4742M15103 = this.f49923.m15103(str);
        if (c4742M15103 != null) {
            while (true) {
                c21676M13118 = c4742M15103.m13118(j, j2);
                if (!c21676M13118.f7661) {
                    break;
                }
                File file = c21676M13118.f7658;
                file.getClass();
                if (file.length() == c21676M13118.f7657) {
                    break;
                }
                m36691();
            }
        } else {
            c21676M13118 = new C21676(str, j, j2, -9223372036854775807L, null);
        }
        if (c21676M13118.f7661) {
            return m36687(str, c21676M13118);
        }
        if (this.f49923.m15108(str).m13107(j, c21676M13118.f7657)) {
            return c21676M13118;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36705(String str) {
        C2023.m6510(!this.f49922);
        Iterator it = m36707(str).iterator();
        while (it.hasNext()) {
            m36693((C2065) it.next());
        }
    }

    @Override // l.InterfaceC16178
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized long mo36706(String str, long j, long j2) {
        long j3;
        long j4 = C17492.FOREVER_NS;
        long j5 = j2 == -1 ? Long.MAX_VALUE : j2 + j;
        if (j5 >= 0) {
            j4 = j5;
        }
        long j6 = j;
        j3 = 0;
        while (j6 < j4) {
            long jMo36696 = mo36696(str, j6, j4 - j6);
            if (jMo36696 > 0) {
                j3 += jMo36696;
            } else {
                jMo36696 = -jMo36696;
            }
            j6 += jMo36696;
        }
        return j3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized TreeSet m36707(String str) {
        C4742 c4742M15103;
        C2023.m6510(!this.f49922);
        c4742M15103 = this.f49923.m15103(str);
        return (c4742M15103 == null || c4742M15103.m13115()) ? new TreeSet() : new TreeSet((Collection) c4742M15103.m13117());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36708() {
        if (this.f49922) {
            return;
        }
        this.f49924.clear();
        m36691();
        try {
            try {
                this.f49923.m15106();
            } catch (IOException e) {
                C0303.m1854("Storing index file failed", e);
            }
            m36692(this.f49918);
            this.f49922 = true;
        } catch (Throwable th) {
            m36692(this.f49918);
            this.f49922 = true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36709(C2065 c2065) {
        C2023.m6510(!this.f49922);
        m36693(c2065);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m36710(String str, long j, long j2) {
        C4742 c4742M15103;
        C2023.m6510(!this.f49922);
        c4742M15103 = this.f49923.m15103(str);
        return c4742M15103 != null && c4742M15103.m13108(j, j2) >= j2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static synchronized void m36692(File file) {
        f49914.remove(file.getAbsoluteFile());
    }

    public C15327(File file, C4036 c4036, C3788 c3788) {
        boolean zAdd;
        C5448 c5448 = new C5448(c3788, file);
        C23939 c23939 = new C23939(c3788);
        synchronized (C15327.class) {
            zAdd = f49914.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f49918 = file;
        this.f49921 = c4036;
        this.f49923 = c5448;
        this.f49916 = c23939;
        this.f49924 = new HashMap();
        this.f49915 = new Random();
        this.f49917 = true;
        this.f49920 = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new C23088(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36695(C15327 c15327) {
        long j;
        C23939 c23939 = c15327.f49916;
        C5448 c5448 = c15327.f49923;
        File file = c15327.f49918;
        if (!file.exists()) {
            try {
                m36688(file);
            } catch (C7711 e) {
                c15327.f49919 = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            C0303.m1853(str);
            c15327.f49919 = new C7711(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    C0303.m1853("Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        c15327.f49920 = j;
        if (j == -1) {
            try {
                c15327.f49920 = m36694(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                C0303.m1854(str2, e2);
                c15327.f49919 = new C7711(str2, e2);
                return;
            }
        }
        try {
            c5448.m15104(c15327.f49920);
            if (c23939 != null) {
                c23939.m52771(c15327.f49920);
                HashMap mapM52770 = c23939.m52770();
                c15327.m36689(file, true, fileArrListFiles, mapM52770);
                c23939.m52774(mapM52770.keySet());
            } else {
                c15327.m36689(file, true, fileArrListFiles, null);
            }
            c5448.m15109();
            try {
                c5448.m15106();
            } catch (IOException e3) {
                C0303.m1854("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            C0303.m1854(str3, e4);
            c15327.f49919 = new C7711(str3, e4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36689(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (!z || name.indexOf(46) != -1) {
                if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    C11239 c11239 = map != null ? (C11239) map.remove(name) : null;
                    if (c11239 != null) {
                        j2 = c11239.f38028;
                        j = c11239.f38027;
                    } else {
                        j = -9223372036854775807L;
                        j2 = -1;
                    }
                    C21676 c21676M48410 = C21676.m48410(file2, j2, j, this.f49923);
                    if (c21676M48410 != null) {
                        m36690(c21676M48410);
                    } else {
                        file2.delete();
                    }
                }
            } else {
                m36689(file2, false, file2.listFiles(), map);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21676 m36687(String str, C21676 c21676) {
        boolean z;
        if (!this.f49917) {
            return c21676;
        }
        File file = c21676.f7658;
        file.getClass();
        String name = file.getName();
        long j = c21676.f7657;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C23939 c23939 = this.f49916;
        if (c23939 != null) {
            try {
                c23939.m52773(name, j, jCurrentTimeMillis);
            } catch (IOException unused) {
                C0303.m1848("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        C4742 c4742M15103 = this.f49923.m15103(str);
        c4742M15103.getClass();
        C21676 c21676M13110 = c4742M15103.m13110(c21676, jCurrentTimeMillis, z);
        ArrayList arrayList = (ArrayList) this.f49924.get(c21676.f7656);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC21116) arrayList.get(size)).mo11544(this, c21676, c21676M13110);
            }
        }
        this.f49921.mo11544(this, c21676, c21676M13110);
        return c21676M13110;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36690(C21676 c21676) {
        String str = c21676.f7656;
        this.f49923.m15108(str).m13112(c21676);
        ArrayList arrayList = (ArrayList) this.f49924.get(str);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC21116) arrayList.get(size)).mo11543(this, c21676);
                }
            }
        }
        this.f49921.mo11543(this, c21676);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m36693(C2065 c2065) {
        String str = c2065.f7656;
        C5448 c5448 = this.f49923;
        C4742 c4742M15103 = c5448.m15103(str);
        if (c4742M15103 == null || !c4742M15103.m13114(c2065)) {
            return;
        }
        C23939 c23939 = this.f49916;
        if (c23939 != null) {
            File file = c2065.f7658;
            file.getClass();
            String name = file.getName();
            try {
                c23939.m52772(name);
            } catch (IOException unused) {
                C16523.m38891("Failed to remove file index entry for: ", name);
            }
        }
        c5448.m15107(c4742M15103.f16688);
        ArrayList arrayList = (ArrayList) this.f49924.get(c2065.f7656);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC21116) arrayList.get(size)).mo11541(c2065);
                }
            }
        }
        this.f49921.mo11541(c2065);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m36691() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f49923.m15102().iterator();
        while (it.hasNext()) {
            for (C2065 c2065 : ((C4742) it.next()).m13117()) {
                File file = c2065.f7658;
                file.getClass();
                if (file.length() != c2065.f7657) {
                    arrayList.add(c2065);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m36693((C2065) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m36694(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, C15489.m37076(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36688(File file) throws C7711 {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        C0303.m1853(str);
        throw new C7711(str);
    }
}
