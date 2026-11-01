package l;

import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܳ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C14393 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f47152;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f47153;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f47154;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9742 f47155;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11174 f47156;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20346 f47157;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public FutureC12075 f47158;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10058 f47159;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f47160;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1254 f47161;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16408 f47162;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14765 f47164;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C1295 f47165;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f47163 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public FutureC12075 f47151 = FutureC12075.m30001(0L);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m34652(C20346 c20346) {
        if (this.f47157 != null || this.f47154 != null || this.f47152 != null) {
            throw new IllegalStateException("Session directory lease is already owned");
        }
        this.f47157 = c20346;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0170 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x018b */
    /* JADX WARN: Bottom block not found for handler: all -> 0x01a3 */
    /* JADX WARN: Code duplicated, block: B:133:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C14393 m34630(l.InterfaceC3800 r20, l.C10428 r21, l.C16777 r22, java.util.concurrent.Executor r23, int r24, l.InterfaceC5614 r25, java.lang.String r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14393.m34630(l.ۘ۟ᩴ, l.ۤܿۖ, l.ܽܿۖ, java.util.concurrent.Executor, int, l.ۚ᩸ۘ, java.lang.String):l.ܳ۠ۖ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34633(Throwable th) {
        C20346 c20346;
        synchronized (this) {
            c20346 = this.f47157;
            this.f47157 = null;
        }
        if (c20346 != null) {
            c20346.m45914(th);
        }
    }

    public C14393(C1254 c1254, C16408 c16408, C11174 c11174, C1295 c1295) {
        this.f47161 = c1254;
        this.f47162 = c16408;
        this.f47156 = c11174;
        this.f47165 = c1295;
        this.f47159 = new C10058(c16408);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14393 m34631(InterfaceC3800 interfaceC3800, C13312 c13312) {
        C1254 c1254M4495 = C1254.m4495(interfaceC3800, c13312.f44188, c13312.f44189);
        c1254M4495.m4526();
        C14393 c14393 = new C14393(c1254M4495, new C16408(c1254M4495), null, new C1295(c1254M4495, interfaceC3800, c13312.f44188, c13312.f44190));
        c14393.f47165.f5556 = c13312;
        return c14393;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34648(int i, int i2, CharSequence charSequence) {
        C16408 c16408 = this.f47162;
        c16408.m38633(c16408.length(), c16408.length(), charSequence, i, i2);
        this.f47161.m4558();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34653(C23874 c23874, Bundle bundle, C2063 c2063, String str, C13312 c13312, InterfaceC5614 interfaceC5614, int i) {
        C1254 c1254 = this.f47161;
        c1254.m4555();
        C16408 c16408 = this.f47162;
        c16408.setSelection(i, i);
        c16408.mo8728(false);
        C6276 c6276M4554 = c1254.m4554();
        try {
            C6234 c6234M52608 = c23874.m52608(c6276M4554, bundle, c2063, str, 0, 0, true);
            c6276M4554.close();
            this.f47165.getClass();
            m34632(bundle, c2063, c6234M52608, c13312, 8388608, interfaceC5614, false);
        } catch (Throwable th) {
            try {
                c6276M4554.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34650(C9742 c9742, int i, int i2) {
        this.f47155 = c9742;
        this.f47153 = i;
        Bundle bundleM24721 = c9742.m24721();
        C1254 c1254 = this.f47161;
        C6276 c6276M4554 = c1254.m4554();
        try {
            C6234 c6234M52609 = this.f47156.f37855.m52609(c6276M4554, bundleM24721, c9742.m24720() == 1 ? this.f47156.f37854 : c9742.m24719(), c9742.m24711(), true, i2);
            c6276M4554.close();
            try {
                C6276 c6276M4555 = c1254.m4554();
                try {
                    C23874 c23874M52605 = C23874.m52605(c6234M52609.m17288(), i2, c6276M4555);
                    try {
                        C11174 c11174M52611 = c23874M52605.m52611(c1254, c9742.m24720() == 1 ? this.f47156.f37854 : c9742.m24719());
                        C11174 c11174 = this.f47156;
                        this.f47156 = c11174M52611;
                        if (c11174 != null) {
                            c11174.close();
                        }
                        c23874M52605.close();
                        c6276M4555.close();
                        c6234M52609.close();
                        C1295 c1295 = this.f47165;
                        c1295.f5557 = c9742;
                        c1295.f5549 = i;
                    } catch (Throwable th) {
                        try {
                            c23874M52605.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c6276M4555.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    c6234M52609.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (Throwable th7) {
            try {
                c6276M4554.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34647(int i) {
        Bundle bundleM21760 = this.f47156.f37855.f77154.m21760();
        bundleM21760.putInt("textPageSize", i);
        C1254 c1254 = this.f47161;
        C6276 c6276M4554 = c1254.m4554();
        try {
            C11174 c11174 = this.f47156;
            C6234 c6234M52607 = c11174.f37855.m52607(c6276M4554, bundleM21760, c11174.f37854);
            try {
                C23874 c23874M52605 = C23874.m52605(c6234M52607.m17288(), 8388608, c6276M4554);
                try {
                    C11174 c11174M52611 = c23874M52605.m52611(c1254, this.f47156.f37854);
                    C11174 c11175 = this.f47156;
                    this.f47156 = c11174M52611;
                    if (c11175 != null) {
                        c11175.close();
                    }
                    c23874M52605.close();
                    c6234M52607.close();
                    c6276M4554.close();
                } catch (Throwable th) {
                    try {
                        c23874M52605.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c6234M52607.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                c6276M4554.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34651(C12175 c12175, byte[] bArr, byte[] bArr2, C13312 c13312, int i) {
        Bundle bundleM21760 = this.f47156.f37855.f77154.m21760();
        C6276 c6276M4554 = this.f47161.m4554();
        try {
            C11174 c11174 = this.f47156;
            C6234 c6234M52600 = C23874.m52600(c6276M4554, bundleM21760, c11174.f37854, c11174.f37855.f77150.m30271(c12175), bArr, bArr2, i);
            c6276M4554.close();
            this.f47165.getClass();
            m34632(bundleM21760, this.f47156.f37854, c6234M52600, c13312, i, (InterfaceC5614) new C14681(), false);
        } catch (Throwable th) {
            try {
                c6276M4554.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14393 m34645(InterfaceC3800 interfaceC3800, AbstractC12648 abstractC12648, boolean z, int i, C13312 c13312, InterfaceC5614 interfaceC5614, boolean z2) throws IOException {
        C6234 c6234M52609;
        int i2;
        Bundle bundleM21760 = this.f47156.f37855.f77154.m21760();
        boolean z3 = bundleM21760.getBoolean("e2SourcePending");
        C1254 c1254 = this.f47161;
        if (!z3 && c1254.m4556().m23300()) {
            return this;
        }
        SystemClock.elapsedRealtime();
        if (z3) {
            C13914 c13914M15086 = C5446.m15086(abstractC12648, z, i, interfaceC5614);
            m34635(interfaceC5614);
            if (c13914M15086 != null) {
                m34636(abstractC12648, false, c13914M15086, 0, 0, c13312, interfaceC5614, z2);
                m34626();
                return this;
            }
            if (bundleM21760.getInt("textPageSize") <= 0 && this.f47155 == null) {
                this.f47164 = C14765.m35385(c1254, new C16818(abstractC12648), c13312.f44188, i, interfaceC5614);
            } else {
                return C9742.m24700(this, interfaceC3800, abstractC12648, i, c13312, interfaceC5614, -1L);
            }
        } else {
            InterfaceC4076 c16818 = new C16818(abstractC12648);
            if (interfaceC5614 instanceof C4513) {
                c16818 = new C2000(c16818, interfaceC5614);
            }
            this.f47164 = C14765.m35384(c1254, c16818, this.f47156.f37854.f7652);
        }
        m34626();
        String strM23301 = this.f47164.m35391().m23301();
        String strM30268 = z3 ? strM23301 : this.f47156.f37855.f77150.m30268(strM23301);
        C18749 c18749M35388 = this.f47164.m35388();
        try {
            m34635(interfaceC5614);
            C16408 c16408 = this.f47162;
            if (c18749M35388 != null) {
                InterfaceC10407 interfaceC10407M28001 = c16408.m28001();
                C13638.requireNonNull(interfaceC10407M28001);
                interfaceC10407M28001.mo26306(c18749M35388);
            }
            if (c18749M35388 != null) {
                c18749M35388.close();
            }
            if (!this.f47164.m35391().m23300() && this.f47164.m35391().m23305() != EnumC19579.LOADING) {
                throw new IOException("Cannot prepare source text", this.f47164.m35389());
            }
            C2063 c2063M35390 = z3 ? this.f47164.m35390() : this.f47156.f37854;
            if (z3) {
                c16408.setSelection(0, 0);
                c16408.mo8728(false);
            }
            bundleM21760.putBoolean("e2SourcePending", false);
            bundleM21760.putBoolean("changed", c16408.isChanged());
            bundleM21760.putBoolean(d.O, false);
            if (z3) {
                bundleM21760.putLong("fileTime", ((C16881) abstractC12648).f53983.mo33991());
                bundleM21760.putBoolean("checkFileExists", true);
            }
            String strM23302 = (z3 || strM30268.equals(strM23301)) ? this.f47164.m35391().m23301() : strM30268;
            C6276 c6276M4554 = c1254.m4554();
            try {
                if (z3) {
                    i2 = 8388608;
                    c6234M52609 = this.f47156.f37855.m52608(c6276M4554, bundleM21760, c2063M35390, strM23302, 0, 0, this.f47164.m35391().m23300());
                } else {
                    c6234M52609 = this.f47156.f37855.m52609(c6276M4554, bundleM21760, c2063M35390, strM23302, this.f47164.m35391().m23300(), 8388608);
                    i2 = 8388608;
                }
                c6276M4554.close();
                m34632(bundleM21760, c2063M35390, c6234M52609, c13312, i2, interfaceC5614, z2 && this.f47164.m35391().m23300());
                m34626();
                C14765 c14765 = this.f47164;
                boolean zM23300 = c14765.m35391().m23300();
                while (c14765.m35391().m23305() == EnumC19579.LOADING) {
                    m34635(interfaceC5614);
                    C18749 c18749M35389 = c14765.m35388();
                    try {
                        m34635(interfaceC5614);
                        if (c18749M35389 != null) {
                            InterfaceC10407 interfaceC10407M28002 = c16408.m28001();
                            C13638.requireNonNull(interfaceC10407M28002);
                            interfaceC10407M28002.mo26306(c18749M35389);
                        }
                        if (c18749M35389 != null) {
                            c18749M35389.close();
                        }
                    } catch (Throwable th) {
                        if (c18749M35389 == null) {
                            throw th;
                        }
                        try {
                            c18749M35389.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                m34635(interfaceC5614);
                if (!c14765.m35391().m23300()) {
                    throw new IOException("Cannot display incomplete source text", c14765.m35389());
                }
                String strM23303 = (z3 || strM30268.equals(strM23301)) ? c14765.m35391().m23301() : strM30268;
                c14765.close();
                this.f47164 = null;
                if (zM23300) {
                    m34626();
                    return this;
                }
                C6276 c6276M4555 = c1254.m4554();
                try {
                    C6234 c6234M526010 = this.f47156.f37855.m52609(c6276M4555, bundleM21760, c2063M35390, strM23303, true, 8388608);
                    c6276M4555.close();
                    m34632(bundleM21760, c2063M35390, c6234M526010, c13312, 8388608, interfaceC5614, z2);
                    m34626();
                    return this;
                } catch (Throwable th3) {
                    try {
                        c6276M4555.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c6276M4554.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            if (c18749M35388 == null) {
                throw th7;
            }
            try {
                c18749M35388.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m34654() {
        return this.f47151.m30032((InterfaceC15954) new C17214(0));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m34626() {
        SystemClock.elapsedRealtime();
        C1254 c1254 = this.f47161;
        c1254.length();
        Integer.toHexString(System.identityHashCode(c1254));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34649(Bundle bundle, C2063 c2063, C6234 c6234, C13312 c13312, C14681 c14681) {
        m34632(bundle, c2063, c6234, c13312, 8388608, (InterfaceC5614) c14681, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34632(Bundle bundle, C2063 c2063, C6234 c6234, C13312 c13312, int i, InterfaceC5614 interfaceC5614, boolean z) {
        C1254 c1254 = this.f47161;
        InterfaceC3800 interfaceC3800M4632 = this.f47165.m4632();
        try {
            C6276 c6276M4554 = c1254.m4554();
            try {
                C9017 c9017M17353 = c6276M4554.m17353((((long) c6234.m17288().length) * 4) + X931RNG.BLOCK64_RESEED_MAX);
                try {
                    C23874 c23874M52605 = C23874.m52605(c6234.m17288(), i, c6276M4554);
                    try {
                        m34635(interfaceC5614);
                        C14641 c14641M35146 = C14641.m35146(interfaceC3800M4632, c1254.m4527(), new ByteArrayInputStream(c6234.m17288()), c6234.m17288().length, i, c13312.f44188);
                        C3226 c3226M4564 = c1254.m4564();
                        try {
                            FutureC12075 futureC12075M4551 = c1254.m4551(c3226M4564.m9678(C7235.m19279(c3226M4564.m9676(), c14641M35146, c1254.m4527())));
                            this.f47151 = futureC12075M4551;
                            if (!z) {
                                futureC12075M4551.m30027();
                            }
                            c3226M4564.close();
                            C6961.m18713(interfaceC3800M4632, bundle);
                            if (this.f47155 != null) {
                                this.f47151.m30027();
                                this.f47155.m24716(this.f47153, bundle, this.f47162.isChanged(), c2063.f7652, c23874M52605.f77150.m30268(this.f47155.m24711()));
                            }
                            C11174 c11174M52611 = c23874M52605.m52611(c1254, c2063);
                            C11174 c11174 = this.f47156;
                            this.f47156 = c11174M52611;
                            if (c11174 != null) {
                                c11174.close();
                            }
                            c23874M52605.close();
                            if (c9017M17353 != null) {
                                c9017M17353.close();
                            }
                            c6276M4554.close();
                            c6234.close();
                        } catch (Throwable th) {
                            try {
                                c3226M4564.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            c23874M52605.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    if (c9017M17353 == null) {
                        throw th5;
                    }
                    try {
                        c9017M17353.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                    try {
                        c6234.close();
                        throw th;
                    } catch (Throwable th7) {
                        th.addSuppressed(th7);
                        throw th;
                    }
                }
            } catch (Throwable th8) {
                try {
                    c6276M4554.close();
                    throw th8;
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                    throw th8;
                }
            }
        } catch (Throwable th10) {
            c6234.close();
            throw th10;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m34655() {
        synchronized (this) {
            FutureC12075 futureC12075 = this.f47158;
            if (futureC12075 == null) {
                C14765 c14765 = this.f47164;
                if (c14765 == null) {
                    return FutureC12075.m30001(null);
                }
                FutureC12075 futureC12075M30005 = FutureC12075.m30005(new RunnableC19331(c14765), C4716.f16635);
                this.f47158 = futureC12075M30005;
                this.f47164 = null;
                return futureC12075M30005.m30032((InterfaceC15954) new C9023());
            }
            return futureC12075.m30032((InterfaceC15954) new C9023());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14393 m34646(InterfaceC3800 interfaceC3800, C16881 c16881, boolean z, boolean z2, int i, int i2, int i3, C13312 c13312, InterfaceC5614 interfaceC5614, boolean z3) throws IOException {
        long jMax;
        C1254 c1254 = this.f47161;
        if (z3) {
            jMax = Math.max(0, c1254.m4546().m23016());
            if (this.f47155 != null) {
                for (int i4 = 0; i4 < this.f47153; i4++) {
                    m34635(interfaceC5614);
                    C3329 c3329M24713 = this.f47155.m24713(i4, c13312);
                    try {
                        jMax += (long) c3329M24713.length();
                        c3329M24713.close();
                    } catch (Throwable th) {
                        try {
                            c3329M24713.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            }
        } else {
            jMax = -1;
        }
        long j = jMax;
        C13914 c13914M15084 = z ? C5446.m15084() : C5446.m15086(c16881, z2, i, interfaceC5614);
        m34635(interfaceC5614);
        if (c13914M15084 == null && (this.f47155 != null || this.f47156.f37855.f77154.m21760().getInt("textPageSize") > 0)) {
            return C9742.m24700(this, interfaceC3800, c16881, i, c13312, interfaceC5614, j);
        }
        if (this.f47155 != null) {
            return C9742.m24701(this, c16881, z, c13914M15084, c13312, interfaceC5614, j);
        }
        if (c13914M15084 == null) {
            C16408 c16408 = this.f47162;
            c16408.replace(0, c16408.length(), (CharSequence) "");
            c1254.m4555();
            c16408.setSelection(0, 0);
            c16408.mo8728(false);
            Bundle bundleM21760 = this.f47156.f37855.f77154.m21760();
            bundleM21760.putBoolean("e2SourcePending", true);
            C6276 c6276M4554 = c1254.m4554();
            try {
                C6234 c6234M52608 = this.f47156.f37855.m52608(c6276M4554, bundleM21760, (C2063) null, "\n", i2, i3, false);
                try {
                    C23874 c23874M52605 = C23874.m52605(c6234M52608.m17288(), 8388608, c6276M4554);
                    try {
                        C11174 c11174M52611 = c23874M52605.m52611(c1254, (C2063) null);
                        C11174 c11174 = this.f47156;
                        this.f47156 = c11174M52611;
                        if (c11174 != null) {
                            c11174.close();
                        }
                        c23874M52605.close();
                        c6234M52608.close();
                        c6276M4554.close();
                        return m34645(interfaceC3800, (AbstractC12648) c16881, z2, i, c13312, interfaceC5614, true);
                    } catch (Throwable th3) {
                        try {
                            c23874M52605.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        c6234M52608.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                try {
                    c6276M4554.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        }
        m34636(c16881, z, c13914M15084, i2, i3, c13312, interfaceC5614, true);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34636(AbstractC12648 abstractC12648, boolean z, C13914 c13914, int i, int i2, C13312 c13312, InterfaceC5614 interfaceC5614, boolean z2) throws IOException {
        CharSequence charSequence = c13914.f45831;
        m34635(interfaceC5614);
        C16408 c16408 = this.f47162;
        c16408.replace(0, c16408.length(), (CharSequence) "");
        C1254 c1254 = this.f47161;
        c1254.m4558();
        int i3 = 0;
        while (i3 < charSequence.length()) {
            long j = i3;
            int iMin = (int) Math.min(charSequence.length(), ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF + j);
            CharSequence charSequence2 = c13914.f45831;
            m34635(interfaceC5614);
            if ((((long) c16408.length()) + ((long) iMin)) - j > 2147483647L) {
                throw new IOException("Reloaded text exceeds coordinate limit");
            }
            c16408.m38633(c16408.length(), c16408.length(), charSequence2, i3, iMin);
            c1254.m4558();
            i3 = iMin;
        }
        c1254.m4555();
        c16408.setSelection(0, 0);
        c16408.mo8728(false);
        Bundle bundleM21760 = this.f47156.f37855.f77154.m21760();
        bundleM21760.putBoolean("changed", false);
        bundleM21760.putBoolean(d.O, false);
        bundleM21760.putBoolean("e2SourcePending", false);
        if (!z) {
            bundleM21760.putLong("fileTime", ((C16881) abstractC12648).f53983.mo33991());
            bundleM21760.putBoolean("checkFileExists", true);
        }
        C6276 c6276M4554 = c1254.m4554();
        try {
            C6234 c6234M52608 = this.f47156.f37855.m52608(c6276M4554, bundleM21760, c13914.f45833, c13914.f45832, i, i2, true);
            c6276M4554.close();
            m34632(bundleM21760, c13914.f45833, c6234M52608, c13312, 8388608, interfaceC5614, z2);
        } catch (Throwable th) {
            try {
                c6276M4554.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bundle m34639(InterfaceC3800 interfaceC3800, C13312 c13312) throws Throwable {
        C2063 c2063;
        C14393 c14393M34630 = m34630(interfaceC3800, c13312.f44188, c13312.f44189, c13312.f44190, 8388608, new C14681(), (String) null);
        try {
            Bundle bundleM21760 = c14393M34630.f47156.f37855.f77154.m21760();
            String string = bundleM21760.getString("filePath");
            if (string == null || string.equals("untitled")) {
                throw new IOException("Untitled session requires an output path");
            }
            AbstractC20745 abstractC20745M15313 = C5553.m15313(string, new String[0]);
            C16881 c16881 = new C16881(abstractC20745M15313);
            c14393M34630 = c14393M34630.m34645(interfaceC3800, (AbstractC12648) c16881, bundleM21760.getBoolean("forceTryAXml") || bundleM21760.getBoolean("forceTryClass"), -1, c13312, (InterfaceC5614) new C14681(), false);
            C1254 c1254 = c14393M34630.f47161;
            String strM30268 = c14393M34630.f47156.f37855.f77150.m30268(c1254.m4556().m23301());
            if (!c1254.m4556().m23300() || (c2063 = c14393M34630.f47156.f37854) == null) {
                throw new IOException("Session text is not ready for saving");
            }
            C22380 c22380M49633 = C22380.m49633(c14393M34630, strM30268, c2063);
            try {
                c22380M49633.m49637(c16881);
                c22380M49633.m49636();
                c22380M49633.close();
                c14393M34630.f47162.mo8728(false);
                Bundle bundleM21761 = c14393M34630.f47156.f37855.f77154.m21760();
                bundleM21761.putBoolean("changed", false);
                bundleM21761.putBoolean(d.O, false);
                bundleM21761.putLong("fileTime", abstractC20745M15313.mo33991());
                bundleM21761.putBoolean("checkFileExists", true);
                C6276 c6276M4554 = c1254.m4554();
                try {
                    C11174 c11174 = c14393M34630.f47156;
                    C6234 c6234M52609 = c11174.f37855.m52609(c6276M4554, bundleM21761, c11174.f37854, strM30268, true, 8388608);
                    c6276M4554.close();
                    c14393M34630.m34632(bundleM21761, c14393M34630.f47156.f37854, c6234M52609, c13312, 8388608, (InterfaceC5614) new C14681(), false);
                    c14393M34630.m34644(c1254.m4523()).m30027();
                    return bundleM21761;
                } catch (Throwable th) {
                    try {
                        c6276M4554.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c22380M49633.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            c14393M34630.m34643().m30027();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34635(InterfaceC5614 interfaceC5614) {
        if (interfaceC5614.mo2357()) {
            throw new CancellationException("Fragment recovery is canceled");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34634(InterfaceC3800 interfaceC3800, C19641 c19641, C13312 c13312) {
        C14393 c14393M34630 = m34630(interfaceC3800, c13312.f44188, c13312.f44189, c13312.f44190, 8388608, new C14681(), (String) null);
        C1254 c1254 = c14393M34630.f47161;
        Throwable th = null;
        try {
            try {
                Bundle bundleM21760 = c14393M34630.f47156.f37855.f77154.m21760();
                c19641.m44755(bundleM21760);
                C6276 c6276M4554 = c1254.m4554();
                try {
                    C11174 c11174 = c14393M34630.f47156;
                    C6234 c6234M52607 = c11174.f37855.m52607(c6276M4554, bundleM21760, c11174.f37854);
                    c6276M4554.close();
                    c14393M34630.m34632(bundleM21760, c14393M34630.f47156.f37854, c6234M52607, c13312, 8388608, (InterfaceC5614) new C14681(), false);
                    c14393M34630.m34644(c1254.m4523()).m30027();
                    c14393M34630.m34643().m30027();
                } catch (Throwable th2) {
                    try {
                        c6276M4554.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    c14393M34630.m34643().m30027();
                    throw th4;
                } catch (Error | RuntimeException e) {
                    if (0 == 0) {
                        throw e;
                    }
                    th.addSuppressed(e);
                    throw th4;
                }
            }
        } catch (IOException | Error | RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m34644(long j) {
        synchronized (this) {
            FutureC12075 futureC12075 = this.f47152;
            if (futureC12075 == null) {
                FutureC12075 futureC12076 = this.f47154;
                if (futureC12076 == null) {
                    synchronized (this.f47161) {
                        if (this.f47161.m4523() != j || this.f47161.m4562() < j) {
                            throw new IllegalStateException("Fragment final checkpoint is not current and durable");
                        }
                    }
                    this.f47159.close();
                    this.f47162.close();
                    final FutureC12075 futureC12077 = new FutureC12075();
                    this.f47154 = futureC12077;
                    FutureC12075 futureC12075M4633 = this.f47165.m4633();
                    C1295 c1295 = this.f47165;
                    C13638.requireNonNull(c1295);
                    futureC12075M4633.m30031(new RunnableC10180(1, c1295), C4716.f16635).m30018((InterfaceC20892) new C0280()).m30028(new InterfaceC15954() { // from class: l.ܽ۠ۖ
                        @Override // l.InterfaceC15954
                        public final Object apply(Object obj) {
                            final Throwable th = (Throwable) obj;
                            final C14393 c14393 = this.f53033;
                            C9742 c9742 = c14393.f47155;
                            return (c9742 == null ? FutureC12075.m30001(null) : c9742.m24723()).m30028(new InterfaceC15954() { // from class: l.ܺ۠ۖ
                                @Override // l.InterfaceC15954
                                public final Object apply(Object obj2) {
                                    return c14393.f47161.m4559();
                                }
                            }).m30018(new InterfaceC20892() { // from class: l.᩶۠ۖ
                                @Override // l.InterfaceC20892
                                /* JADX INFO: renamed from: ۙ */
                                public final Object mo1795(Object obj2, Throwable th2) {
                                    return C14393.m34625(th, th2);
                                }
                            });
                        }
                    }).m30016(new InterfaceC7486() { // from class: l.۫۠ۖ
                        @Override // l.InterfaceC7486
                        /* JADX INFO: renamed from: ܰ */
                        public final void mo2142(Object obj, Throwable th) {
                            C14393.m34637(this.f41052, futureC12077, (Throwable) obj, th);
                        }
                    });
                    return futureC12077.m30032((InterfaceC15954) new C9023());
                }
                return futureC12076.m30032((InterfaceC15954) new C9023());
            }
            return futureC12075.m30032((InterfaceC15954) new C9023());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34637(C14393 c14393, FutureC12075 futureC12075, Throwable th, Throwable th2) {
        C11174 c11174;
        Throwable thM34625 = m34625(th, th2);
        synchronized (c14393) {
            c11174 = c14393.f47156;
            c14393.f47156 = null;
        }
        if (c11174 != null) {
            c11174.close();
        }
        c14393.m34633(thM34625);
        if (thM34625 == null) {
            futureC12075.m30019((Object) null);
            return;
        }
        if ((thM34625 instanceof C17013) && thM34625.getCause() != null) {
            thM34625 = thM34625.getCause();
        }
        futureC12075.m30021(thM34625);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m34643() {
        synchronized (this) {
            FutureC12075 futureC12075 = this.f47152;
            if (futureC12075 == null) {
                FutureC12075 futureC12076 = this.f47154;
                this.f47159.close();
                final FutureC12075 futureC12077 = new FutureC12075();
                this.f47152 = futureC12077;
                (futureC12076 == null ? FutureC12075.m30001(null) : futureC12076.m30018((InterfaceC20892) new C1694(6))).m30028((InterfaceC15954) new C5925(0, this)).m30018((InterfaceC20892) new C10865(this)).m30028((InterfaceC15954) new C23565(this)).m30028(new InterfaceC15954() { // from class: l.ۡ۠ۖ
                    @Override // l.InterfaceC15954
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        final C14393 c14393 = this.f30069;
                        C9742 c9742 = c14393.f47155;
                        return (c9742 == null ? FutureC12075.m30001(null) : c9742.m24723()).m30028(new InterfaceC15954() { // from class: l.۟۠ۖ
                            @Override // l.InterfaceC15954
                            public final Object apply(Object obj2) {
                                return c14393.f47161.m4530();
                            }
                        }).m30018((InterfaceC20892) new C20742(th));
                    }
                }).m30016(new InterfaceC7486() { // from class: l.ۤ۠ۖ
                    @Override // l.InterfaceC7486
                    /* JADX INFO: renamed from: ܰ */
                    public final void mo2142(Object obj, Throwable th) {
                        C14393.m34642(this.f34685, futureC12077, (Throwable) obj, th);
                    }
                });
                return futureC12077.m30032((InterfaceC15954) new C9023());
            }
            return futureC12075.m30032((InterfaceC15954) new C9023());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Throwable m34628(C14393 c14393, Throwable th) {
        try {
            c14393.f47162.close();
            return th;
        } catch (Throwable th2) {
            return m34625(th, th2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m34642(C14393 c14393, FutureC12075 futureC12075, Throwable th, Throwable th2) {
        C11174 c11174;
        Throwable thM34625 = m34625(th, th2);
        synchronized (c14393) {
            c11174 = c14393.f47156;
            c14393.f47156 = null;
        }
        if (c11174 != null) {
            c11174.close();
        }
        c14393.m34633(thM34625);
        if (thM34625 == null) {
            futureC12075.m30019((Object) null);
            return;
        }
        if ((thM34625 instanceof C17013) && thM34625.getCause() != null) {
            thM34625 = thM34625.getCause();
        }
        futureC12075.m30021(thM34625);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Throwable m34625(Throwable th, Throwable th2) {
        if (th == null) {
            return th2;
        }
        if (th2 != null && th != th2) {
            th.addSuppressed(th2);
        }
        return th;
    }
}
