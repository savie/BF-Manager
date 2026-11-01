package l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11205 extends AbstractC21428 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f37920;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C1388 f37921;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f37922;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11601 f37923;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f37924;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C9246 f37925;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Uri f37926;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11205(C11601 c11601) {
        super(c11601.f38981 instanceof AbstractC12233);
        this.f37923 = c11601;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws Throwable {
        boolean zM28912;
        Uri uri = c12257.f41015;
        long jM23773 = c12257.f41017;
        this.f37926 = uri;
        long j = c12257.f41009;
        this.f37924 = j;
        m48019(c12257);
        Uri uri2 = this.f37926;
        C11601 c11601 = this.f37923;
        InterfaceC2557 interfaceC2557M28931 = c11601.m28931(uri2);
        if (C2529.m7902(interfaceC2557M28931.getName()) != null) {
            zM28912 = C11601.m28912(c11601, interfaceC2557M28931);
        } else {
            c11601.m28929(interfaceC2557M28931);
            zM28912 = false;
        }
        if (c11601.f38983 == null) {
            return m28145(c12257, interfaceC2557M28931.mo7989());
        }
        String strM28919 = C11601.m28919(interfaceC2557M28931);
        AbstractC20745 abstractC20745M28896 = C11601.m28896(c11601, strM28919);
        if (c11601.m28905(interfaceC2557M28931, abstractC20745M28896)) {
            c11601.m28911(interfaceC2557M28931, strM28919);
            return m28145(c12257, abstractC20745M28896);
        }
        if (!zM28912) {
            if (!C11601.m28918(c11601, interfaceC2557M28931)) {
                return m28145(c12257, abstractC20745M28896);
            }
            C9246 c9246M28894 = c11601.m28894(interfaceC2557M28931, strM28919, true);
            this.f37925 = c9246M28894;
            if (jM23773 == -1) {
                jM23773 = c9246M28894.m23773() - j;
            }
            this.f37922 = jM23773;
            if (jM23773 < 0) {
                throw new C20018(null, null, 2008);
            }
            this.f37920 = true;
            m48018(c12257);
            return this.f37922;
        }
        AbstractC9677 abstractC9677 = c11601.f38981;
        if (!(abstractC9677 instanceof AbstractC12233)) {
            throw new IOException("Network range cache is not available");
        }
        C9246 c9246 = new C9246(new C5623((AbstractC12233) abstractC9677, interfaceC2557M28931), interfaceC2557M28931.getName(), interfaceC2557M28931.getSize());
        this.f37925 = c9246;
        if (jM23773 == -1) {
            jM23773 = c9246.m23773() - j;
        }
        this.f37922 = jM23773;
        if (jM23773 < 0) {
            throw new C20018(null, null, 2008);
        }
        this.f37920 = true;
        m48018(c12257);
        return this.f37922;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m28145(C12257 c12257, AbstractC20745 abstractC20745) throws C20018 {
        C1388 c1388M46710 = abstractC20745.m46710("r");
        this.f37921 = c1388M46710;
        c1388M46710.seek(c12257.f41009);
        long length = c12257.f41017;
        if (length == -1) {
            length = this.f37921.length() - c12257.f41009;
        }
        this.f37922 = length;
        if (length < 0) {
            throw new C20018(null, null, 2008);
        }
        this.f37920 = true;
        m48018(c12257);
        return this.f37922;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws C20018 {
        int iM23776;
        if (i2 == 0) {
            return 0;
        }
        long j = this.f37922;
        if (j == 0) {
            return -1;
        }
        try {
            C1388 c1388 = this.f37921;
            if (c1388 != null) {
                iM23776 = c1388.read(bArr, i, (int) Math.min(j, i2));
            } else {
                iM23776 = this.f37925.m23776(this.f37924, bArr, i, (int) Math.min(j, i2));
            }
            if (iM23776 > 0) {
                long j2 = iM23776;
                this.f37924 += j2;
                this.f37922 -= j2;
                m48017(iM23776);
            }
            return iM23776;
        } catch (IOException e) {
            throw new C20018(2000, e);
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f37926;
    }

    @Override // l.InterfaceC15785
    public final void close() {
        this.f37926 = null;
        try {
            try {
                C1388 c1388 = this.f37921;
                if (c1388 != null) {
                    c1388.close();
                }
                C9246 c9246 = this.f37925;
                if (c9246 != null) {
                    c9246.close();
                }
                this.f37921 = null;
                this.f37925 = null;
                if (this.f37920) {
                    this.f37920 = false;
                    m48020();
                }
            } catch (IOException e) {
                throw new C20018(2000, e);
            }
        } catch (Throwable th) {
            this.f37921 = null;
            this.f37925 = null;
            if (this.f37920) {
                this.f37920 = false;
                m48020();
            }
            throw th;
        }
    }
}
