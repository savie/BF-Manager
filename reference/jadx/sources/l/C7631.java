package l;

import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.۟ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB9V */
/* JADX INFO: loaded from: classes3.dex */
public final class C7631 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7697 f25176;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C14408 f25178 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f25177 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f25179 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TreeMap f25180 = null;

    public C7631(C7697 c7697) {
        this.f25176 = c7697;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20846() {
        if (this.f25178 == null) {
            this.f25178 = this.f25176.m20976();
        }
        return this.f25178.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20847(C10918 c10918) {
        if (this.f25178 == null) {
            this.f25178 = this.f25176.m20976();
        }
        C20067 c20067M27694 = c10918.m27694();
        int size = this.f25178.size();
        this.f25180 = new TreeMap();
        for (int i = 0; i < size; i++) {
            this.f25180.put(this.f25178.m31608get(i).m12750(), null);
        }
        if (this.f25180.size() > 65535) {
            throw new UnsupportedOperationException("too many catch handlers");
        }
        C15000 c15000 = new C15000();
        this.f25179 = c15000.m36117(this.f25180.size());
        for (Map.Entry entry : this.f25180.entrySet()) {
            C24106 c24106 = (C24106) entry.getKey();
            int size2 = c24106.size();
            boolean zM53656 = c24106.m53656();
            entry.setValue(Integer.valueOf(c15000.m36122()));
            if (zM53656) {
                c15000.m36120(-(size2 - 1));
                size2--;
            } else {
                c15000.m36120(size2);
            }
            for (int i2 = 0; i2 < size2; i2++) {
                C6206 c6206M31611get = c24106.m31611get(i2);
                c15000.m36117(c20067M27694.m46183(c6206M31611get.m17845()));
                c15000.m36117(c6206M31611get.m17843());
            }
            if (zM53656) {
                c15000.m36117(c24106.m31611get(size2).m17843());
            }
        }
        this.f25177 = c15000.m36121();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20848(C15000 c15000) {
        String strM15938;
        String strM15939;
        C14408 c14408 = this.f25178;
        C7697 c7697 = this.f25176;
        if (c14408 == null) {
            this.f25178 = c7697.m20976();
        }
        if (c15000.m36116()) {
            if (this.f25178 == null) {
                this.f25178 = c7697.m20976();
            }
            int size = this.f25178.size();
            c15000.m36111(0, "  tries:");
            for (int i = 0; i < size; i++) {
                C3968 c3968M31608get = this.f25178.m31608get(i);
                C24106 c24106M12750 = c3968M31608get.m12750();
                StringBuilder sb = new StringBuilder("    try ");
                int iM12749 = c3968M31608get.m12749();
                if (iM12749 == ((char) iM12749)) {
                    strM15938 = C5306.m15934(iM12749);
                } else {
                    strM15938 = C5306.m15938(iM12749);
                }
                sb.append(strM15938);
                sb.append("..");
                int iM12747 = c3968M31608get.m12747();
                if (iM12747 == ((char) iM12747)) {
                    strM15939 = C5306.m15934(iM12747);
                } else {
                    strM15939 = C5306.m15938(iM12747);
                }
                sb.append(strM15939);
                String string = sb.toString();
                String strM53657 = c24106M12750.m53657(ASN1Dump.TAB, "");
                c15000.m36111(6, string);
                c15000.m36111(2, strM53657);
            }
            c15000.m36111(0, "  handlers:");
            c15000.m36111(this.f25179, "    size: ".concat(C5306.m15934(this.f25180.size())));
            C24106 c24106 = null;
            int i2 = 0;
            for (Map.Entry entry : this.f25180.entrySet()) {
                C24106 c24107 = (C24106) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                if (c24106 != null) {
                    c15000.m36111(iIntValue - i2, c24106.m53657(ASN1Dump.TAB, C5306.m15934(i2).concat(": ")));
                }
                i2 = iIntValue;
                c24106 = c24107;
            }
            c15000.m36111(this.f25177.length - i2, c24106.m53657(ASN1Dump.TAB, C5306.m15934(i2).concat(": ")));
        }
        int size2 = this.f25178.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C3968 c3968M31608get2 = this.f25178.m31608get(i3);
            int iM127410 = c3968M31608get2.m12749();
            int iM12748 = c3968M31608get2.m12747();
            int i4 = iM12748 - iM127410;
            if (i4 >= 65536) {
                throw new UnsupportedOperationException("bogus exception range: " + C5306.m15938(iM127410) + ".." + C5306.m15938(iM12748));
            }
            c15000.m36124(iM127410);
            c15000.m36123(i4);
            c15000.m36123(((Integer) this.f25180.get(c3968M31608get2.m12750())).intValue());
        }
        c15000.m36115(this.f25177);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m20849() {
        return (m20846() * 8) + this.f25177.length;
    }
}
