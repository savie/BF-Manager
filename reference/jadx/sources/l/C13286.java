package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes4.dex */
public class C13286 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public String f42438;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46047;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("saveAsPath"), m43865("title"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        mo16837(m43865("title"));
        m43859(R.string.MT_Protector);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Throwable {
        C22941 c22941;
        Throwable th;
        C22941 c22942;
        Throwable th2;
        AbstractC22044 abstractC22044M43860 = m43860("inputPath1");
        AbstractC22044 abstractC22044M43861 = m43860("inputPath2");
        C22941 c22943 = new C22941(abstractC22044M43860);
        try {
            try {
                C22941 c22944 = new C22941(abstractC22044M43861);
                try {
                    HashMap map = new HashMap(c22943.m51749());
                    HashMap map2 = new HashMap(c22944.m51749());
                    C15481 c15481M51723 = c22943.m51723();
                    C15481 c15481M51724 = c22944.m51723();
                    Iterator it = c22943.m51742().iterator();
                    while (true) {
                        String str = "Comparing encrypted files is not supported";
                        if (it.hasNext()) {
                            try {
                                C8002 c8002 = (C8002) it.next();
                                if (!c8002.isDirectory()) {
                                    if (c8002.m21856()) {
                                        c22941 = c22943;
                                        throw new IOException("Comparing encrypted files is not supported");
                                    }
                                    c22941 = c22943;
                                    C15481 c15481 = c15481M51723;
                                    try {
                                        map.put(c8002.getName(), new C22983(c8002.getName(), c8002.getSize(), new C11048(c8002), c15481M51723, c8002));
                                        c22943 = c22941;
                                        c15481M51723 = c15481;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                    th2 = th;
                                    c22942 = c22944;
                                    try {
                                        c22942.close();
                                        throw th2;
                                    } catch (Throwable th4) {
                                        th2.addSuppressed(th4);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c22941 = c22943;
                            }
                        } else {
                            c22941 = c22943;
                            try {
                                Iterator it2 = c22944.m51742().iterator();
                                while (it2.hasNext()) {
                                    C8002 c8003 = (C8002) it2.next();
                                    if (!c8003.isDirectory()) {
                                        if (c8003.m21856()) {
                                            throw new IOException(str);
                                        }
                                        Iterator it3 = it2;
                                        c22942 = c22944;
                                        C15481 c15482 = c15481M51724;
                                        C15481 c15483 = c15481M51724;
                                        String str2 = str;
                                        try {
                                            map2.put(c8003.getName(), new C19999(c8003.getName(), c8003.getSize(), new C11048(c8003), c15482, c8003));
                                            str = str2;
                                            c22944 = c22942;
                                            it2 = it3;
                                            c15481M51724 = c15483;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                        th2 = th;
                                        c22942.close();
                                        throw th2;
                                    }
                                }
                                C22941 c22945 = c22944;
                                this.f42438 = C7545.m20622(abstractC22044M43860.mo4294(), abstractC22044M43861.mo4294(), map, map2, new C15523(this));
                                c22945.close();
                                c22941.close();
                                return m43857();
                            } catch (Throwable th7) {
                                th = th7;
                                c22942 = c22944;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c22941 = c22943;
                }
            } catch (Throwable th9) {
                th = th9;
                th = th;
                try {
                    c22941.close();
                    throw th;
                } catch (Throwable th10) {
                    th.addSuppressed(th10);
                    throw th;
                }
            }
        } catch (Throwable th11) {
            th = th11;
            c22941 = c22943;
            th = th;
            c22941.close();
            throw th;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474()) {
            if (this.f42438.isEmpty()) {
                C22673.m51159(R.string.MT_Protector);
                return;
            }
            String str = this.f42438;
            String strM43865 = m43865("title");
            String strM43866 = m43865("saveAsPath");
            int i = C9341.f30354;
            ActivityC4300.m13685(main, str, strM43865, strM43866, "syntax:INTERNAL:".concat("FolderComparison"));
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
