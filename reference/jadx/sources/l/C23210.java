package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 35GV */
/* JADX INFO: loaded from: classes.dex */
public final class C23210 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۗۖ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f75315 = {3488, 11950, 11965, 11940, 12027};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnClickListenerC15449 f75316;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f75317;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6222 f75318;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f75319;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f75320;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75321;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f75322;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75323;

    public C23210(AbstractViewOnClickListenerC15449 abstractViewOnClickListenerC15449, int i, C6222 c6222, boolean z, int i2, boolean z2) {
        this.f75316 = abstractViewOnClickListenerC15449;
        this.f75321 = i;
        this.f75318 = c6222;
        this.f75317 = z;
        this.f75323 = i2;
        this.f75320 = z2;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f75316.f50334.m28824());
        c1777.mo5828((Runnable) null);
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5843();
        this.f75322 = c1777;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ac  */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        String str;
        boolean zM50057;
        XmlResourceParserC11068 xmlResourceParserC11068M47106;
        String str2 = "/";
        AbstractViewOnClickListenerC15449 abstractViewOnClickListenerC15449 = this.f75316;
        C2455 c2455 = new C2455(abstractViewOnClickListenerC15449.f50340);
        int i = this.f75321;
        try {
            if (i == 0) {
                m51230(c2455);
                c2455.close();
                return;
            }
            ((C9701) abstractViewOnClickListenerC15449).f32683 = new C11835("zip", "/");
            C8516 c8516 = new C8516(c2455.m7485());
            C1777 c1777 = this.f75322;
            C13638.requireNonNull(c1777);
            c8516.m22241(new C1438(c1777));
            int i2 = 1;
            C6037 c6037 = i == 1 ? new C6037(c2455) : null;
            Set set = abstractViewOnClickListenerC15449.f50337 != null ? (Set) C9030.stream(abstractViewOnClickListenerC15449.f50337).map(new C4686(1)).collect(C1890.toSet()) : null;
            for (C12107 c12107 : c2455.m7466()) {
                if (this.f75322.m5824()) {
                    break;
                }
                c8516.m22242(i2);
                if (c12107.isDirectory() || c12107.getSize() <= 10 || c12107.getSize() >= 2097152) {
                    str = str2;
                } else {
                    if (set != null) {
                        if (!set.contains(str2 + c12107.getName())) {
                            str = str2;
                        }
                    }
                    try {
                        InputStream inputStreamM7471 = c2455.m7471(c12107);
                        if (i != i2) {
                            int i3 = this.f75323;
                            int i4 = 2;
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        try {
                                            XmlResourceParserC11068 xmlResourceParserC11068M47107 = C20945.m47094(inputStreamM7471).m47106();
                                            while (true) {
                                                int next = xmlResourceParserC11068M47107.next();
                                                if (next != i2) {
                                                    if (next == i4) {
                                                        int attributeCount = xmlResourceParserC11068M47107.getAttributeCount();
                                                        int i5 = 0;
                                                        while (true) {
                                                            if (i5 != attributeCount) {
                                                                int iM27894 = xmlResourceParserC11068M47107.m27894(i5);
                                                                str = str2;
                                                                if (iM27894 >= 16 && iM27894 <= 31) {
                                                                    try {
                                                                        if (i3 == xmlResourceParserC11068M47107.m27896(i5)) {
                                                                            xmlResourceParserC11068M47107.close();
                                                                            zM50057 = true;
                                                                        }
                                                                    } catch (Exception unused) {
                                                                        zM50057 = false;
                                                                    }
                                                                }
                                                                i5++;
                                                                str2 = str;
                                                            }
                                                            str = str2;
                                                        }
                                                    }
                                                    i2 = 1;
                                                    i4 = 2;
                                                    str2 = str2;
                                                } else {
                                                    str = str2;
                                                }
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    } else {
                                        str = str2;
                                        throw new RuntimeException();
                                    }
                                    i2 = 1;
                                } else {
                                    str = str2;
                                    xmlResourceParserC11068M47106 = C20945.m47094(inputStreamM7471).m47106();
                                    while (true) {
                                        int next2 = xmlResourceParserC11068M47106.next();
                                        if (next2 != 1) {
                                            if (next2 == 2) {
                                                int attributeCount2 = xmlResourceParserC11068M47106.getAttributeCount();
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 == attributeCount2) {
                                                        continue;
                                                    } else {
                                                        int iM27895 = xmlResourceParserC11068M47106.m27894(i6);
                                                        if (iM27895 < 28 || iM27895 > 31 || i3 != xmlResourceParserC11068M47106.m27896(i6)) {
                                                            i6++;
                                                        } else {
                                                            xmlResourceParserC11068M47106.close();
                                                            zM50057 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                zM50057 = false;
                            } else {
                                str = str2;
                                xmlResourceParserC11068M47106 = C20945.m47094(inputStreamM7471).m47106();
                                while (true) {
                                    int next3 = xmlResourceParserC11068M47106.next();
                                    if (next3 == 1) {
                                        zM50057 = false;
                                    } else if (next3 == 2) {
                                        int attributeCount3 = xmlResourceParserC11068M47106.getAttributeCount();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 == attributeCount3) {
                                                continue;
                                            } else {
                                                int iM27896 = xmlResourceParserC11068M47106.m27894(i7);
                                                if ((iM27896 == 2 || iM27896 == 1) && i3 == xmlResourceParserC11068M47106.m27896(i7)) {
                                                    xmlResourceParserC11068M47106.close();
                                                    zM50057 = true;
                                                } else {
                                                    i7++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            str = str2;
                            zM50057 = C22535.m50057(inputStreamM7471, this.f75318, this.f75317, c6037);
                        }
                        if (zM50057) {
                            try {
                                C5696 c5696 = new C5696(c12107);
                                ((C9701) abstractViewOnClickListenerC15449).f32683.f39735.add(new C6189(c5696, c5696.getParent()));
                            } catch (IOException unused3) {
                            }
                        }
                    } catch (IOException unused4) {
                        str = str2;
                    }
                    i2 = 1;
                }
                str2 = str;
            }
            c2455.close();
        } catch (Throwable th) {
            try {
                c2455.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x016c A[PHI: r9 r15
      0x016c: PHI (r9v3 java.util.ArrayList) = (r9v2 java.util.ArrayList), (r9v1 java.util.ArrayList) binds: [B:45:0x016a, B:9:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r15v4 l.ۛ֡֨) = (r15v3 l.ۛ֡֨), (r15v2 l.ۛ֡֨) binds: [B:45:0x016a, B:9:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0123, code lost:
    
        if (l.RunnableC3388.f12514 >= 0) goto L13;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m51230(l.C2455 r35) {
        /*
            Method dump skipped, instruction units count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23210.m51230(l.ۖۢ᩺):void");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f75322.m5824()) {
            return;
        }
        C9701 c9701 = (C9701) this.f75316;
        C13810 c13810 = c9701.f32685;
        if (c9701.f32683.f39735.isEmpty()) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            C22418.m49706(c9701.f32684, c13810, c9701.f32683);
        }
        c13810.mo2553(c9701.f32683);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f75316.f50334.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f75322.m5825();
        AbstractC20745 abstractC20745 = this.f75319;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
    }
}
