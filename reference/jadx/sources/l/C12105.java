package l;

import java.util.Arrays;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۨۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12105 extends AbstractC10172 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C20310 f38957 = new C20310();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C8791 f38958;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C23051 f38959;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f38960;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30277(C12105[] c12105Arr) {
        Arrays.sort(c12105Arr, f38957);
    }

    public C12105(C10918 c10918, C8791 c8791) {
        super(1, -1);
        if (c8791 == null) {
            throw new NullPointerException("annotation == null");
        }
        this.f38958 = c8791;
        this.f38959 = null;
        this.f38960 = null;
        mo1455(c10918);
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_ANNOTATION_ITEM;
    }

    public final int hashCode() {
        return this.f38958.hashCode();
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۙ */
    public final int mo15563(AbstractC10172 abstractC10172) {
        return this.f38958.compareTo(((C12105) abstractC10172).f38958);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        return this.f38958.mo1843();
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        C20067 c20067M27694 = c10918.m27694();
        C8791 c8791 = this.f38958;
        this.f38959 = c20067M27694.m46187(c8791.getType());
        C2168.m7457(c10918, c8791);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1458(C19123 c19123, int i) {
        C15000 c15000 = new C15000();
        new C2168(c19123.m23369(), c15000).m7461(this.f38958, false);
        byte[] bArrM36121 = c15000.m36121();
        this.f38960 = bArrM36121;
        m26283(bArrM36121.length + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30278(C15000 c15000) {
        StringBuilder sb = new StringBuilder("    visibility: ");
        C8791 c8791 = this.f38958;
        sb.append(c8791.getVisibility().mo1843());
        c15000.m36111(0, sb.toString());
        c15000.m36111(0, "    type: " + c8791.getType().mo1843());
        for (C21692 c21692 : c8791.m23588()) {
            c15000.m36111(0, ASN1Dump.TAB + c21692.getName().mo1843() + ": " + C2168.m7460(c21692.getValue()));
        }
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        boolean zM36116 = c15000.m36116();
        C8791 c8791 = this.f38958;
        EnumC7300 visibility = c8791.getVisibility();
        if (zM36116) {
            c15000.m36111(0, m26281() + " annotation");
            StringBuilder sb = new StringBuilder("  visibility: VISBILITY_");
            sb.append(visibility);
            c15000.m36111(1, sb.toString());
        }
        int i = C3156.f10234[visibility.ordinal()];
        if (i == 1) {
            c15000.m36129(0);
        } else if (i == 2) {
            c15000.m36129(1);
        } else if (i == 3) {
            c15000.m36129(2);
        } else {
            throw new RuntimeException("shouldn't happen");
        }
        if (zM36116) {
            new C2168(c10918, c15000).m7461(c8791, true);
        } else {
            c15000.m36115(this.f38960);
        }
    }
}
