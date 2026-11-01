package l;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.engio.mbassy.listener.Handler;

/* JADX INFO: renamed from: l.֨ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1163 extends C9363 implements Closeable, InterfaceC22729 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19946 f5203;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20215 f5204;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C8864 f5205;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C20215 f5206;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f5207;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15982 f5208;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6808 f5209;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C10006 f5210;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13159 f5211;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0458 f5212;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC18035 f5213;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16418 f5214;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15276 f5215;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5335 f5216;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C4629 f5217;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f5202 = C13488.m32997(C1163.class);

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final C22331 f5201 = new C22331(new C8243(), new C21648(), new C5420(), new C19097());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4286(InterfaceC8805 interfaceC8805) {
        this.f5217.m39153((AbstractC7245) interfaceC8805);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19946 m4295() {
        return this.f5203;
    }

    public C1163(C16418 c16418, C19946 c19946, C5335 c5335, C8864 c8864) {
        C20215 c20215 = new C20215();
        this.f5206 = c20215;
        this.f5204 = new C20215();
        C6808 c6808 = new C6808();
        this.f5209 = c6808;
        C3573 c3573 = new C3573();
        this.f5207 = new ReentrantLock();
        this.f5214 = c16418;
        this.f5203 = c19946;
        C4449 c4449M38671 = c16418.m38671();
        C16104 c16104 = new C16104(new C9421(), this, f5201);
        c4449M38671.getClass();
        this.f5210 = new C10006(c16418.m38660(), c16418.m38668(), c16104);
        this.f5216 = c5335;
        this.f5205 = c8864;
        c5335.m14812(this);
        this.f5208 = new C15982();
        if (c16418.m38665()) {
            this.f5212 = new C18097(c16418.m38658());
        } else {
            f5202.mo12116("Signing is disabled for this connection.");
            this.f5212 = new C21460();
        }
        this.f5215 = new C15276(c16418.m38658());
        C4629 c4629 = new C4629(c20215, this.f5215);
        C11043 c11043 = new C11043();
        C14571 c14571 = new C14571(c6808);
        C3280 c3280 = new C3280(c20215, this.f5212);
        C23743 c23743 = new C23743(this.f5208);
        C6103 c6103 = new C6103(c6808);
        C9632 c9632 = new C9632(c3573, c6808);
        C17392 c17392 = new C17392();
        c17392.m39152(new C12454());
        c9632.m39152(c17392);
        c6103.m39152(c9632);
        c23743.m39152(c6103);
        c3280.m39152(c23743);
        c14571.m39152(c3280);
        c11043.m39152(c14571);
        c4629.m39152(c11043);
        this.f5217 = c4629;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m4288(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4288(boolean z) {
        if (z || m24011()) {
            C5335 c5335 = this.f5216;
            C10006 c10006 = this.f5210;
            InterfaceC4314 interfaceC4314 = f5202;
            if (!z) {
                try {
                    for (C20858 c20858 : this.f5206.m45672()) {
                        try {
                            c20858.m46885();
                        } catch (IOException e) {
                            interfaceC4314.mo12132("Exception while closing session {}", Long.valueOf(c20858.m46886()), e);
                        }
                    }
                } catch (Throwable th) {
                    c10006.m25281();
                    interfaceC4314.mo12134(m4292(), "Closed connection to {}");
                    c5335.m14813(new C13803(this.f5211.m32539().m44499(), this.f5211.m32539().m44501()));
                    throw th;
                }
            }
            c10006.m25281();
            interfaceC4314.mo12134(m4292(), "Closed connection to {}");
            c5335.m14813(new C13803(this.f5211.m32539().m44499(), this.f5211.m32539().m44501()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20858 m4285(C12185 c12185) {
        return new C20920(this, this.f5214, new C2574(this)).m47036(c12185);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11771 m4283(C11771 c11771) {
        C13557 c13557M4284 = m4284(c11771, false);
        long jM38674 = this.f5214.m38674();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC11440 interfaceC11440 = C21317.f69360;
        return (C11771) C2266.m6947(jM38674, c13557M4284);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #1 {all -> 0x00ca, blocks: (B:5:0x000f, B:8:0x0025, B:10:0x002d, B:17:0x0042, B:19:0x004d, B:21:0x0060, B:24:0x00c9, B:15:0x003e, B:20:0x005c), top: B:33:0x000f, inners: #0 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13557 m4284(C11771 c11771, boolean z) {
        C13557 c13557M43366;
        C15982 c15982 = this.f5208;
        if (c11771.mo29408() instanceof C7537) {
            c13557M43366 = null;
        } else {
            ReentrantLock reentrantLock = this.f5207;
            reentrantLock.lock();
            try {
                int iM37961 = c15982.m37961();
                int iAbs = Math.abs((c11771.mo29405() - 1) / 65536) + 1;
                InterfaceC4314 interfaceC4314 = f5202;
                if (iAbs <= 1 || this.f5211.m32547()) {
                    if (iAbs >= iM37961) {
                        if (iAbs > 1 && iM37961 > 1) {
                            iAbs = iM37961 - 1;
                        }
                    }
                    ((C1186) c11771.mo25478()).m4330(iAbs);
                    if (iM37961 == 0) {
                        interfaceC4314.mo12115(((C1186) c11771.mo25478()).m4325(), "There are no credits left to send {}, will block until there are more credits available.");
                    }
                    ((C1186) c11771.mo25478()).m4344(c15982.m37963(iAbs)[0]);
                    ((C1186) c11771.mo25478()).m4343(Math.max((512 - iM37961) - iAbs, iAbs));
                    interfaceC4314.mo12139("Granted {} (out of {}) credits to {}", Integer.valueOf(iAbs), Integer.valueOf(iM37961), c11771);
                    reentrantLock.unlock();
                    C18803 c18803 = new C18803(c11771.mo29408(), ((C1186) c11771.mo25478()).m4341(), UUID.randomUUID(), z);
                    this.f5209.m18404(c18803);
                    c13557M43366 = c18803.m43366(new C5397(this, c18803, ((C1186) c11771.mo25478()).m4337()));
                } else {
                    interfaceC4314.mo12129(m4292(), "Connection to {} does not support multi-credit requests.");
                }
                iAbs = 1;
                ((C1186) c11771.mo25478()).m4330(iAbs);
                if (iM37961 == 0) {
                    interfaceC4314.mo12115(((C1186) c11771.mo25478()).m4325(), "There are no credits left to send {}, will block until there are more credits available.");
                }
                ((C1186) c11771.mo25478()).m4344(c15982.m37963(iAbs)[0]);
                ((C1186) c11771.mo25478()).m4343(Math.max((512 - iM37961) - iAbs, iAbs));
                interfaceC4314.mo12139("Granted {} (out of {}) credits to {}", Integer.valueOf(iAbs), Integer.valueOf(iM37961), c11771);
                reentrantLock.unlock();
                C18803 c18804 = new C18803(c11771.mo29408(), ((C1186) c11771.mo25478()).m4341(), UUID.randomUUID(), z);
                this.f5209.m18404(c18804);
                c13557M43366 = c18804.m43366(new C5397(this, c18804, ((C1186) c11771.mo25478()).m4337()));
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f5210.m25283(c11771);
        return c13557M43366;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3985 m4290() {
        return this.f5211.m32548();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4287(C21317 c21317) {
        this.f5209.m18405(c21317);
        try {
            m4288(false);
        } catch (Exception e) {
            f5202.mo12121("{} while closing connection on error, ignoring: {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m4292() {
        return this.f5211.m32539().m44499();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m4289() {
        return this.f5210.m25284();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m4291(int i, String str) {
        C10006 c10006 = this.f5210;
        if (c10006.m25284()) {
            throw new IllegalStateException(C0252.m1693("This connection is already connected to ", m4292()));
        }
        c10006.m25282(new InetSocketAddress(str, i));
        C16418 c16418 = this.f5214;
        this.f5211 = new C13159(c16418.m38669(), str, i, c16418);
        new C8926(this, c16418, this.f5211).m23216();
        this.f5215.m36587(this.f5211);
        this.f5213 = new C8158();
        f5202.mo12134(m4292(), "Successfully connected to: {}");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C13159 m4281() {
        return this.f5211;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m4282() {
        return this.f5208.m37961();
    }

    @Handler
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4275(C1101 c1101) {
        this.f5206.m45675(Long.valueOf(c1101.m49436()));
        f5202.mo12126(Long.valueOf(c1101.m49436()), "Session << {} >> logged off");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20215 m4293() {
        return this.f5206;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20215 m4294() {
        return this.f5204;
    }
}
