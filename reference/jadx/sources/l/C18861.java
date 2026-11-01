package l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ᩴܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes.dex */
public class C18861 extends AbstractC23941 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C22918 f61082;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public C2455 f61084;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C2455 f61085;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f61087;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f61088;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C13923 f61089;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f61090;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f61086 = new AtomicInteger();

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C19805 f61083 = new C19805(C5464.f18831 * 2);

    static {
        ApplicationC6132.m17119(144);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public native C5202 mo3077();

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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43496(final C18861 c18861, final BufferedOutputStream bufferedOutputStream, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C14774 c14774, C3338 c3338) throws Throwable {
        boolean z6;
        AtomicInteger atomicInteger = c18861.f61086;
        final String str = c14774.f48301;
        C11806 c11806 = c14774.f48302;
        C7807 c7807 = c11806.f39678;
        if (c7807 != null && c11806.f39680 == null) {
            if (!z5 || !str.matches(".*/R\\$[a-z]+")) {
                final C14795 c14795M43500 = c18861.m43500(c11806.f39678);
                c3338.m9938(new InterfaceC9690() { // from class: l.᩺ܺۨ
                    @Override // l.InterfaceC9690
                    public final void run() {
                        C18861.m43499(this.f75044, str, bufferedOutputStream, c14795M43500);
                    }
                });
                atomicInteger.incrementAndGet();
                return;
            } else {
                C5455 c5455 = (C5455) c11806.f39678.f25683.m41200();
                c5455.m15115();
                try {
                    if (C8278.m21697(c11806.f39678)) {
                        System.out.println("Skip R class: ".concat(str));
                    }
                    return;
                } finally {
                    c5455.m15116();
                }
            }
        }
        if (c7807 == null && c11806.f39680 != null) {
            if (!z5 || !str.matches(".*/R\\$[a-z]+")) {
                final C14795 c14795M43501 = c18861.m43500(c11806.f39680);
                c3338.m9938(new InterfaceC9690() { // from class: l.ܶܺۨ
                    @Override // l.InterfaceC9690
                    public final void run() {
                        C18861.m43497(this.f49941, str, bufferedOutputStream, c14795M43501);
                    }
                });
                atomicInteger.incrementAndGet();
                return;
            } else {
                C5455 c5456 = (C5455) c11806.f39680.f25683.m41200();
                c5456.m15115();
                try {
                    if (C8278.m21697(c11806.f39680)) {
                        System.out.println("Skip R class: ".concat(str));
                    }
                    return;
                } finally {
                    c5456.m15116();
                }
            }
        }
        c18861.mo41554(str);
        C17684 c17684 = c11806.f39678.f25683;
        C17684 c17685 = c11806.f39680.f25683;
        C5455 c5457 = (C5455) c17684.m41200();
        C5455 c5458 = (C5455) c17685.m41200();
        boolean z7 = false;
        try {
            c5457.m15115();
            z6 = true;
            try {
                c5458.m15115();
                try {
                    if (!c11806.f39678.m20484(c11806.f39680, z, z2, z3, z4, z5)) {
                        if (z5 && C8278.m21697(c11806.f39678) && C8278.m21697(c11806.f39680)) {
                            System.out.println("Skip R class: " + str);
                            c5458.m15116();
                            c5457.m15116();
                            return;
                        }
                        final C14795 c14795M43502 = c18861.m43500(c11806.f39678);
                        final C14795 c14795M43503 = c18861.m43500(c11806.f39680);
                        if (c14795M43502.equals(c14795M43503)) {
                            c18861.m43495(c14795M43502);
                            c18861.m43495(c14795M43503);
                            c5458.m15116();
                            c5457.m15116();
                            return;
                        }
                        c3338.m9938(new InterfaceC9690() { // from class: l.᩸ܺۨ
                            @Override // l.InterfaceC9690
                            public final void run() {
                                C18861.m43498(this.f70325, str, bufferedOutputStream, c14795M43502, c14795M43503);
                            }
                        });
                        atomicInteger.incrementAndGet();
                    }
                    c5458.m15116();
                    c5457.m15116();
                } catch (Throwable th) {
                    th = th;
                    z7 = true;
                    if (z7) {
                        c5458.m15116();
                    }
                    if (z6) {
                        c5457.m15116();
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43499(C18861 c18861, String str, BufferedOutputStream bufferedOutputStream, C14795 c14795) {
        try {
            c18861.f61082.m50725("a/" + str);
            C23967.m52797(bufferedOutputStream, c14795);
            bufferedOutputStream.flush();
        } finally {
            c18861.m43495(c14795);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43497(C18861 c18861, String str, BufferedOutputStream bufferedOutputStream, C14795 c14795) {
        try {
            c18861.f61082.m50725("b/" + str);
            C23967.m52797(bufferedOutputStream, c14795);
            bufferedOutputStream.flush();
        } finally {
            c18861.m43495(c14795);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43498(C18861 c18861, String str, BufferedOutputStream bufferedOutputStream, C14795 c14795, C14795 c14796) {
        try {
            c18861.f61082.m50725("a/" + str);
            C23967.m52797(bufferedOutputStream, c14795);
            bufferedOutputStream.flush();
            c18861.f61082.m50725("b/" + str);
            C23967.m52797(bufferedOutputStream, c14796);
            bufferedOutputStream.flush();
        } finally {
            c18861.m43495(c14795);
            c18861.m43495(c14796);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14795 m43500(C7807 c7807) {
        C19805 c19805 = this.f61083;
        C20424 c20424 = this.f61089.get();
        C17684 c17684 = c7807.f25683;
        C5455 c5455 = (C5455) c17684.m41200();
        c20424.f66198 = c17684.mo34147().f24881;
        c5455.m15115();
        try {
            try {
                C14795 c14795 = (C14795) c19805.m45009();
                if (c14795 == null) {
                    c14795 = new C14795();
                } else {
                    c14795.m35465(0);
                }
                C16191.m38283(new C18155(new C2093(c14795)), c7807, c20424);
                return c14795;
            } finally {
                c5455.m15116();
            }
        } catch (IOException | Error | RuntimeException e) {
            C14795 c14796 = (C14795) c19805.m45009();
            if (c14796 == null) {
                c14796 = new C14795();
            } else {
                c14796.m35465(0);
            }
            c14796.m35466(C17874.m41461(e));
            c5455.m15116();
            return c14796;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43495(C14795 c14795) {
        this.f61083.m45011(c14795);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        this.f61087 = true;
        m43494(main, c5202);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43494(ContextWrapper contextWrapper, C5202 c5202) {
        C22918 c22918 = this.f61082;
        if (c22918 != null) {
            C19431.m44468(c22918);
            this.f61082 = null;
        }
        if (c5202.m14380()) {
            if (this.f61086.get() == 0) {
                this.f61088.mo24647();
                C15829.m37618(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC20431.class);
                intent.setData(this.f61088.m46732());
                intent.putExtra("savedAsPath", m41585("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        AbstractC20745 abstractC20745;
        if (!this.f61087) {
            m43494(C16737.m39277(), c5202);
        }
        C19431.m44468(this.f61084);
        C19431.m44468(this.f61085);
        C22918 c22918 = this.f61082;
        if (c22918 != null) {
            C19431.m44468(c22918);
        }
        if (!c5202.m14380() && (abstractC20745 = this.f61088) != null) {
            abstractC20745.mo24647();
        }
        AbstractC20745 abstractC20746 = this.f61090;
        if (abstractC20746 != null) {
            abstractC20746.mo24647();
        }
        C21094.m47530();
    }
}
