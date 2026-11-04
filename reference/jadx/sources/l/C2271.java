package l;

import java.util.List;

/* JADX INFO: renamed from: l.֫᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6AK */
/* JADX INFO: loaded from: classes3.dex */
public final class C2271 extends AbstractC8459 implements InterfaceC25392 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f7407;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f7408;

    public C2271(String str, List list) {
        this.f7407 = C23900.m53401(list);
        this.f7408 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2271 m7709(InterfaceC13524 interfaceC13524) {
        if (interfaceC13524 instanceof C2271) {
            return (C2271) interfaceC13524;
        }
        return new C2271(interfaceC13524.mo7392(), interfaceC13524.mo7393());
    }

    @Override // l.InterfaceC13524
    /* JADX INFO: renamed from: ܶ */
    public final List mo7393() {
        return this.f7407;
    }

    @Override // l.InterfaceC13524
    /* JADX INFO: renamed from: ۤ */
    public final String mo7392() {
        return this.f7408;
    }
}
