package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܽ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes5.dex */
public final class C17927 extends AbstractC13057 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ WeakReference f58710;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58711;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f58712;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7629 f58713;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58714;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2386 f58715;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58716;

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo32546() {
        return true;
    }

    public C17927(AbstractC7629 abstractC7629, InterfaceC2386 interfaceC2386, String str, String str2, String str3, WeakReference weakReference) {
        this.f58713 = abstractC7629;
        this.f58715 = interfaceC2386;
        this.f58711 = str;
        this.f58716 = str2;
        this.f58714 = str3;
        this.f58710 = weakReference;
        this.f58712 = (abstractC7629 instanceof AbstractC18881) && interfaceC2386.getTime() <= 0;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo23981() {
        return !C6790.m18961(this.f58715);
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۫ */
    public final String mo17426() {
        return this.f58711;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۤ */
    public final String mo17425() {
        return this.f58716;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo23982() {
        return this.f58712;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ᩹ */
    public final InputStream mo17428() throws IOException {
        throw new IOException("Visitor image source must be prepared before decoding");
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۗ */
    public final C15294 mo17423() throws IOException {
        C23895 c23895 = new C23895(this.f58713);
        try {
            InterfaceC2386 interfaceC2386M20843 = c23895.f77381.m20843(this.f58714);
            this.f58712 = (this.f58713 instanceof AbstractC18881) && ((C13352) interfaceC2386M20843).getTime() <= 0;
            StringBuilder sb = new StringBuilder(this.f58711);
            C3757.m12197(sb, c23895.f77381);
            C13352 c13352 = (C13352) interfaceC2386M20843;
            C15294 c15294 = new C15294(sb.toString(), Math.max(-1L, c13352.getSize()), c13352.getTime());
            c23895.close();
            return c15294;
        } catch (Throwable th) {
            try {
                c23895.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۙ */
    public final void mo23980(OutputStream outputStream, boolean z, InterfaceC7509 interfaceC7509) throws IOException {
        InputStream inputStreamM43871;
        AbstractC13057.m32543(interfaceC7509);
        AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) this.f58710.get();
        AbstractC7629 abstractC7629 = this.f58713;
        boolean z2 = z && ((abstractC7629 instanceof C24320) || (abstractC7629 instanceof C17036));
        if (z2 && (abstractActivityC17204 == null || abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed())) {
            throw new C10819();
        }
        C17181 c17181 = new C17181(interfaceC7509, z2, abstractActivityC17204);
        C23895 c23895 = new C23895(abstractC7629);
        AbstractC7629 abstractC76210 = c23895.f77381;
        try {
            AbstractC13057.m32543(c17181);
            InterfaceC2386 interfaceC2386M20843 = abstractC76210.m20843(this.f58714);
            if (abstractC76210 instanceof C24320) {
                C24320 c24320 = (C24320) abstractC76210;
                if (z) {
                    inputStreamM43871 = c24320.m54363(abstractActivityC17204, interfaceC2386M20843, c17181);
                } else {
                    inputStreamM43871 = C18902.m43871(((C2494) interfaceC2386M20843).m8382(), c24320.m54371(), c24320.m54362(), c24320.m54375(), null);
                }
                try {
                    AbstractC13057.m32543(c17181);
                    if (inputStreamM43871 == null) {
                        throw new C10819();
                    }
                    byte[] bArr = new byte[32768];
                    while (true) {
                        AbstractC13057.m32543(c17181);
                        int i = inputStreamM43871.read(bArr);
                        AbstractC13057.m32543(c17181);
                        if (i < 0) {
                            break;
                        } else if (i > 0) {
                            outputStream.write(bArr, 0, i);
                        }
                    }
                    inputStreamM43871.close();
                } catch (Throwable th) {
                    if (inputStreamM43871 != null) {
                        try {
                            inputStreamM43871.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                C16435 c16435 = new C16435(outputStream, c17181);
                if (abstractC76210 instanceof C17036) {
                    ((C17036) abstractC76210).m40134(abstractActivityC17204, interfaceC2386M20843, c16435, z);
                } else {
                    abstractC76210.mo20836(abstractActivityC17204, interfaceC2386M20843, c16435);
                }
                AbstractC13057.m32543(c17181);
                if (c16435.f53319) {
                    throw new C10819();
                }
            }
            c23895.close();
        } catch (Throwable th3) {
            try {
                c23895.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
