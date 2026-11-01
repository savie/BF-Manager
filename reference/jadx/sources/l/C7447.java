package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟ۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7G8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7447 extends C3006 {
    @Override // l.C3006
    /* JADX INFO: renamed from: ܽ */
    public final void mo8968() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = this.f11254.length - 1;
        boolean z = this.f22692;
        String str = z ? "" : l.b;
        int i = 0;
        while (i <= length) {
            String str2 = ", ";
            if (z) {
                sb.append("#");
                sb.append(this.f11254[i]);
                sb.append(i == length ? l.b : ", ");
            }
            sb2.append(this.f47512.m27831(this.f11254[i]));
            if (i == length) {
                str2 = str;
            }
            sb2.append(str2);
            i++;
        }
        m18223(m18222(mo14807(), this.f11255.m47084()));
        if (z) {
            if (this.f22704) {
                m18219(sb.toString());
                return;
            }
            this.f22710.mo18524(m18222(m18220(), sb.toString()));
            m18219(" // " + ((Object) sb2));
            return;
        }
        m18219(sb2.toString());
    }

    @Override // l.C3006
    /* JADX INFO: renamed from: ᩶ */
    public final void mo8970() {
        String string;
        String strM47084 = this.f11255.m47084();
        int length = strM47084.length();
        if (length < 0) {
            throw new IllegalArgumentException(C8479.m22141(length, "count is negative: "));
        }
        if (length != 0) {
            string = " ";
            if (length != 1) {
                if (1 > Integer.MAX_VALUE / length) {
                    throw new OutOfMemoryError(C2271.m6966(length, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
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
        int length2 = this.f11254.length - 1;
        int i2 = 0;
        while (i2 <= length2) {
            if (!this.f22692) {
                m18223(m18222(mo14807(), i2 == 0 ? strM47084 : string));
                this.f22710.mo18524(this.f47512.m27831(this.f11254[i2]));
                m18219(i2 == length2 ? l.b : ",");
            } else if (this.f22704) {
                m18223(m18222(mo14807(), i2 == 0 ? strM47084 : string));
                this.f22710.mo18524(String.format("#%d", Integer.valueOf(this.f11254[i2])));
                m18219(i2 == length2 ? l.b : ",");
            } else {
                m18223(m18222(mo14807(), i2 == 0 ? strM47084 : string));
                this.f22710.mo18524(m18222(m18220(), String.format("#%d%s", Integer.valueOf(this.f11254[i2]), i2 == length2 ? l.b : ",")));
                m18219(" // " + this.f47512.m27831(this.f11254[i2]));
            }
            i2++;
        }
    }
}
