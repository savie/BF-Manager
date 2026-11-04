package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۫᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44OF */
/* JADX INFO: loaded from: classes4.dex */
public class C13460 implements InterfaceC21665, Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC15697 f42845;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f42846;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f42847;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f42848;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f42849;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42850;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42851;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f42852;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42853;

    public C13460(int i, String str) {
        this.f42853 = -1;
        this.f42851 = -1;
        this.f42848 = i;
        this.f42850 = 0;
        this.f42846 = str;
    }

    public C13460(InterfaceC21665 interfaceC21665) {
        this.f42853 = -1;
        this.f42850 = 0;
        this.f42851 = -1;
        this.f42846 = interfaceC21665.getText();
        this.f42848 = interfaceC21665.getType();
        this.f42847 = interfaceC21665.getLine();
        this.f42851 = interfaceC21665.mo33100();
        this.f42853 = interfaceC21665.mo33097();
        this.f42850 = interfaceC21665.mo33103();
        this.f42845 = interfaceC21665.getInputStream();
        if (interfaceC21665 instanceof C13460) {
            C13460 c13460 = (C13460) interfaceC21665;
            this.f42852 = c13460.f42852;
            this.f42849 = c13460.f42849;
        }
    }

    @Override // l.InterfaceC21665
    public final int getType() {
        return this.f42848;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33104(int i) {
        this.f42847 = i;
    }

    @Override // l.InterfaceC21665
    public final String getText() {
        String str = this.f42846;
        if (str != null) {
            return str;
        }
        InterfaceC15697 interfaceC15697 = this.f42845;
        if (interfaceC15697 == null) {
            return null;
        }
        int size = interfaceC15697.size();
        return (this.f42852 >= size || this.f42849 >= size) ? "<EOF>" : this.f42845.m37470();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33099(String str) {
        this.f42846 = str;
    }

    @Override // l.InterfaceC21665
    public final int getLine() {
        return this.f42847;
    }

    @Override // l.InterfaceC21665
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo33097() {
        return this.f42853;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33098(int i) {
        this.f42853 = i;
    }

    @Override // l.InterfaceC21665
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo33103() {
        return this.f42850;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m33105() {
        this.f42850 = 99;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m33102(int i) {
        this.f42848 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m33101(int i) {
        this.f42852 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m33106(int i) {
        this.f42849 = i;
    }

    @Override // l.InterfaceC21665
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo33100() {
        return this.f42851;
    }

    @Override // l.InterfaceC21665
    public final InterfaceC15697 getInputStream() {
        return this.f42845;
    }

    public final String toString() {
        String str;
        if (this.f42850 > 0) {
            str = ",channel=" + this.f42850;
        } else {
            str = "";
        }
        String text = getText();
        String strReplaceAll = text != null ? text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t") : "<no text>";
        StringBuilder sb = new StringBuilder("[@");
        sb.append(this.f42851);
        sb.append(",");
        sb.append(this.f42852);
        sb.append(":");
        sb.append(this.f42849);
        sb.append("='");
        sb.append(strReplaceAll);
        sb.append("',<");
        sb.append(this.f42848);
        sb.append(">");
        sb.append(str);
        sb.append(",");
        sb.append(this.f42847);
        sb.append(":");
        return C12669.m31437(this.f42853, "]", sb);
    }
}
