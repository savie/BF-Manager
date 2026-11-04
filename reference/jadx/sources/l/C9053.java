package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡ֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C9053 implements InterfaceC0171 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13528 f29444;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f29445;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IOException[] f29446;

    public C9053(C13528 c13528, HashMap map, IOException[] iOExceptionArr) {
        this.f29444 = c13528;
        this.f29445 = map;
        this.f29446 = iOExceptionArr;
    }

    @Override // l.InterfaceC0171
    /* JADX INFO: renamed from: ۙ */
    public final void mo1452(InterfaceC2386 interfaceC2386, InputStream inputStream) throws IOException {
        C12627 c12627 = (C12627) this.f29445.get(interfaceC2386);
        C17359.requireNonNull(c12627);
        C13528 c13528 = this.f29444;
        if (inputStream == null) {
            c13528.f42990.m6376();
            return;
        }
        try {
            c13528.m33228(c12627);
            if (!c13528.m33222(c12627, interfaceC2386)) {
                if (!((C1178) c13528.f42983).f4312.mo924()) {
                    c13528.m33217(inputStream, interfaceC2386.getSize(), true);
                    if (!((C1178) c13528.f42983).f4312.mo924()) {
                        c13528.f42990.m6378(c12627.m18622());
                    }
                }
                inputStream.close();
                return;
            }
            AbstractC22044 abstractC22044M18641 = c12627.m18641();
            abstractC22044M18641.m49841(inputStream, interfaceC2386.getSize(), new C0850(this));
            if (((C1178) c13528.f42983).f4312.mo924()) {
                abstractC22044M18641.mo4287();
                inputStream.close();
                return;
            }
            if (c12627.m18628() != null) {
                C24523 c24523 = new C24523();
                c24523.m54793(c12627.m18628());
                c24523.m54797(abstractC22044M18641);
            }
            c13528.f42991.m11432(c12627.m18624(), abstractC22044M18641.getName());
            c13528.f42990.m6378(c12627.m18622());
            C20108.m46233(c12627.m18626(), true);
            if (c12627.m18620() != null) {
                c13528.f42988.add((String) c12627.m18620());
            }
            if (c13528.f42984 && c12627.m18627() > 0 && abstractC22044M18641.mo2945()) {
                c13528.f42989.m18993(abstractC22044M18641, c12627.m18627());
            }
            inputStream.close();
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC0171
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1453(IOException iOException) {
        this.f29446[0] = iOException;
        return false;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return ((C1178) this.f29444.f42983).mo924();
    }
}
