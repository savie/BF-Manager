package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4778 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8630 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f28195;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f28196;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f28197;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f28198;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f28199;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m23258(long j, long j2) {
        for (int i = 0; i < 8; i++) {
            j = (j ^ ((long) (((int) (j2 >>> (i * 8))) & 255))) * 1099511628211L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m23260(String str) {
        Integer num;
        num = (Integer) this.f28199.get(str);
        return num == null ? 0 : this.f28197[num.intValue()] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m23261() {
        if (!this.f28198) {
            return;
        }
        AbstractC22044 abstractC22044M49876 = this.f28195.m49876(".axml_kind.bin.tmp");
        AbstractC22044 abstractC22044M49877 = this.f28195.m49876("axml_kind.bin");
        boolean z = false;
        try {
            try {
                this.f28195.m49853();
                abstractC22044M49876.mo4296();
                C6178 c6178 = new C6178(this.f28197.length + 16);
                c6178.writeInt(1296128067);
                c6178.writeInt(1);
                c6178.writeInt(this.f28197.length);
                c6178.m17803(this.f28196);
                c6178.m17806(this.f28197);
                abstractC22044M49876.m49844(c6178);
                abstractC22044M49877.mo4296();
                if (!abstractC22044M49876.mo4301(abstractC22044M49877)) {
                    throw new IOException("Failed to publish AXML kind cache");
                }
                this.f28198 = false;
                try {
                    C22099.m50062();
                } catch (IOException | RuntimeException unused) {
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        abstractC22044M49876.mo4296();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException | RuntimeException unused2) {
            abstractC22044M49876.mo4296();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m23262(String str, boolean z) {
        Integer num = (Integer) this.f28199.get(str);
        if (num == null) {
            return;
        }
        byte b = (byte) (z ? 2 : 1);
        if (this.f28197[num.intValue()] != b) {
            this.f28197[num.intValue()] = b;
            this.f28198 = true;
        }
    }

    public C8630(AbstractC22044 abstractC22044, long j, byte[] bArr, HashMap map) {
        this.f28195 = abstractC22044;
        this.f28196 = j;
        this.f28197 = bArr;
        this.f28199 = map;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2664 m23263() {
        return new C2664(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8630 m23259(AbstractC22044 abstractC22044, ArrayList arrayList) {
        int i;
        long jM23258 = m23258(-3750763034362895579L, arrayList.size());
        Iterator it = arrayList.iterator();
        long jM23259 = jM23258;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C19291 c19291 = (C19291) it.next();
            String str = c19291.f62362;
            long jM232510 = m23258(jM23259, str.length());
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                jM232510 = (((jM232510 ^ ((long) (cCharAt & 255))) * 1099511628211L) ^ ((long) (cCharAt >>> '\b'))) * 1099511628211L;
                i++;
            }
            Long l2 = c19291.f62363;
            jM23259 = m23258(jM232510, l2 == null ? Long.MIN_VALUE : l2.longValue());
        }
        HashMap map = new HashMap(arrayList.size() * 2);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            map.put(((C19291) arrayList.get(i2)).f62362, Integer.valueOf(i2));
        }
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("axml_kind.bin");
        int size = arrayList.size();
        byte[] bArr = null;
        if (abstractC22044M49876.mo4304()) {
            long j = size;
            if (abstractC22044M49876.mo4285() == 24 + j) {
                try {
                    C20348 c20348 = new C20348(abstractC22044M49876.m49865());
                    if (c20348.readInt() == 1296128067 && c20348.readInt() == 1 && c20348.readInt() == size && c20348.readLong() == jM23259 && c20348.readInt() == size && c20348.available() == j) {
                        byte[] bArr2 = new byte[size];
                        c20348.m46745(size, bArr2);
                        while (true) {
                            if (i >= size) {
                                bArr = bArr2;
                                break;
                            }
                            byte b = bArr2[i];
                            if (b != 0 && b != 1 && b != 2) {
                                break;
                            }
                            i++;
                        }
                    }
                } catch (IOException | RuntimeException unused) {
                }
            }
        }
        return new C8630(abstractC22044, jM23259, bArr == null ? new byte[arrayList.size()] : bArr, map);
    }
}
