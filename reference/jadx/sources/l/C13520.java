package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܰۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public class C13520 extends AbstractC20413 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44642 = 0;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public String f44643;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f44644 = new ArrayList();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws IOException {
        int i;
        AbstractC20745[] abstractC20745ArrM15322 = C5553.m15322(m41566("ARG_PATHS"));
        int i2 = 0;
        boolean z = abstractC20745ArrM15322.length == 1;
        if (z) {
            m46154();
        }
        String strM41585 = m41585("password");
        boolean zM41573 = m41573("removeSource");
        int i3 = C8101.f28366;
        try {
            boolean z2 = C21506.f69876;
            int length = abstractC20745ArrM15322.length;
            long jMo33964 = 0;
            int i4 = 0;
            while (true) {
                i = 20;
                if (i4 >= length) {
                    break;
                }
                jMo33964 += abstractC20745ArrM15322[i4].mo33964() - ((long) 20);
                i4++;
            }
            C8516 c8516 = new C8516(jMo33964);
            int i5 = 2;
            if (!z) {
                c8516.m22241(new C21450(i5, this));
            }
            int length2 = abstractC20745ArrM15322.length;
            while (i2 < length2) {
                final AbstractC20745 abstractC20745 = abstractC20745ArrM15322[i2];
                String name = abstractC20745.getName();
                this.f44643 = name;
                mo41554(name);
                AbstractC20745 abstractC20745M46706 = abstractC20745.m46706(name.endsWith(".encrypt") ? abstractC20745.m46718() : name.concat(".decrypt"));
                AbstractC20745 abstractC20745M46733 = abstractC20745M46706.mo33975() ? abstractC20745M46706.m46733(".tmp") : abstractC20745M46706;
                boolean z3 = zM41573;
                C8516 c8517 = c8516;
                C8516 c8518 = new C8516(abstractC20745.mo33964() - ((long) i));
                if (z) {
                    c8518.m22241(new C21450(2, this));
                } else {
                    c8518.m22241(new C1172(2, this));
                }
                C8101 c8101 = new C8101(abstractC20745, strM41585, new InterfaceC23949() { // from class: l.ۗۨ֨
                    @Override // l.InterfaceC23949
                    public final Object get() {
                        int i6 = C13520.f44642;
                        return new C17978(abstractC20745.getName());
                    }
                });
                try {
                    abstractC20745M46733.m46695(c8101, c8101.m21315(), new C4346(this, c8518, c8517));
                    c8101.close();
                    if (mo2357()) {
                        abstractC20745M46733.mo24644();
                        break;
                    }
                    if (abstractC20745M46733 != abstractC20745M46706) {
                        abstractC20745M46733.m46699(abstractC20745M46706, (Runnable) null);
                    }
                    this.f44644.add(abstractC20745M46706.getName());
                    if (z3) {
                        abstractC20745.mo24644();
                    }
                    i2++;
                    c8516 = c8517;
                    zM41573 = z3;
                    i = 20;
                } catch (Throwable th) {
                    try {
                        c8101.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            return m41583();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5728;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        String str = this.f44643;
        if (str == null) {
            str = "null";
        }
        return C16737.m39264(R.string.MT_Protector, str, C16737.m39288(R.string.MT_Protector));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        ArrayList arrayList = this.f44644;
        if (arrayList.isEmpty() || !m41579(c11545)) {
            return;
        }
        if (!mo2357()) {
            c11545.m28831();
        }
        c11545.m28777((Collection) arrayList);
        c11545.m28830();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
