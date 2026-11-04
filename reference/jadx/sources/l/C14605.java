package l;

/* JADX INFO: renamed from: l.ܰ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes5.dex */
public final class C14605 extends AbstractC1928 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7894 f46008;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46009;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2346 f46010;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46011;

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return true;
    }

    public C14605(C7894 c7894, int i, int i2, C2346 c2346) {
        this.f46009 = i;
        this.f46011 = i2;
        this.f46010 = c2346;
        this.f46008 = c7894;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46009;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f46009;
        C12128.m30302(i, i2);
        int i3 = this.f46011;
        C7894 c7894 = this.f46008;
        return (i == 0 || i == i2 + (-1)) ? ((C2346) c7894.f26242.get(i + i3)).m7923(this.f46010) : (C2346) c7894.f26242.get(i + i3);
    }

    @Override // l.AbstractC1928, l.AbstractC4911
    public Object writeReplace() {
        return super.writeReplace();
    }
}
