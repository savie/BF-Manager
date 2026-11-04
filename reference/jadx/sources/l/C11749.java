package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195D */
/* JADX INFO: loaded from: classes4.dex */
public class C11749 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f37989;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f37990;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46060;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, C11293.m28558(m43865("file")), C21576.m49088(R.string.MT_Protector));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws IOException {
        AbstractC22044 abstractC22044M49862;
        AbstractC22044 abstractC22044M43860 = m43860("file");
        this.f37989 = abstractC22044M43860;
        if (!abstractC22044M43860.mo2934()) {
            abstractC22044M49862 = this.f37989;
        } else {
            abstractC22044M49862 = this.f37989.m49862(".tmp");
        }
        this.f37990 = abstractC22044M49862;
        AbstractC22044[] abstractC22044ArrM35201 = C14584.m35201(m43831("ARG_PATHS"));
        boolean zM43847 = m43847("removeSources");
        long jMo4285 = 0;
        for (AbstractC22044 abstractC22044 : abstractC22044ArrM35201) {
            jMo4285 += abstractC22044.mo4285();
        }
        C3374 c3374 = new C3374(jMo4285);
        c3374.m11078(new C5087(5, this));
        BufferedOutputStream bufferedOutputStreamM49869 = this.f37990.m49869();
        try {
            byte[] bArr = new byte[1024];
            for (AbstractC22044 abstractC22045 : abstractC22044ArrM35201) {
                mo29447(abstractC22045.getName());
                InputStream inputStreamMo4290 = abstractC22045.mo4290();
                do {
                    try {
                        int i = inputStreamMo4290.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        c3374.m11079(i);
                        bufferedOutputStreamM49869.write(bArr, 0, i);
                    } catch (Throwable th) {
                        if (inputStreamMo4290 != null) {
                            try {
                                inputStreamMo4290.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } while (!mo924());
                inputStreamMo4290.close();
            }
            bufferedOutputStreamM49869.close();
            if (mo924()) {
                return C12187.m30469();
            }
            if (zM43847) {
                boolean z = abstractC22044ArrM35201.length > 1;
                if (z) {
                    m43868(R.string.MT_Protector);
                    mo16839(0);
                }
                for (AbstractC22044 abstractC22046 : abstractC22044ArrM35201) {
                    if (z) {
                        mo29447(abstractC22046.getName());
                    }
                    abstractC22046.mo4287();
                }
            }
            AbstractC22044 abstractC22047 = this.f37989;
            AbstractC22044 abstractC22048 = this.f37990;
            if (abstractC22047 != abstractC22048) {
                abstractC22048.m49845(abstractC22047, (Runnable) null);
            }
            return C12187.m30468();
        } catch (Throwable th3) {
            try {
                bufferedOutputStreamM49869.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (m43863(c8614) && c12187.m30474()) {
            c8614.m23209();
            c8614.m23230(this.f37989.getName());
            c8614.m23216();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        AbstractC22044 abstractC22044;
        if (!c12187.m30474() && (abstractC22044 = this.f37990) != null) {
            abstractC22044.mo4287();
        }
        C6331.m18055();
    }
}
