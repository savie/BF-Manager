package l;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۡܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8959 extends EnumC19730 {
    public /* synthetic */ C8959(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("XSTDOUT", 57, "-Xstdout", "opt.arg.file", "opt.Xstdout", enumC19024, enumC18318);
    }

    public C8959(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2368(AbstractC10558 abstractC10558, String str, String str2) throws C21846 {
        try {
            abstractC10558.mo12004().m46172(new PrintWriter((Writer) new FileWriter(str2), true));
            super.mo2368(abstractC10558, str, str2);
        } catch (IOException e) {
            String message = e.getMessage();
            C5909 c5909 = C23879.f77204;
            throw abstractC10558.m26710(new C5909("compiler", "error.writing.file", str2, message));
        }
    }
}
