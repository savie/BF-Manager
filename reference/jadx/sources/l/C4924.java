package l;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ۙ۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7DQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4924 extends AbstractC22078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PrintWriter f17183;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public PrintWriter f17184;

    public C4924() {
        PrintStream printStream = System.out;
        PrintStream printStream2 = System.err;
        this.f17184 = new PrintWriter((OutputStream) printStream, true);
        this.f17183 = new PrintWriter((OutputStream) printStream2, true);
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۤ */
    public final void mo3881(String str) {
        this.f17184.println(str);
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ */
    public final void mo3879(String str) {
        this.f17184.print(str);
    }

    @Override // l.AbstractC22078
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo15108(String str) {
        this.f17183.println(str);
    }

    @Override // l.AbstractC22078
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo15110(String str) {
        this.f17183.print(str);
    }

    @Override // l.AbstractC22078, l.InterfaceC13676
    /* JADX INFO: renamed from: ᩷ */
    public final void mo3883(String str) {
        PrintWriter printWriter = this.f17183;
        try {
            this.f17184.flush();
        } finally {
            printWriter.flush();
        }
    }

    @Override // l.AbstractC22078
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15106(Throwable th) {
        th.printStackTrace(this.f17183);
    }

    @Override // l.AbstractC22078
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13676 mo15107() {
        return new C2490(this.f17184);
    }

    @Override // l.AbstractC22078
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC13676 mo15109() {
        return new C2490(this.f17183);
    }

    @Override // l.InterfaceC13676
    public final void flush() {
        this.f17184.flush();
        this.f17183.flush();
    }
}
