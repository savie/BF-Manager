package l;

/* JADX INFO: renamed from: l.ܺܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7DP */
/* JADX INFO: loaded from: classes5.dex */
public final class C16078 extends AbstractC21016 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f51993 = new StringBuilder();

    @Override // l.InterfaceC10434
    public final void flush() {
    }

    @Override // l.AbstractC21016
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10434 mo20148() {
        return this;
    }

    @Override // l.AbstractC21016
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC10434 mo20149() {
        return this;
    }

    public final String toString() {
        return this.f51993.toString();
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۨ */
    public final void mo18527(String str) {
        StringBuilder sb = this.f51993;
        sb.append(str);
        sb.append(System.lineSeparator());
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ */
    public final void mo18524(String str) {
        this.f51993.append(str);
    }

    @Override // l.AbstractC21016
    /* JADX INFO: renamed from: ۚ */
    public final void mo20147(String str) {
        StringBuilder sb = this.f51993;
        sb.append(str);
        sb.append(System.lineSeparator());
    }

    @Override // l.AbstractC21016
    /* JADX INFO: renamed from: ۖ */
    public final void mo20145(String str) {
        this.f51993.append(str);
    }

    @Override // l.AbstractC21016
    /* JADX INFO: renamed from: ۙ */
    public final void mo20146(Throwable th) {
        this.f51993.append(C9023.m23355(th));
    }
}
