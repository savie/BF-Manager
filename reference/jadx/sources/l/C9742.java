package l;

import android.os.Bundle;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۢᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36NN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9742 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List f32769;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f32770;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f32771;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f32772;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f32774;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Bundle f32775;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f32776;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f32777;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f32779;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f32780;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Object f32778 = new Object();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f32773 = FutureC12075.m30001(null);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized String m24711() {
        return this.f32776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C1979 m24712(int i, CharSequence charSequence, C13312 c13312) {
        int i2 = this.f32774;
        this.f32774 = i2 + 1;
        if (i2 == 0) {
            this.f32773 = new FutureC12075();
        }
        return new C1979(this, i, charSequence, c13312);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m24717() {
        return this.f32774 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m24718(int i) {
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.f32772;
            if (i2 >= zArr.length) {
                return false;
            }
            if (i2 != i && zArr[i2]) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized C2063 m24719() {
        return new C2063(0, this.f32777, false, 0, null, null, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized Bundle m24721() {
        return new Bundle(this.f32775);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC12075 m24723() {
        return this.f32773.m30032((InterfaceC15954) new C9023());
    }

    public C9742(InterfaceC3800 interfaceC3800, String str, List list, boolean[] zArr, Bundle bundle, int i, int i2, String str2) {
        this.f32780 = interfaceC3800;
        this.f32779 = str;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C13638.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f32769 = C0561.unmodifiableList(arrayList);
        this.f32772 = zArr;
        this.f32775 = new Bundle(bundle);
        this.f32770 = i;
        this.f32777 = i2;
        this.f32776 = str2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m24720() {
        return this.f32769.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 m24722(int i) {
        if (i < 0 || i >= this.f32769.size()) {
            throw new IndexOutOfBoundsException("Invalid text page index");
        }
        return this.f32780.resolve(this.f32779).resolve(Integer.toString(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14393 m24715(C13312 c13312, int i, InterfaceC5614 interfaceC5614) {
        int i2;
        synchronized (this) {
            i2 = this.f32770;
        }
        return m24714(i2, c13312, i, interfaceC5614, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9742 m24709(InterfaceC3800 interfaceC3800) throws IOException {
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800.resolve("app-pages");
        EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
        if (!C5212.isRegularFile(interfaceC3800Resolve, enumC22146)) {
            throw new IOException("Invalid text page directory");
        }
        long size = C5212.size(interfaceC3800Resolve);
        if (size < 40 || size > 2097152) {
            throw new IOException("Invalid text page directory length");
        }
        int i = (int) size;
        byte[] bArr = new byte[i];
        InputStream inputStreamNewInputStream = C5212.newInputStream(interfaceC3800Resolve, enumC22146);
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = inputStreamNewInputStream.read(bArr, i2, i - i2);
                if (i3 <= 0) {
                    throw new IOException("Truncated text page directory");
                }
                i2 += i3;
            } catch (Throwable th) {
                if (inputStreamNewInputStream == null) {
                    throw th;
                }
                try {
                    inputStreamNewInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (inputStreamNewInputStream.read() != -1) {
            throw new IOException("Trailing text page directory data");
        }
        inputStreamNewInputStream.close();
        try {
            C17367 c17367 = new C17367(bArr);
            CRC32 crc32 = new CRC32();
            int i4 = i - 4;
            crc32.update(bArr, 0, i4);
            c17367.seek(i4);
            if (c17367.readInt() != ((int) crc32.getValue())) {
                throw new IOException("Invalid text page directory checksum");
            }
            c17367.seek(0L);
            if (c17367.readInt() != 827344709 || c17367.readInt() != 1) {
                throw new IOException("Unsupported text page directory");
            }
            String str = "pages-" + new UUID(c17367.readLong(), c17367.readLong());
            int i5 = c17367.readInt();
            int i6 = c17367.readInt();
            int i7 = c17367.readInt();
            int i8 = c17367.readInt();
            if (i5 < 1 || i5 > (i - 40) / 17 || i6 < 0 || i6 >= i5 || i8 < 0 || i8 > 2) {
                throw new IOException("Invalid text page directory fields");
            }
            C22037.m48953(i7);
            ArrayList arrayList = new ArrayList(i5);
            boolean[] zArr = new boolean[i5];
            for (int i9 = 0; i9 < i5; i9++) {
                arrayList = arrayList;
                arrayList.add(new UUID(c17367.readLong(), c17367.readLong()));
                zArr[i9] = c17367.m40461();
            }
            int i10 = c17367.readInt();
            if (i10 >= 0) {
                long j = i10;
                if (j == c17367.available() - 4) {
                    byte[] bArr2 = new byte[i10];
                    c17367.m40446(i10, bArr2);
                    return new C9742(interfaceC3800, str, arrayList, zArr, C8331.m21754(2097152, j, new ByteArrayInputStream(bArr2)).m21760(), i6, i7, i8 == 1 ? "\r" : i8 == 2 ? "\r\n" : "\n");
                }
            }
            throw new IOException("Invalid text page configuration length");
        } catch (RuntimeException e) {
            throw new IOException("Invalid text page directory", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m24698() {
        Bundle bundle;
        boolean[] zArr;
        int i;
        int i2;
        String str;
        synchronized (this.f32778) {
            synchronized (this) {
                bundle = new Bundle(this.f32775);
                zArr = (boolean[]) this.f32772.clone();
                i = this.f32770;
                i2 = this.f32777;
                str = this.f32776;
            }
            C11018 c11018 = new C11018();
            UUID uuidFromString = UUID.fromString(this.f32779.substring(6));
            c11018.writeInt(827344709);
            c11018.writeInt(1);
            c11018.m27791(uuidFromString.getMostSignificantBits());
            c11018.m27791(uuidFromString.getLeastSignificantBits());
            c11018.writeInt(this.f32769.size());
            c11018.writeInt(i);
            c11018.writeInt(i2);
            c11018.writeInt("\r".equals(str) ? 1 : "\r\n".equals(str) ? 2 : 0);
            for (int i3 = 0; i3 < this.f32769.size(); i3++) {
                UUID uuid = (UUID) this.f32769.get(i3);
                c11018.m27791(uuid.getMostSignificantBits());
                c11018.m27791(uuid.getLeastSignificantBits());
                c11018.m27784(zArr[i3]);
            }
            c11018.m27794(C8331.m21755(2097152, bundle).m21759(2097152));
            if (c11018.size() > 2097148) {
                throw new IOException("Text page directory exceeds limit");
            }
            CRC32 crc32 = new CRC32();
            crc32.update(c11018.m27788(), 0, c11018.size());
            c11018.writeInt((int) crc32.getValue());
            InterfaceC3800 interfaceC3800Resolve = this.f32780.resolve("app-pages.tmp");
            if (C5212.exists(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS)) {
                C11153.m28084(interfaceC3800Resolve);
                C5212.delete(interfaceC3800Resolve);
            }
            C12564.m31275(interfaceC3800Resolve, c11018.m27773());
            C5212.move(interfaceC3800Resolve, this.f32780.resolve("app-pages"), EnumC21440.ATOMIC_MOVE, EnumC21440.REPLACE_EXISTING);
            this.f32771 = true;
            InterfaceC1959.f7372.mo6327(this.f32780);
            C6961.m18713(this.f32780, bundle);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24716(int i, Bundle bundle, boolean z, int i2, String str) {
        synchronized (this.f32778) {
            synchronized (this) {
                this.f32777 = i2;
                this.f32776 = str;
                this.f32772[i] = z;
                this.f32775 = new Bundle(bundle);
                boolean z2 = false;
                for (boolean z3 : this.f32772) {
                    z2 |= z3;
                }
                this.f32775.putBoolean("changed", z2);
            }
            m24698();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14393 m24714(int i, C13312 c13312, int i2, InterfaceC5614 interfaceC5614, boolean z) throws Throwable {
        C14393 c14393M34630 = C14393.m34630(m24722(i), c13312.f44188, c13312.f44189, c13312.f44190, i2, interfaceC5614, (String) null);
        try {
            if (!((UUID) this.f32769.get(i)).equals(c14393M34630.f47162.mo8735().m4527())) {
                throw new IOException("Text page identity changed");
            }
            c14393M34630.m34650(this, i, i2);
            if (!z) {
                return c14393M34630;
            }
            synchronized (this.f32778) {
                synchronized (this) {
                    if (this.f32774 != 0) {
                        throw new IOException("Text document is being read");
                    }
                    this.f32770 = i;
                }
                m24698();
            }
            return c14393M34630;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c14393M34630.m34643().m30027();
            } catch (Throwable th) {
                e.addSuppressed(th);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3329 m24713(int i, C13312 c13312) {
        C5488 c5488M4516 = C1254.m4516(m24722(i), c13312.f44188, c13312.f44189);
        try {
            if (!((UUID) this.f32769.get(i)).equals(c5488M4516.m15176())) {
                throw new IOException("Text page identity changed");
            }
            C3329 c3329M9880 = C3329.m9880(c5488M4516.m15172());
            c5488M4516.close();
            return c3329M9880;
        } catch (Throwable th) {
            try {
                c5488M4516.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x04f2 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0507 */
    /* JADX WARN: Code duplicated, block: B:131:0x0357  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:258:0x032d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [l.ܳ۠ۖ] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4, types: [l.ܿ᩷ۖ] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C14393 m24700(l.C14393 r40, l.InterfaceC3800 r41, l.AbstractC12648 r42, int r43, l.C13312 r44, l.InterfaceC5614 r45, long r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9742.m24700(l.ܳ۠ۖ, l.ۘ۟ᩴ, l.۫᩷ۖ, int, l.۬᩵ۖ, l.ۚ᩸ۘ, long):l.ܳ۠ۖ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14393 m24701(C14393 c14393, C16881 c16881, boolean z, C13914 c13914, C13312 c13312, InterfaceC5614 interfaceC5614, long j) throws Throwable {
        InterfaceC3800 interfaceC3800;
        C9742 c9742;
        C14393 c14394;
        InterfaceC3800 interfaceC3801 = c14393.f47155.f32780;
        String str = "pages-" + UUID.randomUUID();
        InterfaceC3800 interfaceC3800Resolve = interfaceC3801.resolve(str);
        C5212.createDirectory(interfaceC3800Resolve, new InterfaceC20030[0]);
        C14393 c14395 = null;
        try {
            C14393 c14393M34631 = C14393.m34631(interfaceC3800Resolve.resolve("0"), c13312);
            C16408 c16408 = c14393M34631.f47162;
            int i = 0;
            while (true) {
                try {
                    CharSequence charSequence = c13914.f45831;
                    if (i >= charSequence.length()) {
                        break;
                    }
                    m24703(interfaceC5614);
                    int iMin = (int) Math.min(((long) i) + X931RNG.BLOCK64_RESEED_MAX, charSequence.length());
                    c14393M34631.m34648(i, iMin, charSequence);
                    i = iMin;
                } catch (Throwable th) {
                    th = th;
                    c14394 = c14393M34631;
                }
                interfaceC3800 = interfaceC3800Resolve;
                c9742 = null;
                c14395 = c14394;
                if (c14395 != null) {
                    c14395.m34643().m30027();
                }
                if (c9742 == null || !c9742.f32771) {
                    m24702(interfaceC3800);
                }
                throw th;
            }
            Bundle bundleM21760 = c14393.f47156.f37855.f77154.m21760();
            bundleM21760.putBoolean("e2SourcePending", false);
            bundleM21760.putBoolean("changed", false);
            bundleM21760.putBoolean(d.O, false);
            if (!z) {
                bundleM21760.putLong("fileTime", c16881.f53983.mo33991());
                bundleM21760.putBoolean("checkFileExists", true);
            }
            int iMin2 = (int) Math.min(Math.max(0L, j), c16408.length());
            c14394 = c14393M34631;
            try {
                c14393M34631.m34653(c14393.f47156.f37855, bundleM21760, c13914.f45833, c13914.f45832, c13312, interfaceC5614, iMin2);
                UUID uuidM4527 = c16408.mo8735().m4527();
                c14394.m34644(c16408.mo8735().m4523()).m30027();
                m24703(interfaceC5614);
                Object[] objArr = {uuidM4527};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                C13638.requireNonNull(obj);
                arrayList.add(obj);
                interfaceC3800 = interfaceC3800Resolve;
                try {
                    c9742 = new C9742(interfaceC3801, str, C0561.unmodifiableList(arrayList), new boolean[1], bundleM21760, 0, c13914.f45833.f7652, c13914.f45832);
                    try {
                        c9742.m24698();
                        c14393.m34643().m30027();
                        C9742 c9743 = c14393.f47155;
                        c9743.getClass();
                        try {
                            m24702(c9743.f32780.resolve(c9743.f32779));
                        } catch (IOException unused) {
                        }
                        C14393 c14393M24715 = c9742.m24715(c13312, 8388608, interfaceC5614);
                        c14393M24715.f47163 = (j < 0 || c14393.f47155.f32769.size() == 1) ? -1 : iMin2;
                        if (!c9742.f32771) {
                            m24702(interfaceC3800);
                        }
                        return c14393M24715;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c9742 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                interfaceC3800 = interfaceC3800Resolve;
                c9742 = null;
                c14395 = c14394;
            }
        } catch (Throwable th5) {
            th = th5;
            interfaceC3800 = interfaceC3800Resolve;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24702(InterfaceC3800 interfaceC3800) {
        InterfaceC5046 interfaceC5046Walk = C5212.walk(interfaceC3800, new EnumC13680[0]);
        try {
            Iterator it = interfaceC5046Walk.sorted(C7618.reverseOrder()).toList().iterator();
            while (it.hasNext()) {
                C5212.delete((InterfaceC3800) it.next());
            }
            interfaceC5046Walk.close();
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
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24703(InterfaceC5614 interfaceC5614) {
        if (interfaceC5614.mo2357()) {
            throw new CancellationException("Text pagination is canceled");
        }
    }
}
