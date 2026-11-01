package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes3.dex */
public final class C5293 implements InterfaceC17556 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f18306;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f18307;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18308;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f18309;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f18310;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f18311;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22227 f18312;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f18313;

    public C5293(C18699 c18699, C12618 c12618) {
        ArrayList arrayList = new ArrayList();
        this.f18310 = arrayList;
        this.f18312 = null;
        this.f18309 = false;
        this.f18307 = true;
        this.f18311 = -1;
        if (c12618 == null) {
            return;
        }
        c12618.m31404(this);
        if (this.f18308) {
            this.f18312.m49352((C22227) arrayList.get(this.f18311));
            arrayList.set(this.f18311, this.f18312);
            this.f18308 = false;
        }
        C22227 c22227 = this.f18312;
        if (c22227 != null) {
            arrayList.add(c22227);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m14666() {
        return this.f18310;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ */
    public final void mo4004(float f, float f2) {
        boolean z = this.f18308;
        ArrayList arrayList = this.f18310;
        if (z) {
            this.f18312.m49352((C22227) arrayList.get(this.f18311));
            arrayList.set(this.f18311, this.f18312);
            this.f18308 = false;
        }
        C22227 c22227 = this.f18312;
        if (c22227 != null) {
            arrayList.add(c22227);
        }
        this.f18313 = f;
        this.f18306 = f2;
        this.f18312 = new C22227(f, f2, 0.0f, 0.0f);
        this.f18311 = arrayList.size();
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ܰ */
    public final void mo4008(float f, float f2) {
        this.f18312.m49351(f, f2);
        this.f18310.add(this.f18312);
        C22227 c22227 = this.f18312;
        this.f18312 = new C22227(f, f2, f - c22227.f72684, f2 - c22227.f72686);
        this.f18308 = false;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ */
    public final void mo4006(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f18307 || this.f18309) {
            this.f18312.m49351(f, f2);
            this.f18310.add(this.f18312);
            this.f18309 = false;
        }
        this.f18312 = new C22227(f5, f6, f5 - f3, f6 - f4);
        this.f18308 = false;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ */
    public final void mo4005(float f, float f2, float f3, float f4) {
        this.f18312.m49351(f, f2);
        this.f18310.add(this.f18312);
        this.f18312 = new C22227(f3, f4, f3 - f, f4 - f2);
        this.f18308 = false;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ */
    public final void mo4007(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.f18309 = true;
        this.f18307 = false;
        C22227 c22227 = this.f18312;
        C18699.m43200(c22227.f72684, c22227.f72686, f, f2, f3, z, z2, f4, f5, this);
        this.f18307 = true;
        this.f18308 = false;
    }

    @Override // l.InterfaceC17556
    public final void close() {
        this.f18310.add(this.f18312);
        mo4008(this.f18313, this.f18306);
        this.f18308 = true;
    }
}
