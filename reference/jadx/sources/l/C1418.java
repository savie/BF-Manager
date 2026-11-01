package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1418 extends AbstractC4946 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f5858;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f5859;

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4959() {
        this.f5859 = false;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo4960() {
        return this.f5858;
    }

    @Override // l.AbstractC4946
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo4961() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (!this.f5859) {
            this.f17280.mark(1);
            int i = this.f17280.read();
            if (i == -1) {
                break;
            }
            char c = (char) i;
            if (c == '<') {
                this.f17280.reset();
                this.f5859 = true;
            } else {
                sb.append(c);
            }
        }
        if (sb.length() < 1) {
            this.f5858 = false;
        } else if (sb.toString().trim().length() == 0) {
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < string.length(); i2++) {
                char cCharAt = string.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    sb2.append(cCharAt);
                }
            }
            this.f5858 = false;
            sb = sb2;
        } else {
            this.f5858 = true;
        }
        return sb.toString();
    }
}
