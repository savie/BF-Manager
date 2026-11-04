package l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩻ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes.dex */
public class C25085 extends AbstractC16610 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C22941 f81115;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C22941 f81116;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f81117;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f81119;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C2404 f81120;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f81121;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public C25179 f81122;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f81118 = new AtomicInteger();

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C20528 f81114 = new C20528(C11138.f35105 * 2);

    static {
        ApplicationC23172.m52091(173);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public native C12187 mo2531();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46047;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("saveAsPath"), C21576.m49088(R.string.MT_Protector));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        m43859(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55905(final C25085 c25085, final BufferedOutputStream bufferedOutputStream, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C7625 c7625, C9420 c9420) throws Throwable {
        boolean z6;
        AtomicInteger atomicInteger = c25085.f81118;
        final String str = c7625.f25168;
        C8370 c8370 = c7625.f25165;
        C22737 c22737 = c8370.f27457;
        if (c22737 != null && c8370.f27459 == null) {
            if (!z5 || !str.matches(".*/R\\$[a-z]+")) {
                final C18459 c18459M55909 = c25085.m55909(c8370.f27457);
                c9420.m24792(new InterfaceC1218() { // from class: l.۫ܰۤ
                    @Override // l.InterfaceC1218
                    public final void run() {
                        C25085.m55908(this.f42070, str, bufferedOutputStream, c18459M55909);
                    }
                });
                atomicInteger.incrementAndGet();
                return;
            } else {
                C13590 c13590 = (C13590) c8370.f27457.f73785.m55811();
                c13590.m33312();
                try {
                    if (C16879.m39843(c8370.f27457)) {
                        System.out.println("Skip R class: ".concat(str));
                    }
                    return;
                } finally {
                    c13590.m33313();
                }
            }
        }
        if (c22737 == null && c8370.f27459 != null) {
            if (!z5 || !str.matches(".*/R\\$[a-z]+")) {
                final C18459 c18459M559010 = c25085.m55909(c8370.f27459);
                c9420.m24792(new InterfaceC1218() { // from class: l.ۚܰۤ
                    @Override // l.InterfaceC1218
                    public final void run() {
                        C25085.m55906(this.f19660, str, bufferedOutputStream, c18459M559010);
                    }
                });
                atomicInteger.incrementAndGet();
                return;
            } else {
                C13590 c13591 = (C13590) c8370.f27459.f73785.m55811();
                c13591.m33312();
                try {
                    if (C16879.m39843(c8370.f27459)) {
                        System.out.println("Skip R class: ".concat(str));
                    }
                    return;
                } finally {
                    c13591.m33313();
                }
            }
        }
        c25085.mo29447(str);
        C24975 c24975 = c8370.f27457.f73785;
        C24975 c24976 = c8370.f27459.f73785;
        C13590 c13592 = (C13590) c24975.m55811();
        C13590 c13593 = (C13590) c24976.m55811();
        boolean z7 = false;
        try {
            c13592.m33312();
            z6 = true;
            try {
                c13593.m33312();
                try {
                    if (!c8370.f27457.m51266(c8370.f27459, z, z2, z3, z4, z5)) {
                        if (z5 && C16879.m39843(c8370.f27457) && C16879.m39843(c8370.f27459)) {
                            System.out.println("Skip R class: " + str);
                            c13593.m33313();
                            c13592.m33313();
                            return;
                        }
                        final C18459 c18459M559011 = c25085.m55909(c8370.f27457);
                        final C18459 c18459M559012 = c25085.m55909(c8370.f27459);
                        if (c18459M559011.equals(c18459M559012)) {
                            c25085.m55904(c18459M559011);
                            c25085.m55904(c18459M559012);
                            c13593.m33313();
                            c13592.m33313();
                            return;
                        }
                        c9420.m24792(new InterfaceC1218() { // from class: l.֫ܰۤ
                            @Override // l.InterfaceC1218
                            public final void run() {
                                C25085.m55907(this.f6583, str, bufferedOutputStream, c18459M559011, c18459M559012);
                            }
                        });
                        atomicInteger.incrementAndGet();
                    }
                    c13593.m33313();
                    c13592.m33313();
                } catch (Throwable th) {
                    th = th;
                    z7 = true;
                    if (z7) {
                        c13593.m33313();
                    }
                    if (z6) {
                        c13592.m33313();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            z6 = false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55908(C25085 c25085, String str, BufferedOutputStream bufferedOutputStream, C18459 c18459) {
        try {
            c25085.f81122.m56124("a/" + str);
            C21443.m48762(bufferedOutputStream, c18459);
            bufferedOutputStream.flush();
        } finally {
            c25085.m55904(c18459);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55906(C25085 c25085, String str, BufferedOutputStream bufferedOutputStream, C18459 c18459) {
        try {
            c25085.f81122.m56124("b/" + str);
            C21443.m48762(bufferedOutputStream, c18459);
            bufferedOutputStream.flush();
        } finally {
            c25085.m55904(c18459);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m55907(C25085 c25085, String str, BufferedOutputStream bufferedOutputStream, C18459 c18459, C18459 c184510) {
        try {
            c25085.f81122.m56124("a/" + str);
            C21443.m48762(bufferedOutputStream, c18459);
            bufferedOutputStream.flush();
            c25085.f81122.m56124("b/" + str);
            C21443.m48762(bufferedOutputStream, c184510);
            bufferedOutputStream.flush();
        } finally {
            c25085.m55904(c18459);
            c25085.m55904(c184510);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18459 m55909(C22737 c22737) {
        C20528 c20528 = this.f81114;
        C5564 c5564 = this.f81120.get();
        C24975 c24975 = c22737.f73785;
        C13590 c13590 = (C13590) c24975.m55811();
        c5564.f19332 = c24975.mo4326().f63286;
        c13590.m33312();
        try {
            try {
                C18459 c18459 = (C18459) c20528.m47061();
                if (c18459 == null) {
                    c18459 = new C18459();
                } else {
                    c18459.m43009(0);
                }
                C13021.m32450(new C11658(new C0560(c18459)), c22737, c5564);
                return c18459;
            } finally {
                c13590.m33313();
            }
        } catch (IOException | Error | RuntimeException e) {
            C18459 c184510 = (C18459) c20528.m47061();
            if (c184510 == null) {
                c184510 = new C18459();
            } else {
                c184510.m43009(0);
            }
            c184510.m43010(C17370.m40799(e));
            c13590.m33313();
            return c184510;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55904(C18459 c18459) {
        this.f81114.m47060(c18459);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        this.f81117 = true;
        m55903(main, c12187);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55903(ContextWrapper contextWrapper, C12187 c12187) {
        C25179 c25179 = this.f81122;
        if (c25179 != null) {
            C20244.m46520(c25179);
            this.f81122 = null;
        }
        if (c12187.m30474()) {
            if (this.f81118.get() == 0) {
                this.f81121.mo4296();
                C22673.m51159(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC16677.class);
                intent.setData(this.f81121.m49836());
                intent.putExtra("savedAsPath", m43865("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        AbstractC22044 abstractC22044;
        if (!this.f81117) {
            m55903(C21576.m49084(), c12187);
        }
        C20244.m46520(this.f81116);
        C20244.m46520(this.f81115);
        C25179 c25179 = this.f81122;
        if (c25179 != null) {
            C20244.m46520(c25179);
        }
        if (!c12187.m30474() && (abstractC22044 = this.f81121) != null) {
            abstractC22044.mo4296();
        }
        AbstractC22044 abstractC22045 = this.f81119;
        if (abstractC22045 != null) {
            abstractC22045.mo4296();
        }
        C6331.m18055();
    }
}
