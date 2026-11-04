package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8V9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6548 extends AbstractC25194 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f21990;

    @Override // l.AbstractC25194, l.AbstractC17734
    /* JADX INFO: renamed from: ۤ */
    public final /* bridge */ /* synthetic */ int mo9543() {
        return 0;
    }

    @Override // l.AbstractC25194, l.AbstractC17734
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17734 mo9544() {
        return this;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ܺ */
    public final String mo5151() {
        return "#declaration";
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5152(Appendable appendable, int i, C7381 c7381) {
    }

    public C6548(String str, boolean z) {
        C14838.m35754((Object) str);
        this.f81430 = str;
        this.f21990 = z;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ */
    public final void mo5150(Appendable appendable, int i, C7381 c7381) throws IOException {
        Appendable appendableAppend = appendable.append("<");
        boolean z = this.f21990;
        appendableAppend.append(z ? "!" : "?").append(m56171());
        C10363 c10363Mo37069 = mo37069();
        c10363Mo37069.getClass();
        int i2 = 0;
        while (true) {
            if (i2 < c10363Mo37069.f32985 && C10363.m26644(c10363Mo37069, c10363Mo37069.f32983[i2])) {
                i2++;
            } else {
                if (i2 >= c10363Mo37069.f32985) {
                    break;
                }
                C8127 c8127 = new C8127(c10363Mo37069.f32983[i2], (String) c10363Mo37069.f32984[i2], c10363Mo37069);
                int i3 = i2 + 1;
                String key = c8127.getKey();
                String value = c8127.getValue();
                if (!key.equals("#declaration")) {
                    appendable.append(' ');
                    appendable.append(key);
                    if (!value.isEmpty()) {
                        appendable.append("=\"");
                        C2073.m7147(appendable, value, c7381, true, false, false, false);
                        appendable.append('\"');
                    }
                }
                i2 = i3;
            }
        }
        appendable.append(z ? "!" : "?").append(">");
    }

    @Override // l.AbstractC17734
    public final String toString() {
        return mo15298();
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: clone */
    public final Object mo5153clone() {
        return (C6548) super.mo5153clone();
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: clone */
    public final AbstractC17734 mo5153clone() {
        return (C6548) super.mo5153clone();
    }
}
