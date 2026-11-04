package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes3.dex */
public final class C0993 extends AbstractC21130 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f3594;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f3595;

    @Override // l.AbstractC21130
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3871() {
        this.f3594 = false;
    }

    @Override // l.AbstractC21130
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo3873() {
        return this.f3595;
    }

    @Override // l.AbstractC21130
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo3872() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (!this.f3594) {
            this.f67507.mark(1);
            int i = this.f67507.read();
            if (i == -1) {
                break;
            }
            char c = (char) i;
            if (c == '<') {
                this.f67507.reset();
                this.f3594 = true;
            } else {
                sb.append(c);
            }
        }
        if (sb.length() < 1) {
            this.f3595 = false;
        } else if (sb.toString().trim().length() == 0) {
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < string.length(); i2++) {
                char cCharAt = string.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    sb2.append(cCharAt);
                }
            }
            this.f3595 = false;
            sb = sb2;
        } else {
            this.f3595 = true;
        }
        return sb.toString();
    }
}
