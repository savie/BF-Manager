package l;

/* JADX INFO: renamed from: l.ۛ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95AM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6686 extends AbstractC11905 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3177 f22277;

    public C6686(EnumC22260 enumC22260, AbstractC11071[] abstractC11071Arr, String str, String str2, String[] strArr, String str3) {
        super(enumC22260, abstractC11071Arr);
        this.f22277 = new C3177(str, str2, strArr, str3);
    }

    public C6686(EnumC22260 enumC22260, AbstractC11071[] abstractC11071Arr, C3177 c3177) {
        super(enumC22260, abstractC11071Arr);
        this.f22277 = c3177;
    }

    @Override // l.AbstractC11905
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12126 mo18707() {
        return this.f22277.m10373();
    }

    @Override // l.AbstractC5106, l.AbstractC11071
    public final AbstractC11071 clone() {
        return new C6686(this.f34921, m15447(), this.f22277);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C6686(this.f34921, m15449(c5194), this.f22277);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        int i;
        StringBuilder sb = new StringBuilder();
        EnumC22260 enumC22260 = EnumC22260.INVOKE_NEW;
        boolean z = true;
        C3177 c3177 = this.f22277;
        EnumC22260 enumC22261 = this.f34921;
        if (enumC22261 == enumC22260) {
            sb.append("new ");
            sb.append(C2211.m7539(c3177.m10371()));
        } else {
            if (enumC22261 == EnumC22260.INVOKE_STATIC) {
                sb.append(C2211.m7539(c3177.m10371()));
                sb.append('.');
                sb.append(c3177.m10374());
            } else {
                sb.append(this.f17809[0]);
                sb.append('.');
                sb.append(c3177.m10374());
                i = 1;
            }
            sb.append('(');
            while (i < this.f17809.length) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(this.f17809[i]);
                i++;
            }
            sb.append(')');
            return sb.toString();
        }
        i = 0;
        sb.append('(');
        while (i < this.f17809.length) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f17809[i]);
            i++;
        }
        sb.append(')');
        return sb.toString();
    }
}
