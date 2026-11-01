package l;

/* JADX INFO: renamed from: l.ܳܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U4P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14655 extends AbstractC9011 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23827 f47915;

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return i + 4;
    }

    public C14655(C12063 c12063, C23827 c23827) {
        super(c12063);
        this.f47915 = c23827;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14655 m35175(String str, C12063 c12063) {
        return (C14655) c12063.f40354.m28060(new C14655(c12063, C23827.m52502(str, c12063)));
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        this.f47915 = (C23827) c6187.m17183(EnumC21004.TYPE_STRING_DATA_ITEM, c13825.m33642());
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        c4651.m12839(this.f47915.f30807);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return "string_id_item: " + C16845.m39507(this.f47915.m52503());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m35176() {
        return this.f47915.m52503();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C14655 c14655) {
        return this.f47915.m52503().compareTo(c14655.f47915.m52503());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35178(String str) {
        this.f47915.m52504(str);
    }

    public final int hashCode() {
        return this.f47915.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C14655.class.equals(obj.getClass()) && this.f47915 == ((C14655) obj).f47915;
    }
}
