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

/* JADX INFO: renamed from: l.ۚ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7SN */
/* JADX INFO: loaded from: classes3.dex */
public final class C5675 extends AbstractC2323 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f19568;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f19569;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f19570;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC16861 f19571;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f19572;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f19573;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f19574;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC25067 f19575;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f19576;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f19577;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f19578;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f19579;

    public C5675(String str, EnumC16861 enumC16861, boolean z, boolean z2, long j, long j2, long j3, long j4, EnumC25067 enumC25067, String str2, boolean z3, boolean z4) {
        this.f19568 = str;
        this.f19571 = enumC16861;
        this.f19579 = z;
        this.f19569 = z2;
        this.f19573 = j;
        this.f19576 = j2;
        this.f19570 = j3;
        this.f19574 = j4;
        this.f19575 = enumC25067;
        this.f19577 = str2;
        this.f19578 = z3;
        this.f19572 = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5675)) {
            return false;
        }
        C5675 c5675 = (C5675) obj;
        return this.f19579 == c5675.f19579 && this.f19569 == c5675.f19569 && this.f19578 == c5675.f19578 && this.f19572 == c5675.f19572 && this.f19573 == c5675.f19573 && this.f19576 == c5675.f19576 && this.f19570 == c5675.f19570 && this.f19574 == c5675.f19574 && C17359.equals(this.f19568, c5675.f19568) && C17359.equals(this.f19571, c5675.f19571) && C17359.equals(this.f19575, c5675.f19575) && C17359.equals(this.f19577, c5675.f19577);
    }

    public final int hashCode() {
        int i = (((((this.f19579 ? 1231 : 1237) * 31) + (this.f19569 ? 1231 : 1237)) * 31) + (this.f19578 ? 1231 : 1237)) * 31;
        int i2 = this.f19572 ? 1231 : 1237;
        long j = this.f19573;
        int i3 = (((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f19576;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f19570;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f19574;
        return C17359.hashCode(this.f19577) + ((C17359.hashCode(this.f19575) + ((C17359.hashCode(this.f19571) + C24966.m55771((i5 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.f19568)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f19568, this.f19571, Boolean.valueOf(this.f19579), Boolean.valueOf(this.f19569), Long.valueOf(this.f19573), Long.valueOf(this.f19576), Long.valueOf(this.f19570), Long.valueOf(this.f19574), this.f19575, this.f19577, Boolean.valueOf(this.f19578), Boolean.valueOf(this.f19572)};
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

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m16674() {
        return this.f19568;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16675() {
        return this.f19569;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m16677() {
        return this.f19576;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m16678() {
        return this.f19577;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m16679() {
        return this.f19578;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16680() {
        return this.f19572;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC16861 m16681() {
        return this.f19571;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m16682() {
        return this.f19573;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m16683() {
        return this.f19574;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC25067 m16684() {
        return this.f19575;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m16685() {
        return this.f19579;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m16687() {
        return this.f19570;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m16673(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        C20348 c20348 = new C20348(bArr);
        try {
            int i2 = c20348.readByte() & 255;
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
                String strM46758 = c20348.m46758();
                String strM46759 = c20348.m46758();
                byte b = c20348.readByte();
                int i5 = b & 255;
                boolean z = (b & 1) != 0;
                boolean z2 = (b & 2) != 0;
                boolean z3 = (b & 4) != 0;
                boolean z4 = (b & 8) != 0;
                boolean z5 = (b & 16) != 0;
                EnumC16861 enumC16861M39818 = EnumC16861.m39818((i5 >> 5) & 7);
                long j = z ? c20348.readLong() : -1L;
                long j2 = z ? c20348.readLong() : -1L;
                if (j >= 0 && j == j2 && j2 != C25227.FOREVER_NS) {
                    j2++;
                }
                arrayList.add(new C5675(strM46758, enumC16861M39818, z2, z3, j, j2, -1L, -1L, null, strM46759, z4, z5));
                i4++;
            }
            if (c20348.available() != 0) {
                try {
                    if (c20348.available() >= 6 && c20348.readInt() == 1179866194) {
                        int i6 = c20348.readByte() & 255;
                        int i7 = c20348.readByte() & 255;
                        if ((i6 == 1 || i6 == 2) && i7 == arrayList.size()) {
                            if (c20348.available() == ((long) i7) * (i6 == 1 ? 16L : 17L)) {
                                long[] jArr = new long[i7];
                                long[] jArr2 = new long[i7];
                                EnumC25067[] enumC25067Arr = new EnumC25067[i7];
                                while (i < i7) {
                                    jArr[i] = c20348.readLong();
                                    jArr2[i] = c20348.readLong();
                                    if (i6 >= 2) {
                                        enumC25067Arr[i] = EnumC25067.m55895(c20348.readByte() & 255);
                                    }
                                    long j3 = jArr[i];
                                    long j4 = jArr2[i];
                                    i = (j3 >= -1 && j4 >= -1 && (j3 == -1 || j4 == -1 || j3 < j4)) ? i + 1 : 0;
                                }
                                ArrayList arrayList2 = new ArrayList(i7);
                                while (i3 < i7) {
                                    C5675 c5675 = (C5675) arrayList.get(i3);
                                    long[] jArr3 = jArr2;
                                    EnumC25067[] enumC25067Arr2 = enumC25067Arr;
                                    int i8 = i7;
                                    arrayList2.add(new C5675(c5675.f19568, c5675.f19571, c5675.f19579, c5675.f19569, c5675.f19573, c5675.f19576, jArr[i3], jArr2[i3], enumC25067Arr[i3], c5675.f19577, c5675.f19578, c5675.f19572));
                                    i3++;
                                    jArr2 = jArr3;
                                    enumC25067Arr = enumC25067Arr2;
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
    public static byte[] m16672(List list) {
        if (list.size() > 100) {
            throw new IllegalArgumentException("Too many file search records");
        }
        C6178 c6178 = new C6178();
        c6178.writeByte(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5675 c5675 = (C5675) it.next();
            long j = c5675.f19576;
            c6178.m17800(c5675.f19568);
            c6178.m17800(c5675.f19577);
            int iM39821 = c5675.f19571.m39821() << 5;
            long j2 = c5675.f19573;
            if (j2 != -1 || j != -1) {
                iM39821 |= 1;
            }
            if (c5675.f19579) {
                iM39821 |= 2;
            }
            if (c5675.f19569) {
                iM39821 |= 4;
            }
            if (c5675.f19578) {
                iM39821 |= 8;
            }
            if (c5675.f19572) {
                iM39821 |= 16;
            }
            c6178.writeByte(iM39821);
            if (j2 != -1 || j != -1) {
                c6178.m17803(j2);
                c6178.m17803(j);
            }
        }
        c6178.writeInt(1179866194);
        c6178.writeByte(2);
        c6178.writeByte(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C5675 c5676 = (C5675) it2.next();
            c6178.m17803(c5676.f19570);
            c6178.m17803(c5676.f19574);
            EnumC25067 enumC25067 = c5676.f19575;
            c6178.writeByte(enumC25067 == null ? 0 : enumC25067.m55899());
        }
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16676(C5675 c5675) {
        boolean zM16671;
        String str = c5675.f19568;
        String str2 = this.f19568;
        if (!str2.equals(str)) {
            return false;
        }
        if ((!str2.isEmpty() && this.f19571 != c5675.f19571) || this.f19579 != c5675.f19579 || (zM16671 = m16671()) != c5675.m16671()) {
            return false;
        }
        if (!zM16671) {
            return true;
        }
        if (this.f19573 != c5675.f19573 || this.f19576 != c5675.f19576) {
            return false;
        }
        EnumC25067 enumC25067 = c5675.f19575;
        EnumC25067 enumC25068 = this.f19575;
        if (enumC25068 != enumC25067) {
            return false;
        }
        if (enumC25068 == null && (this.f19570 != c5675.f19570 || this.f19574 != c5675.f19574)) {
            return false;
        }
        String str3 = c5675.f19577;
        String str4 = this.f19577;
        if (!str4.equals(str3)) {
            return false;
        }
        if (str4.isEmpty()) {
            return true;
        }
        return this.f19578 == c5675.f19578 && this.f19572 == c5675.f19572;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private boolean m16671() {
        if (this.f19569) {
            return (this.f19573 == -1 && this.f19576 == -1 && this.f19575 == null && this.f19570 == -1 && this.f19574 == -1 && this.f19577.isEmpty()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m16686() {
        String str = this.f19568;
        String strReplace = str.replace('\n', ' ');
        if (strReplace.isEmpty()) {
            strReplace = C21576.m49088(R.string.MT_Protector);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strReplace);
        int length = spannableStringBuilder.length();
        if (!str.isEmpty()) {
            spannableStringBuilder.append((CharSequence) " [").append((CharSequence) C21576.m49088(this.f19571.m39820())).append((CharSequence) "]");
        }
        if (this.f19569) {
            long j = this.f19576;
            long j2 = this.f19573;
            if (j2 != -1 || j != -1) {
                spannableStringBuilder.append('\n').append((CharSequence) C21576.m49088(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) EnumC11640.m29241(j2, j));
            }
            long j3 = this.f19574;
            long j4 = this.f19570;
            EnumC25067 enumC25067 = this.f19575;
            if (enumC25067 != null || j4 != -1 || j3 != -1) {
                spannableStringBuilder.append('\n').append((CharSequence) C21576.m49088(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) (enumC25067 == null ? EnumC25067.m55894(j4, j3) : enumC25067.m55897()));
            }
            String str2 = this.f19577;
            if (!str2.isEmpty()) {
                spannableStringBuilder.append('\n').append((CharSequence) C21576.m49088(R.string.MT_Protector)).append((CharSequence) ": ").append((CharSequence) C18969.m44060(50, str2).replace('\n', ' '));
            }
        }
        if (length < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C3296.f10741), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
