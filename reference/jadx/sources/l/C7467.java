package l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8HI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7467 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f24716;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Uri f24717;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f24718;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Map f24719;

    public C7467(InterfaceC13433 interfaceC13433) {
        interfaceC13433.getClass();
        this.f24718 = interfaceC13433;
        this.f24717 = Uri.EMPTY;
        this.f24719 = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20510() {
        this.f24716 = 0L;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m20513() {
        return this.f24716;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Uri m20512() {
        return this.f24717;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map m20511() {
        return this.f24719;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) {
        InterfaceC13433 interfaceC13433 = this.f24718;
        this.f24717 = c25368.f81907;
        this.f24719 = Collections.EMPTY_MAP;
        try {
            return interfaceC13433.mo8326(c25368);
        } finally {
            Uri uriMo8327 = interfaceC13433.mo8327();
            if (uriMo8327 != null) {
                this.f24717 = uriMo8327;
            }
            this.f24719 = interfaceC13433.mo10893();
        }
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f24718.read(bArr, i, i2);
        if (i3 != -1) {
            this.f24716 += (long) i3;
        }
        return i3;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f24718.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        return this.f24718.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        this.f24718.close();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        interfaceC4639.getClass();
        this.f24718.mo10894(interfaceC4639);
    }
}
