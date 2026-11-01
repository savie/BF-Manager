package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21873 implements InterfaceC1411 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15524 f70966;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19000 f70967;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile Object f70968;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12257 f70970;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f70971 = 4;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f70969 = C13863.m33700();

    @Override // l.InterfaceC1411
    /* JADX INFO: renamed from: ܰ */
    public final void mo2335() {
    }

    public C21873(InterfaceC15785 interfaceC15785, C12257 c12257, InterfaceC15524 interfaceC15524) {
        this.f70967 = new C19000(interfaceC15785);
        this.f70970 = c12257;
        this.f70966 = interfaceC15524;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object m48653() {
        return this.f70968;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m48654() {
        return this.f70967.m43703();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Uri m48655() {
        return this.f70967.m43700();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map m48652() {
        return this.f70967.m43702();
    }

    @Override // l.InterfaceC1411
    /* JADX INFO: renamed from: ۙ */
    public final void mo2330() {
        this.f70967.m43701();
        C0261 c0261 = new C0261(this.f70967, this.f70970);
        try {
            c0261.m1760();
            Uri uriMo9274 = this.f70967.mo9274();
            uriMo9274.getClass();
            this.f70968 = this.f70966.mo5207(uriMo9274, c0261);
        } finally {
            C17983.m41837(c0261);
        }
    }
}
