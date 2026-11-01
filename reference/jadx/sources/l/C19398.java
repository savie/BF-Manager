package l;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵ۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M445 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19398 extends C22926 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumMap f62537;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f62538;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC8109 f62539;

    /* JADX WARN: Illegal instructions before constructor call */
    public C19398(C14770 c14770) {
        EnumC8109 enumC8109;
        EnumC20438 enumC20438 = EnumC20438.SUMMARY;
        EnumC20438 enumC20439 = EnumC20438.DETAILS;
        EnumC20438 enumC204310 = EnumC20438.SUBDIAGNOSTICS;
        EnumC20438 enumC204311 = EnumC20438.SOURCE;
        super(c14770, EnumSet.of(enumC20438, enumC20439, enumC204310, enumC204311));
        this.f62537 = new EnumMap(EnumC18692.class);
        EnumC18692 enumC18692 = EnumC18692.DEFAULT_POS_FORMAT;
        m44448(enumC18692, "%f:%l:%_%p%L%m");
        EnumC18692 enumC18693 = EnumC18692.DEFAULT_NO_POS_FORMAT;
        m44448(enumC18693, "%p%L%m");
        EnumC18692 enumC18694 = EnumC18692.DEFAULT_CLASS_FORMAT;
        m44448(enumC18694, "%f:%_%p%L%m");
        m44446();
        if (c14770.m35407("diags.legacy")) {
            this.f62537 = new EnumMap(EnumC18692.class);
            m44448(enumC18692, "%f:%l:%_%t%L%m");
            m44448(enumC18693, "%p%L%m");
            m44448(enumC18694, "%f:%_%t%L%m");
        }
        String strM35397 = c14770.m35397("diags.layout");
        if (strM35397 != null) {
            if (strM35397.equals("OLD")) {
                this.f62537 = new EnumMap(EnumC18692.class);
                m44448(enumC18692, "%f:%l:%_%t%L%m");
                m44448(enumC18693, "%p%L%m");
                m44448(enumC18694, "%f:%_%t%L%m");
            } else {
                String[] strArrSplit = strM35397.split("\\|");
                int length = strArrSplit.length;
                if (length == 2) {
                    m44448(enumC18693, strArrSplit[1]);
                } else if (length == 3) {
                    m44448(enumC18694, strArrSplit[2]);
                    m44448(enumC18693, strArrSplit[1]);
                }
                m44448(enumC18692, strArrSplit[0]);
            }
        }
        String strM35398 = c14770.m35397("diags.sourcePosition");
        if (strM35398 != null && strM35398.equals("bottom")) {
            enumC8109 = EnumC8109.BOTTOM;
        } else {
            enumC8109 = EnumC8109.AFTER_SUMMARY;
        }
        this.f62539 = enumC8109;
        String strM35399 = c14770.m35397("diags.indent");
        if (strM35399 != null) {
            String[] strArrSplit2 = strM35399.split("\\|");
            try {
                int length2 = strArrSplit2.length;
                if (length2 != 2) {
                    if (length2 != 3) {
                        if (length2 != 4) {
                            if (length2 == 5) {
                                m44449(EnumC20438.JLS, Integer.parseInt(strArrSplit2[4]));
                            }
                        }
                        m44449(enumC204310, Integer.parseInt(strArrSplit2[3]));
                    }
                    m44449(enumC204311, Integer.parseInt(strArrSplit2[2]));
                    m44449(enumC20439, Integer.parseInt(strArrSplit2[1]));
                } else {
                    m44449(enumC20439, Integer.parseInt(strArrSplit2[1]));
                }
                m44449(enumC20438, Integer.parseInt(strArrSplit2[0]));
            } catch (NumberFormatException unused) {
                m44446();
            }
        }
    }

    public C19398() {
        super(EnumSet.of(EnumC20438.SUMMARY, EnumC20438.DETAILS, EnumC20438.SUBDIAGNOSTICS, EnumC20438.SOURCE));
        this.f62537 = new EnumMap(EnumC18692.class);
        m44448(EnumC18692.DEFAULT_POS_FORMAT, "%f:%l:%_%p%L%m");
        m44448(EnumC18692.DEFAULT_NO_POS_FORMAT, "%p%L%m");
        m44448(EnumC18692.DEFAULT_CLASS_FORMAT, "%f:%_%p%L%m");
        m44446();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44446() {
        this.f62538 = new HashMap();
        m44449(EnumC20438.SUMMARY, 0);
        m44449(EnumC20438.DETAILS, 2);
        m44449(EnumC20438.SUBDIAGNOSTICS, 4);
        m44449(EnumC20438.SOURCE, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44447(EnumC20438 enumC20438) {
        return ((Integer) this.f62538.get(enumC20438)).intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44449(EnumC20438 enumC20438, int i) {
        this.f62538.put(enumC20438, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44448(EnumC18692 enumC18692, String str) {
        this.f62537.put(enumC18692, str);
    }
}
