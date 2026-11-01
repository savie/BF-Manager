package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes3.dex */
public class C1749 extends AbstractC23941 {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6874 = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f6875;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f6876;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5727;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        m41562(R.string.MT_Protector);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws IOException {
        List<AbstractC20745> list = (List) C20318.stream(m41566("ARG_PATHS")).map(new C11739(1)).collect(C1890.toList());
        C7474 c7474M19963 = C7474.m19963(15);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BufferedInputStream bufferedInputStreamM46719 = ((AbstractC20745) it.next()).m46719();
            try {
                C7474 c7474M19961 = C7474.m19961(C10665.m26865(bufferedInputStreamM46719));
                bufferedInputStreamM46719.close();
                if (c7474M19963.f24881 < c7474M19961.f24881) {
                    c7474M19963 = c7474M19961;
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStreamM46719.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        boolean z = ApplicationC0716.f2992.getBoolean("delete_dex_files_after_merged", false);
        C8485 c8485 = new C8485(c7474M19963);
        for (AbstractC20745 abstractC20745 : list) {
            mo21455(0);
            mo41554(C16737.m39264(R.string.MT_Protector, abstractC20745.getName()));
            InputStream inputStreamMo33970 = abstractC20745.mo33970();
            try {
                C17684 c17684M41160 = C17684.m41160(inputStreamMo33970);
                int iM41201 = c17684M41160.m41201();
                int i = 0;
                for (C7807 c7807 : (AbstractC18494) c17684M41160.mo34148()) {
                    if (mo2357()) {
                        C5202 c5202M14378 = C5202.m14378();
                        inputStreamMo33970.close();
                        return c5202M14378;
                    }
                    mo21455(i / iM41201);
                    c8485.m22160((InterfaceC22762) c7807);
                    i += 100;
                    if (c8485.f51694.getItemCount() > 65536) {
                        throw new C4987(R.string.MT_Protector);
                    }
                    if (c8485.f51680.getItemCount() > 65536) {
                        throw new C4987(R.string.MT_Protector);
                    }
                    if (c8485.f51666.getItemCount() > 65536) {
                        throw new C4987("Merge failed, too many type references in Dex, you can try to merge fewer dex files.");
                    }
                }
                inputStreamMo33970.close();
            } catch (Throwable th3) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        m41562(R.string.MT_Protector);
        AbstractC20745 abstractC20745M15313 = C5553.m15313(m41585("outputPath"), new String[0]);
        this.f6875 = abstractC20745M15313;
        if (!z || !abstractC20745M15313.mo33975()) {
            c8485.m37937(this.f6875);
            if (z) {
                m5795(list);
            }
        } else {
            AbstractC20745 abstractC20745M46733 = this.f6875.m46733(".tmp");
            this.f6876 = abstractC20745M46733;
            c8485.m37937(abstractC20745M46733);
            m5795(list);
            this.f6876.m46699(this.f6875, (Runnable) null);
        }
        return C5202.m14379();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5795(List list) {
        boolean z = list.size() > 1;
        if (z) {
            m41591(R.string.MT_Protector);
            mo21455(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC20745 abstractC20745 = (AbstractC20745) it.next();
            if (z) {
                mo41554(abstractC20745.getName());
            }
            abstractC20745.mo24647();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
            c11545.m28763(this.f6875.getName());
            c11545.m28830();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        AbstractC20745 abstractC20745 = this.f6876;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
        C21094.m47530();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39288(R.string.MT_Protector);
    }
}
