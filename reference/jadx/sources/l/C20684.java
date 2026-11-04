package l;

import com.google.android.material.motion.MotionUtils;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 16FI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20684 implements InterfaceC13890 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f66313;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f66314;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f66315;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12479 f66316;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f66317;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f66318;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f66319;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47320(C2281 c2281, int i) {
        this.f66315 = ((c2281.m7729() & 65535) << 16) | (i & 65535);
    }

    @Override // l.InterfaceC13890
    /* JADX INFO: renamed from: ۙ */
    public final void mo33834() {
        C12479 c12479 = this.f66316;
        if (c12479 != null) {
            c12479.m31007(this.f66318, this);
            this.f66316 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47317(int i) {
        this.f66318 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47321(C12479 c12479) {
        this.f66316 = c12479;
    }

    @Override // l.InterfaceC13890
    /* JADX INFO: renamed from: ܳ */
    public final int mo33835() {
        return this.f66315;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47323() {
        this.f66314 = null;
        this.f66319 = null;
        this.f66317 = null;
        this.f66313 = null;
    }

    @Override // l.InterfaceC13890
    /* JADX INFO: renamed from: ᩸ */
    public final String mo33836() {
        return this.f66319;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47324(String str) {
        this.f66319 = str;
    }

    @Override // l.InterfaceC13890
    public final String getName() {
        return this.f66314;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47318(String str) {
        this.f66314 = str;
    }

    @Override // l.InterfaceC7179
    /* JADX INFO: renamed from: ۤ */
    public final String mo11553() {
        return this.f66317;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m47322(String str) {
        this.f66317 = str;
    }

    @Override // l.InterfaceC7179
    /* JADX INFO: renamed from: ᩴ */
    public final List mo11554() {
        return this.f66313;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47319(List list) {
        this.f66313 = list;
    }

    public final String toString() {
        if (this.f66314 == null) {
            return Integer.toHexString(this.f66315);
        }
        return this.f66319 + "->" + this.f66314 + '(' + C6544.m18426(this.f66313) + MotionUtils.EASING_TYPE_FORMAT_END + this.f66317;
    }
}
