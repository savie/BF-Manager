package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۖ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7G8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2352 extends C12156 {
    @Override // l.C12156
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void mo7965() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = this.f39082.length - 1;
        boolean z = this.f67132;
        String str = z ? "" : l.b;
        int i = 0;
        while (i <= length) {
            String str2 = ", ";
            if (z) {
                sb.append("#");
                sb.append(this.f39082[i]);
                sb.append(i == length ? l.b : ", ");
            }
            sb2.append(this.f6371.m5644(this.f39082[i]));
            if (i == length) {
                str2 = str;
            }
            sb2.append(str2);
            i++;
        }
        m47997(m47996(mo46523(), this.f39081.m15637()));
        if (z) {
            if (this.f67146) {
                m48006(sb.toString());
                return;
            }
            this.f67151.mo3879(m47996(m47999(), sb.toString()));
            m48006(" // " + ((Object) sb2));
            return;
        }
        m48006(sb2.toString());
    }

    @Override // l.C12156
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void mo7966() {
        String string;
        String strM15637 = this.f39081.m15637();
        int length = strM15637.length();
        if (length < 0) {
            throw new IllegalArgumentException(C13645.m33382(length, "count is negative: "));
        }
        if (length != 0) {
            string = " ";
            if (length != 1) {
                if (1 > Integer.MAX_VALUE / length) {
                    throw new OutOfMemoryError(C14442.m34864(length, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(length);
                for (int i = 0; i < length; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        } else {
            string = "";
        }
        int length2 = this.f39082.length - 1;
        int i2 = 0;
        while (i2 <= length2) {
            if (!this.f67132) {
                m47997(m47996(mo46523(), i2 == 0 ? strM15637 : string));
                this.f67151.mo3879(this.f6371.m5644(this.f39082[i2]));
                m48006(i2 == length2 ? l.b : ",");
            } else if (this.f67146) {
                m47997(m47996(mo46523(), i2 == 0 ? strM15637 : string));
                this.f67151.mo3879(String.format("#%d", Integer.valueOf(this.f39082[i2])));
                m48006(i2 == length2 ? l.b : ",");
            } else {
                m47997(m47996(mo46523(), i2 == 0 ? strM15637 : string));
                this.f67151.mo3879(m47996(m47999(), String.format("#%d%s", Integer.valueOf(this.f39082[i2]), i2 == length2 ? l.b : ",")));
                m48006(" // " + this.f6371.m5644(this.f39082[i2]));
            }
            i2++;
        }
    }
}
