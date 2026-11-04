package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes3.dex */
public class C6926 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22930 = 0;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f22931;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f22932;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46054;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        m43859(R.string.MT_Protector);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws IOException {
        List<AbstractC22044> list = (List) C13847.stream(m43831("ARG_PATHS")).map(new C8417(0)).collect(C2025.toList());
        C19647 c19647M45292 = C19647.m45292(15);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BufferedInputStream bufferedInputStreamM49875 = ((AbstractC22044) it.next()).m49875();
            try {
                C19647 c19647M45293 = C19647.m45293(C25128.m55997(bufferedInputStreamM49875));
                bufferedInputStreamM49875.close();
                if (c19647M45292.f63286 < c19647M45293.f63286) {
                    c19647M45292 = c19647M45293;
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStreamM49875.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        boolean z = ApplicationC17729.f58258.getBoolean("delete_dex_files_after_merged", false);
        C8850 c8850 = new C8850(c19647M45292);
        for (AbstractC22044 abstractC22044 : list) {
            mo16839(0);
            mo29447(C21576.m49059(R.string.MT_Protector, abstractC22044.getName()));
            InputStream inputStreamMo4290 = abstractC22044.mo4290();
            try {
                C24975 c24975M55778 = C24975.m55778(inputStreamMo4290);
                int iM55804 = c24975M55778.m55804();
                int i = 0;
                for (C22737 c22737 : (AbstractC8696) c24975M55778.mo4327()) {
                    if (mo924()) {
                        C12187 c12187M30469 = C12187.m30469();
                        inputStreamMo4290.close();
                        return c12187M30469;
                    }
                    mo16839(i / iM55804);
                    c8850.m23712((InterfaceC10122) c22737);
                    i += 100;
                    if (c8850.f74918.getItemCount() > 65536) {
                        throw new C4866(R.string.MT_Protector);
                    }
                    if (c8850.f74937.getItemCount() > 65536) {
                        throw new C4866(R.string.MT_Protector);
                    }
                    if (c8850.f74939.getItemCount() > 65536) {
                        throw new C4866("Merge failed, too many type references in Dex, you can try to merge fewer dex files.");
                    }
                }
                inputStreamMo4290.close();
            } catch (Throwable th3) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        m43859(R.string.MT_Protector);
        AbstractC22044 abstractC22044M35193 = C14584.m35193(m43865("outputPath"), new String[0]);
        this.f22931 = abstractC22044M35193;
        if (!z || !abstractC22044M35193.mo2934()) {
            c8850.m52044(this.f22931);
            if (z) {
                m19206(list);
            }
        } else {
            AbstractC22044 abstractC22044M49862 = this.f22931.m49862(".tmp");
            this.f22932 = abstractC22044M49862;
            c8850.m52044(abstractC22044M49862);
            m19206(list);
            this.f22932.m49845(this.f22931, (Runnable) null);
        }
        return C12187.m30468();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19206(List list) {
        boolean z = list.size() > 1;
        if (z) {
            m43868(R.string.MT_Protector);
            mo16839(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC22044 abstractC22044 = (AbstractC22044) it.next();
            if (z) {
                mo29447(abstractC22044.getName());
            }
            abstractC22044.mo4296();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
            c8614.m23230(this.f22931.getName());
            c8614.m23216();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        AbstractC22044 abstractC22044 = this.f22932;
        if (abstractC22044 != null) {
            abstractC22044.mo4296();
        }
        C6331.m18055();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49088(R.string.MT_Protector);
    }
}
