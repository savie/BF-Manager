package l;

/* JADX INFO: renamed from: l.᩷᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4P4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22305 extends AbstractC16139 implements Comparable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9976 f72212;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5151 f72213;

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13418() {
        return 4;
    }

    public C22305(C9976 c9976) {
        if (c9976 == null) {
            throw new NullPointerException("value == null");
        }
        this.f72212 = c9976;
        this.f72213 = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22305) {
            return this.f72212.equals(((C22305) obj).f72212);
        }
        return false;
    }

    public final int hashCode() {
        return this.f72212.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f72212.compareTo(((C22305) obj).f72212);
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_STRING_ID_ITEM;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        if (this.f72213 == null) {
            C19123 c19123M27706 = c10918.m27706();
            C5151 c5151 = new C5151(this.f72212);
            this.f72213 = c5151;
            c19123M27706.m44244((AbstractC10172) c5151);
        }
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo13417(C10918 c10918, C15000 c15000) {
        String str;
        int iM26285 = this.f72213.m26285();
        if (c15000.m36116()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m38318());
            sb.append(' ');
            String strMo1843 = this.f72212.mo1843();
            if (strMo1843.length() <= 98) {
                str = "";
            } else {
                strMo1843 = strMo1843.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + strMo1843 + str + '\"');
            c15000.m36111(0, sb.toString());
            c15000.m36111(4, "  string_data_off: ".concat(C5306.m15938(iM26285)));
        }
        c15000.m36124(iM26285);
    }

    public final C9976 getValue() {
        return this.f72212;
    }
}
