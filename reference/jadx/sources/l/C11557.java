package l;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۧۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6PV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11557 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5090 f36341;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f36342;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6781 f36343;

    public C11557(long j, C6781 c6781, C5090 c5090) {
        if (j < -1) {
            throw new IllegalArgumentException("Invalid saved text mark");
        }
        this.f36342 = j;
        this.f36343 = c6781;
        this.f36341 = c5090;
        if (c5090 != null && c6781 != null && !c5090.m15396().equals(c6781.m18906())) {
            throw new IllegalStateException("Editor state and migration belong to different sessions");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11557 m29073(byte[] bArr, Long l2) {
        C6781 c6781;
        C5090 c5090M15387 = null;
        if (bArr.length == 0 || (bArr.length >= 4 && new C20348(bArr).readInt() == 844322373)) {
            c6781 = null;
        } else {
            try {
                C6781 c6781M18902 = C6781.m18902(bArr);
                c6781 = c6781M18902;
                bArr = c6781M18902.m18907();
            } catch (IOException e) {
                throw new IllegalStateException("Invalid editor session metadata", e);
            }
        }
        if (bArr.length == 0) {
            if (l2 == null) {
                throw new IllegalStateException("Editor saved mark has not been initialized");
            }
            return new C11557(l2.longValue(), c6781, null);
        }
        if (bArr.length != 16 && bArr.length != 100) {
            throw new IllegalStateException("Invalid editor saved state length");
        }
        C20348 c20348 = new C20348(bArr);
        if (c20348.readInt() != 844322373) {
            throw new IllegalStateException("Unsupported editor saved state");
        }
        int i = c20348.readInt();
        if (i != (bArr.length == 16 ? 1 : 2)) {
            throw new IllegalStateException("Unsupported editor saved state");
        }
        long j = c20348.readLong();
        if (j < -1) {
            throw new IllegalStateException("Invalid editor saved mark");
        }
        if (l2 != null && l2.longValue() != j) {
            throw new IllegalStateException("Editor saved mark is already initialized");
        }
        if (i == 2) {
            try {
                byte[] bArr2 = new byte[84];
                c20348.m46745(84, bArr2);
                c5090M15387 = C5090.m15387(bArr2);
            } catch (IOException e2) {
                throw new IllegalStateException("Invalid editor recovery attachment", e2);
            }
        }
        return new C11557(j, c6781, c5090M15387);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m29077(long j) {
        if (j < -1) {
            throw new IllegalArgumentException("Invalid saved text mark");
        }
        C5090 c5090 = this.f36341;
        C6178 c6178 = new C6178(c5090 == null ? 16 : 100);
        c6178.writeInt(844322373);
        c6178.writeInt(c5090 == null ? 1 : 2);
        c6178.m17803(j);
        if (c5090 != null) {
            c6178.write(c5090.m15395());
        }
        byte[] bArrM17796 = c6178.m17796();
        C6781 c6781 = this.f36343;
        return c6781 == null ? bArrM17796 : c6781.m18905(bArrM17796);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m29074(byte[] bArr, C5090 c5090, UUID uuid) {
        C11557 c11557M29073 = m29073(bArr, (Long) null);
        long j = c11557M29073.f36342;
        c11557M29073.m29076(uuid);
        if (!c5090.m15396().equals(uuid)) {
            throw new IllegalStateException("Editor recovery attachment belongs to another session");
        }
        return new C11557(j, c11557M29073.f36343, c5090).m29077(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r0.m18907().length == 0) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5090 m29072(java.util.UUID r3, byte[] r4) {
        /*
            if (r3 == 0) goto L4a
            int r0 = r4.length
            r1 = 0
            if (r0 != 0) goto L7
            goto L2e
        L7:
            int r0 = r4.length
            r2 = 4
            if (r0 < r2) goto L40
            l.᩵ۚۤ r0 = new l.᩵ۚۤ
            r0.<init>(r4)
            int r0 = r0.readInt()
            r2 = 844322373(0x32535645, float:1.2301432E-8)
            if (r0 == r2) goto L40
            l.ۜ֡᩸ r0 = l.C6781.m18902(r4)     // Catch: java.io.IOException -> L37
            java.util.UUID r2 = r0.m18906()     // Catch: java.io.IOException -> L37
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L37
            if (r2 == 0) goto L2f
            byte[] r0 = r0.m18907()     // Catch: java.io.IOException -> L37
            int r0 = r0.length     // Catch: java.io.IOException -> L37
            if (r0 != 0) goto L40
        L2e:
            return r1
        L2f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L37
            java.lang.String r4 = "Editor migration belongs to another session"
            r3.<init>(r4)     // Catch: java.io.IOException -> L37
            throw r3     // Catch: java.io.IOException -> L37
        L37:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid editor migration metadata"
            r4.<init>(r0, r3)
            throw r4
        L40:
            l.ۧۤᩴ r4 = m29073(r4, r1)
            r4.m29076(r3)
            l.ۙᩳ᩸ r3 = r4.f36341
            return r3
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Editor recovery session identity is missing"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11557.m29072(java.util.UUID, byte[]):l.ۙᩳ᩸");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m29075(UUID uuid, byte[] bArr) {
        m29073(bArr, (Long) null).m29076(uuid);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29076(UUID uuid) {
        C6781 c6781;
        C5090 c5090;
        if (uuid == null || !(((c6781 = this.f36343) == null || c6781.m18906().equals(uuid)) && ((c5090 = this.f36341) == null || c5090.m15396().equals(uuid)))) {
            throw new IllegalStateException("Editor recovery metadata belongs to another session");
        }
    }
}
