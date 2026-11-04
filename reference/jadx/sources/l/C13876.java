package l;

import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۬۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13876 implements InterfaceC0257 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f44007;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4662 f44008;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f44009;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f44010;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8002 f44011;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f44012;

    public C13876(C4662 c4662, C8002 c8002) {
        this.f44008 = c4662;
        this.f44011 = c8002;
    }

    @Override // l.InterfaceC0257
    /* JADX INFO: renamed from: ۙ */
    public final void mo1753(long j, long j2) {
        this.f44008.f16466.m25927(j, j2);
    }

    @Override // l.InterfaceC0257
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo1756() {
        C4662 c4662 = this.f44008;
        C8614 c8614 = c4662.f16469;
        if (!c4662.f16467.m51745()) {
            this.f44012 = false;
            this.f44010 = false;
            return true;
        }
        C8002 c8002 = this.f44011;
        if (C18902.m43879(c8002)) {
            if (this.f44007 == null) {
                this.f44007 = C18902.m43872(c4662.f16467, c8002, this);
            }
            this.f44012 = false;
            C10039 c10039 = new C10039(c8614.m23233(), c4662.f16467);
            c10039.m25890(new BooleanSupplier() { // from class: l.ۜ۬۫
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f23676.mo924();
                }
            });
            boolean zM25892 = c10039.m25892(this.f44007);
            this.f44010 = zM25892;
            return zM25892;
        }
        if (this.f44009 == null) {
            this.f44009 = C21054.m48118();
        }
        if (this.f44009.hasNext()) {
            c4662.f16467.m51730((String) this.f44009.next());
            this.f44012 = true;
            this.f44010 = false;
            return true;
        }
        this.f44012 = false;
        boolean zM25891 = new C10039(c8614.m23233(), c4662.f16467).m25891();
        this.f44010 = zM25891;
        return zM25891;
    }

    @Override // l.InterfaceC0257
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo1754() {
        return this.f44012;
    }

    @Override // l.InterfaceC0257
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo1755() {
        return this.f44010;
    }

    @Override // l.InterfaceC0257
    public final void cancel() {
        this.f44008.f16466.m27402();
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f44008.f16466.m27399();
    }
}
