package l;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ᩳۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19048 extends EnumC7687 {
    public /* synthetic */ C19048(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("XSTDOUT", 57, "-Xstdout", "opt.arg.file", "opt.Xstdout", enumC18128, enumC21112);
    }

    public C19048(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) throws C14398 {
        try {
            abstractC9923.mo25754().m20034(new PrintWriter((Writer) new FileWriter(str2), true));
            super.mo4242(abstractC9923, str, str2);
        } catch (IOException e) {
            String message = e.getMessage();
            C11040 c11040 = C22843.f74058;
            throw abstractC9923.m25755(new C11040("compiler", "error.writing.file", str2, message));
        }
    }
}
