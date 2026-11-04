package l;

import android.os.Bundle;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.۫ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12834 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9475 f41116;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final UUID f41117;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f41118;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C12303 f41119;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3180 f41120;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long f41121;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C15071 f41122;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20334 f41123;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C3510 f41124;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18251 f41125;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f41126;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f41127;

    public /* synthetic */ C12834(C3510 c3510, C12303 c12303, C20334 c20334, C3180 c3180, long j, int i, byte[] bArr) {
        this(c3510, null, c12303, c20334, c3180, j, i, null, -1L, bArr);
    }

    public C12834(C3510 c3510, C9475 c9475, C12303 c12303, C20334 c20334, C3180 c3180, long j, int i, UUID uuid, long j2, byte[] bArr) {
        this.f41124 = c3510;
        this.f41116 = c9475;
        this.f41119 = c12303;
        this.f41123 = c20334;
        this.f41120 = c3180;
        this.f41127 = bArr;
        this.f41121 = j;
        this.f41118 = i;
        this.f41117 = uuid;
        this.f41126 = j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12834 m31871(C24965 c24965, InterfaceC24329 interfaceC24329, C0352 c0352, int i) {
        UUID uuidM55768;
        long jM55766;
        C5090 c5090M29072;
        long j;
        C7305 c7305M55767;
        synchronized (c24965) {
            uuidM55768 = c24965.m55768();
            jM55766 = c24965.m55766();
            try {
                c5090M29072 = C11557.m29072(uuidM55768, c24965.m55765());
                if (c5090M29072 == null) {
                    throw new IOException("Fragment recovery attachment is missing");
                }
                j = i;
                if (c5090M29072.m15397() > j) {
                    throw new IOException("Fragment state exceeds recovery limit");
                }
                c7305M55767 = c24965.m55767();
            } catch (IllegalStateException e) {
                throw new IOException("Invalid fragment recovery metadata", e);
            }
        }
        try {
            int iM15397 = (int) c5090M29072.m15397();
            C18251 c18251M2112 = c0352.m2112(c5090M29072.m15397() + 32);
            try {
                C21785 c21785 = new C21785(new byte[iM15397], c18251M2112);
                try {
                    c5090M29072.m15394(interfaceC24329, uuidM55768, j, c0352, c21785.m49405());
                    C12834 c12834M31870 = m31870(c21785, i, c7305M55767);
                    try {
                        C12834 c12834M31869 = c12834M31870.m31869(uuidM55768, jM55766);
                        c12834M31870.close();
                        c21785.close();
                        c7305M55767.close();
                        return c12834M31869;
                    } catch (Throwable th) {
                        try {
                            c12834M31870.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c21785.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Error e2) {
                e = e2;
                c18251M2112.close();
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                c18251M2112.close();
                throw e;
            }
        } catch (Throwable th5) {
            try {
                c7305M55767.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19547 m31880(C17505 c17505, C23056 c23056) {
        C19547 c19547;
        synchronized (c17505) {
            C7305 c7305M41121 = c17505.m41121();
            try {
                if (c7305M41121.m19989() != this.f41121 || c7305M41121.length() != this.f41118) {
                    throw new IllegalStateException("Migrated fragment text no longer matches");
                }
                c7305M41121.close();
                C12834 c12834M31869 = m31869(c17505.m41108(), c17505.m41105());
                try {
                    c19547 = new C19547(c12834M31869, c23056);
                } catch (Error e) {
                    e = e;
                    c12834M31869.close();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    c12834M31869.close();
                    throw e;
                }
            } catch (Throwable th) {
                try {
                    c7305M41121.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            throw th;
        }
        return c19547;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10596 m31868(C7305 c7305, Bundle bundle, C23056 c23056, C12303 c12303, byte[] bArr, byte[] bArr2, int i) {
        return m31867(c7305, bundle, c23056, c12303, bArr, bArr.length, bArr2, i, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10596 m31867(C7305 c7305, Bundle bundle, C23056 c23056, C12303 c12303, byte[] bArr, int i, byte[] bArr2, int i2, C15071 c15071, C3180 c3180) throws Throwable {
        boolean z;
        long jM31864 = m31864(bundle);
        long jM51959 = ((long) (c23056 == null ? 0 : c23056.m51959(i2))) + 1;
        long j = i;
        long jM30705 = c12303.m30705() + 48 + jM31864 + jM51959 + j + ((long) bArr2.length);
        if (i2 < 48 || jM30705 > i2 || jM30705 > 2147483639) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        long jM29929 = C11958.m29929(C20334.m46721(0, bArr, i, i2), 4L, ((jM30705 - j) * 20) + jM30705, 65536L);
        C10046 c10046 = c7305.m23622().f69247;
        if (jM29929 > (c10046 == null ? C25227.FOREVER_NS : c10046.f32208.m2119())) {
            throw new IOException("Fragment state exceeds recovery workspace budget");
        }
        C18251 c18251M19990 = c7305.m19990(c12303.m30705() + (((long) bundle.size()) * 128) + jM30705 + jM31864 + 8192);
        try {
            C18251 c18251M19991 = c7305.m19990((((long) bundle.size()) * 128) + (jM31864 * 2) + ((long) (c15071 == null ? i : 0)) + jM30705 + ((long) bArr2.length) + 8192);
            try {
                C10596 c10596M31866 = m31866(c7305, bundle, c23056, c12303, bArr, i, bArr2, i2, (int) jM30705, (int) jM51959, c18251M19990, c15071, c3180);
                if (c18251M19991 == null) {
                    return c10596M31866;
                }
                try {
                    c18251M19991.close();
                    return c10596M31866;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z && c18251M19990 != null) {
                        c18251M19990.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (c18251M19991 == null) {
                    throw th2;
                }
                try {
                    c18251M19991.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
                if (!z) {
                    c18251M19990.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m31864(Bundle bundle) throws IOException {
        long j;
        long jM29929 = 12;
        for (String str : bundle.keySet()) {
            if (str == null) {
                throw new IOException("Invalid fragment config key");
            }
            long jM299210 = C11958.m29929(str.length(), 2L, 5L, jM29929);
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                jM29929 = C11958.m29929(((String) obj).length(), 2L, 4L, jM299210);
            } else {
                if (obj instanceof Boolean) {
                    j = 1;
                } else {
                    if (obj instanceof Integer) {
                        jM299210 += 4;
                    } else if (obj instanceof Long) {
                        j = 8;
                    } else if (obj != null) {
                        throw new IOException("Unsupported fragment config value");
                    }
                    jM29929 = jM299210;
                }
                jM299210 += j;
                jM29929 = jM299210;
            }
        }
        return jM29929;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10596 m31866(C7305 c7305, Bundle bundle, C23056 c23056, C12303 c12303, byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, C18251 c18251, C15071 c15071, C3180 c3180) throws IOException {
        C3510 c3510M11505 = C3510.m11505(i2, bundle);
        byte[] bArrM11508 = c3510M11505.m11508(i2);
        C6178 c6178 = new C6178(i3);
        c6178.writeInt(843469637);
        c6178.writeInt(1);
        c6178.writeInt(i3);
        c6178.m17803(c7305.m19989());
        c6178.writeInt(c7305.length());
        c6178.m17806(bArrM11508);
        c6178.writeInt(i4);
        c6178.m17789(c23056 != null);
        if (c23056 != null) {
            c23056.m51961(c6178);
        }
        c6178.writeInt((int) c12303.m30705());
        c12303.m30710(c6178);
        c6178.writeInt(i);
        C22531 c22531 = new C22531(c6178.size(), i);
        c6178.write(bArr, 0, i);
        c6178.writeInt(bArr2.length);
        C22531 c22532 = new C22531(c6178.size(), bArr2.length);
        c6178.write(bArr2, 0, bArr2.length);
        if (c6178.size() != i3 - 4) {
            throw new IllegalStateException("Fragment state changed while being captured");
        }
        byte[] bArrM17808 = c6178.m17808();
        int size = c6178.size();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM17808, 0, size);
        c6178.writeInt((int) crc32.getValue());
        return new C10596(c6178.m17796(), c18251, c15071, c3510M11505, c12303, c3180, c22531, c22532, c7305.m19989(), c7305.length());
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12834 m31870(C21785 c21785, int i, C7305 c7305) throws Throwable {
        boolean z;
        byte[] bArrM49405 = c21785.m49405();
        if (i < 0 || bArrM49405.length > i || bArrM49405.length < 48) {
            throw new IOException("Invalid fragment recovery state length");
        }
        C20348 c20348 = new C20348(bArrM49405);
        c20348.seek(bArrM49405.length - 4);
        int i2 = c20348.readInt();
        int length = bArrM49405.length - 4;
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM49405, 0, length);
        if (i2 != ((int) crc32.getValue())) {
            throw new IOException("Invalid fragment recovery state checksum");
        }
        c20348.seek(0L);
        if (c20348.readInt() != 843469637 || c20348.readInt() != 1 || c20348.readInt() != bArrM49405.length) {
            throw new IOException("Unsupported fragment recovery state");
        }
        long j = c20348.readLong();
        int i3 = c20348.readInt();
        if (j != c7305.m19989() || i3 != c7305.length()) {
            throw new IOException("Fragment state belongs to another text revision");
        }
        C22531 c22531M31872 = m31872(c20348);
        int i4 = c22531M31872.f72875;
        C22531 c22531M31873 = m31872(c20348);
        int i5 = c22531M31873.f72875;
        C22531 c22531M31874 = m31872(c20348);
        C22531 c22531M31875 = m31872(c20348);
        C22531 c22531M31876 = m31872(c20348);
        int i6 = c22531M31876.f72876;
        int i7 = c22531M31876.f72875;
        if (c20348.available() == 4) {
            long length2 = bArrM49405.length - c22531M31875.f72875;
            C18251 c18251M19990 = c7305.m19990((16 * length2) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
            C15071 c15071M36330 = null;
            try {
                C18251 c18251M19991 = c7305.m19990((length2 * 4) + 8192);
                try {
                    c15071M36330 = C15071.m36330(c21785, c22531M31875, i, c7305);
                    C20334 c20334 = c15071M36330.f49217;
                    C3510 c3510M11504 = C3510.m11504(i, i4, new ByteArrayInputStream(bArrM49405, c22531M31872.f72876, i4));
                    C9475 c9475M24858 = C9475.m24858(i, i5, new ByteArrayInputStream(bArrM49405, c22531M31873.f72876, i5));
                    int i8 = c22531M31874.f72876;
                    C12834 c12834 = new C12834(c3510M11504, c9475M24858, C12303.m30699(i, Arrays.copyOfRange(bArrM49405, i8, c22531M31874.f72875 + i8)), c20334, C3180.m10382(new ByteArrayInputStream(bArrM49405, i6, i7), i7, i), c7305.m19989(), c7305.length(), null, -1L, Arrays.copyOfRange(bArrM49405, i6, i7 + i6));
                    c12834.f41125 = c18251M19990;
                    c12834.f41122 = c15071M36330;
                    if (c18251M19991 == null) {
                        return c12834;
                    }
                    try {
                        c18251M19991.close();
                        return c12834;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            if (c15071M36330 != null) {
                                c15071M36330.close();
                            }
                            if (c18251M19990 != null) {
                                c18251M19990.close();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (c18251M19991 == null) {
                        throw th2;
                    }
                    try {
                        c18251M19991.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                z = false;
                if (!z) {
                    if (c15071M36330 != null) {
                        c15071M36330.close();
                    }
                    if (c18251M19990 != null) {
                        c18251M19990.close();
                    }
                }
                throw th;
            }
        }
        throw new IOException("Trailing fragment recovery state fields");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10596 m31876(C7305 c7305, Bundle bundle, C23056 c23056, String str, int i, int i2, boolean z) throws IOException {
        C12303 c12303M30708 = this.f41119.m30708(i, i2, str);
        if (z) {
            c12303M30708 = C14916.m35893(bundle, c12303M30708, c7305.length());
        }
        return m31865(c7305, bundle, c23056, c12303M30708);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10596 m31875(C7305 c7305, Bundle bundle, C23056 c23056) {
        return m31865(c7305, bundle, c23056, this.f41119);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10596 m31877(C7305 c7305, Bundle bundle, C23056 c23056, String str, boolean z) {
        int length = c7305.length();
        C12303 c12303M30713 = this.f41119.m30713(str);
        if (z) {
            c12303M30713 = C14916.m35893(bundle, c12303M30713, length);
        }
        return m31865(c7305, bundle, c23056, c12303M30713);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10596 m31865(C7305 c7305, Bundle bundle, C23056 c23056, C12303 c12303) {
        return m31867(c7305, bundle, c23056, c12303, this.f41122.f49215, this.f41122.f49215.length, this.f41127, 8388608, this.f41122, this.f41120);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12834 m31878(C7305 c7305, Bundle bundle, C23056 c23056, C12303 c12303, int i) throws Throwable {
        long jM30705 = c12303.m30705() + m31864(bundle) + ((long) this.f41127.length) + 1 + ((long) (c23056 == null ? 0 : c23056.m51959(i)));
        if (i < 48 || 48 + jM30705 + ((long) this.f41122.f49215.length) > i) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        C18251 c18251M19990 = c7305.m19990((jM30705 * 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        C15071 c15071 = null;
        try {
            C3510 c3510M11505 = C3510.m11505(i, bundle);
            C15071 c15072 = this.f41122;
            c15072.m36333();
            try {
                C12834 c12834 = new C12834(c3510M11505, null, c12303, c15072.f49217, this.f41120, c7305.m19989(), c7305.length(), null, -1L, this.f41127);
                c12834.f41125 = c18251M19990;
                c12834.f41122 = c15072;
                return c12834;
            } catch (IOException | Error | RuntimeException e) {
                e = e;
                c15071 = c15072;
                if (c15071 != null) {
                    c15071.close();
                }
                if (c18251M19990 != null) {
                    c18251M19990.close();
                }
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Error e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19547 m31879() {
        if (this.f41117 == null) {
            throw new IllegalStateException("Fragment state is not bound to a recovery candidate");
        }
        try {
            return new C19547(this, this.f41116.m24859());
        } catch (Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31881(C17505 c17505) {
        synchronized (c17505) {
            UUID uuid = this.f41117;
            if (uuid == null || !uuid.equals(c17505.m41108()) || this.f41126 != c17505.m41105()) {
                throw new IllegalStateException("Fragment recovery candidate is no longer current");
            }
            C7305 c7305M41121 = c17505.m41121();
            try {
                if (c7305M41121.m19989() != this.f41121 || c7305M41121.length() != this.f41118) {
                    throw new IllegalStateException("Fragment recovery text no longer matches");
                }
                c7305M41121.close();
            } catch (Throwable th) {
                try {
                    c7305M41121.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12834 m31869(UUID uuid, long j) {
        C12834 c12834 = new C12834(this.f41124, this.f41116, this.f41119, this.f41123, this.f41120, this.f41121, this.f41118, uuid, j, this.f41127);
        c12834.f41125 = this.f41125;
        c12834.f41122 = this.f41122;
        this.f41125 = null;
        this.f41122 = null;
        this.f41124 = null;
        this.f41116 = null;
        this.f41119 = null;
        this.f41123 = null;
        this.f41120 = null;
        this.f41127 = null;
        return c12834;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f41124 = null;
        this.f41116 = null;
        this.f41119 = null;
        this.f41123 = null;
        this.f41120 = null;
        this.f41127 = null;
        C15071 c15071 = this.f41122;
        this.f41122 = null;
        if (c15071 != null) {
            c15071.close();
        }
        C18251 c18251 = this.f41125;
        this.f41125 = null;
        if (c18251 != null) {
            c18251.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22531 m31872(C20348 c20348) throws IOException {
        if (c20348.available() < 8) {
            throw new IOException("Missing fragment recovery field");
        }
        int i = c20348.readInt();
        if (i < 0 || i > c20348.available() - 4) {
            throw new IOException("Invalid fragment recovery field length");
        }
        C22531 c22531 = new C22531((int) c20348.getPosition(), i);
        c20348.skipBytes(i);
        return c22531;
    }
}
