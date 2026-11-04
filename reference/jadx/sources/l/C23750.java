package l;

import android.util.Pair;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.᩹ᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes2.dex */
public final class C23750 extends AbstractC13928 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f76972;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14406 f76973;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22311 f76974;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1997 f76975;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3612 f76976;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23750(C3612 c3612, C20766 c20766, C10745 c10745, C22311 c22311) {
        super(c20766, c10745);
        this.f76976 = c3612;
        this.f76974 = c22311;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ֫ */
    public final void mo7308(int i) {
        Pair pair = (Pair) this.f76974.get(i);
        C17359.requireNonNull(pair);
        C14406 c14406 = (C14406) pair.first;
        this.f76973 = c14406;
        this.f76975 = (C1997) pair.second;
        this.f76972 = this.f76976.f12375.m49876(c14406.m34842());
        C21576.m49068(new Runnable() { // from class: l.ܶᩴ۫
            @Override // java.lang.Runnable
            public final void run() {
                C23750 c23750 = this.f52894;
                c23750.f44160.m27393(c23750.f76973.m34846());
            }
        });
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo7311() {
        return new C8919(this.f76972);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩶ */
    public final void mo7312() {
        this.f76973.m34839(this.f76972);
        C3612 c3612 = this.f76976;
        c3612.f12373.add(new C21120(this.f76972, this.f76973.m34846(), this.f76975.m6840()));
        c3612.f12372.add(this.f76975.m6840());
    }
}
