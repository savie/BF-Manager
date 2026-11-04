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

/* JADX INFO: renamed from: l.۠ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74O */
/* JADX INFO: loaded from: classes4.dex */
public final class C8367 implements InterfaceC15079 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final HashSet f27440 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f27441;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f27442;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f27443;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0910 f27444;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f27445;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Random f27446;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f27447;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C22539 f27448;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21047 f27449;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15825 f27450;

    @Override // l.InterfaceC15079
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized File mo22516(String str, long j, long j2) {
        C6131 c6131M48100;
        File file;
        C20782.m47568(!this.f27443);
        m22518();
        c6131M48100 = this.f27449.m48100(str);
        c6131M48100.getClass();
        C20782.m47568(c6131M48100.m17732(j, j2));
        if (!this.f27442.exists()) {
            m22508(this.f27442);
            m22511();
        }
        this.f27444.m3678(this, j2);
        file = new File(this.f27442, Integer.toString(this.f27446.nextInt(10)));
        if (!file.exists()) {
            m22508(file);
        }
        return C6876.m19139(file, c6131M48100.f20941, j, System.currentTimeMillis());
    }

    @Override // l.InterfaceC15079
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C18809 mo22517(String str) {
        C6131 c6131M48100;
        C20782.m47568(!this.f27443);
        c6131M48100 = this.f27449.m48100(str);
        return c6131M48100 != null ? c6131M48100.m17726() : C18809.f61123;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22518() {
        C22539 c22539 = this.f27448;
        if (c22539 != null) {
            throw c22539;
        }
    }

    @Override // l.InterfaceC15079
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo22519(File file, long j) {
        boolean z = true;
        C20782.m47568(!this.f27443);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C6876 c6876M19140 = C6876.m19140(file, j, -9223372036854775807L, this.f27449);
            c6876M19140.getClass();
            C6131 c6131M48100 = this.f27449.m48100(c6876M19140.f10208);
            c6131M48100.getClass();
            C20782.m47568(c6131M48100.m17732(c6876M19140.f10209, c6876M19140.f10206));
            long jM42087 = C18063.m42087(c6131M48100.m17726());
            if (jM42087 != -1) {
                if (c6876M19140.f10209 + c6876M19140.f10206 > jM42087) {
                    z = false;
                }
                C20782.m47568(z);
            }
            if (this.f27450 == null) {
                m22510(c6876M19140);
                this.f27449.m48103();
                notifyAll();
                return;
            }
            try {
                this.f27450.m37757(file.getName(), c6876M19140.f10206, c6876M19140.f10205);
                m22510(c6876M19140);
                try {
                    this.f27449.m48103();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new C22539(e);
                }
            } catch (IOException e2) {
                throw new C22539(e2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC15079
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo22520(String str, C7622 c7622) {
        C20782.m47568(!this.f27443);
        m22518();
        this.f27449.m48102(str, c7622);
        try {
            this.f27449.m48103();
        } catch (IOException e) {
            throw new C22539(e);
        }
    }

    @Override // l.InterfaceC15079
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo22521(C3147 c3147) {
        C20782.m47568(!this.f27443);
        C6131 c6131M48100 = this.f27449.m48100(c3147.f10208);
        c6131M48100.getClass();
        c6131M48100.m17727(c3147.f10209);
        this.f27449.m48104(c6131M48100.f20939);
        notifyAll();
    }

    @Override // l.InterfaceC15079
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized C3147 mo22522(String str, long j, long j2) {
        C6876 c6876M17734;
        C20782.m47568(!this.f27443);
        m22518();
        C6131 c6131M48100 = this.f27449.m48100(str);
        if (c6131M48100 != null) {
            while (true) {
                c6876M17734 = c6131M48100.m17734(j, j2);
                if (!c6876M17734.f10210) {
                    break;
                }
                File file = c6876M17734.f10207;
                file.getClass();
                if (file.length() == c6876M17734.f10206) {
                    break;
                }
                m22511();
            }
        } else {
            c6876M17734 = new C6876(str, j, j2, -9223372036854775807L, null);
        }
        if (c6876M17734.f10210) {
            return m22506(str, c6876M17734);
        }
        if (this.f27449.m48105(str).m17736(j, c6876M17734.f10206)) {
            return c6876M17734;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22523(String str) {
        C20782.m47568(!this.f27443);
        Iterator it = m22527(str).iterator();
        while (it.hasNext()) {
            m22513((C3147) it.next());
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m22524(String str, long j, long j2) {
        C6131 c6131M48100;
        C20782.m47568(!this.f27443);
        c6131M48100 = this.f27449.m48100(str);
        return c6131M48100 != null && c6131M48100.m17724(j, j2) >= j2;
    }

    @Override // l.InterfaceC15079
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized C3147 mo22525(String str, long j, long j2) {
        C3147 c3147Mo22522;
        C20782.m47568(!this.f27443);
        m22518();
        while (true) {
            c3147Mo22522 = mo22522(str, j, j2);
            if (c3147Mo22522 == null) {
                wait();
            }
        }
        return c3147Mo22522;
    }

    @Override // l.InterfaceC15079
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized long mo22526(String str, long j, long j2) {
        long j3;
        long j4 = C25227.FOREVER_NS;
        long j5 = j2 == -1 ? Long.MAX_VALUE : j2 + j;
        if (j5 >= 0) {
            j4 = j5;
        }
        long j6 = j;
        j3 = 0;
        while (j6 < j4) {
            long jMo22530 = mo22530(str, j6, j4 - j6);
            if (jMo22530 > 0) {
                j3 += jMo22530;
            } else {
                jMo22530 = -jMo22530;
            }
            j6 += jMo22530;
        }
        return j3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized TreeSet m22527(String str) {
        C6131 c6131M48100;
        C20782.m47568(!this.f27443);
        c6131M48100 = this.f27449.m48100(str);
        return (c6131M48100 == null || c6131M48100.m17731()) ? new TreeSet() : new TreeSet((Collection) c6131M48100.m17733());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m22528() {
        if (this.f27443) {
            return;
        }
        this.f27447.clear();
        m22511();
        try {
            try {
                this.f27449.m48103();
            } catch (IOException e) {
                C1896.m6516("Storing index file failed", e);
            }
            m22512(this.f27442);
            this.f27443 = true;
        } catch (Throwable th) {
            m22512(this.f27442);
            this.f27443 = true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m22529(C3147 c3147) {
        C20782.m47568(!this.f27443);
        m22513(c3147);
    }

    @Override // l.InterfaceC15079
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized long mo22530(String str, long j, long j2) {
        C6131 c6131M48100;
        C20782.m47568(!this.f27443);
        if (j2 == -1) {
            j2 = C25227.FOREVER_NS;
        }
        c6131M48100 = this.f27449.m48100(str);
        return c6131M48100 != null ? c6131M48100.m17724(j, j2) : -j2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static synchronized void m22512(File file) {
        f27440.remove(file.getAbsoluteFile());
    }

    public C8367(File file, C0910 c0910, C9924 c9924) {
        boolean zAdd;
        C21047 c21047 = new C21047(c9924, file);
        C15825 c15825 = new C15825(c9924);
        synchronized (C8367.class) {
            zAdd = f27440.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f27442 = file;
        this.f27444 = c0910;
        this.f27449 = c21047;
        this.f27450 = c15825;
        this.f27447 = new HashMap();
        this.f27446 = new Random();
        this.f27441 = true;
        this.f27445 = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new C2401(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22515(C8367 c8367) {
        long j;
        C15825 c15825 = c8367.f27450;
        C21047 c21047 = c8367.f27449;
        File file = c8367.f27442;
        if (!file.exists()) {
            try {
                m22508(file);
            } catch (C22539 e) {
                c8367.f27448 = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            C1896.m6515(str);
            c8367.f27448 = new C22539(str);
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
                    C1896.m6515("Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        c8367.f27445 = j;
        if (j == -1) {
            try {
                c8367.f27445 = m22514(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                C1896.m6516(str2, e2);
                c8367.f27448 = new C22539(str2, e2);
                return;
            }
        }
        try {
            c21047.m48101(c8367.f27445);
            if (c15825 != null) {
                c15825.m37755(c8367.f27445);
                HashMap mapM37754 = c15825.m37754();
                c8367.m22509(file, true, fileArrListFiles, mapM37754);
                c15825.m37758(mapM37754.keySet());
            } else {
                c8367.m22509(file, true, fileArrListFiles, null);
            }
            c21047.m48106();
            try {
                c21047.m48103();
            } catch (IOException e3) {
                C1896.m6516("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            C1896.m6516(str3, e4);
            c8367.f27448 = new C22539(str3, e4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22509(File file, boolean z, File[] fileArr, Map map) {
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
                    C17317 c17317 = map != null ? (C17317) map.remove(name) : null;
                    if (c17317 != null) {
                        j2 = c17317.f56405;
                        j = c17317.f56404;
                    } else {
                        j = -9223372036854775807L;
                        j2 = -1;
                    }
                    C6876 c6876M19140 = C6876.m19140(file2, j2, j, this.f27449);
                    if (c6876M19140 != null) {
                        m22510(c6876M19140);
                    } else {
                        file2.delete();
                    }
                }
            } else {
                m22509(file2, false, file2.listFiles(), map);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6876 m22506(String str, C6876 c6876) {
        boolean z;
        if (!this.f27441) {
            return c6876;
        }
        File file = c6876.f10207;
        file.getClass();
        String name = file.getName();
        long j = c6876.f10206;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C15825 c15825 = this.f27450;
        if (c15825 != null) {
            try {
                c15825.m37757(name, j, jCurrentTimeMillis);
            } catch (IOException unused) {
                C1896.m6517("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        C6131 c6131M48100 = this.f27449.m48100(str);
        c6131M48100.getClass();
        C6876 c6876M17725 = c6131M48100.m17725(c6876, jCurrentTimeMillis, z);
        ArrayList arrayList = (ArrayList) this.f27447.get(c6876.f10208);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC19555) arrayList.get(size)).mo3680(this, c6876, c6876M17725);
            }
        }
        this.f27444.mo3680(this, c6876, c6876M17725);
        return c6876M17725;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22510(C6876 c6876) {
        String str = c6876.f10208;
        this.f27449.m48105(str).m17728(c6876);
        ArrayList arrayList = (ArrayList) this.f27447.get(str);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC19555) arrayList.get(size)).mo3679(this, c6876);
                }
            }
        }
        this.f27444.mo3679(this, c6876);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m22513(C3147 c3147) {
        String str = c3147.f10208;
        C21047 c21047 = this.f27449;
        C6131 c6131M48100 = c21047.m48100(str);
        if (c6131M48100 == null || !c6131M48100.m17729(c3147)) {
            return;
        }
        C15825 c15825 = this.f27450;
        if (c15825 != null) {
            File file = c3147.f10207;
            file.getClass();
            String name = file.getName();
            try {
                c15825.m37756(name);
            } catch (IOException unused) {
                C22313.m50377("Failed to remove file index entry for: ", name);
            }
        }
        c21047.m48104(c6131M48100.f20939);
        ArrayList arrayList = (ArrayList) this.f27447.get(c3147.f10208);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC19555) arrayList.get(size)).mo3677(c3147);
                }
            }
        }
        this.f27444.mo3677(c3147);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m22511() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f27449.m48099().iterator();
        while (it.hasNext()) {
            for (C3147 c3147 : ((C6131) it.next()).m17733()) {
                File file = c3147.f10207;
                file.getClass();
                if (file.length() != c3147.f10206) {
                    arrayList.add(c3147);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m22513((C3147) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m22514(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, C14483.m34972(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22508(File file) throws C22539 {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        C1896.m6515(str);
        throw new C22539(str);
    }
}
