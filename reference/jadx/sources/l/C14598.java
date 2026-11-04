package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9R4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14598 extends AbstractC5935 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45985;

    public C14598(C16618 c16618) {
        super(c16618.m39315(256), c16618.m39315(256));
        this.f45985 = new ArrayList();
    }

    @Override // l.InterfaceC4904
    /* JADX INFO: renamed from: ᩺ */
    public final int mo7301() {
        return this.f45985.size();
    }

    @Override // l.InterfaceC4904
    /* JADX INFO: renamed from: ܶ */
    public final InterfaceC22058 mo7300(int i) {
        return (C21312) this.f45985.get(i);
    }
}
