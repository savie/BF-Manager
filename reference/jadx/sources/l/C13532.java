package l;

/* JADX INFO: renamed from: l.۬֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 056O */
/* JADX INFO: loaded from: classes4.dex */
public final class C13532 extends AbstractC8704 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C13532 f42996 = new C13532();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient Object f42997;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final transient int f42998;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient C13532 f42999;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final transient int f43000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final transient Object[] f43001;

    @Override // l.AbstractC17589
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo33237() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f43000;
    }

    @Override // l.AbstractC8704, l.InterfaceC23754
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC8704 mo23396() {
        return this.f42999;
    }

    @Override // l.InterfaceC23754
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC23754 mo23396() {
        return this.f42999;
    }

    @Override // l.AbstractC17589, java.util.Map
    public final Object get(Object obj) {
        Object objM36760 = C15307.m36760(this.f42997, this.f43001, this.f43000, this.f42998, obj);
        if (objM36760 == null) {
            return null;
        }
        return objM36760;
    }

    @Override // l.AbstractC17589, java.util.Map
    public final AbstractC8639 entrySet() {
        return new C10832(this, this.f43001, this.f42998, this.f43000);
    }

    @Override // l.AbstractC17589, java.util.Map
    public final AbstractC8639 keySet() {
        return new C22767(this, new C19783(this.f42998, this.f43000, this.f43001));
    }

    @Override // l.AbstractC8704, l.AbstractC17589
    public Object writeReplace() {
        return super.writeReplace();
    }

    public C13532() {
        this.f42997 = null;
        this.f43001 = new Object[0];
        this.f42998 = 0;
        this.f43000 = 0;
        this.f42999 = this;
    }

    public C13532(int i, Object[] objArr) {
        this.f43001 = objArr;
        this.f43000 = i;
        this.f42998 = 0;
        int iM23275 = i >= 2 ? AbstractC8639.m23275(i) : 0;
        this.f42997 = C15307.m36762(i, iM23275, 0, objArr);
        this.f42999 = new C13532(C15307.m36762(i, iM23275, 1, objArr), objArr, i, this);
    }

    public C13532(Object obj, Object[] objArr, int i, C13532 c13532) {
        this.f42997 = obj;
        this.f43001 = objArr;
        this.f42998 = 1;
        this.f43000 = i;
        this.f42999 = c13532;
    }
}
