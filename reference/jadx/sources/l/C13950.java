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

/* JADX INFO: renamed from: l.۬ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 36NN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13950 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f44237;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f44238;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f44239;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Bundle f44240;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f44241;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f44242;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f44243;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f44244 = new Object();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f44245 = FutureC23690.m52928(null);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f44246;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f44247;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f44248;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C7239 m34009(int i, CharSequence charSequence, C19304 c19304) {
        int i2 = this.f44241;
        this.f44241 = i2 + 1;
        if (i2 == 0) {
            this.f44245 = new FutureC23690();
        }
        return new C7239(this, i, charSequence, c19304);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34014() {
        return this.f44241 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34015(int i) {
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.f44238;
            if (i2 >= zArr.length) {
                return false;
            }
            if (i2 != i && zArr[i2]) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC23690 m34017() {
        return this.f44245.m52949((InterfaceC25138) new C2764(0));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized C23056 m34018() {
        return new C23056(0, this.f44246, false, 0, null, null, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized Bundle m34019() {
        return new Bundle(this.f44240);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized String m34021() {
        return this.f44239;
    }

    public C13950(InterfaceC24329 interfaceC24329, String str, List list, boolean[] zArr, Bundle bundle, int i, int i2, String str2) {
        this.f44248 = interfaceC24329;
        this.f44243 = str;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C17359.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f44242 = C4681.unmodifiableList(arrayList);
        this.f44238 = zArr;
        this.f44240 = new Bundle(bundle);
        this.f44247 = i;
        this.f44246 = i2;
        this.f44239 = str2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m34016() {
        return this.f44242.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 m34020(int i) {
        if (i < 0 || i >= this.f44242.size()) {
            throw new IndexOutOfBoundsException("Invalid text page index");
        }
        return this.f44248.resolve(this.f44243).resolve(Integer.toString(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16320 m34012(C19304 c19304, int i, InterfaceC7509 interfaceC7509) {
        int i2;
        synchronized (this) {
            i2 = this.f44247;
        }
        return m34011(i2, c19304, i, interfaceC7509, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13950 m34007(InterfaceC24329 interfaceC24329) throws IOException {
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329.resolve("app-pages");
        EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
        if (!C3445.isRegularFile(interfaceC24329Resolve, enumC20599)) {
            throw new IOException("Invalid text page directory");
        }
        long size = C3445.size(interfaceC24329Resolve);
        if (size < 40 || size > 2097152) {
            throw new IOException("Invalid text page directory length");
        }
        int i = (int) size;
        byte[] bArr = new byte[i];
        InputStream inputStreamNewInputStream = C3445.newInputStream(interfaceC24329Resolve, enumC20599);
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
            C20348 c20348 = new C20348(bArr);
            CRC32 crc32 = new CRC32();
            int i4 = i - 4;
            crc32.update(bArr, 0, i4);
            c20348.seek(i4);
            if (c20348.readInt() != ((int) crc32.getValue())) {
                throw new IOException("Invalid text page directory checksum");
            }
            c20348.seek(0L);
            if (c20348.readInt() != 827344709 || c20348.readInt() != 1) {
                throw new IOException("Unsupported text page directory");
            }
            String str = "pages-" + new UUID(c20348.readLong(), c20348.readLong());
            int i5 = c20348.readInt();
            int i6 = c20348.readInt();
            int i7 = c20348.readInt();
            int i8 = c20348.readInt();
            if (i5 < 1 || i5 > (i - 40) / 17 || i6 < 0 || i6 >= i5 || i8 < 0 || i8 > 2) {
                throw new IOException("Invalid text page directory fields");
            }
            C2448.m8272(i7);
            ArrayList arrayList = new ArrayList(i5);
            boolean[] zArr = new boolean[i5];
            for (int i9 = 0; i9 < i5; i9++) {
                arrayList = arrayList;
                arrayList.add(new UUID(c20348.readLong(), c20348.readLong()));
                zArr[i9] = c20348.m46753();
            }
            int i10 = c20348.readInt();
            if (i10 >= 0) {
                long j = i10;
                if (j == c20348.available() - 4) {
                    byte[] bArr2 = new byte[i10];
                    c20348.m46745(i10, bArr2);
                    return new C13950(interfaceC24329, str, arrayList, zArr, C3510.m11504(2097152, j, new ByteArrayInputStream(bArr2)).m11509(), i6, i7, i8 == 1 ? "\r" : i8 == 2 ? "\r\n" : "\n");
                }
            }
            throw new IOException("Invalid text page configuration length");
        } catch (RuntimeException e) {
            throw new IOException("Invalid text page directory", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m34003() {
        Bundle bundle;
        boolean[] zArr;
        int i;
        int i2;
        String str;
        synchronized (this.f44244) {
            synchronized (this) {
                bundle = new Bundle(this.f44240);
                zArr = (boolean[]) this.f44238.clone();
                i = this.f44247;
                i2 = this.f44246;
                str = this.f44239;
            }
            C6178 c6178 = new C6178();
            UUID uuidFromString = UUID.fromString(this.f44243.substring(6));
            c6178.writeInt(827344709);
            c6178.writeInt(1);
            c6178.m17803(uuidFromString.getMostSignificantBits());
            c6178.m17803(uuidFromString.getLeastSignificantBits());
            c6178.writeInt(this.f44242.size());
            c6178.writeInt(i);
            c6178.writeInt(i2);
            c6178.writeInt("\r".equals(str) ? 1 : "\r\n".equals(str) ? 2 : 0);
            for (int i3 = 0; i3 < this.f44242.size(); i3++) {
                UUID uuid = (UUID) this.f44242.get(i3);
                c6178.m17803(uuid.getMostSignificantBits());
                c6178.m17803(uuid.getLeastSignificantBits());
                c6178.m17789(zArr[i3]);
            }
            c6178.m17806(C3510.m11505(2097152, bundle).m11508(2097152));
            if (c6178.size() > 2097148) {
                throw new IOException("Text page directory exceeds limit");
            }
            CRC32 crc32 = new CRC32();
            crc32.update(c6178.m17808(), 0, c6178.size());
            c6178.writeInt((int) crc32.getValue());
            InterfaceC24329 interfaceC24329Resolve = this.f44248.resolve("app-pages.tmp");
            if (C3445.exists(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS)) {
                C1273.m4659(interfaceC24329Resolve);
                C3445.delete(interfaceC24329Resolve);
            }
            C7985.m21773(interfaceC24329Resolve, c6178.m17796());
            C3445.move(interfaceC24329Resolve, this.f44248.resolve("app-pages"), EnumC18361.ATOMIC_MOVE, EnumC18361.REPLACE_EXISTING);
            this.f44237 = true;
            InterfaceC22465.f72702.mo26981(this.f44248);
            C1405.m5138(this.f44248, bundle);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34013(int i, Bundle bundle, boolean z, int i2, String str) {
        synchronized (this.f44244) {
            synchronized (this) {
                this.f44246 = i2;
                this.f44239 = str;
                this.f44238[i] = z;
                this.f44240 = new Bundle(bundle);
                boolean z2 = false;
                for (boolean z3 : this.f44238) {
                    z2 |= z3;
                }
                this.f44240.putBoolean("changed", z2);
            }
            m34003();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16320 m34011(int i, C19304 c19304, int i2, InterfaceC7509 interfaceC7509, boolean z) throws Throwable {
        C16320 c16320M38711 = C16320.m38711(m34020(i), c19304.f62382, c19304.f62383, c19304.f62384, i2, interfaceC7509, (String) null);
        try {
            if (!((UUID) this.f44242.get(i)).equals(c16320M38711.f52980.mo11043().m41108())) {
                throw new IOException("Text page identity changed");
            }
            c16320M38711.m38740(this, i, i2);
            if (!z) {
                return c16320M38711;
            }
            synchronized (this.f44244) {
                synchronized (this) {
                    if (this.f44241 != 0) {
                        throw new IOException("Text document is being read");
                    }
                    this.f44247 = i;
                }
                m34003();
            }
            return c16320M38711;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c16320M38711.m38744().m52947();
            } catch (Throwable th) {
                e.addSuppressed(th);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15508 m34010(int i, C19304 c19304) {
        C24965 c24965M41079 = C17505.m41079(m34020(i), c19304.f62382, c19304.f62383);
        try {
            if (!((UUID) this.f44242.get(i)).equals(c24965M41079.m55768())) {
                throw new IOException("Text page identity changed");
            }
            C15508 c15508M37163 = C15508.m37163(c24965M41079.m55767());
            c24965M41079.close();
            return c15508M37163;
        } catch (Throwable th) {
            try {
                c24965M41079.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0520 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0536 */
    /* JADX WARN: Code duplicated, block: B:136:0x0372  */
    /* JADX WARN: Code duplicated, block: B:142:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:250:0x0349 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x049f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [l.ܶ᩵᩸] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v4, types: [l.۠ܰ᩸] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16320 m33997(l.C16320 r41, l.InterfaceC24329 r42, l.AbstractC2720 r43, int r44, l.C19304 r45, l.InterfaceC7509 r46, long r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13950.m33997(l.ܶ᩵᩸, l.᩺۬᩹, l.ۖܰ᩸, int, l.ᩳ᩵᩸, l.۟֡֫, long):l.ܶ᩵᩸");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16320 m33996(C16320 c16320, C9431 c9431, boolean z, C5902 c5902, C19304 c19304, InterfaceC7509 interfaceC7509, long j) throws Throwable {
        InterfaceC24329 interfaceC24329;
        C13950 c13950;
        C16320 c16321;
        InterfaceC24329 interfaceC243210 = c16320.f52982.f44248;
        String str = "pages-" + UUID.randomUUID();
        InterfaceC24329 interfaceC24329Resolve = interfaceC243210.resolve(str);
        C3445.createDirectory(interfaceC24329Resolve, new InterfaceC13885[0]);
        C16320 c16322 = null;
        try {
            c16320.m38734("creating_page");
            C16320 c16320M38712 = C16320.m38712(interfaceC24329Resolve.resolve("0"), c19304);
            try {
                C3354 c3354 = c16320M38712.f52980;
                c16320.m38734("replacing_source_text");
                int i = 0;
                while (true) {
                    CharSequence charSequence = c5902.f20207;
                    if (i >= charSequence.length()) {
                        break;
                    }
                    m33998(interfaceC7509);
                    int iMin = (int) Math.min(((long) i) + X931RNG.BLOCK64_RESEED_MAX, charSequence.length());
                    c16320M38712.m38732(i, iMin, charSequence);
                    i = iMin;
                    interfaceC24329 = interfaceC24329Resolve;
                    c13950 = null;
                    c16322 = c16321;
                    if (c16322 != null) {
                        c16322.m38744().m52947();
                    }
                    if (c13950 == null || !c13950.f44237) {
                        m34000(interfaceC24329);
                    }
                    throw th;
                }
                Bundle bundleM11509 = c16320.f52984.f63046.f41124.m11509();
                bundleM11509.putBoolean("e2SourcePending", false);
                bundleM11509.putBoolean("changed", false);
                bundleM11509.putBoolean(d.O, false);
                if (!z) {
                    bundleM11509.putLong("fileTime", c9431.f30601.mo4286());
                    bundleM11509.putBoolean("checkFileExists", true);
                }
                int iMin2 = (int) Math.min(Math.max(0L, j), c3354.length());
                c16320.m38734("persisting_source_pages");
                c16321 = c16320M38712;
                try {
                    c16320M38712.m38739(c16320.f52984.f63046, bundleM11509, c5902.f20205, c5902.f20204, c19304, interfaceC7509, iMin2);
                    UUID uuidM41108 = c3354.mo11043().m41108();
                    c16321.m38730(c3354.mo11043().m41105()).m52947();
                    m33998(interfaceC7509);
                    c16320.m38734("publishing_page_index");
                    Object[] objArr = {uuidM41108};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj = objArr[0];
                    C17359.requireNonNull(obj);
                    arrayList.add(obj);
                    interfaceC24329 = interfaceC24329Resolve;
                    try {
                        c13950 = new C13950(interfaceC243210, str, C4681.unmodifiableList(arrayList), new boolean[1], bundleM11509, 0, c5902.f20205.f74803, c5902.f20204);
                        try {
                            c13950.m34003();
                            c16320.m38744().m52947();
                            C13950 c13951 = c16320.f52982;
                            c13951.getClass();
                            try {
                                m34000(c13951.f44248.resolve(c13951.f44243));
                            } catch (IOException unused) {
                            }
                            c16320.m38734("opening_selected_page");
                            C16320 c16320M34012 = c13950.m34012(c19304, 8388608, interfaceC7509);
                            c16320M34012.f52975 = (j < 0 || c16320.f52982.f44242.size() == 1) ? -1 : iMin2;
                            if (!c13950.f44237) {
                                m34000(interfaceC24329);
                            }
                            return c16320M34012;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c13950 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC24329 = interfaceC24329Resolve;
                    c13950 = null;
                    c16322 = c16321;
                }
            } catch (Throwable th4) {
                th = th4;
                c16321 = c16320M38712;
            }
        } catch (Throwable th5) {
            th = th5;
            interfaceC24329 = interfaceC24329Resolve;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34000(InterfaceC24329 interfaceC24329) {
        InterfaceC20670 interfaceC20670Walk = C3445.walk(interfaceC24329, new EnumC17615[0]);
        try {
            Iterator it = interfaceC20670Walk.sorted(C2661.reverseOrder()).toList().iterator();
            while (it.hasNext()) {
                C3445.delete((InterfaceC24329) it.next());
            }
            interfaceC20670Walk.close();
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
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33998(InterfaceC7509 interfaceC7509) {
        if (interfaceC7509.mo924()) {
            throw new CancellationException("Text pagination is canceled");
        }
    }
}
