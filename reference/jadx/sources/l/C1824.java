package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes3.dex */
public final class C1824 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5075 f6185;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 f6186;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3168 f6187;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11518 f6188;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1526(C24335 c24335) {
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1519(C16875 c16875) {
        this.f6188.m28998(c16875.f55197, this.f6187, this.f6186, this.f6185, false);
        mo5474(c16875.f55198);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1961(C16239 c16239) {
        this.f6188.m28998(c16239.f52783, this.f6187, this.f6186, this.f6185, true);
        m52092(c16239.f52785);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1524(C21549 c21549) {
        C14769 c14769 = c21549.f68828;
        InterfaceC5075 interfaceC5075 = this.f6185;
        C11518 c11518 = this.f6188;
        c11518.m28998(c14769, this.f6187, this.f6186, interfaceC5075, false);
        Iterator it = c21549.f68831.iterator();
        while (it.hasNext()) {
            c11518.m28998((C14769) it.next(), this.f6187, this.f6186, this.f6185, false);
        }
        mo5474(c21549.f68829);
        m52092(c21549.f68827);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        mo5474(c6633.f22144);
        mo5474(c6633.f22147);
        m52092(c6633.f22154);
        mo5474(c6633.f22149);
        m52092(c6633.f22145);
        m52092(c6633.f22146);
        mo5474(c6633.f22151);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        InterfaceC5075 interfaceC5075 = this.f6185;
        this.f6185 = c12510;
        try {
            AbstractC11781 abstractC11781 = this.f6186;
            if (abstractC11781 != null && abstractC11781.f38066 == EnumC13603.f43205) {
                mo5474(c12510.f40170);
                mo5474(c12510.f40166);
            }
            mo5474(c12510.f40171);
        } finally {
            this.f6185 = interfaceC5075;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        mo5474(c18565.f60321);
        m52092(c18565.f60320);
        if (c18565.f60319 == null) {
            mo5474(c18565.f60323);
        }
        m52092(c18565.f60325);
    }

    public C1824(C11518 c11518, C3168 c3168, AbstractC11781 abstractC11781, InterfaceC5075 interfaceC5075) {
        this.f6188 = c11518;
        this.f6187 = c3168;
        this.f6186 = abstractC11781;
        this.f6185 = interfaceC5075;
    }
}
