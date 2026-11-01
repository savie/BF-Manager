package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۙۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4564 extends AbstractC1886 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile boolean f16206;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16207;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ WeakReference f16208;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16209;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16210;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2557 f16211;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9677 f16212;

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo6140() {
        return true;
    }

    public C4564(AbstractC9677 abstractC9677, InterfaceC2557 interfaceC2557, String str, String str2, String str3, WeakReference weakReference) {
        this.f16212 = abstractC9677;
        this.f16211 = interfaceC2557;
        this.f16210 = str;
        this.f16207 = str2;
        this.f16209 = str3;
        this.f16208 = weakReference;
        this.f16206 = (abstractC9677 instanceof AbstractC12233) && interfaceC2557.getTime() <= 0;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6138() {
        return !C13012.m32190(this.f16211);
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ֨ */
    public final String mo5281() {
        return this.f16210;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۖ */
    public final String mo5282() {
        return this.f16207;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo6141() {
        return this.f16206;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo5285() throws IOException {
        throw new IOException("Visitor image source must be prepared before decoding");
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۠ */
    public final C14588 mo5283() throws IOException {
        C11621 c11621 = new C11621(this.f16212);
        try {
            InterfaceC2557 interfaceC2557M24620 = c11621.f39035.m24620(this.f16209);
            this.f16206 = (this.f16212 instanceof AbstractC12233) && ((C15404) interfaceC2557M24620).getTime() <= 0;
            StringBuilder sb = new StringBuilder(this.f16210);
            C2447.m7433(sb, c11621.f39035);
            C15404 c15404 = (C15404) interfaceC2557M24620;
            C14588 c14588 = new C14588(sb.toString(), Math.max(-1L, c15404.getSize()), c15404.getTime());
            c11621.close();
            return c14588;
        } catch (Throwable th) {
            try {
                c11621.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۙ */
    public final void mo6136(OutputStream outputStream, boolean z, InterfaceC5614 interfaceC5614) throws IOException {
        InputStream inputStreamM45033;
        AbstractC1886.m6135(interfaceC5614);
        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f16208.get();
        AbstractC9677 abstractC9677 = this.f16212;
        boolean z2 = z && ((abstractC9677 instanceof C8289) || (abstractC9677 instanceof C21920));
        if (z2 && (abstractActivityC12483 == null || abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed())) {
            throw new C6120();
        }
        C2925 c2925 = new C2925(interfaceC5614, z2, abstractActivityC12483);
        C11621 c11621 = new C11621(abstractC9677);
        AbstractC9677 abstractC9678 = c11621.f39035;
        try {
            AbstractC1886.m6135(c2925);
            InterfaceC2557 interfaceC2557M24620 = abstractC9678.m24620(this.f16209);
            if (abstractC9678 instanceof C8289) {
                C8289 c8289 = (C8289) abstractC9678;
                if (z) {
                    inputStreamM45033 = c8289.m21714(abstractActivityC12483, interfaceC2557M24620, c2925);
                } else {
                    inputStreamM45033 = C19808.m45033(((C5696) interfaceC2557M24620).m15713(), c8289.m21723(), c8289.m21725(), c8289.m21722(), null);
                }
                try {
                    AbstractC1886.m6135(c2925);
                    if (inputStreamM45033 == null) {
                        throw new C6120();
                    }
                    byte[] bArr = new byte[32768];
                    while (true) {
                        AbstractC1886.m6135(c2925);
                        int i = inputStreamM45033.read(bArr);
                        AbstractC1886.m6135(c2925);
                        if (i < 0) {
                            break;
                        } else if (i > 0) {
                            outputStream.write(bArr, 0, i);
                        }
                    }
                    inputStreamM45033.close();
                } catch (Throwable th) {
                    if (inputStreamM45033 != null) {
                        try {
                            inputStreamM45033.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                C13738 c13738 = new C13738(outputStream, c2925);
                if (abstractC9678 instanceof C21920) {
                    ((C21920) abstractC9678).m48734(abstractActivityC12483, interfaceC2557M24620, c13738, z);
                } else {
                    abstractC9678.mo24618(abstractActivityC12483, interfaceC2557M24620, c13738);
                }
                AbstractC1886.m6135(c2925);
                if (c13738.f45293) {
                    throw new C6120();
                }
            }
            c11621.close();
        } catch (Throwable th3) {
            try {
                c11621.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
