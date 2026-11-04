package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܶܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44OF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16201 implements Serializable, InterfaceC8743 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f52582;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f52583;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C18637 f52584;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f52585;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f52586;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52587;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52588;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f52589;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52590;

    public C16201(C18637 c18637, int i, int i2, int i3, int i4) {
        this.f52590 = -1;
        this.f52588 = -1;
        this.f52584 = c18637;
        this.f52585 = i;
        this.f52587 = i2;
        this.f52589 = i3;
        this.f52586 = i4;
        Object obj = c18637.f60598;
        if (obj != null) {
            this.f52582 = ((InterfaceC13963) obj).getLine();
            this.f52590 = ((InterfaceC13963) c18637.f60598).mo34037();
        }
    }

    public C16201(InterfaceC8743 interfaceC8743) {
        this.f52590 = -1;
        this.f52587 = 0;
        this.f52588 = -1;
        this.f52585 = interfaceC8743.getType();
        this.f52582 = interfaceC8743.getLine();
        this.f52588 = interfaceC8743.mo23438();
        this.f52590 = interfaceC8743.mo23437();
        this.f52587 = interfaceC8743.mo23441();
        this.f52589 = interfaceC8743.mo23442();
        this.f52586 = interfaceC8743.mo23440();
        if (interfaceC8743 instanceof C16201) {
            C16201 c16201 = (C16201) interfaceC8743;
            this.f52583 = c16201.f52583;
            this.f52584 = c16201.f52584;
        } else {
            this.f52583 = interfaceC8743.getText();
            this.f52584 = new C18637(interfaceC8743.mo23439(), interfaceC8743.getInputStream());
        }
    }

    @Override // l.InterfaceC8743
    public final int getType() {
        return this.f52585;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38428(int i) {
        this.f52582 = i;
    }

    @Override // l.InterfaceC8743
    public final String getText() {
        int i;
        String str = this.f52583;
        if (str != null) {
            return str;
        }
        InterfaceC17693 inputStream = getInputStream();
        if (inputStream == null) {
            return null;
        }
        int size = inputStream.size();
        int i2 = this.f52589;
        return (i2 >= size || (i = this.f52586) >= size) ? "<EOF>" : inputStream.mo19728(C4467.m14163(i2, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38427(String str) {
        this.f52583 = str;
    }

    @Override // l.InterfaceC8743
    public final int getLine() {
        return this.f52582;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ۙ */
    public final int mo23437() {
        return this.f52590;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38432(int i) {
        this.f52590 = i;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ᩷ */
    public final int mo23441() {
        return this.f52587;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38426(int i) {
        this.f52587 = i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m38429(int i) {
        this.f52585 = i;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ᩸ */
    public final int mo23442() {
        return this.f52589;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m38433(int i) {
        this.f52589 = i;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ᩴ */
    public final int mo23440() {
        return this.f52586;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m38431(int i) {
        this.f52586 = i;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ۤ */
    public final int mo23438() {
        return this.f52588;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m38430(int i) {
        this.f52588 = i;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC13963 mo23439() {
        return (InterfaceC13963) this.f52584.f60598;
    }

    @Override // l.InterfaceC8743
    public final InterfaceC17693 getInputStream() {
        return (InterfaceC17693) this.f52584.f60599;
    }

    public final String toString() {
        String str;
        if (this.f52587 > 0) {
            str = ",channel=" + this.f52587;
        } else {
            str = "";
        }
        String text = getText();
        String strReplace = text != null ? text.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String strValueOf = String.valueOf(this.f52585);
        StringBuilder sb = new StringBuilder("[@");
        sb.append(this.f52588);
        sb.append(",");
        sb.append(this.f52589);
        sb.append(":");
        sb.append(this.f52586);
        sb.append("='");
        sb.append(strReplace);
        sb.append("',<");
        C4794.m14774(sb, strValueOf, ">", str, ",");
        sb.append(this.f52582);
        sb.append(":");
        return C12669.m31437(this.f52590, "]", sb);
    }
}
