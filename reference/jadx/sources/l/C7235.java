package l;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.۟ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6PV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7235 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14641 f24092;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f24093;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5697 f24094;

    public C7235(long j, C5697 c5697, C14641 c14641) {
        if (j < -1) {
            throw new IllegalArgumentException("Invalid saved text mark");
        }
        this.f24093 = j;
        this.f24094 = c5697;
        this.f24092 = c14641;
        if (c14641 != null && c5697 != null && !c14641.m35153().equals(c5697.m15721())) {
            throw new IllegalStateException("Editor state and migration belong to different sessions");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7235 m19277(byte[] bArr, Long l2) {
        C5697 c5697;
        C14641 c14641M35147 = null;
        if (bArr.length == 0 || (bArr.length >= 4 && new C17367(bArr).readInt() == 844322373)) {
            c5697 = null;
        } else {
            try {
                C5697 c5697M15715 = C5697.m15715(bArr);
                c5697 = c5697M15715;
                bArr = c5697M15715.m15720();
            } catch (IOException e) {
                throw new IllegalStateException("Invalid editor session metadata", e);
            }
        }
        if (bArr.length == 0) {
            if (l2 == null) {
                throw new IllegalStateException("Editor saved mark has not been initialized");
            }
            return new C7235(l2.longValue(), c5697, null);
        }
        if (bArr.length != 16 && bArr.length != 100) {
            throw new IllegalStateException("Invalid editor saved state length");
        }
        C17367 c17367 = new C17367(bArr);
        if (c17367.readInt() != 844322373) {
            throw new IllegalStateException("Unsupported editor saved state");
        }
        int i = c17367.readInt();
        if (i != (bArr.length == 16 ? 1 : 2)) {
            throw new IllegalStateException("Unsupported editor saved state");
        }
        long j = c17367.readLong();
        if (j < -1) {
            throw new IllegalStateException("Invalid editor saved mark");
        }
        if (l2 != null && l2.longValue() != j) {
            throw new IllegalStateException("Editor saved mark is already initialized");
        }
        if (i == 2) {
            try {
                byte[] bArr2 = new byte[84];
                c17367.m40446(84, bArr2);
                c14641M35147 = C14641.m35147(bArr2);
            } catch (IOException e2) {
                throw new IllegalStateException("Invalid editor recovery attachment", e2);
            }
        }
        return new C7235(j, c5697, c14641M35147);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m19282(long j) {
        if (j < -1) {
            throw new IllegalArgumentException("Invalid saved text mark");
        }
        C14641 c14641 = this.f24092;
        C11018 c11018 = new C11018(c14641 == null ? 16 : 100);
        c11018.writeInt(844322373);
        c11018.writeInt(c14641 == null ? 1 : 2);
        c11018.m27791(j);
        if (c14641 != null) {
            c11018.write(c14641.m35152());
        }
        byte[] bArrM27773 = c11018.m27773();
        C5697 c5697 = this.f24094;
        return c5697 == null ? bArrM27773 : c5697.m15719(bArrM27773);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m19279(byte[] bArr, C14641 c14641, UUID uuid) {
        C7235 c7235M19277 = m19277(bArr, (Long) null);
        long j = c7235M19277.f24093;
        c7235M19277.m19281(uuid);
        if (!c14641.m35153().equals(uuid)) {
            throw new IllegalStateException("Editor recovery attachment belongs to another session");
        }
        return new C7235(j, c7235M19277.f24094, c14641).m19282(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r0.m15720().length == 0) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C14641 m19278(java.util.UUID r3, byte[] r4) {
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
            l.ܿ۬ۨ r0 = new l.ܿ۬ۨ
            r0.<init>(r4)
            int r0 = r0.readInt()
            r2 = 844322373(0x32535645, float:1.2301432E-8)
            if (r0 == r2) goto L40
            l.ۛ֡ۖ r0 = l.C5697.m15715(r4)     // Catch: java.io.IOException -> L37
            java.util.UUID r2 = r0.m15721()     // Catch: java.io.IOException -> L37
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L37
            if (r2 == 0) goto L2f
            byte[] r0 = r0.m15720()     // Catch: java.io.IOException -> L37
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
            l.۟ۙۚ r4 = m19277(r4, r1)
            r4.m19281(r3)
            l.ܳܽۖ r3 = r4.f24092
            return r3
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Editor recovery session identity is missing"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7235.m19278(java.util.UUID, byte[]):l.ܳܽۖ");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m19280(UUID uuid, byte[] bArr) {
        m19277(bArr, (Long) null).m19281(uuid);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19281(UUID uuid) {
        C5697 c5697;
        C14641 c14641;
        if (uuid == null || !(((c5697 = this.f24094) == null || c5697.m15721().equals(uuid)) && ((c14641 = this.f24092) == null || c14641.m35153().equals(uuid)))) {
            throw new IllegalStateException("Editor recovery metadata belongs to another session");
        }
    }
}
