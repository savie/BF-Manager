package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۠ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195D */
/* JADX INFO: loaded from: classes4.dex */
public class C7875 extends AbstractC23941 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f25910;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f25911;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5729;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, C6730.m18175(m41585("file")), C16737.m39288(R.string.MT_Protector));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws IOException {
        AbstractC20745 abstractC20745M46733;
        AbstractC20745 abstractC20745M41587 = m41587("file");
        this.f25910 = abstractC20745M41587;
        if (!abstractC20745M41587.mo33975()) {
            abstractC20745M46733 = this.f25910;
        } else {
            abstractC20745M46733 = this.f25910.m46733(".tmp");
        }
        this.f25911 = abstractC20745M46733;
        AbstractC20745[] abstractC20745ArrM15322 = C5553.m15322(m41566("ARG_PATHS"));
        boolean zM41573 = m41573("removeSources");
        long jMo33964 = 0;
        for (AbstractC20745 abstractC20745 : abstractC20745ArrM15322) {
            jMo33964 += abstractC20745.mo33964();
        }
        C8516 c8516 = new C8516(jMo33964);
        c8516.m22241(new C9058(this));
        BufferedOutputStream bufferedOutputStreamM46708 = this.f25911.m46708();
        try {
            byte[] bArr = new byte[1024];
            for (AbstractC20745 abstractC20746 : abstractC20745ArrM15322) {
                mo41554(abstractC20746.getName());
                InputStream inputStreamMo33970 = abstractC20746.mo33970();
                do {
                    try {
                        int i = inputStreamMo33970.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        c8516.m22242(i);
                        bufferedOutputStreamM46708.write(bArr, 0, i);
                    } catch (Throwable th) {
                        if (inputStreamMo33970 != null) {
                            try {
                                inputStreamMo33970.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } while (!mo2357());
                inputStreamMo33970.close();
            }
            bufferedOutputStreamM46708.close();
            if (mo2357()) {
                return C5202.m14378();
            }
            if (zM41573) {
                boolean z = abstractC20745ArrM15322.length > 1;
                if (z) {
                    m41591(R.string.MT_Protector);
                    mo21455(0);
                }
                for (AbstractC20745 abstractC20747 : abstractC20745ArrM15322) {
                    if (z) {
                        mo41554(abstractC20747.getName());
                    }
                    abstractC20747.mo24644();
                }
            }
            AbstractC20745 abstractC20748 = this.f25910;
            AbstractC20745 abstractC20749 = this.f25911;
            if (abstractC20748 != abstractC20749) {
                abstractC20749.m46699(abstractC20748, (Runnable) null);
            }
            return C5202.m14379();
        } catch (Throwable th3) {
            try {
                bufferedOutputStreamM46708.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (m41579(c11545) && c5202.m14380()) {
            c11545.m28831();
            c11545.m28763(this.f25910.getName());
            c11545.m28830();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        AbstractC20745 abstractC20745;
        if (!c5202.m14380() && (abstractC20745 = this.f25911) != null) {
            abstractC20745.mo24644();
        }
        C21094.m47530();
    }
}
