package l;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۢܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5GD */
/* JADX INFO: loaded from: classes4.dex */
public class C10229 extends AbstractC13213 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11721 f32681 = new C19180();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2375 f32682 = new C2375();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10229 m26365(C23656 c23656) {
        return (C10229) new C16196(c23656, f32681).m38422(C10229.class);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m26367() {
        C2375 c2375 = this.f32682;
        int iM8074 = c2375.m8074();
        for (int i = 0; i < iM8074; i++) {
            ((C7993) c2375.m8075(i)).getClass();
        }
    }

    @Override // l.AbstractC13213
    /* JADX INFO: renamed from: ۤ */
    public final void mo6417() {
        C2375 c2375 = this.f32682;
        if (c2375.m8074() > 0) {
            ((C7993) c2375.m8075(0)).getClass();
            throw null;
        }
        int i = c2375.f7644;
        Object[] objArr = c2375.f7642;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c2375.f7644 = 0;
        c2375.f7643 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26366(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C2375 c2375 = this.f32682;
        if (c2375.m8074() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + ASN1Dump.TAB;
            if (c2375.m8074() <= 0) {
                return;
            }
            C7993 c7993 = (C7993) c2375.m8075(0);
            printWriter.print(str);
            printWriter.print("  #");
            if (c2375.f7643) {
                C8341.m22447(c2375);
            }
            printWriter.print(c2375.f7645[0]);
            printWriter.print(": ");
            printWriter.println(c7993.toString());
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
