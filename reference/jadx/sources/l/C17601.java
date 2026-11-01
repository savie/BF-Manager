package l;

import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.ܿ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17601 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f55939;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5712 f55940;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC14780 f55941;

    public C17601(C12063 c12063) {
        super(c12063);
        this.f55939 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17601 m40923(C12063 c12063) {
        EnumC14780 enumC14780 = this.f55941;
        C5712 c5712 = this.f55940;
        C1953 c1953 = c5712.f19460;
        C14655[] c14655Arr = null;
        C1953 c1953M6312 = c1953 == null ? null : C1953.m6312(c1953.m6314(), c12063);
        C14655[] c14655Arr2 = c5712.f19459;
        if (c14655Arr2 != null) {
            int length = c14655Arr2.length;
            C14655[] c14655Arr3 = new C14655[length];
            for (int i = 0; i < length; i++) {
                c14655Arr3[i] = C14655.m35175(c14655Arr2[i].m35176(), c12063);
            }
            c14655Arr = c14655Arr3;
        }
        C5712 c5713 = new C5712(c1953M6312, c14655Arr, c5712.m15746(c12063));
        C17601 c17601 = new C17601(c12063);
        c17601.f55939 = 0;
        c17601.f55941 = enumC14780;
        c17601.f55940 = c5713;
        return (C17601) c12063.f40348.m28060(c17601);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        this.f55941 = EnumC14780.m35419(c13825.m33645());
        this.f55940 = new C5712(this.f30808, c13825);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return this.f55940.mo4462(i + 1);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        c4651.m12841(this.f55941.f48329);
        this.f55940.mo4463(c4651);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return C9576.m24440(new StringBuilder("annotation_item @0x"), this.f30807);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C17601 c17601) {
        int i = this.f55941.f48329 - c17601.f55941.f48329;
        return i == 0 ? this.f55940.compareTo(c17601.f55940) : i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5712 m40921() {
        return this.f55940;
    }

    public final int hashCode() {
        if (this.f55939 == 0) {
            byte b = this.f55941.f48329;
            this.f55939 = b;
            this.f55939 = this.f55940.hashCode() + (b * bo.j);
        }
        return this.f55939;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17601.class.equals(obj.getClass())) {
            C17601 c17601 = (C17601) obj;
            if (this.f55941 == c17601.f55941 && this.f55940.equals(c17601.f55940)) {
                return true;
            }
        }
        return false;
    }
}
