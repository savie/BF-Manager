package l;

import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.֡֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB9V */
/* JADX INFO: loaded from: classes2.dex */
public final class C0085 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0209 f997;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7265 f998 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f999 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f1000 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public TreeMap f996 = null;

    public C0085(C0209 c0209) {
        this.f997 = c0209;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1023() {
        if (this.f998 == null) {
            this.f998 = this.f997.m1566();
        }
        return this.f998.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1024(C2718 c2718) {
        String strM49978;
        String strM49979;
        C7265 c7265 = this.f998;
        C0209 c0209 = this.f997;
        if (c7265 == null) {
            this.f998 = c0209.m1566();
        }
        if (c2718.m8288()) {
            if (this.f998 == null) {
                this.f998 = c0209.m1566();
            }
            int size = this.f998.size();
            c2718.m8283(0, "  tries:");
            for (int i = 0; i < size; i++) {
                C10088 c10088M15268get = this.f998.m15268get(i);
                C8677 c8677M25501 = c10088M15268get.m25501();
                StringBuilder sb = new StringBuilder("    try ");
                int iM25500 = c10088M15268get.m25500();
                if (iM25500 == ((char) iM25500)) {
                    strM49978 = C22475.m49982(iM25500);
                } else {
                    strM49978 = C22475.m49978(iM25500);
                }
                sb.append(strM49978);
                sb.append("..");
                int iM25498 = c10088M15268get.m25498();
                if (iM25498 == ((char) iM25498)) {
                    strM49979 = C22475.m49982(iM25498);
                } else {
                    strM49979 = C22475.m49978(iM25498);
                }
                sb.append(strM49979);
                String string = sb.toString();
                String strM22504 = c8677M25501.m22504(ASN1Dump.TAB, "");
                c2718.m8283(6, string);
                c2718.m8283(2, strM22504);
            }
            c2718.m8283(0, "  handlers:");
            c2718.m8283(this.f1000, "    size: ".concat(C22475.m49982(this.f996.size())));
            C8677 c8677 = null;
            int i2 = 0;
            for (Map.Entry entry : this.f996.entrySet()) {
                C8677 c8678 = (C8677) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                if (c8677 != null) {
                    c2718.m8283(iIntValue - i2, c8677.m22504(ASN1Dump.TAB, C22475.m49982(i2).concat(": ")));
                }
                i2 = iIntValue;
                c8677 = c8678;
            }
            c2718.m8283(this.f999.length - i2, c8677.m22504(ASN1Dump.TAB, C22475.m49982(i2).concat(": ")));
        }
        int size2 = this.f998.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C10088 c10088M15268get2 = this.f998.m15268get(i3);
            int iM25501 = c10088M15268get2.m25500();
            int iM25499 = c10088M15268get2.m25498();
            int i4 = iM25499 - iM25501;
            if (i4 >= 65536) {
                throw new UnsupportedOperationException("bogus exception range: " + C22475.m49978(iM25501) + ".." + C22475.m49978(iM25499));
            }
            c2718.m8289(iM25501);
            c2718.m8297(i4);
            c2718.m8297(((Integer) this.f996.get(c10088M15268get2.m25501())).intValue());
        }
        c2718.m8287(this.f999);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1025(C4669 c4669) {
        if (this.f998 == null) {
            this.f998 = this.f997.m1566();
        }
        C11457 c11457M12877 = c4669.m12877();
        int size = this.f998.size();
        this.f996 = new TreeMap();
        for (int i = 0; i < size; i++) {
            this.f996.put(this.f998.m15268get(i).m25501(), null);
        }
        if (this.f996.size() > 65535) {
            throw new UnsupportedOperationException("too many catch handlers");
        }
        C2718 c2718 = new C2718();
        this.f1000 = c2718.m8293(this.f996.size());
        for (Map.Entry entry : this.f996.entrySet()) {
            C8677 c8677 = (C8677) entry.getKey();
            int size2 = c8677.size();
            boolean zM22503 = c8677.m22503();
            entry.setValue(Integer.valueOf(c2718.m8296()));
            if (zM22503) {
                c2718.m8277(-(size2 - 1));
                size2--;
            } else {
                c2718.m8277(size2);
            }
            for (int i2 = 0; i2 < size2; i2++) {
                C19260 c19260M15278get = c8677.m15278get(i2);
                c2718.m8293(c11457M12877.m28601(c19260M15278get.m44204()));
                c2718.m8293(c19260M15278get.m44202());
            }
            if (zM22503) {
                c2718.m8293(c8677.m15278get(size2).m44202());
            }
        }
        this.f999 = c2718.m8278();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m1026() {
        return (m1023() * 8) + this.f999.length;
    }
}
