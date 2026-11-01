package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23495 implements InterfaceC4941 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76076;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f76077;

    /* JADX INFO: renamed from: ֨ */
    public abstract InterfaceC17144 mo5498();

    public AbstractC23495(int i, int i2) {
        this.f76076 = i;
        this.f76077 = i2;
    }

    @Override // l.InterfaceC4941
    /* JADX INFO: renamed from: ۚ */
    public final int mo11887() {
        return this.f76076;
    }

    @Override // l.InterfaceC4941
    /* JADX INFO: renamed from: ۖ */
    public final int mo11885() {
        return this.f76077;
    }

    @Override // l.InterfaceC4941
    /* JADX INFO: renamed from: ۙ */
    public final C9384 mo11886() {
        return new C9384(this);
    }

    @Override // l.InterfaceC4941
    /* JADX INFO: renamed from: ᩹ */
    public final Iterator mo11890() {
        return new C5855(mo5498());
    }

    @Override // l.InterfaceC4941
    /* JADX INFO: renamed from: ۨ */
    public final Iterator mo11888() {
        return new C10795(mo5498(), this.f76076, this.f76077);
    }
}
