package l;

import android.os.Build;
import com.alipay.sdk.m.y.l;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16137 extends AbstractC17535 implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f52141;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f52142;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f52143;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f52144;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f52145;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f52146;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f52147;

    public C16137(String str, long j, long j2, long j3, boolean z, String str2, String str3) {
        this.f52146 = str;
        this.f52145 = j;
        this.f52141 = j2;
        this.f52142 = j3;
        this.f52147 = z;
        this.f52143 = str2;
        this.f52144 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16137)) {
            return false;
        }
        C16137 c16137 = (C16137) obj;
        return this.f52147 == c16137.f52147 && this.f52145 == c16137.f52145 && this.f52141 == c16137.f52141 && this.f52142 == c16137.f52142 && C13638.equals(this.f52146, c16137.f52146) && C13638.equals(this.f52143, c16137.f52143) && C13638.equals(this.f52144, c16137.f52144);
    }

    public final int hashCode() {
        int i = this.f52147 ? 1231 : 1237;
        long j = this.f52145;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f52141;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f52142;
        return C13638.hashCode(this.f52144) + C0589.m2789(C0589.m2789((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.f52146), 31, this.f52143);
    }

    public final long size() {
        return this.f52142;
    }

    public final String toString() {
        Object[] objArr = {this.f52146, Long.valueOf(this.f52145), Long.valueOf(this.f52141), Long.valueOf(this.f52142), Boolean.valueOf(this.f52147), this.f52143, this.f52144};
        String[] strArrSplit = "recycleName;moveTime;lastModified;size;isDir;originalPath;fileName".length() == 0 ? new String[0] : "recycleName;moveTime;lastModified;size;isDir;originalPath;fileName".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C16137.class, sb, "[");
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m38199() {
        return this.f52143;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m38200() {
        return this.f52147;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38201() {
        return this.f52144;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m38202() {
        return this.f52141;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m38204() {
        return this.f52146;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m38208() {
        return this.f52145;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16137 m38205(long j) {
        return new C16137(this.f52146, this.f52145, this.f52141, j, this.f52147, this.f52143, this.f52144);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m38203() {
        return C20370.m46020().m46690(this.f52146 + "/" + this.f52144);
    }

    public final boolean delete() {
        StringBuilder sb = new StringBuilder("$RECYCLE.BIN$/");
        String str = this.f52146;
        sb.append(str);
        AbstractC20745 abstractC20745M15313 = C5553.m15313(sb.toString(), new String[0]);
        C20370.f66032.getClass();
        abstractC20745M15313.mo24647();
        if (m38203().mo33975()) {
            return false;
        }
        C20370.m46020().m46690(".i/" + str).mo24647();
        ((ConcurrentMapC13783) C20370.f66035).remove(str);
        C20370.f66032.getClass();
        abstractC20745M15313.mo24647();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m38206() {
        String str = this.f52146;
        String strM46014 = C20370.m46014();
        String str2 = this.f52143;
        if (C5553.m15319(str2, strM46014)) {
            return false;
        }
        C11018 c11018M43576 = C18917.m43576(541279570);
        c11018M43576.m27791(this.f52145);
        c11018M43576.m27791(this.f52141);
        c11018M43576.m27791(this.f52142);
        c11018M43576.m27786(str2);
        try {
            C20370.m46020().m46690(".i/" + str).m46697(c11018M43576);
            ((ConcurrentMapC13783) C20370.f66035).put(str, this);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m38207() throws IOException {
        C14042 c14042;
        AbstractC20745 abstractC20745M38203 = m38203();
        AbstractC20745 abstractC20745 = C11904.f39934;
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(this.f52143);
        if (Build.VERSION.SDK_INT >= 30 && (abstractC20745M46690 instanceof C17196) && C19812.m45045().mo43871() && abstractC20745M38203.mo33986().startsWith(abstractC20745.mo33986())) {
            C14042 c14042M40125 = abstractC20745M46690.mo40129().m40125();
            C13638.requireNonNull(c14042M40125);
            c14042 = c14042M40125;
            abstractC20745M38203 = new C14042(new File("/data/media/" + abstractC20745.getName() + abstractC20745M38203.mo33986().substring(abstractC20745.mo33986().length())), false);
        } else {
            c14042 = abstractC20745M46690;
        }
        AbstractC20745 abstractC20745M46693 = c14042.m46693(true);
        if (!abstractC20745M46690.getName().equals(abstractC20745M46693.getName())) {
            abstractC20745M46690 = abstractC20745M46690.m46706(abstractC20745M46693.getName());
        }
        abstractC20745M46693.mo46720();
        abstractC20745M38203.m46699(abstractC20745M46693, (Runnable) null);
        delete();
        abstractC20745M46693.mo32855(this.f52141);
        return abstractC20745M46690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16137 m38197(AbstractC20745 abstractC20745) {
        String name = abstractC20745.getName();
        C16137 c16137 = (C16137) ((ConcurrentMapC13783) C20370.f66035).get(name);
        if (c16137 != null) {
            if (c16137.m38203().mo33975()) {
                return c16137;
            }
            abstractC20745.mo24647();
            ((ConcurrentMapC13783) C20370.f66035).remove(name);
            return null;
        }
        try {
            C17367 c17367M46713 = abstractC20745.m46713();
            C20190.m45649((InterfaceC0433) c17367M46713, 541279570);
            long j = c17367M46713.readLong();
            long j2 = c17367M46713.readLong();
            long j3 = c17367M46713.readLong();
            String strM40458 = c17367M46713.m40458();
            String strM38194 = m38194(strM40458);
            AbstractC20745 abstractC20745M46690 = C20370.m46020().m46690(name + "/" + strM38194);
            if (!abstractC20745M46690.mo33975()) {
                abstractC20745.mo24647();
                return null;
            }
            C16137 c16138 = new C16137(name, j, j2, j3, abstractC20745M46690.mo33974(), strM40458, strM38194);
            ((ConcurrentMapC13783) C20370.f66035).put(name, c16138);
            return c16138;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a A[LOOP:0: B:9:0x0023->B:25:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16137 m38196(C15432 c15432, InterfaceC5614 interfaceC5614) {
        long j;
        String str;
        String upperCase;
        File file = c15432.f50294;
        String strM15306 = C5553.m15306(c15432.mo33986());
        if (strM15306 == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLastModified = file.lastModified();
        long jM46691 = c15432.m46691(interfaceC5614);
        if (interfaceC5614.mo2357()) {
            return null;
        }
        while (true) {
            long jNextLong = C20370.f66033.nextLong();
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
                        jM46691 = jM46691;
                    }
                    j = jM46691;
                    str = new String(cArr, i, 64 - i);
                }
                upperCase = str.toUpperCase();
                if (!((ConcurrentMapC13783) C20370.f66035).containsKey(upperCase)) {
                    return new C16137(upperCase, jCurrentTimeMillis, jLastModified, j, file.isDirectory(), strM15306, m38194(strM15306));
                }
                jM46691 = j;
            }
            j = jM46691;
            upperCase = str.toUpperCase();
            if (!((ConcurrentMapC13783) C20370.f66035).containsKey(upperCase)) {
                return new C16137(upperCase, jCurrentTimeMillis, jLastModified, j, file.isDirectory(), strM15306, m38194(strM15306));
            }
            jM46691 = j;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38194(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C20630.m46498(1, 0, str);
        }
        if (str.isEmpty() || str.equals("/")) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }
}
