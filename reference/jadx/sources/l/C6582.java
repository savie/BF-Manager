package l;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PE */
/* JADX INFO: loaded from: classes3.dex */
public final class C6582 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18509(C7745 c7745, C6178 c6178) {
        int size = c6178.size();
        c6178.writeInt(827544404);
        c6178.m17797();
        c6178.m17803(c7745.f25504);
        C7305 c7305 = c7745.f25502;
        c6178.m17803(c7305.m19989());
        c6178.m17806(c7745.f25501.f40313);
        C14762 c14762 = new C14762(c6178);
        c14762.m35498(c7305.m23622());
        C12219 c12219 = c7745.f25503;
        c6178.writeInt(c12219.f39260.m48908());
        c6178.writeInt(c12219.f39260.m48906());
        c6178.m17803(c12219.f39258);
        c6178.m17803(c12219.f39262);
        c6178.m17803(c12219.f39259);
        C3335 c3335 = c12219.f39261;
        c6178.m17803(c3335.f10907);
        c6178.writeByte(c3335.f10905 ? 1 : 0);
        m18510(c3335.f10908, c14762, c6178);
        m18510(c3335.f10906, c14762, c6178);
        c6178.m17780();
        c6178.writeInt(C12768.m31649(size, c6178.size() - size, c6178.m17808()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18510(C20424 c20424, C14762 c14762, C6178 c6178) {
        c6178.writeInt(c20424.m46836());
        Iterator it = c20424.iterator();
        while (true) {
            C15948 c15948 = (C15948) it;
            if (!c15948.hasNext()) {
                return;
            }
            C20489 c20489 = (C20489) c15948.next();
            long j = c20489.f65634;
            C20424 c20425 = c20489.f65630;
            c6178.m17803(j);
            c6178.m17803(c20489.f65632);
            c6178.writeByte(c20489.f65631 == EnumC22662.USER ? 0 : 1);
            c6178.writeInt(c20425.m46836());
            Iterator it2 = c20425.iterator();
            while (true) {
                C15948 c15949 = (C15948) it2;
                if (c15949.hasNext()) {
                    C10727 c10727 = (C10727) c15949.next();
                    int i = c10727.f34065;
                    C21498 c21498 = c10727.f34067;
                    c6178.writeInt(i);
                    c6178.m17803(c10727.f34066);
                    c6178.m17803(c10727.f34070);
                    c6178.writeInt(c21498.m48908());
                    c6178.writeInt(c21498.m48906());
                    c14762.m35498(c10727.f34068);
                    c14762.m35498(c10727.f34064);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0139 A[Catch: all -> 0x0134, TRY_ENTER, TryCatch #1 {all -> 0x0134, blocks: (B:22:0x0072, B:24:0x00a1, B:26:0x00ab, B:28:0x00b5, B:30:0x00e0, B:34:0x00ee, B:35:0x00f3, B:36:0x00fa, B:37:0x010a, B:59:0x0139, B:60:0x013c, B:45:0x011e, B:46:0x0125, B:47:0x0126, B:48:0x012a, B:49:0x012b, B:50:0x012f), top: B:71:0x0072 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7745 m18507(C20348 c20348) {
        C7305 c7305;
        int iM46744 = c20348.m46744();
        if (c20348.available() < 12 || c20348.readInt() != 827544404) {
            throw m18506();
        }
        int i = c20348.readInt();
        if (i < 0 || i > c20348.available() - 4) {
            throw m18506();
        }
        byte[] bArr = new byte[i];
        c20348.m46745(i, bArr);
        if (c20348.readInt() != C12768.m31649(iM46744, i + 8, c20348.f65270)) {
            throw m18506();
        }
        C20348 c20349 = new C20348(bArr);
        long j = c20349.readLong();
        long j2 = c20349.readLong();
        int i2 = c20349.readInt();
        if (j < 0 || j2 < 0 || i2 < 0 || i2 > 8192 || i2 > c20349.available()) {
            throw m18506();
        }
        byte[] bArr2 = new byte[i2];
        c20349.m46745(i2, bArr2);
        C12547 c12547M31220 = C12547.m31220(null, bArr2);
        try {
            try {
                C4322 c4322 = new C4322(c20349);
                C21697 c21697M13817 = c4322.m13817();
                C21498 c21498 = new C21498(c20349.readInt(), c20349.readInt());
                long j3 = c20349.readLong();
                long j4 = c20349.readLong();
                long j5 = c20349.readLong();
                long j6 = c20349.readLong();
                int i3 = c20349.readByte() & 255;
                if (i3 > 1 || c21498.m48908() > c21697M13817.m49259() || c21498.m48906() > c21697M13817.m49259()) {
                    throw m18506();
                }
                HashSet hashSet = new HashSet();
                C20424 c20424M18508 = m18508(c20349, c4322, hashSet, j6, j4);
                C20424 c20424M18509 = m18508(c20349, c4322, hashSet, j6, j4);
                if (c20349.available() != 0) {
                    throw m18506();
                }
                C3335 c3335 = new C3335(c20424M18508, c20424M18509, j6, i3 == 1);
                try {
                    C25228.m56290(c3335, c21697M13817.m49259());
                    C12219 c12219 = new C12219(c3335, c21498, j3, j4, j5);
                    c7305 = new C7305(c21697M13817, j2);
                    try {
                        C7745 c7745 = new C7745(c7305, c12547M31220, c12219, C21170.f67574, j);
                        c12547M31220.close();
                        return c7745;
                    } catch (Error e) {
                        e = e;
                        if (c7305 != null) {
                            c7305.close();
                        }
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        if (c7305 != null) {
                            c7305.close();
                        }
                        throw e;
                    }
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Invalid session history", e3);
                }
            } catch (Throwable th) {
                c12547M31220.close();
                throw th;
            }
        } catch (Error | RuntimeException e4) {
            e = e4;
            c7305 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20424 m18508(C20348 c20348, C4322 c4322, HashSet hashSet, long j, long j2) {
        int i = c20348.readInt();
        if (i < 0 || i > c20348.available() / 21) {
            throw m18506();
        }
        C20424 c20424 = new C20424();
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = c20348.readLong();
            long j4 = c20348.readLong();
            int i3 = c20348.readByte() & 255;
            int i4 = c20348.readInt();
            if (j3 <= 0 || j3 >= j || !hashSet.add(Long.valueOf(j3)) || i3 > 1 || i4 <= 0 || i4 > c20348.available() / 52) {
                throw m18506();
            }
            C20424 c20425 = new C20424();
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = c20348.readInt();
                long j5 = c20348.readLong();
                long j6 = c20348.readLong();
                C21498 c21498 = new C21498(c20348.readInt(), c20348.readInt());
                if (j5 < 0 || j6 < 0 || j5 > j2 || j6 > j2) {
                    throw m18506();
                }
                c20425 = c20425.m46834(new C10727(i6, j5, j6, c21498, c4322.m13817(), c4322.m13817()));
            }
            c20424 = c20424.m46834(new C20489(j3, j4, i3 == 0 ? EnumC22662.USER : EnumC22662.BATCH, c20425));
        }
        return c20424;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m18506() {
        return new IllegalArgumentException("Invalid inline session state");
    }
}
