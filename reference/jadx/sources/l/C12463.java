package l;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12463 implements InterfaceC9380 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f41550;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13985 f41551;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2093 f41552;

    public C12463(String str, C2093 c2093) throws IOException {
        this.f41550 = str;
        C13985 c13985 = new C13985(true);
        this.f41551 = c13985;
        c2093.m6636();
        this.f41552 = c2093;
        c13985.setOutput(c2093);
        c13985.startDocument("utf-8", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16696 m30942(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, C11018 c11018) {
        C2093 c2093 = this.f41552;
        int length = c2093.m6635().length();
        String str = this.f41550;
        C13985 c13985 = this.f41551;
        if (length <= 51200) {
            String string = c2093.toString();
            C8340 c8340M33835 = c13985.m33835();
            C16696 c16696 = new C16696();
            c16696.f53487 = str;
            c16696.f53490 = string;
            c16696.f53483 = c8340M33835;
            return c16696;
        }
        BufferedOutputStream bufferedOutputStreamM46708 = abstractC20745.m46708();
        try {
            C23967.m52797(bufferedOutputStreamM46708, c2093.m6635());
            bufferedOutputStreamM46708.close();
            C8340 c8340M33836 = c13985.m33835();
            C13638.requireNonNull(c8340M33836);
            c8340M33836.m21781(c11018);
            abstractC20746.m46697(c11018);
            c11018.m27774();
            if (c11018.m27788().length > 20480) {
                c11018.m27797();
            }
            C16696 c16697 = new C16696();
            c16697.f53487 = str;
            c16697.f53486 = abstractC20745;
            c16697.f53485 = abstractC20746;
            return c16697;
        } catch (Throwable th) {
            try {
                bufferedOutputStreamM46708.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ܰ */
    public final void mo24062(String str) {
        this.f41551.startTag(null, str);
    }

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ۙ */
    public final void mo24060(String str) {
        this.f41551.endTag(null, str);
    }

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ۙ */
    public final void mo24061(String str, String str2) throws IOException {
        this.f41551.attribute(null, str, str2);
    }

    @Override // l.InterfaceC9380
    public final void text(String str) {
        this.f41551.text(str);
    }
}
