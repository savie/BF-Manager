package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 4778 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20222 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f65631;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f65632;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f65633;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f65634;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f65635;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m45717(long j, long j2) {
        for (int i = 0; i < 8; i++) {
            j = (j ^ ((long) (((int) (j2 >>> (i * 8))) & 255))) * 1099511628211L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m45719(String str) {
        Integer num;
        num = (Integer) this.f65631.get(str);
        return num == null ? 0 : this.f65633[num.intValue()] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m45720() {
        if (!this.f65635) {
            return;
        }
        AbstractC20745 abstractC20745M46690 = this.f65632.m46690(".axml_kind.bin.tmp");
        AbstractC20745 abstractC20745M46691 = this.f65632.m46690("axml_kind.bin");
        boolean z = false;
        try {
            try {
                this.f65632.m46739();
                abstractC20745M46690.mo24647();
                C11018 c11018 = new C11018(this.f65633.length + 16);
                c11018.writeInt(1296128067);
                c11018.writeInt(1);
                c11018.writeInt(this.f65633.length);
                c11018.m27791(this.f65634);
                c11018.m27794(this.f65633);
                abstractC20745M46690.m46697(c11018);
                abstractC20745M46691.mo24647();
                if (!abstractC20745M46690.mo24646(abstractC20745M46691)) {
                    throw new IOException("Failed to publish AXML kind cache");
                }
                this.f65635 = false;
                try {
                    C15157.m36345();
                } catch (IOException | RuntimeException unused) {
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        abstractC20745M46690.mo24647();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException | RuntimeException unused2) {
            abstractC20745M46690.mo24647();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m45721(String str, boolean z) {
        Integer num = (Integer) this.f65631.get(str);
        if (num == null) {
            return;
        }
        byte b = (byte) (z ? 2 : 1);
        if (this.f65633[num.intValue()] != b) {
            this.f65633[num.intValue()] = b;
            this.f65635 = true;
        }
    }

    public C20222(AbstractC20745 abstractC20745, long j, byte[] bArr, HashMap map) {
        this.f65632 = abstractC20745;
        this.f65634 = j;
        this.f65633 = bArr;
        this.f65631 = map;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15989 m45722() {
        return new C15989(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20222 m45718(AbstractC20745 abstractC20745, ArrayList arrayList) {
        int i;
        long jM45717 = m45717(-3750763034362895579L, arrayList.size());
        Iterator it = arrayList.iterator();
        long jM45718 = jM45717;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C9878 c9878 = (C9878) it.next();
            String str = c9878.f33725;
            long jM45719 = m45717(jM45718, str.length());
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                jM45719 = (((jM45719 ^ ((long) (cCharAt & 255))) * 1099511628211L) ^ ((long) (cCharAt >>> '\b'))) * 1099511628211L;
                i++;
            }
            Long l2 = c9878.f33726;
            jM45718 = m45717(jM45719, l2 == null ? Long.MIN_VALUE : l2.longValue());
        }
        HashMap map = new HashMap(arrayList.size() * 2);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            map.put(((C9878) arrayList.get(i2)).f33725, Integer.valueOf(i2));
        }
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("axml_kind.bin");
        int size = arrayList.size();
        byte[] bArr = null;
        if (abstractC20745M46690.mo33971()) {
            long j = size;
            if (abstractC20745M46690.mo33964() == 24 + j) {
                try {
                    C17367 c17367 = new C17367(abstractC20745M46690.m46727());
                    if (c17367.readInt() == 1296128067 && c17367.readInt() == 1 && c17367.readInt() == size && c17367.readLong() == jM45718 && c17367.readInt() == size && c17367.available() == j) {
                        byte[] bArr2 = new byte[size];
                        c17367.m40446(size, bArr2);
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
        return new C20222(abstractC20745, jM45718, bArr == null ? new byte[arrayList.size()] : bArr, map);
    }
}
