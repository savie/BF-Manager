package l;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.۟ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7DQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7611 extends AbstractC21016 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PrintWriter f25164;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public PrintWriter f25165;

    public C7611() {
        PrintStream printStream = System.out;
        PrintStream printStream2 = System.err;
        this.f25165 = new PrintWriter((OutputStream) printStream, true);
        this.f25164 = new PrintWriter((OutputStream) printStream2, true);
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۨ */
    public final void mo18527(String str) {
        this.f25165.println(str);
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ */
    public final void mo18524(String str) {
        this.f25165.print(str);
    }

    @Override // l.AbstractC21016
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo20147(String str) {
        this.f25164.println(str);
    }

    @Override // l.AbstractC21016
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo20145(String str) {
        this.f25164.print(str);
    }

    @Override // l.AbstractC21016, l.InterfaceC10434
    /* JADX INFO: renamed from: ܰ */
    public final void mo18529(String str) {
        PrintWriter printWriter = this.f25164;
        try {
            this.f25165.flush();
        } finally {
            printWriter.flush();
        }
    }

    @Override // l.AbstractC21016
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20146(Throwable th) {
        th.printStackTrace(this.f25164);
    }

    @Override // l.AbstractC21016
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10434 mo20148() {
        return new C18900(this.f25165);
    }

    @Override // l.AbstractC21016
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10434 mo20149() {
        return new C18900(this.f25164);
    }

    @Override // l.InterfaceC10434
    public final void flush() {
        this.f25165.flush();
        this.f25164.flush();
    }
}
