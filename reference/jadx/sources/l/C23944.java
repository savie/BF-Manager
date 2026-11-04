package l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes2.dex */
public final class C23944 extends AbstractC8433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13961 f77503;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f77504;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9771 f77505;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f77506;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8351 f77507;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f77508;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Uri f77509;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23944(C9771 c9771) {
        super(c9771.f31502 instanceof AbstractC18881);
        this.f77505 = c9771;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws Throwable {
        boolean zM25459;
        Uri uri = c25368.f81907;
        long jM22473 = c25368.f81910;
        this.f77509 = uri;
        long j = c25368.f81909;
        this.f77504 = j;
        m22621(c25368);
        Uri uri2 = this.f77509;
        C9771 c9771 = this.f77505;
        InterfaceC2386 interfaceC2386M25478 = c9771.m25478(uri2);
        if (C25321.m56594(interfaceC2386M25478.getName()) != null) {
            zM25459 = C9771.m25459(c9771, interfaceC2386M25478);
        } else {
            c9771.m25475(interfaceC2386M25478);
            zM25459 = false;
        }
        if (c9771.f31508 == null) {
            return m53471(c25368, interfaceC2386M25478.mo8093());
        }
        String strM25461 = C9771.m25461(interfaceC2386M25478);
        AbstractC22044 abstractC22044M25444 = C9771.m25444(c9771, strM25461);
        if (c9771.m25452(interfaceC2386M25478, abstractC22044M25444)) {
            c9771.m25458(interfaceC2386M25478, strM25461);
            return m53471(c25368, abstractC22044M25444);
        }
        if (!zM25459) {
            if (!C9771.m25467(c9771, interfaceC2386M25478)) {
                return m53471(c25368, abstractC22044M25444);
            }
            C8351 c8351M25441 = c9771.m25441(interfaceC2386M25478, strM25461, true);
            this.f77507 = c8351M25441;
            if (jM22473 == -1) {
                jM22473 = c8351M25441.m22473() - j;
            }
            this.f77508 = jM22473;
            if (jM22473 < 0) {
                throw new C5976(null, null, 2008);
            }
            this.f77506 = true;
            m22619(c25368);
            return this.f77508;
        }
        AbstractC7629 abstractC7629 = c9771.f31502;
        if (!(abstractC7629 instanceof AbstractC18881)) {
            throw new IOException("Network range cache is not available");
        }
        C8351 c8351 = new C8351(new C3963((AbstractC18881) abstractC7629, interfaceC2386M25478), interfaceC2386M25478.getName(), interfaceC2386M25478.getSize());
        this.f77507 = c8351;
        if (jM22473 == -1) {
            jM22473 = c8351.m22473() - j;
        }
        this.f77508 = jM22473;
        if (jM22473 < 0) {
            throw new C5976(null, null, 2008);
        }
        this.f77506 = true;
        m22619(c25368);
        return this.f77508;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m53471(C25368 c25368, AbstractC22044 abstractC22044) throws C5976 {
        C13961 c13961M49855 = abstractC22044.m49855("r");
        this.f77503 = c13961M49855;
        c13961M49855.seek(c25368.f81909);
        long length = c25368.f81910;
        if (length == -1) {
            length = this.f77503.length() - c25368.f81909;
        }
        this.f77508 = length;
        if (length < 0) {
            throw new C5976(null, null, 2008);
        }
        this.f77506 = true;
        m22619(c25368);
        return this.f77508;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws C5976 {
        int iM22472;
        if (i2 == 0) {
            return 0;
        }
        long j = this.f77508;
        if (j == 0) {
            return -1;
        }
        try {
            C13961 c13961 = this.f77503;
            if (c13961 != null) {
                iM22472 = c13961.read(bArr, i, (int) Math.min(j, i2));
            } else {
                iM22472 = this.f77507.m22472(this.f77504, bArr, i, (int) Math.min(j, i2));
            }
            if (iM22472 > 0) {
                long j2 = iM22472;
                this.f77504 += j2;
                this.f77508 -= j2;
                m22622(iM22472);
            }
            return iM22472;
        } catch (IOException e) {
            throw new C5976(2000, e);
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f77509;
    }

    @Override // l.InterfaceC13433
    public final void close() {
        this.f77509 = null;
        try {
            try {
                C13961 c13961 = this.f77503;
                if (c13961 != null) {
                    c13961.close();
                }
                C8351 c8351 = this.f77507;
                if (c8351 != null) {
                    c8351.close();
                }
                this.f77503 = null;
                this.f77507 = null;
                if (this.f77506) {
                    this.f77506 = false;
                    m22620();
                }
            } catch (IOException e) {
                throw new C5976(2000, e);
            }
        } catch (Throwable th) {
            this.f77503 = null;
            this.f77507 = null;
            if (this.f77506) {
                this.f77506 = false;
                m22620();
            }
            throw th;
        }
    }
}
