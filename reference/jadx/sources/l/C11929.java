package l;

import java.io.IOError;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۧ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11929 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C2346 f38425 = C2346.m7914((Integer) (-1), (Integer) (-1));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3726 f38426;

    public C11929(AbstractC3726 abstractC3726) {
        this.f38426 = abstractC3726;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29886(C4472 c4472, C11338 c11338, AbstractC3726 abstractC3726) throws C25356 {
        C4747 c4747 = new C4747();
        C5536 c5536 = new C5536();
        c4747.m14644(InterfaceC1807.class, c5536);
        C13015.m32421(c4747).m32426("allowStringFolding", "false");
        C13015.m32421(c4747).m32426("--enable-preview", "true");
        try {
            new C2026(c4747, true, StandardCharsets.UTF_8).m6986(EnumC6282.PLATFORM_CLASS_PATH, AbstractC1928.of());
            C2235 c2235 = new C2235(URI.create("source"), EnumC17468.SOURCE, c4472);
            C7312.m20023(c4747).m34530(c2235);
            C19113 c19113M53297 = C4483.m14186(c4747).m14187(c4472.m14168(), true, true, true, false).m53297();
            c19113M53297.f61856 = c2235;
            c4472.m14166(c19113M53297);
            Iterable iterableM39338 = C16625.m39338(c5536.m16447(), new C5964());
            if (!C16625.m39336(iterableM39338)) {
                throw new C25356(C16625.m39330(iterableM39338, new C25272(6)));
            }
            C1269 c1269 = new C1269(c4472, c11338);
            new C1644(c1269, abstractC3726.mo12127().m53213()).m5912(c19113M53297);
            c1269.m4612(c4472.m14168().length());
            c1269.m4599();
            C25136 c25136 = new C25136();
            AbstractC14956 abstractC14956ListIterator = c1269.m4607().listIterator(0);
            while (abstractC14956ListIterator.hasNext()) {
                ((InterfaceC18422) abstractC14956ListIterator.next()).mo2485(c25136);
            }
            AbstractC11709 abstractC11709M56042 = c25136.m56042();
            abstractC11709M56042.mo6933(c11338.m28633(), new C15438());
            abstractC11709M56042.mo6934(c11338);
            c11338.m28635();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29887(AbstractC15460 abstractC15460, AbstractC22174 abstractC22174) {
        String strMo37016 = abstractC15460.mo37016();
        AbstractC1928 abstractC1928Of = AbstractC1928.of((Object) C2346.m7914((Integer) 0, Integer.valueOf(strMo37016.length())));
        C4472 c4472 = new C4472(strMo37016);
        AbstractC3726 abstractC3726 = this.f38426;
        if (abstractC3726.mo12128()) {
            c4472 = C6119.m17663(c4472, abstractC1928Of);
        }
        String strM48705 = C21406.m48705(strMo37016);
        C11338 c11338 = new C11338(strM48705, c4472, new C17896(strM48705, abstractC3726));
        try {
            m29886(c4472, c11338, abstractC3726);
            String strM28626 = C11338.m28626(strMo37016, c11338.m28629(c4472.m14165((Collection) abstractC1928Of)));
            strM28626.getClass();
            abstractC22174.mo3854().append((CharSequence) strM28626);
        } catch (C17676 e) {
            throw new C25356(e.m41343());
        }
    }
}
