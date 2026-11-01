package l;

import android.os.Bundle;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩻ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes.dex */
public final class C23874 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f77147;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f77148;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f77149;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C12175 f77150;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12318 f77151;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23853 f77152;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f77153;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8331 f77154;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9017 f77155;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16551 f77156;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f77157;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final UUID f77158;

    public C23874(C8331 c8331, C23853 c23853, C12175 c12175, C12318 c12318, C16551 c16551, long j, int i, UUID uuid, long j2, byte[] bArr, byte[] bArr2) {
        this.f77154 = c8331;
        this.f77152 = c23853;
        this.f77150 = c12175;
        this.f77151 = c12318;
        this.f77156 = c16551;
        this.f77147 = bArr;
        this.f77157 = bArr2;
        this.f77148 = j;
        this.f77153 = i;
        this.f77158 = uuid;
        this.f77149 = j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23874 m52602(C5488 c5488, InterfaceC3800 interfaceC3800, C10428 c10428, int i) {
        UUID uuidM15176;
        long jM15173;
        C14641 c14641M19278;
        long j;
        C6276 c6276M15172;
        synchronized (c5488) {
            uuidM15176 = c5488.m15176();
            jM15173 = c5488.m15173();
            try {
                c14641M19278 = C7235.m19278(uuidM15176, c5488.m15174());
                if (c14641M19278 == null) {
                    throw new IOException("Fragment recovery attachment is missing");
                }
                j = i;
                if (c14641M19278.m35154() > j) {
                    throw new IOException("Fragment state exceeds recovery limit");
                }
                c6276M15172 = c5488.m15172();
            } catch (IllegalStateException e) {
                throw new IOException("Invalid fragment recovery metadata", e);
            }
        }
        try {
            C9017 c9017M26333 = c10428.m26333(c14641M19278.m35154() + 32);
            try {
                InputStream inputStreamM35151 = c14641M19278.m35151(interfaceC3800, uuidM15176, j, c10428);
                try {
                    int iM35154 = (int) c14641M19278.m35154();
                    byte[] bArr = new byte[iM35154];
                    int i2 = 0;
                    while (i2 < iM35154) {
                        int i3 = inputStreamM35151.read(bArr, i2, iM35154 - i2);
                        if (i3 <= 0) {
                            throw new IOException("Truncated fragment recovery attachment");
                        }
                        i2 += i3;
                    }
                    if (inputStreamM35151.read() != -1) {
                        throw new IOException("Trailing fragment recovery attachment bytes");
                    }
                    C23874 c23874M52605 = m52605(bArr, i, c6276M15172);
                    try {
                        C23874 c23874M52601 = c23874M52605.m52601(uuidM15176, jM15173);
                        c23874M52605.close();
                        inputStreamM35151.close();
                        c9017M26333.close();
                        c6276M15172.close();
                        return c23874M52601;
                    } catch (Throwable th) {
                        try {
                            c23874M52605.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        inputStreamM35151.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                c9017M26333.close();
                throw th5;
            }
            try {
                c9017M26333.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        } catch (Throwable th7) {
            try {
                c6276M15172.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11174 m52611(C1254 c1254, C2063 c2063) {
        C11174 c11174;
        synchronized (c1254) {
            C6276 c6276M4554 = c1254.m4554();
            try {
                if (c6276M4554.m17352() != this.f77148 || c6276M4554.length() != this.f77153) {
                    throw new IllegalStateException("Migrated fragment text no longer matches");
                }
                c6276M4554.close();
                C23874 c23874M52601 = m52601(c1254.m4527(), c1254.m4523());
                try {
                    c11174 = new C11174(c23874M52601, c2063);
                } catch (Error e) {
                    e = e;
                    c23874M52601.close();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    c23874M52601.close();
                    throw e;
                }
            } catch (Throwable th) {
                try {
                    c6276M4554.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            throw th;
        }
        return c11174;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6234 m52600(C6276 c6276, Bundle bundle, C2063 c2063, C12175 c12175, byte[] bArr, byte[] bArr2, int i) throws Throwable {
        long jM19505 = 12;
        for (String str : bundle.keySet()) {
            if (str == null) {
                throw new IOException("Invalid fragment config key");
            }
            long jM19506 = C7309.m19505(str.length(), 2L, 5L, jM19505);
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                jM19505 = C7309.m19505(((String) obj).length(), 2L, 4L, jM19506);
            } else {
                if (obj instanceof Boolean) {
                    jM19506++;
                } else if (obj instanceof Integer) {
                    jM19506 += 4;
                } else if (obj instanceof Long) {
                    jM19506 += 8;
                } else if (obj != null) {
                    throw new IOException("Unsupported fragment config value");
                }
                jM19505 = jM19506;
            }
        }
        boolean z = false;
        long jM30267 = c12175.m30267() + 49 + jM19505 + ((long) (c2063 == null ? 0 : c2063.m6568(i))) + ((long) bArr.length) + ((long) bArr2.length);
        if (i < 48 || jM30267 > i || jM30267 > 2147483639) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        C9017 c9017M17353 = c6276.m17353(C7309.m19505(bundle.size(), 128L, jM30267 + jM19505, 8192L));
        Long.signum(jM30267);
        try {
            C9017 c9017M17354 = c6276.m17353((jM30267 * 8) + 8192);
            try {
                C6234 c6234 = new C6234(m52606(c6276, bundle, c2063, c12175, bArr, bArr2, i), c9017M17353);
                if (c9017M17354 == null) {
                    return c6234;
                }
                try {
                    c9017M17354.close();
                    return c6234;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z && c9017M17353 != null) {
                        c9017M17353.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (c9017M17354 == null) {
                    throw th2;
                }
                try {
                    c9017M17354.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (!z) {
                c9017M17353.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m52606(C6276 c6276, Bundle bundle, C2063 c2063, C12175 c12175, byte[] bArr, byte[] bArr2, int i) throws IOException {
        if (i < 48 || bArr.length > i || bArr2.length > i) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        byte[] bArrM21759 = C8331.m21755(i, bundle).m21759(i);
        long jM6568 = ((long) (c2063 == null ? 0 : c2063.m6568(i))) + 1;
        long jM30267 = c12175.m30267();
        long length = ((long) bArrM21759.length) + 48 + jM6568 + jM30267 + ((long) bArr.length) + ((long) bArr2.length);
        if (length > i || length > 2147483639) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        C12318.m30578(new ByteArrayInputStream(bArr), bArr.length, i);
        C16551.m38952(new ByteArrayInputStream(bArr2), bArr2.length, i);
        int i2 = (int) length;
        C11018 c11018 = new C11018(i2);
        c11018.writeInt(843469637);
        c11018.writeInt(1);
        c11018.writeInt(i2);
        c11018.m27791(c6276.m17352());
        c11018.writeInt(c6276.length());
        c11018.m27794(bArrM21759);
        c11018.writeInt((int) jM6568);
        c11018.m27784(c2063 != null);
        if (c2063 != null) {
            c2063.m6570(c11018);
        }
        c11018.writeInt((int) jM30267);
        c12175.m30272(c11018);
        c11018.m27794(bArr);
        c11018.m27794(bArr2);
        if (c11018.size() != length - 4) {
            throw new IllegalStateException("Fragment state changed while being captured");
        }
        byte[] bArrM27788 = c11018.m27788();
        int size = c11018.size();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM27788, 0, size);
        c11018.writeInt((int) crc32.getValue());
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C23874 m52605(byte[] bArr, int i, C6276 c6276) throws Throwable {
        if (i < 0 || bArr.length > i || bArr.length < 48) {
            throw new IOException("Invalid fragment recovery state length");
        }
        C9017 c9017M17353 = c6276.m17353((((long) bArr.length) * 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        boolean z = false;
        try {
            C9017 c9017M17354 = c6276.m17353((((long) bArr.length) * 4) + 8192);
            try {
                C23874 c23874M52603 = m52603(bArr, i, c6276);
                c23874M52603.f77155 = c9017M17353;
                if (c9017M17354 == null) {
                    return c23874M52603;
                }
                try {
                    c9017M17354.close();
                    return c23874M52603;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z && c9017M17353 != null) {
                        c9017M17353.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (c9017M17354 != null) {
                    try {
                        c9017M17354.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23874 m52603(byte[] bArr, int i, C6276 c6276) throws IOException {
        if (i < 0 || bArr.length > i || bArr.length < 48) {
            throw new IOException("Invalid fragment recovery state length");
        }
        C17367 c17367 = new C17367(bArr);
        c17367.seek(bArr.length - 4);
        int i2 = c17367.readInt();
        int length = bArr.length - 4;
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 0, length);
        if (i2 != ((int) crc32.getValue())) {
            throw new IOException("Invalid fragment recovery state checksum");
        }
        c17367.seek(0L);
        if (c17367.readInt() != 843469637 || c17367.readInt() != 1 || c17367.readInt() != bArr.length) {
            throw new IOException("Unsupported fragment recovery state");
        }
        long j = c17367.readLong();
        int i3 = c17367.readInt();
        if (j != c6276.m17352() || i3 != c6276.length()) {
            throw new IOException("Fragment state belongs to another text revision");
        }
        byte[] bArrM52604 = m52604(c17367);
        byte[] bArrM52605 = m52604(c17367);
        byte[] bArrM52606 = m52604(c17367);
        byte[] bArrM52607 = m52604(c17367);
        byte[] bArrM52608 = m52604(c17367);
        if (c17367.available() != 4) {
            throw new IOException("Trailing fragment recovery state fields");
        }
        return new C23874(C8331.m21754(i, bArrM52604.length, new ByteArrayInputStream(bArrM52604)), C23853.m52577(i, bArrM52605.length, new ByteArrayInputStream(bArrM52605)), C12175.m30261(i, bArrM52606), C12318.m30578(new ByteArrayInputStream(bArrM52607), bArrM52607.length, i), C16551.m38952(new ByteArrayInputStream(bArrM52608), bArrM52608.length, i), j, i3, null, -1L, bArrM52607, bArrM52608);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6234 m52608(C6276 c6276, Bundle bundle, C2063 c2063, String str, int i, int i2, boolean z) throws IOException {
        C12175 c12175M30270 = this.f77150.m30270(i, i2, str);
        if (z) {
            c12175M30270 = C10469.m26449(bundle, c12175M30270, c6276.length());
        }
        return m52600(c6276, bundle, c2063, c12175M30270, this.f77147, this.f77157, 8388608);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6234 m52607(C6276 c6276, Bundle bundle, C2063 c2063) {
        return m52600(c6276, bundle, c2063, this.f77150, this.f77147, this.f77157, 8388608);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6234 m52609(C6276 c6276, Bundle bundle, C2063 c2063, String str, boolean z, int i) {
        C12175 c12175M30275 = this.f77150.m30275(str);
        if (z) {
            c12175M30275 = C10469.m26449(bundle, c12175M30275, c6276.length());
        }
        return m52600(c6276, bundle, c2063, c12175M30275, this.f77147, this.f77157, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11174 m52610() {
        if (this.f77158 == null) {
            throw new IllegalStateException("Fragment state is not bound to a recovery candidate");
        }
        try {
            return new C11174(this, this.f77152.m52578());
        } catch (Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52612(C1254 c1254) {
        synchronized (c1254) {
            UUID uuid = this.f77158;
            if (uuid == null || !uuid.equals(c1254.m4527()) || this.f77149 != c1254.m4523()) {
                throw new IllegalStateException("Fragment recovery candidate is no longer current");
            }
            C6276 c6276M4554 = c1254.m4554();
            try {
                if (c6276M4554.m17352() != this.f77148 || c6276M4554.length() != this.f77153) {
                    throw new IllegalStateException("Fragment recovery text no longer matches");
                }
                c6276M4554.close();
            } catch (Throwable th) {
                try {
                    c6276M4554.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23874 m52601(UUID uuid, long j) {
        C23874 c23874 = new C23874(this.f77154, this.f77152, this.f77150, this.f77151, this.f77156, this.f77148, this.f77153, uuid, j, this.f77147, this.f77157);
        c23874.f77155 = this.f77155;
        this.f77155 = null;
        this.f77154 = null;
        this.f77152 = null;
        this.f77150 = null;
        this.f77151 = null;
        this.f77156 = null;
        this.f77157 = null;
        this.f77147 = null;
        return c23874;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f77154 = null;
        this.f77152 = null;
        this.f77150 = null;
        this.f77151 = null;
        this.f77156 = null;
        this.f77157 = null;
        this.f77147 = null;
        C9017 c9017 = this.f77155;
        this.f77155 = null;
        if (c9017 != null) {
            c9017.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m52604(C17367 c17367) throws IOException {
        if (c17367.available() < 8) {
            throw new IOException("Missing fragment recovery field");
        }
        int i = c17367.readInt();
        if (i >= 0 && i <= c17367.available() - 4) {
            byte[] bArr = new byte[i];
            c17367.m40446(i, bArr);
            return bArr;
        }
        throw new IOException("Invalid fragment recovery field length");
    }
}
