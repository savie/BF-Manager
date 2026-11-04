package l;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۟֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M445 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7511 extends C23920 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC0053 f24815;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashMap f24816;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumMap f24817;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7511(C13015 c13015) {
        EnumC0053 enumC0053;
        EnumC5246 enumC5246 = EnumC5246.SUMMARY;
        EnumC5246 enumC5247 = EnumC5246.DETAILS;
        EnumC5246 enumC5248 = EnumC5246.SUBDIAGNOSTICS;
        EnumC5246 enumC5249 = EnumC5246.SOURCE;
        super(c13015, EnumSet.of(enumC5246, enumC5247, enumC5248, enumC5249));
        this.f24817 = new EnumMap(EnumC17952.class);
        EnumC17952 enumC17952 = EnumC17952.DEFAULT_POS_FORMAT;
        m20568(enumC17952, "%f:%l:%_%p%L%m");
        EnumC17952 enumC17953 = EnumC17952.DEFAULT_NO_POS_FORMAT;
        m20568(enumC17953, "%p%L%m");
        EnumC17952 enumC17954 = EnumC17952.DEFAULT_CLASS_FORMAT;
        m20568(enumC17954, "%f:%_%p%L%m");
        m20565();
        if (c13015.m32432("diags.legacy")) {
            this.f24817 = new EnumMap(EnumC17952.class);
            m20568(enumC17952, "%f:%l:%_%t%L%m");
            m20568(enumC17953, "%p%L%m");
            m20568(enumC17954, "%f:%_%t%L%m");
        }
        String strM32422 = c13015.m32422("diags.layout");
        if (strM32422 != null) {
            if (strM32422.equals("OLD")) {
                this.f24817 = new EnumMap(EnumC17952.class);
                m20568(enumC17952, "%f:%l:%_%t%L%m");
                m20568(enumC17953, "%p%L%m");
                m20568(enumC17954, "%f:%_%t%L%m");
            } else {
                String[] strArrSplit = strM32422.split("\\|");
                int length = strArrSplit.length;
                if (length == 2) {
                    m20568(enumC17953, strArrSplit[1]);
                } else if (length == 3) {
                    m20568(enumC17954, strArrSplit[2]);
                    m20568(enumC17953, strArrSplit[1]);
                }
                m20568(enumC17952, strArrSplit[0]);
            }
        }
        String strM32423 = c13015.m32422("diags.sourcePosition");
        if (strM32423 != null && strM32423.equals("bottom")) {
            enumC0053 = EnumC0053.BOTTOM;
        } else {
            enumC0053 = EnumC0053.AFTER_SUMMARY;
        }
        this.f24815 = enumC0053;
        String strM32424 = c13015.m32422("diags.indent");
        if (strM32424 != null) {
            String[] strArrSplit2 = strM32424.split("\\|");
            try {
                int length2 = strArrSplit2.length;
                if (length2 != 2) {
                    if (length2 != 3) {
                        if (length2 != 4) {
                            if (length2 == 5) {
                                m20567(EnumC5246.JLS, Integer.parseInt(strArrSplit2[4]));
                            }
                        }
                        m20567(enumC5248, Integer.parseInt(strArrSplit2[3]));
                    }
                    m20567(enumC5249, Integer.parseInt(strArrSplit2[2]));
                    m20567(enumC5247, Integer.parseInt(strArrSplit2[1]));
                } else {
                    m20567(enumC5247, Integer.parseInt(strArrSplit2[1]));
                }
                m20567(enumC5246, Integer.parseInt(strArrSplit2[0]));
            } catch (NumberFormatException unused) {
                m20565();
            }
        }
    }

    public C7511() {
        super(EnumSet.of(EnumC5246.SUMMARY, EnumC5246.DETAILS, EnumC5246.SUBDIAGNOSTICS, EnumC5246.SOURCE));
        this.f24817 = new EnumMap(EnumC17952.class);
        m20568(EnumC17952.DEFAULT_POS_FORMAT, "%f:%l:%_%p%L%m");
        m20568(EnumC17952.DEFAULT_NO_POS_FORMAT, "%p%L%m");
        m20568(EnumC17952.DEFAULT_CLASS_FORMAT, "%f:%_%p%L%m");
        m20565();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20565() {
        this.f24816 = new HashMap();
        m20567(EnumC5246.SUMMARY, 0);
        m20567(EnumC5246.DETAILS, 2);
        m20567(EnumC5246.SUBDIAGNOSTICS, 4);
        m20567(EnumC5246.SOURCE, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20566(EnumC5246 enumC5246) {
        return ((Integer) this.f24816.get(enumC5246)).intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20567(EnumC5246 enumC5246, int i) {
        this.f24816.put(enumC5246, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20568(EnumC17952 enumC17952, String str) {
        this.f24817.put(enumC17952, str);
    }
}
