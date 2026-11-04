package l;

import android.os.Build;
import com.alipay.sdk.m.y.l;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩸ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes.dex */
public final class C22616 extends AbstractC2323 implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f73076;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f73077;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f73078;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f73079;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f73080;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f73081;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f73082;

    public C22616(String str, long j, long j2, long j3, boolean z, String str2, String str3) {
        this.f73081 = str;
        this.f73076 = j;
        this.f73080 = j2;
        this.f73078 = j3;
        this.f73082 = z;
        this.f73077 = str2;
        this.f73079 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22616)) {
            return false;
        }
        C22616 c22616 = (C22616) obj;
        return this.f73082 == c22616.f73082 && this.f73076 == c22616.f73076 && this.f73080 == c22616.f73080 && this.f73078 == c22616.f73078 && C17359.equals(this.f73081, c22616.f73081) && C17359.equals(this.f73077, c22616.f73077) && C17359.equals(this.f73079, c22616.f73079);
    }

    public final int hashCode() {
        int i = this.f73082 ? 1231 : 1237;
        long j = this.f73076;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f73080;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f73078;
        return C17359.hashCode(this.f73079) + C24966.m55771(C24966.m55771((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.f73081), 31, this.f73077);
    }

    public final long size() {
        return this.f73078;
    }

    public final String toString() {
        Object[] objArr = {this.f73081, Long.valueOf(this.f73076), Long.valueOf(this.f73080), Long.valueOf(this.f73078), Boolean.valueOf(this.f73082), this.f73077, this.f73079};
        String[] strArrSplit = "recycleName;moveTime;lastModified;size;isDir;originalPath;fileName".length() == 0 ? new String[0] : "recycleName;moveTime;lastModified;size;isDir;originalPath;fileName".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C22616.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50956() {
        return this.f73079;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m50957() {
        return this.f73081;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m50958() {
        return this.f73082;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m50959() {
        return this.f73080;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m50960() {
        return this.f73077;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m50961() {
        return this.f73076;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22616 m50965(long j) {
        return new C22616(this.f73081, this.f73076, this.f73080, j, this.f73082, this.f73077, this.f73079);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m50964() {
        return C19632.m45282().m49876(this.f73081 + "/" + this.f73079);
    }

    public final boolean delete() {
        StringBuilder sb = new StringBuilder("$RECYCLE.BIN$/");
        String str = this.f73081;
        sb.append(str);
        AbstractC22044 abstractC22044M35193 = C14584.m35193(sb.toString(), new String[0]);
        C19632.f63254.getClass();
        abstractC22044M35193.mo4296();
        if (m50964().mo2934()) {
            return false;
        }
        C19632.m45282().m49876(".i/" + str).mo4296();
        ((ConcurrentMapC17249) C19632.f63255).remove(str);
        C19632.f63254.getClass();
        abstractC22044M35193.mo4296();
        return true;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m50962() {
        String str = this.f73081;
        String strM45284 = C19632.m45284();
        String str2 = this.f73077;
        if (C14584.m35198(str2, strM45284)) {
            return false;
        }
        C6178 c6178M34975 = C14483.m34975(541279570);
        c6178M34975.m17803(this.f73076);
        c6178M34975.m17803(this.f73080);
        c6178M34975.m17803(this.f73078);
        c6178M34975.m17800(str2);
        try {
            C19632.m45282().m49876(".i/" + str).m49844(c6178M34975);
            ((ConcurrentMapC17249) C19632.f63255).put(str, this);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m50963() throws IOException {
        C7302 c7302;
        AbstractC22044 abstractC22044M50964 = m50964();
        AbstractC22044 abstractC22044 = C6382.f21566;
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(this.f73077);
        if (Build.VERSION.SDK_INT >= 30 && (abstractC22044M49876 instanceof C18379) && C4013.m12986().mo29539() && abstractC22044M50964.mo4294().startsWith(abstractC22044.mo4294())) {
            C7302 c7302M42889 = abstractC22044M49876.mo42890().m42889();
            C17359.requireNonNull(c7302M42889);
            c7302 = c7302M42889;
            abstractC22044M50964 = new C7302(new File("/data/media/" + abstractC22044.getName() + abstractC22044M50964.mo4294().substring(abstractC22044.mo4294().length())), false);
        } else {
            c7302 = abstractC22044M49876;
        }
        AbstractC22044 abstractC22044M49839 = c7302.m49839(true);
        if (!abstractC22044M49876.getName().equals(abstractC22044M49839.getName())) {
            abstractC22044M49876 = abstractC22044M49876.m49868(abstractC22044M49839.getName());
        }
        abstractC22044M49839.mo49834();
        abstractC22044M50964.m49845(abstractC22044M49839, (Runnable) null);
        delete();
        abstractC22044M49839.mo2942(this.f73080);
        return abstractC22044M49876;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22616 m50954(AbstractC22044 abstractC22044) {
        String name = abstractC22044.getName();
        C22616 c22616 = (C22616) ((ConcurrentMapC17249) C19632.f63255).get(name);
        if (c22616 != null) {
            if (c22616.m50964().mo2934()) {
                return c22616;
            }
            abstractC22044.mo4296();
            ((ConcurrentMapC17249) C19632.f63255).remove(name);
            return null;
        }
        try {
            C20348 c20348M49835 = abstractC22044.m49835();
            C17364.m40795((InterfaceC15872) c20348M49835, 541279570);
            long j = c20348M49835.readLong();
            long j2 = c20348M49835.readLong();
            long j3 = c20348M49835.readLong();
            String strM46758 = c20348M49835.m46758();
            String strM50951 = m50951(strM46758);
            AbstractC22044 abstractC22044M49876 = C19632.m45282().m49876(name + "/" + strM50951);
            if (!abstractC22044M49876.mo2934()) {
                abstractC22044.mo4296();
                return null;
            }
            C22616 c22617 = new C22616(name, j, j2, j3, abstractC22044M49876.mo4281(), strM46758, strM50951);
            ((ConcurrentMapC17249) C19632.f63255).put(name, c22617);
            return c22617;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a A[LOOP:0: B:9:0x0023->B:25:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22616 m50953(C1161 c1161, InterfaceC7509 interfaceC7509) {
        long j;
        String str;
        String upperCase;
        File file = c1161.f4288;
        String strM35186 = C14584.m35186(c1161.mo4294());
        if (strM35186 == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLastModified = file.lastModified();
        long jM49837 = c1161.m49837(interfaceC7509);
        if (interfaceC7509.mo924()) {
            return null;
        }
        while (true) {
            long jNextLong = C19632.f63251.nextLong();
            if (jNextLong == 0) {
                str = "0";
            } else {
                if (jNextLong > 0) {
                    str = Long.toString(jNextLong, 36);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (jNextLong >>> 1) / ((long) 18);
                    long j3 = 36;
                    int i = 63;
                    cArr[63] = Character.forDigit((int) (jNextLong - (j2 * j3)), 36);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 36);
                        j2 /= j3;
                        jM49837 = jM49837;
                    }
                    j = jM49837;
                    str = new String(cArr, i, 64 - i);
                }
                upperCase = str.toUpperCase();
                if (!((ConcurrentMapC17249) C19632.f63255).containsKey(upperCase)) {
                    return new C22616(upperCase, jCurrentTimeMillis, jLastModified, j, file.isDirectory(), strM35186, m50951(strM35186));
                }
                jM49837 = j;
            }
            j = jM49837;
            upperCase = str.toUpperCase();
            if (!((ConcurrentMapC17249) C19632.f63255).containsKey(upperCase)) {
                return new C22616(upperCase, jCurrentTimeMillis, jLastModified, j, file.isDirectory(), strM35186, m50951(strM35186));
            }
            jM49837 = j;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50951(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C1402.m5124(1, 0, str);
        }
        if (str.isEmpty() || str.equals("/")) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }
}
