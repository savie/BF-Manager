package l;

import java.util.Map;

/* JADX INFO: renamed from: l.֫ܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1971 extends AbstractC4332 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f7404;

    public C1971(Map map) {
        super(2);
        this.f7404 = map;
    }

    @Override // l.AbstractC4332
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6345(InterfaceC12061 interfaceC12061, C6205 c6205) {
        c6205.m17213(new C11145(this, interfaceC12061));
        c6205.m17212(new C23845(this, interfaceC12061));
        c6205.m17210();
    }

    @Override // l.AbstractC4332
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3382 mo6344(String str) {
        return (AbstractC3382) this.f7404.get(str);
    }
}
