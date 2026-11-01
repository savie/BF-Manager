package l;

/* JADX INFO: renamed from: l.ܰ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 95AM */
/* JADX INFO: loaded from: classes4.dex */
public final class C13475 extends AbstractC17581 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3097 f44541;

    public C13475(EnumC9947 enumC9947, AbstractC7124[] abstractC7124Arr, String str, String str2, String[] strArr, String str3) {
        super(enumC9947, abstractC7124Arr);
        this.f44541 = new C3097(str, str2, strArr, str3);
    }

    public C13475(EnumC9947 enumC9947, AbstractC7124[] abstractC7124Arr, C3097 c3097) {
        super(enumC9947, abstractC7124Arr);
        this.f44541 = c3097;
    }

    @Override // l.AbstractC17581
    /* JADX INFO: renamed from: ۘ */
    public final C14076 mo12099() {
        return this.f44541.m9293();
    }

    @Override // l.AbstractC8536, l.AbstractC7124
    public final AbstractC7124 clone() {
        return new C13475(this.f23823, m22290(), this.f44541);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C13475(this.f23823, m22291(c10527), this.f44541);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        int i;
        StringBuilder sb = new StringBuilder();
        EnumC9947 enumC9947 = EnumC9947.INVOKE_NEW;
        boolean z = true;
        C3097 c3097 = this.f44541;
        EnumC9947 enumC9948 = this.f23823;
        if (enumC9948 == enumC9947) {
            sb.append("new ");
            sb.append(C19378.m44398(c3097.m9294()));
        } else {
            if (enumC9948 == EnumC9947.INVOKE_STATIC) {
                sb.append(C19378.m44398(c3097.m9294()));
                sb.append('.');
                sb.append(c3097.m9295());
            } else {
                sb.append(this.f29544[0]);
                sb.append('.');
                sb.append(c3097.m9295());
                i = 1;
            }
            sb.append('(');
            while (i < this.f29544.length) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(this.f29544[i]);
                i++;
            }
            sb.append(')');
            return sb.toString();
        }
        i = 0;
        sb.append('(');
        while (i < this.f29544.length) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f29544[i]);
            i++;
        }
        sb.append(')');
        return sb.toString();
    }
}
