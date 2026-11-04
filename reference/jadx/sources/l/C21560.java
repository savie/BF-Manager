package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C21560 implements InterfaceC18356 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14846 f68862;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21560 m48988(AbstractC14846 abstractC14846) {
        C21560 c21560 = abstractC14846.f48543;
        return c21560 != null ? c21560 : new C21560(abstractC14846);
    }

    public C21560(AbstractC14846 abstractC14846) {
        C23447.m52662(abstractC14846, "output");
        this.f68862 = abstractC14846;
        abstractC14846.f48543 = this;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m49025(int i, int i2) {
        this.f68862.mo14004(i, i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49020(int i, long j) {
        this.f68862.mo14023(i, j);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49005(int i, long j) {
        this.f68862.mo14006(i, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48990(float f, int i) {
        AbstractC14846 abstractC14846 = this.f68862;
        abstractC14846.getClass();
        abstractC14846.mo14004(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48992(int i, double d) {
        AbstractC14846 abstractC14846 = this.f68862;
        abstractC14846.getClass();
        abstractC14846.mo14006(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48993(int i, int i2) {
        this.f68862.mo14022(i, i2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m49016(int i, long j) {
        this.f68862.mo14023(i, j);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49004(int i, int i2) {
        this.f68862.mo14022(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48994(int i, long j) {
        this.f68862.mo14006(i, j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49019(int i, int i2) {
        this.f68862.mo14004(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49001(int i, boolean z) {
        this.f68862.mo14010(i, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48997(int i, String str) {
        this.f68862.mo14007(i, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49000(int i, AbstractC17084 abstractC17084) {
        this.f68862.mo14008(i, abstractC17084);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m49010(int i, int i2) {
        this.f68862.mo14027(i, i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49021(int i, Object obj) {
        this.f68862.mo14025(i, (InterfaceC18775) obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49022(int i, Object obj, InterfaceC7762 interfaceC7762) {
        this.f68862.mo14009(i, (InterfaceC18775) obj, interfaceC7762);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48995(int i, Object obj) {
        this.f68862.m35775(i, (InterfaceC18775) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48996(int i, Object obj, InterfaceC7762 interfaceC7762) {
        AbstractC14846 abstractC14846 = this.f68862;
        abstractC14846.mo14019(i, 3);
        interfaceC7762.mo21143(obj, (InterfaceC18356) abstractC14846.f48543);
        abstractC14846.mo14019(i, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49018(int i) {
        this.f68862.mo14019(i, 3);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48991(int i) {
        this.f68862.mo14019(i, 4);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49006(int i, Object obj) {
        boolean z = obj instanceof AbstractC17084;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14024(i, (AbstractC17084) obj);
        } else {
            abstractC14846.mo14020(i, (InterfaceC18775) obj);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m49009(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int iM35762 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM35762 += AbstractC14846.m35762(((Integer) list.get(i3)).intValue());
            }
            abstractC14846.mo14018(iM35762);
            while (i2 < list.size()) {
                abstractC14846.mo14021(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14022(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m49027(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                int i5 = AbstractC14846.f48541;
                i3 += 4;
            }
            abstractC14846.mo14018(i3);
            while (i2 < list.size()) {
                abstractC14846.mo14003(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14004(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m49003(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int iM35762 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM35762 += AbstractC14846.m35762(((Long) list.get(i3)).longValue());
            }
            abstractC14846.mo14018(iM35762);
            while (i2 < list.size()) {
                abstractC14846.mo14026(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14023(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m49015(int i, int i2) {
        this.f68862.mo14027(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m49012(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int iM35762 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM35762 += AbstractC14846.m35762(((Long) list.get(i3)).longValue());
            }
            abstractC14846.mo14018(iM35762);
            while (i2 < list.size()) {
                abstractC14846.mo14026(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14023(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m49026(int i, long j) {
        this.f68862.mo14023(i, (j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m49017(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                int i5 = AbstractC14846.f48541;
                i3 += 8;
            }
            abstractC14846.mo14018(i3);
            while (i2 < list.size()) {
                abstractC14846.mo14012(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14006(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m49011(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                int i5 = AbstractC14846.f48541;
                i3 += 4;
            }
            abstractC14846.mo14018(i3);
            while (i2 < list.size()) {
                abstractC14846.mo14003(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            float fFloatValue = ((Float) list.get(i2)).floatValue();
            abstractC14846.getClass();
            abstractC14846.mo14004(i, Float.floatToRawIntBits(fFloatValue));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49024(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                int i5 = AbstractC14846.f48541;
                i3 += 8;
            }
            abstractC14846.mo14018(i3);
            while (i2 < list.size()) {
                abstractC14846.mo14012(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            double dDoubleValue = ((Double) list.get(i2)).doubleValue();
            abstractC14846.getClass();
            abstractC14846.mo14006(i, Double.doubleToRawLongBits(dDoubleValue));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49007(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int iM35762 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM35762 += AbstractC14846.m35762(((Integer) list.get(i3)).intValue());
            }
            abstractC14846.mo14018(iM35762);
            while (i2 < list.size()) {
                abstractC14846.mo14021(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14022(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49002(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                int i5 = AbstractC14846.f48541;
                i3++;
            }
            abstractC14846.mo14018(i3);
            while (i2 < list.size()) {
                abstractC14846.mo14002(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14010(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49023(int i, List list) {
        boolean z = list instanceof InterfaceC9274;
        AbstractC14846 abstractC14846 = this.f68862;
        int i2 = 0;
        if (z) {
            InterfaceC9274 interfaceC9274 = (InterfaceC9274) list;
            while (i2 < list.size()) {
                Object objMo4025 = interfaceC9274.mo4025(i2);
                if (objMo4025 instanceof String) {
                    abstractC14846.mo14007(i, (String) objMo4025);
                } else {
                    abstractC14846.mo14008(i, (AbstractC17084) objMo4025);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14007(i, (String) list.get(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48998(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f68862.mo14008(i, (AbstractC17084) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49014(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int iM35763 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM35763 += AbstractC14846.m35763(((Integer) list.get(i3)).intValue());
            }
            abstractC14846.mo14018(iM35763);
            while (i2 < list.size()) {
                abstractC14846.mo14018(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14027(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48989(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                int i5 = AbstractC14846.f48541;
                i3 += 4;
            }
            abstractC14846.mo14018(i3);
            while (i2 < list.size()) {
                abstractC14846.mo14003(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14004(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49008(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                int i5 = AbstractC14846.f48541;
                i3 += 8;
            }
            abstractC14846.mo14018(i3);
            while (i2 < list.size()) {
                abstractC14846.mo14012(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14846.mo14006(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m49028(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int iM35763 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                iM35763 += AbstractC14846.m35763((iIntValue >> 31) ^ (iIntValue << 1));
            }
            abstractC14846.mo14018(iM35763);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                abstractC14846.mo14018((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            abstractC14846.mo14027(i, (iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m49013(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14846 abstractC14846 = this.f68862;
        if (z) {
            abstractC14846.mo14019(i, 2);
            int iM35762 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue = ((Long) list.get(i3)).longValue();
                iM35762 += AbstractC14846.m35762((jLongValue >> 63) ^ (jLongValue << 1));
            }
            abstractC14846.mo14018(iM35762);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                abstractC14846.mo14026((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            abstractC14846.mo14023(i, (jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48999(int i, Map map) {
        AbstractC14846 abstractC14846 = this.f68862;
        abstractC14846.getClass();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            abstractC14846.mo14019(i, 2);
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
