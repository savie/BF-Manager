package l;

import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes4.dex */
public final class C16823 implements InterfaceC2753 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PrintWriter f53855;

    public C16823(PrintWriter printWriter) {
        this.f53855 = printWriter;
    }

    @Override // l.InterfaceC2753
    /* JADX INFO: renamed from: ۙ */
    public final void mo8400(C5537 c5537) {
        PrintWriter printWriter = this.f53855;
        printWriter.print("exports ");
        printWriter.print(c5537.f18986.f25396);
        C21825 c21825 = c5537.f18987;
        List listUnmodifiableList = c21825 == null ? null : C0561.unmodifiableList(c21825);
        if (listUnmodifiableList != null) {
            printWriter.print(" to ");
            printWriter.print((String) C9030.stream(listUnmodifiableList).map(new C13256(4)).collect(C1890.joining(", ")));
        }
    }

    @Override // l.InterfaceC2753
    /* JADX INFO: renamed from: ۙ */
    public final void mo8398(C1303 c1303) {
        PrintWriter printWriter = this.f53855;
        printWriter.print("opens ");
        printWriter.print(c1303.f5571.f25396);
        C21825 c21825 = c1303.f5572;
        List listUnmodifiableList = c21825 == null ? null : C0561.unmodifiableList(c21825);
        if (listUnmodifiableList != null) {
            printWriter.print(" to ");
            printWriter.print((String) C9030.stream(listUnmodifiableList).map(new C13256(4)).collect(C1890.joining(", ")));
        }
    }

    @Override // l.InterfaceC2753
    /* JADX INFO: renamed from: ۙ */
    public final void mo8399(C4125 c4125) {
        PrintWriter printWriter = this.f53855;
        printWriter.print("provides ");
        printWriter.print(c4125.f15099.f73419);
        printWriter.print(" with ");
        printWriter.print((String) C9030.stream(c4125.f15098).map(new C13256(4)).collect(C1890.joining(", ")));
    }

    @Override // l.InterfaceC2753
    /* JADX INFO: renamed from: ۙ */
    public final void mo8401(C6948 c6948) {
        PrintWriter printWriter = this.f53855;
        printWriter.print("requires ");
        Set set = c6948.f23370;
        if (set.contains(EnumC23177.STATIC_PHASE)) {
            printWriter.print("static ");
        }
        if (set.contains(EnumC23177.TRANSITIVE)) {
            printWriter.print("transitive ");
        }
        printWriter.print(c6948.f23371.f77453);
    }

    @Override // l.InterfaceC2753
    /* JADX INFO: renamed from: ۙ */
    public final void mo8402(C15416 c15416) {
        PrintWriter printWriter = this.f53855;
        printWriter.print("uses ");
        printWriter.print(c15416.f50252.f73419);
    }
}
