package l;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.۬᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5GD */
/* JADX INFO: loaded from: classes4.dex */
public class C13377 extends AbstractC8956 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20950 f44313 = new C1381();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17212 f44314 = new C17212();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13377 m32876(C12484 c12484) {
        return (C13377) new C16717(c12484, f44313).m39205(C13377.class);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m32877() {
        C17212 c17212 = this.f44314;
        int iM40147 = c17212.m40147();
        for (int i = 0; i < iM40147; i++) {
            ((C22549) c17212.m40141(i)).getClass();
        }
    }

    @Override // l.AbstractC8956
    /* JADX INFO: renamed from: ۨ */
    public final void mo17355() {
        C17212 c17212 = this.f44314;
        if (c17212.m40147() > 0) {
            ((C22549) c17212.m40141(0)).getClass();
            throw null;
        }
        c17212.m40145();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32878(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C17212 c17212 = this.f44314;
        if (c17212.m40147() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + ASN1Dump.TAB;
            if (c17212.m40147() <= 0) {
                return;
            }
            C22549 c22549 = (C22549) c17212.m40141(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c17212.m40142(0));
            printWriter.print(": ");
            printWriter.println(c22549.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }
}
