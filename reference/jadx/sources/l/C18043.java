package l;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18043 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42029(C20990 c20990, C11018 c11018) {
        int size = c11018.size();
        c11018.writeInt(827544404);
        c11018.m27799();
        c11018.m27791(c20990.f68348);
        C6276 c6276 = c20990.f68349;
        c11018.m27791(c6276.m17352());
        c11018.m27794(c20990.f68351.f70014);
        C8394 c8394 = new C8394(c11018);
        c8394.m22035(c6276.m40840());
        C21695 c21695 = c20990.f68350;
        c11018.writeInt(c21695.f70377.m23016());
        c11018.writeInt(c21695.f70377.m23014());
        c11018.m27791(c21695.f70376);
        c11018.m27791(c21695.f70375);
        c11018.m27791(c21695.f70378);
        C6899 c6899 = c21695.f70379;
        c11018.m27791(c6899.f23228);
        c11018.writeByte(c6899.f23226 ? 1 : 0);
        m42028(c6899.f23225, c8394, c11018);
        m42028(c6899.f23227, c8394, c11018);
        c11018.m27777();
        c11018.writeInt(C4451.m12403(size, c11018.size() - size, c11018.m27788()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42028(C15346 c15346, C8394 c8394, C11018 c11018) {
        c11018.writeInt(c15346.m36740());
        Iterator it = c15346.iterator();
        while (true) {
            C4055 c4055 = (C4055) it;
            if (!c4055.hasNext()) {
                return;
            }
            C23128 c23128 = (C23128) c4055.next();
            long j = c23128.f75116;
            C15346 c15347 = c23128.f75113;
            c11018.m27791(j);
            c11018.m27791(c23128.f75117);
            c11018.writeByte(c23128.f75115 == EnumC9226.USER ? 0 : 1);
            c11018.writeInt(c15347.m36740());
            Iterator it2 = c15347.iterator();
            while (true) {
                C4055 c4056 = (C4055) it2;
                if (c4056.hasNext()) {
                    C1463 c1463 = (C1463) c4056.next();
                    int i = c1463.f5964;
                    C8872 c8872 = c1463.f5959;
                    c11018.writeInt(i);
                    c11018.m27791(c1463.f5963);
                    c11018.m27791(c1463.f5965);
                    c11018.writeInt(c8872.m23016());
                    c11018.writeInt(c8872.m23014());
                    c8394.m22035(c1463.f5966);
                    c8394.m22035(c1463.f5961);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0139 A[Catch: all -> 0x0134, TRY_ENTER, TryCatch #1 {all -> 0x0134, blocks: (B:22:0x0072, B:24:0x00a1, B:26:0x00ab, B:28:0x00b5, B:30:0x00e0, B:34:0x00ee, B:35:0x00f3, B:36:0x00fa, B:37:0x010a, B:59:0x0139, B:60:0x013c, B:45:0x011e, B:46:0x0125, B:47:0x0126, B:48:0x012a, B:49:0x012b, B:50:0x012f), top: B:71:0x0072 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20990 m42027(C17367 c17367) {
        C6276 c6276;
        int iM40445 = c17367.m40445();
        if (c17367.available() < 12 || c17367.readInt() != 827544404) {
            throw m42025();
        }
        int i = c17367.readInt();
        if (i < 0 || i > c17367.available() - 4) {
            throw m42025();
        }
        byte[] bArr = new byte[i];
        c17367.m40446(i, bArr);
        if (c17367.readInt() != C4451.m12403(iM40445, i + 8, c17367.f55260)) {
            throw m42025();
        }
        C17367 c17368 = new C17367(bArr);
        long j = c17368.readLong();
        long j2 = c17368.readLong();
        int i2 = c17368.readInt();
        if (j < 0 || j2 < 0 || i2 < 0 || i2 > 8192 || i2 > c17368.available()) {
            throw m42025();
        }
        byte[] bArr2 = new byte[i2];
        c17368.m40446(i2, bArr2);
        C21571 c21571M48288 = C21571.m48288(null, bArr2);
        try {
            try {
                C18977 c18977 = new C18977(c17368);
                C14744 c14744M43677 = c18977.m43677();
                C8872 c8872 = new C8872(c17368.readInt(), c17368.readInt());
                long j3 = c17368.readLong();
                long j4 = c17368.readLong();
                long j5 = c17368.readLong();
                long j6 = c17368.readLong();
                int i3 = c17368.readByte() & 255;
                if (i3 > 1 || c8872.m23016() > c14744M43677.m35339() || c8872.m23014() > c14744M43677.m35339()) {
                    throw m42025();
                }
                HashSet hashSet = new HashSet();
                C15346 c15346M42026 = m42026(c17368, c18977, hashSet, j6, j4);
                C15346 c15346M42027 = m42026(c17368, c18977, hashSet, j6, j4);
                if (c17368.available() != 0) {
                    throw m42025();
                }
                C6899 c6899 = new C6899(c15346M42026, c15346M42027, j6, i3 == 1);
                try {
                    C22277.m49447(c6899, c14744M43677.m35339());
                    C21695 c21695 = new C21695(c6899, c8872, j3, j4, j5);
                    c6276 = new C6276(c14744M43677, j2);
                    try {
                        C20990 c20990 = new C20990(c6276, c21571M48288, c21695, C8996.f30769, j);
                        c21571M48288.close();
                        return c20990;
                    } catch (Error e) {
                        e = e;
                        if (c6276 != null) {
                            c6276.close();
                        }
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        if (c6276 != null) {
                            c6276.close();
                        }
                        throw e;
                    }
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Invalid session history", e3);
                }
            } catch (Throwable th) {
                c21571M48288.close();
                throw th;
            }
        } catch (Error | RuntimeException e4) {
            e = e4;
            c6276 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15346 m42026(C17367 c17367, C18977 c18977, HashSet hashSet, long j, long j2) {
        int i = c17367.readInt();
        if (i < 0 || i > c17367.available() / 21) {
            throw m42025();
        }
        C15346 c15346 = new C15346();
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = c17367.readLong();
            long j4 = c17367.readLong();
            int i3 = c17367.readByte() & 255;
            int i4 = c17367.readInt();
            if (j3 <= 0 || j3 >= j || !hashSet.add(Long.valueOf(j3)) || i3 > 1 || i4 <= 0 || i4 > c17367.available() / 52) {
                throw m42025();
            }
            C15346 c15347 = new C15346();
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = c17367.readInt();
                long j5 = c17367.readLong();
                long j6 = c17367.readLong();
                C8872 c8872 = new C8872(c17367.readInt(), c17367.readInt());
                if (j5 < 0 || j6 < 0 || j5 > j2 || j6 > j2) {
                    throw m42025();
                }
                c15347 = c15347.m36738(new C1463(i6, j5, j6, c8872, c18977.m43677(), c18977.m43677()));
            }
            c15346 = c15346.m36738(new C23128(j3, j4, i3 == 0 ? EnumC9226.USER : EnumC9226.BATCH, c15347));
        }
        return c15346;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m42025() {
        return new IllegalArgumentException("Invalid inline session state");
    }
}
