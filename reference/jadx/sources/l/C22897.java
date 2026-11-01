package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes2.dex */
public class C22897 extends AbstractC23941 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public String f74444;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5720;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("saveAsPath"), m41585("title"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        mo21457(m41585("title"));
        m41562(R.string.MT_Protector);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Throwable {
        C2455 c2455;
        Throwable th;
        C2455 c2456;
        Throwable th2;
        AbstractC20745 abstractC20745M41587 = m41587("inputPath1");
        AbstractC20745 abstractC20745M41588 = m41587("inputPath2");
        C2455 c2457 = new C2455(abstractC20745M41587);
        try {
            try {
                C2455 c2458 = new C2455(abstractC20745M41588);
                try {
                    HashMap map = new HashMap(c2457.m7485());
                    HashMap map2 = new HashMap(c2458.m7485());
                    C22212 c22212M7483 = c2457.m7483();
                    C22212 c22212M7484 = c2458.m7483();
                    Iterator it = c2457.m7466().iterator();
                    while (true) {
                        String str = "Comparing encrypted files is not supported";
                        if (it.hasNext()) {
                            try {
                                C12107 c12107 = (C12107) it.next();
                                if (!c12107.isDirectory()) {
                                    if (c12107.m30133()) {
                                        c2455 = c2457;
                                        throw new IOException("Comparing encrypted files is not supported");
                                    }
                                    c2455 = c2457;
                                    C22212 c22212 = c22212M7483;
                                    try {
                                        map.put(c12107.getName(), new C13019(c12107.getName(), c12107.getSize(), new C1023(c12107), c22212M7483, c12107));
                                        c2457 = c2455;
                                        c22212M7483 = c22212;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                    th2 = th;
                                    c2456 = c2458;
                                    try {
                                        c2456.close();
                                        throw th2;
                                    } catch (Throwable th4) {
                                        th2.addSuppressed(th4);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c2455 = c2457;
                            }
                        } else {
                            c2455 = c2457;
                            try {
                                Iterator it2 = c2458.m7466().iterator();
                                while (it2.hasNext()) {
                                    C12107 c12108 = (C12107) it2.next();
                                    if (!c12108.isDirectory()) {
                                        if (c12108.m30133()) {
                                            throw new IOException(str);
                                        }
                                        Iterator it3 = it2;
                                        c2456 = c2458;
                                        C22212 c22213 = c22212M7484;
                                        C22212 c22214 = c22212M7484;
                                        String str2 = str;
                                        try {
                                            map2.put(c12108.getName(), new C3845(c12108.getName(), c12108.getSize(), new C1023(c12108), c22213, c12108));
                                            str = str2;
                                            c2458 = c2456;
                                            it2 = it3;
                                            c22212M7484 = c22214;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                        th2 = th;
                                        c2456.close();
                                        throw th2;
                                    }
                                }
                                C2455 c2459 = c2458;
                                this.f74444 = C7608.m20143(abstractC20745M41587.mo33986(), abstractC20745M41588.mo33986(), map, map2, new C6668(this));
                                c2459.close();
                                c2455.close();
                                return m41583();
                            } catch (Throwable th7) {
                                th = th7;
                                c2456 = c2458;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c2455 = c2457;
                }
            } catch (Throwable th9) {
                th = th9;
                th = th;
                try {
                    c2455.close();
                    throw th;
                } catch (Throwable th10) {
                    th.addSuppressed(th10);
                    throw th;
                }
            }
        } catch (Throwable th11) {
            th = th11;
            c2455 = c2457;
            th = th;
            c2455.close();
            throw th;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380()) {
            if (this.f74444.isEmpty()) {
                C15829.m37618(R.string.MT_Protector);
                return;
            }
            String str = this.f74444;
            String strM41585 = m41585("title");
            String strM41586 = m41585("saveAsPath");
            int i = C12859.f42771;
            ActivityC21135.m47562(main, str, strM41585, strM41586, "syntax:INTERNAL:".concat("FolderComparison"));
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
