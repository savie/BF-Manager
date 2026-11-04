package l;

import bin.mt.plus.Main;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩸ۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes.dex */
public final class C22589 implements InterfaceC0257 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f73027;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f73028;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22941 f73029;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24827 f73030;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f73031;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f73032;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f73033;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f73034;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8002 f73035;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f73036;

    public C22589(C24827 c24827, long j, long j2, C22941 c22941, boolean[] zArr, C8002 c8002) {
        this.f73030 = c24827;
        this.f73032 = j;
        this.f73028 = j2;
        this.f73029 = c22941;
        this.f73031 = zArr;
        this.f73035 = c8002;
    }

    @Override // l.InterfaceC0257
    /* JADX INFO: renamed from: ۙ */
    public final void mo1753(long j, long j2) {
        C24827 c24827 = this.f73030;
        c24827.m45193(j, j2);
        c24827.m43862(this.f73032 + j, this.f73028);
    }

    @Override // l.InterfaceC0257
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo1756() {
        C22941 c22941 = this.f73029;
        if (!c22941.m51745()) {
            this.f73036 = false;
            this.f73034 = false;
            return true;
        }
        this.f73031[0] = true;
        C8002 c8002 = this.f73035;
        if (C18902.m43879(c8002)) {
            if (this.f73027 == null) {
                this.f73027 = C18902.m43872(c22941, c8002, this);
            }
            this.f73036 = false;
            C10039 c10039 = new C10039((Main) null, c22941);
            c10039.m25890(new BooleanSupplier() { // from class: l.ۤۚ۫
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f33776.f73030.mo924();
                }
            });
            boolean zM25892 = c10039.m25892(this.f73027);
            this.f73034 = zM25892;
            return zM25892;
        }
        if (this.f73033 == null) {
            this.f73033 = C21054.m48118();
        }
        if (this.f73033.hasNext()) {
            c22941.m51730((String) this.f73033.next());
            this.f73036 = true;
            this.f73034 = false;
            return true;
        }
        this.f73036 = false;
        boolean zM25891 = new C10039((Main) null, c22941).m25891();
        this.f73034 = zM25891;
        return zM25891;
    }

    @Override // l.InterfaceC0257
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo1754() {
        return this.f73036;
    }

    @Override // l.InterfaceC0257
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo1755() {
        return this.f73034;
    }

    @Override // l.InterfaceC0257
    public final void cancel() {
        this.f73030.cancel();
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f73030.mo924();
    }
}
