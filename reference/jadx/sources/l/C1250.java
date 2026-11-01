package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N7SN */
/* JADX INFO: loaded from: classes2.dex */
public final class C1250 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f5427;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f5428;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f5429;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f5430;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f5431;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f5432;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC23124 f5433;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f5434;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f5435;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC6895 f5436;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f5437;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f5438;

    public C1250(String str, EnumC23124 enumC23124, boolean z, boolean z2, long j, long j2, long j3, long j4, EnumC6895 enumC6895, String str2, boolean z3, boolean z4) {
        this.f5429 = str;
        this.f5433 = enumC23124;
        this.f5438 = z;
        this.f5430 = z2;
        this.f5427 = j;
        this.f5431 = j2;
        this.f5434 = j3;
        this.f5437 = j4;
        this.f5436 = enumC6895;
        this.f5435 = str2;
        this.f5428 = z3;
        this.f5432 = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1250)) {
            return false;
        }
        C1250 c1250 = (C1250) obj;
        return this.f5438 == c1250.f5438 && this.f5430 == c1250.f5430 && this.f5428 == c1250.f5428 && this.f5432 == c1250.f5432 && this.f5427 == c1250.f5427 && this.f5431 == c1250.f5431 && this.f5434 == c1250.f5434 && this.f5437 == c1250.f5437 && C13638.equals(this.f5429, c1250.f5429) && C13638.equals(this.f5433, c1250.f5433) && C13638.equals(this.f5436, c1250.f5436) && C13638.equals(this.f5435, c1250.f5435);
    }

    public final int hashCode() {
        int i = (((((this.f5438 ? 1231 : 1237) * 31) + (this.f5430 ? 1231 : 1237)) * 31) + (this.f5428 ? 1231 : 1237)) * 31;
        int i2 = this.f5432 ? 1231 : 1237;
        long j = this.f5427;
        int i3 = (((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f5431;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f5434;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f5437;
        return C13638.hashCode(this.f5435) + ((C13638.hashCode(this.f5436) + ((C13638.hashCode(this.f5433) + C0589.m2789((i5 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.f5429)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5429, this.f5433, Boolean.valueOf(this.f5438), Boolean.valueOf(this.f5430), Long.valueOf(this.f5427), Long.valueOf(this.f5431), Long.valueOf(this.f5434), Long.valueOf(this.f5437), this.f5436, this.f5435, Boolean.valueOf(this.f5428), Boolean.valueOf(this.f5432)};
        String[] strArrSplit = "pattern;filenameMode;searchSub;advance;minSize;maxSize;minTime;maxTime;timePreset;content;matchCase;regex".length() == 0 ? new String[0] : "pattern;filenameMode;searchSub;advance;minSize;maxSize;minTime;maxTime;timePreset;content;matchCase;regex".split(l.b);
        StringBuilder sb = new StringBuilder("FileSearchInputRecord[");
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
    public final boolean m4469() {
        return this.f5428;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m4470() {
        return this.f5435;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4471() {
        return this.f5430;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m4473() {
        return this.f5429;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m4475() {
        return this.f5431;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC6895 m4476() {
        return this.f5436;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m4477() {
        return this.f5427;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m4478() {
        return this.f5434;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m4479() {
        return this.f5432;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m4480() {
        return this.f5438;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m4481() {
        return this.f5437;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC23124 m4482() {
        return this.f5433;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m4467(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        C17367 c17367 = new C17367(bArr);
        try {
            int i2 = c17367.readByte() & 255;
            if (i2 > 100) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    break;
                }
                String strM40458 = c17367.m40458();
                String strM40459 = c17367.m40458();
                byte b = c17367.readByte();
                int i5 = b & 255;
                boolean z = (b & 1) != 0;
                boolean z2 = (b & 2) != 0;
                boolean z3 = (b & 4) != 0;
                boolean z4 = (b & 8) != 0;
                boolean z5 = (b & 16) != 0;
                EnumC23124 enumC23124M51123 = EnumC23124.m51123((i5 >> 5) & 7);
                long j = z ? c17367.readLong() : -1L;
                long j2 = z ? c17367.readLong() : -1L;
                if (j >= 0 && j == j2 && j2 != C17492.FOREVER_NS) {
                    j2++;
                }
                arrayList.add(new C1250(strM40458, enumC23124M51123, z2, z3, j, j2, -1L, -1L, null, strM40459, z4, z5));
                i4++;
            }
            if (c17367.available() != 0) {
                try {
                    if (c17367.available() >= 6 && c17367.readInt() == 1179866194) {
                        int i6 = c17367.readByte() & 255;
                        int i7 = c17367.readByte() & 255;
                        if ((i6 == 1 || i6 == 2) && i7 == arrayList.size()) {
                            if (c17367.available() == ((long) i7) * (i6 == 1 ? 16L : 17L)) {
                                long[] jArr = new long[i7];
                                long[] jArr2 = new long[i7];
                                EnumC6895[] enumC6895Arr = new EnumC6895[i7];
                                while (i < i7) {
                                    jArr[i] = c17367.readLong();
                                    jArr2[i] = c17367.readLong();
                                    if (i6 >= 2) {
                                        enumC6895Arr[i] = EnumC6895.m18504(c17367.readByte() & 255);
                                    }
                                    long j3 = jArr[i];
                                    long j4 = jArr2[i];
                                    i = (j3 >= -1 && j4 >= -1 && (j3 == -1 || j4 == -1 || j3 < j4)) ? i + 1 : 0;
                                }
                                ArrayList arrayList2 = new ArrayList(i7);
                                while (i3 < i7) {
                                    C1250 c1250 = (C1250) arrayList.get(i3);
                                    long[] jArr3 = jArr2;
                                    EnumC6895[] enumC6895Arr2 = enumC6895Arr;
                                    int i8 = i7;
                                    arrayList2.add(new C1250(c1250.f5429, c1250.f5433, c1250.f5438, c1250.f5430, c1250.f5427, c1250.f5431, jArr[i3], jArr2[i3], enumC6895Arr[i3], c1250.f5435, c1250.f5428, c1250.f5432));
                                    i3++;
                                    jArr2 = jArr3;
                                    enumC6895Arr = enumC6895Arr2;
                                    i7 = i8;
                                }
                                return arrayList2;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
            return arrayList;
        } catch (RuntimeException unused2) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m4466(List list) {
        if (list.size() > 100) {
            throw new IllegalArgumentException("Too many file search records");
        }
        C11018 c11018 = new C11018();
        c11018.writeByte(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1250 c1250 = (C1250) it.next();
            long j = c1250.f5431;
            c11018.m27786(c1250.f5429);
            c11018.m27786(c1250.f5435);
            int iM51125 = c1250.f5433.m51125() << 5;
            long j2 = c1250.f5427;
            if (j2 != -1 || j != -1) {
                iM51125 |= 1;
            }
            if (c1250.f5438) {
                iM51125 |= 2;
            }
            if (c1250.f5430) {
                iM51125 |= 4;
            }
            if (c1250.f5428) {
                iM51125 |= 8;
            }
            if (c1250.f5432) {
                iM51125 |= 16;
            }
            c11018.writeByte(iM51125);
            if (j2 != -1 || j != -1) {
                c11018.m27791(j2);
                c11018.m27791(j);
            }
        }
        c11018.writeInt(1179866194);
        c11018.writeByte(2);
        c11018.writeByte(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1250 c1251 = (C1250) it2.next();
            c11018.m27791(c1251.f5434);
            c11018.m27791(c1251.f5437);
            EnumC6895 enumC6895 = c1251.f5436;
            c11018.writeByte(enumC6895 == null ? 0 : enumC6895.m18508());
        }
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4472(C1250 c1250) {
        boolean zM4468;
        String str = c1250.f5429;
        String str2 = this.f5429;
        if (!str2.equals(str)) {
            return false;
        }
        if ((!str2.isEmpty() && this.f5433 != c1250.f5433) || this.f5438 != c1250.f5438 || (zM4468 = m4468()) != c1250.m4468()) {
            return false;
        }
        if (!zM4468) {
            return true;
        }
        if (this.f5427 != c1250.f5427 || this.f5431 != c1250.f5431) {
            return false;
        }
        EnumC6895 enumC6895 = c1250.f5436;
        EnumC6895 enumC6896 = this.f5436;
        if (enumC6896 != enumC6895) {
            return false;
        }
        if (enumC6896 == null && (this.f5434 != c1250.f5434 || this.f5437 != c1250.f5437)) {
            return false;
        }
        String str3 = c1250.f5435;
        String str4 = this.f5435;
        if (!str4.equals(str3)) {
            return false;
        }
        if (str4.isEmpty()) {
            return true;
        }
        return this.f5428 == c1250.f5428 && this.f5432 == c1250.f5432;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private boolean m4468() {
        if (this.f5430) {
            return (this.f5427 == -1 && this.f5431 == -1 && this.f5436 == null && this.f5434 == -1 && this.f5437 == -1 && this.f5435.isEmpty()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m4474() {
        String str = this.f5429;
        String strReplace = str.replace('\n', ' ');
        if (strReplace.isEmpty()) {
            strReplace = C16737.m39288(R.string.MT_Protector);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strReplace);
        int length = spannableStringBuilder.length();
        if (!str.isEmpty()) {
            spannableStringBuilder.append((CharSequence) " [").append((CharSequence) C16737.m39288(this.f5433.m51124())).append((CharSequence) "]");
        }
        if (this.f5430) {
            long j = this.f5431;
            long j2 = this.f5427;
            if (j2 != -1 || j != -1) {
                spannableStringBuilder.append('\n').append((CharSequence) C16737.m39288(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) EnumC4072.m11602(j2, j));
            }
            long j3 = this.f5437;
            long j4 = this.f5434;
            EnumC6895 enumC6895 = this.f5436;
            if (enumC6895 != null || j4 != -1 || j3 != -1) {
                spannableStringBuilder.append('\n').append((CharSequence) C16737.m39288(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) (enumC6895 == null ? EnumC6895.m18503(j4, j3) : enumC6895.m18506()));
            }
            String str2 = this.f5435;
            if (!str2.isEmpty()) {
                spannableStringBuilder.append('\n').append((CharSequence) C16737.m39288(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) C13012.m32189(50, str2).replace('\n', ' '));
            }
        }
        if (length < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f65988), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
