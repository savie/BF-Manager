package l;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes3.dex */
public final class C4510 implements InterfaceC18525 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f16090;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1306 f16091;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C0560 f16092;

    public C4510(String str, C0560 c0560) throws IOException {
        this.f16090 = str;
        C1306 c1306 = new C1306(true);
        this.f16091 = c1306;
        c0560.m2567();
        this.f16092 = c0560;
        c1306.setOutput(c0560);
        c1306.startDocument("utf-8", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24648 m14231(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, C6178 c6178) {
        C0560 c0560 = this.f16092;
        int length = c0560.m2566().length();
        String str = this.f16090;
        C1306 c1306 = this.f16091;
        if (length <= 51200) {
            String string = c0560.toString();
            C2008 c2008M4762 = c1306.m4762();
            C24648 c24648 = new C24648();
            c24648.f79790 = str;
            c24648.f79792 = string;
            c24648.f79791 = c2008M4762;
            return c24648;
        }
        BufferedOutputStream bufferedOutputStreamM49869 = abstractC22044.m49869();
        try {
            C21443.m48762(bufferedOutputStreamM49869, c0560.m2566());
            bufferedOutputStreamM49869.close();
            C2008 c2008M4763 = c1306.m4762();
            C17359.requireNonNull(c2008M4763);
            c2008M4763.m6855(c6178);
            abstractC22045.m49844(c6178);
            c6178.m17793();
            if (c6178.m17808().length > 20480) {
                c6178.m17811();
            }
            C24648 c24649 = new C24648();
            c24649.f79790 = str;
            c24649.f79793 = abstractC22044;
            c24649.f79788 = abstractC22045;
            return c24649;
        } catch (Throwable th) {
            try {
                bufferedOutputStreamM49869.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14234(String str) {
        this.f16091.startTag(null, str);
    }

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14232(String str) {
        this.f16091.endTag(null, str);
    }

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14233(String str, String str2) {
        this.f16091.attribute(null, str, str2);
    }

    @Override // l.InterfaceC18525
    public final void text(String str) {
        this.f16091.text(str);
    }
}
