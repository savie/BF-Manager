package l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܿ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes5.dex */
public class C17595 extends AbstractC12652 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f55923 = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f55924;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f55926;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f55927;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f55928 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f55925 = C11904.f39936.m46728();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5720;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("saveAsPath"), C16737.m39288(R.string.MT_Protector));
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
        AbstractC20745 abstractC20745 = this.f55925;
        AbstractC20745 abstractC20745M41587 = m41587("saveAsPath");
        AbstractC20745 abstractC20745M41588 = m41587("inputPath1");
        AbstractC20745 abstractC20745M41589 = m41587("inputPath2");
        AbstractC20745 abstractC20745M46728 = C11904.f39941.m46728();
        this.f55926 = abstractC20745M46728;
        C22918 c22918 = new C22918(abstractC20745M46728);
        try {
            c22918.m50733(0);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c22918.m50720());
            mo41554(C16737.m39264(R.string.MT_Protector, abstractC20745M41588.getName()));
            AbstractC20745 abstractC20745M17402 = C6306.m17402(abstractC20745M41588);
            for (C16696 c16696 : C6112.m17076(abstractC20745M17402, abstractC20745)) {
                c22918.m50725("a/" + c16696.m39171());
                c16696.m39172(bufferedOutputStream);
                bufferedOutputStream.flush();
                if (mo2357()) {
                    break;
                }
            }
            abstractC20745.mo24647();
            if (abstractC20745M17402 != abstractC20745M41588) {
                abstractC20745M17402.mo24644();
            }
            if (mo2357()) {
                C5202 c5202M14378 = C5202.m14378();
                c22918.close();
                return c5202M14378;
            }
            System.gc();
            mo41554(C16737.m39264(R.string.MT_Protector, abstractC20745M41589.getName()));
            AbstractC20745 abstractC20745M17403 = C6306.m17402(abstractC20745M41589);
            for (C16696 c16697 : C6112.m17076(abstractC20745M17403, abstractC20745)) {
                c22918.m50725("b/" + c16697.m39171());
                c16697.m39172(bufferedOutputStream);
                bufferedOutputStream.flush();
                if (mo2357()) {
                    break;
                }
            }
            abstractC20745.mo24647();
            if (abstractC20745M17403 != abstractC20745M41589) {
                abstractC20745M17403.mo24644();
            }
            if (mo2357()) {
                C5202 c5202M14379 = C5202.m14378();
                c22918.close();
                return c5202M14379;
            }
            c22918.close();
            m41562(R.string.MT_Protector);
            HashMap map = new HashMap();
            this.f55927 = C11904.f39941.m46690(abstractC20745M41587.getName());
            C2455 c2455 = new C2455(this.f55926);
            try {
                C22918 c22919 = new C22918(this.f55927);
                try {
                    for (C12107 c12107 : c2455.m7466()) {
                        String name = c12107.getName();
                        if (name.startsWith("a/")) {
                            ((C16890) C9735.computeIfAbsent(map, name.substring(2), new C12657())).f54012 = c12107;
                        } else if (name.startsWith("b/")) {
                            ((C16890) C9735.computeIfAbsent(map, name.substring(2), new C12657())).f54013 = c12107;
                        }
                    }
                    C15676 c15676 = new C15676();
                    c15676.m37349("type", "arsc");
                    c15676.m37349("file1", abstractC20745M41588.mo33986());
                    c15676.m37349("file2", abstractC20745M41589.mo33986());
                    c15676.m37349("versionCode", (Object) 26101061);
                    c22919.m50725("info.json");
                    c22919.write(c15676.mo19151().getBytes(Charset.defaultCharset()));
                    for (Map.Entry entry : map.entrySet()) {
                        if (mo2357()) {
                            C5202 c5202M143710 = C5202.m14378();
                            c22919.close();
                            c2455.close();
                            return c5202M143710;
                        }
                        String str = (String) entry.getKey();
                        C16890 c16890 = (C16890) entry.getValue();
                        C12107 c12108 = c16890.f54012;
                        AtomicInteger atomicInteger = this.f55928;
                        if (c12108 != null && c16890.f54013 == null) {
                            c22919.m50725("a/" + str);
                            c22919.m50724(c2455.m7471(c16890.f54012));
                            atomicInteger.incrementAndGet();
                        } else if (c12108 == null && c16890.f54013 != null) {
                            c22919.m50725("b/" + str);
                            c22919.m50724(c2455.m7471(c16890.f54013));
                            atomicInteger.incrementAndGet();
                        } else if (!Arrays.equals(c2455.m7475(c12108, (C8516) null), c2455.m7475(c16890.f54013, (C8516) null))) {
                            c22919.m50725("a/" + str);
                            c22919.m50724(c2455.m7471(c16890.f54012));
                            c22919.m50725("b/" + str);
                            c22919.m50724(c2455.m7471(c16890.f54013));
                            atomicInteger.incrementAndGet();
                        }
                        try {
                            c2455.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                    c22919.close();
                    c2455.close();
                    return C5202.m14379();
                } catch (Throwable th2) {
                    try {
                        c22919.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                c2455.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                c22918.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        this.f55924 = true;
        m40913(main, c5202);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40913(ContextWrapper contextWrapper, C5202 c5202) {
        if (c5202.m14380()) {
            if (this.f55928.get() == 0) {
                this.f55927.mo24647();
                C15829.m37618(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC20431.class);
                intent.setData(this.f55927.m46732());
                intent.putExtra("savedAsPath", m41585("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        AbstractC20745 abstractC20745;
        if (!this.f55924) {
            m40913(C16737.m39277(), c5202);
        }
        if (!c5202.m14380() && (abstractC20745 = this.f55927) != null) {
            abstractC20745.mo24647();
        }
        AbstractC20745 abstractC20746 = this.f55926;
        if (abstractC20746 != null) {
            abstractC20746.mo24647();
        }
        this.f55925.mo24647();
        C21094.m47530();
    }
}
