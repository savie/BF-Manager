package l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8HI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19000 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Map f61495;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f61496;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Uri f61497;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f61498;

    public C19000(InterfaceC15785 interfaceC15785) {
        interfaceC15785.getClass();
        this.f61498 = interfaceC15785;
        this.f61497 = Uri.EMPTY;
        this.f61495 = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m43701() {
        this.f61496 = 0L;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m43703() {
        return this.f61496;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Uri m43700() {
        return this.f61497;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Map m43702() {
        return this.f61495;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) {
        InterfaceC15785 interfaceC15785 = this.f61498;
        this.f61497 = c12257.f41015;
        this.f61495 = Collections.EMPTY_MAP;
        try {
            return interfaceC15785.mo9272(c12257);
        } finally {
            Uri uriMo9274 = interfaceC15785.mo9274();
            if (uriMo9274 != null) {
                this.f61497 = uriMo9274;
            }
            this.f61495 = interfaceC15785.mo9273();
        }
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f61498.read(bArr, i, i2);
        if (i3 != -1) {
            this.f61496 += (long) i3;
        }
        return i3;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f61498.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        return this.f61498.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        this.f61498.close();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        interfaceC19706.getClass();
        this.f61498.mo11161(interfaceC19706);
    }
}
