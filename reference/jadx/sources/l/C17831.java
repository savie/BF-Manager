package l;

import java.io.IOError;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

/* JADX INFO: renamed from: l.ᩳۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17831 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C9548 f56466 = C9548.m24401((Integer) (-1), (Integer) (-1));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7248 f56467;

    public C17831(AbstractC7248 abstractC7248) {
        this.f56467 = abstractC7248;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41406(C0192 c0192, C18806 c18806, AbstractC7248 abstractC7248) throws C18537 {
        C12343 c12343 = new C12343();
        C2047 c2047 = new C2047();
        c12343.m30657(InterfaceC9810.class, c2047);
        C14770.m35395(c12343).m35401("allowStringFolding", "false");
        C14770.m35395(c12343).m35401("--enable-preview", "true");
        try {
            new C14315(c12343, true, StandardCharsets.UTF_8).m34548(EnumC3584.PLATFORM_CLASS_PATH, AbstractC22433.of());
            C21359 c21359 = new C21359(URI.create("source"), EnumC11347.SOURCE, c0192);
            C20414.m46161(c12343).m48202(c21359);
            C10164 c10164M49922 = C15392.m36825(c12343).m36826(c0192.m1425(), true, true, true, false).m49922();
            c10164M49922.f34725 = c21359;
            c0192.m1421(c10164M49922);
            Iterable iterableM50474 = C22808.m50474(c2047.m6549(), new C15010());
            if (!C22808.m50473(iterableM50474)) {
                throw new C18537(C22808.m50466(iterableM50474, new C15037(10)));
            }
            C9320 c9320 = new C9320(c0192, c18806);
            new C18100(c9320, abstractC7248.mo19379().m25485()).m42146(c10164M49922);
            c9320.m23945(c0192.m1425().length());
            c9320.m23962();
            C18491 c18491 = new C18491();
            AbstractC16706 abstractC16706ListIterator = c9320.m23957().listIterator(0);
            while (abstractC16706ListIterator.hasNext()) {
                ((InterfaceC5791) abstractC16706ListIterator.next()).mo9550(c18491);
            }
            AbstractC17785 abstractC17785M42884 = c18491.m42884();
            abstractC17785M42884.mo10843(c18806.m43379(), new C6496());
            abstractC17785M42884.mo10844(c18806);
            c18806.m43381();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41407(AbstractC3632 abstractC3632, AbstractC5044 abstractC5044) {
        String strMo3381 = abstractC3632.mo3381();
        AbstractC22433 abstractC22433Of = AbstractC22433.of((Object) C9548.m24401((Integer) 0, Integer.valueOf(strMo3381.length())));
        C0192 c0192 = new C0192(strMo3381);
        AbstractC7248 abstractC7248 = this.f56467;
        if (abstractC7248.mo19380()) {
            c0192 = C0461.m2294(c0192, abstractC22433Of);
        }
        String strM39866 = C17080.m39866(strMo3381);
        C18806 c18806 = new C18806(strM39866, c0192, new C19243(strM39866, abstractC7248));
        try {
            m41406(c0192, c18806, abstractC7248);
            String strM43372 = C18806.m43372(strMo3381, c18806.m43375(c0192.m1420((Collection) abstractC22433Of)));
            strM43372.getClass();
            abstractC5044.mo14061().append((CharSequence) strM43372);
        } catch (C19197 e) {
            throw new C18537(e.m44107());
        }
    }
}
